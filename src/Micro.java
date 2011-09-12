import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;

public class Micro {

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
            	parser.program(); //look for overall program structure.
                System.out.println("Accepted");
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

}

