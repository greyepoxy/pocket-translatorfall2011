import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

import org.antlr.runtime.tree.Tree;

public class FunctionClass {
	
	
	public static HashMap<String, FunctionPrototype> functionPrototypes = new HashMap<String, FunctionPrototype>();
	public static ArrayList<FunctionClass> fList = new ArrayList<FunctionClass>();
	
	public static class FunctionPrototype
	{		
		public String type;
		public String name;
		public ArrayList<String> paramTypes;
		
		public FunctionPrototype()
		{
			paramTypes = new ArrayList<String>();
		}
	}
	
	private static class IRExpr
	{
		public enum RegType
		{
			INT,
			FLOAT,
			VOID,
			VAR_INT,
			VAR_FLOAT,
			LIT_INT,
			LIT_FLOAT,
			UNKNOWN
		}
		
		public String reg;
		public RegType type;
	}

	static private Stack<String> labelStack = new Stack<String>();
	static private int regCount = 0;	
	static private int labelCount = 0;
	
	public int c_local;
	public int c_temp = 0;
	public int c_param;
	public String name;
	public String type;
	
	public HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable;
	public ArrayList<MicroParserParser.TableEntry> paramTable;
	public LinkedList<IRNode> IR;
	
	public FunctionClass(MicroParserParser parser, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> st)
	{
			name = AST.getChild(0).getText();
			type = AST.getChild(1).getText();
			if (Micro.DEBUG_PRINT_STATEMENTS)
				System.err.println("New Function: " + name);
			symbolTable = st;
			IR = new LinkedList<IRNode>();
			paramTable = new  ArrayList<MicroParserParser.TableEntry>();
			
			c_local = symbolTable.get(new Integer(1)).size();
			
			IRNode n = new IRNode();		
			n.opCode = IRNode.IROp.LABEL;
			n.op1 = AST.getChild(0).getText();
			n.op2 = "";
			n.result = "";
			IR.add(n);	
			labelStack.push(n.op1);
			
			n = new IRNode();		
			n.opCode = IRNode.IROp.LINK;
			n.op1 = "" + (this.c_local + this.c_temp);
			n.op2 = "";
			n.result = "";
			IR.add(n);	
			labelStack.push(n.op1);
			
			if(AST.getChildCount() == 4)
			{
				genParamList(parser, AST.getChild(2));			
				genStatementList(AST.getChild(3));	
			}
			else
			{						
				genStatementList(AST.getChild(2));
			}
			
			ensureRet();
			
			labelStack.pop();
			fList.add(this);
	}
	
	
	private void ensureRet() {
		if(IR.get(IR.size()-1).opCode != IRNode.IROp.RET){
			IRNode n = new IRNode();
			n.opCode = IRNode.IROp.RET;
			n.op1 = "";
			n.op2 = "";
			n.result = "";
		}
		
	}


	public void genParamList(MicroParserParser parser, Tree AST)
	{
		this.c_param = AST.getChildCount();
		for(int i = 0; i< AST.getChildCount(); i++){			
			Tree node = AST.getChild(i);
			if(symbolAlreadyExists(node.getChild(1).getText())){
				System.err.println("Parameter Name Conflict!");
				System.exit(1);
			}
			paramTable.add( parser.new TableEntry(node.getChild(1).getText(), node.getChild(0).getText(), null));
		}
	}
	
	private boolean symbolAlreadyExists(String name) {
		//start with params
		for(MicroParserParser.TableEntry te : paramTable)
		{
			if(te.Name.equals(name)){
				return true;
			}
		}
		
		//start with local scope
		for(int i= 1; i>=0; i--)
		{
			Integer objI = new Integer(i);
			for(MicroParserParser.TableEntry te : symbolTable.get(objI))
			{
				if(te.Name.equals(name)){				
					return true;
				}
			}
		}
		return false;
	}


	public void genStatementList(Tree AST)
	{
		for(int i = 0; i< AST.getChildCount(); i++){
			genStatement(AST.getChild(i));		
		}						
	}
	
