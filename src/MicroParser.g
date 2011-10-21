grammar MicroParser;

options{
 output=AST;
}
tokens{
	LABEL;
        FUNCTION_BODY;
        IF_COND;
        IF_MAIN;
        IF_ELSE;
        DO_MAIN;
        DO_COND;
}

@header{
	import java.util.HashMap;
}

// Disable automatic error recovery
@members {
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
	
}
// Alter code generation so catch-clauses get replace with
// this action.
@rulecatch {
	catch (RecognitionException e) {
		throw e;
	}
}

// Program
program :	 'PROGRAM' id 'BEGIN'
	{ 	tableOfTables.put(new Integer(symbolTableId), currentTable);
		tableOfTableNames.put(new Integer(symbolTableId), "Global");}
	 pgm_body 'END' EOF
	-> ^('PROGRAM' pgm_body);

id : IDENTIFIER {$IDENTIFIER.text.length() <= 31}?
	;

pgm_body : decl_list func_declarations
	;

decl_list 
	:	decl*
	;

decl : string_decl  | var_decl // | WS//string_decl_list decl? | var_decl_list decl? | WS
	;

string_decl : 'STRING' id ':=' str ';' {currentTable.add( new TableEntry($id.text,"STRING", $str.text));} //| WS
	->;

str : STRINGLITERAL {$STRINGLITERAL.text.length() <= 81}?
	;

//string_decl_tail : string_decl string_decl_tail?
//    ;

var_decl : Var_type id_list 
{	
	for(String s : idList){
		currentTable.add(new TableEntry(s,$Var_type.text, ""));
	}
} ';' //| WS 
	-> ;
	
protected
Var_type : 'FLOAT' | 'INT' 
	;

any_type : Var_type | 'VOID'
    ;

id_list : {idList.clear();} id {idList.add($id.text);} id_tail*
    ;
id_tail :	',' id {idList.add($id.text);} -> ^(id)
    ;

//var_decl_tail : var_decl var_decl_tail?
//   ;

// Function Parameter List
param_decl_list : param_decl (',' param_decl)*
	;

param_decl : Var_type id
	;

// Function Declarations
func_declarations : (func_decl)*
	;

func_decl : 'FUNCTION' any_type id '('param_decl_list?')' 'BEGIN' 

{symbolTableId++;
 currentTable = new ArrayList<TableEntry>();
 tableOfTables.put(new Integer(symbolTableId), currentTable);
 tableOfTableNames.put(new Integer(symbolTableId), $id.text); }  
 
func_body 'END' 

{currentTable = tableOfTables.get(new Integer(0));} -> ^('FUNCTION' id ^(FUNCTION_BODY func_body))

	;
    
func_body : decl_list stmt_list
	;

// Statement List
stmt_list : (stmt)*
	;

stmt : assign_stmt | read_stmt | write_stmt | return_stmt | if_stmt | do_stmt
	;

// Basic Statements
assign_stmt : assign_expr ';'!
	;

assign_expr : id ':=' expr -> ^(':=' id expr)
	;

read_stmt : 'READ' '(' id_list ')'';' -> ^('READ' id_list)
	;

write_stmt : 'WRITE' '(' id_list ')'';'-> ^('WRITE' id_list)
	;

return_stmt : 'RETURN' expr ';'
	-> ^('RETURN' expr);

// Expressions
expr : factor  (Addop ^factor)* 
	;

factor : postfix_expr (Mulop ^postfix_expr)*
	;

postfix_expr : primary | call_expr
	;

call_expr : id '('!(expr_list)? ')'!
	;

expr_list : expr (',' expr)*
	;

primary : '('!expr')'! | id | INTLITERAL | FLOATLITERAL
	;

Addop : '+' | '-'
	;

Mulop : '*' | '/'
	;

// Complex Statements and Condition
if_stmt : 'IF' '(' cond ')' 'THEN' stmt_list (else_part)?  'ENDIF'
	-> ^('IF' ^(IF_COND cond) ^(IF_MAIN stmt_list) ^(IF_ELSE else_part)?);

else_part : 'ELSE' stmt_list
	-> stmt_list;

cond : expr Compop^ expr;

Compop : '<' | '>' | '=' | '!='
	;

do_stmt : 'DO' stmt_list 'WHILE' '(' cond ')'';'
	-> ^('DO' ^(DO_MAIN stmt_list) ^(DO_COND cond) );

// Lexer tokens

//KEYWORD 
//   :  ('PROGRAM' | 'BEGIN' | 'END' | 'PROTO' | 'FUNCTION' | 'READ' | 'WRITE' | 
//   'IF' | 'THEN' | 'ELSE' | 'ENDIF' | 'RETURN' | 'CASE' | 'ENDCASE' | 'BREAK' | 
//   'DEFAULT' | 'DO' | 'WHILE' | 'FLOAT' | 'INT' | 'VOID' | 'STRING')	
//   ; 

IDENTIFIER  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
	;

INTLITERAL :	'0'..'9'+
	;

FLOATLITERAL
    :   ('0'..'9')+ '.' ('0'..'9')*
    |   '.' ('0'..'9')+
	;

COMMENT
    :   '--' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
	;

//OPERATOR
 //  :  (':='|'+'|'-'|'*'|'/'|'='|'<'|'>'|'('|')'|';'|','|'!=')
 //  ;

STRINGLITERAL
    :  '"' ( ~('"') )* '"'
	;
    
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
	;

Program_start
	:
	;
