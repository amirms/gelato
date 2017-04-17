SYNTAXDEF jcl
FOR <http://www.servicifi.org/gelato/language/jcl> <jcl.genmodel>
START containers.JobUnit

IMPORTS {
	
	waters : <http://www.servicifi.org/gelato/language/jcl/waters>
	containers : <http://www.servicifi.org/gelato/language/jcl/containers>
	statements : <http://www.servicifi.org/gelato/language/jcl/statements>
	
}


OPTIONS {
		defaultTokenName = "JCL_WORD";
	disableTokenSorting = "true";
	generateCodeFromGeneratorModel = "false";
	backtracking = "true";
	memoize = "true";
	usePredefinedTokens = "false";
	//resolveProxyElementsAfterParsing = "true";
	disableLaunchSupport = "true";
	disableDebugSupport = "true";
	ignoreTypeRestrictionsForPrinting = "true";
	overrideResourcePostProcessor = "false";
	overrideMetaInformation = "false";
	//overrideScanner="true";
}


TOKENS{
	
	
	DEFINE SL_COMMENT $'*'(~('\n'|'\r'|'\uffff'))* $;
	
	
	@SuppressWarnings(unusedToken)
	DEFINE JCL_WORD $('A'..'Z' | 'a'..'z')('A'..'Z' | 'a'..'z' | '0'..'9' | '_' )*$;			
	//	DEFINE JCL_WORD $(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '\\' | '+' | '-'| '*'| '!' | '/' | '~') 
	//('['('0'..'9')+']')? )+$;

	//Basic Alphanumeric Literals 
	DEFINE FRAGMENT ESCAPE_QUOTE_CHARACTER  $'"''"'$;	
	DEFINE FRAGMENT ESCAPE_APOST_CHARACTER  $'\'''\''$;	
	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_LITERAL $'"' ($ + ESCAPE_QUOTE_CHARACTER + $| ~('"'))* '"' $; 	
	DEFINE FRAGMENT ALPHANUMERIC_APOST_LITERAL $'\'' ($ + ESCAPE_APOST_CHARACTER + $| ~('\''))* '\'' $; 	

	@SuppressWarnings(unusedToken)
	DEFINE ALPHANUMERIC_LITERAL ALPHANUMERIC_QUOTE_LITERAL + $|$ + ALPHANUMERIC_APOST_LITERAL;
	@SuppressWarnings(unusedToken)	
	DEFINE DECIMAL_INTEGER_LITERAL $('0'|'1'..'9''0'..'9'*)$;
	
	@SuppressWarnings(unusedToken)
	DEFINE SLASH_SLASH $'/' $;
	@SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(',' | '.' | '\u0024' |' '|')' | '(' | '>' | '<' | '@' | '#' | '^' | '{' | '}'
				| '&' | '%' | '+' | '-' | '_' | ':' | ';' | '?'| '!'|'\t'|'\f'|'\r'|'\n')+$;
}


TOKENSTYLES {
	"SLASH_SLASH" COLOR  #001080;
	"SL_COMMENT" COLOR #000080, ITALIC;
	
	//"ALPHANUMERIC_LITERAL" COLOR #2A00FF;
	
	"JCL_WORD" COLOR #000000;
	//"PICTURE_STRING" COLOR #3A00FF;
	//"PICTURE_STRING_EDITED" COLOR #3A00FF;
	
	
	"EXEC", "PGM" COLOR #7F0055, BOLD;
}


RULES {
	//FIXME the account information
	containers.JobUnit ::= waters* (executes+ waters*)+
	;
	//	containers.JobUnit ::= executes+
	//;
	
	//Account Infomation
	
	
	
	//statements
	// //[procStepNamename] EXEC positional-parameter [, keyword-parameters]* [,symbolic-parameters = value]* [comments]
	//State
	statements.ExecuteProgram ::=  "EXEC" "PGM" "=" programName[];
	
	//statements.ExecuteProcedure ::=  "EXEC" ("PGM")? "=" procedureName[];
	//A program-name = {program-name }
	//{*.procStepNamename.ddname }
	//{*.procStepNamename.procprocStepNamename.ddname}
	//{JCLTEST }
	//{JSTTEST}


	//refernces.DSNReference ::= "*"
	
	//literals
	
	waters.Water ::= value[] | "=" | "EXEC" ;
	
}