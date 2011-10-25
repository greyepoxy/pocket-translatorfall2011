import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class TinyNode {
	
	public enum TinyOp {
		var,
		label,
		jsr,
		ret,
		link,
		unlnk,
		move,
		addi,
		addr,
		subi,
		subr,
		muli,
		mulr,
		divi,
		divr,
		inci,
		deci,
		cmpi,
		cmpr,
		push,
		pop,
		jmp,
		jgt,
		jlt,
		jge,
		jle,
		jeq,
		jne,
		sys_writei,
		sys_readi,
		sys_writer,
		sys_readr,
		sys_writes,
		sys_halt,
		end
	}
	
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
			return String.format("sys writei %s", this.arg1);
		case sys_writer:
			return String.format("sys writer %s", this.arg1);
		case sys_readi:
			return String.format("sys readi %s", this.arg1);
		case sys_readr:
			return String.format("sys readr %s", this.arg1);
		case sys_halt:
			return String.format("sys halt");
		default:
			if (arg2 == null)
				return String.format("%s %s", this.op, this.arg1);
			else
				return String.format("%s %s %s", this.op, this.arg1, this.arg2);
		}
	}
	
	public static LinkedList<TinyNode> irToTiny(LinkedList<IRNode> IR, MicroParserParser parser) {
		
		LinkedList<TinyNode> tiny = new LinkedList<TinyNode>();
		ArrayList<MicroParserParser.TableEntry> currentTable = parser.tableOfTables.get(new Integer(0));
		
		// global variable declarations
		//  global variables get memory locations
		for (int i = 0; i < currentTable.size(); i++)
			tiny.add(new TinyNode(TinyOp.var, currentTable.get(i).Name, ""));
		
		tiny.add(new TinyNode(TinyOp.push, "", ""));
		tiny.add(new TinyNode(TinyOp.jsr, "main", ""));
		tiny.add(new TinyNode(TinyOp.sys_halt, "", ""));
		
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
		tiny.add(new TinyNode(TinyOp.ret, "",""));
		tiny.add(new TinyNode(TinyOp.end, "", ""));
		return tiny;
	}
	
	/*public static LinkedList<TinyNode> processFunctionDec(ArrayList<MicroParserParser.TableEntry> varsTable)
	{
		LinkedList<TinyNode> tiny = new LinkedList<TinyNode>();
		for (integer i = 0; i < varsTable.size(); i++)
			tiny.add(new TinyNode(TinyOp.var, varsTable.get(i).Name, null));
		return tiny;
	}*/
	
	private static String processArg(String arg)
	{
		String newArg;
		if (arg.startsWith("$T"))
			newArg = String.format("r%s", arg.substring(2));
		else if (arg.startsWith("$L"))
			newArg = String.format("l%s", arg.substring(2));
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
		case BGEI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jge), processArg(irNode.result), ""));
			break;
		case BGTI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jgt), processArg(irNode.result), ""));
			break;
		case BLEI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jle), processArg(irNode.result), ""));
			break;
		case BLTI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jlt), processArg(irNode.result), ""));
			break;
		case BEQI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jeq), processArg(irNode.result), ""));
			break;
		case BNEI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jne), processArg(irNode.result), ""));
			break;
		case BGEF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jge), processArg(irNode.result), ""));
			break;
		case BGTF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jgt), processArg(irNode.result), ""));
			break;
		case BLEF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jle), processArg(irNode.result), ""));
			break;
		case BLTF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jlt), processArg(irNode.result), ""));
			break;
		case BEQF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jeq), processArg(irNode.result), ""));
			break;
		case BNEF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1), processArg(irNode.op2)));
			tinyOps.add(new TinyNode((TinyOp.jne), processArg(irNode.result), ""));
			break;
		case JUMP:
			tinyOps.add(new TinyNode(TinyOp.jmp, processArg(irNode.op1), ""));
			break;
		case LABEL:
			/*if(parser.tableOfTableNames.containsValue(irNode.op1))
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
			tinyOps.add(new TinyNode(TinyOp.label, processArg(irNode.op1), ""));
			break;
		case READI:
			tinyOps.add(new TinyNode(TinyOp.sys_readi, processArg(irNode.result), ""));
			break;
		case READF:
			tinyOps.add(new TinyNode(TinyOp.sys_readr, processArg(irNode.result), ""));
			break;
		case WRITEI:
			tinyOps.add(new TinyNode(TinyOp.sys_writei, processArg(irNode.result), ""));
			break;
		case WRITEF:
			tinyOps.add(new TinyNode(TinyOp.sys_writer, processArg(irNode.result), ""));
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
	
}
