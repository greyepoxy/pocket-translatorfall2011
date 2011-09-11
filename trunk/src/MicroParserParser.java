// $ANTLR 3.4 /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g 2011-09-11 18:45:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Addop", "COMMENT", "Compop", "FLOATLITERAL", "IDENTIFIER", "INTLITERAL", "Mulop", "Program_start", "STRINGLITERAL", "Var_type", "WS", "'('", "')'", "','", "':='", "';'", "'BEGIN'", "'DO'", "'ELSE'", "'END'", "'ENDIF'", "'FUNCTION'", "'IF'", "'PROGRAM'", "'READ'", "'RETURN'", "'STRING'", "'THEN'", "'VOID'", "'WHILE'", "'WRITE'"
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


public static final String[] ruleNames = new String[] {
    "invalidRule", "decl", "id", "func_body", "func_declarations", "if_stmt", 
    "id_list", "read_stmt", "do_stmt", "pgm_body", "any_type", "primary", 
    "factor", "else_part", "expr_list", "param_decl_list", "postfix_expr", 
    "string_decl", "param_decl", "assign_stmt", "expr", "return_stmt", "call_expr", 
    "cond", "var_decl", "str", "write_stmt", "func_decl", "decl_list", "assign_expr", 
    "stmt_list", "stmt", "program"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public MicroParserParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public MicroParserParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public MicroParserParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return MicroParserParser.tokenNames; }
    public String getGrammarFileName() { return "/home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g"; }



    // $ANTLR start "program"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF ;
    public final void program() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(4, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:9: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:4:12: 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
            {
            dbg.location(4,12);
            match(input,27,FOLLOW_27_in_program12); 
            dbg.location(4,22);
            pushFollow(FOLLOW_id_in_program14);
            id();

            state._fsp--;

            dbg.location(4,25);
            match(input,20,FOLLOW_20_in_program16); 
            dbg.location(4,33);
            pushFollow(FOLLOW_pgm_body_in_program18);
            pgm_body();

            state._fsp--;

            dbg.location(4,42);
            match(input,23,FOLLOW_23_in_program20); 
            dbg.location(4,48);
            match(input,EOF,FOLLOW_EOF_in_program22); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(5, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "program"



    // $ANTLR start "id"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:1: id : IDENTIFIER ;
    public final void id() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "id");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:4: ( IDENTIFIER )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:7:6: IDENTIFIER
            {
            dbg.location(7,6);
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
        dbg.location(8, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "id");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "id"



    // $ANTLR start "pgm_body"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:1: pgm_body : decl_list func_declarations ;
    public final void pgm_body() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "pgm_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(10, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:10: ( decl_list func_declarations )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:10:12: decl_list func_declarations
            {
            dbg.location(10,12);
            pushFollow(FOLLOW_decl_list_in_pgm_body42);
            decl_list();

            state._fsp--;

            dbg.location(10,22);
            pushFollow(FOLLOW_func_declarations_in_pgm_body44);
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
        dbg.location(11, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pgm_body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "pgm_body"



    // $ANTLR start "decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:13:1: decl_list : ( decl )* ;
    public final void decl_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "decl_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:2: ( ( decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:4: ( decl )*
            {
            dbg.location(14,4);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:4: ( decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var_type||LA1_0==30) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:14:4: decl
            	    {
            	    dbg.location(14,4);
            	    pushFollow(FOLLOW_decl_in_decl_list56);
            	    decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "decl_list"



    // $ANTLR start "decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:1: decl : ( string_decl | var_decl );
    public final void decl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:6: ( string_decl | var_decl )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(2);}

            switch (alt2) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:8: string_decl
                    {
                    dbg.location(17,8);
                    pushFollow(FOLLOW_string_decl_in_decl67);
                    string_decl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:17:23: var_decl
                    {
                    dbg.location(17,23);
                    pushFollow(FOLLOW_var_decl_in_decl72);
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
        dbg.location(18, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "decl"



    // $ANTLR start "string_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:20:1: string_decl : 'STRING' id ':=' str ';' ;
    public final void string_decl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "string_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:20:13: ( 'STRING' id ':=' str ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:20:15: 'STRING' id ':=' str ';'
            {
            dbg.location(20,15);
            match(input,30,FOLLOW_30_in_string_decl83); 
            dbg.location(20,24);
            pushFollow(FOLLOW_id_in_string_decl85);
            id();

            state._fsp--;

            dbg.location(20,27);
            match(input,18,FOLLOW_18_in_string_decl87); 
            dbg.location(20,32);
            pushFollow(FOLLOW_str_in_string_decl89);
            str();

            state._fsp--;

            dbg.location(20,36);
            match(input,19,FOLLOW_19_in_string_decl91); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "string_decl"



    // $ANTLR start "str"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:23:1: str : STRINGLITERAL ;
    public final void str() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "str");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:23:5: ( STRINGLITERAL )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:23:7: STRINGLITERAL
            {
            dbg.location(23,7);
            match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_str102); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(24, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "str");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "str"



    // $ANTLR start "var_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:29:1: var_decl : Var_type id_list ';' ;
    public final void var_decl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:29:10: ( Var_type id_list ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:29:12: Var_type id_list ';'
            {
            dbg.location(29,12);
            match(input,Var_type,FOLLOW_Var_type_in_var_decl115); 
            dbg.location(29,21);
            pushFollow(FOLLOW_id_list_in_var_decl117);
            id_list();

            state._fsp--;

            dbg.location(29,29);
            match(input,19,FOLLOW_19_in_var_decl119); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(30, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "var_decl"



    // $ANTLR start "any_type"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:35:1: any_type : ( Var_type | 'VOID' );
    public final void any_type() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "any_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:35:10: ( Var_type | 'VOID' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
            {
            dbg.location(35,10);
            if ( input.LA(1)==Var_type||input.LA(1)==32 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
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
        dbg.location(36, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "any_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "any_type"



    // $ANTLR start "id_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:38:1: id_list : id ( ',' id )* ;
    public final void id_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "id_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:38:9: ( id ( ',' id )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:38:11: id ( ',' id )*
            {
            dbg.location(38,11);
            pushFollow(FOLLOW_id_in_id_list161);
            id();

            state._fsp--;

            dbg.location(38,14);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:38:14: ( ',' id )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:38:15: ',' id
            	    {
            	    dbg.location(38,15);
            	    match(input,17,FOLLOW_17_in_id_list164); 
            	    dbg.location(38,19);
            	    pushFollow(FOLLOW_id_in_id_list166);
            	    id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "id_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "id_list"



    // $ANTLR start "param_decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:1: param_decl_list : param_decl ( ',' param_decl )* ;
    public final void param_decl_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "param_decl_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:17: ( param_decl ( ',' param_decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:19: param_decl ( ',' param_decl )*
            {
            dbg.location(46,19);
            pushFollow(FOLLOW_param_decl_in_param_decl_list186);
            param_decl();

            state._fsp--;

            dbg.location(46,30);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:30: ( ',' param_decl )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:46:31: ',' param_decl
            	    {
            	    dbg.location(46,31);
            	    match(input,17,FOLLOW_17_in_param_decl_list189); 
            	    dbg.location(46,35);
            	    pushFollow(FOLLOW_param_decl_in_param_decl_list191);
            	    param_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(47, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param_decl_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "param_decl_list"



    // $ANTLR start "param_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:1: param_decl : Var_type id ;
    public final void param_decl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "param_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(49, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:12: ( Var_type id )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:49:14: Var_type id
            {
            dbg.location(49,14);
            match(input,Var_type,FOLLOW_Var_type_in_param_decl203); 
            dbg.location(49,23);
            pushFollow(FOLLOW_id_in_param_decl205);
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
        dbg.location(50, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "param_decl"



    // $ANTLR start "func_declarations"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:53:1: func_declarations : ( func_decl )* ;
    public final void func_declarations() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func_declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:53:19: ( ( func_decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:53:21: ( func_decl )*
            {
            dbg.location(53,21);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:53:21: ( func_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:53:22: func_decl
            	    {
            	    dbg.location(53,22);
            	    pushFollow(FOLLOW_func_decl_in_func_declarations217);
            	    func_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(54, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "func_declarations"



    // $ANTLR start "func_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' ;
    public final void func_decl() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:11: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:13: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            dbg.location(56,13);
            match(input,25,FOLLOW_25_in_func_decl229); 
            dbg.location(56,24);
            pushFollow(FOLLOW_any_type_in_func_decl231);
            any_type();

            state._fsp--;

            dbg.location(56,33);
            pushFollow(FOLLOW_id_in_func_decl233);
            id();

            state._fsp--;

            dbg.location(56,36);
            match(input,15,FOLLOW_15_in_func_decl235); 
            dbg.location(56,39);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:39: ( param_decl_list )?
            int alt6=2;
            try { dbg.enterSubRule(6);
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==Var_type) ) {
                alt6=1;
            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:56:39: param_decl_list
                    {
                    dbg.location(56,39);
                    pushFollow(FOLLOW_param_decl_list_in_func_decl236);
                    param_decl_list();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(56,55);
            match(input,16,FOLLOW_16_in_func_decl238); 
            dbg.location(56,59);
            match(input,20,FOLLOW_20_in_func_decl240); 
            dbg.location(56,67);
            pushFollow(FOLLOW_func_body_in_func_decl242);
            func_body();

            state._fsp--;

            dbg.location(56,77);
            match(input,23,FOLLOW_23_in_func_decl244); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "func_decl"



    // $ANTLR start "func_body"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:59:1: func_body : decl_list stmt_list ;
    public final void func_body() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "func_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:59:11: ( decl_list stmt_list )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:59:13: decl_list stmt_list
            {
            dbg.location(59,13);
            pushFollow(FOLLOW_decl_list_in_func_body258);
            decl_list();

            state._fsp--;

            dbg.location(59,23);
            pushFollow(FOLLOW_stmt_list_in_func_body260);
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
        dbg.location(60, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "func_body"



    // $ANTLR start "stmt_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:63:1: stmt_list : ( stmt )* ;
    public final void stmt_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stmt_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:63:11: ( ( stmt )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:63:13: ( stmt )*
            {
            dbg.location(63,13);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:63:13: ( stmt )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER||LA7_0==21||LA7_0==26||(LA7_0 >= 28 && LA7_0 <= 29)||LA7_0==34) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:63:14: stmt
            	    {
            	    dbg.location(63,14);
            	    pushFollow(FOLLOW_stmt_in_stmt_list272);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(64, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stmt_list"



    // $ANTLR start "stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:1: stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt );
    public final void stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(66, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:6: ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt )
            int alt8=6;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 34:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(8);}

            switch (alt8) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:8: assign_stmt
                    {
                    dbg.location(66,8);
                    pushFollow(FOLLOW_assign_stmt_in_stmt284);
                    assign_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:22: read_stmt
                    {
                    dbg.location(66,22);
                    pushFollow(FOLLOW_read_stmt_in_stmt288);
                    read_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:34: write_stmt
                    {
                    dbg.location(66,34);
                    pushFollow(FOLLOW_write_stmt_in_stmt292);
                    write_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:47: return_stmt
                    {
                    dbg.location(66,47);
                    pushFollow(FOLLOW_return_stmt_in_stmt296);
                    return_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:61: if_stmt
                    {
                    dbg.location(66,61);
                    pushFollow(FOLLOW_if_stmt_in_stmt300);
                    if_stmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:66:71: do_stmt
                    {
                    dbg.location(66,71);
                    pushFollow(FOLLOW_do_stmt_in_stmt304);
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
        dbg.location(67, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "assign_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:70:1: assign_stmt : assign_expr ';' ;
    public final void assign_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(70, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:70:13: ( assign_expr ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:70:15: assign_expr ';'
            {
            dbg.location(70,15);
            pushFollow(FOLLOW_assign_expr_in_assign_stmt315);
            assign_expr();

            state._fsp--;

            dbg.location(70,27);
            match(input,19,FOLLOW_19_in_assign_stmt317); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(71, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assign_stmt"



    // $ANTLR start "assign_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:73:1: assign_expr : id ':=' expr ;
    public final void assign_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "assign_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(73, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:73:13: ( id ':=' expr )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:73:15: id ':=' expr
            {
            dbg.location(73,15);
            pushFollow(FOLLOW_id_in_assign_expr327);
            id();

            state._fsp--;

            dbg.location(73,18);
            match(input,18,FOLLOW_18_in_assign_expr329); 
            dbg.location(73,23);
            pushFollow(FOLLOW_expr_in_assign_expr331);
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
        dbg.location(74, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "assign_expr"



    // $ANTLR start "read_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:76:1: read_stmt : 'READ' '(' id_list ')' ';' ;
    public final void read_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(76, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:76:11: ( 'READ' '(' id_list ')' ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:76:13: 'READ' '(' id_list ')' ';'
            {
            dbg.location(76,13);
            match(input,28,FOLLOW_28_in_read_stmt341); 
            dbg.location(76,20);
            match(input,15,FOLLOW_15_in_read_stmt343); 
            dbg.location(76,24);
            pushFollow(FOLLOW_id_list_in_read_stmt345);
            id_list();

            state._fsp--;

            dbg.location(76,32);
            match(input,16,FOLLOW_16_in_read_stmt347); 
            dbg.location(76,35);
            match(input,19,FOLLOW_19_in_read_stmt348); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(77, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "read_stmt"



    // $ANTLR start "write_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:1: write_stmt : 'WRITE' '(' id_list ')' ';' ;
    public final void write_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "write_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(79, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:12: ( 'WRITE' '(' id_list ')' ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:79:14: 'WRITE' '(' id_list ')' ';'
            {
            dbg.location(79,14);
            match(input,34,FOLLOW_34_in_write_stmt358); 
            dbg.location(79,22);
            match(input,15,FOLLOW_15_in_write_stmt360); 
            dbg.location(79,26);
            pushFollow(FOLLOW_id_list_in_write_stmt362);
            id_list();

            state._fsp--;

            dbg.location(79,34);
            match(input,16,FOLLOW_16_in_write_stmt364); 
            dbg.location(79,37);
            match(input,19,FOLLOW_19_in_write_stmt365); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(80, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "write_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "write_stmt"



    // $ANTLR start "return_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:1: return_stmt : 'RETURN' expr ';' ;
    public final void return_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(82, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:13: ( 'RETURN' expr ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:82:15: 'RETURN' expr ';'
            {
            dbg.location(82,15);
            match(input,29,FOLLOW_29_in_return_stmt375); 
            dbg.location(82,24);
            pushFollow(FOLLOW_expr_in_return_stmt377);
            expr();

            state._fsp--;

            dbg.location(82,29);
            match(input,19,FOLLOW_19_in_return_stmt379); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(83, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "return_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "return_stmt"



    // $ANTLR start "expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:86:1: expr : factor ( Addop factor )* ;
    public final void expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(86, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:86:6: ( factor ( Addop factor )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:86:8: factor ( Addop factor )*
            {
            dbg.location(86,8);
            pushFollow(FOLLOW_factor_in_expr390);
            factor();

            state._fsp--;

            dbg.location(86,16);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:86:16: ( Addop factor )*
            try { dbg.enterSubRule(9);

            loop9:
            do {
                int alt9=2;
                try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                int LA9_0 = input.LA(1);

                if ( (LA9_0==Addop) ) {
                    alt9=1;
                }


                } finally {dbg.exitDecision(9);}

                switch (alt9) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:86:17: Addop factor
            	    {
            	    dbg.location(86,17);
            	    match(input,Addop,FOLLOW_Addop_in_expr394); 
            	    dbg.location(86,23);
            	    pushFollow(FOLLOW_factor_in_expr396);
            	    factor();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(87, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "factor"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:1: factor : postfix_expr ( Mulop postfix_expr )* ;
    public final void factor() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(89, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:8: ( postfix_expr ( Mulop postfix_expr )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:10: postfix_expr ( Mulop postfix_expr )*
            {
            dbg.location(89,10);
            pushFollow(FOLLOW_postfix_expr_in_factor409);
            postfix_expr();

            state._fsp--;

            dbg.location(89,23);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:23: ( Mulop postfix_expr )*
            try { dbg.enterSubRule(10);

            loop10:
            do {
                int alt10=2;
                try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                int LA10_0 = input.LA(1);

                if ( (LA10_0==Mulop) ) {
                    alt10=1;
                }


                } finally {dbg.exitDecision(10);}

                switch (alt10) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:89:24: Mulop postfix_expr
            	    {
            	    dbg.location(89,24);
            	    match(input,Mulop,FOLLOW_Mulop_in_factor412); 
            	    dbg.location(89,30);
            	    pushFollow(FOLLOW_postfix_expr_in_factor414);
            	    postfix_expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(90, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "postfix_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:1: postfix_expr : ( primary | call_expr );
    public final void postfix_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "postfix_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(92, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:14: ( primary | call_expr )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==FLOATLITERAL||LA11_0==INTLITERAL||LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==Addop||LA11_2==Compop||LA11_2==Mulop||(LA11_2 >= 16 && LA11_2 <= 17)||LA11_2==19) ) {
                    alt11=1;
                }
                else if ( (LA11_2==15) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:16: primary
                    {
                    dbg.location(92,16);
                    pushFollow(FOLLOW_primary_in_postfix_expr426);
                    primary();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:92:26: call_expr
                    {
                    dbg.location(92,26);
                    pushFollow(FOLLOW_call_expr_in_postfix_expr430);
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
        dbg.location(93, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "postfix_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "postfix_expr"



    // $ANTLR start "call_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:1: call_expr : id '(' ( expr_list )? ')' ;
    public final void call_expr() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "call_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(95, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:11: ( id '(' ( expr_list )? ')' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:13: id '(' ( expr_list )? ')'
            {
            dbg.location(95,13);
            pushFollow(FOLLOW_id_in_call_expr440);
            id();

            state._fsp--;

            dbg.location(95,16);
            match(input,15,FOLLOW_15_in_call_expr442); 
            dbg.location(95,19);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:19: ( expr_list )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= FLOATLITERAL && LA12_0 <= INTLITERAL)||LA12_0==15) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:95:20: expr_list
                    {
                    dbg.location(95,20);
                    pushFollow(FOLLOW_expr_list_in_call_expr444);
                    expr_list();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(95,32);
            match(input,16,FOLLOW_16_in_call_expr448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(96, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "call_expr"



    // $ANTLR start "expr_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:1: expr_list : expr ( ',' expr )* ;
    public final void expr_list() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:11: ( expr ( ',' expr )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:13: expr ( ',' expr )*
            {
            dbg.location(98,13);
            pushFollow(FOLLOW_expr_in_expr_list458);
            expr();

            state._fsp--;

            dbg.location(98,18);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:18: ( ',' expr )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:19: ',' expr
            	    {
            	    dbg.location(98,19);
            	    match(input,17,FOLLOW_17_in_expr_list461); 
            	    dbg.location(98,23);
            	    pushFollow(FOLLOW_expr_in_expr_list463);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(99, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "expr_list"



    // $ANTLR start "primary"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:1: primary : ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL );
    public final void primary() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(101, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:9: ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL )
            int alt14=4;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

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

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:11: '(' expr ')'
                    {
                    dbg.location(101,11);
                    match(input,15,FOLLOW_15_in_primary475); 
                    dbg.location(101,14);
                    pushFollow(FOLLOW_expr_in_primary476);
                    expr();

                    state._fsp--;

                    dbg.location(101,18);
                    match(input,16,FOLLOW_16_in_primary477); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:24: id
                    {
                    dbg.location(101,24);
                    pushFollow(FOLLOW_id_in_primary481);
                    id();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:29: INTLITERAL
                    {
                    dbg.location(101,29);
                    match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary485); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:101:42: FLOATLITERAL
                    {
                    dbg.location(101,42);
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary489); 

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
        dbg.location(102, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "primary"



    // $ANTLR start "if_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:1: if_stmt : 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' ;
    public final void if_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "if_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(111, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:9: ( 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:11: 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF'
            {
            dbg.location(111,11);
            match(input,26,FOLLOW_26_in_if_stmt528); 
            dbg.location(111,16);
            match(input,15,FOLLOW_15_in_if_stmt530); 
            dbg.location(111,20);
            pushFollow(FOLLOW_cond_in_if_stmt532);
            cond();

            state._fsp--;

            dbg.location(111,25);
            match(input,16,FOLLOW_16_in_if_stmt534); 
            dbg.location(111,29);
            match(input,31,FOLLOW_31_in_if_stmt536); 
            dbg.location(111,36);
            pushFollow(FOLLOW_stmt_list_in_if_stmt538);
            stmt_list();

            state._fsp--;

            dbg.location(111,46);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:46: ( else_part )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:47: else_part
                    {
                    dbg.location(111,47);
                    pushFollow(FOLLOW_else_part_in_if_stmt541);
                    else_part();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(111,60);
            match(input,24,FOLLOW_24_in_if_stmt546); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(112, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "if_stmt"



    // $ANTLR start "else_part"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:1: else_part : 'ELSE' stmt_list ;
    public final void else_part() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "else_part");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:11: ( 'ELSE' stmt_list )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:13: 'ELSE' stmt_list
            {
            dbg.location(114,13);
            match(input,22,FOLLOW_22_in_else_part556); 
            dbg.location(114,20);
            pushFollow(FOLLOW_stmt_list_in_else_part558);
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
        dbg.location(115, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "else_part");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "else_part"



    // $ANTLR start "cond"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:1: cond : expr Compop expr ;
    public final void cond() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "cond");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:6: ( expr Compop expr )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:8: expr Compop expr
            {
            dbg.location(117,8);
            pushFollow(FOLLOW_expr_in_cond568);
            expr();

            state._fsp--;

            dbg.location(117,13);
            match(input,Compop,FOLLOW_Compop_in_cond570); 
            dbg.location(117,20);
            pushFollow(FOLLOW_expr_in_cond572);
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
        dbg.location(118, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cond");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "cond"



    // $ANTLR start "do_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:123:1: do_stmt : 'DO' stmt_list 'WHILE' '(' cond ')' ';' ;
    public final void do_stmt() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "do_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(123, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:123:9: ( 'DO' stmt_list 'WHILE' '(' cond ')' ';' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:123:11: 'DO' stmt_list 'WHILE' '(' cond ')' ';'
            {
            dbg.location(123,11);
            match(input,21,FOLLOW_21_in_do_stmt604); 
            dbg.location(123,16);
            pushFollow(FOLLOW_stmt_list_in_do_stmt606);
            stmt_list();

            state._fsp--;

            dbg.location(123,26);
            match(input,33,FOLLOW_33_in_do_stmt608); 
            dbg.location(123,34);
            match(input,15,FOLLOW_15_in_do_stmt610); 
            dbg.location(123,38);
            pushFollow(FOLLOW_cond_in_do_stmt612);
            cond();

            state._fsp--;

            dbg.location(123,43);
            match(input,16,FOLLOW_16_in_do_stmt614); 
            dbg.location(123,46);
            match(input,19,FOLLOW_19_in_do_stmt615); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(124, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "do_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "do_stmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_27_in_program12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_program14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_program16 = new BitSet(new long[]{0x0000000042002000L});
    public static final BitSet FOLLOW_pgm_body_in_program18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_program20 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program22 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_pgm_body42 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body44 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decl_list56 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_string_decl_in_decl67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_string_decl83 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_string_decl85 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_string_decl87 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_str_in_string_decl89 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_string_decl91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_str102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_var_decl115 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_var_decl117 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_var_decl119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list161 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_id_list164 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_id_list166 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list186 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_param_decl_list189 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list191 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Var_type_in_param_decl203 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_param_decl205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations217 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_func_decl229 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_any_type_in_func_decl231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_func_decl233 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_func_decl235 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl236 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_func_decl238 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_func_decl240 = new BitSet(new long[]{0x0000000474202100L});
    public static final BitSet FOLLOW_func_body_in_func_decl242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_func_decl244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_func_body258 = new BitSet(new long[]{0x0000000434200100L});
    public static final BitSet FOLLOW_stmt_list_in_func_body260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list272 = new BitSet(new long[]{0x0000000434200102L});
    public static final BitSet FOLLOW_assign_stmt_in_stmt284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_stmt288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_stmt292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_stmt_in_stmt304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt315 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assign_stmt317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr327 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assign_expr329 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_assign_expr331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_read_stmt341 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_read_stmt343 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_read_stmt345 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_read_stmt347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_read_stmt348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_write_stmt358 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_write_stmt360 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_write_stmt362 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_write_stmt364 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_write_stmt365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_return_stmt375 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_return_stmt377 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_return_stmt379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr390 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Addop_in_expr394 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_factor_in_expr396 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_postfix_expr_in_factor409 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Mulop_in_factor412 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_postfix_expr_in_factor414 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_primary_in_postfix_expr426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr440 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_call_expr442 = new BitSet(new long[]{0x0000000000018380L});
    public static final BitSet FOLLOW_expr_list_in_call_expr444 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_call_expr448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list458 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_expr_list461 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_expr_list463 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15_in_primary475 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_primary476 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_primary477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_if_stmt528 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_stmt530 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_cond_in_if_stmt532 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_if_stmt534 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_if_stmt536 = new BitSet(new long[]{0x0000000435600100L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt538 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt541 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_if_stmt546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_else_part556 = new BitSet(new long[]{0x0000000434200100L});
    public static final BitSet FOLLOW_stmt_list_in_else_part558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond568 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Compop_in_cond570 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_cond572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_do_stmt604 = new BitSet(new long[]{0x0000000634200100L});
    public static final BitSet FOLLOW_stmt_list_in_do_stmt606 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_do_stmt608 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_do_stmt610 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_cond_in_do_stmt612 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_do_stmt614 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_do_stmt615 = new BitSet(new long[]{0x0000000000000002L});

}