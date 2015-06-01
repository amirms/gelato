SYNTAXDEF kernel
FOR <http://www.servicifi.org/gelato/language/kernel>
START containers.CompilationUnit


IMPORTS {
	commons : <http://www.servicifi.org/gelato/language/kernel/commons>
	variables : <http://www.servicifi.org/gelato/language/kernel/variables>
	statements : <http://www.servicifi.org/gelato/language/kernel/statements>
	expressions : <http://www.servicifi.org/gelato/language/kernel/expressions>
	procedures : <http://www.servicifi.org/gelato/language/kernel/procedures>
	parameters : <http://www.servicifi.org/gelato/language/kernel/parameters>
	containers : <http://www.servicifi.org/gelato/language/kernel/containers>
}

OPTIONS {
	//disableTokenSorting = "true";
	reloadGeneratorModel = "true";
	defaultTokenName = "IDENTIFIER";
	usePredefinedTokens = "false";
	memoize = "false";
	overrideScanner = "false";
	
}

TOKENS {
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $;

	// simple token
	DEFINE FRAGMENT CHAR $('a'..'z'|'A'..'Z')$;
	// simple token
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	
	// composed token
	DEFINE IDENTIFIER CHAR + $($ + CHAR + $|$ + DIGIT + $)*$;

	
	//DEFINE IDENTIFIER $('a'..'Z'|'0'..'9')+$;
	@SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(' '|'\t'|'\f'|'\r'|'\n')+$;
}

TOKENSTYLES {
	"SL_COMMENT" COLOR #000080, ITALIC;
	"STRING_LITERAL" COLOR #2A00FF;
	"IDENTIFIER" COLOR #000000;
}


RULES {

	//statements
	
	containers.CompilationUnit ::= (declarations:variables.Variable, procedures.Procedure)* 
									mainProcedure;
		
	//variables
	variables.Variable ::= "var" name[] ";" ;
		
	//procedures
	
	procedures.Procedure ::= label[] ":" "Procedure" ( name[] )? "(" ( arguments ("," arguments)* )? ")" "{" 
        	(!1 members:procedures.Procedure, statements.Statement  )* !0
        "}" ;
	
	//statements
	
	//condition has to point to expression statement
	statements.WhileLoop ::= label[] ":" "while" "(" condition ")" "do" statement ";";
	
	statements.Condition ::= label[] ":" "if" "(" condition ")" "then" statement 
		( "else" elseStatement )? ";";
	
	statements.Goto ::= label[] ":" "goto" target[] ";";
	
	statements.Block ::= (label[] ":" )? "{" statements* "}";
	
	statements.ParallelBlock ::= "{*" "order" "=" order[l2r : "l2r", r2l : "r2l", interleaved : "interleaved"]
									 statements+ "*}" ;
	
	statements.NonDeterministicBlock::= ">""|" ( statements )+;
	
	//TODO may be I should make the assigned variable to expression
	statements.AssignmentStatement ::=  label[] ":" target[] ":=" value ";";
	
	statements.ExpressionStatement ::= label[] ":" expression ";";
	
	statements.StatementWithException ::= label[] ":" "try" statement "with" exceptionStatements+ ;
	
	statements.ExceptionHandlerStatement ::= label[] ":" "exception" statement ;
	
	//statements.NotExceptionHandlerStatement ::= label[] ":" "not" "exception" "[" ( statements ( "," statements )* )? "]" ";";	
	
	//An abort statement must have a label
	statements.Abort ::= label[] ":" "abort" ";"; 
	
	statements.Skip ::= label[] ":" "skip" ";";
	
	//target is to s
	statements.ProcedureCall ::= label[] ":" "call" target[] "(" ( parameters ("," parameters)* )? ")" ";" ;
	
	//paramters
	parameters.Parameter ::= byReference["ref" : "val"] target[];
	
	//expressions
	
	//An expression must have a label
	expressions.Expression ::=  label[] ":" "[" ( children ( ";" children )* )? "]";
	
	expressions.Defines ::= "defines" "(" target[] ")";
	
	expressions.Uses ::= "uses" "(" target[] ")";
	
	expressions.Affects ::= "affects" "(" target[] ")";
	
	expressions.PostDefines ::= "postdefines" "(" target[] ")";
	
	expressions.PreUses ::= "preuses" "(" target[] ")";
	
	expressions.PostAffects ::= "postaffects" "(" target[] ")";
	
	
}