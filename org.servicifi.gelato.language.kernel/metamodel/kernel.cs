SYNTAXDEF kernel
FOR <http://www.servicifi.org/gelato/language/kernel>
START containers.CompilationUnit


IMPORTS {
	commons : <http://www.servicifi.org/gelato/language/kernel/commons>
	dataitems : <http://www.servicifi.org/gelato/language/kernel/dataitems>
	statements : <http://www.servicifi.org/gelato/language/kernel/statements>
	expressions : <http://www.servicifi.org/gelato/language/kernel/expressions>
	procedures : <http://www.servicifi.org/gelato/language/kernel/procedures>
	parameters : <http://www.servicifi.org/gelato/language/kernel/parameters>
	containers : <http://www.servicifi.org/gelato/language/kernel/containers>
	references : <http://www.servicifi.org/gelato/language/kernel/references>
}

OPTIONS {
	//disableTokenSorting = "true";
	reloadGeneratorModel = "true";
	defaultTokenName = "CHARACTER_LITERAL";
	usePredefinedTokens = "false";
	memoize = "false";
	backtracking = "true";
	overrideScanner = "false";
	
}

TOKENS {
	DEFINE SL_COMMENT $'//'(~('\n'|'\r'|'\uffff'))* $;

	// simple token
	DEFINE FRAGMENT CHAR $('a'..'z'|'A'..'Z')$;
	// simple token
	DEFINE FRAGMENT DIGIT $('0'..'9')$;
	
	// character literal
	DEFINE CHARACTER_LITERAL $($ + DIGIT + $)+$;
	
	// composed token
	DEFINE IDENTIFIER CHAR + $($ + CHAR + $|$ + DIGIT + $)*$;

	//DEFINE IDENTIFIER $('a'..'Z'|'0'..'9')+$;
	@SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(' '|'\t'|'\f'|'\r'|'\n')+$;
}

TOKENSTYLES {
	"SL_COMMENT" COLOR #000080, ITALIC;
	//"STRING_LITERAL" COLOR #2A00FF;
	"IDENTIFIER" COLOR #000000;
	"CHARACTER_LITERAL" COLOR #3CB300;
	
}


RULES {

	//statements
	
	containers.CompilationUnit ::= (declarations:dataitems.DataItem )* 				
									(declarations:procedures.Procedure !0)*
									mainProcedure
									 ;
		
	//variables
	dataitems.DataItem ::= "var" name[IDENTIFIER] ";" !0 ;
		
	//procedures
	
	procedures.Procedure ::= label[] ":" "Procedure" ( name[IDENTIFIER] )? "(" ( parameters ("," parameters)* )? ")" "{" 
        	(!1 members:procedures.Procedure, statements.Statement  )* !0
        "}" !0 ;
        
   	//procedures.MainProcedure ::= label[] ":" "Procedure" "main" "(" ( parameters ("," parameters)* )? ")" "{" 
    //    	(!1 members:procedures.Procedure, statements.Statement  )* !0
    //    "}" ;   
    
    procedures.MainProcedure ::= label[] ":" "Procedure" "main" "(" ")" "{" 
        	(!1 members:statements.Statement  )* !0
        "}" ;  
	
	//statements
	
	//condition has to point to expression statement
	statements.WhileLoop ::= label[] ":" "while" "(" condition ")" "do" statement ";";
	
	statements.Condition ::= label[] ":" "if" "(" condition ")" "then" !1 statement 
		(!0 "else" !1 elseStatement )? ";";
	
	statements.Goto ::= label[] ":" "goto" target[IDENTIFIER] ";";
	
	statements.Block ::= label[] ":" "{"!1 statements* !0 "}";
	
	statements.ParallelBlock ::= "{*" "order" "=" order[l2r : "l2r", r2l : "r2l", interleaved : "interleaved"] !1
									 statements+ !0 "*}" ;
	
	statements.NonDeterministicBlock::= ">""|" ( statements )+;
	
	//TODO may be I should make the assigned variable to expression
	// statements.AssignmentStatement ::=  label[] ":" target[IDENTIFIER] ":=" value ";";
	
	statements.ExpressionStatement ::= label[] ":" expression ";";
	
	statements.StatementWithException ::= label[] ":" "try" statement !1 "with" exceptionStatements+ ;
	
	statements.ExceptionHandlerStatement ::= label[] ":" "exception" statement ;
	
	//statements.NotExceptionHandlerStatement ::= label[] ":" "not" "exception" "[" ( statements ( "," statements )* )? "]" ";";	
	
	//An abort statement must have a label
	statements.Abort ::= label[] ":" "abort" ";"; 
	
	statements.Skip ::= label[] ":" "skip" ";";
	
	//ReturnValue is an expression
	statements.Return ::= label[] ":" "return" ";" ;
	
	//target is to procedure
	statements.ProcedureCall ::= label[] ":" "call" target[IDENTIFIER] "(" ( arguments ("," arguments)* )? ")" ";" ;
	
	//parameters
	parameters.Parameter ::= byReference["ref" : "val"] name[IDENTIFIER];
	
	//references
	references.Argument ::= target[IDENTIFIER];
	
	//expressions
	
	//An expression must have a label
	expressions.Expression ::=  label[] ":" "[" ( children ( ";" children )* )? "]";
	
	//target is variables.Variable
	expressions.Defines ::= "defines" "(" target[IDENTIFIER] ")";
	
	expressions.Uses ::= "uses" "(" target[IDENTIFIER] ")";
	
	expressions.Affects ::= "affects" "(" target[IDENTIFIER] ")";
	
	//expressions.PostDefines ::= "postdefines" "(" target[IDENTIFIER] ")";
	
	//expressions.PreUses ::= "preuses" "(" target[IDENTIFIER] ")";
	
	//expressions.PostAffects ::= "postaffects" "(" target[IDENTIFIER] ")";
	
	
}