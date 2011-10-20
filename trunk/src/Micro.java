import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

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
			genStatementList(IR,AST.getChild(1), symbolTable);
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
		n.op1 = genExpression(IR, AST.getChild(1), isFloat);
		n.op2 = "";
		IR.add(n);
	}
	
	public static String genExpression(LinkedList<IRNode> IR, Tree AST, boolean isFloat)
	{			
		if(AST.getText().equals("+")){
			IRNode n = new IRNode();
			n.opCode = (isFloat) ? (IRNode.IROp.ADDF) : (IRNode.IROp.ADDI);
			n.op1 = genExpression(IR,AST.getChild(0), isFloat);
			n.op2 = genExpression(IR,AST.getChild(1), isFloat);
			n.result = genTempReg();
			IR.add(n);
			return n.result;
		}else if(AST.getText().equals("*")){
			IRNode n = new IRNode();
			n.opCode = (isFloat) ? (IRNode.IROp.MULTF) : (IRNode.IROp.MULTI);
			n.op1 = genExpression(IR,AST.getChild(0), isFloat);
			n.op2 = genExpression(IR,AST.getChild(1), isFloat);
			n.result = genTempReg();
			IR.add(n);
			return n.result;
		}else if(AST.getText().equals("-")){
			IRNode n = new IRNode();
			n.opCode = (isFloat) ? (IRNode.IROp.SUBF) : (IRNode.IROp.SUBI);
			n.op1 = genExpression(IR,AST.getChild(0), isFloat);
			n.op2 = genExpression(IR,AST.getChild(1), isFloat);
			n.result = genTempReg();
			IR.add(n);
			return n.result;
		}else if(AST.getText().equals("/")){
			IRNode n = new IRNode();
			n.opCode = (isFloat) ? (IRNode.IROp.DIVF) : (IRNode.IROp.DIVI);
			n.op1 = genExpression(IR,AST.getChild(0), isFloat);
			n.op2 = genExpression(IR,AST.getChild(1), isFloat);
			n.result = genTempReg();
			IR.add(n);
			return n.result;
		}else{
			//literal or symbol. just return
			return AST.getText();
		}
		
		
	}
	
	//TODO: enfore to 1000
	public static String genTempReg(){
		return "$T" + (regCount++);
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

