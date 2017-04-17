SYNTAXDEF preprocess
FOR <http://www.servicifi.org/gelato/language/cobol/preprocess> <preprocess.genmodel>
START containers.PreprocessingGroup, containers.Copybook

IMPORTS {
	containers : <http://www.servicifi.org/gelato/language/cobol/preprocess/containers>
	literals : <http://www.servicifi.org/gelato/language/cobol/preprocess/literals>
	sentences : <http://www.servicifi.org/gelato/language/cobol/preprocess/sentences>
	statements : <http://www.servicifi.org/gelato/language/cobol/preprocess/statements>
	operands : <http://www.servicifi.org/gelato/language/cobol/preprocess/operands>
	water : <http://www.servicifi.org/gelato/language/cobol/preprocess/water>
	}

OPTIONS {	
	defaultTokenName = "COBOL_WORD";
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
	@SuppressWarnings(unusedToken)
	DEFINE SL_COMMENT $'#'(~('\n'|'\r'|'\uffff'))* $;
	
	//Basic Alphanumeric Literals 
	DEFINE FRAGMENT ESCAPE_QUOTE_CHARACTER  $'"''"'$;	
	DEFINE FRAGMENT ESCAPE_APOST_CHARACTER  $'\'''\''$;	
	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_LITERAL $'"' ($ + ESCAPE_QUOTE_CHARACTER + $| ~('"'))* '"' $; 	
	DEFINE FRAGMENT ALPHANUMERIC_APOST_LITERAL $'\'' ($ + ESCAPE_APOST_CHARACTER + $| ~('\''))* '\'' $; 		
	
	//@SuppressWarnings(tokenOverlapping)
	DEFINE ALPHANUMERIC_LITERAL ALPHANUMERIC_QUOTE_LITERAL + $|$ + ALPHANUMERIC_APOST_LITERAL;
	
	//Hexadecimal Notation for Alphanumeric Literals	
	DEFINE FRAGMENT HEX_CHARACTERS $('0'..'9'|'a'..'f'|'A'..'F')+$;	
	DEFINE FRAGMENT ALPHANUMERIC_APOST_HEX_LITERAL $('x'|'X')'\'' $ + HEX_CHARACTERS + $ '\'' $;	
	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_HEX_LITERAL $('x'|'X')'"' $ + HEX_CHARACTERS + $ '"' $;
	
	DEFINE ALPHANUMERIC_HEX_LITERAL ALPHANUMERIC_QUOTE_HEX_LITERAL + $|$ + ALPHANUMERIC_APOST_HEX_LITERAL;
	
	//Numeric Literals
	//@SuppressWarnings(tokenOverlapping)
	DEFINE NUMERIC_LITERAL $('+'|'-')? ('0'..'9')+ ( ('!'|'~') ('0'..'9')* ( ('e'|'E') ('+'|'-')? ('0'..'9')+ )? )?$;	
	
	//In a cobol word, there is at least one character
	@SuppressWarnings(tokenOverlapping)
	DEFINE COBOL_WORD $('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '-' )+$;

	@SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(' ' | ',' | ';' | '\t'|'\f' |'\n' |'\r' )+$;
	
	//@SuppressWarnings(unusedToken)					
	DEFINE OTHERS $(']' | '[' | ')' | '(' | '!' | '~' | '/'| '*' | '=' | '>' | '<' | '+' | '-' | ':')$; 
}

RULES {
	
	containers.Copybook 
	::= ( water )*
   		( copyUnits	)*
	;
	
	containers.PreprocessingGroup 
   ::= ( preprocessingUnits  !0 )*
   ;

@SuppressWarnings(optionalKeyword)
@SuppressWarnings(featureWithoutSyntax) 
containers.PreprocessingUnit 
   ::=
    //IDENTIFICATION DIVISION		
	id[ id: "ID", identification : "IDENTIFICATION"] #1 "DIVISION" "." 
	!0
	"PROGRAM-ID" ( "." )?     
    name[]
         
   	dataSegment
   	
   	procedureSegment
   	   
	(	( nestedPreprocessingUnits )* 
	"END" "PROGRAM" ending "." )?
	 ("\u001a")?
  ;
  
containers.DataSegment
	::= ( water:water.DataSegmentWater )* ( copyUnits:containers.DataCopyUnit )*  ;
	
containers.ProcedureSegment
	::= "PROCEDURE" "DIVISION"
		( water:water.ProcedureSegmentWater )* ( copyUnits:containers.ProcedureCopyUnit )*
	;	
  
containers.DataCopyUnit
	::= sentence ( water:water.DataSegmentWater  )*
	;
	
containers.ProcedureCopyUnit
	::= sentence ( water:water.ProcedureSegmentWater )*
	;  	
	
sentences.CopySentence ::= "COPY" name[]
    	( ( "OF" | "IN" )  (  libraryName[] ) )?
    	suppress[ "SUPPRESS" : ""]
    	( "REPLACING" replacings+  )? ".";

sentences.ReplaceSentence 
		::= "REPLACE" switch["OFF" : "ON"]
	  	( replacings )* ".";
	

sentences.Replacing
	::= source	"BY" target;

//statements
statements.Execute
  ::= water['EXEC', 'END-EXEC']
  ;

//water

	water.By ::= "BY";
	
	water.In ::= "IN";
	
	water.Of ::= "OF";
	
	water.Replacing ::= "REPLACING";
	
	water.All ::= "ALL";
	
	water.End ::= "END";
	
	water.Suppress ::= "SUPPRESS";
	
	water.Replace ::= "REPLACE";
	
	water.Program ::= "PROGRAM";
	
	water.Division ::= "DIVISION";
	
	water.Off ::= "OFF";
	
	water.On ::= "ON";
	
	water.Procedure ::= "PROCEDURE";
	  
  	water.Dot ::= ".";

//operands
  	
operands.CobolWord ::= value[]; 
  
literals.NumericLiteral
	::= value[NUMERIC_LITERAL];	

literals.AlphanumericLiteral
	::= value[ALPHANUMERIC_LITERAL];	

literals.AlphanumericHexaDecimalLiteral
	::= value[ALPHANUMERIC_HEX_LITERAL]
	;		
	
literals.PseudoLiteral
	::= value['==','=='] ;
	
literals.AllLiteral ::= "ALL" constant;

//literals.Null ::= constant[null : "NULL", nulls : "NULLS"];

literals.Null ::= "NULL";

literals.Nulls ::= "NULLS";

//literals.Zero ::= constant[zero : "ZERO", zeros : "ZEROS", zeroes : "ZEROES"];

literals.Zero ::= "ZERO";

literals.Zeros ::= "ZEROS";

literals.Zeroes ::= "ZEROES";

//literals.Quote ::= constant[quote: "QUOTE", quotes : "QUOTES"];

literals.Quote ::= "QUOTE";

literals.Quotes ::= "QUOTES";

//literals.LowValue ::= constant[lowValue : "LOW-VALUE", lowValues : "LOW-VALUES"];
		
literals.LowValue ::= "LOW-VALUE";

literals.LowValues ::= "LOW-VALUES";		
		
//literals.HighValue ::= constant[highValue : "HIGH-VALUE", highValues : "HIGH-VALUES"];

literals.HighValue ::= "HIGH-VALUE";

literals.HighValues ::= "HIGH-VALUES";

//literals.Space ::= constant[space : "SPACE", spaces : "SPACES"];

literals.Space ::= "SPACE";

literals.Spaces ::= "SPACES";
  
}