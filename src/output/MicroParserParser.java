// $ANTLR 3.4 /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g 2011-11-06 15:15:01

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Addop", "COMMENT", "Compop", "DO_COND", "DO_MAIN", "FLOATLITERAL", "FUNCTION_BODY", "FUNCTION_PARAMS", "IDENTIFIER", "IF_COND", "IF_ELSE", "IF_MAIN", "INTLITERAL", "LABEL", "Mulop", "Program_start", "STRINGLITERAL", "Var_type", "WS", "'('", "')'", "','", "':='", "';'", "'BEGIN'", "'DO'", "'ELSE'", "'END'", "'ENDIF'", "'FUNCTION'", "'IF'", "'PROGRAM'", "'READ'", "'RETURN'", "'STRING'", "'THEN'", "'VOID'", "'WHILE'", "'WRITE'"
    };

    public static final int EOF=-1;
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
    public static final int T__42=42;
    public static final int Addop=4;
    public static final int COMMENT=5;
    public static final int Compop=6;
    public static final int DO_COND=7;
    public static final int DO_MAIN=8;
    public static final int FLOATLITERAL=9;
    public static final int FUNCTION_BODY=10;
    public static final int FUNCTION_PARAMS=11;
    public static final int IDENTIFIER=12;
    public static final int IF_COND=13;
    public static final int IF_ELSE=14;
    public static final int IF_MAIN=15;
    public static final int INTLITERAL=16;
    public static final int LABEL=17;
    public static final int Mulop=18;
    public static final int Program_start=19;
    public static final int STRINGLITERAL=20;
    public static final int Var_type=21;
    public static final int WS=22;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "stmt_list", "read_stmt", "else_part", "any_type", "do_stmt", 
    "call_expr", "decl_list", "postfix_expr", "param_decl_list", "str", 
    "var_decl", "write_stmt", "func_declarations", "func_decl", "stmt", 
    "assign_stmt", "cond", "expr_list", "param_decl", "return_stmt", "expr", 
    "primary", "if_stmt", "program", "string_decl", "pgm_body", "assign_expr", 
    "func_body", "id_tail", "id_list", "decl", "factor", "id"
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
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public MicroParserParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return MicroParserParser.tokenNames; }
    public String getGrammarFileName() { return "/home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g"; }


    	int symbolTableId = 0;
    	
    	public class TableEntry {
    		public String Type;
    		public String Value;
    		public String Name;
    		
    		public TableEntry(String n, String t, String v)
    		{
    			Name = n;
    			Type = t;
    			Value = v;
    		}
    		
    		public String toString()
    		{
    			if(Type.equals("STRING"))
    			{
    				return "name: " + Name + " type " + Type + " value: " + Value;
    			}
    			else
    			{
    				return "name: " + Name + " type " + Type;			
    			}

    		}
    	}
    	
    	public HashMap<Integer, ArrayList<TableEntry>> tableOfTables = new HashMap<Integer, ArrayList<TableEntry>>();
    	public HashMap<Integer, String> tableOfTableNames = new HashMap<Integer, String>();
    	
    	ArrayList<String> idList = new ArrayList<String>();
    	ArrayList<TableEntry> currentTable = new ArrayList<TableEntry>();
    	
    	Integer currentId = new Integer(symbolTableId);
    	
    	public void displayRecognitionError(String[] tokenNames, 
    					RecognitionException e) {
    		String hdr = getErrorHeader(e);
    		String msg = getErrorMessage(e, tokenNames);
    		// Now do something with hdr and msg...
    	}
    	public void printTables()
    	{
    		for(Integer i : tableOfTables.keySet())
    		{
    			if(i.intValue() == 0)
    			{
    				System.out.println("Printing Global Symbol Table");		
    			}
    			else
    			{
    				System.out.println("Printing Symbol Table for " + tableOfTableNames.get(i));
    			}
    			
    			for(TableEntry t: tableOfTables.get(i))
    			{
    				System.out.println(t);
    			}
    			System.out.println("");
    		}
    	}
    	


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:96:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF -> ^( 'PROGRAM' pgm_body ) ;
    public final MicroParserParser.program_return program() throws RecognitionException {
        MicroParserParser.program_return retval = new MicroParserParser.program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal1=null;
        Token string_literal3=null;
        Token string_literal5=null;
        Token EOF6=null;
        MicroParserParser.id_return id2 =null;

        MicroParserParser.pgm_body_return pgm_body4 =null;


        Object string_literal1_tree=null;
        Object string_literal3_tree=null;
        Object string_literal5_tree=null;
        Object EOF6_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_pgm_body=new RewriteRuleSubtreeStream(adaptor,"rule pgm_body");
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(96, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:96:9: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF -> ^( 'PROGRAM' pgm_body ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:96:12: 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
            {
            dbg.location(96,12);
            string_literal1=(Token)match(input,35,FOLLOW_35_in_program127);  
            stream_35.add(string_literal1);

            dbg.location(96,22);
            pushFollow(FOLLOW_id_in_program129);
            id2=id();

            state._fsp--;

            stream_id.add(id2.getTree());
            dbg.location(96,25);
            string_literal3=(Token)match(input,28,FOLLOW_28_in_program131);  
            stream_28.add(string_literal3);

            dbg.location(97,2);
             	tableOfTables.put(new Integer(symbolTableId), currentTable);
            		tableOfTableNames.put(new Integer(symbolTableId), "Global");
            dbg.location(99,3);
            pushFollow(FOLLOW_pgm_body_in_program138);
            pgm_body4=pgm_body();

            state._fsp--;

            stream_pgm_body.add(pgm_body4.getTree());
            dbg.location(99,12);
            string_literal5=(Token)match(input,31,FOLLOW_31_in_program140);  
            stream_31.add(string_literal5);

            dbg.location(99,18);
            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_program142);  
            stream_EOF.add(EOF6);


            // AST REWRITE
            // elements: pgm_body, 35
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:2: -> ^( 'PROGRAM' pgm_body )
            {
                dbg.location(100,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:100:5: ^( 'PROGRAM' pgm_body )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(100,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_35.nextNode()
                , root_1);

                dbg.location(100,17);
                adaptor.addChild(root_1, stream_pgm_body.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(100, 25);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "program");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "program"


    public static class id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:102:1: id : IDENTIFIER {...}?;
    public final MicroParserParser.id_return id() throws RecognitionException {
        MicroParserParser.id_return retval = new MicroParserParser.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER7=null;

        Object IDENTIFIER7_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "id");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(102, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:102:4: ( IDENTIFIER {...}?)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:102:6: IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(102,6);
            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id159); 
            IDENTIFIER7_tree = 
            (Object)adaptor.create(IDENTIFIER7)
            ;
            adaptor.addChild(root_0, IDENTIFIER7_tree);

            dbg.location(102,17);
            if ( !(evalPredicate((IDENTIFIER7!=null?IDENTIFIER7.getText():null).length() <= 31,"$IDENTIFIER.text.length() <= 31")) ) {
                throw new FailedPredicateException(input, "id", "$IDENTIFIER.text.length() <= 31");
            }

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(103, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "id");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "id"


    public static class pgm_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pgm_body"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:105:1: pgm_body : decl_list func_declarations ;
    public final MicroParserParser.pgm_body_return pgm_body() throws RecognitionException {
        MicroParserParser.pgm_body_return retval = new MicroParserParser.pgm_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.decl_list_return decl_list8 =null;

        MicroParserParser.func_declarations_return func_declarations9 =null;



        try { dbg.enterRule(getGrammarFileName(), "pgm_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(105, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:105:10: ( decl_list func_declarations )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:105:12: decl_list func_declarations
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(105,12);
            pushFollow(FOLLOW_decl_list_in_pgm_body171);
            decl_list8=decl_list();

            state._fsp--;

            adaptor.addChild(root_0, decl_list8.getTree());
            dbg.location(105,22);
            pushFollow(FOLLOW_func_declarations_in_pgm_body173);
            func_declarations9=func_declarations();

            state._fsp--;

            adaptor.addChild(root_0, func_declarations9.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(106, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "pgm_body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "pgm_body"


    public static class decl_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:108:1: decl_list : ( decl )* ;
    public final MicroParserParser.decl_list_return decl_list() throws RecognitionException {
        MicroParserParser.decl_list_return retval = new MicroParserParser.decl_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.decl_return decl10 =null;



        try { dbg.enterRule(getGrammarFileName(), "decl_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(108, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:109:2: ( ( decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:109:4: ( decl )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(109,4);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:109:4: ( decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var_type||LA1_0==38) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:109:4: decl
            	    {
            	    dbg.location(109,4);
            	    pushFollow(FOLLOW_decl_in_decl_list185);
            	    decl10=decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, decl10.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(110, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl_list"


    public static class decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:112:1: decl : ( string_decl | var_decl );
    public final MicroParserParser.decl_return decl() throws RecognitionException {
        MicroParserParser.decl_return retval = new MicroParserParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.string_decl_return string_decl11 =null;

        MicroParserParser.var_decl_return var_decl12 =null;



        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(112, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:112:6: ( string_decl | var_decl )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==38) ) {
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:112:8: string_decl
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(112,8);
                    pushFollow(FOLLOW_string_decl_in_decl196);
                    string_decl11=string_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, string_decl11.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:112:23: var_decl
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(112,23);
                    pushFollow(FOLLOW_var_decl_in_decl201);
                    var_decl12=var_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, var_decl12.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(113, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "decl"


    public static class string_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "string_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:115:1: string_decl : 'STRING' id ':=' str ';' ->;
    public final MicroParserParser.string_decl_return string_decl() throws RecognitionException {
        MicroParserParser.string_decl_return retval = new MicroParserParser.string_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal13=null;
        Token string_literal15=null;
        Token char_literal17=null;
        MicroParserParser.id_return id14 =null;

        MicroParserParser.str_return str16 =null;


        Object string_literal13_tree=null;
        Object string_literal15_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_str=new RewriteRuleSubtreeStream(adaptor,"rule str");
        try { dbg.enterRule(getGrammarFileName(), "string_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(115, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:115:13: ( 'STRING' id ':=' str ';' ->)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:115:15: 'STRING' id ':=' str ';'
            {
            dbg.location(115,15);
            string_literal13=(Token)match(input,38,FOLLOW_38_in_string_decl212);  
            stream_38.add(string_literal13);

            dbg.location(115,24);
            pushFollow(FOLLOW_id_in_string_decl214);
            id14=id();

            state._fsp--;

            stream_id.add(id14.getTree());
            dbg.location(115,27);
            string_literal15=(Token)match(input,26,FOLLOW_26_in_string_decl216);  
            stream_26.add(string_literal15);

            dbg.location(115,32);
            pushFollow(FOLLOW_str_in_string_decl218);
            str16=str();

            state._fsp--;

            stream_str.add(str16.getTree());
            dbg.location(115,36);
            char_literal17=(Token)match(input,27,FOLLOW_27_in_string_decl220);  
            stream_27.add(char_literal17);

            dbg.location(115,40);
            currentTable.add( new TableEntry((id14!=null?input.toString(id14.start,id14.stop):null),"STRING", (str16!=null?input.toString(str16.start,str16.stop):null)));

            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:2: ->
            {
                dbg.location(116,4);
                root_0 = null;
            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(116, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "string_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "string_decl"


    public static class str_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "str"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:118:1: str : STRINGLITERAL {...}?;
    public final MicroParserParser.str_return str() throws RecognitionException {
        MicroParserParser.str_return retval = new MicroParserParser.str_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRINGLITERAL18=null;

        Object STRINGLITERAL18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "str");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(118, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:118:5: ( STRINGLITERAL {...}?)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:118:7: STRINGLITERAL {...}?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(118,7);
            STRINGLITERAL18=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_str234); 
            STRINGLITERAL18_tree = 
            (Object)adaptor.create(STRINGLITERAL18)
            ;
            adaptor.addChild(root_0, STRINGLITERAL18_tree);

            dbg.location(118,21);
            if ( !(evalPredicate((STRINGLITERAL18!=null?STRINGLITERAL18.getText():null).length() <= 81,"$STRINGLITERAL.text.length() <= 81")) ) {
                throw new FailedPredicateException(input, "str", "$STRINGLITERAL.text.length() <= 81");
            }

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(119, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "str");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "str"


    public static class var_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "var_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:124:1: var_decl : Var_type id_list ';' ->;
    public final MicroParserParser.var_decl_return var_decl() throws RecognitionException {
        MicroParserParser.var_decl_return retval = new MicroParserParser.var_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Var_type19=null;
        Token char_literal21=null;
        MicroParserParser.id_list_return id_list20 =null;


        Object Var_type19_tree=null;
        Object char_literal21_tree=null;
        RewriteRuleTokenStream stream_Var_type=new RewriteRuleTokenStream(adaptor,"token Var_type");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(124, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:124:10: ( Var_type id_list ';' ->)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:124:12: Var_type id_list ';'
            {
            dbg.location(124,12);
            Var_type19=(Token)match(input,Var_type,FOLLOW_Var_type_in_var_decl249);  
            stream_Var_type.add(Var_type19);

            dbg.location(124,21);
            pushFollow(FOLLOW_id_list_in_var_decl251);
            id_list20=id_list();

            state._fsp--;

            stream_id_list.add(id_list20.getTree());
            dbg.location(125,1);
            	
            	for(String s : idList){
            		currentTable.add(new TableEntry(s,(Var_type19!=null?Var_type19.getText():null), ""));
            	}

            dbg.location(129,3);
            char_literal21=(Token)match(input,27,FOLLOW_27_in_var_decl256);  
            stream_27.add(char_literal21);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:2: ->
            {
                dbg.location(130,5);
                root_0 = null;
            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(130, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "var_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "var_decl"


    public static class any_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "any_type"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:136:1: any_type : ( Var_type | 'VOID' );
    public final MicroParserParser.any_type_return any_type() throws RecognitionException {
        MicroParserParser.any_type_return retval = new MicroParserParser.any_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set22=null;

        Object set22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "any_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(136, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:136:10: ( Var_type | 'VOID' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(136,10);
            set22=(Token)input.LT(1);

            if ( input.LA(1)==Var_type||input.LA(1)==40 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set22)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(137, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "any_type");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "any_type"


    public static class id_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:1: id_list : id ( id_tail )* ;
    public final MicroParserParser.id_list_return id_list() throws RecognitionException {
        MicroParserParser.id_list_return retval = new MicroParserParser.id_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.id_return id23 =null;

        MicroParserParser.id_tail_return id_tail24 =null;



        try { dbg.enterRule(getGrammarFileName(), "id_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(139, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:9: ( id ( id_tail )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:11: id ( id_tail )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(139,11);
            idList.clear();
            dbg.location(139,29);
            pushFollow(FOLLOW_id_in_id_list306);
            id23=id();

            state._fsp--;

            adaptor.addChild(root_0, id23.getTree());
            dbg.location(139,32);
            idList.add((id23!=null?input.toString(id23.start,id23.stop):null));
            dbg.location(139,56);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:56: ( id_tail )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==25) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:139:56: id_tail
            	    {
            	    dbg.location(139,56);
            	    pushFollow(FOLLOW_id_tail_in_id_list310);
            	    id_tail24=id_tail();

            	    state._fsp--;

            	    adaptor.addChild(root_0, id_tail24.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(140, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "id_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "id_list"


    public static class id_tail_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "id_tail"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:1: id_tail : ',' id -> ^( id ) ;
    public final MicroParserParser.id_tail_return id_tail() throws RecognitionException {
        MicroParserParser.id_tail_return retval = new MicroParserParser.id_tail_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal25=null;
        MicroParserParser.id_return id26 =null;


        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try { dbg.enterRule(getGrammarFileName(), "id_tail");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:9: ( ',' id -> ^( id ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:11: ',' id
            {
            dbg.location(141,11);
            char_literal25=(Token)match(input,25,FOLLOW_25_in_id_tail323);  
            stream_25.add(char_literal25);

            dbg.location(141,15);
            pushFollow(FOLLOW_id_in_id_tail325);
            id26=id();

            state._fsp--;

            stream_id.add(id26.getTree());
            dbg.location(141,18);
            idList.add((id26!=null?input.toString(id26.start,id26.stop):null));

            // AST REWRITE
            // elements: id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 141:42: -> ^( id )
            {
                dbg.location(141,45);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:45: ^( id )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(141,47);
                root_1 = (Object)adaptor.becomeRoot(stream_id.nextNode(), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(142, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "id_tail");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "id_tail"


    public static class param_decl_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:1: param_decl_list : param_decl ( ',' param_decl )* -> ^( FUNCTION_PARAMS ( param_decl )+ ) ;
    public final MicroParserParser.param_decl_list_return param_decl_list() throws RecognitionException {
        MicroParserParser.param_decl_list_return retval = new MicroParserParser.param_decl_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal28=null;
        MicroParserParser.param_decl_return param_decl27 =null;

        MicroParserParser.param_decl_return param_decl29 =null;


        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleSubtreeStream stream_param_decl=new RewriteRuleSubtreeStream(adaptor,"rule param_decl");
        try { dbg.enterRule(getGrammarFileName(), "param_decl_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(148, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:17: ( param_decl ( ',' param_decl )* -> ^( FUNCTION_PARAMS ( param_decl )+ ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:19: param_decl ( ',' param_decl )*
            {
            dbg.location(148,19);
            pushFollow(FOLLOW_param_decl_in_param_decl_list350);
            param_decl27=param_decl();

            state._fsp--;

            stream_param_decl.add(param_decl27.getTree());
            dbg.location(148,30);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:30: ( ',' param_decl )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:148:31: ',' param_decl
            	    {
            	    dbg.location(148,31);
            	    char_literal28=(Token)match(input,25,FOLLOW_25_in_param_decl_list353);  
            	    stream_25.add(char_literal28);

            	    dbg.location(148,35);
            	    pushFollow(FOLLOW_param_decl_in_param_decl_list355);
            	    param_decl29=param_decl();

            	    state._fsp--;

            	    stream_param_decl.add(param_decl29.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);
            } finally {dbg.exitSubRule(4);}


            // AST REWRITE
            // elements: param_decl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 149:2: -> ^( FUNCTION_PARAMS ( param_decl )+ )
            {
                dbg.location(149,4);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:149:4: ^( FUNCTION_PARAMS ( param_decl )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(149,6);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_PARAMS, "FUNCTION_PARAMS")
                , root_1);

                dbg.location(149,22);
                if ( !(stream_param_decl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_param_decl.hasNext() ) {
                    dbg.location(149,22);
                    adaptor.addChild(root_1, stream_param_decl.nextTree());

                }
                stream_param_decl.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(149, 33);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param_decl_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "param_decl_list"


    public static class param_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:1: param_decl : Var_type ! id ;
    public final MicroParserParser.param_decl_return param_decl() throws RecognitionException {
        MicroParserParser.param_decl_return retval = new MicroParserParser.param_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Var_type30=null;
        MicroParserParser.id_return id31 =null;


        Object Var_type30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "param_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(151, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:12: ( Var_type ! id )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:14: Var_type ! id
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(151,22);
            Var_type30=(Token)match(input,Var_type,FOLLOW_Var_type_in_param_decl374); 
            dbg.location(151,24);
            pushFollow(FOLLOW_id_in_param_decl377);
            id31=id();

            state._fsp--;

            adaptor.addChild(root_0, id31.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(152, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "param_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "param_decl"


    public static class func_declarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_declarations"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:155:1: func_declarations : ( func_decl )* ;
    public final MicroParserParser.func_declarations_return func_declarations() throws RecognitionException {
        MicroParserParser.func_declarations_return retval = new MicroParserParser.func_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.func_decl_return func_decl32 =null;



        try { dbg.enterRule(getGrammarFileName(), "func_declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(155, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:155:19: ( ( func_decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:155:21: ( func_decl )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(155,21);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:155:21: ( func_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==33) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:155:22: func_decl
            	    {
            	    dbg.location(155,22);
            	    pushFollow(FOLLOW_func_decl_in_func_declarations389);
            	    func_decl32=func_decl();

            	    state._fsp--;

            	    adaptor.addChild(root_0, func_decl32.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(156, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_declarations");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "func_declarations"


    public static class func_decl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_decl"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:158:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' -> ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) ) ;
    public final MicroParserParser.func_decl_return func_decl() throws RecognitionException {
        MicroParserParser.func_decl_return retval = new MicroParserParser.func_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal33=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token string_literal39=null;
        Token string_literal41=null;
        MicroParserParser.any_type_return any_type34 =null;

        MicroParserParser.id_return id35 =null;

        MicroParserParser.param_decl_list_return param_decl_list37 =null;

        MicroParserParser.func_body_return func_body40 =null;


        Object string_literal33_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object string_literal39_tree=null;
        Object string_literal41_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_param_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule param_decl_list");
        RewriteRuleSubtreeStream stream_func_body=new RewriteRuleSubtreeStream(adaptor,"rule func_body");
        RewriteRuleSubtreeStream stream_any_type=new RewriteRuleSubtreeStream(adaptor,"rule any_type");
        try { dbg.enterRule(getGrammarFileName(), "func_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(158, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:158:11: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' -> ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:158:13: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            dbg.location(158,13);
            string_literal33=(Token)match(input,33,FOLLOW_33_in_func_decl401);  
            stream_33.add(string_literal33);

            dbg.location(158,24);
            pushFollow(FOLLOW_any_type_in_func_decl403);
            any_type34=any_type();

            state._fsp--;

            stream_any_type.add(any_type34.getTree());
            dbg.location(158,33);
            pushFollow(FOLLOW_id_in_func_decl405);
            id35=id();

            state._fsp--;

            stream_id.add(id35.getTree());
            dbg.location(158,36);
            char_literal36=(Token)match(input,23,FOLLOW_23_in_func_decl407);  
            stream_23.add(char_literal36);

            dbg.location(158,39);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:158:39: ( param_decl_list )?
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:158:39: param_decl_list
                    {
                    dbg.location(158,39);
                    pushFollow(FOLLOW_param_decl_list_in_func_decl408);
                    param_decl_list37=param_decl_list();

                    state._fsp--;

                    stream_param_decl_list.add(param_decl_list37.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(158,55);
            char_literal38=(Token)match(input,24,FOLLOW_24_in_func_decl410);  
            stream_24.add(char_literal38);

            dbg.location(158,59);
            string_literal39=(Token)match(input,28,FOLLOW_28_in_func_decl412);  
            stream_28.add(string_literal39);

            dbg.location(160,1);
            symbolTableId++;
             currentTable = new ArrayList<TableEntry>();
             tableOfTables.put(new Integer(symbolTableId), currentTable);
             tableOfTableNames.put(new Integer(symbolTableId), (id35!=null?input.toString(id35.start,id35.stop):null)); 
            dbg.location(165,1);
            pushFollow(FOLLOW_func_body_in_func_decl422);
            func_body40=func_body();

            state._fsp--;

            stream_func_body.add(func_body40.getTree());
            dbg.location(165,11);
            string_literal41=(Token)match(input,31,FOLLOW_31_in_func_decl424);  
            stream_31.add(string_literal41);

            dbg.location(167,1);
            currentTable = tableOfTables.get(new Integer(0));

            // AST REWRITE
            // elements: param_decl_list, func_body, id, 33
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 167:53: -> ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) )
            {
                dbg.location(167,56);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:167:56: ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(167,58);
                root_1 = (Object)adaptor.becomeRoot(
                stream_33.nextNode()
                , root_1);

                dbg.location(167,69);
                adaptor.addChild(root_1, stream_id.nextTree());
                dbg.location(167,73);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:167:73: ( param_decl_list )?
                if ( stream_param_decl_list.hasNext() ) {
                    dbg.location(167,73);
                    adaptor.addChild(root_1, stream_param_decl_list.nextTree());

                }
                stream_param_decl_list.reset();
                dbg.location(167,90);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:167:90: ^( FUNCTION_BODY func_body )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(167,92);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_BODY, "FUNCTION_BODY")
                , root_2);

                dbg.location(167,106);
                adaptor.addChild(root_2, stream_func_body.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(169, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_decl");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "func_decl"


    public static class func_body_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "func_body"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:171:1: func_body : decl_list stmt_list ;
    public final MicroParserParser.func_body_return func_body() throws RecognitionException {
        MicroParserParser.func_body_return retval = new MicroParserParser.func_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.decl_list_return decl_list42 =null;

        MicroParserParser.stmt_list_return stmt_list43 =null;



        try { dbg.enterRule(getGrammarFileName(), "func_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(171, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:171:11: ( decl_list stmt_list )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:171:13: decl_list stmt_list
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(171,13);
            pushFollow(FOLLOW_decl_list_in_func_body461);
            decl_list42=decl_list();

            state._fsp--;

            adaptor.addChild(root_0, decl_list42.getTree());
            dbg.location(171,23);
            pushFollow(FOLLOW_stmt_list_in_func_body463);
            stmt_list43=stmt_list();

            state._fsp--;

            adaptor.addChild(root_0, stmt_list43.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(172, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "func_body");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "func_body"


    public static class stmt_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:175:1: stmt_list : ( stmt )* ;
    public final MicroParserParser.stmt_list_return stmt_list() throws RecognitionException {
        MicroParserParser.stmt_list_return retval = new MicroParserParser.stmt_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.stmt_return stmt44 =null;



        try { dbg.enterRule(getGrammarFileName(), "stmt_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(175, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:175:11: ( ( stmt )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:175:13: ( stmt )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(175,13);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:175:13: ( stmt )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER||LA7_0==29||LA7_0==34||(LA7_0 >= 36 && LA7_0 <= 37)||LA7_0==42) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:175:14: stmt
            	    {
            	    dbg.location(175,14);
            	    pushFollow(FOLLOW_stmt_in_stmt_list475);
            	    stmt44=stmt();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stmt44.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(176, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt_list"


    public static class stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:1: stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt );
    public final MicroParserParser.stmt_return stmt() throws RecognitionException {
        MicroParserParser.stmt_return retval = new MicroParserParser.stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.assign_stmt_return assign_stmt45 =null;

        MicroParserParser.read_stmt_return read_stmt46 =null;

        MicroParserParser.write_stmt_return write_stmt47 =null;

        MicroParserParser.return_stmt_return return_stmt48 =null;

        MicroParserParser.if_stmt_return if_stmt49 =null;

        MicroParserParser.do_stmt_return do_stmt50 =null;



        try { dbg.enterRule(getGrammarFileName(), "stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(178, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:6: ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt )
            int alt8=6;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 42:
                {
                alt8=3;
                }
                break;
            case 37:
                {
                alt8=4;
                }
                break;
            case 34:
                {
                alt8=5;
                }
                break;
            case 29:
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:8: assign_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,8);
                    pushFollow(FOLLOW_assign_stmt_in_stmt487);
                    assign_stmt45=assign_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_stmt45.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:22: read_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,22);
                    pushFollow(FOLLOW_read_stmt_in_stmt491);
                    read_stmt46=read_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, read_stmt46.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:34: write_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,34);
                    pushFollow(FOLLOW_write_stmt_in_stmt495);
                    write_stmt47=write_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, write_stmt47.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:47: return_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,47);
                    pushFollow(FOLLOW_return_stmt_in_stmt499);
                    return_stmt48=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt48.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:61: if_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,61);
                    pushFollow(FOLLOW_if_stmt_in_stmt503);
                    if_stmt49=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt49.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:178:71: do_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(178,71);
                    pushFollow(FOLLOW_do_stmt_in_stmt507);
                    do_stmt50=do_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, do_stmt50.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(179, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "stmt"


    public static class assign_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:182:1: assign_stmt : assign_expr ';' !;
    public final MicroParserParser.assign_stmt_return assign_stmt() throws RecognitionException {
        MicroParserParser.assign_stmt_return retval = new MicroParserParser.assign_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal52=null;
        MicroParserParser.assign_expr_return assign_expr51 =null;


        Object char_literal52_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "assign_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(182, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:182:13: ( assign_expr ';' !)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:182:15: assign_expr ';' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(182,15);
            pushFollow(FOLLOW_assign_expr_in_assign_stmt518);
            assign_expr51=assign_expr();

            state._fsp--;

            adaptor.addChild(root_0, assign_expr51.getTree());
            dbg.location(182,30);
            char_literal52=(Token)match(input,27,FOLLOW_27_in_assign_stmt520); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(183, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assign_stmt"


    public static class assign_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:185:1: assign_expr : id ':=' expr -> ^( ':=' id expr ) ;
    public final MicroParserParser.assign_expr_return assign_expr() throws RecognitionException {
        MicroParserParser.assign_expr_return retval = new MicroParserParser.assign_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal54=null;
        MicroParserParser.id_return id53 =null;

        MicroParserParser.expr_return expr55 =null;


        Object string_literal54_tree=null;
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "assign_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(185, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:185:13: ( id ':=' expr -> ^( ':=' id expr ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:185:15: id ':=' expr
            {
            dbg.location(185,15);
            pushFollow(FOLLOW_id_in_assign_expr531);
            id53=id();

            state._fsp--;

            stream_id.add(id53.getTree());
            dbg.location(185,18);
            string_literal54=(Token)match(input,26,FOLLOW_26_in_assign_expr533);  
            stream_26.add(string_literal54);

            dbg.location(185,23);
            pushFollow(FOLLOW_expr_in_assign_expr535);
            expr55=expr();

            state._fsp--;

            stream_expr.add(expr55.getTree());

            // AST REWRITE
            // elements: id, expr, 26
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 185:28: -> ^( ':=' id expr )
            {
                dbg.location(185,31);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:185:31: ^( ':=' id expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(185,33);
                root_1 = (Object)adaptor.becomeRoot(
                stream_26.nextNode()
                , root_1);

                dbg.location(185,38);
                adaptor.addChild(root_1, stream_id.nextTree());
                dbg.location(185,41);
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(186, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "assign_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "assign_expr"


    public static class read_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:188:1: read_stmt : 'READ' '(' id_list ')' ';' -> ^( 'READ' id_list ) ;
    public final MicroParserParser.read_stmt_return read_stmt() throws RecognitionException {
        MicroParserParser.read_stmt_return retval = new MicroParserParser.read_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal56=null;
        Token char_literal57=null;
        Token char_literal59=null;
        Token char_literal60=null;
        MicroParserParser.id_list_return id_list58 =null;


        Object string_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try { dbg.enterRule(getGrammarFileName(), "read_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(188, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:188:11: ( 'READ' '(' id_list ')' ';' -> ^( 'READ' id_list ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:188:13: 'READ' '(' id_list ')' ';'
            {
            dbg.location(188,13);
            string_literal56=(Token)match(input,36,FOLLOW_36_in_read_stmt555);  
            stream_36.add(string_literal56);

            dbg.location(188,20);
            char_literal57=(Token)match(input,23,FOLLOW_23_in_read_stmt557);  
            stream_23.add(char_literal57);

            dbg.location(188,24);
            pushFollow(FOLLOW_id_list_in_read_stmt559);
            id_list58=id_list();

            state._fsp--;

            stream_id_list.add(id_list58.getTree());
            dbg.location(188,32);
            char_literal59=(Token)match(input,24,FOLLOW_24_in_read_stmt561);  
            stream_24.add(char_literal59);

            dbg.location(188,35);
            char_literal60=(Token)match(input,27,FOLLOW_27_in_read_stmt562);  
            stream_27.add(char_literal60);


            // AST REWRITE
            // elements: id_list, 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 188:39: -> ^( 'READ' id_list )
            {
                dbg.location(188,42);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:188:42: ^( 'READ' id_list )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(188,44);
                root_1 = (Object)adaptor.becomeRoot(
                stream_36.nextNode()
                , root_1);

                dbg.location(188,51);
                adaptor.addChild(root_1, stream_id_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(189, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read_stmt"


    public static class write_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "write_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:191:1: write_stmt : 'WRITE' '(' id_list ')' ';' -> ^( 'WRITE' id_list ) ;
    public final MicroParserParser.write_stmt_return write_stmt() throws RecognitionException {
        MicroParserParser.write_stmt_return retval = new MicroParserParser.write_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal61=null;
        Token char_literal62=null;
        Token char_literal64=null;
        Token char_literal65=null;
        MicroParserParser.id_list_return id_list63 =null;


        Object string_literal61_tree=null;
        Object char_literal62_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try { dbg.enterRule(getGrammarFileName(), "write_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(191, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:191:12: ( 'WRITE' '(' id_list ')' ';' -> ^( 'WRITE' id_list ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:191:14: 'WRITE' '(' id_list ')' ';'
            {
            dbg.location(191,14);
            string_literal61=(Token)match(input,42,FOLLOW_42_in_write_stmt580);  
            stream_42.add(string_literal61);

            dbg.location(191,22);
            char_literal62=(Token)match(input,23,FOLLOW_23_in_write_stmt582);  
            stream_23.add(char_literal62);

            dbg.location(191,26);
            pushFollow(FOLLOW_id_list_in_write_stmt584);
            id_list63=id_list();

            state._fsp--;

            stream_id_list.add(id_list63.getTree());
            dbg.location(191,34);
            char_literal64=(Token)match(input,24,FOLLOW_24_in_write_stmt586);  
            stream_24.add(char_literal64);

            dbg.location(191,37);
            char_literal65=(Token)match(input,27,FOLLOW_27_in_write_stmt587);  
            stream_27.add(char_literal65);


            // AST REWRITE
            // elements: 42, id_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 191:40: -> ^( 'WRITE' id_list )
            {
                dbg.location(191,43);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:191:43: ^( 'WRITE' id_list )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(191,45);
                root_1 = (Object)adaptor.becomeRoot(
                stream_42.nextNode()
                , root_1);

                dbg.location(191,53);
                adaptor.addChild(root_1, stream_id_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(192, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "write_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "write_stmt"


    public static class return_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:194:1: return_stmt : 'RETURN' expr ';' -> ^( 'RETURN' expr ) ;
    public final MicroParserParser.return_stmt_return return_stmt() throws RecognitionException {
        MicroParserParser.return_stmt_return retval = new MicroParserParser.return_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal66=null;
        Token char_literal68=null;
        MicroParserParser.expr_return expr67 =null;


        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(194, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:194:13: ( 'RETURN' expr ';' -> ^( 'RETURN' expr ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:194:15: 'RETURN' expr ';'
            {
            dbg.location(194,15);
            string_literal66=(Token)match(input,37,FOLLOW_37_in_return_stmt604);  
            stream_37.add(string_literal66);

            dbg.location(194,24);
            pushFollow(FOLLOW_expr_in_return_stmt606);
            expr67=expr();

            state._fsp--;

            stream_expr.add(expr67.getTree());
            dbg.location(194,29);
            char_literal68=(Token)match(input,27,FOLLOW_27_in_return_stmt608);  
            stream_27.add(char_literal68);


            // AST REWRITE
            // elements: 37, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 195:2: -> ^( 'RETURN' expr )
            {
                dbg.location(195,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:195:5: ^( 'RETURN' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(195,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_37.nextNode()
                , root_1);

                dbg.location(195,16);
                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(195, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "return_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "return_stmt"


    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:198:1: expr : factor ( Addop ^ factor )* ;
    public final MicroParserParser.expr_return expr() throws RecognitionException {
        MicroParserParser.expr_return retval = new MicroParserParser.expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Addop70=null;
        MicroParserParser.factor_return factor69 =null;

        MicroParserParser.factor_return factor71 =null;


        Object Addop70_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(198, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:198:6: ( factor ( Addop ^ factor )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:198:8: factor ( Addop ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(198,8);
            pushFollow(FOLLOW_factor_in_expr626);
            factor69=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor69.getTree());
            dbg.location(198,16);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:198:16: ( Addop ^ factor )*
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

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:198:17: Addop ^ factor
            	    {
            	    dbg.location(198,23);
            	    Addop70=(Token)match(input,Addop,FOLLOW_Addop_in_expr630); 
            	    Addop70_tree = 
            	    (Object)adaptor.create(Addop70)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(Addop70_tree, root_0);

            	    dbg.location(198,24);
            	    pushFollow(FOLLOW_factor_in_expr633);
            	    factor71=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor71.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);
            } finally {dbg.exitSubRule(9);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(199, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:201:1: factor : postfix_expr ( Mulop ^ postfix_expr )* ;
    public final MicroParserParser.factor_return factor() throws RecognitionException {
        MicroParserParser.factor_return retval = new MicroParserParser.factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Mulop73=null;
        MicroParserParser.postfix_expr_return postfix_expr72 =null;

        MicroParserParser.postfix_expr_return postfix_expr74 =null;


        Object Mulop73_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "factor");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(201, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:201:8: ( postfix_expr ( Mulop ^ postfix_expr )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:201:10: postfix_expr ( Mulop ^ postfix_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(201,10);
            pushFollow(FOLLOW_postfix_expr_in_factor646);
            postfix_expr72=postfix_expr();

            state._fsp--;

            adaptor.addChild(root_0, postfix_expr72.getTree());
            dbg.location(201,23);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:201:23: ( Mulop ^ postfix_expr )*
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

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:201:24: Mulop ^ postfix_expr
            	    {
            	    dbg.location(201,30);
            	    Mulop73=(Token)match(input,Mulop,FOLLOW_Mulop_in_factor649); 
            	    Mulop73_tree = 
            	    (Object)adaptor.create(Mulop73)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(Mulop73_tree, root_0);

            	    dbg.location(201,31);
            	    pushFollow(FOLLOW_postfix_expr_in_factor652);
            	    postfix_expr74=postfix_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, postfix_expr74.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);
            } finally {dbg.exitSubRule(10);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(202, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "factor");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "factor"


    public static class postfix_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfix_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:204:1: postfix_expr : ( primary | call_expr );
    public final MicroParserParser.postfix_expr_return postfix_expr() throws RecognitionException {
        MicroParserParser.postfix_expr_return retval = new MicroParserParser.postfix_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.primary_return primary75 =null;

        MicroParserParser.call_expr_return call_expr76 =null;



        try { dbg.enterRule(getGrammarFileName(), "postfix_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(204, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:204:14: ( primary | call_expr )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==FLOATLITERAL||LA11_0==INTLITERAL||LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==Addop||LA11_2==Compop||LA11_2==Mulop||(LA11_2 >= 24 && LA11_2 <= 25)||LA11_2==27) ) {
                    alt11=1;
                }
                else if ( (LA11_2==23) ) {
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:204:16: primary
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,16);
                    pushFollow(FOLLOW_primary_in_postfix_expr664);
                    primary75=primary();

                    state._fsp--;

                    adaptor.addChild(root_0, primary75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:204:26: call_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(204,26);
                    pushFollow(FOLLOW_call_expr_in_postfix_expr668);
                    call_expr76=call_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, call_expr76.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(205, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "postfix_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "postfix_expr"


    public static class call_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "call_expr"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:207:1: call_expr : id '(' ! ( expr_list )? ')' !;
    public final MicroParserParser.call_expr_return call_expr() throws RecognitionException {
        MicroParserParser.call_expr_return retval = new MicroParserParser.call_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal78=null;
        Token char_literal80=null;
        MicroParserParser.id_return id77 =null;

        MicroParserParser.expr_list_return expr_list79 =null;


        Object char_literal78_tree=null;
        Object char_literal80_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "call_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(207, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:207:11: ( id '(' ! ( expr_list )? ')' !)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:207:13: id '(' ! ( expr_list )? ')' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(207,13);
            pushFollow(FOLLOW_id_in_call_expr678);
            id77=id();

            state._fsp--;

            adaptor.addChild(root_0, id77.getTree());
            dbg.location(207,19);
            char_literal78=(Token)match(input,23,FOLLOW_23_in_call_expr680); 
            dbg.location(207,20);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:207:20: ( expr_list )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==FLOATLITERAL||LA12_0==IDENTIFIER||LA12_0==INTLITERAL||LA12_0==23) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:207:21: expr_list
                    {
                    dbg.location(207,21);
                    pushFollow(FOLLOW_expr_list_in_call_expr683);
                    expr_list79=expr_list();

                    state._fsp--;

                    adaptor.addChild(root_0, expr_list79.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(207,36);
            char_literal80=(Token)match(input,24,FOLLOW_24_in_call_expr687); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(208, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "call_expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "call_expr"


    public static class expr_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr_list"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:210:1: expr_list : expr ( ',' expr )* ;
    public final MicroParserParser.expr_list_return expr_list() throws RecognitionException {
        MicroParserParser.expr_list_return retval = new MicroParserParser.expr_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        MicroParserParser.expr_return expr81 =null;

        MicroParserParser.expr_return expr83 =null;


        Object char_literal82_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(210, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:210:11: ( expr ( ',' expr )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:210:13: expr ( ',' expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(210,13);
            pushFollow(FOLLOW_expr_in_expr_list698);
            expr81=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr81.getTree());
            dbg.location(210,18);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:210:18: ( ',' expr )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:210:19: ',' expr
            	    {
            	    dbg.location(210,19);
            	    char_literal82=(Token)match(input,25,FOLLOW_25_in_expr_list701); 
            	    char_literal82_tree = 
            	    (Object)adaptor.create(char_literal82)
            	    ;
            	    adaptor.addChild(root_0, char_literal82_tree);

            	    dbg.location(210,23);
            	    pushFollow(FOLLOW_expr_in_expr_list703);
            	    expr83=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr83.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(211, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr_list");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr_list"


    public static class primary_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:1: primary : ( '(' ! expr ')' !| id | INTLITERAL | FLOATLITERAL );
    public final MicroParserParser.primary_return primary() throws RecognitionException {
        MicroParserParser.primary_return retval = new MicroParserParser.primary_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal84=null;
        Token char_literal86=null;
        Token INTLITERAL88=null;
        Token FLOATLITERAL89=null;
        MicroParserParser.expr_return expr85 =null;

        MicroParserParser.id_return id87 =null;


        Object char_literal84_tree=null;
        Object char_literal86_tree=null;
        Object INTLITERAL88_tree=null;
        Object FLOATLITERAL89_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "primary");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(213, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:9: ( '(' ! expr ')' !| id | INTLITERAL | FLOATLITERAL )
            int alt14=4;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            switch ( input.LA(1) ) {
            case 23:
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:11: '(' ! expr ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,14);
                    char_literal84=(Token)match(input,23,FOLLOW_23_in_primary715); 
                    dbg.location(213,15);
                    pushFollow(FOLLOW_expr_in_primary717);
                    expr85=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr85.getTree());
                    dbg.location(213,22);
                    char_literal86=(Token)match(input,24,FOLLOW_24_in_primary718); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:26: id
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,26);
                    pushFollow(FOLLOW_id_in_primary723);
                    id87=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id87.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:31: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,31);
                    INTLITERAL88=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary727); 
                    INTLITERAL88_tree = 
                    (Object)adaptor.create(INTLITERAL88)
                    ;
                    adaptor.addChild(root_0, INTLITERAL88_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:44: FLOATLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(213,44);
                    FLOATLITERAL89=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary731); 
                    FLOATLITERAL89_tree = 
                    (Object)adaptor.create(FLOATLITERAL89)
                    ;
                    adaptor.addChild(root_0, FLOATLITERAL89_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(214, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "primary");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "primary"


    public static class if_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:223:1: if_stmt : 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' -> ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? ) ;
    public final MicroParserParser.if_stmt_return if_stmt() throws RecognitionException {
        MicroParserParser.if_stmt_return retval = new MicroParserParser.if_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal90=null;
        Token char_literal91=null;
        Token char_literal93=null;
        Token string_literal94=null;
        Token string_literal97=null;
        MicroParserParser.cond_return cond92 =null;

        MicroParserParser.stmt_list_return stmt_list95 =null;

        MicroParserParser.else_part_return else_part96 =null;


        Object string_literal90_tree=null;
        Object char_literal91_tree=null;
        Object char_literal93_tree=null;
        Object string_literal94_tree=null;
        Object string_literal97_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_else_part=new RewriteRuleSubtreeStream(adaptor,"rule else_part");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        try { dbg.enterRule(getGrammarFileName(), "if_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(223, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:223:9: ( 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' -> ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:223:11: 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF'
            {
            dbg.location(223,11);
            string_literal90=(Token)match(input,34,FOLLOW_34_in_if_stmt770);  
            stream_34.add(string_literal90);

            dbg.location(223,16);
            char_literal91=(Token)match(input,23,FOLLOW_23_in_if_stmt772);  
            stream_23.add(char_literal91);

            dbg.location(223,20);
            pushFollow(FOLLOW_cond_in_if_stmt774);
            cond92=cond();

            state._fsp--;

            stream_cond.add(cond92.getTree());
            dbg.location(223,25);
            char_literal93=(Token)match(input,24,FOLLOW_24_in_if_stmt776);  
            stream_24.add(char_literal93);

            dbg.location(223,29);
            string_literal94=(Token)match(input,39,FOLLOW_39_in_if_stmt778);  
            stream_39.add(string_literal94);

            dbg.location(223,36);
            pushFollow(FOLLOW_stmt_list_in_if_stmt780);
            stmt_list95=stmt_list();

            state._fsp--;

            stream_stmt_list.add(stmt_list95.getTree());
            dbg.location(223,46);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:223:46: ( else_part )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:223:47: else_part
                    {
                    dbg.location(223,47);
                    pushFollow(FOLLOW_else_part_in_if_stmt783);
                    else_part96=else_part();

                    state._fsp--;

                    stream_else_part.add(else_part96.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(223,60);
            string_literal97=(Token)match(input,32,FOLLOW_32_in_if_stmt788);  
            stream_32.add(string_literal97);


            // AST REWRITE
            // elements: else_part, stmt_list, cond, 34
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:2: -> ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? )
            {
                dbg.location(224,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:224:5: ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(224,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_34.nextNode()
                , root_1);

                dbg.location(224,12);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:224:12: ^( IF_COND cond )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(224,14);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_COND, "IF_COND")
                , root_2);

                dbg.location(224,22);
                adaptor.addChild(root_2, stream_cond.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(224,28);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:224:28: ^( IF_MAIN stmt_list )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(224,30);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_MAIN, "IF_MAIN")
                , root_2);

                dbg.location(224,38);
                adaptor.addChild(root_2, stream_stmt_list.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(224,49);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:224:49: ( ^( IF_ELSE else_part ) )?
                if ( stream_else_part.hasNext() ) {
                    dbg.location(224,49);
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:224:49: ^( IF_ELSE else_part )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(224,51);
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(IF_ELSE, "IF_ELSE")
                    , root_2);

                    dbg.location(224,59);
                    adaptor.addChild(root_2, stream_else_part.nextTree());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_else_part.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(224, 70);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "if_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "if_stmt"


    public static class else_part_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "else_part"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:1: else_part : 'ELSE' stmt_list -> stmt_list ;
    public final MicroParserParser.else_part_return else_part() throws RecognitionException {
        MicroParserParser.else_part_return retval = new MicroParserParser.else_part_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal98=null;
        MicroParserParser.stmt_list_return stmt_list99 =null;


        Object string_literal98_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        try { dbg.enterRule(getGrammarFileName(), "else_part");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(226, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:11: ( 'ELSE' stmt_list -> stmt_list )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:13: 'ELSE' stmt_list
            {
            dbg.location(226,13);
            string_literal98=(Token)match(input,30,FOLLOW_30_in_else_part822);  
            stream_30.add(string_literal98);

            dbg.location(226,20);
            pushFollow(FOLLOW_stmt_list_in_else_part824);
            stmt_list99=stmt_list();

            state._fsp--;

            stream_stmt_list.add(stmt_list99.getTree());

            // AST REWRITE
            // elements: stmt_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:2: -> stmt_list
            {
                dbg.location(227,5);
                adaptor.addChild(root_0, stream_stmt_list.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(227, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "else_part");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "else_part"


    public static class cond_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cond"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:229:1: cond : expr Compop ^ expr ;
    public final MicroParserParser.cond_return cond() throws RecognitionException {
        MicroParserParser.cond_return retval = new MicroParserParser.cond_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Compop101=null;
        MicroParserParser.expr_return expr100 =null;

        MicroParserParser.expr_return expr102 =null;


        Object Compop101_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "cond");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(229, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:229:6: ( expr Compop ^ expr )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:229:8: expr Compop ^ expr
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(229,8);
            pushFollow(FOLLOW_expr_in_cond837);
            expr100=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr100.getTree());
            dbg.location(229,19);
            Compop101=(Token)match(input,Compop,FOLLOW_Compop_in_cond839); 
            Compop101_tree = 
            (Object)adaptor.create(Compop101)
            ;
            root_0 = (Object)adaptor.becomeRoot(Compop101_tree, root_0);

            dbg.location(229,21);
            pushFollow(FOLLOW_expr_in_cond842);
            expr102=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr102.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(229, 24);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "cond");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "cond"


    public static class do_stmt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "do_stmt"
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:234:1: do_stmt : 'DO' stmt_list 'WHILE' '(' cond ')' ';' -> ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) ) ;
    public final MicroParserParser.do_stmt_return do_stmt() throws RecognitionException {
        MicroParserParser.do_stmt_return retval = new MicroParserParser.do_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal103=null;
        Token string_literal105=null;
        Token char_literal106=null;
        Token char_literal108=null;
        Token char_literal109=null;
        MicroParserParser.stmt_list_return stmt_list104 =null;

        MicroParserParser.cond_return cond107 =null;


        Object string_literal103_tree=null;
        Object string_literal105_tree=null;
        Object char_literal106_tree=null;
        Object char_literal108_tree=null;
        Object char_literal109_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        try { dbg.enterRule(getGrammarFileName(), "do_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(234, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:234:9: ( 'DO' stmt_list 'WHILE' '(' cond ')' ';' -> ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:234:11: 'DO' stmt_list 'WHILE' '(' cond ')' ';'
            {
            dbg.location(234,11);
            string_literal103=(Token)match(input,29,FOLLOW_29_in_do_stmt872);  
            stream_29.add(string_literal103);

            dbg.location(234,16);
            pushFollow(FOLLOW_stmt_list_in_do_stmt874);
            stmt_list104=stmt_list();

            state._fsp--;

            stream_stmt_list.add(stmt_list104.getTree());
            dbg.location(234,26);
            string_literal105=(Token)match(input,41,FOLLOW_41_in_do_stmt876);  
            stream_41.add(string_literal105);

            dbg.location(234,34);
            char_literal106=(Token)match(input,23,FOLLOW_23_in_do_stmt878);  
            stream_23.add(char_literal106);

            dbg.location(234,38);
            pushFollow(FOLLOW_cond_in_do_stmt880);
            cond107=cond();

            state._fsp--;

            stream_cond.add(cond107.getTree());
            dbg.location(234,43);
            char_literal108=(Token)match(input,24,FOLLOW_24_in_do_stmt882);  
            stream_24.add(char_literal108);

            dbg.location(234,46);
            char_literal109=(Token)match(input,27,FOLLOW_27_in_do_stmt883);  
            stream_27.add(char_literal109);


            // AST REWRITE
            // elements: 29, stmt_list, cond
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 235:2: -> ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) )
            {
                dbg.location(235,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:235:5: ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(235,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_29.nextNode()
                , root_1);

                dbg.location(235,12);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:235:12: ^( DO_MAIN stmt_list )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(235,14);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DO_MAIN, "DO_MAIN")
                , root_2);

                dbg.location(235,22);
                adaptor.addChild(root_2, stream_stmt_list.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(235,33);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:235:33: ^( DO_COND cond )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(235,35);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DO_COND, "DO_COND")
                , root_2);

                dbg.location(235,43);
                adaptor.addChild(root_2, stream_cond.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        dbg.location(235, 49);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "do_stmt");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "do_stmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_35_in_program127 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_in_program129 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_program131 = new BitSet(new long[]{0x0000004200200000L});
    public static final BitSet FOLLOW_pgm_body_in_program138 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_program140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_pgm_body171 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decl_list185 = new BitSet(new long[]{0x0000004000200002L});
    public static final BitSet FOLLOW_string_decl_in_decl196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_string_decl212 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_in_string_decl214 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_string_decl216 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_str_in_string_decl218 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_string_decl220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_str234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_var_decl249 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_list_in_var_decl251 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_var_decl256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list306 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_id_tail_in_id_list310 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_id_tail323 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_in_id_tail325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list350 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_param_decl_list353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list355 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Var_type_in_param_decl374 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_in_param_decl377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations389 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_func_decl401 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_any_type_in_func_decl403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_in_func_decl405 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_func_decl407 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl408 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_func_decl410 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_func_decl412 = new BitSet(new long[]{0x0000047420201000L});
    public static final BitSet FOLLOW_func_body_in_func_decl422 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_func_decl424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_func_body461 = new BitSet(new long[]{0x0000043420001000L});
    public static final BitSet FOLLOW_stmt_list_in_func_body463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list475 = new BitSet(new long[]{0x0000043420001002L});
    public static final BitSet FOLLOW_assign_stmt_in_stmt487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_stmt491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_stmt495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_stmt_in_stmt507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt518 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_assign_stmt520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr531 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_assign_expr533 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_expr_in_assign_expr535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_read_stmt555 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_read_stmt557 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_list_in_read_stmt559 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_read_stmt561 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_read_stmt562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_write_stmt580 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_write_stmt582 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_id_list_in_write_stmt584 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_write_stmt586 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_write_stmt587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_return_stmt604 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_expr_in_return_stmt606 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_return_stmt608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr626 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Addop_in_expr630 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_factor_in_expr633 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_postfix_expr_in_factor646 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_Mulop_in_factor649 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_postfix_expr_in_factor652 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_primary_in_postfix_expr664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr678 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_call_expr680 = new BitSet(new long[]{0x0000000001811200L});
    public static final BitSet FOLLOW_expr_list_in_call_expr683 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_call_expr687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list698 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_expr_list701 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_expr_in_expr_list703 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23_in_primary715 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_expr_in_primary717 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_primary718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_if_stmt770 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_if_stmt772 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_cond_in_if_stmt774 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_if_stmt776 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_if_stmt778 = new BitSet(new long[]{0x0000043560001000L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt780 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt783 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_if_stmt788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_else_part822 = new BitSet(new long[]{0x0000043420001000L});
    public static final BitSet FOLLOW_stmt_list_in_else_part824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond837 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Compop_in_cond839 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_expr_in_cond842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_do_stmt872 = new BitSet(new long[]{0x0000063420001000L});
    public static final BitSet FOLLOW_stmt_list_in_do_stmt874 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_do_stmt876 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_do_stmt878 = new BitSet(new long[]{0x0000000000811200L});
    public static final BitSet FOLLOW_cond_in_do_stmt880 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_do_stmt882 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_do_stmt883 = new BitSet(new long[]{0x0000000000000002L});

}