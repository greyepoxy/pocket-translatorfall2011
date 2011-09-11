// $ANTLR 3.4 /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g 2011-09-11 15:38:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
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
    public static final int Addop=4;
    public static final int COMMENT=5;
    public static final int Compop=6;
    public static final int FLOATLITERAL=7;
    public static final int IDENTIFIER=8;
    public static final int INTLITERAL=9;
    public static final int Mulop=10;
    public static final int STRINGLITERAL=11;
    public static final int Var_type=12;
    public static final int WS=13;

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
    public String getGrammarFileName() { return "/home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:2:7: ( '(' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:2:9: '('
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:3:7: ( ')' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:3:9: ')'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:7: ( ');' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:9: ');'
            {
            match(");"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:5:7: ( ',' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:5:9: ','
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:6:7: ( ':=' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:6:9: ':='
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:7: ( ';' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:9: ';'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:8:7: ( 'BEGIN' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:8:9: 'BEGIN'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:9:7: ( 'DO' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:9:9: 'DO'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:7: ( 'ELSE' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:9: 'ELSE'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:11:7: ( 'END' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:11:9: 'END'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:12:7: ( 'ENDIF' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:12:9: 'ENDIF'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:13:7: ( 'FUNCTION' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:13:9: 'FUNCTION'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:7: ( 'IF' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:9: 'IF'
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:15:7: ( 'PROGRAM' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:15:9: 'PROGRAM'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:16:7: ( 'READ' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:16:9: 'READ'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:7: ( 'RETURN' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:9: 'RETURN'
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:18:7: ( 'STRING' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:18:9: 'STRING'
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
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:19:7: ( 'THEN' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:19:9: 'THEN'
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
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:20:7: ( 'VOID' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:20:9: 'VOID'
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
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:7: ( 'WHILE' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:9: 'WHILE'
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
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:22:7: ( 'WRITE' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:22:9: 'WRITE'
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
    // $ANTLR end "T__34"

    // $ANTLR start "Var_type"
    public final void mVar_type() throws RecognitionException {
        try {
            int _type = Var_type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:40:10: ( 'FLOAT' | 'INT' )
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
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:40:12: 'FLOAT'
                    {
                    match("FLOAT"); 



                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:40:22: 'INT'
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:132:7: ( '+' | '-' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:135:7: ( '*' | '/' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:8: ( '<' | '>' | '=' | '!=' )
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
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:10: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:16: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:22: '='
                    {
                    match('='); 

                    }
                    break;
                case 4 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:28: '!='
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:162:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:162:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:162:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:165:12: ( ( '0' .. '9' )+ )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:165:14: ( '0' .. '9' )+
            {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:165:14: ( '0' .. '9' )+
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
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
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
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:9: ( '0' .. '9' )+
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
                    	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:25: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:170:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:170:13: ( '0' .. '9' )+
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
                    	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:174:5: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:174:9: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 



            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:174:14: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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


            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:174:28: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:174:28: '\\r'
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:182:5: ( '\"' (~ ( '\"' ) )* '\"' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:182:8: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:182:12: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
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
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:185:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:185:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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

    public void mTokens() throws RecognitionException {
        // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | Var_type | Addop | Mulop | Compop | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLITERAL | WS )
        int alt12=31;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:10: T__14
                {
                mT__14(); 


                }
                break;
            case 2 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:16: T__15
                {
                mT__15(); 


                }
                break;
            case 3 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:22: T__16
                {
                mT__16(); 


                }
                break;
            case 4 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:28: T__17
                {
                mT__17(); 


                }
                break;
            case 5 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:34: T__18
                {
                mT__18(); 


                }
                break;
            case 6 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:40: T__19
                {
                mT__19(); 


                }
                break;
            case 7 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:46: T__20
                {
                mT__20(); 


                }
                break;
            case 8 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:52: T__21
                {
                mT__21(); 


                }
                break;
            case 9 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:58: T__22
                {
                mT__22(); 


                }
                break;
            case 10 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:64: T__23
                {
                mT__23(); 


                }
                break;
            case 11 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:70: T__24
                {
                mT__24(); 


                }
                break;
            case 12 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:76: T__25
                {
                mT__25(); 


                }
                break;
            case 13 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:82: T__26
                {
                mT__26(); 


                }
                break;
            case 14 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:88: T__27
                {
                mT__27(); 


                }
                break;
            case 15 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:94: T__28
                {
                mT__28(); 


                }
                break;
            case 16 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:100: T__29
                {
                mT__29(); 


                }
                break;
            case 17 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:106: T__30
                {
                mT__30(); 


                }
                break;
            case 18 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:112: T__31
                {
                mT__31(); 


                }
                break;
            case 19 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:118: T__32
                {
                mT__32(); 


                }
                break;
            case 20 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:124: T__33
                {
                mT__33(); 


                }
                break;
            case 21 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:130: T__34
                {
                mT__34(); 


                }
                break;
            case 22 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:136: Var_type
                {
                mVar_type(); 


                }
                break;
            case 23 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:145: Addop
                {
                mAddop(); 


                }
                break;
            case 24 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:151: Mulop
                {
                mMulop(); 


                }
                break;
            case 25 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:157: Compop
                {
                mCompop(); 


                }
                break;
            case 26 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:164: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 27 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:175: INTLITERAL
                {
                mINTLITERAL(); 


                }
                break;
            case 28 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:186: FLOATLITERAL
                {
                mFLOATLITERAL(); 


                }
                break;
            case 29 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:199: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 30 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:207: STRINGLITERAL
                {
                mSTRINGLITERAL(); 


                }
                break;
            case 31 :
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:1:221: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\2\uffff\1\33\3\uffff\13\24\1\27\3\uffff\1\54\6\uffff\1\24\1\56"+
        "\4\24\1\63\10\24\2\uffff\1\24\1\uffff\1\24\1\100\2\24\1\uffff\1"+
        "\103\11\24\1\115\1\24\1\uffff\2\24\1\uffff\1\24\1\122\2\24\1\125"+
        "\1\126\2\24\1\131\1\uffff\1\132\1\24\1\103\1\24\1\uffff\2\24\2\uffff"+
        "\1\137\1\140\2\uffff\2\24\1\143\1\144\2\uffff\1\24\1\146\2\uffff"+
        "\1\147\2\uffff";
    static final String DFA12_eofS =
        "\150\uffff";
    static final String DFA12_minS =
        "\1\11\1\uffff\1\73\3\uffff\1\105\1\117\2\114\1\106\1\122\1\105\1"+
        "\124\1\110\1\117\1\110\1\55\3\uffff\1\56\6\uffff\1\107\1\60\1\123"+
        "\1\104\1\116\1\117\1\60\1\124\1\117\1\101\1\122\1\105\3\111\2\uffff"+
        "\1\111\1\uffff\1\105\1\60\1\103\1\101\1\uffff\1\60\1\107\1\104\1"+
        "\125\1\111\1\116\1\104\1\114\1\124\1\116\1\60\1\106\1\uffff\2\124"+
        "\1\uffff\1\122\1\60\1\122\1\116\2\60\2\105\1\60\1\uffff\1\60\1\111"+
        "\1\60\1\101\1\uffff\1\116\1\107\2\uffff\2\60\2\uffff\1\117\1\115"+
        "\2\60\2\uffff\1\116\1\60\2\uffff\1\60\2\uffff";
    static final String DFA12_maxS =
        "\1\172\1\uffff\1\73\3\uffff\1\105\1\117\1\116\1\125\1\116\1\122"+
        "\1\105\1\124\1\110\1\117\1\122\1\55\3\uffff\1\71\6\uffff\1\107\1"+
        "\172\1\123\1\104\1\116\1\117\1\172\1\124\1\117\1\124\1\122\1\105"+
        "\3\111\2\uffff\1\111\1\uffff\1\105\1\172\1\103\1\101\1\uffff\1\172"+
        "\1\107\1\104\1\125\1\111\1\116\1\104\1\114\1\124\1\116\1\172\1\106"+
        "\1\uffff\2\124\1\uffff\1\122\1\172\1\122\1\116\2\172\2\105\1\172"+
        "\1\uffff\1\172\1\111\1\172\1\101\1\uffff\1\116\1\107\2\uffff\2\172"+
        "\2\uffff\1\117\1\115\2\172\2\uffff\1\116\1\172\2\uffff\1\172\2\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\14\uffff\1\30\1\31\1\32\1\uffff"+
        "\1\34\1\27\1\36\1\37\1\3\1\2\17\uffff\1\35\1\33\1\uffff\1\10\4\uffff"+
        "\1\15\14\uffff\1\12\2\uffff\1\26\11\uffff\1\11\4\uffff\1\17\2\uffff"+
        "\1\22\1\23\2\uffff\1\7\1\13\4\uffff\1\24\1\25\2\uffff\1\20\1\21"+
        "\1\uffff\1\16\1\14";
    static final String DFA12_specialS =
        "\150\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\1\23\1\30\5\uffff\1\1\1\2\1"+
            "\22\1\27\1\3\1\21\1\26\1\22\12\25\1\4\1\5\3\23\2\uffff\1\24"+
            "\1\6\1\24\1\7\1\10\1\11\2\24\1\12\6\24\1\13\1\24\1\14\1\15\1"+
            "\16\1\24\1\17\1\20\3\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\32",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36\1\uffff\1\37",
            "\1\41\10\uffff\1\40",
            "\1\42\7\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51\11\uffff\1\52",
            "\1\53",
            "",
            "",
            "",
            "\1\26\1\uffff\12\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\64",
            "\1\65",
            "\1\66\22\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "\1\75",
            "",
            "\1\76",
            "\12\24\7\uffff\10\24\1\77\21\24\4\uffff\1\24\1\uffff\32\24",
            "\1\101",
            "\1\102",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\116",
            "",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\123",
            "\1\124",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\127",
            "\1\130",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\133",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\134",
            "",
            "\1\135",
            "\1\136",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\141",
            "\1\142",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\1\145",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | Var_type | Addop | Mulop | Compop | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | STRINGLITERAL | WS );";
        }
    }
 

}