// $ANTLR 3.4 C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g 2011-09-25 17:01:19

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MicroParserParser extends Parser {
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


    public MicroParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public MicroParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return MicroParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g"; }


    	int symbolTableId = 0;
    	
    	class TableEntry {
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
    	



    // $ANTLR start "program"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:82:1: program : 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF ;
    public final void program() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:82:9: ( 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:82:12: 'PROGRAM' id 'BEGIN' pgm_body 'END' EOF
            {
            match(input,27,FOLLOW_27_in_program31); 

            pushFollow(FOLLOW_id_in_program33);
            id();

            state._fsp--;


            match(input,20,FOLLOW_20_in_program35); 

             	tableOfTables.put(new Integer(symbolTableId), currentTable);
            		tableOfTableNames.put(new Integer(symbolTableId), "Global");

            pushFollow(FOLLOW_pgm_body_in_program42);
            pgm_body();

            state._fsp--;


            match(input,23,FOLLOW_23_in_program44); 

            printTables();

            match(input,EOF,FOLLOW_EOF_in_program48); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "program"


    public static class id_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "id"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:88:1: id : IDENTIFIER {...}?;
    public final MicroParserParser.id_return id() throws RecognitionException {
        MicroParserParser.id_return retval = new MicroParserParser.id_return();
        retval.start = input.LT(1);


        Token IDENTIFIER1=null;

        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:88:4: ( IDENTIFIER {...}?)
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:88:6: IDENTIFIER {...}?
            {
            IDENTIFIER1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_id58); 

            if ( !(((IDENTIFIER1!=null?IDENTIFIER1.getText():null).length() <= 31)) ) {
                throw new FailedPredicateException(input, "id", "$IDENTIFIER.text.length() <= 31");
            }

            }

            retval.stop = input.LT(-1);


        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "id"



    // $ANTLR start "pgm_body"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:91:1: pgm_body : decl_list func_declarations ;
    public final void pgm_body() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:91:10: ( decl_list func_declarations )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:91:12: decl_list func_declarations
            {
            pushFollow(FOLLOW_decl_list_in_pgm_body70);
            decl_list();

            state._fsp--;


            pushFollow(FOLLOW_func_declarations_in_pgm_body72);
            func_declarations();

            state._fsp--;


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "pgm_body"



    // $ANTLR start "decl_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:94:1: decl_list : ( decl )* ;
    public final void decl_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:95:2: ( ( decl )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:95:4: ( decl )*
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:95:4: ( decl )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Var_type||LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:95:4: decl
            	    {
            	    pushFollow(FOLLOW_decl_in_decl_list84);
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

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "decl_list"



    // $ANTLR start "decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:98:1: decl : ( string_decl | var_decl );
    public final void decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:98:6: ( string_decl | var_decl )
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
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:98:8: string_decl
                    {
                    pushFollow(FOLLOW_string_decl_in_decl95);
                    string_decl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:98:23: var_decl
                    {
                    pushFollow(FOLLOW_var_decl_in_decl100);
                    var_decl();

                    state._fsp--;


                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "decl"



    // $ANTLR start "string_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:101:1: string_decl : 'STRING' id ':=' str ';' ;
    public final void string_decl() throws RecognitionException {
        MicroParserParser.id_return id2 =null;

        MicroParserParser.str_return str3 =null;


        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:101:13: ( 'STRING' id ':=' str ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:101:15: 'STRING' id ':=' str ';'
            {
            match(input,30,FOLLOW_30_in_string_decl111); 

            pushFollow(FOLLOW_id_in_string_decl113);
            id2=id();

            state._fsp--;


            match(input,18,FOLLOW_18_in_string_decl115); 

            pushFollow(FOLLOW_str_in_string_decl117);
            str3=str();

            state._fsp--;


            match(input,19,FOLLOW_19_in_string_decl119); 

            currentTable.add( new TableEntry((id2!=null?input.toString(id2.start,id2.stop):null),"STRING", (str3!=null?input.toString(str3.start,str3.stop):null)));

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "string_decl"


    public static class str_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "str"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:104:1: str : STRINGLITERAL {...}?;
    public final MicroParserParser.str_return str() throws RecognitionException {
        MicroParserParser.str_return retval = new MicroParserParser.str_return();
        retval.start = input.LT(1);


        Token STRINGLITERAL4=null;

        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:104:5: ( STRINGLITERAL {...}?)
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:104:7: STRINGLITERAL {...}?
            {
            STRINGLITERAL4=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_str132); 

            if ( !(((STRINGLITERAL4!=null?STRINGLITERAL4.getText():null).length() <= 81)) ) {
                throw new FailedPredicateException(input, "str", "$STRINGLITERAL.text.length() <= 81");
            }

            }

            retval.stop = input.LT(-1);


        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "str"



    // $ANTLR start "var_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:110:1: var_decl : Var_type id_list ';' ;
    public final void var_decl() throws RecognitionException {
        Token Var_type5=null;

        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:110:10: ( Var_type id_list ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:110:12: Var_type id_list ';'
            {
            Var_type5=(Token)match(input,Var_type,FOLLOW_Var_type_in_var_decl147); 

            pushFollow(FOLLOW_id_list_in_var_decl149);
            id_list();

            state._fsp--;


            	
            	for(String s : idList){
            		currentTable.add(new TableEntry(s,(Var_type5!=null?Var_type5.getText():null), ""));
            	}


            match(input,19,FOLLOW_19_in_var_decl154); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "var_decl"



    // $ANTLR start "any_type"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:122:1: any_type : ( Var_type | 'VOID' );
    public final void any_type() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:122:10: ( Var_type | 'VOID' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:
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

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "any_type"



    // $ANTLR start "id_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:125:1: id_list : id ( id_tail )* ;
    public final void id_list() throws RecognitionException {
        MicroParserParser.id_return id6 =null;


        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:125:9: ( id ( id_tail )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:125:11: id ( id_tail )*
            {
            idList.clear();

            pushFollow(FOLLOW_id_in_id_list202);
            id6=id();

            state._fsp--;


            idList.add((id6!=null?input.toString(id6.start,id6.stop):null));

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:125:56: ( id_tail )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:125:56: id_tail
            	    {
            	    pushFollow(FOLLOW_id_tail_in_id_list206);
            	    id_tail();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "id_list"



    // $ANTLR start "id_tail"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:127:1: id_tail : ',' id ;
    public final void id_tail() throws RecognitionException {
        MicroParserParser.id_return id7 =null;


        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:127:9: ( ',' id )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:127:11: ',' id
            {
            match(input,17,FOLLOW_17_in_id_tail219); 

            pushFollow(FOLLOW_id_in_id_tail221);
            id7=id();

            state._fsp--;


            idList.add((id7!=null?input.toString(id7.start,id7.stop):null));

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "id_tail"



    // $ANTLR start "param_decl_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:134:1: param_decl_list : param_decl ( ',' param_decl )* ;
    public final void param_decl_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:134:17: ( param_decl ( ',' param_decl )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:134:19: param_decl ( ',' param_decl )*
            {
            pushFollow(FOLLOW_param_decl_in_param_decl_list240);
            param_decl();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:134:30: ( ',' param_decl )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:134:31: ',' param_decl
            	    {
            	    match(input,17,FOLLOW_17_in_param_decl_list243); 

            	    pushFollow(FOLLOW_param_decl_in_param_decl_list245);
            	    param_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param_decl_list"



    // $ANTLR start "param_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:137:1: param_decl : Var_type id ;
    public final void param_decl() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:137:12: ( Var_type id )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:137:14: Var_type id
            {
            match(input,Var_type,FOLLOW_Var_type_in_param_decl257); 

            pushFollow(FOLLOW_id_in_param_decl259);
            id();

            state._fsp--;


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "param_decl"



    // $ANTLR start "func_declarations"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:141:1: func_declarations : ( func_decl )* ;
    public final void func_declarations() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:141:19: ( ( func_decl )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:141:21: ( func_decl )*
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:141:21: ( func_decl )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:141:22: func_decl
            	    {
            	    pushFollow(FOLLOW_func_decl_in_func_declarations271);
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

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_declarations"



    // $ANTLR start "func_decl"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:144:1: func_decl : 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' ;
    public final void func_decl() throws RecognitionException {
        MicroParserParser.id_return id8 =null;


        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:144:11: ( 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:144:13: 'FUNCTION' any_type id '(' ( param_decl_list )? ')' 'BEGIN' func_body 'END'
            {
            match(input,25,FOLLOW_25_in_func_decl283); 

            pushFollow(FOLLOW_any_type_in_func_decl285);
            any_type();

            state._fsp--;


            pushFollow(FOLLOW_id_in_func_decl287);
            id8=id();

            state._fsp--;


            match(input,15,FOLLOW_15_in_func_decl289); 

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:144:39: ( param_decl_list )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Var_type) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:144:39: param_decl_list
                    {
                    pushFollow(FOLLOW_param_decl_list_in_func_decl290);
                    param_decl_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input,16,FOLLOW_16_in_func_decl292); 

            match(input,20,FOLLOW_20_in_func_decl294); 

            symbolTableId++;
             currentTable = new ArrayList<TableEntry>();
             tableOfTables.put(new Integer(symbolTableId), currentTable);
             tableOfTableNames.put(new Integer(symbolTableId), (id8!=null?input.toString(id8.start,id8.stop):null)); 

            pushFollow(FOLLOW_func_body_in_func_decl304);
            func_body();

            state._fsp--;


            match(input,23,FOLLOW_23_in_func_decl306); 

            currentTable = tableOfTables.get(new Integer(0));

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_decl"



    // $ANTLR start "func_body"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:157:1: func_body : decl_list stmt_list ;
    public final void func_body() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:157:11: ( decl_list stmt_list )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:157:13: decl_list stmt_list
            {
            pushFollow(FOLLOW_decl_list_in_func_body325);
            decl_list();

            state._fsp--;


            pushFollow(FOLLOW_stmt_list_in_func_body327);
            stmt_list();

            state._fsp--;


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "func_body"



    // $ANTLR start "stmt_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:161:1: stmt_list : ( stmt )* ;
    public final void stmt_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:161:11: ( ( stmt )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:161:13: ( stmt )*
            {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:161:13: ( stmt )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IDENTIFIER||LA7_0==21||LA7_0==26||(LA7_0 >= 28 && LA7_0 <= 29)||LA7_0==34) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:161:14: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_stmt_list339);
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

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt_list"



    // $ANTLR start "stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:1: stmt : ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt );
    public final void stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:6: ( assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt )
            int alt8=6;
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

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:8: assign_stmt
                    {
                    pushFollow(FOLLOW_assign_stmt_in_stmt351);
                    assign_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:22: read_stmt
                    {
                    pushFollow(FOLLOW_read_stmt_in_stmt355);
                    read_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:34: write_stmt
                    {
                    pushFollow(FOLLOW_write_stmt_in_stmt359);
                    write_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:47: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt363);
                    return_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:61: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt367);
                    if_stmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:164:71: do_stmt
                    {
                    pushFollow(FOLLOW_do_stmt_in_stmt371);
                    do_stmt();

                    state._fsp--;


                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "stmt"



    // $ANTLR start "assign_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:168:1: assign_stmt : assign_expr ';' ;
    public final void assign_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:168:13: ( assign_expr ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:168:15: assign_expr ';'
            {
            pushFollow(FOLLOW_assign_expr_in_assign_stmt382);
            assign_expr();

            state._fsp--;


            match(input,19,FOLLOW_19_in_assign_stmt384); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign_stmt"



    // $ANTLR start "assign_expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:171:1: assign_expr : id ':=' expr ;
    public final void assign_expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:171:13: ( id ':=' expr )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:171:15: id ':=' expr
            {
            pushFollow(FOLLOW_id_in_assign_expr394);
            id();

            state._fsp--;


            match(input,18,FOLLOW_18_in_assign_expr396); 

            pushFollow(FOLLOW_expr_in_assign_expr398);
            expr();

            state._fsp--;


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "assign_expr"



    // $ANTLR start "read_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:174:1: read_stmt : 'READ' '(' id_list ')' ';' ;
    public final void read_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:174:11: ( 'READ' '(' id_list ')' ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:174:13: 'READ' '(' id_list ')' ';'
            {
            match(input,28,FOLLOW_28_in_read_stmt408); 

            match(input,15,FOLLOW_15_in_read_stmt410); 

            pushFollow(FOLLOW_id_list_in_read_stmt412);
            id_list();

            state._fsp--;


            match(input,16,FOLLOW_16_in_read_stmt414); 

            match(input,19,FOLLOW_19_in_read_stmt415); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "read_stmt"



    // $ANTLR start "write_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:177:1: write_stmt : 'WRITE' '(' id_list ')' ';' ;
    public final void write_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:177:12: ( 'WRITE' '(' id_list ')' ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:177:14: 'WRITE' '(' id_list ')' ';'
            {
            match(input,34,FOLLOW_34_in_write_stmt425); 

            match(input,15,FOLLOW_15_in_write_stmt427); 

            pushFollow(FOLLOW_id_list_in_write_stmt429);
            id_list();

            state._fsp--;


            match(input,16,FOLLOW_16_in_write_stmt431); 

            match(input,19,FOLLOW_19_in_write_stmt432); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "write_stmt"



    // $ANTLR start "return_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:180:1: return_stmt : 'RETURN' expr ';' ;
    public final void return_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:180:13: ( 'RETURN' expr ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:180:15: 'RETURN' expr ';'
            {
            match(input,29,FOLLOW_29_in_return_stmt442); 

            pushFollow(FOLLOW_expr_in_return_stmt444);
            expr();

            state._fsp--;


            match(input,19,FOLLOW_19_in_return_stmt446); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "return_stmt"



    // $ANTLR start "expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:184:1: expr : factor ( Addop factor )* ;
    public final void expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:184:6: ( factor ( Addop factor )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:184:8: factor ( Addop factor )*
            {
            pushFollow(FOLLOW_factor_in_expr457);
            factor();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:184:16: ( Addop factor )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Addop) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:184:17: Addop factor
            	    {
            	    match(input,Addop,FOLLOW_Addop_in_expr461); 

            	    pushFollow(FOLLOW_factor_in_expr463);
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

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr"



    // $ANTLR start "factor"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:187:1: factor : postfix_expr ( Mulop postfix_expr )* ;
    public final void factor() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:187:8: ( postfix_expr ( Mulop postfix_expr )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:187:10: postfix_expr ( Mulop postfix_expr )*
            {
            pushFollow(FOLLOW_postfix_expr_in_factor476);
            postfix_expr();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:187:23: ( Mulop postfix_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Mulop) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:187:24: Mulop postfix_expr
            	    {
            	    match(input,Mulop,FOLLOW_Mulop_in_factor479); 

            	    pushFollow(FOLLOW_postfix_expr_in_factor481);
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

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "factor"



    // $ANTLR start "postfix_expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:190:1: postfix_expr : ( primary | call_expr );
    public final void postfix_expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:190:14: ( primary | call_expr )
            int alt11=2;
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
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:190:16: primary
                    {
                    pushFollow(FOLLOW_primary_in_postfix_expr493);
                    primary();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:190:26: call_expr
                    {
                    pushFollow(FOLLOW_call_expr_in_postfix_expr497);
                    call_expr();

                    state._fsp--;


                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "postfix_expr"



    // $ANTLR start "call_expr"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:193:1: call_expr : id '(' ( expr_list )? ')' ;
    public final void call_expr() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:193:11: ( id '(' ( expr_list )? ')' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:193:13: id '(' ( expr_list )? ')'
            {
            pushFollow(FOLLOW_id_in_call_expr507);
            id();

            state._fsp--;


            match(input,15,FOLLOW_15_in_call_expr509); 

            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:193:19: ( expr_list )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0 >= FLOATLITERAL && LA12_0 <= INTLITERAL)||LA12_0==15) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:193:20: expr_list
                    {
                    pushFollow(FOLLOW_expr_list_in_call_expr511);
                    expr_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input,16,FOLLOW_16_in_call_expr515); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "call_expr"



    // $ANTLR start "expr_list"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:196:1: expr_list : expr ( ',' expr )* ;
    public final void expr_list() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:196:11: ( expr ( ',' expr )* )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:196:13: expr ( ',' expr )*
            {
            pushFollow(FOLLOW_expr_in_expr_list525);
            expr();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:196:18: ( ',' expr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:196:19: ',' expr
            	    {
            	    match(input,17,FOLLOW_17_in_expr_list528); 

            	    pushFollow(FOLLOW_expr_in_expr_list530);
            	    expr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expr_list"



    // $ANTLR start "primary"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:199:1: primary : ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL );
    public final void primary() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:199:9: ( '(' expr ')' | id | INTLITERAL | FLOATLITERAL )
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
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:199:11: '(' expr ')'
                    {
                    match(input,15,FOLLOW_15_in_primary542); 

                    pushFollow(FOLLOW_expr_in_primary543);
                    expr();

                    state._fsp--;


                    match(input,16,FOLLOW_16_in_primary544); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:199:24: id
                    {
                    pushFollow(FOLLOW_id_in_primary548);
                    id();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:199:29: INTLITERAL
                    {
                    match(input,INTLITERAL,FOLLOW_INTLITERAL_in_primary552); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:199:42: FLOATLITERAL
                    {
                    match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_primary556); 

                    }
                    break;

            }
        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "primary"



    // $ANTLR start "if_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:209:1: if_stmt : 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' ;
    public final void if_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:209:9: ( 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:209:11: 'IF' '(' cond ')' 'THEN' stmt_list ( else_part )? 'ENDIF'
            {
            match(input,26,FOLLOW_26_in_if_stmt595); 

            match(input,15,FOLLOW_15_in_if_stmt597); 

            pushFollow(FOLLOW_cond_in_if_stmt599);
            cond();

            state._fsp--;


            match(input,16,FOLLOW_16_in_if_stmt601); 

            match(input,31,FOLLOW_31_in_if_stmt603); 

            pushFollow(FOLLOW_stmt_list_in_if_stmt605);
            stmt_list();

            state._fsp--;


            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:209:46: ( else_part )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:209:47: else_part
                    {
                    pushFollow(FOLLOW_else_part_in_if_stmt608);
                    else_part();

                    state._fsp--;


                    }
                    break;

            }


            match(input,24,FOLLOW_24_in_if_stmt613); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "if_stmt"



    // $ANTLR start "else_part"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:212:1: else_part : 'ELSE' stmt_list ;
    public final void else_part() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:212:11: ( 'ELSE' stmt_list )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:212:13: 'ELSE' stmt_list
            {
            match(input,22,FOLLOW_22_in_else_part623); 

            pushFollow(FOLLOW_stmt_list_in_else_part625);
            stmt_list();

            state._fsp--;


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "else_part"



    // $ANTLR start "cond"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:215:1: cond : expr Compop expr ;
    public final void cond() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:215:6: ( expr Compop expr )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:215:8: expr Compop expr
            {
            pushFollow(FOLLOW_expr_in_cond635);
            expr();

            state._fsp--;


            match(input,Compop,FOLLOW_Compop_in_cond637); 

            pushFollow(FOLLOW_expr_in_cond639);
            expr();

            state._fsp--;


            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cond"



    // $ANTLR start "do_stmt"
    // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:221:1: do_stmt : 'DO' stmt_list 'WHILE' '(' cond ')' ';' ;
    public final void do_stmt() throws RecognitionException {
        try {
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:221:9: ( 'DO' stmt_list 'WHILE' '(' cond ')' ';' )
            // C:\\Users\\Brian Bowman\\workspace\\eclipse\\trunk\\PocketTranslator2\\src\\MicroParser.g:221:11: 'DO' stmt_list 'WHILE' '(' cond ')' ';'
            {
            match(input,21,FOLLOW_21_in_do_stmt671); 

            pushFollow(FOLLOW_stmt_list_in_do_stmt673);
            stmt_list();

            state._fsp--;


            match(input,33,FOLLOW_33_in_do_stmt675); 

            match(input,15,FOLLOW_15_in_do_stmt677); 

            pushFollow(FOLLOW_cond_in_do_stmt679);
            cond();

            state._fsp--;


            match(input,16,FOLLOW_16_in_do_stmt681); 

            match(input,19,FOLLOW_19_in_do_stmt682); 

            }

        }

        	catch (RecognitionException e) {
        		throw e;
        	}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "do_stmt"

    // Delegated rules


 

    public static final BitSet FOLLOW_27_in_program31 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_program33 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_program35 = new BitSet(new long[]{0x0000000042002000L});
    public static final BitSet FOLLOW_pgm_body_in_program42 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_program44 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_id58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_pgm_body70 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_func_declarations_in_pgm_body72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_in_decl_list84 = new BitSet(new long[]{0x0000000040002002L});
    public static final BitSet FOLLOW_string_decl_in_decl95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_var_decl_in_decl100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_string_decl111 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_string_decl113 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_string_decl115 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_str_in_string_decl117 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_string_decl119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_str132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Var_type_in_var_decl147 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_var_decl149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_var_decl154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_id_list202 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_id_tail_in_id_list206 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_id_tail219 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_id_tail221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list240 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_param_decl_list243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_param_decl_in_param_decl_list245 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_Var_type_in_param_decl257 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_param_decl259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_func_decl_in_func_declarations271 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_func_decl283 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_any_type_in_func_decl285 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_in_func_decl287 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_func_decl289 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_param_decl_list_in_func_decl290 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_func_decl292 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_func_decl294 = new BitSet(new long[]{0x0000000474202100L});
    public static final BitSet FOLLOW_func_body_in_func_decl304 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_func_decl306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decl_list_in_func_body325 = new BitSet(new long[]{0x0000000434200100L});
    public static final BitSet FOLLOW_stmt_list_in_func_body327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_stmt_list339 = new BitSet(new long[]{0x0000000434200102L});
    public static final BitSet FOLLOW_assign_stmt_in_stmt351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_read_stmt_in_stmt355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_write_stmt_in_stmt359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_stmt_in_stmt363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_stmt_in_stmt367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_do_stmt_in_stmt371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_assign_stmt382 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_assign_stmt384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_assign_expr394 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_assign_expr396 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_assign_expr398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_read_stmt408 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_read_stmt410 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_read_stmt412 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_read_stmt414 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_read_stmt415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_write_stmt425 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_write_stmt427 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_id_list_in_write_stmt429 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_write_stmt431 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_write_stmt432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_return_stmt442 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_return_stmt444 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_return_stmt446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_expr457 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Addop_in_expr461 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_factor_in_expr463 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_postfix_expr_in_factor476 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Mulop_in_factor479 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_postfix_expr_in_factor481 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_primary_in_postfix_expr493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_expr_in_postfix_expr497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_call_expr507 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_call_expr509 = new BitSet(new long[]{0x0000000000018380L});
    public static final BitSet FOLLOW_expr_list_in_call_expr511 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_call_expr515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expr_list525 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_expr_list528 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_expr_list530 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_15_in_primary542 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_primary543 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_primary544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_primary548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_primary552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_primary556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_if_stmt595 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_stmt597 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_cond_in_if_stmt599 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_if_stmt601 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_if_stmt603 = new BitSet(new long[]{0x0000000435600100L});
    public static final BitSet FOLLOW_stmt_list_in_if_stmt605 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_else_part_in_if_stmt608 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_if_stmt613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_else_part623 = new BitSet(new long[]{0x0000000434200100L});
    public static final BitSet FOLLOW_stmt_list_in_else_part625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_cond635 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_Compop_in_cond637 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_expr_in_cond639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_do_stmt671 = new BitSet(new long[]{0x0000000634200100L});
    public static final BitSet FOLLOW_stmt_list_in_do_stmt673 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_do_stmt675 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_do_stmt677 = new BitSet(new long[]{0x0000000000008380L});
    public static final BitSet FOLLOW_cond_in_do_stmt679 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_do_stmt681 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_do_stmt682 = new BitSet(new long[]{0x0000000000000002L});

}