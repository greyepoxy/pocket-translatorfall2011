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

	//TODO: CHANGE BEFORE SUBMISSION!!!!!!!!!!!!!!!!!!!!!!!
	public static final boolean DEBUG_PRINT_STATEMENTS = true;
	
	public static final int SYSTEM_REGISTER_COUNT = 4;
	
	
	/**
	 * @param args
	 */
	

	
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
            		
            		for(int i=0; i< IR.size(); i++)
            		{
            			System.out.println("; " + IR.get(i).opCode + " " + IR.get(i).op1 + " " + IR.get(i).op2 +  " " + IR.get(i).result); 
            		}
            	}
//				
            	
            	
//            	LinkedList<TinyNode> tiny = TinyNode.irToTiny(IR, parser);  
//            	TinyNode.printTiny(tiny);

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

