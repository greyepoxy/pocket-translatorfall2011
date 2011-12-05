import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import java.util.LinkedList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;

public class Micro {

	//TODO: CHANGE BEFORE SUBMISSION!!!!!!!!!!!!!!!!!!!!!!!
	public static final boolean DEBUG_PRINT_STATEMENTS = false;
	
	public static final int SYSTEM_REGISTER_COUNT = 4;
	
	
	
	public static void main(String[] args) {
		
		//check to see if register allocation desired
		boolean regAllocation = false;
		int currArgument = 0;
		if (args.length > 1 && args[currArgument].trim().equals("-live"))
		{
			regAllocation = true;
			currArgument++;
		}
		
		//lets do some file io
		try
		{
			CharStream inputstream = new ANTLRFileStream(args[currArgument].trim());
			MicroParserLexer lexer = new MicroParserLexer(inputstream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MicroParserParser parser = new MicroParserParser(tokens);
            
            try
            {
            	MicroParserParser.program_return ret = parser.program(); //look for overall program structure.
            	//System.out.println( ((Tree)ret.tree).toStringTree()  );            	

            	if(DEBUG_PRINT_STATEMENTS)
            	{
            		MicroParserParser.TableEntry te = parser.new TableEntry("DEBUGINATOR9000","STRING","\"\\n\"");
            		parser.tableOfTables.get(new Integer(0)).add(te);
            	}
            	
            	genFProto(parser, (Tree)ret.tree, parser.tableOfTables);
            	genIR(parser, (Tree)ret.tree, parser.tableOfTables);
            	
            	for(int j=0; j<FunctionClass.fList.size(); j++)
            	{
            		FunctionClass currentF = FunctionClass.fList.get(j);
            		if (regAllocation)
            		{
	            		boolean registerAllocationDone = false;
	            		while (!registerAllocationDone)
	            		{
	            			LinkedList<IRNode> IR = currentF.IR;
	            			for (IRNode irn : IR){
	            				irn.children.clear();
	            				irn.parents.clear();
	            				irn.inSet.clear();
	            				irn.outSet.clear();
	            			}
	            			genControlFlow(IR);
	            			genLiveness(IR.get(IR.size() - 1));
	            			currentF.GetFunctionInterferenceGraph();
	            			registerAllocationDone = RegisterAllocation(currentF);
	            		}
	            		
	            		//PrintLivenessCFG(currentF);
	            		//PrintInterferenceGraph(currentF);
	            		//System.out.print("\n\n\n");
            		}
            		
            		for(IRNode irn : currentF.IR)
            		{
            			System.out.println("; " + irn); 
            		}
            	}
            	
            	LinkedList<TinyNode> tiny = TinyNode.irToTiny(FunctionClass.fList, parser);  
            	TinyNode.printTiny(tiny);

            }
            catch(RecognitionException e) {
                System.out.println("Not accepted");
            }
		}
		catch(IOException e)
		{
			System.out.println("Couldn't find the file");
		}
		
		
	}
	
	private static void PrintInterferenceGraph(FunctionClass f)
	{
		System.out.println("; --------------------------");
		System.out.println("; Interference Graph");
		if (f.interferenceGraph == null)
			f.GetFunctionInterferenceGraph();
		for (Entry<String,ArrayList<String>> entry : f.interferenceGraph.entrySet())
		{
			System.out.print("; " + entry.getKey() + ":");
			for (String s : entry.getValue())
				System.out.print(" " + s);
			System.out.println("");
		}
		System.out.println("; --------------------------");
	}
	
	private static void PrintLivenessCFG(FunctionClass f)
	{
		LinkedList<IRNode> IR = f.IR;
		//print cfg for now
		System.out.println("");
		System.out.println("");
		System.out.println("; --------------------------");
		for(int i=0; i< IR.size(); i++)
		{
			IRNode c = IR.get(i);
			System.out.print("; PARENTS: ");
			for(int k =0; k< c.parents.size(); k++)
			{
				System.out.print(c.parents.get(k) + " ");
			
			}
			System.out.println("");
			System.out.println("; NODE: " + c.toString());
			System.out.print("; CHILDREN: ");
			for(int k =0; k< c.children.size(); k++)
			{
				System.out.print(c.children.get(k) + " ");
			
			}
			System.out.println("");
			System.out.print("; LIVE: ");
			
			for(int k =0; k< c.outSet.size(); k++)
			{
				System.out.print(c.outSet.toArray()[k] + " ");
			
			}
			System.out.print("\n\n\n");
		}
	}
	
	private static boolean RegisterAllocation(FunctionClass f)
	{
		int k = SYSTEM_REGISTER_COUNT - 1;
		//temporary variables are mapped to integers 0 through SYSTEM_REGISTER_COUNT - 1 
		ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();
		HashMap<String,GraphNode> hashNodes = new HashMap<String,GraphNode>();
		for (Entry<String,ArrayList<String>> entry : f.interferenceGraph.entrySet()) {
			GraphNode tempGN = new GraphNode(entry.getKey());
			nodes.add(tempGN);
			hashNodes.put(entry.getKey(), tempGN);
		}
		for (Entry<String,ArrayList<String>> entry : f.interferenceGraph.entrySet()) {
			GraphNode tempGN = hashNodes.get(entry.getKey());
			for (String s : entry.getValue()) {
				tempGN.addNegihbor(hashNodes.get(s));
			}
		}
		Stack<GraphNode> toColorStack = new Stack<GraphNode>();
		while (!nodes.isEmpty()) {
			GraphNode selectedNode = null;
			// select a node that has k-1 non-colored edges
			for(GraphNode gn : nodes) {
				if (gn.NumNonColoredNeighbors() < k) {
					selectedNode = gn;
					break;
				}
			}
			if (selectedNode == null) {
				// Possible spill
				// just select a node that will remove the most edges
				selectedNode = GetLargestKGraphNode(nodes);
			}
			// mark node as colored and put it into the toColorStack
			selectedNode.colored = true;
			toColorStack.push(selectedNode);
			nodes.remove(selectedNode);
		}
		//At this point, have stack of nodes to color
		//Need to color nodes and if cannot color need to write spill logic and return false
		while (!toColorStack.isEmpty()){
			GraphNode gn = toColorStack.pop();
			if (!gn.FindColor()){
				//failed to color spill this variable
				int spillStackLoc = 0;
				LinkedList<IRNode> newIR = new LinkedList<IRNode>();
				for (IRNode ir : f.IR){
					if (ir.opCode.equals(IRNode.IROp.LINK)){
						spillStackLoc = Integer.parseInt(ir.op1);
						spillStackLoc++;
						ir.op1 = String.format("%d", spillStackLoc);
						newIR.add(ir);
					}
					else if(spillStackLoc != 0){
						IRNode newIRNode;
						if (gn.Name().equals(ir.op1) || gn.Name().equals(ir.op2)){
							//load from spill register and replace with new temporary
							newIRNode = new IRNode();
							if (GetIfIRNnodeIsFloat(ir))
								newIRNode.opCode = IRNode.IROp.STOREF;
							else
								newIRNode.opCode = IRNode.IROp.STOREI;
							newIRNode.op1 = String.format("$%-d", spillStackLoc);
							newIRNode.op2 = "";
							newIRNode.result = f.genTempReg();
							if (ir.op1.equals(gn.Name()))
								ir.op1 = newIRNode.result;
							if (ir.op2.equals(gn.Name()))
								ir.op2 = newIRNode.result;
							newIR.add(newIRNode);
							for (IRNode irp : ir.parents){
								newIRNode.parents.add(irp);
							}
							newIRNode.children.add(ir);
							ir.parents.clear();
							ir.parents.add(newIRNode);
						}
						newIR.add(ir);
						if (gn.Name().equals(ir.result)){
							//save spill register to stack
							newIRNode = new IRNode();
							if (GetIfIRNnodeIsFloat(ir))
								newIRNode.opCode = IRNode.IROp.STOREF;
							else
								newIRNode.opCode = IRNode.IROp.STOREI;
							newIRNode.op1 = gn.Name();
							newIRNode.op2 = "";
							newIRNode.result = String.format("$%-d", spillStackLoc);
							newIR.add(newIRNode);
							for (IRNode irp : ir.children){
								newIRNode.children.add(irp);
							}
							newIRNode.parents.add(ir);
							ir.children.clear();
							ir.children.add(newIRNode);
						}
					}
					else
						newIR.add(ir);
				}
				f.IR = newIR;
				return false;
			}
		}
		//If coloring successful need to re-write function ops with registers
		for (IRNode ir : f.IR){
			GraphNode gn;
			if(ir.op1.startsWith("$T")){
				gn = hashNodes.get(ir.op1.trim());
				ir.op1 = String.format("r%d", gn.Color());
			}
			if(ir.op2.startsWith("$T")){
				gn = hashNodes.get(ir.op2.trim());
				ir.op2 = String.format("r%d", gn.Color());
			}
			if(ir.result.startsWith("$T")){
				gn = hashNodes.get(ir.result.trim());
				ir.result = String.format("r%d", gn.Color());
			}
		}
		//DONE!!!!
		return true;
	}
	
	private static boolean GetIfIRNnodeIsFloat(IRNode ir)
	{
		switch (ir.opCode)
		{
			default:
				System.err.println("Unexpected OpCode during graph coloring spill.");
				System.exit(1);
				break;
			case ADDI:
			case SUBI:
			case MULTI:
			case DIVI:
			case STOREI:
			case BEQI:
			case BGEI:
			case BGTI:
			case BLEI:
			case BLTI:
			case BNEI:
				return false;
			case ADDF:
			case SUBF:
			case MULTF:
			case DIVF:
			case STOREF:
			case BEQF:
			case BGEF:
			case BGTF:
			case BLEF:
			case BLTF:
			case BNEF:
				break;
		}
		return true;
	}
	
	private static GraphNode GetLargestKGraphNode(ArrayList<GraphNode> nodes)
	{
		int size = 0;
		GraphNode largestKNode = null;
		for(GraphNode gn : nodes) {
			int newk = gn.NumNonColoredNeighbors();
			if (newk > size) {
				size = newk;
				largestKNode = gn;
			}
		}
		return largestKNode;
	}
	
	private static boolean genLiveness(IRNode n)
	{
		boolean finished = false;
		
		int size_out = n.outSet.size();
		int size_in = n.inSet.size();
		for(int i = 0; i< n.children.size(); i++)
		{
			n.outSet.addAll(n.children.get(i).inSet);
		}
		//now for the in set.
		TreeSet<String> tempSet = new TreeSet<String>();
		tempSet.addAll(n.outSet);
		tempSet.removeAll(n.getKill());
		tempSet.addAll(n.getGen());
		n.inSet.addAll(tempSet);
		
		finished = ((size_out == n.outSet.size()) && (size_in == n.inSet.size()) && !n.IsSingletonOp()); 
		
		while(!finished)
		{	
			finished = true;		
			for(int i = 0; i< n.parents.size(); i++)
			{
				finished &= genLiveness(n.parents.get(i));
			}
		}
		
		return finished;
	}
	
	private static void genControlFlow(LinkedList<IRNode> IR) 
	{ 
		//okay so we have a list of IR... now we need to build a CFG out of it.... only weird guys should be JMPS & BRANCHES
		IRNode curr, target;
		
		//only worry about making FORWARD connections.
		for(int i=0; i< IR.size(); i++)
		{
			curr = IR.get(i);
			switch(curr.opCode)
			{
				case BEQF:
				case BEQI:
				case BGEI:
				case BGTI:
				case BLEI:
				case BLTI:
				case BNEI:			
				case BGEF:
				case BGTF:
				case BLEF:
				case BLTF:
				case BNEF: // ok so a branch also has the next line as a possible child.
					
					if(i+1 < IR.size())
					{
						target = IR.get(i+1);
						curr.children.add(target);
						target.parents.add(curr);
					}					
					
				case JUMP:  //all of these fall through to execute some sort of jump;
					
					target = findLabel(IR, curr.result);
					curr.children.add(target);
					target.parents.add(curr);
					
					break;
				
				default:
					
					if(i+1 < IR.size())
					{
						target = IR.get(i+1);
						curr.children.add(target);
						target.parents.add(curr);
					}
						break;
					
			}
			
			
		}
	}


	private static IRNode findLabel(LinkedList<IRNode> IR, String result)
	{
		for(int i=0; i< IR.size(); i++)
		{
			if(IR.get(i).opCode == IRNode.IROp.LABEL && IR.get(i).op1.equals(result)) return IR.get(i);
		}
		System.err.println("No Matching Label Found");
		System.exit(1);
		return null;
	}


	public static void genFProto(MicroParserParser parser, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{		
		for(int i = 0; i< AST.getChildCount(); i++){
			Tree node =	AST.getChild(i);
			FunctionClass.FunctionPrototype fp = new FunctionClass.FunctionPrototype(); 
			fp.name = node.getChild(0).getText();
			fp.type = node.getChild(1).getText();
			if(node.getChildCount() == 4)
			{
				for(int j = 0; j< node.getChild(2).getChildCount(); j++)
				{
					fp.paramTypes.add(node.getChild(2).getChild(j).getChild(0).getText());
				}
			}
			FunctionClass.functionPrototypes.put(fp.name, fp);
		}						
	}	
	
	public static void genIR(MicroParserParser parser, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{		
		for(int i = 0; i< AST.getChildCount(); i++){
			HashMap<Integer,ArrayList<MicroParserParser.TableEntry>> scopedSymbolTables = new HashMap<Integer,ArrayList<MicroParserParser.TableEntry>>();
			scopedSymbolTables.put(new Integer(0), symbolTable.get(new Integer(0)));
			scopedSymbolTables.put(new Integer(1), symbolTable.get(new Integer(1 + i))); //symbol table corresponding to this function
			FunctionClass f = new FunctionClass(parser, AST.getChild(i), scopedSymbolTables);				
		}						
	}		
}

