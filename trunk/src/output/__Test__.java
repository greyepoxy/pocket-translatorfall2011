import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MicroParserLexer lex = new MicroParserLexer(new ANTLRFileStream("C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MicroParserParser g = new MicroParserParser(tokens, 49153, null);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}