	public void genStatement(Tree AST)
	{
		//Assignment statement
		if(AST.getText().equals("FUNCTION_CALL"))
		{
			genFunctionCall(AST);
			return;
		}
		
		//Assignment statement
		if(AST.getText().equals(":="))
		{
			genAssignmentStatement(AST);
			return;
		}
		
		//WRITE statement
		if(AST.getText().equals("WRITE"))
		{
			genWriteStatement(AST);
			return;
		}
		
		//READ statement
		if(AST.getText().equals("READ"))
		{
			genReadStatement(AST);
			return;
		}
		
		//IF statement
		if(AST.getText().equals("IF"))
		{
			genIfStatement(AST);
			return;
		}
		
		//DO statement
		if(AST.getText().equals("DO"))
		{
			genDoStatement(AST);
			return;
		}	
		
		//DO statement
		if(AST.getText().equals("RETURN"))
		{
			genRetStatement(AST);
			return;
		}
		
	}
	
	public void genDoStatement(Tree AST)
	{
		String l1 = genLabel(); //Label for loop top
		IRNode n = new IRNode();			
		n.opCode = IRNode.IROp.LABEL;
		n.op1 = l1;
		n.op2 = "";
		n.result = "";
		IR.add(n);
		
		genStatementList(AST.getChild(0));//Loop Main
		genDoCond(AST.getChild(1), l1); //Loop cond	
	}
	
	public void genIfStatement(Tree AST)
	{
		String l1 = genLabel();
		genIfCond(AST.getChild(0), l1);
		genStatementList(AST.getChild(1));//if Main		
		if(AST.getChildCount() > 2) //we have an else part.
		{
			String l2 = genLabel(); //label to jump around else
			IRNode n = new IRNode();
			n.opCode = IRNode.IROp.JUMP;
			n.op1 = "";
			n.op2 = "";
			n.result = l2;
			
			IR.add(n);
			
			n = new IRNode(); //label for else
			n.opCode = IRNode.IROp.LABEL;
			n.op1 = l1;
			n.op2 = "";
			n.result = "";
			
			IR.add(n);
			
			genStatementList(AST.getChild(2));//if Else
			
			n = new IRNode(); //label for if-end
			n.opCode = IRNode.IROp.LABEL;
			n.op1 = l2;
			n.op2 = "";
			n.result = "";
			
			IR.add(n);
		}
		else
		{
			IRNode n = new IRNode();
			n = new IRNode(); //label for if-end
			n.opCode = IRNode.IROp.LABEL;
			n.op1 = l1;
			n.op2 = "";
			n.result = "";
			
			IR.add(n);
		}
		
	}
	
