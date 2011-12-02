import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
					
		//lets do some file io
		
		try
		{
			CharStream inputstream = new ANTLRFileStream(args[0].trim());
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
            		LinkedList<IRNode> IR = FunctionClass.fList.get(j).IR;
            		
            		genControlFlow(IR);
            		genLiveness(IR.get(IR.size() - 1));
            		
            		//print cfg for now
            		System.out.println("");
            		System.out.println("");
            		System.out.println("--------------------------");
            		for(int i=0; i< IR.size(); i++)
            		{
            			IRNode c = IR.get(i);
            			System.out.print("PARENTS: ");
            			for(int k =0; k< c.parents.size(); k++)
            			{
            				System.out.print(c.parents.get(k) + " ");
            			
            			}
            			System.out.println("");
            			System.out.println("NODE: " + c.toString());
            			System.out.print("CHILDREN: ");
            			for(int k =0; k< c.children.size(); k++)
            			{
            				System.out.print(c.children.get(k) + " ");
            			
            			}
            			System.out.println("");
            			System.out.print("LIVE: ");
            			
            			for(int k =0; k< c.outSet.size(); k++)
            			{
            				System.out.print(c.outSet.toArray()[k] + " ");
            			
            			}
            			System.out.println("");
            			System.out.println("");
            			System.out.println("");
            		}
            		
            		for(int i=0; i< IR.size(); i++)
            		{
            			System.out.println("; " + IR.get(i)); 
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

