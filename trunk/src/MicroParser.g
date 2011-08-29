lexer grammar MicroParser;

KEYWORD 
   :  ('PROGRAM' | 'BEGIN' | 'END' | 'PROTO' | 'FUNCTION' | 'READ' | 'WRITE' | 
   'IF' | 'THEN' | 'ELSE' | 'ENDIF' | 'RETURN' | 'CASE' | 'ENDCASE' | 'BREAK' | 
   'DEFAULT' | 'DO' | 'WHILE' | 'FLOAT' | 'INT' | 'VOID' | 'STRING')	
   ; 

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

OPERATOR
   :  (':='|'+'|'-'|'*'|'/'|'='|'<'|'>'|'('|')'|';'|','|'!=')
   ;

STRINGLITERAL
    :  '"' ( ~('"') )* '"'
    ;
    
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;
