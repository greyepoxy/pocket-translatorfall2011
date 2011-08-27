import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
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
			MicroLexer lexer = new MicroLexer(inputstream);
			Token t = lexer.nextToken();
			while (t.getType() != -1)
			{
				if((t.getType()) != MicroLexer.WS && (t.getType() != MicroLexer.COMMENT))
				{
					String type = "";
					switch(t.getType())
					{
					case MicroLexer.FLOATLITERAL:
						type = "FLOATLITERAL";
						break;
					case MicroLexer.IDENTIFIER:
						type = "IDENTIFER";
						break;
					case MicroLexer.INTLITERAL:
						type = "INTLITERAL";
						break;
					case MicroLexer.KEYWORD:
						type = "KEYWORD";
						break;
					case MicroLexer.OPERATOR:
						type = "OPERATOR";
						break;
					case MicroLexer.STRINGLITERAL:
						type = "STRINGLITERAL";
						break;
					default:
						System.out.println("Invalid Token type");
						System.exit(1);
							
					}
					
					System.out.println("Type: " + type);
					System.out.println("Value: " + t.getText());					
				}
				
				t = lexer.nextToken();
			}
			
		}
		catch(IOException e)
		{
			System.out.println("Couldn't find the file");
		}
		
		
	}

}

