import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MicroParserLexer lex = new MicroParserLexer(new ANTLRFileStream("C:\\Users\\Justin\\Documents\\workspace\\pocket-translatorfall2011\\test.micro", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MicroParserParser g = new MicroParserParser(tokens, 49100, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}