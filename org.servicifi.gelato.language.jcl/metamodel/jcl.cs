SYNTAXDEF jcl
FOR <http://www.servicifi.org/gelato/language/jcl> <jcl.genmodel>
START containers.JobUnit

IMPORTS {
	
	commons : <http://www.servicifi.org/gelato/language/jcl/commons>
	containers : <http://www.servicifi.org/gelato/language/jcl/containers>
	statements : <http://www.servicifi.org/gelato/language/jcl/statements>
	parameters : <http://www.servicifi.org/gelato/language/jcl/parameters>

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
}


TOKENS{
	@SuppressWarnings(tokenOverlapping)
	DEFINE JCL_WORD $(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '\\' | '+' | '-'| '*'| '!' | '/' | '~') 
						('['('0'..'9')+']')? )+$;
	
	//	@SuppressWarnings(unusedToken)
	//DEFINE WHITESPACE $.$;
}


TOKENSTYLES {
	//"SL_COMMENT" COLOR #000080, ITALIC;
	
	//"ALPHANUMERIC_LITERAL" COLOR #2A00FF;
	
	"JCL_WORD" COLOR #000000;
	//"PICTURE_STRING" COLOR #3A00FF;
	//"PICTURE_STRING_EDITED" COLOR #3A00FF;
	
	
	//"JOB", "EXEC", "DD", "COMMAND", "CNTL", "ENDCNTL",
	//"IF", "THEN", "ELSE", "ENDIF", "JCLLIB", "OUTPUT",
	//"PEND", "PROC", "SET", "XMIT" 
	"EXEC" COLOR #7F0055, BOLD;
}


RULES {
	containers.JobUnit ::= statements+;
	statements.Execute ::= name[] "EXEC";
	
}