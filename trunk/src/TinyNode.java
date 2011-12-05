import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class TinyNode {
	
	public enum TinyOp {
		var,
		str,
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
		case sys_writes:
			return String.format("sys writes %s", this.arg1);
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
	
	public static LinkedList<TinyNode> irToTiny(ArrayList<FunctionClass> functions, MicroParserParser parser) {
		
		LinkedList<TinyNode> tiny = new LinkedList<TinyNode>();
		ArrayList<MicroParserParser.TableEntry> currentTable = parser.tableOfTables.get(new Integer(0));
		
		// global variable declarations
		//  global variables get memory locations
		for (int i = 0; i < currentTable.size(); i++)
		{
			if (currentTable.get(i).Type == "STRING")
				tiny.add(new TinyNode(TinyOp.str, currentTable.get(i).Name, currentTable.get(i).Value));
			else
				tiny.add(new TinyNode(TinyOp.var, currentTable.get(i).Name, ""));
		}
		
		// Main function call, once it completes system is halted.
		tiny.add(new TinyNode(TinyOp.push, "", ""));
		for (int i = 0; i < Micro.SYSTEM_REGISTER_COUNT; i++)
			tiny.add(new TinyNode(TinyOp.push, String.format("r%d",i), ""));
		tiny.add(new TinyNode(TinyOp.jsr, "main", ""));
		tiny.add(new TinyNode(TinyOp.sys_halt, "", ""));
		
		// FOREACH FUNCTION IN FUNCTIONS. GENERATE CODE!!!!
		//  ADD GENERATED CODE TO tiny list.
		for (int i = 0; i < functions.size(); i++)
		{
			tiny.addAll(ProcessFunction(functions.get(i)));
		}
		
		tiny.add(new TinyNode(TinyOp.end, "", ""));
		
		return tiny;
	}
	
	// Need some kind of function class. Function class has code for function, and local symbol table.
	private static LinkedList<TinyNode> ProcessFunction(FunctionClass f)
	{
		LinkedList<TinyNode> tiny = new LinkedList<TinyNode>();
		
		Iterator<IRNode> irIterator = f.IR.iterator();
		IRNode currentNode;
		while (irIterator.hasNext())
		{
			currentNode = irIterator.next();
			LinkedList<TinyNode> tinyOps = processIRNode(currentNode, f);
			tiny.addAll(tinyOps);
		}
		
		return tiny;
	}
	
	private static String processLinkArg(String arg)
	{
		// If temporary linking variable convert to a real linking variable
		if (arg.startsWith("$L"))
			return String.format("l%s", arg.substring(2));
		else
			return arg;
	}
	
	private static String processArg(String arg, FunctionClass f)
	{
		String newArg;
		// Temporary variable or Register directly translate to actual register
		if (arg.startsWith("$T") || arg.startsWith("$r"))
			newArg = String.format("r%s", arg.substring(2));
		// Check to see if return variable
		else if (arg.equals("$R"))
		{
			int returnValueOnStack = 2 + Micro.SYSTEM_REGISTER_COUNT + f.paramTable.size();
			newArg = String.format("$%s", returnValueOnStack);
		}
		// could be a stack location if its a spilled variable
		else if (arg.startsWith("$"))
			newArg = arg;
		// Possible local variable or parameter
		else
		{
			int displacment = 0;
			//check to see if arg is a parameter
			for (int i = 0; i < f.paramTable.size(); i++)
			{
				MicroParserParser.TableEntry te = f.paramTable.get(i);
				if(te.Name.equals(arg)){
					displacment = 1 + Micro.SYSTEM_REGISTER_COUNT + f.paramTable.size() - i;
					break;
				}
			}
			if (displacment == 0)
			{
				//check to see if arg is a local variable
				ArrayList<MicroParserParser.TableEntry> symTab = f.symbolTable.get(new Integer(1));
				for (int i = 0; i < symTab.size(); i++)
				{
					MicroParserParser.TableEntry te  = symTab.get(i);
					if(te.Name.equals(arg)){
							displacment = -(i + 1);
						break;
					}
				}
			}
			// If symbol not found assume global or immediate value and no replacement is necessary. 
			if (displacment == 0)
				newArg = arg;
			// Symbol found in local or parameter list so set to stack offset
			else
				newArg = String.format("$%s", displacment);
		}
		return newArg;
	}
	
	public static LinkedList<TinyNode> processIRNode(IRNode irNode, FunctionClass f)
	{
		LinkedList<TinyNode> tinyOps = new LinkedList<TinyNode>();
		int opIsResult;
		TinyOp op = null;
		if (irNode.op1.startsWith("$T") && irNode.op1.equals(irNode.result))
			opIsResult = 1;
		else if (irNode.op2.startsWith("$T") && irNode.op2.equals(irNode.result))
			opIsResult = 2;
		else
			opIsResult = 0;
			
		switch (irNode.opCode)
		{
		case STOREI:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1, f), processArg(irNode.result, f)));
			break;
		case STOREF:
			tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1, f), processArg(irNode.result, f)));
			break;
		case BGEI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jge), processLinkArg(irNode.result), ""));
			break;
		case BGTI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jgt), processLinkArg(irNode.result), ""));
			break;
		case BLEI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jle), processLinkArg(irNode.result), ""));
			break;
		case BLTI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jlt), processLinkArg(irNode.result), ""));
			break;
		case BEQI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jeq), processLinkArg(irNode.result), ""));
			break;
		case BNEI:
			tinyOps.add(new TinyNode((TinyOp.cmpi), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jne), processLinkArg(irNode.result), ""));
			break;
		case BGEF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jge), processLinkArg(irNode.result), ""));
			break;
		case BGTF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jgt), processLinkArg(irNode.result), ""));
			break;
		case BLEF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jle), processLinkArg(irNode.result), ""));
			break;
		case BLTF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jlt), processLinkArg(irNode.result), ""));
			break;
		case BEQF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jeq), processLinkArg(irNode.result), ""));
			break;
		case BNEF:
			tinyOps.add(new TinyNode((TinyOp.cmpr), processArg(irNode.op1, f), processArg(irNode.op2, f)));
			tinyOps.add(new TinyNode((TinyOp.jne), processLinkArg(irNode.result), ""));
			break;
		case JUMP:
			tinyOps.add(new TinyNode(TinyOp.jmp, processLinkArg(irNode.result), ""));
			break;
		case POP:
			tinyOps.add(new TinyNode(TinyOp.pop, processArg(irNode.result, f), ""));
			break;
		case PSH:
			tinyOps.add(new TinyNode(TinyOp.push, processArg(irNode.op1, f), ""));
			break;
		case JSR:
			for (int i=0; i<Micro.SYSTEM_REGISTER_COUNT;i++)
				tinyOps.add(new TinyNode(TinyOp.push, String.format("r%d",i), ""));
			tinyOps.add(new TinyNode(TinyOp.jsr, processLinkArg(irNode.op1), ""));
			for (int i=Micro.SYSTEM_REGISTER_COUNT - 1; i>=0;i--)
				tinyOps.add(new TinyNode(TinyOp.pop, String.format("r%d",i), ""));
			break;
		case RET:
			tinyOps.add(new TinyNode(TinyOp.unlnk, "", ""));
			tinyOps.add(new TinyNode(TinyOp.ret, "", ""));
			break;
		case LINK:
			tinyOps.add(new TinyNode(TinyOp.link, processArg(irNode.op1, f), ""));
			break;
		case LABEL:
			tinyOps.add(new TinyNode(TinyOp.label, processLinkArg(irNode.op1), ""));
			break;
		case READI:
			tinyOps.add(new TinyNode(TinyOp.sys_readi, processArg(irNode.result, f), ""));
			break;
		case READF:
			tinyOps.add(new TinyNode(TinyOp.sys_readr, processArg(irNode.result, f), ""));
			break;
		case WRITEI:
			tinyOps.add(new TinyNode(TinyOp.sys_writei, processArg(irNode.op1, f), ""));
			break;
		case WRITEF:
			tinyOps.add(new TinyNode(TinyOp.sys_writer, processArg(irNode.op1, f), ""));
			break;
		case WRITES:
			tinyOps.add(new TinyNode(TinyOp.sys_writes, processArg(irNode.op1, f), ""));
			break;
		case ADDI:
			op = TinyOp.addi;
			break;
		case ADDF:
			op = TinyOp.addr;
			break;
		case SUBI:
			op = TinyOp.subi;
			break;
		case SUBF:
			op = TinyOp.subr;
			break;
		case MULTI:
			op = TinyOp.muli;
			break;
		case MULTF:
			op = TinyOp.mulr;
			break;
		case DIVI:
			op = TinyOp.divi;
			break;
		case DIVF:
			op = TinyOp.divr;
			break;
		default:
			break;
		}
		if (op != null){
			if (opIsResult == 1){
				tinyOps.add(new TinyNode(op, processArg(irNode.op2, f), processArg(irNode.result, f)));
			}
			else if (opIsResult == 2){
				//cannot convert to tiny in this case
				System.err.println(String.format("Cannot convert %s to tiny",irNode));
				System.exit(1);
			}
			else {
				tinyOps.add(new TinyNode(TinyOp.move, processArg(irNode.op1, f), processArg(irNode.result, f)));
				tinyOps.add(new TinyNode(op, processArg(irNode.op2, f), processArg(irNode.result, f)));
			}
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
