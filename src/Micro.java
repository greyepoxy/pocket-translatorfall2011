import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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

