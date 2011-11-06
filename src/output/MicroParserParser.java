// $ANTLR 3.4 /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g 2011-11-06 16:09:48

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Addop", "COMMENT", "Compop", "DO_COND", "DO_MAIN", "FLOATLITERAL", "FUNCTION_BODY", "FUNCTION_CALL", "FUNCTION_PARAMS", "IDENTIFIER", "IF_COND", "IF_ELSE", "IF_MAIN", "INTLITERAL", "LABEL", "Mulop", "PARAM", "Program_start", "STRINGLITERAL", "Var_type", "WS", "'('", "')'", "','", "':='", "';'", "'BEGIN'", "'DO'", "'ELSE'", "'END'", "'ENDIF'", "'FUNCTION'", "'IF'", "'PROGRAM'", "'READ'", "'RETURN'", "'STRING'", "'THEN'", "'VOID'", "'WHILE'", "'WRITE'"
    };

    public static final int EOF=-1;
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
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int Addop=4;
    public static final int COMMENT=5;
    public static final int Compop=6;
    public static final int DO_COND=7;
    public static final int DO_MAIN=8;
    public static final int FLOATLITERAL=9;
    public static final int FUNCTION_BODY=10;
    public static final int FUNCTION_CALL=11;
    public static final int FUNCTION_PARAMS=12;
    public static final int IDENTIFIER=13;
    public static final int IF_COND=14;
    public static final int IF_ELSE=15;
    public static final int IF_MAIN=16;
    public static final int INTLITERAL=17;
    public static final int LABEL=18;
    public static final int Mulop=19;
    public static final int PARAM=20;
    public static final int Program_start=21;
    public static final int STRINGLITERAL=22;
    public static final int Var_type=23;
    public static final int WS=24;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "postfix_expr", "read_stmt", "cond", "pgm_body", "primary", 
    "var_decl", "decl_list", "expr_list", "assign_expr", "func_body", "stmt_list", 
    "str", "program", "expr", "factor", "id", "stmt", "func_declarations", 
    "else_part", "decl", "assign_stmt", "func_decl", "do_stmt", "id_tail", 
    "if_stmt", "string_decl", "return_stmt", "call_expr", "param_decl_list", 
    "id_list", "any_type", "param_decl", "write_stmt"
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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF -> ^( 'PROGRAM' pgm_body ) ;
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
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_pgm_body=new RewriteRuleSubtreeStream(adaptor,"rule pgm_body");
        try { dbg.enterRule(getGrammarFileName(), "program");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(98, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:9: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF -> ^( 'PROGRAM' pgm_body ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:98:12: 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
            {
            dbg.location(98,12);
            string_literal1=(Token)match(input,37,FOLLOW_37_in_program149);  
            stream_37.add(string_literal1);

            dbg.location(98,22);
            pushFollow(FOLLOW_id_in_program151);
            id2=id();

            state._fsp--;

            stream_id.add(id2.getTree());
            dbg.location(98,25);
            string_literal3=(Token)match(input,30,FOLLOW_30_in_program153);  
            stream_30.add(string_literal3);

            dbg.location(99,2);
             	tableOfTables.put(new Integer(symbolTableId), currentTable);
            		tableOfTableNames.put(new Integer(symbolTableId), "Global");
            dbg.location(101,3);
            pushFollow(FOLLOW_pgm_body_in_program160);
            pgm_body4=pgm_body();

            state._fsp--;

            stream_pgm_body.add(pgm_body4.getTree());
            dbg.location(101,12);
            string_literal5=(Token)match(input,33,FOLLOW_33_in_program162);  
            stream_33.add(string_literal5);

            dbg.location(101,18);
            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_program164);  
            stream_EOF.add(EOF6);


            // AST REWRITE
            // elements: 37, pgm_body
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:2: -> ^( 'PROGRAM' pgm_body )
            {
                dbg.location(102,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:102:5: ^( 'PROGRAM' pgm_body )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(102,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_37.nextNode()
                , root_1);

                dbg.location(102,17);
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
        dbg.location(102, 25);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:104:1: id : IDENTIFIER {...}?;
    public final MicroParserParser.id_return id() throws RecognitionException {
        MicroParserParser.id_return retval = new MicroParserParser.id_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER7=null;

        Object IDENTIFIER7_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "id");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(104, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:104:4: ( IDENTIFIER {...}?)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:104:6: IDENTIFIER {...}?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(104,6);
            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id181); 
            IDENTIFIER7_tree = 
            (Object)adaptor.create(IDENTIFIER7)
            ;
            adaptor.addChild(root_0, IDENTIFIER7_tree);

            dbg.location(104,17);
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
        dbg.location(105, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:107:1: pgm_body : decl_list func_declarations ;
    public final MicroParserParser.pgm_body_return pgm_body() throws RecognitionException {
        MicroParserParser.pgm_body_return retval = new MicroParserParser.pgm_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.decl_list_return decl_list8 =null;

        MicroParserParser.func_declarations_return func_declarations9 =null;



        try { dbg.enterRule(getGrammarFileName(), "pgm_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(107, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:107:10: ( decl_list func_declarations )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:107:12: decl_list func_declarations
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(107,12);
            pushFollow(FOLLOW_decl_list_in_pgm_body193);
            decl_list8=decl_list();

            state._fsp--;

            adaptor.addChild(root_0, decl_list8.getTree());
            dbg.location(107,22);
            pushFollow(FOLLOW_func_declarations_in_pgm_body195);
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
        dbg.location(108, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:110:1: decl_list : ( decl )* ;
    public final MicroParserParser.decl_list_return decl_list() throws RecognitionException {
        MicroParserParser.decl_list_return retval = new MicroParserParser.decl_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.decl_return decl10 =null;



        try { dbg.enterRule(getGrammarFileName(), "decl_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(110, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:2: ( ( decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:4: ( decl )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(111,4);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:4: ( decl )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var_type||LA1_0==40) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:111:4: decl
            	    {
            	    dbg.location(111,4);
            	    pushFollow(FOLLOW_decl_in_decl_list207);
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
        dbg.location(112, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:1: decl : ( string_decl | var_decl );
    public final MicroParserParser.decl_return decl() throws RecognitionException {
        MicroParserParser.decl_return retval = new MicroParserParser.decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.string_decl_return string_decl11 =null;

        MicroParserParser.var_decl_return var_decl12 =null;



        try { dbg.enterRule(getGrammarFileName(), "decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(114, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:6: ( string_decl | var_decl )
            int alt2=2;
            try { dbg.enterDecision(2, decisionCanBacktrack[2]);

            int LA2_0 = input.LA(1);

            if ( (LA2_0==40) ) {
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:8: string_decl
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(114,8);
                    pushFollow(FOLLOW_string_decl_in_decl218);
                    string_decl11=string_decl();

                    state._fsp--;

                    adaptor.addChild(root_0, string_decl11.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:114:23: var_decl
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(114,23);
                    pushFollow(FOLLOW_var_decl_in_decl223);
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
        dbg.location(115, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:1: string_decl : 'STRING' id ':=' str ';' ->;
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
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_str=new RewriteRuleSubtreeStream(adaptor,"rule str");
        try { dbg.enterRule(getGrammarFileName(), "string_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(117, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:13: ( 'STRING' id ':=' str ';' ->)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:117:15: 'STRING' id ':=' str ';'
            {
            dbg.location(117,15);
            string_literal13=(Token)match(input,40,FOLLOW_40_in_string_decl234);  
            stream_40.add(string_literal13);

            dbg.location(117,24);
            pushFollow(FOLLOW_id_in_string_decl236);
            id14=id();

            state._fsp--;

            stream_id.add(id14.getTree());
            dbg.location(117,27);
            string_literal15=(Token)match(input,28,FOLLOW_28_in_string_decl238);  
            stream_28.add(string_literal15);

            dbg.location(117,32);
            pushFollow(FOLLOW_str_in_string_decl240);
            str16=str();

            state._fsp--;

            stream_str.add(str16.getTree());
            dbg.location(117,36);
            char_literal17=(Token)match(input,29,FOLLOW_29_in_string_decl242);  
            stream_29.add(char_literal17);

            dbg.location(117,40);
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
            // 118:2: ->
            {
                dbg.location(118,4);
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
        dbg.location(118, 3);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:1: str : STRINGLITERAL {...}?;
    public final MicroParserParser.str_return str() throws RecognitionException {
        MicroParserParser.str_return retval = new MicroParserParser.str_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRINGLITERAL18=null;

        Object STRINGLITERAL18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "str");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(120, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:5: ( STRINGLITERAL {...}?)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:120:7: STRINGLITERAL {...}?
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(120,7);
            STRINGLITERAL18=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_str256); 
            STRINGLITERAL18_tree = 
            (Object)adaptor.create(STRINGLITERAL18)
            ;
            adaptor.addChild(root_0, STRINGLITERAL18_tree);

            dbg.location(120,21);
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
        dbg.location(121, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:1: var_decl : Var_type id_list ';' ->;
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
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try { dbg.enterRule(getGrammarFileName(), "var_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(126, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:10: ( Var_type id_list ';' ->)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:126:12: Var_type id_list ';'
            {
            dbg.location(126,12);
            Var_type19=(Token)match(input,Var_type,FOLLOW_Var_type_in_var_decl271);  
            stream_Var_type.add(Var_type19);

            dbg.location(126,21);
            pushFollow(FOLLOW_id_list_in_var_decl273);
            id_list20=id_list();

            state._fsp--;

            stream_id_list.add(id_list20.getTree());
            dbg.location(127,1);
            	
            	for(String s : idList){
            		currentTable.add(new TableEntry(s,(Var_type19!=null?Var_type19.getText():null), ""));
            	}

            dbg.location(131,3);
            char_literal21=(Token)match(input,29,FOLLOW_29_in_var_decl278);  
            stream_29.add(char_literal21);


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
            // 132:2: ->
            {
                dbg.location(132,5);
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
        dbg.location(132, 4);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:138:1: any_type : ( Var_type | 'VOID' );
    public final MicroParserParser.any_type_return any_type() throws RecognitionException {
        MicroParserParser.any_type_return retval = new MicroParserParser.any_type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set22=null;

        Object set22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "any_type");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(138, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:138:10: ( Var_type | 'VOID' )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(138,10);
            set22=(Token)input.LT(1);

            if ( input.LA(1)==Var_type||input.LA(1)==42 ) {
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
        dbg.location(139, 4);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:1: id_list : id ( id_tail )* ;
    public final MicroParserParser.id_list_return id_list() throws RecognitionException {
        MicroParserParser.id_list_return retval = new MicroParserParser.id_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.id_return id23 =null;

        MicroParserParser.id_tail_return id_tail24 =null;



        try { dbg.enterRule(getGrammarFileName(), "id_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(141, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:9: ( id ( id_tail )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:11: id ( id_tail )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(141,11);
            idList.clear();
            dbg.location(141,29);
            pushFollow(FOLLOW_id_in_id_list328);
            id23=id();

            state._fsp--;

            adaptor.addChild(root_0, id23.getTree());
            dbg.location(141,32);
            idList.add((id23!=null?input.toString(id23.start,id23.stop):null));
            dbg.location(141,56);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:56: ( id_tail )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:141:56: id_tail
            	    {
            	    dbg.location(141,56);
            	    pushFollow(FOLLOW_id_tail_in_id_list332);
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
        dbg.location(142, 4);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:143:1: id_tail : ',' id -> ^( id ) ;
    public final MicroParserParser.id_tail_return id_tail() throws RecognitionException {
        MicroParserParser.id_tail_return retval = new MicroParserParser.id_tail_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal25=null;
        MicroParserParser.id_return id26 =null;


        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try { dbg.enterRule(getGrammarFileName(), "id_tail");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(143, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:143:9: ( ',' id -> ^( id ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:143:11: ',' id
            {
            dbg.location(143,11);
            char_literal25=(Token)match(input,27,FOLLOW_27_in_id_tail345);  
            stream_27.add(char_literal25);

            dbg.location(143,15);
            pushFollow(FOLLOW_id_in_id_tail347);
            id26=id();

            state._fsp--;

            stream_id.add(id26.getTree());
            dbg.location(143,18);
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
            // 143:42: -> ^( id )
            {
                dbg.location(143,45);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:143:45: ^( id )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(143,47);
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
        dbg.location(144, 4);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:150:1: param_decl_list : param_decl ( ',' param_decl )* -> ^( FUNCTION_PARAMS ( param_decl )+ ) ;
    public final MicroParserParser.param_decl_list_return param_decl_list() throws RecognitionException {
        MicroParserParser.param_decl_list_return retval = new MicroParserParser.param_decl_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal28=null;
        MicroParserParser.param_decl_return param_decl27 =null;

        MicroParserParser.param_decl_return param_decl29 =null;


        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_param_decl=new RewriteRuleSubtreeStream(adaptor,"rule param_decl");
        try { dbg.enterRule(getGrammarFileName(), "param_decl_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(150, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:150:17: ( param_decl ( ',' param_decl )* -> ^( FUNCTION_PARAMS ( param_decl )+ ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:150:19: param_decl ( ',' param_decl )*
            {
            dbg.location(150,19);
            pushFollow(FOLLOW_param_decl_in_param_decl_list372);
            param_decl27=param_decl();

            state._fsp--;

            stream_param_decl.add(param_decl27.getTree());
            dbg.location(150,30);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:150:30: ( ',' param_decl )*
            try { dbg.enterSubRule(4);

            loop4:
            do {
                int alt4=2;
                try { dbg.enterDecision(4, decisionCanBacktrack[4]);

                int LA4_0 = input.LA(1);

                if ( (LA4_0==27) ) {
                    alt4=1;
                }


                } finally {dbg.exitDecision(4);}

                switch (alt4) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:150:31: ',' param_decl
            	    {
            	    dbg.location(150,31);
            	    char_literal28=(Token)match(input,27,FOLLOW_27_in_param_decl_list375);  
            	    stream_27.add(char_literal28);

            	    dbg.location(150,35);
            	    pushFollow(FOLLOW_param_decl_in_param_decl_list377);
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
            // 151:2: -> ^( FUNCTION_PARAMS ( param_decl )+ )
            {
                dbg.location(151,4);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:151:4: ^( FUNCTION_PARAMS ( param_decl )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(151,6);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_PARAMS, "FUNCTION_PARAMS")
                , root_1);

                dbg.location(151,22);
                if ( !(stream_param_decl.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_param_decl.hasNext() ) {
                    dbg.location(151,22);
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
        dbg.location(151, 33);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:153:1: param_decl : Var_type id -> ^( PARAM Var_type id ) ;
    public final MicroParserParser.param_decl_return param_decl() throws RecognitionException {
        MicroParserParser.param_decl_return retval = new MicroParserParser.param_decl_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token Var_type30=null;
        MicroParserParser.id_return id31 =null;


        Object Var_type30_tree=null;
        RewriteRuleTokenStream stream_Var_type=new RewriteRuleTokenStream(adaptor,"token Var_type");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        try { dbg.enterRule(getGrammarFileName(), "param_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(153, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:153:12: ( Var_type id -> ^( PARAM Var_type id ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:153:14: Var_type id
            {
            dbg.location(153,14);
            Var_type30=(Token)match(input,Var_type,FOLLOW_Var_type_in_param_decl396);  
            stream_Var_type.add(Var_type30);

            dbg.location(153,23);
            pushFollow(FOLLOW_id_in_param_decl398);
            id31=id();

            state._fsp--;

            stream_id.add(id31.getTree());

            // AST REWRITE
            // elements: Var_type, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 154:2: -> ^( PARAM Var_type id )
            {
                dbg.location(154,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:154:5: ^( PARAM Var_type id )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(154,7);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAM, "PARAM")
                , root_1);

                dbg.location(154,13);
                adaptor.addChild(root_1, 
                stream_Var_type.nextNode()
                );
                dbg.location(154,22);
                adaptor.addChild(root_1, stream_id.nextTree());

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
        dbg.location(154, 24);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:157:1: func_declarations : ( func_decl )* ;
    public final MicroParserParser.func_declarations_return func_declarations() throws RecognitionException {
        MicroParserParser.func_declarations_return retval = new MicroParserParser.func_declarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.func_decl_return func_decl32 =null;



        try { dbg.enterRule(getGrammarFileName(), "func_declarations");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(157, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:157:19: ( ( func_decl )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:157:21: ( func_decl )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(157,21);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:157:21: ( func_decl )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:157:22: func_decl
            	    {
            	    dbg.location(157,22);
            	    pushFollow(FOLLOW_func_decl_in_func_declarations419);
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
        dbg.location(158, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:160:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' -> ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) ) ;
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
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_param_decl_list=new RewriteRuleSubtreeStream(adaptor,"rule param_decl_list");
        RewriteRuleSubtreeStream stream_func_body=new RewriteRuleSubtreeStream(adaptor,"rule func_body");
        RewriteRuleSubtreeStream stream_any_type=new RewriteRuleSubtreeStream(adaptor,"rule any_type");
        try { dbg.enterRule(getGrammarFileName(), "func_decl");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(160, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:160:11: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' -> ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:160:13: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            dbg.location(160,13);
            string_literal33=(Token)match(input,35,FOLLOW_35_in_func_decl431);  
            stream_35.add(string_literal33);

            dbg.location(160,24);
            pushFollow(FOLLOW_any_type_in_func_decl433);
            any_type34=any_type();

            state._fsp--;

            stream_any_type.add(any_type34.getTree());
            dbg.location(160,33);
            pushFollow(FOLLOW_id_in_func_decl435);
            id35=id();

            state._fsp--;

            stream_id.add(id35.getTree());
            dbg.location(160,36);
            char_literal36=(Token)match(input,25,FOLLOW_25_in_func_decl437);  
            stream_25.add(char_literal36);

            dbg.location(160,39);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:160:39: ( param_decl_list )?
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:160:39: param_decl_list
                    {
                    dbg.location(160,39);
                    pushFollow(FOLLOW_param_decl_list_in_func_decl438);
                    param_decl_list37=param_decl_list();

                    state._fsp--;

                    stream_param_decl_list.add(param_decl_list37.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(6);}

            dbg.location(160,55);
            char_literal38=(Token)match(input,26,FOLLOW_26_in_func_decl440);  
            stream_26.add(char_literal38);

            dbg.location(160,59);
            string_literal39=(Token)match(input,30,FOLLOW_30_in_func_decl442);  
            stream_30.add(string_literal39);

            dbg.location(162,1);
            symbolTableId++;
             currentTable = new ArrayList<TableEntry>();
             tableOfTables.put(new Integer(symbolTableId), currentTable);
             tableOfTableNames.put(new Integer(symbolTableId), (id35!=null?input.toString(id35.start,id35.stop):null)); 
            dbg.location(167,1);
            pushFollow(FOLLOW_func_body_in_func_decl452);
            func_body40=func_body();

            state._fsp--;

            stream_func_body.add(func_body40.getTree());
            dbg.location(167,11);
            string_literal41=(Token)match(input,33,FOLLOW_33_in_func_decl454);  
            stream_33.add(string_literal41);

            dbg.location(169,1);
            currentTable = tableOfTables.get(new Integer(0));

            // AST REWRITE
            // elements: id, func_body, 35, param_decl_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:53: -> ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) )
            {
                dbg.location(169,56);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:56: ^( 'FUNCTION' id ( param_decl_list )? ^( FUNCTION_BODY func_body ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(169,58);
                root_1 = (Object)adaptor.becomeRoot(
                stream_35.nextNode()
                , root_1);

                dbg.location(169,69);
                adaptor.addChild(root_1, stream_id.nextTree());
                dbg.location(169,73);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:73: ( param_decl_list )?
                if ( stream_param_decl_list.hasNext() ) {
                    dbg.location(169,73);
                    adaptor.addChild(root_1, stream_param_decl_list.nextTree());

                }
                stream_param_decl_list.reset();
                dbg.location(169,90);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:169:90: ^( FUNCTION_BODY func_body )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(169,92);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_BODY, "FUNCTION_BODY")
                , root_2);

                dbg.location(169,106);
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
        dbg.location(171, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:173:1: func_body : decl_list stmt_list ;
    public final MicroParserParser.func_body_return func_body() throws RecognitionException {
        MicroParserParser.func_body_return retval = new MicroParserParser.func_body_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.decl_list_return decl_list42 =null;

        MicroParserParser.stmt_list_return stmt_list43 =null;



        try { dbg.enterRule(getGrammarFileName(), "func_body");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(173, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:173:11: ( decl_list stmt_list )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:173:13: decl_list stmt_list
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(173,13);
            pushFollow(FOLLOW_decl_list_in_func_body491);
            decl_list42=decl_list();

            state._fsp--;

            adaptor.addChild(root_0, decl_list42.getTree());
            dbg.location(173,23);
            pushFollow(FOLLOW_stmt_list_in_func_body493);
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
        dbg.location(174, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:177:1: stmt_list : ( stmt )* ;
    public final MicroParserParser.stmt_list_return stmt_list() throws RecognitionException {
        MicroParserParser.stmt_list_return retval = new MicroParserParser.stmt_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.stmt_return stmt44 =null;



        try { dbg.enterRule(getGrammarFileName(), "stmt_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(177, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:177:11: ( ( stmt )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:177:13: ( stmt )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(177,13);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:177:13: ( stmt )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER||LA7_0==31||LA7_0==36||(LA7_0 >= 38 && LA7_0 <= 39)||LA7_0==44) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:177:14: stmt
            	    {
            	    dbg.location(177,14);
            	    pushFollow(FOLLOW_stmt_in_stmt_list505);
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
        dbg.location(178, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:1: stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt );
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
        dbg.location(180, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:6: ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt )
            int alt8=6;
            try { dbg.enterDecision(8, decisionCanBacktrack[8]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt8=1;
                }
                break;
            case 38:
                {
                alt8=2;
                }
                break;
            case 44:
                {
                alt8=3;
                }
                break;
            case 39:
                {
                alt8=4;
                }
                break;
            case 36:
                {
                alt8=5;
                }
                break;
            case 31:
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:8: assign_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,8);
                    pushFollow(FOLLOW_assign_stmt_in_stmt517);
                    assign_stmt45=assign_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_stmt45.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:22: read_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,22);
                    pushFollow(FOLLOW_read_stmt_in_stmt521);
                    read_stmt46=read_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, read_stmt46.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:34: write_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,34);
                    pushFollow(FOLLOW_write_stmt_in_stmt525);
                    write_stmt47=write_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, write_stmt47.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:47: return_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,47);
                    pushFollow(FOLLOW_return_stmt_in_stmt529);
                    return_stmt48=return_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, return_stmt48.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:61: if_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,61);
                    pushFollow(FOLLOW_if_stmt_in_stmt533);
                    if_stmt49=if_stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, if_stmt49.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:180:71: do_stmt
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(180,71);
                    pushFollow(FOLLOW_do_stmt_in_stmt537);
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
        dbg.location(181, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:184:1: assign_stmt : assign_expr ';' !;
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
        dbg.location(184, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:184:13: ( assign_expr ';' !)
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:184:15: assign_expr ';' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(184,15);
            pushFollow(FOLLOW_assign_expr_in_assign_stmt548);
            assign_expr51=assign_expr();

            state._fsp--;

            adaptor.addChild(root_0, assign_expr51.getTree());
            dbg.location(184,30);
            char_literal52=(Token)match(input,29,FOLLOW_29_in_assign_stmt550); 

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
        dbg.location(185, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:187:1: assign_expr : id ':=' expr -> ^( ':=' id expr ) ;
    public final MicroParserParser.assign_expr_return assign_expr() throws RecognitionException {
        MicroParserParser.assign_expr_return retval = new MicroParserParser.assign_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal54=null;
        MicroParserParser.id_return id53 =null;

        MicroParserParser.expr_return expr55 =null;


        Object string_literal54_tree=null;
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "assign_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(187, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:187:13: ( id ':=' expr -> ^( ':=' id expr ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:187:15: id ':=' expr
            {
            dbg.location(187,15);
            pushFollow(FOLLOW_id_in_assign_expr561);
            id53=id();

            state._fsp--;

            stream_id.add(id53.getTree());
            dbg.location(187,18);
            string_literal54=(Token)match(input,28,FOLLOW_28_in_assign_expr563);  
            stream_28.add(string_literal54);

            dbg.location(187,23);
            pushFollow(FOLLOW_expr_in_assign_expr565);
            expr55=expr();

            state._fsp--;

            stream_expr.add(expr55.getTree());

            // AST REWRITE
            // elements: 28, expr, id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:28: -> ^( ':=' id expr )
            {
                dbg.location(187,31);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:187:31: ^( ':=' id expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(187,33);
                root_1 = (Object)adaptor.becomeRoot(
                stream_28.nextNode()
                , root_1);

                dbg.location(187,38);
                adaptor.addChild(root_1, stream_id.nextTree());
                dbg.location(187,41);
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
        dbg.location(188, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:190:1: read_stmt : 'READ' '(' id_list ')' ';' -> ^( 'READ' id_list ) ;
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
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try { dbg.enterRule(getGrammarFileName(), "read_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(190, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:190:11: ( 'READ' '(' id_list ')' ';' -> ^( 'READ' id_list ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:190:13: 'READ' '(' id_list ')' ';'
            {
            dbg.location(190,13);
            string_literal56=(Token)match(input,38,FOLLOW_38_in_read_stmt585);  
            stream_38.add(string_literal56);

            dbg.location(190,20);
            char_literal57=(Token)match(input,25,FOLLOW_25_in_read_stmt587);  
            stream_25.add(char_literal57);

            dbg.location(190,24);
            pushFollow(FOLLOW_id_list_in_read_stmt589);
            id_list58=id_list();

            state._fsp--;

            stream_id_list.add(id_list58.getTree());
            dbg.location(190,32);
            char_literal59=(Token)match(input,26,FOLLOW_26_in_read_stmt591);  
            stream_26.add(char_literal59);

            dbg.location(190,35);
            char_literal60=(Token)match(input,29,FOLLOW_29_in_read_stmt592);  
            stream_29.add(char_literal60);


            // AST REWRITE
            // elements: id_list, 38
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:39: -> ^( 'READ' id_list )
            {
                dbg.location(190,42);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:190:42: ^( 'READ' id_list )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(190,44);
                root_1 = (Object)adaptor.becomeRoot(
                stream_38.nextNode()
                , root_1);

                dbg.location(190,51);
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
        dbg.location(191, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:193:1: write_stmt : 'WRITE' '(' id_list ')' ';' -> ^( 'WRITE' id_list ) ;
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_id_list=new RewriteRuleSubtreeStream(adaptor,"rule id_list");
        try { dbg.enterRule(getGrammarFileName(), "write_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(193, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:193:12: ( 'WRITE' '(' id_list ')' ';' -> ^( 'WRITE' id_list ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:193:14: 'WRITE' '(' id_list ')' ';'
            {
            dbg.location(193,14);
            string_literal61=(Token)match(input,44,FOLLOW_44_in_write_stmt610);  
            stream_44.add(string_literal61);

            dbg.location(193,22);
            char_literal62=(Token)match(input,25,FOLLOW_25_in_write_stmt612);  
            stream_25.add(char_literal62);

            dbg.location(193,26);
            pushFollow(FOLLOW_id_list_in_write_stmt614);
            id_list63=id_list();

            state._fsp--;

            stream_id_list.add(id_list63.getTree());
            dbg.location(193,34);
            char_literal64=(Token)match(input,26,FOLLOW_26_in_write_stmt616);  
            stream_26.add(char_literal64);

            dbg.location(193,37);
            char_literal65=(Token)match(input,29,FOLLOW_29_in_write_stmt617);  
            stream_29.add(char_literal65);


            // AST REWRITE
            // elements: 44, id_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:40: -> ^( 'WRITE' id_list )
            {
                dbg.location(193,43);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:193:43: ^( 'WRITE' id_list )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(193,45);
                root_1 = (Object)adaptor.becomeRoot(
                stream_44.nextNode()
                , root_1);

                dbg.location(193,53);
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
        dbg.location(194, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:196:1: return_stmt : 'RETURN' expr ';' -> ^( 'RETURN' expr ) ;
    public final MicroParserParser.return_stmt_return return_stmt() throws RecognitionException {
        MicroParserParser.return_stmt_return retval = new MicroParserParser.return_stmt_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal66=null;
        Token char_literal68=null;
        MicroParserParser.expr_return expr67 =null;


        Object string_literal66_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "return_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(196, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:196:13: ( 'RETURN' expr ';' -> ^( 'RETURN' expr ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:196:15: 'RETURN' expr ';'
            {
            dbg.location(196,15);
            string_literal66=(Token)match(input,39,FOLLOW_39_in_return_stmt634);  
            stream_39.add(string_literal66);

            dbg.location(196,24);
            pushFollow(FOLLOW_expr_in_return_stmt636);
            expr67=expr();

            state._fsp--;

            stream_expr.add(expr67.getTree());
            dbg.location(196,29);
            char_literal68=(Token)match(input,29,FOLLOW_29_in_return_stmt638);  
            stream_29.add(char_literal68);


            // AST REWRITE
            // elements: 39, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:2: -> ^( 'RETURN' expr )
            {
                dbg.location(197,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:197:5: ^( 'RETURN' expr )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(197,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_39.nextNode()
                , root_1);

                dbg.location(197,16);
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
        dbg.location(197, 20);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:200:1: expr : factor ( Addop ^ factor )* ;
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
        dbg.location(200, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:200:6: ( factor ( Addop ^ factor )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:200:8: factor ( Addop ^ factor )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(200,8);
            pushFollow(FOLLOW_factor_in_expr656);
            factor69=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor69.getTree());
            dbg.location(200,16);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:200:16: ( Addop ^ factor )*
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

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:200:17: Addop ^ factor
            	    {
            	    dbg.location(200,23);
            	    Addop70=(Token)match(input,Addop,FOLLOW_Addop_in_expr660); 
            	    Addop70_tree = 
            	    (Object)adaptor.create(Addop70)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(Addop70_tree, root_0);

            	    dbg.location(200,24);
            	    pushFollow(FOLLOW_factor_in_expr663);
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
        dbg.location(201, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:203:1: factor : postfix_expr ( Mulop ^ postfix_expr )* ;
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
        dbg.location(203, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:203:8: ( postfix_expr ( Mulop ^ postfix_expr )* )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:203:10: postfix_expr ( Mulop ^ postfix_expr )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(203,10);
            pushFollow(FOLLOW_postfix_expr_in_factor676);
            postfix_expr72=postfix_expr();

            state._fsp--;

            adaptor.addChild(root_0, postfix_expr72.getTree());
            dbg.location(203,23);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:203:23: ( Mulop ^ postfix_expr )*
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

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:203:24: Mulop ^ postfix_expr
            	    {
            	    dbg.location(203,30);
            	    Mulop73=(Token)match(input,Mulop,FOLLOW_Mulop_in_factor679); 
            	    Mulop73_tree = 
            	    (Object)adaptor.create(Mulop73)
            	    ;
            	    root_0 = (Object)adaptor.becomeRoot(Mulop73_tree, root_0);

            	    dbg.location(203,31);
            	    pushFollow(FOLLOW_postfix_expr_in_factor682);
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
        dbg.location(204, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:206:1: postfix_expr : ( primary | call_expr );
    public final MicroParserParser.postfix_expr_return postfix_expr() throws RecognitionException {
        MicroParserParser.postfix_expr_return retval = new MicroParserParser.postfix_expr_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MicroParserParser.primary_return primary75 =null;

        MicroParserParser.call_expr_return call_expr76 =null;



        try { dbg.enterRule(getGrammarFileName(), "postfix_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(206, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:206:14: ( primary | call_expr )
            int alt11=2;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            int LA11_0 = input.LA(1);

            if ( (LA11_0==FLOATLITERAL||LA11_0==INTLITERAL||LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==IDENTIFIER) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==Addop||LA11_2==Compop||LA11_2==Mulop||(LA11_2 >= 26 && LA11_2 <= 27)||LA11_2==29) ) {
                    alt11=1;
                }
                else if ( (LA11_2==25) ) {
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:206:16: primary
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(206,16);
                    pushFollow(FOLLOW_primary_in_postfix_expr694);
                    primary75=primary();

                    state._fsp--;

                    adaptor.addChild(root_0, primary75.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:206:26: call_expr
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(206,26);
                    pushFollow(FOLLOW_call_expr_in_postfix_expr698);
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
        dbg.location(207, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:209:1: call_expr : id '(' ( expr_list )? ')' -> ^( FUNCTION_CALL id expr_list ) ;
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
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_id=new RewriteRuleSubtreeStream(adaptor,"rule id");
        RewriteRuleSubtreeStream stream_expr_list=new RewriteRuleSubtreeStream(adaptor,"rule expr_list");
        try { dbg.enterRule(getGrammarFileName(), "call_expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(209, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:209:11: ( id '(' ( expr_list )? ')' -> ^( FUNCTION_CALL id expr_list ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:209:13: id '(' ( expr_list )? ')'
            {
            dbg.location(209,13);
            pushFollow(FOLLOW_id_in_call_expr708);
            id77=id();

            state._fsp--;

            stream_id.add(id77.getTree());
            dbg.location(209,16);
            char_literal78=(Token)match(input,25,FOLLOW_25_in_call_expr710);  
            stream_25.add(char_literal78);

            dbg.location(209,19);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:209:19: ( expr_list )?
            int alt12=2;
            try { dbg.enterSubRule(12);
            try { dbg.enterDecision(12, decisionCanBacktrack[12]);

            int LA12_0 = input.LA(1);

            if ( (LA12_0==FLOATLITERAL||LA12_0==IDENTIFIER||LA12_0==INTLITERAL||LA12_0==25) ) {
                alt12=1;
            }
            } finally {dbg.exitDecision(12);}

            switch (alt12) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:209:20: expr_list
                    {
                    dbg.location(209,20);
                    pushFollow(FOLLOW_expr_list_in_call_expr712);
                    expr_list79=expr_list();

                    state._fsp--;

                    stream_expr_list.add(expr_list79.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(12);}

            dbg.location(209,32);
            char_literal80=(Token)match(input,26,FOLLOW_26_in_call_expr716);  
            stream_26.add(char_literal80);


            // AST REWRITE
            // elements: id, expr_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 210:2: -> ^( FUNCTION_CALL id expr_list )
            {
                dbg.location(210,4);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:210:4: ^( FUNCTION_CALL id expr_list )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(210,6);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_CALL, "FUNCTION_CALL")
                , root_1);

                dbg.location(210,20);
                adaptor.addChild(root_1, stream_id.nextTree());
                dbg.location(210,23);
                adaptor.addChild(root_1, stream_expr_list.nextTree());

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
        dbg.location(210, 32);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:212:1: expr_list : expr ( ',' expr )* -> ^( FUNCTION_PARAMS ( expr )+ ) ;
    public final MicroParserParser.expr_list_return expr_list() throws RecognitionException {
        MicroParserParser.expr_list_return retval = new MicroParserParser.expr_list_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal82=null;
        MicroParserParser.expr_return expr81 =null;

        MicroParserParser.expr_return expr83 =null;


        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try { dbg.enterRule(getGrammarFileName(), "expr_list");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(212, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:212:11: ( expr ( ',' expr )* -> ^( FUNCTION_PARAMS ( expr )+ ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:212:13: expr ( ',' expr )*
            {
            dbg.location(212,13);
            pushFollow(FOLLOW_expr_in_expr_list734);
            expr81=expr();

            state._fsp--;

            stream_expr.add(expr81.getTree());
            dbg.location(212,18);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:212:18: ( ',' expr )*
            try { dbg.enterSubRule(13);

            loop13:
            do {
                int alt13=2;
                try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                } finally {dbg.exitDecision(13);}

                switch (alt13) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:212:19: ',' expr
            	    {
            	    dbg.location(212,19);
            	    char_literal82=(Token)match(input,27,FOLLOW_27_in_expr_list737);  
            	    stream_27.add(char_literal82);

            	    dbg.location(212,23);
            	    pushFollow(FOLLOW_expr_in_expr_list739);
            	    expr83=expr();

            	    state._fsp--;

            	    stream_expr.add(expr83.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);
            } finally {dbg.exitSubRule(13);}


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:2: -> ^( FUNCTION_PARAMS ( expr )+ )
            {
                dbg.location(213,4);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:213:4: ^( FUNCTION_PARAMS ( expr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(213,6);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNCTION_PARAMS, "FUNCTION_PARAMS")
                , root_1);

                dbg.location(213,22);
                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    dbg.location(213,22);
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
        dbg.location(213, 27);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:215:1: primary : ( '(' ! expr ')' !| id | INTLITERAL | FLOATLITERAL );
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
        dbg.location(215, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:215:9: ( '(' ! expr ')' !| id | INTLITERAL | FLOATLITERAL )
            int alt14=4;
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            switch ( input.LA(1) ) {
            case 25:
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

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:215:11: '(' ! expr ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,14);
                    char_literal84=(Token)match(input,25,FOLLOW_25_in_primary758); 
                    dbg.location(215,15);
                    pushFollow(FOLLOW_expr_in_primary760);
                    expr85=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr85.getTree());
                    dbg.location(215,22);
                    char_literal86=(Token)match(input,26,FOLLOW_26_in_primary761); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:215:26: id
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,26);
                    pushFollow(FOLLOW_id_in_primary766);
                    id87=id();

                    state._fsp--;

                    adaptor.addChild(root_0, id87.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:215:31: INTLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,31);
                    INTLITERAL88=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary770); 
                    INTLITERAL88_tree = 
                    (Object)adaptor.create(INTLITERAL88)
                    ;
                    adaptor.addChild(root_0, INTLITERAL88_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:215:44: FLOATLITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(215,44);
                    FLOATLITERAL89=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary774); 
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
        dbg.location(216, 1);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:225:1: if_stmt : 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' -> ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? ) ;
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
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_else_part=new RewriteRuleSubtreeStream(adaptor,"rule else_part");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        try { dbg.enterRule(getGrammarFileName(), "if_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(225, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:225:9: ( 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' -> ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:225:11: 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF'
            {
            dbg.location(225,11);
            string_literal90=(Token)match(input,36,FOLLOW_36_in_if_stmt813);  
            stream_36.add(string_literal90);

            dbg.location(225,16);
            char_literal91=(Token)match(input,25,FOLLOW_25_in_if_stmt815);  
            stream_25.add(char_literal91);

            dbg.location(225,20);
            pushFollow(FOLLOW_cond_in_if_stmt817);
            cond92=cond();

            state._fsp--;

            stream_cond.add(cond92.getTree());
            dbg.location(225,25);
            char_literal93=(Token)match(input,26,FOLLOW_26_in_if_stmt819);  
            stream_26.add(char_literal93);

            dbg.location(225,29);
            string_literal94=(Token)match(input,41,FOLLOW_41_in_if_stmt821);  
            stream_41.add(string_literal94);

            dbg.location(225,36);
            pushFollow(FOLLOW_stmt_list_in_if_stmt823);
            stmt_list95=stmt_list();

            state._fsp--;

            stream_stmt_list.add(stmt_list95.getTree());
            dbg.location(225,46);
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:225:46: ( else_part )?
            int alt15=2;
            try { dbg.enterSubRule(15);
            try { dbg.enterDecision(15, decisionCanBacktrack[15]);

            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            } finally {dbg.exitDecision(15);}

            switch (alt15) {
                case 1 :
                    dbg.enterAlt(1);

                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:225:47: else_part
                    {
                    dbg.location(225,47);
                    pushFollow(FOLLOW_else_part_in_if_stmt826);
                    else_part96=else_part();

                    state._fsp--;

                    stream_else_part.add(else_part96.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(15);}

            dbg.location(225,60);
            string_literal97=(Token)match(input,34,FOLLOW_34_in_if_stmt831);  
            stream_34.add(string_literal97);


            // AST REWRITE
            // elements: stmt_list, else_part, cond, 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 226:2: -> ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? )
            {
                dbg.location(226,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:5: ^( 'IF' ^( IF_COND cond ) ^( IF_MAIN stmt_list ) ( ^( IF_ELSE else_part ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(226,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_36.nextNode()
                , root_1);

                dbg.location(226,12);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:12: ^( IF_COND cond )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(226,14);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_COND, "IF_COND")
                , root_2);

                dbg.location(226,22);
                adaptor.addChild(root_2, stream_cond.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(226,28);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:28: ^( IF_MAIN stmt_list )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(226,30);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(IF_MAIN, "IF_MAIN")
                , root_2);

                dbg.location(226,38);
                adaptor.addChild(root_2, stream_stmt_list.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(226,49);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:49: ( ^( IF_ELSE else_part ) )?
                if ( stream_else_part.hasNext() ) {
                    dbg.location(226,49);
                    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:226:49: ^( IF_ELSE else_part )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(226,51);
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(IF_ELSE, "IF_ELSE")
                    , root_2);

                    dbg.location(226,59);
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
        dbg.location(226, 70);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:228:1: else_part : 'ELSE' stmt_list -> stmt_list ;
    public final MicroParserParser.else_part_return else_part() throws RecognitionException {
        MicroParserParser.else_part_return retval = new MicroParserParser.else_part_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal98=null;
        MicroParserParser.stmt_list_return stmt_list99 =null;


        Object string_literal98_tree=null;
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        try { dbg.enterRule(getGrammarFileName(), "else_part");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(228, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:228:11: ( 'ELSE' stmt_list -> stmt_list )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:228:13: 'ELSE' stmt_list
            {
            dbg.location(228,13);
            string_literal98=(Token)match(input,32,FOLLOW_32_in_else_part865);  
            stream_32.add(string_literal98);

            dbg.location(228,20);
            pushFollow(FOLLOW_stmt_list_in_else_part867);
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
            // 229:2: -> stmt_list
            {
                dbg.location(229,5);
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
        dbg.location(229, 13);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:231:1: cond : expr Compop ^ expr ;
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
        dbg.location(231, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:231:6: ( expr Compop ^ expr )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:231:8: expr Compop ^ expr
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(231,8);
            pushFollow(FOLLOW_expr_in_cond880);
            expr100=expr();

            state._fsp--;

            adaptor.addChild(root_0, expr100.getTree());
            dbg.location(231,19);
            Compop101=(Token)match(input,Compop,FOLLOW_Compop_in_cond882); 
            Compop101_tree = 
            (Object)adaptor.create(Compop101)
            ;
            root_0 = (Object)adaptor.becomeRoot(Compop101_tree, root_0);

            dbg.location(231,21);
            pushFollow(FOLLOW_expr_in_cond885);
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
        dbg.location(231, 24);

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
    // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:236:1: do_stmt : 'DO' stmt_list 'WHILE' '(' cond ')' ';' -> ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) ) ;
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
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_cond=new RewriteRuleSubtreeStream(adaptor,"rule cond");
        try { dbg.enterRule(getGrammarFileName(), "do_stmt");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(236, 0);

        try {
            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:236:9: ( 'DO' stmt_list 'WHILE' '(' cond ')' ';' -> ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) ) )
            dbg.enterAlt(1);

            // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:236:11: 'DO' stmt_list 'WHILE' '(' cond ')' ';'
            {
            dbg.location(236,11);
            string_literal103=(Token)match(input,31,FOLLOW_31_in_do_stmt915);  
            stream_31.add(string_literal103);

            dbg.location(236,16);
            pushFollow(FOLLOW_stmt_list_in_do_stmt917);
            stmt_list104=stmt_list();

            state._fsp--;

            stream_stmt_list.add(stmt_list104.getTree());
            dbg.location(236,26);
            string_literal105=(Token)match(input,43,FOLLOW_43_in_do_stmt919);  
            stream_43.add(string_literal105);

            dbg.location(236,34);
            char_literal106=(Token)match(input,25,FOLLOW_25_in_do_stmt921);  
            stream_25.add(char_literal106);

            dbg.location(236,38);
            pushFollow(FOLLOW_cond_in_do_stmt923);
            cond107=cond();

            state._fsp--;

            stream_cond.add(cond107.getTree());
            dbg.location(236,43);
            char_literal108=(Token)match(input,26,FOLLOW_26_in_do_stmt925);  
            stream_26.add(char_literal108);

            dbg.location(236,46);
            char_literal109=(Token)match(input,29,FOLLOW_29_in_do_stmt926);  
            stream_29.add(char_literal109);


            // AST REWRITE
            // elements: stmt_list, cond, 31
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:2: -> ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) )
            {
                dbg.location(237,5);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:237:5: ^( 'DO' ^( DO_MAIN stmt_list ) ^( DO_COND cond ) )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(237,7);
                root_1 = (Object)adaptor.becomeRoot(
                stream_31.nextNode()
                , root_1);

                dbg.location(237,12);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:237:12: ^( DO_MAIN stmt_list )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(237,14);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DO_MAIN, "DO_MAIN")
                , root_2);

                dbg.location(237,22);
                adaptor.addChild(root_2, stream_stmt_list.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(237,33);
                // /home/shay/a/jhuffake/ECE468/pocket-translatorfall2011/src/MicroParser.g:237:33: ^( DO_COND cond )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(237,35);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(DO_COND, "DO_COND")
                , root_2);

                dbg.location(237,43);
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
        dbg.location(237, 49);

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


 

    public static final BitSet FOLLOW_37_in_program149 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_in_program151 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_program153 = new BitSet(new long[]{0x0000010800800000L});
    public static final BitSet FOLLOW_pgm_body_in_program160 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_program162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_pgm_body193 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decl_list207 = new BitSet(new long[]{0x0000010000800002L});
    public static final BitSet FOLLOW_string_decl_in_decl218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_string_decl234 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_in_string_decl236 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_string_decl238 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_str_in_string_decl240 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_string_decl242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_str256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_var_decl271 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_list_in_var_decl273 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_var_decl278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list328 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_id_tail_in_id_list332 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_id_tail345 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_in_id_tail347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list372 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_param_decl_list375 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list377 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_Var_type_in_param_decl396 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_in_param_decl398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations419 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_func_decl431 = new BitSet(new long[]{0x0000040000800000L});
    public static final BitSet FOLLOW_any_type_in_func_decl433 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_in_func_decl435 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_func_decl437 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl438 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_func_decl440 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_func_decl442 = new BitSet(new long[]{0x000011D080802000L});
    public static final BitSet FOLLOW_func_body_in_func_decl452 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_func_decl454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_func_body491 = new BitSet(new long[]{0x000010D080002000L});
    public static final BitSet FOLLOW_stmt_list_in_func_body493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list505 = new BitSet(new long[]{0x000010D080002002L});
    public static final BitSet FOLLOW_assign_stmt_in_stmt517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_stmt521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_stmt525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_stmt_in_stmt537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt548 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_assign_stmt550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr561 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_assign_expr563 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_expr_in_assign_expr565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_read_stmt585 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_read_stmt587 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_list_in_read_stmt589 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_read_stmt591 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_read_stmt592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_write_stmt610 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_write_stmt612 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_id_list_in_write_stmt614 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_write_stmt616 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_write_stmt617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_return_stmt634 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_expr_in_return_stmt636 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_return_stmt638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr656 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Addop_in_expr660 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_factor_in_expr663 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_postfix_expr_in_factor676 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_Mulop_in_factor679 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_postfix_expr_in_factor682 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_primary_in_postfix_expr694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr708 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_call_expr710 = new BitSet(new long[]{0x0000000006022200L});
    public static final BitSet FOLLOW_expr_list_in_call_expr712 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_call_expr716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list734 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_expr_list737 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_expr_in_expr_list739 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25_in_primary758 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_expr_in_primary760 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_primary761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_if_stmt813 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_if_stmt815 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_cond_in_if_stmt817 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_if_stmt819 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_if_stmt821 = new BitSet(new long[]{0x000010D580002000L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt823 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt826 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_if_stmt831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_else_part865 = new BitSet(new long[]{0x000010D080002000L});
    public static final BitSet FOLLOW_stmt_list_in_else_part867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Compop_in_cond882 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_expr_in_cond885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_do_stmt915 = new BitSet(new long[]{0x000018D080002000L});
    public static final BitSet FOLLOW_stmt_list_in_do_stmt917 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_do_stmt919 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_do_stmt921 = new BitSet(new long[]{0x0000000002022200L});
    public static final BitSet FOLLOW_cond_in_do_stmt923 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_do_stmt925 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_do_stmt926 = new BitSet(new long[]{0x0000000000000002L});

}