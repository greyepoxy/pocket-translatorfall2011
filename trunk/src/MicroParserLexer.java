// $ANTLR 3.4 C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g 2011-10-21 15:22:25

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int Addop=4;
    public static final int COMMENT=5;
    public static final int Compop=6;
    public static final int DO_COND=7;
    public static final int DO_MAIN=8;
    public static final int FLOATLITERAL=9;
    public static final int FUNCTION_BODY=10;
    public static final int IDENTIFIER=11;
    public static final int IF_COND=12;
    public static final int IF_ELSE=13;
    public static final int IF_MAIN=14;
    public static final int INTLITERAL=15;
    public static final int LABEL=16;
    public static final int Mulop=17;
    public static final int Program_start=18;
    public static final int STRINGLITERAL=19;
    public static final int Var_type=20;
    public static final int WS=21;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MicroParserLexer() {} 
    public MicroParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:2:7: ( '(' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:3:7: ( ')' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:4:7: ( ',' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:4:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:5:7: ( ':=' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:5:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:6:7: ( ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:6:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:7:7: ( 'BEGIN' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:7:9: 'BEGIN'
            {
            match("BEGIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:8:7: ( 'DO' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:8:9: 'DO'
            {
            match("DO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:9:7: ( 'ELSE' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:9:9: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:10:7: ( 'END' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:10:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:11:7: ( 'ENDIF' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:11:9: 'ENDIF'
            {
            match("ENDIF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:12:7: ( 'FUNCTION' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:12:9: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:13:7: ( 'IF' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:13:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:14:7: ( 'PROGRAM' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:14:9: 'PROGRAM'
            {
            match("PROGRAM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:15:7: ( 'READ' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:15:9: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:16:7: ( 'RETURN' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:16:9: 'RETURN'
            {
            match("RETURN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:17:7: ( 'STRING' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:17:9: 'STRING'
            {
            match("STRING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:18:7: ( 'THEN' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:18:9: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:19:7: ( 'VOID' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:19:9: 'VOID'
            {
            match("VOID"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:20:7: ( 'WHILE' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:20:9: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:21:7: ( 'WRITE' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:21:9: 'WRITE'
            {
            match("WRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "Var_type"
    public final void mVar_type() throws RecognitionException {
        try {
            int _type = Var_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:133:10: ( 'FLOAT' | 'INT' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='F') ) {
                alt1=1;
            }
            else if ( (LA1_0=='I') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:133:12: 'FLOAT'
                    {
                    match("FLOAT"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:133:22: 'INT'
                    {
                    match("INT"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Var_type"

    // $ANTLR start "Addop"
    public final void mAddop() throws RecognitionException {
        try {
            int _type = Addop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:215:7: ( '+' | '-' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Addop"

    // $ANTLR start "Mulop"
    public final void mMulop() throws RecognitionException {
        try {
            int _type = Mulop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:218:7: ( '*' | '/' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Mulop"

    // $ANTLR start "Compop"
    public final void mCompop() throws RecognitionException {
        try {
            int _type = Compop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:230:8: ( '<' | '>' | '=' | '!=' )
            int alt2=4;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt2=1;
                }
                break;
            case '>':
                {
                alt2=2;
                }
                break;
            case '=':
                {
                alt2=3;
                }
                break;
            case '!':
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:230:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:230:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:230:22: '='
                    {
                    match('='); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:230:28: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Compop"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:244:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:244:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:244:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:247:12: ( ( '0' .. '9' )+ )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:247:14: ( '0' .. '9' )+
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:247:14: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "FLOATLITERAL"
    public final void mFLOATLITERAL() throws RecognitionException {
        try {
            int _type = FLOATLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:251:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                alt8=1;
            }
            else if ( (LA8_0=='.') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:251:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:251:9: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    match('.'); 

                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:251:25: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:252:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:252:13: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOATLITERAL"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:256:5: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:256:9: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 



            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:256:14: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:256:28: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:256:28: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:264:5: ( '\"' (~ ( '\"' ) )* '\"' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:264:8: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:264:12: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGLITERAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:267:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:267:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "Program_start"
    public final void mProgram_start() throws RecognitionException {
        try {
            int _type = Program_start;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:275:2: ()
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:276:2: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Program_start"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | Var_type | Addop | Mulop | Compop | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLITERAL | WS | Program_start )
        int alt12=31;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:10: T__22
                {
                mT__22(); 


                }
                break;
            case 2 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:16: T__23
                {
                mT__23(); 


                }
                break;
            case 3 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:22: T__24
                {
                mT__24(); 


                }
                break;
            case 4 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:28: T__25
                {
                mT__25(); 


                }
                break;
            case 5 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:34: T__26
                {
                mT__26(); 


                }
                break;
            case 6 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:40: T__27
                {
                mT__27(); 


                }
                break;
            case 7 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:46: T__28
                {
                mT__28(); 


                }
                break;
            case 8 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:52: T__29
                {
                mT__29(); 


                }
                break;
            case 9 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:58: T__30
                {
                mT__30(); 


                }
                break;
            case 10 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:64: T__31
                {
                mT__31(); 


                }
                break;
            case 11 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:70: T__32
                {
                mT__32(); 


                }
                break;
            case 12 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:76: T__33
                {
                mT__33(); 


                }
                break;
            case 13 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:82: T__34
                {
                mT__34(); 


                }
                break;
            case 14 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:88: T__35
                {
                mT__35(); 


                }
                break;
            case 15 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:94: T__36
                {
                mT__36(); 


                }
                break;
            case 16 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:100: T__37
                {
                mT__37(); 


                }
                break;
            case 17 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:106: T__38
                {
                mT__38(); 


                }
                break;
            case 18 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:112: T__39
                {
                mT__39(); 


                }
                break;
            case 19 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:118: T__40
                {
                mT__40(); 


                }
                break;
            case 20 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:124: T__41
                {
                mT__41(); 


                }
                break;
            case 21 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:130: Var_type
                {
                mVar_type(); 


                }
                break;
            case 22 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:139: Addop
                {
                mAddop(); 


                }
                break;
            case 23 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:145: Mulop
                {
                mMulop(); 


                }
                break;
            case 24 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:151: Compop
                {
                mCompop(); 


                }
                break;
            case 25 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:158: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 26 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:169: INTLITERAL
                {
                mINTLITERAL(); 


                }
                break;
            case 27 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:180: FLOATLITERAL
                {
                mFLOATLITERAL(); 


                }
                break;
            case 28 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:193: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 29 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:201: STRINGLITERAL
                {
                mSTRINGLITERAL(); 


                }
                break;
            case 30 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:215: WS
                {
                mWS(); 


                }
                break;
            case 31 :
                // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:1:218: Program_start
                {
                mProgram_start(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\32\5\uffff\13\24\1\27\3\uffff\1\53\5\uffff\1\24\1\55\4\24\1\62"+
        "\10\24\2\uffff\1\24\1\uffff\1\24\1\77\2\24\1\uffff\1\102\11\24\1"+
        "\114\1\24\1\uffff\2\24\1\uffff\1\24\1\121\2\24\1\124\1\125\2\24"+
        "\1\130\1\uffff\1\131\1\24\1\102\1\24\1\uffff\2\24\2\uffff\1\136"+
        "\1\137\2\uffff\2\24\1\142\1\143\2\uffff\1\24\1\145\2\uffff\1\146"+
        "\2\uffff";
    static final String DFA12_eofS =
        "\147\uffff";
    static final String DFA12_minS =
        "\1\11\5\uffff\1\105\1\117\2\114\1\106\1\122\1\105\1\124\1\110\1"+
        "\117\1\110\1\55\3\uffff\1\56\5\uffff\1\107\1\60\1\123\1\104\1\116"+
        "\1\117\1\60\1\124\1\117\1\101\1\122\1\105\3\111\2\uffff\1\111\1"+
        "\uffff\1\105\1\60\1\103\1\101\1\uffff\1\60\1\107\1\104\1\125\1\111"+
        "\1\116\1\104\1\114\1\124\1\116\1\60\1\106\1\uffff\2\124\1\uffff"+
        "\1\122\1\60\1\122\1\116\2\60\2\105\1\60\1\uffff\1\60\1\111\1\60"+
        "\1\101\1\uffff\1\116\1\107\2\uffff\2\60\2\uffff\1\117\1\115\2\60"+
        "\2\uffff\1\116\1\60\2\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\172\5\uffff\1\105\1\117\1\116\1\125\1\116\1\122\1\105\1\124\1"+
        "\110\1\117\1\122\1\55\3\uffff\1\71\5\uffff\1\107\1\172\1\123\1\104"+
        "\1\116\1\117\1\172\1\124\1\117\1\124\1\122\1\105\3\111\2\uffff\1"+
        "\111\1\uffff\1\105\1\172\1\103\1\101\1\uffff\1\172\1\107\1\104\1"+
        "\125\1\111\1\116\1\104\1\114\1\124\1\116\1\172\1\106\1\uffff\2\124"+
        "\1\uffff\1\122\1\172\1\122\1\116\2\172\2\105\1\172\1\uffff\1\172"+
        "\1\111\1\172\1\101\1\uffff\1\116\1\107\2\uffff\2\172\2\uffff\1\117"+
        "\1\115\2\172\2\uffff\1\116\1\172\2\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\14\uffff\1\27\1\30\1\31\1\uffff\1\33"+
        "\1\26\1\35\1\36\1\37\17\uffff\1\34\1\32\1\uffff\1\7\4\uffff\1\14"+
        "\14\uffff\1\11\2\uffff\1\25\11\uffff\1\10\4\uffff\1\16\2\uffff\1"+
        "\21\1\22\2\uffff\1\6\1\12\4\uffff\1\23\1\24\2\uffff\1\17\1\20\1"+
        "\uffff\1\15\1\13";
    static final String DFA12_specialS =
        "\147\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\23\1\30\5\uffff\1\1\1\2\1"+
            "\22\1\27\1\3\1\21\1\26\1\22\12\25\1\4\1\5\3\23\2\uffff\1\24"+
            "\1\6\1\24\1\7\1\10\1\11\2\24\1\12\6\24\1\13\1\24\1\14\1\15\1"+
            "\16\1\24\1\17\1\20\3\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "\1\34",
            "\1\35\1\uffff\1\36",
            "\1\40\10\uffff\1\37",
            "\1\41\7\uffff\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50\11\uffff\1\51",
            "\1\52",
            "",
            "",
            "",
            "\1\26\1\uffff\12\25",
            "",
            "",
            "",
            "",
            "",
            "\1\54",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\63",
            "\1\64",
            "\1\65\22\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "",
            "",
            "\1\74",
            "",
            "\1\75",
            "\12\24\7\uffff\10\24\1\76\21\24\4\uffff\1\24\1\uffff\32\24",
            "\1\100",
            "\1\101",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\115",
            "",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\122",
            "\1\123",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\126",
            "\1\127",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\132",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\140",
            "\1\141",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\144",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | Var_type | Addop | Mulop | Compop | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLITERAL | WS | Program_start );";
        }
    }
 

}