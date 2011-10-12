import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.Tree;
import org.antlr.runtime.tree.TreeAdaptor;


public class Micro {

	
	static class TinyNode
	{
		public TinyOp op;
		public String arg1;
		public String arg2;
		
		public TinyNode(TinyOp op, String arg1, String arg2)
		{
			this.op = op;
			this.arg1 = arg1;
			this.arg2 = arg2;
		}
		
		@Override public String toString() {
			switch (this.op)
			{
			case sys_writei:
				return String.format("sys writei 1$", this.arg1);
			case sys_writer:
				return String.format("sys writer 1$", this.arg1);
			case sys_readi:
				return String.format("sys readi 1$", this.arg1);
			case sys_readr:
				return String.format("sys readr 1$", this.arg1);
			default:
				if (arg2 == null)
					return String.format("1$ 2$", this.op, this.arg1);
				else
					return String.format("1$ 2$ 3$", this.op, this.arg1, this.arg2);
			}
		}
	}
	
	/**
	 * @param args
	 */
	
	static class IRNode
	{
		public IROp opCode;
		public String op1;
		public String op2;
		public String result;
	}

	static int regCount = 0;
	
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
            	System.out.println( ((Tree)ret.tree).toStringTree()  );
            	LinkedList<IRNode> IR = new LinkedList<IRNode>();
            	genIR(IR,(Tree)ret.tree);
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
	
	public static LinkedList<TinyNode> irToTiny(LinkedList<IRNode> IR, MicroParserParser parser) {
		
		LinkedList<TinyNode> tiny = new LinkedList<TinyNode>();
		ArrayList<MicroParserParser.TableEntry> currentTable = parser.tableOfTables.get(new Integer(0));
		
		// global variable declarations
		//  global variables get memory locations
		for (int i = 0; i < currentTable.size(); i++)
			tiny.add(new TinyNode(TinyOp.var, currentTable.get(i).Name, null));
		
		tiny.add(new TinyNode(TinyOp.push, null, null));
		tiny.add(new TinyNode(TinyOp.jsr, "main", null));
		tiny.add(new TinyNode(TinyOp.sys_halt, null, null));
		
		// call to main
		//  only assignment statements of global variables
		Iterator<IRNode> irIterator = IR.iterator();
		IRNode currentNode;
		while (irIterator.hasNext())
		{
			currentNode = irIterator.next();
			LinkedList<TinyNode> tinyOps = processIRNode(currentNode, parser);
			tiny.addAll(tinyOps);
		}
		//temporary return for the end of main until functions are implemented
		tiny.add(new TinyNode(TinyOp.ret, null,null));
		tiny.add(new TinyNode(TinyOp.end, null, null));
		return tiny;
	}
	
	/*public static LinkedList<TinyNode> processFunctionDec(ArrayList<MicroParserParser.TableEntry> varsTable)
	{
		LinkedList<TinyNode> tiny = new LinkedList<TinyNode>();
		for (integer i = 0; i < varsTable.size(); i++)
			tiny.add(new TinyNode(TinyOp.var, varsTable.get(i).Name, null));
		return tiny;
	}*/
	
	public static String processArg(String arg)
	{
		String newArg;
		if (arg.startsWith("$T"))
			newArg = String.format("r1$", arg.charAt(2));
		else
			newArg = arg;
		return newArg;
	}
	
	public static LinkedList<TinyNode> processIRNode(IRNode irNode, MicroParserParser parser)
	{
		LinkedList<TinyNode> tinyOps = new LinkedList<TinyNode>();
		switch (irNode.opCode)
		{
		case ADDI:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.addi, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case ADDF:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.addr, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case SUBI:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.subi, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case SUBF:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.subr, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case MULTI:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.muli, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case MULTF:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.mulr, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case DIVI:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.divi, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case DIVF:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			tinyOps.add(new TinyNode(TinyOp.divr, processArg(irNode.op2), processArg(irNode.result)));
			break;
		case STOREI:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			break;
		case STOREF:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1), processArg(irNode.result)));
			break;
		case GE:
			break;
		case LE:
			break;
		case NE:
			break;
		case JUMP:
			break;
		case LABEL:
			/*if (parser.tableOfTableNames.containsValue(irNode.op1))
			{
				int key;
				Iterator<Map.Entry<Integer,String>> tableNamesIterator = parser.tableOfTableNames.entrySet().iterator();
				Map.Entry<Integer,String> entry;
				while (tableNamesIterator.hasNext())
				{
					entry = tableNamesIterator.next();
					if (entry.getValue() == irNode.op1)
					{
						key = entry.getKey();
						break;
					}
				}
			}*/
			// for now only have to worry about main, and no variables to put on stack
			//  so no link/unlink expressions.
			tinyOps.add(new TinyNode(TinyOp.label, irNode.op1, null));
			break;
		case READI:
			tinyOps.add(new TinyNode(TinyOp.sys_readi, processArg(irNode.result), null));
			break;
		case READF:
			tinyOps.add(new TinyNode(TinyOp.sys_readr, processArg(irNode.result), null));
			break;
		case WRITEI:
			tinyOps.add(new TinyNode(TinyOp.sys_writei, processArg(irNode.result), null));
			break;
		case WRITEF:
			tinyOps.add(new TinyNode(TinyOp.sys_writer, processArg(irNode.result), null));
			break;
		default:
			break;
		}
		return tinyOps;
	}
	
	public static void printTiny(LinkedList<TinyNode> tiny) {
		Iterator<TinyNode> iter = tiny.iterator();
		TinyNode node;
		while (iter.hasNext())
		{
			node = iter.next();
			System.out.println(node.toString());
		}
	}
	
	public static void genIR(LinkedList<IRNode> IR, Tree AST)
	{
		for(int i = 0; i< AST.getChildCount(); i++){
			genFunction(IR, AST.getChild(0));		
		}						
	}
	
	public static void genFunction(LinkedList<IRNode> IR, Tree AST)
	{
		
			IRNode n = new IRNode();		
			n.opCode = IROp.LABEL;
			n.op1 = AST.getChild(0).getText();
			n.op2 = null;
			IR.add(n);	
			genStatementList(IR,AST.getChild(1));
	}
	
	public static void genStatementList(LinkedList<IRNode> IR, Tree AST)
	{
		for(int i = 0; i< AST.getChildCount(); i++){
			genStatement(IR, AST.getChild(0));		
		}						
	}
	
	public static void genStatement(LinkedList<IRNode> IR, Tree AST)
	{
					
	}

}

