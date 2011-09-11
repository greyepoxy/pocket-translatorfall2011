// $ANTLR 3.4 C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g 2011-09-11 17:05:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Addop", "COMMENT", "Compop", "FLOATLITERAL", "IDENTIFIER", "INTLITERAL", "Mulop", "Program_start", "STRINGLITERAL", "Var_type", "WS", "'('", "')'", "');'", "','", "':='", "';'", "'BEGIN'", "'DO'", "'ELSE'", "'END'", "'ENDIF'", "'FUNCTION'", "'IF'", "'PROGRAM'", "'READ'", "'RETURN'", "'STRING'", "'THEN'", "'VOID'", "'WHILE'", "'WRITE'"
    };

    public static final int EOF=-1;
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
    public static final int T__35=35;
    public static final int Addop=4;
    public static final int COMMENT=5;
    public static final int Compop=6;
    public static final int FLOATLITERAL=7;
    public static final int IDENTIFIER=8;
    public static final int INTLITERAL=9;
    public static final int Mulop=10;
    public static final int Program_start=11;
    public static final int STRINGLITERAL=12;
    public static final int Var_type=13;
    public static final int WS=14;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public MicroParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return MicroParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g"; }



    // $ANTLR start "program"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:4:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:4:9: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:4:11: 'PROGRAM' id 'BEGIN' pgm_body 'END'
            {
            match(input,28,FOLLOW_28_in_program11); 

            pushFollow(FOLLOW_id_in_program13);
            id();

            state._fsp--;


            match(input,21,FOLLOW_21_in_program15); 

            pushFollow(FOLLOW_pgm_body_in_program17);
            pgm_body();

            state._fsp--;


            match(input,24,FOLLOW_24_in_program19); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "id"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:7:1: id : IDENTIFIER ;
    public final void id() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:7:4: ( IDENTIFIER )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:7:6: IDENTIFIER
            {
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id32); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "id"



    // $ANTLR start "pgm_body"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:10:1: pgm_body : decl_list func_declarations ;
    public final void pgm_body() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:10:10: ( decl_list func_declarations )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:10:12: decl_list func_declarations
            {
            pushFollow(FOLLOW_decl_list_in_pgm_body45);
            decl_list();

            state._fsp--;


            pushFollow(FOLLOW_func_declarations_in_pgm_body47);
            func_declarations();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pgm_body"



    // $ANTLR start "decl_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:13:1: decl_list : ( decl )* ;
    public final void decl_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:14:2: ( ( decl )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:14:4: ( decl )*
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:14:4: ( decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var_type||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:14:4: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_decl_list62);
            	    decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "decl_list"



    // $ANTLR start "decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:17:1: decl : ( string_decl | var_decl );
    public final void decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:17:6: ( string_decl | var_decl )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==Var_type) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:17:8: string_decl
                    {
                    pushFollow(FOLLOW_string_decl_in_decl73);
                    string_decl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:17:23: var_decl
                    {
                    pushFollow(FOLLOW_var_decl_in_decl78);
                    var_decl();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "decl"



    // $ANTLR start "string_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:20:1: string_decl : 'STRING' id ':=' str ';' ;
    public final void string_decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:20:13: ( 'STRING' id ':=' str ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:20:15: 'STRING' id ':=' str ';'
            {
            match(input,31,FOLLOW_31_in_string_decl92); 

            pushFollow(FOLLOW_id_in_string_decl94);
            id();

            state._fsp--;


            match(input,19,FOLLOW_19_in_string_decl96); 

            pushFollow(FOLLOW_str_in_string_decl98);
            str();

            state._fsp--;


            match(input,20,FOLLOW_20_in_string_decl100); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "string_decl"



    // $ANTLR start "str"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:23:1: str : STRINGLITERAL ;
    public final void str() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:23:5: ( STRINGLITERAL )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:23:7: STRINGLITERAL
            {
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_str114); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "str"



    // $ANTLR start "var_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:29:1: var_decl : Var_type id_list ';' ;
    public final void var_decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:29:10: ( Var_type id_list ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:29:12: Var_type id_list ';'
            {
            match(input,Var_type,FOLLOW_Var_type_in_var_decl130); 

            pushFollow(FOLLOW_id_list_in_var_decl132);
            id_list();

            state._fsp--;


            match(input,20,FOLLOW_20_in_var_decl134); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "var_decl"



    // $ANTLR start "any_type"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:35:1: any_type : ( Var_type | 'VOID' );
    public final void any_type() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:35:10: ( Var_type | 'VOID' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:
            {
            if ( input.LA(1)==Var_type||input.LA(1)==33 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "any_type"



    // $ANTLR start "id_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:38:1: id_list : id ( ',' id )* ;
    public final void id_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:38:9: ( id ( ',' id )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:38:11: id ( ',' id )*
            {
            pushFollow(FOLLOW_id_in_id_list182);
            id();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:38:14: ( ',' id )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:38:15: ',' id
            	    {
            	    match(input,18,FOLLOW_18_in_id_list185); 

            	    pushFollow(FOLLOW_id_in_id_list187);
            	    id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "id_list"



    // $ANTLR start "param_decl_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:46:1: param_decl_list : param_decl param_decl_tail ;
    public final void param_decl_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:46:17: ( param_decl param_decl_tail )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:46:19: param_decl param_decl_tail
            {
            pushFollow(FOLLOW_param_decl_in_param_decl_list207);
            param_decl();

            state._fsp--;


            pushFollow(FOLLOW_param_decl_tail_in_param_decl_list209);
            param_decl_tail();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param_decl_list"



    // $ANTLR start "param_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:49:1: param_decl : Var_type id ;
    public final void param_decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:49:12: ( Var_type id )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:49:14: Var_type id
            {
            match(input,Var_type,FOLLOW_Var_type_in_param_decl222); 

            pushFollow(FOLLOW_id_in_param_decl224);
            id();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param_decl"



    // $ANTLR start "param_decl_tail"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:52:1: param_decl_tail : ( ',' param_decl param_decl_tail | WS );
    public final void param_decl_tail() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:52:17: ( ',' param_decl param_decl_tail | WS )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==WS) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:52:19: ',' param_decl param_decl_tail
                    {
                    match(input,18,FOLLOW_18_in_param_decl_tail237); 

                    pushFollow(FOLLOW_param_decl_in_param_decl_tail239);
                    param_decl();

                    state._fsp--;


                    pushFollow(FOLLOW_param_decl_tail_in_param_decl_tail241);
                    param_decl_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:52:52: WS
                    {
                    match(input,WS,FOLLOW_WS_in_param_decl_tail245); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param_decl_tail"



    // $ANTLR start "func_declarations"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:56:1: func_declarations : ( func_decl )* ;
    public final void func_declarations() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:56:19: ( ( func_decl )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:56:21: ( func_decl )*
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:56:21: ( func_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:56:22: func_decl
            	    {
            	    pushFollow(FOLLOW_func_decl_in_func_declarations260);
            	    func_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_declarations"



    // $ANTLR start "func_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:59:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' ;
    public final void func_decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:59:11: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:59:13: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            match(input,26,FOLLOW_26_in_func_decl275); 

            pushFollow(FOLLOW_any_type_in_func_decl277);
            any_type();

            state._fsp--;


            pushFollow(FOLLOW_id_in_func_decl279);
            id();

            state._fsp--;


            match(input,15,FOLLOW_15_in_func_decl281); 

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:59:39: ( param_decl_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Var_type) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:59:39: param_decl_list
                    {
                    pushFollow(FOLLOW_param_decl_list_in_func_decl282);
                    param_decl_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input,16,FOLLOW_16_in_func_decl284); 

            match(input,21,FOLLOW_21_in_func_decl286); 

            pushFollow(FOLLOW_func_body_in_func_decl288);
            func_body();

            state._fsp--;


            match(input,24,FOLLOW_24_in_func_decl290); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_decl"



    // $ANTLR start "func_body"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:62:1: func_body : decl_list stmt_list ;
    public final void func_body() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:62:11: ( decl_list stmt_list )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:62:13: decl_list stmt_list
            {
            pushFollow(FOLLOW_decl_list_in_func_body307);
            decl_list();

            state._fsp--;


            pushFollow(FOLLOW_stmt_list_in_func_body309);
            stmt_list();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_body"



    // $ANTLR start "stmt_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:66:1: stmt_list : ( stmt )* ;
    public final void stmt_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:66:11: ( ( stmt )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:66:13: ( stmt )*
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:66:13: ( stmt )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER||LA7_0==22||LA7_0==27||(LA7_0 >= 29 && LA7_0 <= 30)||LA7_0==35) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:66:14: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmt_list324);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt_list"



    // $ANTLR start "stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:1: stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:6: ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt )
            int alt8=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 35:
                {
                alt8=3;
                }
                break;
            case 30:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            case 22:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:8: assign_stmt
                    {
                    pushFollow(FOLLOW_assign_stmt_in_stmt339);
                    assign_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:22: read_stmt
                    {
                    pushFollow(FOLLOW_read_stmt_in_stmt343);
                    read_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:34: write_stmt
                    {
                    pushFollow(FOLLOW_write_stmt_in_stmt347);
                    write_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:47: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt351);
                    return_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:61: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt355);
                    if_stmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:69:71: do_stmt
                    {
                    pushFollow(FOLLOW_do_stmt_in_stmt359);
                    do_stmt();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "assign_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:73:1: assign_stmt : assign_expr ';' ;
    public final void assign_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:73:13: ( assign_expr ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:73:15: assign_expr ';'
            {
            pushFollow(FOLLOW_assign_expr_in_assign_stmt373);
            assign_expr();

            state._fsp--;


            match(input,20,FOLLOW_20_in_assign_stmt375); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign_stmt"



    // $ANTLR start "assign_expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:76:1: assign_expr : id ':=' expr ;
    public final void assign_expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:76:13: ( id ':=' expr )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:76:15: id ':=' expr
            {
            pushFollow(FOLLOW_id_in_assign_expr388);
            id();

            state._fsp--;


            match(input,19,FOLLOW_19_in_assign_expr390); 

            pushFollow(FOLLOW_expr_in_assign_expr392);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign_expr"



    // $ANTLR start "read_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:79:1: read_stmt : 'READ' '(' id_list ');' ;
    public final void read_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:79:11: ( 'READ' '(' id_list ');' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:79:13: 'READ' '(' id_list ');'
            {
            match(input,29,FOLLOW_29_in_read_stmt405); 

            match(input,15,FOLLOW_15_in_read_stmt407); 

            pushFollow(FOLLOW_id_list_in_read_stmt409);
            id_list();

            state._fsp--;


            match(input,17,FOLLOW_17_in_read_stmt411); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "read_stmt"



    // $ANTLR start "write_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:82:1: write_stmt : 'WRITE' '(' id_list ');' ;
    public final void write_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:82:12: ( 'WRITE' '(' id_list ');' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:82:14: 'WRITE' '(' id_list ');'
            {
            match(input,35,FOLLOW_35_in_write_stmt424); 

            match(input,15,FOLLOW_15_in_write_stmt426); 

            pushFollow(FOLLOW_id_list_in_write_stmt428);
            id_list();

            state._fsp--;


            match(input,17,FOLLOW_17_in_write_stmt430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "write_stmt"



    // $ANTLR start "return_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:85:1: return_stmt : 'RETURN' expr ';' ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:85:13: ( 'RETURN' expr ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:85:15: 'RETURN' expr ';'
            {
            match(input,30,FOLLOW_30_in_return_stmt443); 

            pushFollow(FOLLOW_expr_in_return_stmt445);
            expr();

            state._fsp--;


            match(input,20,FOLLOW_20_in_return_stmt447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "return_stmt"



    // $ANTLR start "expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:89:1: expr : factor ( Addop factor )* ;
    public final void expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:89:6: ( factor ( Addop factor )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:89:8: factor ( Addop factor )*
            {
            pushFollow(FOLLOW_factor_in_expr461);
            factor();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:89:16: ( Addop factor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Addop) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:89:17: Addop factor
            	    {
            	    match(input,Addop,FOLLOW_Addop_in_expr465); 

            	    pushFollow(FOLLOW_factor_in_expr467);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "factor"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:92:1: factor : postfix_expr ( Mulop postfix_expr )* ;
    public final void factor() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:92:8: ( postfix_expr ( Mulop postfix_expr )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:92:10: postfix_expr ( Mulop postfix_expr )*
            {
            pushFollow(FOLLOW_postfix_expr_in_factor483);
            postfix_expr();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:92:23: ( Mulop postfix_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Mulop) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:92:24: Mulop postfix_expr
            	    {
            	    match(input,Mulop,FOLLOW_Mulop_in_factor486); 

            	    pushFollow(FOLLOW_postfix_expr_in_factor488);
            	    postfix_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "postfix_expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:95:1: postfix_expr : ( primary | call_expr );
    public final void postfix_expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:95:14: ( primary | call_expr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==FLOATLITERAL||LA11_0==INTLITERAL||LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==Addop||LA11_2==Compop||LA11_2==Mulop||LA11_2==WS||(LA11_2 >= 16 && LA11_2 <= 18)||LA11_2==20||LA11_2==32) ) {
                    alt11=1;
                }
                else if ( (LA11_2==15) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:95:16: primary
                    {
                    pushFollow(FOLLOW_primary_in_postfix_expr503);
                    primary();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:95:26: call_expr
                    {
                    pushFollow(FOLLOW_call_expr_in_postfix_expr507);
                    call_expr();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "postfix_expr"



    // $ANTLR start "call_expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:98:1: call_expr : id '(' ( expr_list )? ')' ;
    public final void call_expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:98:11: ( id '(' ( expr_list )? ')' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:98:13: id '(' ( expr_list )? ')'
            {
            pushFollow(FOLLOW_id_in_call_expr520);
            id();

            state._fsp--;


            match(input,15,FOLLOW_15_in_call_expr522); 

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:98:19: ( expr_list )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= FLOATLITERAL && LA12_0 <= INTLITERAL)||LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:98:19: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_call_expr523);
                    expr_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input,16,FOLLOW_16_in_call_expr526); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "call_expr"



    // $ANTLR start "expr_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:101:1: expr_list : expr expr_list_tail ;
    public final void expr_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:101:11: ( expr expr_list_tail )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:101:13: expr expr_list_tail
            {
            pushFollow(FOLLOW_expr_in_expr_list539);
            expr();

            state._fsp--;


            pushFollow(FOLLOW_expr_list_tail_in_expr_list541);
            expr_list_tail();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr_list"



    // $ANTLR start "expr_list_tail"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:104:1: expr_list_tail : ( ',' expr expr_list_tail | WS );
    public final void expr_list_tail() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:104:16: ( ',' expr expr_list_tail | WS )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==WS) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:104:18: ',' expr expr_list_tail
                    {
                    match(input,18,FOLLOW_18_in_expr_list_tail554); 

                    pushFollow(FOLLOW_expr_in_expr_list_tail556);
                    expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail558);
                    expr_list_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:104:44: WS
                    {
                    match(input,WS,FOLLOW_WS_in_expr_list_tail562); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr_list_tail"



    // $ANTLR start "primary"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:107:1: primary : ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL );
    public final void primary() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:107:9: ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt14=1;
                }
                break;
            case IDENTIFIER:
                {
                alt14=2;
                }
                break;
            case INTLITERAL:
                {
                alt14=3;
                }
                break;
            case FLOATLITERAL:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:107:11: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_primary575); 

                    pushFollow(FOLLOW_expr_in_primary576);
                    expr();

                    state._fsp--;


                    match(input,16,FOLLOW_16_in_primary577); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:107:24: id
                    {
                    pushFollow(FOLLOW_id_in_primary581);
                    id();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:107:29: INTLITERAL
                    {
                    match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary585); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:107:42: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary589); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primary"



    // $ANTLR start "if_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:117:1: if_stmt : 'IF' ( cond ) 'THEN' stmt_list else_part 'ENDIF' ;
    public final void if_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:117:9: ( 'IF' ( cond ) 'THEN' stmt_list else_part 'ENDIF' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:117:11: 'IF' ( cond ) 'THEN' stmt_list else_part 'ENDIF'
            {
            match(input,27,FOLLOW_27_in_if_stmt637); 

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:117:16: ( cond )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:117:18: cond
            {
            pushFollow(FOLLOW_cond_in_if_stmt641);
            cond();

            state._fsp--;


            }


            match(input,32,FOLLOW_32_in_if_stmt645); 

            pushFollow(FOLLOW_stmt_list_in_if_stmt647);
            stmt_list();

            state._fsp--;


            pushFollow(FOLLOW_else_part_in_if_stmt649);
            else_part();

            state._fsp--;


            match(input,25,FOLLOW_25_in_if_stmt651); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "if_stmt"



    // $ANTLR start "else_part"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:120:1: else_part : ( 'ELSE' stmt_list | WS );
    public final void else_part() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:120:11: ( 'ELSE' stmt_list | WS )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==23) ) {
                alt15=1;
            }
            else if ( (LA15_0==WS) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:120:13: 'ELSE' stmt_list
                    {
                    match(input,23,FOLLOW_23_in_else_part664); 

                    pushFollow(FOLLOW_stmt_list_in_else_part666);
                    stmt_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:120:32: WS
                    {
                    match(input,WS,FOLLOW_WS_in_else_part670); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "else_part"



    // $ANTLR start "cond"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:123:1: cond : expr Compop expr ;
    public final void cond() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:123:6: ( expr Compop expr )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:123:8: expr Compop expr
            {
            pushFollow(FOLLOW_expr_in_cond683);
            expr();

            state._fsp--;


            match(input,Compop,FOLLOW_Compop_in_cond685); 

            pushFollow(FOLLOW_expr_in_cond687);
            expr();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cond"



    // $ANTLR start "do_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:129:1: do_stmt : 'DO' stmt_list 'WHILE' '(' cond ');' ;
    public final void do_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:129:9: ( 'DO' stmt_list 'WHILE' '(' cond ');' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator\\src\\MicroParser.g:129:11: 'DO' stmt_list 'WHILE' '(' cond ');'
            {
            match(input,22,FOLLOW_22_in_do_stmt725); 

            pushFollow(FOLLOW_stmt_list_in_do_stmt727);
            stmt_list();

            state._fsp--;


            match(input,34,FOLLOW_34_in_do_stmt729); 

            match(input,15,FOLLOW_15_in_do_stmt731); 

            pushFollow(FOLLOW_cond_in_do_stmt733);
            cond();

            state._fsp--;


            match(input,17,FOLLOW_17_in_do_stmt735); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "do_stmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_28_in_program11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_program13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_program15 = new BitSet(new long[]{0x0000000084002000L});
    public static final BitSet FOLLOW_pgm_body_in_program17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_program19 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_pgm_body45 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decl_list62 = new BitSet(new long[]{0x0000000080002002L});
    public static final BitSet FOLLOW_string_decl_in_decl73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_string_decl92 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_string_decl94 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_string_decl96 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_str_in_string_decl98 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_string_decl100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_str114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_var_decl130 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_var_decl132 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_var_decl134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list182 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_id_list185 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_id_list187 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list207 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_param_decl_tail_in_param_decl_list209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_param_decl222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_param_decl224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_param_decl_tail237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_tail239 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_param_decl_tail_in_param_decl_tail241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_param_decl_tail245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations260 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_func_decl275 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_any_type_in_func_decl277 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_func_decl279 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_func_decl281 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl282 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_func_decl284 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_func_decl286 = new BitSet(new long[]{0x00000008E8402100L});
    public static final BitSet FOLLOW_func_body_in_func_decl288 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_func_decl290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_func_body307 = new BitSet(new long[]{0x0000000868400100L});
    public static final BitSet FOLLOW_stmt_list_in_func_body309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list324 = new BitSet(new long[]{0x0000000868400102L});
    public static final BitSet FOLLOW_assign_stmt_in_stmt339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_stmt343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_stmt347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_stmt_in_stmt359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt373 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_assign_stmt375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assign_expr390 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_assign_expr392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_read_stmt405 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_read_stmt407 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_read_stmt409 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_read_stmt411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_write_stmt424 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_write_stmt426 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_write_stmt428 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_write_stmt430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_return_stmt443 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_return_stmt445 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_return_stmt447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr461 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Addop_in_expr465 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_factor_in_expr467 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_postfix_expr_in_factor483 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Mulop_in_factor486 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_postfix_expr_in_factor488 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_primary_in_postfix_expr503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr520 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_call_expr522 = new BitSet(new long[]{0x0000000000018380L});
    public static final BitSet FOLLOW_expr_list_in_call_expr523 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_call_expr526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list539 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_expr_list_tail_in_expr_list541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expr_list_tail554 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_expr_list_tail556 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_expr_list_tail562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_primary575 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_primary576 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_primary577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_if_stmt637 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_cond_in_if_stmt641 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_if_stmt645 = new BitSet(new long[]{0x0000000868C04100L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt647 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt649 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_if_stmt651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_else_part664 = new BitSet(new long[]{0x0000000868400100L});
    public static final BitSet FOLLOW_stmt_list_in_else_part666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_else_part670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Compop_in_cond685 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_cond687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_do_stmt725 = new BitSet(new long[]{0x0000000C68400100L});
    public static final BitSet FOLLOW_stmt_list_in_do_stmt727 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_do_stmt729 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_do_stmt731 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_cond_in_do_stmt733 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_do_stmt735 = new BitSet(new long[]{0x0000000000000002L});

}