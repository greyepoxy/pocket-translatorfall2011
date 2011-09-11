// $ANTLR 3.4 /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g 2011-09-11 15:38:50

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Addop", "COMMENT", "Compop", "FLOATLITERAL", "IDENTIFIER", "INTLITERAL", "Mulop", "STRINGLITERAL", "Var_type", "WS", "'('", "')'", "');'", "','", "':='", "';'", "'BEGIN'", "'DO'", "'ELSE'", "'END'", "'ENDIF'", "'FUNCTION'", "'IF'", "'PROGRAM'", "'READ'", "'RETURN'", "'STRING'", "'THEN'", "'VOID'", "'WHILE'", "'WRITE'"
    };

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
    public String getGrammarFileName() { return "/home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g"; }



    // $ANTLR start "program"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' ;
    public final void program() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:9: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:11: 'PROGRAM' id 'BEGIN' pgm_body 'END'
            {
            match(input,27,FOLLOW_27_in_program11); 

            pushFollow(FOLLOW_id_in_program13);
            id();

            state._fsp--;


            match(input,20,FOLLOW_20_in_program15); 

            pushFollow(FOLLOW_pgm_body_in_program17);
            pgm_body();

            state._fsp--;


            match(input,23,FOLLOW_23_in_program19); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:1: id : IDENTIFIER ;
    public final void id() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:4: ( IDENTIFIER )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:6: IDENTIFIER
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:1: pgm_body : decl func_declarations ;
    public final void pgm_body() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:10: ( decl func_declarations )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:12: decl func_declarations
            {
            pushFollow(FOLLOW_decl_in_pgm_body45);
            decl();

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:13:1: decl_list : ( decl )+ ;
    public final void decl_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:2: ( ( decl )+ )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:4: ( decl )+
            {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:4: ( decl )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var_type||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:4: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_decl_list62);
            	    decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:1: decl : ( string_decl_list | var_decl_list );
    public final void decl() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:6: ( string_decl_list | var_decl_list )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
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
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:8: string_decl_list
                    {
                    pushFollow(FOLLOW_string_decl_list_in_decl73);
                    string_decl_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:28: var_decl_list
                    {
                    pushFollow(FOLLOW_var_decl_list_in_decl78);
                    var_decl_list();

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



    // $ANTLR start "string_decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:1: string_decl_list : ( string_decl )+ ;
    public final void string_decl_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:18: ( ( string_decl )+ )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:20: ( string_decl )+
            {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:20: ( string_decl )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:21:20: string_decl
            	    {
            	    pushFollow(FOLLOW_string_decl_in_string_decl_list93);
            	    string_decl();

            	    state._fsp--;


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
    // $ANTLR end "string_decl_list"



    // $ANTLR start "string_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:24:1: string_decl : 'STRING' id ':=' str ';' ;
    public final void string_decl() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:24:13: ( 'STRING' id ':=' str ';' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:24:15: 'STRING' id ':=' str ';'
            {
            match(input,30,FOLLOW_30_in_string_decl108); 

            pushFollow(FOLLOW_id_in_string_decl110);
            id();

            state._fsp--;


            match(input,18,FOLLOW_18_in_string_decl112); 

            pushFollow(FOLLOW_str_in_string_decl114);
            str();

            state._fsp--;


            match(input,19,FOLLOW_19_in_string_decl116); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:27:1: str : STRINGLITERAL ;
    public final void str() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:27:5: ( STRINGLITERAL )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:27:7: STRINGLITERAL
            {
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_str130); 

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



    // $ANTLR start "var_decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:34:1: var_decl_list : ( var_decl )+ ;
    public final void var_decl_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:34:15: ( ( var_decl )+ )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:34:17: ( var_decl )+
            {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:34:17: ( var_decl )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Var_type) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:34:17: var_decl
            	    {
            	    pushFollow(FOLLOW_var_decl_in_var_decl_list147);
            	    var_decl();

            	    state._fsp--;


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
    // $ANTLR end "var_decl_list"



    // $ANTLR start "var_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:37:1: var_decl : Var_type id_list ';' ;
    public final void var_decl() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:37:10: ( Var_type id_list ';' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:37:12: Var_type id_list ';'
            {
            match(input,Var_type,FOLLOW_Var_type_in_var_decl162); 

            pushFollow(FOLLOW_id_list_in_var_decl164);
            id_list();

            state._fsp--;


            match(input,19,FOLLOW_19_in_var_decl166); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:43:1: any_type : ( Var_type | 'VOID' );
    public final void any_type() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:43:10: ( Var_type | 'VOID' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
            {
            if ( input.LA(1)==Var_type||input.LA(1)==32 ) {
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:1: id_list : id id_tail ;
    public final void id_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:9: ( id id_tail )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:11: id id_tail
            {
            pushFollow(FOLLOW_id_in_id_list214);
            id();

            state._fsp--;


            pushFollow(FOLLOW_id_tail_in_id_list216);
            id_tail();

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
    // $ANTLR end "id_list"



    // $ANTLR start "id_tail"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:1: id_tail : ( ',' id id_tail | WS );
    public final void id_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:9: ( ',' id id_tail | WS )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==WS) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:11: ',' id id_tail
                    {
                    match(input,17,FOLLOW_17_in_id_tail229); 

                    pushFollow(FOLLOW_id_in_id_tail231);
                    id();

                    state._fsp--;


                    pushFollow(FOLLOW_id_tail_in_id_tail233);
                    id_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:28: WS
                    {
                    match(input,WS,FOLLOW_WS_in_id_tail237); 

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
    // $ANTLR end "id_tail"



    // $ANTLR start "param_decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:1: param_decl_list : param_decl param_decl_tail ;
    public final void param_decl_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:17: ( param_decl param_decl_tail )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:19: param_decl param_decl_tail
            {
            pushFollow(FOLLOW_param_decl_in_param_decl_list254);
            param_decl();

            state._fsp--;


            pushFollow(FOLLOW_param_decl_tail_in_param_decl_list256);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:59:1: param_decl : Var_type id ;
    public final void param_decl() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:59:12: ( Var_type id )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:59:14: Var_type id
            {
            match(input,Var_type,FOLLOW_Var_type_in_param_decl269); 

            pushFollow(FOLLOW_id_in_param_decl271);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:62:1: param_decl_tail : ( ',' param_decl param_decl_tail | WS );
    public final void param_decl_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:62:17: ( ',' param_decl param_decl_tail | WS )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==WS) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:62:19: ',' param_decl param_decl_tail
                    {
                    match(input,17,FOLLOW_17_in_param_decl_tail284); 

                    pushFollow(FOLLOW_param_decl_in_param_decl_tail286);
                    param_decl();

                    state._fsp--;


                    pushFollow(FOLLOW_param_decl_tail_in_param_decl_tail288);
                    param_decl_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:62:52: WS
                    {
                    match(input,WS,FOLLOW_WS_in_param_decl_tail292); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:1: func_declarations : func_decl ( func_decl_tail )? ;
    public final void func_declarations() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:19: ( func_decl ( func_decl_tail )? )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:21: func_decl ( func_decl_tail )?
            {
            pushFollow(FOLLOW_func_decl_in_func_declarations306);
            func_decl();

            state._fsp--;


            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:31: ( func_decl_tail )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==WS||LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:31: func_decl_tail
                    {
                    pushFollow(FOLLOW_func_decl_tail_in_func_declarations308);
                    func_decl_tail();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "func_declarations"



    // $ANTLR start "func_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:69:1: func_decl : ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' | WS );
    public final void func_decl() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:69:11: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' | WS )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==WS) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:69:13: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
                    {
                    match(input,25,FOLLOW_25_in_func_decl322); 

                    pushFollow(FOLLOW_any_type_in_func_decl324);
                    any_type();

                    state._fsp--;


                    pushFollow(FOLLOW_id_in_func_decl326);
                    id();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_func_decl328); 

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:69:39: ( param_decl_list )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Var_type) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:69:39: param_decl_list
                            {
                            pushFollow(FOLLOW_param_decl_list_in_func_decl329);
                            param_decl_list();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input,15,FOLLOW_15_in_func_decl331); 

                    match(input,20,FOLLOW_20_in_func_decl333); 

                    pushFollow(FOLLOW_func_body_in_func_decl335);
                    func_body();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_func_decl337); 

                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:69:85: WS
                    {
                    match(input,WS,FOLLOW_WS_in_func_decl341); 

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
    // $ANTLR end "func_decl"



    // $ANTLR start "func_decl_tail"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:72:1: func_decl_tail : func_decl ( func_decl_tail )? ;
    public final void func_decl_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:72:16: ( func_decl ( func_decl_tail )? )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:72:18: func_decl ( func_decl_tail )?
            {
            pushFollow(FOLLOW_func_decl_in_func_decl_tail354);
            func_decl();

            state._fsp--;


            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:72:28: ( func_decl_tail )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==WS||LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:72:28: func_decl_tail
                    {
                    pushFollow(FOLLOW_func_decl_tail_in_func_decl_tail356);
                    func_decl_tail();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "func_decl_tail"



    // $ANTLR start "func_body"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:75:1: func_body : decl stmt_list ;
    public final void func_body() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:75:11: ( decl stmt_list )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:75:13: decl stmt_list
            {
            pushFollow(FOLLOW_decl_in_func_body370);
            decl();

            state._fsp--;


            pushFollow(FOLLOW_stmt_list_in_func_body372);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:1: stmt_list : ( stmt stmt_tail | WS );
    public final void stmt_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:11: ( stmt stmt_tail | WS )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENTIFIER||LA11_0==21||LA11_0==26||(LA11_0 >= 28 && LA11_0 <= 29)||LA11_0==34) ) {
                alt11=1;
            }
            else if ( (LA11_0==WS) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:13: stmt stmt_tail
                    {
                    pushFollow(FOLLOW_stmt_in_stmt_list386);
                    stmt();

                    state._fsp--;


                    pushFollow(FOLLOW_stmt_tail_in_stmt_list388);
                    stmt_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:30: WS
                    {
                    match(input,WS,FOLLOW_WS_in_stmt_list392); 

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
    // $ANTLR end "stmt_list"



    // $ANTLR start "stmt_tail"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:1: stmt_tail : ( stmt stmt_tail | WS );
    public final void stmt_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:11: ( stmt stmt_tail | WS )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IDENTIFIER||LA12_0==21||LA12_0==26||(LA12_0 >= 28 && LA12_0 <= 29)||LA12_0==34) ) {
                alt12=1;
            }
            else if ( (LA12_0==WS) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:13: stmt stmt_tail
                    {
                    pushFollow(FOLLOW_stmt_in_stmt_tail405);
                    stmt();

                    state._fsp--;


                    pushFollow(FOLLOW_stmt_tail_in_stmt_tail407);
                    stmt_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:30: WS
                    {
                    match(input,WS,FOLLOW_WS_in_stmt_tail411); 

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
    // $ANTLR end "stmt_tail"



    // $ANTLR start "stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:1: stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:6: ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt )
            int alt13=6;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            case 26:
                {
                alt13=5;
                }
                break;
            case 21:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:8: assign_stmt
                    {
                    pushFollow(FOLLOW_assign_stmt_in_stmt424);
                    assign_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:22: read_stmt
                    {
                    pushFollow(FOLLOW_read_stmt_in_stmt428);
                    read_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:34: write_stmt
                    {
                    pushFollow(FOLLOW_write_stmt_in_stmt432);
                    write_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:47: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt436);
                    return_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:61: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt440);
                    if_stmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:85:71: do_stmt
                    {
                    pushFollow(FOLLOW_do_stmt_in_stmt444);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:1: assign_stmt : assign_expr ';' ;
    public final void assign_stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:13: ( assign_expr ';' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:15: assign_expr ';'
            {
            pushFollow(FOLLOW_assign_expr_in_assign_stmt458);
            assign_expr();

            state._fsp--;


            match(input,19,FOLLOW_19_in_assign_stmt460); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:1: assign_expr : id ':=' expr ;
    public final void assign_expr() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:13: ( id ':=' expr )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:15: id ':=' expr
            {
            pushFollow(FOLLOW_id_in_assign_expr473);
            id();

            state._fsp--;


            match(input,18,FOLLOW_18_in_assign_expr475); 

            pushFollow(FOLLOW_expr_in_assign_expr477);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:1: read_stmt : 'READ' '(' id_list ');' ;
    public final void read_stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:11: ( 'READ' '(' id_list ');' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:13: 'READ' '(' id_list ');'
            {
            match(input,28,FOLLOW_28_in_read_stmt490); 

            match(input,14,FOLLOW_14_in_read_stmt492); 

            pushFollow(FOLLOW_id_list_in_read_stmt494);
            id_list();

            state._fsp--;


            match(input,16,FOLLOW_16_in_read_stmt496); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:1: write_stmt : 'WRITE' '(' id_list ');' ;
    public final void write_stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:12: ( 'WRITE' '(' id_list ');' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:14: 'WRITE' '(' id_list ');'
            {
            match(input,34,FOLLOW_34_in_write_stmt509); 

            match(input,14,FOLLOW_14_in_write_stmt511); 

            pushFollow(FOLLOW_id_list_in_write_stmt513);
            id_list();

            state._fsp--;


            match(input,16,FOLLOW_16_in_write_stmt515); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:1: return_stmt : 'RETURN' expr ';' ;
    public final void return_stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:13: ( 'RETURN' expr ';' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:15: 'RETURN' expr ';'
            {
            match(input,29,FOLLOW_29_in_return_stmt528); 

            pushFollow(FOLLOW_expr_in_return_stmt530);
            expr();

            state._fsp--;


            match(input,19,FOLLOW_19_in_return_stmt532); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:105:1: expr : factor expr_tail ;
    public final void expr() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:105:6: ( factor expr_tail )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:105:8: factor expr_tail
            {
            pushFollow(FOLLOW_factor_in_expr546);
            factor();

            state._fsp--;


            pushFollow(FOLLOW_expr_tail_in_expr548);
            expr_tail();

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
    // $ANTLR end "expr"



    // $ANTLR start "expr_tail"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:108:1: expr_tail : ( Addop factor expr_tail | WS );
    public final void expr_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:108:11: ( Addop factor expr_tail | WS )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Addop) ) {
                alt14=1;
            }
            else if ( (LA14_0==WS) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:108:13: Addop factor expr_tail
                    {
                    match(input,Addop,FOLLOW_Addop_in_expr_tail562); 

                    pushFollow(FOLLOW_factor_in_expr_tail564);
                    factor();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_tail_in_expr_tail566);
                    expr_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:108:38: WS
                    {
                    match(input,WS,FOLLOW_WS_in_expr_tail570); 

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
    // $ANTLR end "expr_tail"



    // $ANTLR start "factor"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:1: factor : postfix_expr factor_tail ;
    public final void factor() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:8: ( postfix_expr factor_tail )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:10: postfix_expr factor_tail
            {
            pushFollow(FOLLOW_postfix_expr_in_factor583);
            postfix_expr();

            state._fsp--;


            pushFollow(FOLLOW_factor_tail_in_factor585);
            factor_tail();

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
    // $ANTLR end "factor"



    // $ANTLR start "factor_tail"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:1: factor_tail : ( Mulop postfix_expr factor_tail | WS );
    public final void factor_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:13: ( Mulop postfix_expr factor_tail | WS )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Mulop) ) {
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
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:15: Mulop postfix_expr factor_tail
                    {
                    match(input,Mulop,FOLLOW_Mulop_in_factor_tail598); 

                    pushFollow(FOLLOW_postfix_expr_in_factor_tail600);
                    postfix_expr();

                    state._fsp--;


                    pushFollow(FOLLOW_factor_tail_in_factor_tail602);
                    factor_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:48: WS
                    {
                    match(input,WS,FOLLOW_WS_in_factor_tail606); 

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
    // $ANTLR end "factor_tail"



    // $ANTLR start "postfix_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:1: postfix_expr : ( primary | call_expr );
    public final void postfix_expr() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:14: ( primary | call_expr )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FLOATLITERAL||LA16_0==INTLITERAL||LA16_0==14) ) {
                alt16=1;
            }
            else if ( (LA16_0==IDENTIFIER) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==Mulop||LA16_2==WS) ) {
                    alt16=1;
                }
                else if ( (LA16_2==14) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:16: primary
                    {
                    pushFollow(FOLLOW_primary_in_postfix_expr619);
                    primary();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:26: call_expr
                    {
                    pushFollow(FOLLOW_call_expr_in_postfix_expr623);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:1: call_expr : id '(' ( expr_list )? ')' ;
    public final void call_expr() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:11: ( id '(' ( expr_list )? ')' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:13: id '(' ( expr_list )? ')'
            {
            pushFollow(FOLLOW_id_in_call_expr636);
            id();

            state._fsp--;


            match(input,14,FOLLOW_14_in_call_expr638); 

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:19: ( expr_list )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= FLOATLITERAL && LA17_0 <= INTLITERAL)||LA17_0==14) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:19: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_call_expr639);
                    expr_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input,15,FOLLOW_15_in_call_expr642); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:123:1: expr_list : expr expr_list_tail ;
    public final void expr_list() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:123:11: ( expr expr_list_tail )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:123:13: expr expr_list_tail
            {
            pushFollow(FOLLOW_expr_in_expr_list655);
            expr();

            state._fsp--;


            pushFollow(FOLLOW_expr_list_tail_in_expr_list657);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:1: expr_list_tail : ( ',' expr expr_list_tail | WS );
    public final void expr_list_tail() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:16: ( ',' expr expr_list_tail | WS )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==WS) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:18: ',' expr expr_list_tail
                    {
                    match(input,17,FOLLOW_17_in_expr_list_tail670); 

                    pushFollow(FOLLOW_expr_in_expr_list_tail672);
                    expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_list_tail_in_expr_list_tail674);
                    expr_list_tail();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:44: WS
                    {
                    match(input,WS,FOLLOW_WS_in_expr_list_tail678); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:129:1: primary : ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL );
    public final void primary() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:129:9: ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt19=1;
                }
                break;
            case IDENTIFIER:
                {
                alt19=2;
                }
                break;
            case INTLITERAL:
                {
                alt19=3;
                }
                break;
            case FLOATLITERAL:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:129:11: '(' expr ')'
                    {
                    match(input,14,FOLLOW_14_in_primary691); 

                    pushFollow(FOLLOW_expr_in_primary692);
                    expr();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_primary693); 

                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:129:24: id
                    {
                    pushFollow(FOLLOW_id_in_primary697);
                    id();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:129:29: INTLITERAL
                    {
                    match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary701); 

                    }
                    break;
                case 4 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:129:42: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary705); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:1: if_stmt : 'IF' ( cond ) 'THEN' stmt_list else_part 'ENDIF' ;
    public final void if_stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:9: ( 'IF' ( cond ) 'THEN' stmt_list else_part 'ENDIF' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:11: 'IF' ( cond ) 'THEN' stmt_list else_part 'ENDIF'
            {
            match(input,26,FOLLOW_26_in_if_stmt753); 

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:16: ( cond )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:18: cond
            {
            pushFollow(FOLLOW_cond_in_if_stmt757);
            cond();

            state._fsp--;


            }


            match(input,31,FOLLOW_31_in_if_stmt761); 

            pushFollow(FOLLOW_stmt_list_in_if_stmt763);
            stmt_list();

            state._fsp--;


            pushFollow(FOLLOW_else_part_in_if_stmt765);
            else_part();

            state._fsp--;


            match(input,24,FOLLOW_24_in_if_stmt767); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:142:1: else_part : ( 'ELSE' stmt_list | WS );
    public final void else_part() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:142:11: ( 'ELSE' stmt_list | WS )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            else if ( (LA20_0==WS) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:142:13: 'ELSE' stmt_list
                    {
                    match(input,22,FOLLOW_22_in_else_part780); 

                    pushFollow(FOLLOW_stmt_list_in_else_part782);
                    stmt_list();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:142:32: WS
                    {
                    match(input,WS,FOLLOW_WS_in_else_part786); 

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:145:1: cond : expr Compop expr ;
    public final void cond() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:145:6: ( expr Compop expr )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:145:8: expr Compop expr
            {
            pushFollow(FOLLOW_expr_in_cond799);
            expr();

            state._fsp--;


            match(input,Compop,FOLLOW_Compop_in_cond801); 

            pushFollow(FOLLOW_expr_in_cond803);
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:1: do_stmt : 'DO' stmt_list 'WHILE' '(' cond ');' ;
    public final void do_stmt() throws RecognitionException {
        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:9: ( 'DO' stmt_list 'WHILE' '(' cond ');' )
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:11: 'DO' stmt_list 'WHILE' '(' cond ');'
            {
            match(input,21,FOLLOW_21_in_do_stmt841); 

            pushFollow(FOLLOW_stmt_list_in_do_stmt843);
            stmt_list();

            state._fsp--;


            match(input,33,FOLLOW_33_in_do_stmt845); 

            match(input,14,FOLLOW_14_in_do_stmt847); 

            pushFollow(FOLLOW_cond_in_do_stmt849);
            cond();

            state._fsp--;


            match(input,16,FOLLOW_16_in_do_stmt851); 

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


 

    public static final BitSet FOLLOW_27_in_program11 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_program13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_program15 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_pgm_body_in_program17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_program19 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_pgm_body45 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body47 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decl_list62 = new BitSet(new long[]{0x0000000040001002L});
    public static final BitSet FOLLOW_string_decl_list_in_decl73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_list_in_decl78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_decl_in_string_decl_list93 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_string_decl108 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_string_decl110 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_string_decl112 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_str_in_string_decl114 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_string_decl116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_str130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_var_decl_list147 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Var_type_in_var_decl162 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_var_decl164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_var_decl166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list214 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_id_tail_in_id_list216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_id_tail229 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_id_tail231 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_id_tail_in_id_tail233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_id_tail237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list254 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_param_decl_tail_in_param_decl_list256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_param_decl269 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_param_decl271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_param_decl_tail284 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_tail286 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_param_decl_tail_in_param_decl_tail288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_param_decl_tail292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations306 = new BitSet(new long[]{0x0000000002002002L});
    public static final BitSet FOLLOW_func_decl_tail_in_func_declarations308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_func_decl322 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_any_type_in_func_decl324 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_func_decl326 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_func_decl328 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl329 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_func_decl331 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_func_decl333 = new BitSet(new long[]{0x0000000040001000L});
    public static final BitSet FOLLOW_func_body_in_func_decl335 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_func_decl337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_func_decl341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_decl_tail354 = new BitSet(new long[]{0x0000000002002002L});
    public static final BitSet FOLLOW_func_decl_tail_in_func_decl_tail356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_func_body370 = new BitSet(new long[]{0x0000000434202100L});
    public static final BitSet FOLLOW_stmt_list_in_func_body372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list386 = new BitSet(new long[]{0x0000000434202100L});
    public static final BitSet FOLLOW_stmt_tail_in_stmt_list388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_stmt_list392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_tail405 = new BitSet(new long[]{0x0000000434202100L});
    public static final BitSet FOLLOW_stmt_tail_in_stmt_tail407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_stmt_tail411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_stmt_in_stmt424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_stmt428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_stmt432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_stmt_in_stmt444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt458 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assign_stmt460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr473 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assign_expr475 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_expr_in_assign_expr477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_read_stmt490 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_read_stmt492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_read_stmt494 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_read_stmt496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_write_stmt509 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_write_stmt511 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_write_stmt513 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_write_stmt515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_return_stmt528 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_expr_in_return_stmt530 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_return_stmt532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr546 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_expr_tail_in_expr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Addop_in_expr_tail562 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_factor_in_expr_tail564 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_expr_tail_in_expr_tail566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_expr_tail570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postfix_expr_in_factor583 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_factor_tail_in_factor585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Mulop_in_factor_tail598 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_postfix_expr_in_factor_tail600 = new BitSet(new long[]{0x0000000000002400L});
    public static final BitSet FOLLOW_factor_tail_in_factor_tail602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_factor_tail606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_postfix_expr619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr636 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_call_expr638 = new BitSet(new long[]{0x000000000000C380L});
    public static final BitSet FOLLOW_expr_list_in_call_expr639 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_call_expr642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list655 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_expr_list_tail_in_expr_list657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expr_list_tail670 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_expr_in_expr_list_tail672 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_expr_list_tail_in_expr_list_tail674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_expr_list_tail678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_primary691 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_expr_in_primary692 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_primary693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_if_stmt753 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_cond_in_if_stmt757 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_if_stmt761 = new BitSet(new long[]{0x0000000434202100L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt763 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt765 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_if_stmt767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_else_part780 = new BitSet(new long[]{0x0000000434202100L});
    public static final BitSet FOLLOW_stmt_list_in_else_part782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_else_part786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond799 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Compop_in_cond801 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_expr_in_cond803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_do_stmt841 = new BitSet(new long[]{0x0000000434202100L});
    public static final BitSet FOLLOW_stmt_list_in_do_stmt843 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_do_stmt845 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_do_stmt847 = new BitSet(new long[]{0x0000000000004380L});
    public static final BitSet FOLLOW_cond_in_do_stmt849 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_do_stmt851 = new BitSet(new long[]{0x0000000000000002L});

}