	public void genIfCond(Tree AST, String label)
	{
		IRExpr toRet = new IRExpr();
		IRNode n = new IRNode();
		IRExpr op1, op2;
		AST = AST.getChild(0); //shake off the "IF_COND"
		
		op1 = genExpression(AST.getChild(0));
		op2 = genExpression(AST.getChild(1));
		n.op1 = op1.reg;
		n.op2 = op2.reg;
		toRet.type = determineExprType(op1,op2);
						
		if(AST.getText().equals("<"))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BGEF): (IRNode.IROp.BGEI);			
		}
		else if(AST.getText().equals(">"))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BLEF): (IRNode.IROp.BLEI);
		}
		else if(AST.getText().equals("!="))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BEQF): (IRNode.IROp.BEQI);
		}
		else if(AST.getText().equals("="))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BNEF): (IRNode.IROp.BNEI);
		}
		n.result = label;
		IR.add(n);
	}
	
	public  void genDoCond(Tree AST, String label)
	{
		IRExpr toRet = new IRExpr();
		IRNode n = new IRNode();
		IRExpr op1, op2;
		AST = AST.getChild(0); //shake off the "DO_COND"
		
		op1 = genExpression(AST.getChild(0));
		op2 = genExpression(AST.getChild(1));
		n.op1 = op1.reg;
		n.op2 = op2.reg;
		toRet.type = determineExprType(op1,op2);
				
		
		if(AST.getText().equals("<"))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BLTF): (IRNode.IROp.BLTI);			
		}
		else if(AST.getText().equals(">"))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BGTF): (IRNode.IROp.BGTI);
		}
		else if(AST.getText().equals("!="))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BNEF): (IRNode.IROp.BNEI);
		}
		else if(AST.getText().equals("="))
		{
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.BEQF): (IRNode.IROp.BEQI);
		}
		n.result = label;
		IR.add(n);
	}
	
	public void genWriteStatement(Tree AST)
	{
		
		for(int i=0; i< AST.getChildCount(); i++)
		{
			IRNode n = new IRNode();
			boolean isFloat = isFloatSymbol(AST.getChild(i).getText());
			boolean isString = isStringSymbol(AST.getChild(i).getText());
			n.opCode = (isFloat) ? (IRNode.IROp.WRITEF):(IRNode.IROp.WRITEI);
			n.opCode = (isString) ? (IRNode.IROp.WRITES):(n.opCode);
			n.op1 = AST.getChild(i).getText();
			n.op2 = "";
			n.result = "";
			IR.add(n);
			
			if(Micro.DEBUG_PRINT_STATEMENTS)
			{
				n = new IRNode();
				n.opCode = IRNode.IROp.WRITES;
				n.op1 = "DEBUGINATOR9000";
				n.op2 = "";
				n.result = ""; 	
				IR.add(n);
			}
			
		}
		

	}
	
	public void genReadStatement(Tree AST)
	{
		for(int i=0; i< AST.getChildCount(); i++)
		{
			IRNode n = new IRNode();
			boolean isFloat = isFloatSymbol(AST.getChild(i).getText());
			n.opCode = (isFloat) ? (IRNode.IROp.READF):(IRNode.IROp.READI);
			n.op1 = "";
			n.op2 = "";
			n.result = AST.getChild(i).getText();
			IR.add(n);
		}
	}
	
	public void genAssignmentStatement(Tree AST)
	{
		IRNode n = new IRNode();
		boolean isFloat = isFloatSymbol(AST.getChild(0).getText());
		n.opCode = (isFloat) ? (IRNode.IROp.STOREF):(IRNode.IROp.STOREI);
		n.result = AST.getChild(0).getText(); //where to store
		
		IRExpr op1 = genExpression(AST.getChild(1));
		n.op1 = op1.reg;
		n.op2 = "";
		
		if(!isFloat && (op1.type == IRExpr.RegType.FLOAT))
		{
			//type mismatch.
			System.err.println("TYPE MISMATCH");
			System.exit(1);
		}
		else
		{
			IR.add(n);	
		}
		
	}
	
	public void genRetStatement(Tree AST)
	{
		IRNode n = new IRNode();	
				
		if(AST.getChildCount() > 0)
		{
			IRExpr op = genExpression(AST.getChild(0));
			n.opCode = (op.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.STOREF) :(IRNode.IROp.STOREI);
			n.op1 = op.reg;
			n.op2 = "";
			n.result = "$R"; //return stack location
			IR.add(n);
			
			n = new IRNode();
			n.opCode = IRNode.IROp.RET;			
			n.result = "";
			n.op1 = "";
			n.op2 = "";
		}
		else
		{
			n.opCode = IRNode.IROp.RET;
			n.result = "";					
			n.op1 = "";
			n.op2 = "";
		}
		
		IR.add(n);					
	}
	
	private IRExpr.RegType determineExprType(IRExpr op1, IRExpr op2)
	{
		if((op1.type == IRExpr.RegType.VOID) || (op2.type == IRExpr.RegType.VOID))
		{
			System.err.println("Type Mismatch");
			System.exit(1);
		}
		return ((op1.type == IRExpr.RegType.FLOAT) ||
				(op2.type == IRExpr.RegType.FLOAT))?(IRExpr.RegType.FLOAT):(IRExpr.RegType.INT);
	}
	
	public IRExpr genExpression(Tree AST)
	{			
		IRExpr toRet = new IRExpr();
		if(AST == null){
			toRet.reg = "";
			toRet.type = IRExpr.RegType.UNKNOWN;
			return toRet;
		}
		if(AST.getText() == "FUNCTION_CALL")
		{
			return genFunctionCall(AST);
		}
		IRNode n = new IRNode();
		IRExpr op1, op2;
		op1 = genExpression(AST.getChild(0));
		op2 = genExpression(AST.getChild(1));
		n.op1 = op1.reg;
		n.op2 = op2.reg;
		toRet.type = determineExprType(op1,op2);
		
			
		if(AST.getText().equals("+")){
			
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.ADDF) : (IRNode.IROp.ADDI);
			n.result = genTempReg();
			IR.add(n);
			toRet.reg = n.result;
			
			return toRet;
		}else if(AST.getText().equals("*")){

			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.MULTF) : (IRNode.IROp.MULTI);
			n.result = genTempReg();
			IR.add(n);
			toRet.reg = n.result;
			
			return toRet;
		}else if(AST.getText().equals("-")){

			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.SUBF) : (IRNode.IROp.SUBI);			
			n.result = genTempReg();
			IR.add(n);
			toRet.reg = n.result;
			
			return toRet;
		}else if(AST.getText().equals("/")){
			
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.DIVF) : (IRNode.IROp.DIVI);			
			n.result = genTempReg();
			IR.add(n);
			toRet.reg = n.result;
			
			return toRet;
		}else{
			//literal or symbol. just return
			
			toRet.reg = genTempReg();	
			
			n.op1 = AST.getText();
			n.result = toRet.reg;
			
			try
			{
				float literal = Float.parseFloat(n.op1);
				if(literal == (int)literal)
				{
					toRet.type = IRExpr.RegType.INT;					
				}
				else
				{
					toRet.type = IRExpr.RegType.FLOAT;
				}
			}
			catch(NumberFormatException e)
			{
				if(isFloatSymbol(n.op1))
				{
					toRet.type = IRExpr.RegType.FLOAT;
				}
				else
				{
					toRet.type = IRExpr.RegType.INT;
				}
			}
			n.opCode = (toRet.type == IRExpr.RegType.FLOAT) ? (IRNode.IROp.STOREF) : (IRNode.IROp.STOREI);
			IR.add(n);
			return toRet;
		}
		
		
	}
	
	private IRExpr genFunctionCall(Tree AST) {
		IRExpr op = new IRExpr();
		String name = AST.getChild(0).getText();
		op.type = getFuncitonType(name);
		
		IRNode n = new IRNode();
		n.opCode = IRNode.IROp.PSH; // space for return value
		n.op1 = "";
		n.op2 = "";
		n.result = "";
		IR.add(n);
		
		if(AST.getChild(1) != null) // we have params
		{
			Tree node = AST.getChild(1);
			if(node.getChildCount() != functionPrototypes.get(name).paramTypes.size())
			{
				System.err.println("Wrong number of function arguments!");
				System.exit(1);
			}
			for(int i = 0; i< node.getChildCount(); i++)  //PSH on all our params
			{
				n = new IRNode();
				n.opCode = IRNode.IROp.PSH;
				IRExpr op1;
				op1 = genExpression(node.getChild(i));				
				
				if(! functionPrototypes.get(name).paramTypes.get(i).equals(getTypeString(op1)))
				{
					System.err.println("Formal parameter type does not match actual parameter type in funciton " + name);
					System.exit(1);
				}
				n.op1 = op1.reg;
				n.op2 = "";
				n.result = "";
				IR.add(n);
			}
			
		}
		
		n = new IRNode();
		n.opCode = IRNode.IROp.JSR;
		n.op1 = name;
		n.op2 = "";
		n.result = "";
		IR.add(n);
		
		if(AST.getChild(1) != null) // we have params
		{
			Tree node = AST.getChild(1);
			if(node.getChildCount() != functionPrototypes.get(name).paramTypes.size())
			{
				System.err.println("Wrong number of function arguments!");
				System.exit(1);
			}
			for(int i = 0; i< node.getChildCount(); i++)  //POP off the space we had for all our params
			{
				n = new IRNode();
				n.opCode = IRNode.IROp.POP;
				n.op1 = "";
				n.op2 = "";
				n.result = "";
				IR.add(n);
			}
		}
		
		n = new IRNode();
		n.opCode = IRNode.IROp.POP; //grab return value
		n.op1 = "";
		n.op2 = "";
		n.result = genTempReg();
		IR.add(n);
		
		op.reg = n.result;
		
		return op;
	}

	private String getTypeString(IRExpr op1) {
		// TODO Auto-generated method stub
		if(op1.type == IRExpr.RegType.FLOAT) return "FLOAT";
		if(op1.type == IRExpr.RegType.INT) return "INT";
		return "UNKNOWN";
	}


	private String genSysReg(int i)
	{
		if(i >= Micro.SYSTEM_REGISTER_COUNT)
		{
			System.err.println("SYSTEM DOES NOT HAVE ENOUGH REGISTERS");
			System.exit(1);
		}
		
		return "$r" + i;
	}
	
	
	private String getSymbolType(String name) {
		//start with params
		for(MicroParserParser.TableEntry te : paramTable)
		{
			if(te.Name.equals(name)){
				return te.Type;
			}
		}
		
		//start with local scope
		for(int i= 1; i>=0; i--)
		{
			Integer objI = new Integer(i);
			for(MicroParserParser.TableEntry te : symbolTable.get(objI))
			{
				if(te.Name.equals(name)){
					return te.Type;
				}
			}
		}
		System.out.println("Can't find your symbol.");
		return null;
	}
	


	private IRExpr.RegType getFuncitonType(String name) {
		FunctionPrototype f = functionPrototypes.get(name);
		if(f == null){
			System.err.println("Function Not Defined!");
			System.exit(1);
		}

		if(f.type.equals("VOID"))
		{
			return IRExpr.RegType.VOID;
		}
		if(f.type.equals("INT"))
		{
			return IRExpr.RegType.INT;
		}
		if(f.type.equals("FLOAT"))
		{
			return IRExpr.RegType.FLOAT;
		}
		
		return IRExpr.RegType.UNKNOWN;
	}


	//TODO: enfore to 1000
	public String genTempReg(){
		return "$T" + (regCount++);
	}
	
	public String genLabel()
	{				
		return "$L" + (labelCount++);		
	}
	
	public boolean isFloatSymbol(String name)
	{
		//start with params
		for(MicroParserParser.TableEntry te : paramTable)
		{
			if(te.Name.equals(name)){
				if(te.Type.equals("FLOAT"))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		
		//start with local scope
		for(int i= 1; i>=0; i--)
		{
			Integer objI = new Integer(i);
			for(MicroParserParser.TableEntry te : symbolTable.get(objI))
			{
				if(te.Name.equals(name)){
					if(te.Type.equals("FLOAT"))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
			}
		}
		System.out.println("Can't find your symbol.");
		return false;
	}
	
	public boolean isStringSymbol(String name)
	{
		//start with local scope
		for(int i= 1; i>=0; i--)
		{
			Integer objI = new Integer(i);
			for(MicroParserParser.TableEntry te : symbolTable.get(objI))
			{
				if(te.Name.equals(name)){
					if(te.Type.equals("STRING"))
					{
						return true;
					}
					else
					{
						return false;
					}
				}
			}
		}
		System.out.println("Can't find your symbol.");
		return false;
	}	
}
