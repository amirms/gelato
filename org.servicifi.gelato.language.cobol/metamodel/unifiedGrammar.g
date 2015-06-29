// ========================================================
// classIs
// ........................................................

classIs
  : 'CLASS' identifier ( 'IS' )?
        ( throughLiteral | literal )+
  ;

// ========================================================
// literalRange
// ........................................................

literalRange
  : throughLiteral | ( alsoLiteral )+ 
  ;
  
// ========================================================
// throughLiteral
// ........................................................
 
throughLiteral
  : literal ( 'THROUGH' | 'THRU' ) literal
  ;
  
alsoLiteral
  : 'ALSO' literal
  ;
  
// ========================================================
// dataDescriptionEntry_level66
// ........................................................

dataDescriptionEntry_level66
  : '66' dataName renames '.'
  ;
  
// ========================================================
// renames
// ........................................................
  
renames
  : 'RENAMES' throughDataName
  ;  

// ========================================================
// throughDataName
// ........................................................

throughDataName
  : dataName ( qualifier )* 
  	( ( 'THROUGH' | 'THRU' )  dataName ( qualifier )* )?  
  ;
  
// ========================================================
// dataDescriptionEntry_level88 - conditionName: CobolWord
// ........................................................

dataDescriptionEntry_level88
  : '88' conditionName
    ( ( 'VALUE'  ( 'IS' )?  )  | ( 'VALUES' ( 'ARE' )? ) )
        ( literal | throughLiteral )+  '.'
  ;
  
  

  
// ========================================================
// evaluateStatement
// ........................................................

evaluateStatement
  : 'EVALUATE'  subject ( 'ALSO' subject )*
    ( when )+
    ( whenOther )?
    ( 'END-EVALUATE' )?
  ;  

// ========================================================
// subject
// ........................................................

subject
  : ( condition
    | identifier
    | arithmeticExpression
    | literal
    )
  ;
  
// ========================================================
// when
// ........................................................

when
  : ( 'WHEN' object ( 'ALSO' object )* )+ 
  	nestedStatements
  ;

// ========================================================
// whenOther
// ........................................................

whenOther
  : 'WHEN' 'OTHER'  nestedStatements
  ;

// ========================================================
// object
// ........................................................

object
  : 'ANY'
    | 'TRUE'
    | 'FALSE'
    | condition
    | rangeExpression
    | notRangeExpression
  ;
  
// ========================================================
// rangeExpression
// ........................................................

rangeExpression
  : ( identifier | literal  | arithmeticExpression )
  	( throughExpression )?
  ;
  
// ========================================================
// notRangeExpression
// ........................................................ 
notRangeExpression
  : 'NOT' rangeExpression
  ;
  
// ========================================================
// throughExpression
// ........................................................

throughExpression
  :  ( 'THROUGH' | 'THRU' )
     ( identifier
     | literal
     | arithmeticExpression
     )
  ;

// ========================================================
// performStatement
// ........................................................

performStatement
  : 'PERFORM'
    ( ( times | until  | varying )?
      ( nestedStatements )?
      'END-PERFORM' )
    | ( procedureName  ( ( 'THROUGH' | 'THRU'  )  procedureName  )?
      ( times | until | varying )?
    )
  ;
  
// ========================================================
// usingInputPhrase
// ........................................................  
usingInputPhrase
  : ( 'USING' ( fileName )+ )
  | ( 'INPUT' 'PROCEDURE' ( 'IS' )? procedureName 
  	( ( 'THROUGH' | 'THRU' ) procedureName )?
  ;
  
// ========================================================
// givingsOutputPhrase
// ........................................................  
givingsOutputPhrase
  : ( 'GIVING' ( fileName )+ )
  | ( 'OUTPUT' 'PROCEDURE' ( 'IS' )? procedureName 
  	( ( 'THROUGH' | 'THRU' ) procedureName )?
  ;         