grammar LittleNic;

options{output=AST;ASTLabelType=CommonTree;}
tokens{
	PROGRAM;
	EXEC;
	CALL_DEF;
	ASSIGNMENT;
	DECLARATIONS;
	ARGS;
	PARAMS;
	VAR='VAR';
}

@members
{
    public ErrorReporter err;
    
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e)
    {
        String msg = getErrorMessage(e, tokenNames);
	err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}

@lexer::members
{
    public ErrorReporter err;
    public void displayRecognitionError(String[] tokenNames,
                                        RecognitionException e)
    {
        String msg = getErrorMessage(e, tokenNames);
	err.reportSyntaxError(e.line, e.charPositionInLine, msg);
    }
}

/*** Ignore comments and whitespace etc... ***/
	COMMENT	:	'/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;};
	
	WS	:	(
				' '
		        |	'\t'
		        |	'\r'
		        |	'\n'
	        	) 	{$channel=HIDDEN;}
	    ;

/*** TOKENS ***/
	TYPE	:	'COUNT' | 'TRUTH';
	
	BOOL	:	'T' | 'F';
	
	IDENTIFIER 
		:	('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
		
	NUMBER	:	('0'..'9')+;
	
	STRING	:	'"' ~('\r'|'\n'|'"')* '"';

/*** PROGRAM, CODE AND DECLARATION BLOCKS ***/
	prog	:	'PROGRAM'^ IDENTIFIER ';'! declarations code_block ';'! EOF!;

	code 
		:	'BEGIN'! (statement (';'! statement)* | /* empty */) 'END'!;

	code_block
		:	code -> ^(EXEC code?);

	full_block
		:	inner_declarations code_block;
		
	statement_block
		:	statement -> ^(EXEC statement?);
	
	declarations 
		:	(declaration (';' declaration)* | /* empty */) -> ^(DECLARATIONS declaration*);
	
	inner_declarations
		:	('VAR' var_dec (';' 'VAR' var_dec)* | /* empty */) -> ^(DECLARATIONS var_dec*);

/*** PARAMS AND ARGUMENTS ***/
	param_list
		:	var_dec (','! var_dec)*
		|	/* empty */ ;
	
	params	:	'(' param_list ')' -> ^(PARAMS param_list?);
	
	arg_list
		:	expr (','! expr)*
		|	/* empty */;
	
	args	:	'(' arg_list ')' -> ^(ARGS arg_list?);
		
	var_dec	:	IDENTIFIER ':' TYPE -> ^('VAR' IDENTIFIER TYPE);
	
/*** DECLARATIONS AND STATEMENTS ***/
	declaration
		:	'VAR'! var_dec
		|	'FUNCTION'^ IDENTIFIER params ':'! TYPE ':='! full_block
		|	'PROCEDURE'^ IDENTIFIER params ':='! full_block;
		
	statement 
		:	output | if_stat | while_stat | assignment | call | code;
	

	assignment 
		:	IDENTIFIER ':=' expr -> ^(ASSIGNMENT IDENTIFIER expr);
		
	output	:	'OUTPUT'^ (STRING | IDENTIFIER);
	
	if_stat	:	'IF'^ expr 'THEN'! statement_block 'ELSE'! statement_block;
	
	while_stat
		:	'WHILE'^ expr 'DO'! statement_block;
	
	call	:	IDENTIFIER args -> ^(CALL_DEF IDENTIFIER args);

/*** EXPRESSIONS ***/
	//Shortcut to make this named nicely
	expr	: 	bool_expr;
	
	//We can only (at most) have one of these per expression
	bool_expr
		:	add	(('=='|'!='|'<'|'>'|'<='|'>=')^ add)?;
	
	//Shortcut to make this named nicely
	arith_expr
		:	add;
	
	add	:	mul	(('+'|'-')^ mul)* ;
	mul	:	item	('*'^      item)*;
	
	item	:	BOOL
		| 	IDENTIFIER
		|	call
		|	'('! expr ')'!
		|	num -> ^(NUMBER num);
		
	num	:	('+' | '-')? NUMBER;


