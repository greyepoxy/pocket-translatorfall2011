// $ANTLR 3.4 C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g 2011-08-27 18:58:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroLexer extends Lexer {
    public static final int EOF=-1;
    public static final int COMMENT=4;
    public static final int FLOATLITERAL=5;
    public static final int IDENTIFIER=6;
    public static final int INTLITERAL=7;
    public static final int KEYWORD=8;
    public static final int OPERATOR=9;
    public static final int STRINGLITERAL=10;
    public static final int WS=11;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MicroLexer() {} 
    public MicroLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g"; }

    // $ANTLR start "KEYWORD"
    public final void mKEYWORD() throws RecognitionException {
        try {
            int _type = KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:4: ( ( 'PROGRAM' | 'BEGIN' | 'END' | 'PROTO' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'THEN' | 'ELSE' | 'ENDIF' | 'RETURN' | 'CASE' | 'ENDCASE' | 'BREAK' | 'DEFAULT' | 'DO' | 'WHILE' | 'FLOAT' | 'INT' | 'VOID' | 'STRING' ) )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:7: ( 'PROGRAM' | 'BEGIN' | 'END' | 'PROTO' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'THEN' | 'ELSE' | 'ENDIF' | 'RETURN' | 'CASE' | 'ENDCASE' | 'BREAK' | 'DEFAULT' | 'DO' | 'WHILE' | 'FLOAT' | 'INT' | 'VOID' | 'STRING' )
            {
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:7: ( 'PROGRAM' | 'BEGIN' | 'END' | 'PROTO' | 'FUNCTION' | 'READ' | 'WRITE' | 'IF' | 'THEN' | 'ELSE' | 'ENDIF' | 'RETURN' | 'CASE' | 'ENDCASE' | 'BREAK' | 'DEFAULT' | 'DO' | 'WHILE' | 'FLOAT' | 'INT' | 'VOID' | 'STRING' )
            int alt1=22;
            switch ( input.LA(1) ) {
            case 'P':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='R') ) {
                    int LA1_13 = input.LA(3);

                    if ( (LA1_13=='O') ) {
                        int LA1_27 = input.LA(4);

                        if ( (LA1_27=='G') ) {
                            alt1=1;
                        }
                        else if ( (LA1_27=='T') ) {
                            alt1=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 27, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 13, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
                }
                break;
            case 'B':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='E') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='R') ) {
                    alt1=15;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }
                }
                break;
            case 'E':
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3=='N') ) {
                    int LA1_16 = input.LA(3);

                    if ( (LA1_16=='D') ) {
                        switch ( input.LA(4) ) {
                        case 'I':
                            {
                            alt1=11;
                            }
                            break;
                        case 'C':
                            {
                            alt1=14;
                            }
                            break;
                        default:
                            alt1=3;
                        }

                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 16, input);

                        throw nvae;

                    }
                }
                else if ( (LA1_3=='L') ) {
                    alt1=10;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }
                }
                break;
            case 'F':
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4=='U') ) {
                    alt1=5;
                }
                else if ( (LA1_4=='L') ) {
                    alt1=19;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;

                }
                }
                break;
            case 'R':
                {
                int LA1_5 = input.LA(2);

                if ( (LA1_5=='E') ) {
                    int LA1_20 = input.LA(3);

                    if ( (LA1_20=='A') ) {
                        alt1=6;
                    }
                    else if ( (LA1_20=='T') ) {
                        alt1=12;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 20, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;

                }
                }
                break;
            case 'W':
                {
                int LA1_6 = input.LA(2);

                if ( (LA1_6=='R') ) {
                    alt1=7;
                }
                else if ( (LA1_6=='H') ) {
                    alt1=18;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;

                }
                }
                break;
            case 'I':
                {
                int LA1_7 = input.LA(2);

                if ( (LA1_7=='F') ) {
                    alt1=8;
                }
                else if ( (LA1_7=='N') ) {
                    alt1=20;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 7, input);

                    throw nvae;

                }
                }
                break;
            case 'T':
                {
                alt1=9;
                }
                break;
            case 'C':
                {
                alt1=13;
                }
                break;
            case 'D':
                {
                int LA1_10 = input.LA(2);

                if ( (LA1_10=='E') ) {
                    alt1=16;
                }
                else if ( (LA1_10=='O') ) {
                    alt1=17;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 10, input);

                    throw nvae;

                }
                }
                break;
            case 'V':
                {
                alt1=21;
                }
                break;
            case 'S':
                {
                alt1=22;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:8: 'PROGRAM'
                    {
                    match("PROGRAM"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:20: 'BEGIN'
                    {
                    match("BEGIN"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:30: 'END'
                    {
                    match("END"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:38: 'PROTO'
                    {
                    match("PROTO"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:48: 'FUNCTION'
                    {
                    match("FUNCTION"); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:61: 'READ'
                    {
                    match("READ"); 



                    }
                    break;
                case 7 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:4:70: 'WRITE'
                    {
                    match("WRITE"); 



                    }
                    break;
                case 8 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:4: 'IF'
                    {
                    match("IF"); 



                    }
                    break;
                case 9 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:11: 'THEN'
                    {
                    match("THEN"); 



                    }
                    break;
                case 10 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:20: 'ELSE'
                    {
                    match("ELSE"); 



                    }
                    break;
                case 11 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:29: 'ENDIF'
                    {
                    match("ENDIF"); 



                    }
                    break;
                case 12 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:39: 'RETURN'
                    {
                    match("RETURN"); 



                    }
                    break;
                case 13 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:50: 'CASE'
                    {
                    match("CASE"); 



                    }
                    break;
                case 14 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:59: 'ENDCASE'
                    {
                    match("ENDCASE"); 



                    }
                    break;
                case 15 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:5:71: 'BREAK'
                    {
                    match("BREAK"); 



                    }
                    break;
                case 16 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:4: 'DEFAULT'
                    {
                    match("DEFAULT"); 



                    }
                    break;
                case 17 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:16: 'DO'
                    {
                    match("DO"); 



                    }
                    break;
                case 18 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:23: 'WHILE'
                    {
                    match("WHILE"); 



                    }
                    break;
                case 19 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:33: 'FLOAT'
                    {
                    match("FLOAT"); 



                    }
                    break;
                case 20 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:43: 'INT'
                    {
                    match("INT"); 



                    }
                    break;
                case 21 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:51: 'VOID'
                    {
                    match("VOID"); 



                    }
                    break;
                case 22 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:6:60: 'STRING'
                    {
                    match("STRING"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEYWORD"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:9:13: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:9:15: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:9:39: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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
            	    break loop2;
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
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:12:12: ( ( '0' .. '9' )+ )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:12:14: ( '0' .. '9' )+
            {
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:12:14: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:16:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else if ( (LA7_0=='.') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:16:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:16:9: ( '0' .. '9' )+
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
                    	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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


                    match('.'); 

                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:16:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:17:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:17:13: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
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
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:21:5: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:21:9: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("--"); 



            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:21:14: (~ ( '\\n' | '\\r' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\u0000' && LA8_0 <= '\t')||(LA8_0 >= '\u000B' && LA8_0 <= '\f')||(LA8_0 >= '\u000E' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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
            	    break loop8;
                }
            } while (true);


            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:21:28: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:21:28: '\\r'
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

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:4: ( ( ':=' | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '(' | ')' | ';' | ',' ) )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:7: ( ':=' | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '(' | ')' | ';' | ',' )
            {
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:7: ( ':=' | '+' | '-' | '*' | '/' | '=' | '<' | '>' | '(' | ')' | ';' | ',' )
            int alt10=12;
            switch ( input.LA(1) ) {
            case ':':
                {
                alt10=1;
                }
                break;
            case '+':
                {
                alt10=2;
                }
                break;
            case '-':
                {
                alt10=3;
                }
                break;
            case '*':
                {
                alt10=4;
                }
                break;
            case '/':
                {
                alt10=5;
                }
                break;
            case '=':
                {
                alt10=6;
                }
                break;
            case '<':
                {
                alt10=7;
                }
                break;
            case '>':
                {
                alt10=8;
                }
                break;
            case '(':
                {
                alt10=9;
                }
                break;
            case ')':
                {
                alt10=10;
                }
                break;
            case ';':
                {
                alt10=11;
                }
                break;
            case ',':
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:8: ':='
                    {
                    match(":="); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:13: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:17: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:21: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:25: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:29: '='
                    {
                    match('='); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:33: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:37: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 9 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:41: '('
                    {
                    match('('); 

                    }
                    break;
                case 10 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:45: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 11 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:49: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 12 :
                    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:25:53: ','
                    {
                    match(','); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "STRINGLITERAL"
    public final void mSTRINGLITERAL() throws RecognitionException {
        try {
            int _type = STRINGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:29:5: ( '\"' (~ ( '\"' ) )* '\"' )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:29:8: '\"' (~ ( '\"' ) )* '\"'
            {
            match('\"'); 

            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:29:12: (~ ( '\"' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:
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
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:32:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:32:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:8: ( KEYWORD | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | OPERATOR | STRINGLITERAL | WS )
        int alt12=8;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:10: KEYWORD
                {
                mKEYWORD(); 


                }
                break;
            case 2 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:18: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 3 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:29: INTLITERAL
                {
                mINTLITERAL(); 


                }
                break;
            case 4 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:40: FLOATLITERAL
                {
                mFLOATLITERAL(); 


                }
                break;
            case 5 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:53: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 6 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:61: OPERATOR
                {
                mOPERATOR(); 


                }
                break;
            case 7 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:70: STRINGLITERAL
                {
                mSTRINGLITERAL(); 


                }
                break;
            case 8 :
                // C:\\Users\\Brian Bowman\\Documents\\Compiler\\antlrtemplate\\MicroParser.g:1:84: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\14\15\1\uffff\1\46\1\uffff\1\21\3\uffff\12\15\1\63\4\15"+
        "\1\63\2\15\2\uffff\3\15\1\63\7\15\1\uffff\1\63\13\15\1\63\2\15\1"+
        "\63\3\15\2\63\1\15\1\63\2\15\4\63\2\15\1\63\1\15\2\63\5\15\1\63"+
        "\1\15\3\63\1\15\2\63";
    static final String DFA12_eofS =
        "\144\uffff";
    static final String DFA12_minS =
        "\1\11\1\122\1\105\2\114\1\105\1\110\1\106\1\110\1\101\1\105\1\117"+
        "\1\124\1\uffff\1\56\1\uffff\1\55\3\uffff\1\117\1\107\1\105\1\104"+
        "\1\123\1\116\1\117\1\101\2\111\1\60\1\124\1\105\1\123\1\106\1\60"+
        "\1\111\1\122\2\uffff\1\107\1\111\1\101\1\60\1\105\1\103\1\101\1"+
        "\104\1\125\1\124\1\114\1\uffff\1\60\1\116\1\105\1\101\1\104\1\111"+
        "\1\122\1\117\1\116\1\113\1\106\1\101\1\60\2\124\1\60\1\122\2\105"+
        "\2\60\1\125\1\60\1\116\1\101\4\60\1\123\1\111\1\60\1\116\2\60\1"+
        "\114\1\107\1\115\1\105\1\117\1\60\1\124\3\60\1\116\2\60";
    static final String DFA12_maxS =
        "\1\172\2\122\1\116\1\125\1\105\1\122\1\116\1\110\1\101\2\117\1\124"+
        "\1\uffff\1\71\1\uffff\1\55\3\uffff\1\117\1\107\1\105\1\104\1\123"+
        "\1\116\1\117\1\124\2\111\1\172\1\124\1\105\1\123\1\106\1\172\1\111"+
        "\1\122\2\uffff\1\124\1\111\1\101\1\172\1\105\1\103\1\101\1\104\1"+
        "\125\1\124\1\114\1\uffff\1\172\1\116\1\105\1\101\1\104\1\111\1\122"+
        "\1\117\1\116\1\113\1\106\1\101\1\172\2\124\1\172\1\122\2\105\2\172"+
        "\1\125\1\172\1\116\1\101\4\172\1\123\1\111\1\172\1\116\2\172\1\114"+
        "\1\107\1\115\1\105\1\117\1\172\1\124\3\172\1\116\2\172";
    static final String DFA12_acceptS =
        "\15\uffff\1\2\1\uffff\1\4\1\uffff\1\6\1\7\1\10\22\uffff\1\3\1\5"+
        "\13\uffff\1\1\60\uffff";
    static final String DFA12_specialS =
        "\144\uffff}>";
    static final String[] DFA12_transitionS = {
            "\2\23\2\uffff\1\23\22\uffff\1\23\1\uffff\1\22\5\uffff\5\21\1"+
            "\20\1\17\1\21\12\16\5\21\2\uffff\1\15\1\2\1\11\1\12\1\3\1\4"+
            "\2\15\1\7\6\15\1\1\1\15\1\5\1\14\1\10\1\15\1\13\1\6\3\15\4\uffff"+
            "\1\15\1\uffff\32\15",
            "\1\24",
            "\1\25\14\uffff\1\26",
            "\1\30\1\uffff\1\27",
            "\1\32\10\uffff\1\31",
            "\1\33",
            "\1\35\11\uffff\1\34",
            "\1\36\7\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42\11\uffff\1\43",
            "\1\44",
            "\1\45",
            "",
            "\1\17\1\uffff\12\16",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\22\uffff\1\60",
            "\1\61",
            "\1\62",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72\14\uffff\1\73",
            "\1\74",
            "\1\75",
            "\12\15\7\uffff\2\15\1\77\5\15\1\76\21\15\4\uffff\1\15\1\uffff"+
            "\32\15",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\122",
            "\1\123",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\124",
            "\1\125",
            "\1\126",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\127",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\130",
            "\1\131",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\132",
            "\1\133",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\134",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\142",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\1\143",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15",
            "\12\15\7\uffff\32\15\4\uffff\1\15\1\uffff\32\15"
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
            return "1:1: Tokens : ( KEYWORD | IDENTIFIER | INTLITERAL | FLOATLITERAL | COMMENT | OPERATOR | STRINGLITERAL | WS );";
        }
    }
 

}