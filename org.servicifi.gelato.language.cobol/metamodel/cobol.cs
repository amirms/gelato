SYNTAXDEF cobol
FOR <http://www.servicifi.org/gelato/language/cobol> <cobol.genmodel>
START containers.CompilationGroup

IMPORTS {
	verbs : <http://www.servicifi.org/gelato/language/cobol/verbs>
	labels : <http://www.servicifi.org/gelato/language/cobol/labels>
	commons : <http://www.servicifi.org/gelato/language/cobol/commons>
	containers : <http://www.servicifi.org/gelato/language/cobol/containers>
	statements : <http://www.servicifi.org/gelato/language/cobol/statements>
	sentences : <http://www.servicifi.org/gelato/language/cobol/sentences>
	divisions : <http://www.servicifi.org/gelato/language/cobol/divisions>
	sections : <http://www.servicifi.org/gelato/language/cobol/sections>
	paragraphs : <http://www.servicifi.org/gelato/language/cobol/paragraphs>
	references : <http://www.servicifi.org/gelato/language/cobol/references>
	literals : <http://www.servicifi.org/gelato/language/cobol/literals>
	ios : <http://www.servicifi.org/gelato/language/cobol/ios>
	arithmetics : <http://www.servicifi.org/gelato/language/cobol/arithmetics>
	conditions : <http://www.servicifi.org/gelato/language/cobol/conditions>
	operators : <http://www.servicifi.org/gelato/language/cobol/operators>
	operands : <http://www.servicifi.org/gelato/language/cobol/operands>
	identifiers : <http://www.servicifi.org/gelato/language/cobol/identifiers>
	water : <http://www.servicifi.org/gelato/language/cobol/water>
	registers : <http://www.servicifi.org/gelato/language/cobol/registers>
	environments : <http://www.servicifi.org/gelato/language/cobol/environments>
	dataitems : <http://www.servicifi.org/gelato/language/cobol/dataitems>
	specialnames : <http://www.servicifi.org/gelato/language/cobol/specialnames>
	tables : <http://www.servicifi.org/gelato/language/cobol/tables>
	files : <http://www.servicifi.org/gelato/language/cobol/files>
	parameters : <http://www.servicifi.org/gelato/language/cobol/parameters>
	declaratives : <http://www.servicifi.org/gelato/language/cobol/declaratives>
	functions : <http://www.servicifi.org/gelato/language/cobol/functions>
	handlers : <http://www.servicifi.org/gelato/language/cobol/handlers>
	strings : <http://www.servicifi.org/gelato/language/cobol/strings>
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
	DEFINE SL_COMMENT $'#'(~('\n'|'\r'|'\uffff'))* $;
	
	//DEFINE EXEC_WATER $'SQL'(~('END-EXEC'))*$;
	
	//@SuppressWarnings(tokenOverlapping)
	DEFINE BOOLEAN_LITERAL $ 'TRUE' | 'FALSE'$;
	
	//removed this and changed all occurrences of level-number with decimal integer
	//@SuppressWarnings(tokenOverlapping)
	//DEFINE LEVEL_NUMBER $('1'..'9' | '0'..'4''0'..'9' | ('7''7'))$;
	
	//DEFINE FRAGMENT PICTURE_STRING_CHARACTER $'X'|'S'|'P'|'9'|'V'|'A'|'N'$;
	
	//DEFINE FRAGMENT PICTURE_STRING_EDITED_CHARACTER 
	//	$'B'|'E'|'Z'|('C''R')|('D''B')| ',' | '0' | '\\' | '+' | '-'| '*'| ':'| '/' $ ;

	//DEFINE FRAGMENT LEVEL_NUMBER $ (('0')? ('0'..'9')) | ('1'..'4')('0'..'9') | '7''8' $;
			
//	DEFINE FRAGMENT UNICODE_CHARACTER $'\\''u'('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')('0'..'9'|'a'..'f'|'A'..'F')$;
	
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
	
	//Null-terminated Alphanumeric Literals	
//	DEFINE FRAGMENT ALPHANUMERIC_QUOTE_NULL_LITERAL $('z'|'Z')$ + ALPHANUMERIC_QUOTE_LITERAL;	
//	DEFINE FRAGMENT ALPHANUMERIC_APOST_NULL_LITERAL $('z'|'Z')$ + ALPHANUMERIC_APOST_LITERAL;
	
//	DEFINE ALPHANUMERIC_NULL_LITERAL ALPHANUMERIC_QUOTE_NULL_LITERAL + $|$ + ALPHANUMERIC_APOST_NULL_LITERAL;
	
	//Numeric Literals
	//@SuppressWarnings(tokenOverlapping)
	DEFINE DECIMAL_INTEGER_LITERAL $('+'|'-')? ('0'..'9''0'..'9'*)$;
	//@SuppressWarnings(tokenOverlapping)
	//Changed the optional decimal part to mandatory
	DEFINE DECIMAL_FIXED_LITERAL $('+'|'-')? ('0'..'9')+ ('!'|'~') ('0'..'9')+$;
	//@SuppressWarnings(tokenOverlapping)
	DEFINE DECIMAL_FLOAT_LITERAL $('+'|'-')? ('0'..'9')+ ('!'|'~') ('0'..'9')* ('e'|'E') ('+'|'-')? ('0'..'9')+$;	
	
	//In a cobol word, there is at least one character
	@SuppressWarnings(tokenOverlapping)
	DEFINE COBOL_WORD $(('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '\\' | '+' | '-'| '*'| '!' | '/' | '~') 
						('['('0'..'9')+']')? )+$;
	
	//@SuppressWarnings(tokenOverlapping)
	//DEFINE PICTURE_STRING $($ + PICTURE_STRING_CHARACTER + $('('('0'..'9')+')')? )+$;
	
	//@SuppressWarnings(tokenOverlapping)
	//DEFINE PICTURE_STRING_EDITED 
	//	$(($ + PICTURE_STRING_CHARACTER + $|$ + PICTURE_STRING_EDITED_CHARACTER + $)('('('0'..'9')+')')?  )+$;
		
	//DEFINE NUMERIC_LITERAL DECIMAL_FLOAT_LITERAL + $|$ + DECIMAL_FIXED_LITERAL + $|$ + DECIMAL_INTEGER_LITERAL;
	
	//DBCS Literals
	
//	DEFINE FRAGMENT DBCS_CHARACTERS $'<'(~('>'))'>'$;
		
//	DEFINE FRAGMENT DBCS_APOST_LITERAL $('g'|'G')'\'' $ + DBCS_CHARACTERS + $ '\'' $;
//	DEFINE FRAGMENT DBCS_QUOTE_LITERAL $('g'|'G')'"' $ + DBCS_CHARACTERS + $ '"' $;	
	
	//If the NSYMBOL(DBCS) compiler option is in effect, 
	// the opening delimiter N' and N" identifies a DBCS literal
//	DEFINE FRAGMENT NATIONAL_QUOTE_DBCS_LITERAL $('n'|'N')'"' $ + DBCS_CHARACTERS + $ '"' $;
//	DEFINE FRAGMENT NATIONAL_APOST_DBCS_LITERAL $('n'|'N')'\'' $ + DBCS_CHARACTERS + $ '\'' $;
	
//	DEFINE DBCS_LITERAL	DBCS_APOST_LITERAL + $|$ + DBCS_QUOTE_LITERAL 
//		+ $|$ + NATIONAL_QUOTE_DBCS_LITERAL + $|$ + NATIONAL_APOST_DBCS_LITERAL;
	
	//National Literals 
//	DEFINE FRAGMENT NATIONAL_QUOTE_LITERAL $('n'|'N')'"' $ + UNICODE_CHARACTER + $+ '"' $;
//	DEFINE FRAGMENT NATIONAL_APOST_LITERAL $('n'|'N')'\'' $ + UNICODE_CHARACTER + $+ '\'' $;
	
//	DEFINE NATIONAL_LITERAL NATIONAL_QUOTE_LITERAL + $|$ + NATIONAL_APOST_LITERAL;
	
	//Hexadecimal Notation for National Literals 
// 	DEFINE FRAGMENT NATIONAL_QUOTE_HEX_LITERAL $('n''x'|'N''X')'"' $ + HEX_CHARACTERS + $ '"' $;
//	DEFINE FRAGMENT NATIONAL_APOST_HEX_LITERAL $('n''x'|'N''X')'\'' $ + HEX_CHARACTERS + $ '\'' $;
	
	//DEFINE NATIONAL_HEX_LITERAL NATIONAL_QUOTE_HEX_LITERAL + $|$ + NATIONAL_APOST_HEX_LITERAL;

	//DEFINE PSEUDO_LITERAL $'=''='(~('='))*'=''='$;
		
	//@SuppressWarnings(tokenOverlapping)
	
	
	//DEFINE UNIFIED_USER_DEFINED COBOL_WORD + $|$ + PICTURE_STRING + $|$ + PICTURE_STRING_EDITED
	//							+ $|$ + LEVEL_NUMBER + $|$ + DECIMAL_INTEGER_LITERAL
	//							+ $|$ + DECIMAL_FIXED_LITERAL + $|$ + DECIMAL_FLOAT_LITERAL;  
	
	
	@SuppressWarnings(unusedToken)
	DEFINE WHITESPACE $(.)+$;
}

TOKENSTYLES {
	"SL_COMMENT" COLOR #000080, ITALIC;
	
	"ALPHANUMERIC_LITERAL" COLOR #2A00FF;
	
	"COBOL_WORD" COLOR #000000;
	//"PICTURE_STRING" COLOR #3A00FF;
	//"PICTURE_STRING_EDITED" COLOR #3A00FF;
	
	
	
	//"CONVERTING", "COMMUNICATION", "END-ACCEPT", "LINE",
	//"END-OF-PAGE", "END-DELETE", "END-DISPLAY",
	////"END-WRITE", "END-START", "END-REWRITE", "END-READ",
	//"INVALID", "FIRST", "FALSE", "READQ", "CURSOR", "EOP",
	//"LINK", "LINKAGE", "PAGE", "PREVIOUS", "READNEXT", "SQL"
	
	//CICS-Related
	//"CICS", "TD", "TOKEN", "SYS", "SYSID", "RRN", "SYNCONRETURN",
	//"REPEATABLE", "RIDFLD", "QUEUE", "RBA", "NUMITEMS",
	//"QNAME", "MASSINSERT", "NOSUSPEND", "LOAD", "MAIN",
	//"XRBA", "XCTL", "WRITEQ", "UNCOMMITTED", "TS",
	//"TRANSID", "TR", "DATASET", "DATALENGTH",  "GENERIC",
	//"DELETEQ", "INPUTMSGLEN", "INPUTMSG", "KEYLENGTH",
	//"ITEM", "CHANNEL", "AUXILIARY", "CONSISTENT", "COMMAREA", 
	//"SQL"
	
	//DataDescription
	//"SYNCHRONIZED", "SYNC", "TRAILING", "LEFT",
	//"RIGHT", "SEPARATE", "BLANK", "JUST", "JUSTIFIED", "LEADING", 
	//"FOR",
	//Others
	"FOOTING", "LINAGE", "LINES", "ORGANIZATION", "BLOCK",
	"BOTTOM", "CODE-SET",  "SEQUENTIAL", "SD",
	"TOP", "REPORT", "RECORDING", "REPORTS", 
	"BY", "FROM",
	"ADD", "ADDRESS", "ADVANCING", "AFP-5A", 
	"AFTER", "ALL", "ALPHABETIC", "ALPHANUMERIC", 
	"ALPHANUMERIC-EDITED", "ALSO", "ALTER", "ANY", "ARE", 
	"ASCENDING", "ASSIGN", "AT",  "BEFORE", 
	"BINARY",  "BY", "C01", 
	"C02", "C03", "C04", "C05", "C06", "C07", "C08", "C09", 
	"C10", "C11", "C12", "CALL", "CANCEL", 
	"CHARACTER", "CHARACTERS",  "CLOSE", 
	"COMMA", "COMMON", "COMP", 
	"COMP-1", "COMP-2", "COMP-3", "COMP-4", "COMP-5", 
	"COMPUTATIONAL", "COMPUTATIONAL-1", "COMPUTATIONAL-2", 
	"COMPUTATIONAL-3", "COMPUTATIONAL-4", "COMPUTATIONAL-5", 
	"COMPUTE", "CONFIGURATION",  "CONSOLE", 
	"CONTAINS", "CONTENT", "CONTINUE", "COPY", 
	"CORR", "CORRESPONDING", "COUNT", "CSP", "DATA", 
	"DBCS", "DEBUGGING", "DECIMAL-POINT", 
	"DECLARATIVES", "DECLARE", "DELETE", "DELIMITED", 
	"DELIMITER", "DEPENDING", "DESCENDING", "DISABLE", "DISPLAY", 
	"DIVIDE", "DIVISION", "EGCS", "ELSE", "ENABLE", "END", 
	"END-ADD", "END-CALL", "END-COMPUTE", 
	"END-DIVIDE", "END-EVALUATE", 
	"END-EXEC", "END-IF", "END-MULTIPLY",  
	"END-PERFORM", "END-RETURN", 
	"END-SEARCH", "END-STRING", "END-SUBTRACT", 
	"END-UNSTRING",  "ENTRY", "ENVIRONMENT", 
	"EQUAL", "ERROR", "EVALUATE", "EXCEPTION", "EXEC", "EXIT", 
	"EXTEND", "EXTERNAL",  "FD", "FILE", "FILE-CONTROL", 
	"FILLER", "FOR", "FROM", "FUNCTION", 
	"GENERATE", "GIVING", "GLOBAL", "GO", "GOBACK", 
	"GREATER", "HIGH-VALUE", "HIGH-VALUES", "I-O", "I-O-CONTROL", 
	"ID", "IDENTIFICATION", "IF", "IN", "INCLUDE", "INDEX", 
	"INDEXED", "INITIAL", "INITIALIZE", "INITIATE", "INPUT", 
	"INPUT-OUTPUT",  "INSERT", "INSPECT", 
	"INTO", "IS",  "KEY", 
	"LABEL",  "LENGTH", "LESS",  "LINKAGE",
	 "LOCAL-STORAGE", "WHERE", "ORDER",
	"LOCK", "LOW-VALUE", "LOW-VALUES",  
	"MERGE", "MODE", "MOVE", "MULTIPLY", "NATIONAL", "NATIONAL-EDITED", 
	"NEXT", "NO", "NOT", "NULL", "NULLS", "NUMERIC", 
	"NUMERIC-EDITED", "OBJECT-COMPUTER", "OCCURS", "OF", 
	"OFF", "OMITTED", "ON", "OPEN", "OPTIONAL", "OR",  
	"OTHER", "OUTPUT", "OVERFLOW", "PACKED-DECIMAL", 
	"PARAGRAPH", "PERFORM", "PIC", "PICTURE", "POINTER", 
	"PROCEDURE", "PROGRAM", "PROGRAM-ID", "PURGE", 
	"QUOTE", "QUOTES", "READ", "RECEIVE", "BY",
	"RECORD",  "RECORDS", "REDEFINES", "REEL", 
	"REFERENCE", "RELEASE", "REMAINDER", "REMOVAL", "RENAMES", 
	"REPLACE", "REPLACING",  
	"RETURN", "RETURNING", "REVERSED", "REWIND", "REWRITE", 
	"ROUNDED", "RUN",  "S01", "S02", 
	"S03", "S04", "S05", "SEARCH", "SECTION", "SELECT", 
	"SEND", "SENTENCE", "SET", "SIGN", 
	"SIZE", "SORT", "SOURCE-COMPUTER", "SPACE", "SPACES", 
	"SPECIAL-NAMES", "STANDARD", "START", "STATUS", "STOP",
	"STRING", "SUBTRACT", "SUPPRESS", 
	"SYSIN", "SYSIPT", "SYSLIST", 
	"SYSLST", "SYSOUT", "SYSPCH", "SYSPUNCH", "TALLYING", 
	"TERMINATE", "TEST", "THAN", "THEN", "THROUGH", "THRU", "TIMES", "TO", 
	"TRUE", "FALSE",
	"UNIT", "UNSTRING", "UNTIL", "UPDATE", "UPON", 
	"USAGE", "USE", "USING",  "VALUE", "VALUES", "VARYING", 
	"WHEN", "WITH", "WORKING-STORAGE", "WRITE", 
	"ZERO", "ZEROES", "ZEROS" COLOR #7F0055, BOLD;
}

RULES {

//containers.EmptyModel
//	::= ( identificationDivisions !0)*
//	;

@SuppressWarnings(optionalKeyword)
@SuppressWarnings(featureWithoutSyntax) //name is set by CobolSourceOrClassFileResource.load()
containers.CompilationGroup 
   ::= (compilationUnits  !0 )*
   ;

@SuppressWarnings(optionalKeyword)
@SuppressWarnings(featureWithoutSyntax) //name is set by CobolSourceOrClassFileResource 
containers.CompilationUnit 
   ::=
    //IDENTIFICATION DIVISION		
	( identificationDivision )
    !0 
    //ENVIORNMENT DIVISION
    ( environmentDivision )?   
    !0 
    //DATA DIVISION
    ( dataDivision )? 
    !0 
    //PROCEDURE DIVISION
    ( procedureDivision )?
    !0
	( ( nestedCompilationUnits )* 
	"END" "PROGRAM" name[] "." )?
	 ("\u001a")?
  ;
 
//copybooks
  
//copybooks.DataCopybook ::= ( units )+;

//copybooks.BehaviorCopybook ::=
//		 ( sentences:sentences.Sentence )*
//	     ( paragraphs )*
///	     ( sections )*
//    ;
  
@SuppressWarnings(featureWithoutSyntax)  
divisions.IdentificationDivision
  ::= ("ID" | "IDENTIFICATION" ) #1 "DIVISION" "." 
	!0
	"PROGRAM-ID" ( "." )?     
    name[] 
    ( ("IS")? 
   	// property[initial : "INITIAL", common : "COMMON", recursive : "RECURSIVE" ]+       
	properties[initial : "INITIAL", common : "COMMON"]+ 
    ( "PROGRAM" )? )?  (".")?
    
    (water:water.IdentificationDivisionWater)* 
    ;  

divisions.EnvironmentDivision
  ::=  "ENVIRONMENT" #1 "DIVISION"  "."
    	( sections:sections.ConfigurationSection, 
    		sections.IOSection )*
  ;

divisions.DataDivision 
  ::= "DATA" #1 "DIVISION"  "."
        ( sections:sections.DataDivisionSection )*
  ;      

sections.ConfigurationSection
  ::= "CONFIGURATION" "SECTION" "."
  	(paragraphs:paragraphs.ConfigurationSectionParagraph )*
  ;

//TODO I thought the FileControlParagraph was mandatory, but
//apparently it isn't

sections.IOSection
  ::= "INPUT-OUTPUT" #1 "SECTION"  "."
     ( paragraphs:paragraphs.FileControlParagraph )?
     ( paragraphs:paragraphs.IOControlParagraph )?
  ; 


@SuppressWarnings(featureWithoutSyntax)
sections.FileSection
  ::= "FILE" #1 "SECTION" "." 
     ( fileDescriptors
     //| sentences:sentences.DataCopySentence 
     )*
  ;
      
//removed the dot in the exec statement      
@SuppressWarnings(featureWithoutSyntax)
sections.WorkingStorageSection
  ::= "WORKING-STORAGE" #1 "SECTION" "." 
	( records
	| sentences:sentences.ExecuteSentence //, sentences.ReplaceSentence, sentences.DataCopySentence
	| (statements:statements.Execute ) )*
  ;

//removed the dot in the exec statement       
@SuppressWarnings(featureWithoutSyntax)
sections.LocalStorageSection
  ::= "LOCAL-STORAGE" #1 "SECTION" "." 
	( records
	| sentences:sentences.ExecuteSentence //, sentences.ReplaceSentence, sentences.DataCopySentence
	)*
  ;

//removed the dot in the exec statement   
@SuppressWarnings(featureWithoutSyntax)
sections.LinkageStorageSection
  ::= ( "LINKAGE-STORAGE" | "LINKAGE" ) #1 "SECTION"  "." 
	( records
	| sentences:sentences.ExecuteSentence //, sentences.ReplaceSentence, sentences.DataCopySentence
	)*
  ;   

//paragraphs
  
paragraphs.SourceComputerParagraph
  ::= "SOURCE-COMPUTER" "."
   	// We are not interested in the computerName, the name
  	// of the computer on which the source is to be compiled.
     ( name[] ( withDebuggingMode )? "." )?
  ;
  
paragraphs.DebuggingMode
  ::= ( "WITH" #1 )? "DEBUGGING" #1 "MODE"
  ;  

paragraphs.ObjectComputerParagraph
  ::= "OBJECT-COMPUTER"  "."
  	( name[] ( water:water.ObjectComputerParagraphWater )* "." )? 
  ;
  
paragraphs.SpecialNamesParagraph
  ::= "SPECIAL-NAMES"  "."        
     ( specialNameStatements | water:water.SpecialNamesParagraphWater )* ( "." )?
  ;
  
paragraphs.RepositoryParagraph
  ::= "REPOSITORY"  "." ( water:water.RepositoryParagraphWater )*
  ;
  
paragraphs.FileControlParagraph
  ::= "FILE-CONTROL"  "."
    ( selectStatements 
   // | sentences:sentences.DataCopySentence 
   )*
  ;  

paragraphs.IOControlParagraph
  ::=  "I-O-CONTROL" "." ( water:water.IOControlParagraphWater )*
  ;

//Special Names Statement
specialnames.SystemDeviceIs
  ::= environment:environments.SystemDevice ("IS")? name[]
  ;

specialnames.UPSISwitchIs
  ::=  environment:environments.UPSI
  	  ( ("IS")? name[])? ( conditionNames )*
  	;
  	
specialnames.OnStatus
  ::= "ON" #1 ( "Status" #1 )? ( "IS" #1 )? name[]
  ;
  
specialnames.OffStatus
  ::= "OFF" #1 ( "Status" #1 )? ( "IS" #1 )? name[]
  ;  	

//name has to be a literal, not the default cobol-word
specialnames.CurrencySign
  ::= "CURRENCY" "SIGN" ( "IS" )? currency //literal
  	( ( "WITH" )? "PICTURE" "SYMBOL" pictureSymbol[] ) ;

specialnames.ClassName
  ::= "CLASS" #1 name[] #1 ( "IS" #1 )?
      ( range )+
  ;          
 
specialnames.SymbolicCharacterStatement
  ::= "SYMBOLIC" #1 ( "CHARACTER" | "CHARACTERS" )?
  	symbolicCharacters+
    // IN phrase specifies the character set that
    // the symbolic  characters belong to 
  	//target points to an alphabetname
  	( "IN" alphabetNameReference )?
  ;

specialnames.SymbolicCharacter
  ::= name[] //( additionalSymbolicCharacters )* 
  ( "IS" | "ARE" )? ( integers )+
  ;

//TODO Fix the symbolic character
//name has to be a literal, not the default cobol-word  
//specialnames.AdditionalSymbolicCharacter
//  ::= name[] 
//  ;

specialnames.AlphabetName 
	::= "ALPHABET" #1 name[] ( "IS" )? type;

//specialnames.ExplicitAlphabetType
//	::= ( range )+
//	;

specialnames.PredefinedAlphabetType
	::= value[standard1 : "STANDARD-1", standard2 : "STANDARD-2", 
		ebcdic : "EBCDIC", native : "NATIVE"]
	;
	
specialnames.CodeNameAlphabetType
	::= value[];
	
//files
//Needs to be fixed
files.FileName
  ::= fileDescriptor[fd:"FD", sd:"SD"] name[] 
  	(  attributes:dataitems.Global, dataitems.External  
  	|  water:water.FileDescriptorWater  )*  
  	"."
  	( records 
  //	| sentences:sentences.DataCopySentence, sentences.ExecuteSentence  )*
  	| sentences:sentences.ExecuteSentence  )*
  ;
  
//files.SDFileDescriptor
//  ::= "SD" name[] ( water:water.FileDescriptorWater)*  "."
//   	( recordDescriptors:dataitems.DefaultDataItem )*
 // ;  

//The external data file names must be defined in DD statement in JCL  
files.SelectStatement
  ::= "SELECT" isOptional["OPTIONAL" : ""] fileNameReference
  	  "ASSIGN" ( #1 "TO" #1 )? ( externalFileNames[] )+
  		( fileStatus | water:water.SelectStatementWater )*  "."
  ;
  
files.FileStatus
  ::= ( "FILE" )? "STATUS" ( "IS" )?
        fileStatus  ( vsamFileStatus )?
  ;

    
// I thought ElementReference is a subtype of NamedElement, 
// just to find out that it isn't
// DataItem is a subtype of NamedElement
@SuppressWarnings(featureWithoutSyntax) //name is set by CobolSourceOrClassFileResource.load()
dataitems.DataItem
	::= levelNumber[DECIMAL_INTEGER_LITERAL] 
	( name[] | "FILLER" )? 
	( attributes | water:water.DataDescriptorWater )*  
	"."       
	;

//TODO not sure if the renaming dataname can be a FILLER	
dataitems.RenamingDataName
 	::= levelNumber[DECIMAL_INTEGER_LITERAL] name[] "RENAMES" nameRange "."
 	;	

//dataitems.ConditionName
//	::= "88" name[] attributes:dataitems.Value "."
// 	;


dataitems.Redefines
	::= "REDEFINES" dataName
	;

//should this be a subclass of NamedClass	

dataitems.PictureString
	::= ( "PIC" | "PICTURE" ) ( #1 "IS" #1 )? 
	(  picture[DECIMAL_INTEGER_LITERAL] | picture[] | picture[DECIMAL_FIXED_LITERAL])
	;
			

//PICTURE_STRING_CHARACTER 
//$'X'|'S'|'P'|'9'|'V'|'A'|'N'$;
	
//FRAGMENT PICTURE_STRING_EDITED_CHARACTER 
//$'B'|'E'|'Z'|('C''R')|('D''B')| ',' | '0' | '\\' | '+' | '-'| '*'| ':'| '/' $ ;
	
//escape character needs to be followed by an arbitrary character that will
// be displayed on the output	
//dataitems.PictureStringSpecialCharacter
//	::= character[plus : "+", negative : "-", period : ".", comma : ",", dollar : "$", asterik : "*",
//			slash : "/", escape : "\\" ]
//		;
//dataitems.PictureStringCharacterOccurrence		
//		::= "("occurrence[DECIMAL_INTEGER_LITERAL] ")"
//		;
	
//dataitems.EditedPictureString
//	::= ( "PIC" | "PICTURE" ) ( #1 "IS" #1 )? 
//	( picture[PICTURE_STRING_EDITED] | picture[COBOL_WORD])
//	;
	
//value is a literal
//P.S. Merged the clauses for value definition of condition-names and normal data items
dataitems.Value
	::= ( "VALUE" | "VALUES" ) ( #1 "IS" | "ARE" #1 )? 
		( values:arithmetics.RangeExpression )+
	;

dataitems.External
  ::= ( "IS" )? "EXTERNAL"
  ;

dataitems.Global
  ::= ( "IS" )? "GLOBAL"
 ;	

dataitems.GroupUsage
  ::= "GROUP-USAGE" ( "IS" )? "NATIONAL" 
  ;

dataitems.Usage
  ::= ( "USAGE" ( "IS" )? )?
       usage[binary : "BINARY", computational : "COMPUTATIONAL", comp : "COMP", 
       		display : "DISPLAY", display1 : "DISPLAY-1", index : "INDEX", packedDecimal : "PACKED-DECIMAL",
       		computational1 : "COMPUTATIONAL-1", comp1 : "COMP-1", 
       		computational2 : "COMPUTATIONAL-2", comp2 : "COMP-2",
        	computational3 : "COMPUTATIONAL-3", comp3 : "COMP-3", 
        	computational4 : "COMPUTATIONAL-4", comp4 : "COMP-4", 
        	computational5 : "COMPUTATIONAL-5", comp5 : "COMP-5", 
        	pointer : "POINTER", procedurePointer : "PROCEDURE-POINTER",
        	functionPointer : "FUNCTION-POINTER", national : "NATIONAL"]
 //       ( "NATIVE" )?	
 		isNative["NATIVE" : ""]
  ;
	
//tables
  
tables.Table 
  ::= levelNumber[DECIMAL_INTEGER_LITERAL] 
  ( name[] | "FILLER")?
	( attributes
	| water:water.DataDescriptorWater 
  	| ( "OCCURS" tableDimension ( "TO"  maxTableDimension )? ( "TIMES" )?
  		( "DEPENDING" ( "ON" )? dependsOn )?
        ( keysAre )*
        ( indexedBy )? )
    )*   "."
  ;  
  
tables.KeyName 
  ::= keyOrder[asc : "ASCENDING", dsc : "DESCENDING"]
          ( "KEY" )? ( "IS" )?
          ( keys )+
   ;
    
tables.IndexName
  ::= "INDEXED" ( "BY" )? name[] ( additionalIndexNames )*
  ;     


tables.AdditionalIndexName
  ::= name[]
  ;
  
tables.TableDimension ::= 
	value[DECIMAL_INTEGER_LITERAL];

// ========================================================
// procedureDivision
// ........................................................

@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
divisions.ProcedureDivision
  ::= "PROCEDURE" #1 "DIVISION" 
      ( "USING" ( parameters )+ )?
      ( "RETURNING" returning )? #1 "."
        ( declaratives )?
        ( sentences:sentences.Sentence )*
        ( paragraphs )*
        ( sections )*
  ;

//declaratives
declaratives.Declaratives
  ::= "DECLARATIVES" "."
    ( declarativeSections )+
    "END" "DECLARATIVES" "."
  ;
  
sections.DeclarativeSection
  ::= name[] "SECTION" "."
    sentences:sentences.UseSentence
    ( paragraphs )*
  ;  

// Section Name can either be a CobolWord or Integer ??
// sectionName : ( COBOLWORD | INTEGER);
//
// Segment Number can only be Integer
// segmentNumber :  INTEGER ;

@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
sections.Section
	::=  name[] "SECTION" 
	( segmentNumber[DECIMAL_INTEGER_LITERAL] )? "."
	( sentences:sentences.Sentence )*
    ( paragraphs )*
;

// Paragraph Name can either be a CobolWord or Integer ??
// paragraphName : ( COBOLWORD | INTEGER );
@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
paragraphs.Paragraph
	::= name[] "." ( sentences:sentences.Sentence )*
;

//sentences
sentences.ExecuteSentence ::= (statements:statements.Execute) ".";

sentences.UseSentence ::=	"USE" ( water:water.UseStatementWater )* ".";

//sentences.DataCopySentence ::= (statements:statements.Copy) ".";

//sentences.EntrySentence ::= (statements:statements.Entry) ".";

//sentences.ReplaceSentence ::= (statements:statements.Replace) ".";

sentences.Sentence ::= statements+ ".";

sentences.AlteredGoTo
  ::=  "GO" ( #1 "TO" )? "."
  ; 

sentences.ExitProcedure
	::= "EXIT" "."
	;

@SuppressWarnings(featureWithoutSyntax)
sentences.EmptySentence ::= ".";

//statements

// ACCEPT receiver FROM sender
statements.Accept
  ::= "ACCEPT" receiver:identifiers.Identifier 
  ( water:water.AcceptStatementWater )*
  ;

//FROM points to identifier
statements.Release
	::= "RELEASE" recordName
		( "FROM" sender )?
		;

statements.Merge
	::= "MERGE" fileName
		( keyDescriptors )+
		( water:water.SortPhraseWater )*
		( input:ios.InputFile )
		( output )
	;
			

statements.Sort 
	::= "SORT" fileName
		( keyDescriptors )+			
		( water:water.SortPhraseWater )*
		( input )?
		( output )?
	;
	
statements.KeyDescriptor
	::= ( "ON" )? order[asc: "ASCENDING", dsc: "DESCENDING"] ( "KEY" )? ("IS")? ( keyNames )+
	;

ios.InputFile
	::= "USING" ( fileNames )+
	;
	
ios.InputProcedure
	::= "INPUT" "PROCEDURE" ( "IS" )? label:labels.ProcedureRange
	;
	
ios.OutputProcedure
	::= "OUTPUT" "PROCEDURE" ( "IS" )? label:labels.ProcedureRange
	;
	
ios.OutputFile
	::= "GIVING" ( fileNames )+
	;				

statements.Continue ::= "CONTINUE";

//statements.Copy
//  ::= "COPY" target[]
//    ( ( "OF" | "IN" )  (  libraryName[] ) )?
//    suppress[ "SUPPRESS" : ""]
//    ( phrases:phrases.Replacing  )?
//	;
	
//TODO need to look at this	
//statements.Replace
//  ::=  "REPLACE" replaceSwitch["OFF" : "ON"]
//  	( phrases:phrases.ReplacingBy )*
//  ;
	

//operand must be an alphanumeric literal
//I elevated it to the sentences
//sentences.Entry
//  ::= "ENTRY" operand ( "USING" ( parameters )+ )? "."
//  ;   

//TODO I think literal in the operand is unnecessary

statements.Unstring
  ::= "UNSTRING" sender:identifiers.IdentifierReference
  	( "DELIMITED"  ( "BY" )? delimiter:conditions.ConditionalOrExpression )?
  	"INTO" ( receivers )+
  	( ( "WITH" )? "POINTER" pointer )?
  	( "TALLYING" ( "IN" )? counter )? 	
  	( handlers:handlers.OnOverflow)?
    ( handlers:handlers.NotOnOverflow)?
  	endVerb["END-UNSTRING" : ""] 
  ;
  
statements.Inspect
  ::= "INSPECT" string:identifiers.Identifier, literals.Literal
   ("TALLYING" ( tallyingIns )+ )?
   ("REPLACING" ( replacements )+ )?
   ("CONVERTING" ( conversions )+)?
  ;
  
statements.TallyingIn
  ::= counter "FOR" ( occurrences )+
  ;
  
//the receiver and sender can also be index-names
//TODO conflict with definition of identifier
statements.Set
  ::= "SET" ( receivers:identifiers.IdentifierReference )+ 
  	  "TO" sender:identifiers.Identifier, literals.IntegerLiteral;
  
statements.SetSwitches
  ::= "SET" switches+ ;
  
statements.SwitchStatus
	::=  ( mnemonicNames )+
		"TO" status[on : "ON", off : "OFF"];

//TODO commented this, as TRUE is a boolean literal  
//statements.
 
//  ::= "SET" ( operands:identifiers.Identifier )+
//    "TO" "TRUE"
//  ;    

statements.SetIndexName
  ::= "SET" ( receivers:references.IndexNameReference )+ 
  	adjust[ up : "UP", down : "DOWN"] 
	"BY" sender:identifiers.Identifier, literals.IntegerLiteral
  ;

statements.Return
  ::= "RETURN"  fileName
    ( "RECORD" )? ( "INTO" output  )?
    ( handlers:handlers.AtEnd )?
    ( handlers:handlers.NotAtEnd )?
    endVerb["END-RETURN" : ""]
  ;  

statements.Execute
  ::= water['EXEC', 'END-EXEC']
  ;
 
//For all arithmetic statements, merged all the formats into one, for the sake of simplicity
@SuppressWarnings(featureWithoutSyntax) //name is set by JavaSourceOrClassFileResource.load()
statements.Add
	::=  "ADD" 
		( corresponding[corresponding : "CORRESPONDING", corr : "CORR"] )?
		( operands )+
        ( "TO" ( tos )+ )? 
        ( "GIVING" ( givings:identifiers.Identifier, operands.RoundedIdentifier )+ )?
        ( handlers:handlers.OnSizeError )?
        ( handlers:handlers.NotOnSizeError )?
        endVerb["END-ADD" : ""]
	;		

@SuppressWarnings(featureWithoutSyntax) 
statements.Multiply
	::= "MULTIPLY"
   		( operands )+
    	( "BY" ( bys )+ )? 
        ( "GIVING" ( givings:identifiers.Identifier, operands.RoundedIdentifier )+ )?
        ( handlers:handlers.OnSizeError )?
        ( handlers:handlers.NotOnSizeError )?
    	endVerb["END-MULTIPLY" : ""]
  ;


statements.Subtract
	::= "SUBTRACT"
		( corresponding[corresponding : "CORRESPONDING", corr : "CORR"]  )?
		operands+
        ( "FROM" froms+ )?
        ( "GIVING" ( givings:identifiers.Identifier, operands.RoundedIdentifier )+ )?
        ( handlers:handlers.OnSizeError )?
        ( handlers:handlers.NotOnSizeError )?
    	endVerb["END-SUBTRACT" : ""]
	;

//remainder can only be an identifier

statements.Divide
	::= "DIVIDE"
       operands+
       ( ( "BY" | "INTO") ( intos )+ )? 
       ( "GIVING" ( givings:identifiers.Identifier, operands.RoundedIdentifier )+  )? 
       ( "REMAINDER" ( remainders )+ )?
       ( handlers:handlers.OnSizeError )?
       ( handlers:handlers.NotOnSizeError )?
       endVerb["END-DIVIDE" : ""]
 	;
  
statements.Compute
	::= "COMPUTE"
        expression:arithmetics.AssignmentExpression
       // expression:expressions.SimpleExpression
       ( handlers:handlers.OnSizeError )?
       ( handlers:handlers.NotOnSizeError )?
        endVerb["END-COMPUTE" : ""]
	;

//TODO output can be either an environment Name or mnemonic name
statements.Display
	::= "DISPLAY" ( operands )+
        ( "UPON" output )? // //environmentName, MneomincName
        ( ( "WITH" #1 )? "NO" #1 "ADVANCING")?
	;
	
//TODO it is possible to define an attribute in the move statement to incorporate the
// the corresponding attribute
//TODO All Operand doesn't exist in move statements as Lang Ref
statements.Move
  ::=  "MOVE" 
		( corresponding[corresponding : "CORRESPONDING", corr : "CORR"] )? 
		sender 
  		//operands.CorrespondingIdentifier, operands.AllOperand 
  		//"MOVE" #1 operands:identifiers.Identifier, literals.Literal, 
  		//	operands.CorrespondingIdentifier, operands.AllOperand 
		"TO" receivers+
  ;
 

statements.PerformNestedStatement
	::= "PERFORM"
        ( statements* )
        "END-PERFORM"
        ;

statements.PerformProcedure
	::= "PERFORM" label:labels.ProcedureRange
	;

statements.PerformNestedStatementFixedTimes
	::= "PERFORM"
		( iterations:identifiers.Identifier, literals.IntegerLiteral "TIMES" )
		//TODO Changed this to optional
        //In order to pass the RT10800.cob source file
        //But it is indeed optional
        ( statements* )
        "END-PERFORM"
	;
statements.PerformProcedureFixedTimes
	::= "PERFORM" label:labels.ProcedureRange
		( iterations:identifiers.Identifier, literals.IntegerLiteral "TIMES"  )
  ;
 
//TODO why is varying optional here?!?  
statements.PerformNestedStatementUntilCondition
	::= "PERFORM"
		( ( "WITH" )? "TEST" position[before : "BEFORE", after: "AFTER"] )?
		( "VARYING" variable:identifiers.IdentifierReference
        				"FROM" init:operands.PrimaryOperand
        				"BY" increment:operands.PrimaryOperand)?
        				"UNTIL" condition:conditions.ConditionalOrExpression 		
        //TODO Changed this to optional
        //In order to pass the RT10800.cob source file
        ( statements* )
        "END-PERFORM"
	;
	
statements.PerformProcedureUntilCondition
	::= "PERFORM" label:labels.ProcedureRange
		( ( "WITH" )? "TEST" position[before : "BEFORE", after: "AFTER"] )?
		( "VARYING" variable:identifiers.IdentifierReference
        				"FROM" init:operands.PrimaryOperand
        				"BY" increment:operands.PrimaryOperand )?
        				"UNTIL" condition:conditions.ConditionalOrExpression
		( afters )*
	;	

statements.AfterUntilCondition
	::= "AFTER" variable:identifiers.IdentifierReference
          				"FROM" init:operands.PrimaryOperand 
        				"BY" increment:operands.PrimaryOperand
        				"UNTIL" condition:conditions.ConditionalOrExpression
        				; 
  
//fileName -> FileNameReference
//identifier -> IdentifierReference
//dataName -> DataNameReference
  
statements.Read
	::= "READ" fileName
    ( "NEXT" )? ( "RECORD" )?
    ( "INTO" receiver )?
    ( "KEY" ( "IS" )?  keyName )?
    ( handlers:handlers.AtEnd)?
    ( handlers:handlers.NotAtEnd)?
    ( handlers:handlers.InvalidKey)?
    ( handlers:handlers.NotInvalidKey)?
    endVerb["END-READ" : ""]
    ;
   

//identifier -> IdentifierReference
//mnemonicName -> MnenmonicNameReference

statements.Write
	::= "WRITE"  recordName
    ( "FROM" sender )?
   ( ( "AFTER" | "BEFORE" ) ( "ADVANCING" )?
    
    //TODO combined identifier and mnemonicName
    ( ( ( numLines | integer | "ZERO"  ) ( "LINE" | "LINES" )?  )
    | mnemonicName
    | "PAGE"  )
	)?
    ( handlers:handlers.AtEndOfPage)?
    ( handlers:handlers.NotAtEndOfPage )?
    ( handlers:handlers.InvalidKey )?
    ( handlers:handlers.NotInvalidKey )?
    endVerb["END-WRITE" : ""]
	;
	
statements.Rewrite
  ::= "REWRITE" recordName
  	( "FROM" sender )?
    ( handlers:handlers.InvalidKey )?
    ( handlers:handlers.NotInvalidKey )?
    endVerb["END-REWRITE" : ""]
  ;	  
  
//labels 

labels.Run ::= "RUN";

labels.ProcedureRange
	::= children:labels.ProcedureLabel 
		( throughOperator children:labels.ProcedureLabel)?
		;

labels.ProcedureLabel
	::= target[] ( ( "IN" | "OF") section[])?
	;		  
  
statements.String
  ::= "STRING"  //( operands:operands.PrimaryOperand, operands.StringedOperand )+ 
  ( senders )+ 
    "INTO" receiver:identifiers.IdentifierReference
    ( ("WITH")? "POINTER" pointer )?
    ( handlers:handlers.OnOverflow )?
    ( handlers:handlers.NotOnOverflow )?
    endVerb["END-STRING" : ""]
  ;  


// condition points to ConditionExpression in Conditions Package

statements.Condition 
 ::= "IF" condition:conditions.ConditionalOrExpression ( #1 "THEN" )?
 	//	"IF" condition:expressions.SimpleExpression ( #1 "THEN" )?  
 		//true part can be nestedstatements or next statement
        //statements:statements.NestedStatement, statements.Next
        statements+
        //else part can be nestedstatements or next statement
        ( !0 "ELSE" !0 elseStatements+ )?
       endVerb["END-IF" : ""]
  ;
  
statements.NextSentence ::= "NEXT" #1 "SENTENCE";

//Need to recheck if this is the only possible stop statement
//TODO stop label ::= "RUN" | literal 
//
statements.Stop ::= "STOP" label//TODO: "RUN", literal
;
statements.GoBack ::= "GOBACK";

statements.GoTo
  ::=  "GO" ( #1 "TO" #1 )? 
  		( labels:labels.ProcedureRange )+ // target
  		( "DEPENDING" ( "ON" )?  dependsOn )? //condition
  ;  
 
//TODO fix this  
statements.Exit
  //::= "EXIT" #1 ( exitLabel[program : "PROGRAM", paragraph : "PARAGRAPH", method : "METHOD"])
  ::= "EXIT" #1 ( exitLabel[program : "PROGRAM"] )
  ;
 
//TODO "operands" can be "subprograms" 
statements.Cancel
  ::= "CANCEL" subprograms:identifiers.Identifier, literals.AlphanumericLiteral+
  ;  

statements.Call
  ::= "CALL"  subprogram:identifiers.Identifier, literals.Literal
    ( "USING" ( arguments )+ )?
    ( "RETURNING" returning )?
    ( handlers:handlers.OnOverflow, handlers.OnException, handlers.NotOnException) *
    endVerb["END-CALL" : ""]
  ;
  
statements.Initialize
  ::= "INITIALIZE" ( subprograms:identifiers.Identifier )+
     ( "REPLACING" replacements+ )?
  ;

//TODO GENERATE statement in COBOL85 specification exists, but not in Enterprise COBOL v4
//The GENERATE statement is COBOL Report Writer's main verb for the production of output.  
//It passes control to report writer to allow it to perform all the necessary mechanical tasks, 
//including any control-break and page-break processing needed before producing all the lines and fields 
//described in your DETAIL group, if specified.

//statements.Generate
//	::= "GENERATE" output:dataname, reportname
//	;

//TODO "Invoke" was introduced in COBOL II 
//statements.Invoke
//  ::= "INVOKE" (water:water.InvokeStatementWater)*
//  	( handlers:handlers.OnException )?
//  	( handlers:handlers.NotOnException )?
//   	endVerb["END-INVOKE" : ""]
//  ;

statements.Open
  ::= "OPEN"  ( ioFileDescriptors:statements.IOFileDescriptor)+
  ;

statements.Close
  ::= "CLOSE" ( ioFileDescriptors:statements.IOFileDescriptor )+
  ;

statements.IOFileDescriptor
  ::=  type[input : "INPUT", output : "OUTPUT", io : "I-O", extend : "EXTEND"]
     ( ioFiles  )+
     ;  
  
statements.IOFile
	::= fileName (water:water.OpenStatementWater, water.CloseStatementWater)*
	;  
  
//TODO "operand" can be "table" - DONE
//TODO Varying can be either identifier or indexNameReference
statements.SerialSearch
  ::= "SEARCH" 
    table:identifiers.IdentifierReference 
    ( "VARYING" variable )?
    ( handlers:handlers.AtEnd )?
    cases+
    endVerb["END-SEARCH" : ""]
  ;  
  
statements.BinarySearch
  ::= "SEARCH" "ALL"
    table:identifiers.IdentifierReference  
    ( handlers:handlers.AtEnd )?
    cases+
    endVerb["END-SEARCH" : ""]
  ;  
  
//The arguments esp. the omitted clause does not conform to the grammar
//TODO "operands" can be called "arguments"
functions.ByReferenceArgument
  ::= ( ( "BY" )? "REFERENCE" )? ( operands:identifiers.Identifier )+
  ;

functions.ByContentArgument
  ::= ( "BY" )? "CONTENT" ( operands:identifiers.Identifier )+
  ;
  
functions.OmittedArgument
  ::= "OMITTED"
  ;  

functions.ByValueArgument
  ::= ( "BY" )? "VALUE" ( operands:identifiers.Identifier )+
  ;


statements.Evaluate
  ::= "EVALUATE" subject:conditions.ExpressionList
    ( cases )+
    endVerb["END-EVALUATE" : ""]
  ;    

statements.NormalEvaluateCase
  ::=// ( "WHEN" objects:conditions.ExpressionList )+ 
  	( "WHEN" objects:conditions.ExpressionList )+
  	statements+
  ;

// ========================================================
// whenOther
// ........................................................
statements.OtherEvaluateCase
  ::= "WHEN" "OTHER"  statements+
  ; 
  
  
//Handlers

handlers.InvalidKey
	::= "INVALID" ("KEY")? statements+
	;    

handlers.NotInvalidKey
	::= "NOT" #1 handlerStatement:handlers.InvalidKey
	;      
 
handlers.AtEndOfPage
	::= ( "AT" )? eop[endOfPage : "END-OF-PAGE", eop : "EOP"] statements+
    ;
    
handlers.NotAtEndOfPage
	::= "NOT" handlerStatement:handlers.AtEndOfPage
	; 

handlers.OnSizeError
::=  ( "ON" #1 )? "SIZE"  #1 "ERROR" statements+      
;  

handlers.OnOverflow
  ::= ( "ON" #1 )? "OVERFLOW" statements+
  ;

handlers.OnException
  ::= ( "ON" #1 )? "EXCEPTION" statements+ 
  ;

handlers.AtEnd 
  ::= ( "AT" #1 )? "END" statements+    
  ;

handlers.NotOnSizeError
  ::= "NOT" #1 handlerStatement:handlers.OnSizeError
  ;
  
handlers.NotOnOverflow
  ::= "NOT" #1 handlerStatement:handlers.OnOverflow
  ;	  
 
handlers.NotOnException
  ::= "NOT" #1 handlerStatement:handlers.OnException
  ;
  
handlers.NotAtEnd
  ::= "NOT" #1 handlerStatement:handlers.AtEnd   
  ;  	
   
  
//Expressions

//Investigate further
conditions.ExpressionList
    ::= expressions:conditions.ConditionalOrExpression ("ALSO" expressions:conditions.ConditionalOrExpression)*
    ; 

conditions.ConditionalOrExpression
	::= children:conditions.ConditionalAndExpression 
		("OR" #1 children:conditions.ConditionalAndExpression)*
    ;

@SuppressWarnings(minOccurenceMismatch)
conditions.ConditionalAndExpression
	::= children:conditions.NegatedConditionalExpression, conditions.AbbreviatedConditionalExpression
		("AND" #1 children:conditions.NegatedConditionalExpression, conditions.AbbreviatedConditionalExpression)*
    ;
    
@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
conditions.NegatedConditionalExpression
	::=  (negateOperator)? child:conditions.RelationalExpression, 
			conditions.SignCondition, conditions.ClassCondition, 
			arithmetics.RangeExpression, conditions.NestedCondition 
    ;

conditions.NestedCondition
	::= "(" condition:conditions.ConditionalOrExpression ")"
	;

//TODO removed the optionality of the right hand side
conditions.RelationalExpression
	::= children:arithmetics.RangeExpression 
		( (is)? (negateOperator)? relationalOperator children:arithmetics.RangeExpression )
	;
	
conditions.SignCondition
	::= child:arithmetics.RangeExpression ( (is)? (negateOperator)? signOperator )	
	;
	
conditions.ClassCondition
	::= child:arithmetics.RangeExpression ( (is)? (negateOperator)? classOperator )
	;	
	
conditions.AbbreviatedConditionalExpression
	::= ( children:conditions.NegatedAbbreviatedConditionalExpression )+
	;
	
conditions.NegatedAbbreviatedConditionalExpression
	::= ( negateOperator )? child:conditions.AbbreviatedRelationalExpression	
	;	

conditions.AbbreviatedRelationalExpression
	::= ( (is)? (negateOperator)? relationalOperator ) 
		child:arithmetics.RangeExpression, conditions.NestedAbbreviatedConditionalExpression
	;
	
conditions.NestedAbbreviatedConditionalExpression
	::= "(" expression:arithmetics.RangeExpression  rest:conditions.NegatedAbbreviatedConditionalExpression ")"
	;	

//A range expression consisting of the THRU | THROUGH expression 

arithmetics.RangeExpression
	::= children:arithmetics.AdditiveArithmeticExpression
		( throughOperator children:arithmetics.AdditiveArithmeticExpression)?
		;
//A simple expression language consisting of arithmetic expressions
//Assignment Expression is made-up

// All literals can be terminals instead of only numeric literals

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.AssignmentExpression
::= ( children:identifiers.Identifier ("ROUNDED")? )+ 
		( assignmentOperator #1 value:arithmetics.AdditiveArithmeticExpression)
    ;

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.AdditiveArithmeticExpression
    ::= children:arithmetics.MultiplicativeArithmeticExpression 
   	( additiveOperators #1 children:arithmetics.MultiplicativeArithmeticExpression )*
   ;

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.MultiplicativeArithmeticExpression
   ::=	children:arithmetics.PowerArithmeticExpression 
    	( multiplicativeOperators #1 children:arithmetics.PowerArithmeticExpression )*
    ;
         
@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match
arithmetics.PowerArithmeticExpression
    ::= children:arithmetics.UnaryArithmeticExpression ( #1 "**" #1 children:arithmetics.PrimaryExpression)*
    ;

@SuppressWarnings(minOccurenceMismatch) //the expression simplifier removes the cases where min occurrence does not match 	
arithmetics.UnaryArithmeticExpression 
	::= (unaryOperator)? child:arithmetics.PrimaryExpression
	;
	
arithmetics.NestedArithmeticExpression
	::= "(" expression:arithmetics.AdditiveArithmeticExpression ")" ;	

 // arguments is connected to Operand

functions.FunctionCall 
	::= "FUNCTION" name[]
		( "(" ( arguments )+ ")" )?
		( modifier )?
	;	

//identifers
//TODO dataname was not explicitly modelled
// dataname is just part of an identifier
//*target could point to both a condition-name
// and a dataname
//TODO Qualifier can be either a dataname or filename
identifiers.IdentifierReference
	::= target[]
	( ("IN" | "OF") qualifier:references.IdentifierReferenceQualifier )?
	(  "("  subscripts + ")" )?
    ( modifier )? 
	;

references.IdentifierReferenceQualifier
	::= target[]
	( ("IN" | "OF") qualifier )?
	;
  
identifiers.LinageCounter 
	::= "LINAGE-COUNTER" ( ( "IN" | "OF" ) qualifier:references.FileNameReference )?
	;

//additive operator should consist of both plus and minus
identifiers.RelativeSubscript
  ::= subscript:identifiers.Identifier additiveOperator integer
  ;
  
identifiers.DirectSubscript
  ::= subscript:identifiers.Identifier, literals.IntegerLiteral
  ;  

identifiers.All
  ::= "ALL"
  ;

//start and length point to Additive Expressions
identifiers.ReferenceModifier
  ::= "(" start:arithmetics.ArithmeticExpression ":"
  	   ( length:arithmetics.ArithmeticExpression )? ")"
  ;

//references
references.AlphabetNameReference 
	::= target[]
	;

references.IndexNameReference
	::= target[]
	;

//Merged with Special names paragraph condition-name
//references -> dataname, filename and mnemonicname
references.SpecialNamesConditionNameReference
	::= target[]
		( ("IN" | "OF") qualifier:references.MnemonicNameReference )
		;

//This can only be used in the Special-Names paragraph
//references.SpecialNamesConditionNameReference
//	::= conditionNameReference  ( ("IN" | "OF") mnemonicNameReferences )+
//	;

references.MnemonicNameReference
	::= target[] ( ("IN" | "OF") qualifier:references.MnemonicNameReference )
	;

references.FileNameReference
	::= target[]
	;
	
//strings manipulations

//Manipulations

strings.ReplacementOccurrence ::= type[all:"ALL", leading:"LEADING", first : "FIRST"] 
									(occurrences) + ;			
		
//replacement operands must not contain CHARACTERS
strings.SpecificCharacterBySpecificCharacter
	::= source 	("BY" | "TO") target  (locations)*;

strings.AnyCharacterBySpecificCharacter
	::= "CHARACTERS" "BY" target (locations)*
;
strings.Location 
	::= position[before: "BEFORE", after: "AFTER"]
		initial["INITIAL" : ""]
		base:identifiers.Identifier, literals.Literal
	;

//Manilpulated Strings
strings.ConcatenatingStrings
	::= strings+
	"DELIMITED"  ( "BY" )? ( delimiter:identifiers.Identifier, literals.Literal | "SIZE" )
	;
	
strings.SplittedString
	::= strings
		( "DELIMITER" ( "IN" )? delimiter:identifiers.IdentifierReference, literals.Literal )?  
	    ( "COUNT" ( "IN" )? counter:identifiers.IdentifierReference, literals.Literal )?
	;

strings.AnyCharacter ::= "CHARACTERS" (locations)* ; 
//Specific Occurrence
strings.TallyingOccurrence ::= type[all:"ALL", leading:"LEADING"] (occurrences) + ;

strings.SpecificCharacter ::= tallying (locations)*;
    
//May change the settings for the size  
   

// paramters
//TODO there is a problem here
parameters.ByReferenceParameter 
	::= (( "BY" )?  "REFERENCE" )? name[] ;

parameters.ByValueParameter
	::= ( "BY" )? "VALUE" name[];
		
 //operands
//TODO operands.AllOperand
//	::= "ALL" operands:identifiers.IdentifierReference, literals.Literal
//	; 

operands.RoundedIdentifier
	::= identifier "ROUNDED"
	;

//this is a OR conditional operand  
//TODO commented this	
//operands.AllOperand
//  ::= "ALL" operands:identifiers.Identifier, literals.Literal
//  ;  	

operands.Encoding ::=  type[ alphabetic : "ALPHABETIC", alphanumeric : "ALPHANUMERIC",
    alphanumericEdited : "ALPHANUMERIC-EDITED", national : "NATIONAL",
    nationalEdited : "NATIONAL-EDITED", numeric : "NUMERIC", 
    numericEdited : "NUMERIC-EDITED", dbcs : "DBCS", egcs : "EGCS"] ("DATA")?
    ;
  

//verbs
	
//verbs.Verb
//	::= value[add : "ADD", call : "CALL", cancel : "CANCEL",
//		close : "CLOSE", delete : "DELETE", divide : "DIVIDE",
//		entry : "ENTRY", evaluate : "EVALUATE", exec : "EXEC",
//		exit : "EXIT", goback : "GOBACK", go : "GO", if : "IF", 
//		move : "MOVE", multiply : "MULTIPLY",  open : "OPEN",
//		perform : "PERFORM", read : "READ", release : "RELEASE",
//		return : "RETURN",  rewrite : "REWRITE", search : "SEARCH",
//		stop : "STOP", string : "STRING", subtract : "SUBTRACT",
//		unstring : "UNSTRING", write : "WRITE", set : "SET",
//		initialize : "INITIALIZE", display : "DISPLAY", 
//		compute : "COMPUTE", inspect : "INSPECT", start : "START",
//		use : "USE", accept : "ACCEPT", alter : "ALTER", 
//		continue : "CONTINUE", merge : "MERGE", sort : "SORT", 
//		enable : "ENABLE", disable : "DISABLE", send : "SEND",
//		receive : "RECEIVE", purge : "PURGE", initiate : "INITIATE",
//		generate : "GENERATE", terminate : "TERMINATE"]
// ;
  
verbs.Is ::= "IS";   


// operators

operators.Addition				::= "+";
operators.Subtraction       	::= "-";
		
operators.Multiplication    	::= "*" ;
operators.Division         		::= "/" ;

operators.Negate 				::= "NOT" ;	


//EQUAL, I added manually
operators.EqualSign				::= "=";
operators.EqualPhrase			::= "EQUAL" to["TO" : ""] ;

//relational operators
operators.LTSign 				::= "<";
operators.LTPhrase				::= "LESS" than["THAN" : ""] ;

operators.GTSign				::=  ">" ;
operators.GTPhrase				::= "GREATER" than["THAN" : ""] ;

//the relational operators with equal sign cannot have the negate operators

operators.LTEQSign				::= "<" "=" ;
operators.LTEQPhrase			::= "LESS" than["THAN" : ""] "OR" "EQUAL" to["TO":""] ;

operators.GTEQSign				::= ">" "=" ;
operators.GTEQPhrase			::= "GREATER" than["THAN" : ""] "OR" "EQUAL" to["TO":""] ;

//sign operators
operators.Positive				::= "POSITIVE";
operators.Negative				::= "NEGATIVE";
operators.Zero					::= "ZERO";										

//class operators
operators.Numeric				::= "NUMERIC";
operators.Alphabetic			::= "ALPHABETIC";
operators.AlphabeticLower		::= "ALPHABETIC-LOWER";
operators.AlphabeticUpper		::= "ALPHABETIC-UPPER";
operators.DBCS					::= "DBCS";
operators.Kanji					::= "KANJI";

//operators.ClassName			::= target[];										

operators.Through				::= value[through :"THROUGH", thru :"THRU"] ;
	
// do not change the order of the literals!

literals.IntegerLiteral
	::= value[DECIMAL_INTEGER_LITERAL];

//DEFINE DECIMAL_FIXED_LITERAL 
//$('+'|'-')? ('0'..'9')+$ + DOT + $('0'..'9')+$;
	
literals.FixedDecimalLiteral
	::= value[DECIMAL_FIXED_LITERAL]
 ;

//DEFINE DECIMAL_FLOAT_LITERAL 
//$('+'|'-')? ('0'..'9')+ '.' ('0'..'9')* ('e'|'E') ('+'|'-')? ('0'..'9')+$;	

literals.FloatingDecimalLiteral
	::= value[DECIMAL_FLOAT_LITERAL]		
		;	
	
literals.AlphanumericLiteral
	::= value[ALPHANUMERIC_LITERAL];	

literals.AlphanumericHexaDecimalLiteral
	::= value[ALPHANUMERIC_HEX_LITERAL]
	;

//literals.NationalLiteral
//	::= value[NATIONAL_LITERAL];

//literals.NationalHexLiteral
//	::= value[NATIONAL_HEX_LITERAL];	
	
	
//literals.PseudoLiteral
//	::= value['==','=='] ;
	
literals.BooleanLiteral 
	::= value[BOOLEAN_LITERAL];
 
// All Literal 'value' needs to point something that is a superset of both ConstantLiteral and an Identifier	
//literals.AllLiteral ::= "ALL" constant;
	

literals.Null ::= value[null: "NULL", nulls : "NULLS"];

literals.Zero ::= value[zero : "ZERO", zeros : "ZEROS", zeroes : "ZEROES"];

literals.Quote ::= value[quote : "QUOTE", quotes : "QUOTES"];

literals.LowValue ::= value [lowValue : "LOW-VALUE", lowValues : "LOW-VALUES"];
		
literals.HighValue ::= value[highValue : "HIGH-VALUE", highValues : "HIGH-VALUES"];

literals.Space ::= value [space : "SPACE", spaces : "SPACES"];

literals.Any ::= "ANY";

literals.Characters ::= "CHARACTERS";

//environments

//System Logical Input Unit - Allowed in ACCEPT
environments.SystemLogicalInput
  ::= value[sysin : "SYSIN", sysipt : "SYSIPT" ] 
  ;
  	
//System Logical Output Unit - Allowed in DISPLAY
environments.SystemLogicalOutput
  ::= value[ sysout : "SYSOUT", syslist : "SYSLIST", 
  			syslst : "SYSLST" ]
  ;
   
    //System Punch Device - Allowed in DISPLAY 
environments.SystemPunchDevice
  ::= value[syspunch : "SYSPUNCH", syspch : "SYSPCH" ]
   ;
    //Console - Allowed in ACCEPT and DISPLAY
environments.Console ::= "CONSOLE" ;
   
//Skip to Channel 1-12 - Allowed in WRITE ADVANCING
environments.Channel 
	::= value[c1 : "C01", c2 : "C02", c3 : "C03", 
			  c4 : "C04", c5 : "C05", c6 : "C06", 
			  c7 : "C07", c8 : "C08", c9 : "C09",
			  c10: "C10", c11: "C11", c12: "C12" ]
	;
	  
//Suppress spacing - Allowed in WRITE ADVANCING	  
environments.SuppressSpacing ::= "CSP" ;
   
//Pocket select 1-5 - Allowed in WRITE ADVANCING
environments.Pocket
  ::= value[s1 : "S01", s2 : "S02", s3: "S03", 
  			s4 : "S04", s5 : "S05"]
  ;		
     
    //Advanced Function Printing - Allowed in WRITE ADVANCING 
environments.AdvancedFunctionPrinting ::= "AFP-5A";
 
environments.UPSI
  ::= value[upsi0 : "UPSI-0", upsi1 : "UPSI-1",
  			upsi2 : "UPSI-2", upsi3 : "UPSI-3",
  			upsi4 : "UPSI-4", upsi5 : "UPSI-5", 
  			upsi6 : "UPSI-6", upsi7 : "UPSI-7" ]
  	;

//Registers

@SuppressWarnings(featureWithoutSyntax)
registers.ShiftIn ::= "SHIFT-IN" ;

@SuppressWarnings(featureWithoutSyntax)
registers.ShiftOut ::= "SHIFT-OUT" ;

@SuppressWarnings(featureWithoutSyntax)
registers.AddressOf ::= "ADDRESS" ( "OF" )? operand:identifiers.Identifier ;

@SuppressWarnings(featureWithoutSyntax)
registers.LengthOf ::= "LENGTH" ( "OF" )? operand:identifiers.Identifier ;

@SuppressWarnings(featureWithoutSyntax)
registers.ReturnCode ::= "RETURN-CODE" ;

@SuppressWarnings(featureWithoutSyntax)
registers.WhenCompiled ::= "WHEN-COMPILED" ;

//Water Section  

water.SortPhraseToken ::= value[with : "WITH", in : "IN", order : "ORDER", sequence : "SEQUENCE",
						 duplicates : "DUPLICATES", collating : "COLLATING", is : "IS"] 
	;//alphabet-name-1

water.Dot ::= "." ;

water.ProgramDescription
  ::= value[author : "AUTHOR", installation : "INSTALLATION", dateWritten : "DATE-WRITTEN",
  		dateCompleted : "DATE-COMPLETED", security : "SECUTIRY"]
   ;

water.ObjectComputerDescription 
  ::= value[memory : "MEMORY", size : "SIZE", words : "WORDS",
  characters : "CHARACTERS", modules : "MODULES", segment : "SEGMENT",
  program : "PROGRAM", collating : "COLLATING", sequence : "SEQUENCE",
  segmentLimit : "SEGMENT-LIMIT" ]
;

water.SpecialNamesClause
  ::= value[decimalPoint : "DECIMAL-POINT", is : "IS", 
  			comma : "COMMA", xmlSchema : "XML-SCHEMA"]
  	;

water.SelectStatementClause
  ::= value[alternate : "ALTERNATE", record : "RECORD", key : "KEY",
	relative : "RELATIVE", delimiter : "DELIMITER", standard1 : "STANDARD-1",
	padding : "PADDING", character : "CHARACTER", reserve : "RESERVE",
	area : "AREA", areas : "AREAS", access : "ACCESS", mode : "MODE",
	is : "IS", sequential : "SEQUENTIAL", random : "RANDOM", indexed : "INDEXED", 
	with : "WITH", dynamic : "DYNAMIC", 
	organization : "ORGANIZATION", duplicates : "DUPLICATES"]
	;

water.FileDescription
	::=   value [block : "BLOCK", contains : "CONTAINS", to : "TO",
  	characters : "CHARACTERS", records : "RECORDS",
  	codeSet : "CODE-SET", is : "IS",  data : "DATA", 
  	record : "RECORD", are : "ARE", label : "LABEL", omitted : "OMITTED",  
  	standard : "STANDARD", linage : "LINAGE", lines : "LINES", 
  	with : "WITH", footing : "FOOTING",   at : "AT", top : "TOP", 
  	bottom : "BOTTOM", varying : "VARYING",  in : "IN", size : "SIZE", 
	from : "FROM", depending : "DEPENDING", on : "ON", mode : "MODE",
  	recording : "RECORDING",// f : "F", v : "V",  u : "U", s : "S",  
  	value : "VALUE", of : "OF", identification : "IDENTIFICATION",
  	id : "ID", report : "REPORT", reports : "REPORTS"]
 ;	
// intege, alphabetName, dataName, filename, cobolWord, reportName 
	
water.DataDescription
  ::= value [blank : "BLANK", when : "WHEN", zero : "ZERO",
  	  zeros : "ZEROS", zeroes : "ZEROES",
	  justified : "JUSTIFIED", just : "JUST", right : "RIGHT",
	  sign : "SIGN", is : "IS",
	  leading : "LEADING", trailing : "TRAILING",
	  separate : "SEPARATE", character : "CHARACTER",
	  date : "DATE", format : "FORMAT", synchronized : "SYNCHRONIZED",
	  sync : "SYNC", left : "LEFT"]
	  ; //datepattern
	  
water.IOControlDescription
  ::= value [ rerun : "RERUN", on : "ON", of : "OF", record : "RECORD",
  	  records : "RECORDS", every : "EVERY", same : "SAME",
  	  area : "AREA", for : "FOR", multiple :"MULTIPLE",
  	  file : "FILE", tape : "TAPE", contains : "CONTAINS",
  	  position : "POSITION", apply : "APPLY", writeOnly : "WRITE-ONLY",
	  sort : "SORT", sortMerge : "SORT-MERGE",
	  reel : "REEL", unit : "UNIT"] 
  ;	  
// integer | assignmentname | filename

water.RepositoryDescription
  ::= value [ class : "CLASS", is : "IS"]
  ;
  //cobolword  

//water.CICSStatementToken
//  ::= value[ts : "TS", queue : "QUEUE", qname :"QNAME", openpar: "(",
//  	closepar : ")",  sysid : "SYSID", sys : "SYS", set : "SET", into : "INTO",
//  	length : "LENGTH", item : "ITEM", next : "NEXT", numitems : "NUMITEMS",
//	td : "TD", writeq : "WRITEQ", from : "FROM", rewrite : "REWRITE", 
//	nosuspend : "NOSUSPEND", main : "MAIN", auxiliary : "AUXILIARY",
//	deleteq : "DELETEQ", read : "READ", file : "FILE", dataset : "DATASET",
//	ridfld : "RIDFLD", keylength : "KEYLENGTH", generic : "GENERIC", 
//	gteq : "GTEQ", equal : "EQUAL", uncommitted : "UNCOMMITTED", tr : "TR",
//	consistent : "CONSISTENT",  repeatable : "REPEATABLE", update : "UPDATE", 
//	token : "TOKEN", rba : "RBA", xrba : "XRBA", rrn : "RRN", write : "WRITE",
//	massinsert : "MASSINSERT", program : "PROGRAM", commarea : "COMMAREA", 
//	datalength : "DATALENGTH",  synconreturn : "SYNCONRETURN", 
//	transid : "TRANSID", inputmsg : "INPUTMSG", inputmsglen : "INPUTMSGLEN",
//	channel : "CHANNEL", xctl : "XCTL", load : "LOAD", start : "START" ]
//  ;

water.AcceptStatementToken
  ::= value[from : "FROM", date : "DATE", day : "DAY", dow : "DAY-OF-WEEK",
  		time : "TIME", dateformat1 : "YYYMMDD" , dateformat2 : "YYYYDDD"]
  ;
  
water.UseStatementToken
  ::= value[ global : "GLOBAL", after : "AFTER", standard : "STANDARD",
  		error : "ERROR", exception : "EXCEPTION", procedure : "PROCEDURE",
  		on : "ON", input : "INPUT", output : "OUTPUT", io : "I-O",
    	extend : "EXTEND", for : "FOR", debugging : "DEBUGGING",
    	all : "ALL", procedures : "PROCEDURES", beginning : "BEGINNING",
    	ending : "ENDING", file : "FILE", reel : "REEL", unit : "UNIT",
    	label : "LABEL"]  
	;
// fileName  | procedureName

water.CloseStatementToken
  ::= value [with : "WITH", no : "NO", rewind : "REWIND", lock : "LOCK",
  reel : "REEL", unit : "UNIT", for : "FOR", removal : "REMOVAL"]
  ; 

water.OpenStatementToken
  ::= value [ reversed : "REVERSED", with : "WITH", no : "NO", rewind : "REWIND"]
  ;
  
water.InvokeStatementToken    
  ::= value[self : "SELF", super : "SUPER", new : "NEW", using : "USING", 
  	by : "BY", value : "VALUE", length : "LENGTH", of : "OF", returning : "RETURNING"]
   ;
   //classname, identifier, literal
  
//water.DisplayStatementToken
//  ::= value [with : "WITH", no : "NO", advancing : "ADVANCING"]
//  ;  

//change the levelnumber lexer rule to something more general
//TODO changed this from fixed decimal to decimal integer literal
water.PriorityNumber
  ::= value [DECIMAL_INTEGER_LITERAL]
  ;
    
}