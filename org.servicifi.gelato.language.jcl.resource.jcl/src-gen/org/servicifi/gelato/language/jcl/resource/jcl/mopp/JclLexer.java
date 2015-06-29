// $ANTLR 3.4

	package org.servicifi.gelato.language.jcl.resource.jcl.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JclLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__5=5;
    public static final int JCL_WORD=4;

    	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
    	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
    	
    	public void reportError(RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public JclLexer() {} 
    public JclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Jcl.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Jcl.g:20:6: ( 'EXEC' )
            // Jcl.g:20:8: 'EXEC'
            {
            match("EXEC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "JCL_WORD"
    public final void mJCL_WORD() throws RecognitionException {
        try {
            int _type = JCL_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Jcl.g:595:9: ( ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '\\\\' | '+' | '-' | '*' | '!' | '/' | '~' ) ( '[' ( '0' .. '9' )+ ']' )? )+ ) )
            // Jcl.g:596:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '\\\\' | '+' | '-' | '*' | '!' | '/' | '~' ) ( '[' ( '0' .. '9' )+ ']' )? )+ )
            {
            // Jcl.g:596:2: ( ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '\\\\' | '+' | '-' | '*' | '!' | '/' | '~' ) ( '[' ( '0' .. '9' )+ ']' )? )+ )
            // Jcl.g:596:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '\\\\' | '+' | '-' | '*' | '!' | '/' | '~' ) ( '[' ( '0' .. '9' )+ ']' )? )+
            {
            // Jcl.g:596:3: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '\\\\' | '+' | '-' | '*' | '!' | '/' | '~' ) ( '[' ( '0' .. '9' )+ ']' )? )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='!'||(LA3_0 >= '*' && LA3_0 <= '+')||LA3_0=='-'||(LA3_0 >= '/' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='\\'||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')||LA3_0=='~') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Jcl.g:596:4: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '\\\\' | '+' | '-' | '*' | '!' | '/' | '~' ) ( '[' ( '0' .. '9' )+ ']' )?
            	    {
            	    if ( input.LA(1)=='!'||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||(input.LA(1) >= '/' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||input.LA(1)=='~' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    // Jcl.g:597:7: ( '[' ( '0' .. '9' )+ ']' )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0=='[') ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // Jcl.g:597:8: '[' ( '0' .. '9' )+ ']'
            	            {
            	            match('['); 

            	            // Jcl.g:597:11: ( '0' .. '9' )+
            	            int cnt1=0;
            	            loop1:
            	            do {
            	                int alt1=2;
            	                int LA1_0 = input.LA(1);

            	                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
            	                    alt1=1;
            	                }


            	                switch (alt1) {
            	            	case 1 :
            	            	    // Jcl.g:
            	            	    {
            	            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	            	        input.consume();
            	            	    }
            	            	    else {
            	            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	            	        recover(mse);
            	            	        throw mse;
            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt1 >= 1 ) break loop1;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(1, input);
            	                        throw eee;
            	                }
            	                cnt1++;
            	            } while (true);


            	            match(']'); 

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JCL_WORD"

    public void mTokens() throws RecognitionException {
        // Jcl.g:1:8: ( T__5 | JCL_WORD )
        int alt4=2;
        int LA4_0 = input.LA(1);

        if ( (LA4_0=='E') ) {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='X') ) {
                int LA4_3 = input.LA(3);

                if ( (LA4_3=='E') ) {
                    int LA4_4 = input.LA(4);

                    if ( (LA4_4=='C') ) {
                        int LA4_5 = input.LA(5);

                        if ( (LA4_5=='!'||(LA4_5 >= '*' && LA4_5 <= '+')||LA4_5=='-'||(LA4_5 >= '/' && LA4_5 <= '9')||(LA4_5 >= 'A' && LA4_5 <= '\\')||LA4_5=='_'||(LA4_5 >= 'a' && LA4_5 <= 'z')||LA4_5=='~') ) {
                            alt4=2;
                        }
                        else {
                            alt4=1;
                        }
                    }
                    else {
                        alt4=2;
                    }
                }
                else {
                    alt4=2;
                }
            }
            else {
                alt4=2;
            }
        }
        else if ( (LA4_0=='!'||(LA4_0 >= '*' && LA4_0 <= '+')||LA4_0=='-'||(LA4_0 >= '/' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'D')||(LA4_0 >= 'F' && LA4_0 <= 'Z')||LA4_0=='\\'||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')||LA4_0=='~') ) {
            alt4=2;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;

        }
        switch (alt4) {
            case 1 :
                // Jcl.g:1:10: T__5
                {
                mT__5(); 


                }
                break;
            case 2 :
                // Jcl.g:1:15: JCL_WORD
                {
                mJCL_WORD(); 


                }
                break;

        }

    }


 

}