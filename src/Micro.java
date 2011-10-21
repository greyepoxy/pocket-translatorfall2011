import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import java.util.LinkedList;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.Tree;


public class Micro {

	
	/**
	 * @param args
	 */
	private static class IRExpr
	{
		public enum RegType
		{
			INT,
			FLOAT,
			VAR_INT,
			VAR_FLOAT,
			LIT_INT,
			LIT_FLOAT,
			UNKNOWN
		}
		
		public String reg;
		public RegType type;
	}

	static int regCount = 0;
	
	static int labelCount = 0;
	
	static public Stack<String> labelStack;
	
	public static void main(String[] args) {
					
		//lets do some file io
		labelStack = new Stack<String>();
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
            	LinkedList<IRNode> IR = new LinkedList<IRNode>();

            	genIR(IR,(Tree)ret.tree, parser.tableOfTables);
            	for(int i=0; i< IR.size(); i++)
            	{
            		System.out.println("; " + IR.get(i).opCode + " " + IR.get(i).op1 + " " + IR.get(i).op2 +  " " + IR.get(i).result); 
            	}
				
            	LinkedList<TinyNode> tiny = TinyNode.irToTiny(IR, parser);  
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
	
	
	
	public static void genIR(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		HashMap<Integer,ArrayList<MicroParserParser.TableEntry>> scopedSymbolTables = new HashMap<Integer,ArrayList<MicroParserParser.TableEntry>>();
		scopedSymbolTables.put(new Integer(0), symbolTable.get(new Integer(0)));
		for(int i = 0; i< AST.getChildCount(); i++){
			scopedSymbolTables.put(new Integer(1), symbolTable.get(new Integer(1 + i))); //symbol table corresponding to this function
			genFunction(IR, AST.getChild(i), symbolTable);	
			scopedSymbolTables.remove(new Integer(1));			
		}						
	}
	
	public static void genFunction(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		
			IRNode n = new IRNode();		
			n.opCode = IRNode.IROp.LABEL;
			n.op1 = AST.getChild(0).getText();
			n.op2 = "";
			n.result = "";
			IR.add(n);	
			labelStack.push(n.op1);
			genStatementList(IR,AST.getChild(1), symbolTable);
			labelStack.pop();
	}
	
	public static void genStatementList(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		for(int i = 0; i< AST.getChildCount(); i++){
			genStatement(IR, AST.getChild(i), symbolTable);		
		}						
	}
	
	public static void genStatement(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		//Assignment statement
		if(AST.getText().equals(":="))
		{
			genAssignmentStatement(IR,AST, symbolTable);
			return;
		}
		
		//WRITE statement
		if(AST.getText().equals("WRITE"))
		{
			genWriteStatement(IR,AST, symbolTable);
			return;
		}
		
		//READ statement
		if(AST.getText().equals("READ"))
		{
			genReadStatement(IR,AST, symbolTable);
			return;
		}
		
		//IF statement
		if(AST.getText().equals("IF"))
		{
			genIfStatement(IR,AST, symbolTable);
			return;
		}
		
		//DO statement
		if(AST.getText().equals("DO"))
		{
			genDoStatement(IR,AST, symbolTable);
			return;
		}	
		
	}
	
	public static void genDoStatement(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		String l1 = genLabel(); //Label for loop top
		IRNode n = new IRNode();			
		n.opCode = IRNode.IROp.LABEL;
		n.op1 = l1;
		n.op2 = "";
		n.result = "";
		IR.add(n);
		
		genStatementList(IR,AST.getChild(0),symbolTable);//Loop Main
		genDoCond(IR,AST.getChild(1),symbolTable, l1); //Loop cond	
	}
	
	public static void genIfStatement(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		String l1 = genLabel();
		genIfCond(IR,AST.getChild(0),symbolTable, l1);
		genStatementList(IR,AST.getChild(1),symbolTable);//if Main		
		if(AST.getChildCount() > 2) //we have an else part.
		{
			String l2 = genLabel(); //label to jump around else
			IRNode n = new IRNode();
			n.opCode = IRNode.IROp.JUMP;
			n.op1 = l2;
			n.op2 = "";
			n.result = "";
			
			IR.add(n);
			
			n = new IRNode(); //label for else
			n.opCode = IRNode.IROp.LABEL;
			n.op1 = l1;
			n.op2 = "";
			n.result = "";
			
			IR.add(n);
			
			genStatementList(IR,AST.getChild(2),symbolTable);//if Else
			
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
	
	public static void genIfCond(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable, String label)
	{
		IRExpr toRet = new IRExpr();
		IRNode n = new IRNode();
		IRExpr op1, op2;
		AST = AST.getChild(0); //shake off the "IF_COND"
		
		op1 = genExpression(IR,AST.getChild(0),symbolTable);
		op2 = genExpression(IR,AST.getChild(1),symbolTable);
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
	
	public static void genDoCond(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable, String label)
	{
		IRExpr toRet = new IRExpr();
		IRNode n = new IRNode();
		IRExpr op1, op2;
		AST = AST.getChild(0); //shake off the "DO_COND"
		
		op1 = genExpression(IR,AST.getChild(0),symbolTable);
		op2 = genExpression(IR,AST.getChild(1),symbolTable);
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
	
	public static void genWriteStatement(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		
		for(int i=0; i< AST.getChildCount(); i++)
		{
			IRNode n = new IRNode();
			boolean isFloat = isFloatSymbol(AST.getChild(i).getText(), symbolTable);
			n.opCode = (isFloat) ? (IRNode.IROp.WRITEF):(IRNode.IROp.WRITEI);
			n.op1 = "";
			n.op2 = "";
			n.result = AST.getChild(i).getText();
			IR.add(n);
		}
		

	}
	
	public static void genReadStatement(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		for(int i=0; i< AST.getChildCount(); i++)
		{
			IRNode n = new IRNode();
			boolean isFloat = isFloatSymbol(AST.getChild(i).getText(), symbolTable);
			n.opCode = (isFloat) ? (IRNode.IROp.READF):(IRNode.IROp.READI);
			n.op1 = "";
			n.op2 = "";
			n.result = AST.getChild(i).getText();
			IR.add(n);
		}
	}
	
	public static void genAssignmentStatement(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
		IRNode n = new IRNode();
		boolean isFloat = isFloatSymbol(AST.getChild(0).getText(), symbolTable);
		n.opCode = (isFloat) ? (IRNode.IROp.STOREF):(IRNode.IROp.STOREI);
		n.result = AST.getChild(0).getText(); //where to store
		
		IRExpr op1 = genExpression(IR, AST.getChild(1),symbolTable);
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
	
	private static IRExpr.RegType determineExprType(IRExpr op1, IRExpr op2)
	{
		return ((op1.type == IRExpr.RegType.FLOAT) ||
				(op2.type == IRExpr.RegType.FLOAT))?(IRExpr.RegType.FLOAT):(IRExpr.RegType.INT);
	}
	
	public static IRExpr genExpression(LinkedList<IRNode> IR, Tree AST, HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{			
		IRExpr toRet = new IRExpr();
		if(AST == null){
			toRet.reg = "";
			toRet.type = IRExpr.RegType.UNKNOWN;
			return toRet;
		}	
		IRNode n = new IRNode();
		IRExpr op1, op2;
		op1 = genExpression(IR,AST.getChild(0),symbolTable);
		op2 = genExpression(IR,AST.getChild(1),symbolTable);
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
			toRet.reg = AST.getText();			
			try
			{
				float literal = Float.parseFloat(toRet.reg);
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
				if(isFloatSymbol(toRet.reg,symbolTable))
				{
					toRet.type = IRExpr.RegType.FLOAT;
				}
				else
				{
					toRet.type = IRExpr.RegType.INT;
				}
			}
			
			return toRet;
		}
		
		
	}
	
	//TODO: enfore to 1000
	public static String genTempReg(){
		return "$T" + (regCount++);
	}
	
	public static String genLabel()
	{				
		return "$L" + (labelCount++);		
	}
	
	public static boolean isFloatSymbol(String name,HashMap<Integer, ArrayList<MicroParserParser.TableEntry>> symbolTable)
	{
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
	
}

