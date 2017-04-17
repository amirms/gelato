SYNTAXDEF comment
FOR <http://www.servicifi.org/gelato/language/comment>
START Unit


OPTIONS {
	defaultTokenName = "COMMENT";
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

TOKENS {

	//Need to fix the overlapping lexical rules involving the following:
	// PictureString and Decimal Integers
	//Level Number, Segment Number and Priority Number, and that of decimal integers
	//The comment marker is changed to #
	DEFINE COMMENT $'#'(~('\n'|'\r'|'\uffff'))* $;
	
	@SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(.)$;
	}

RULES {
	
	Unit ::= comments*;
	
	Comment ::= value[];
}