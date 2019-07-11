// $ANTLR 3.4

	package org.servicifi.gelato.language.kernel.resource.kernel.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class KernelLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int CHARACTER_LITERAL=4;
    public static final int IDENTIFIER=5;
    public static final int SL_COMMENT=6;
    public static final int WHITESPACE=7;

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

    public KernelLexer() {} 
    public KernelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public KernelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Kernel.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:20:6: ( '(' )
            // Kernel.g:20:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:21:6: ( ')' )
            // Kernel.g:21:8: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:22:7: ( '*}' )
            // Kernel.g:22:9: '*}'
            {
            match("*}"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:23:7: ( ',' )
            // Kernel.g:23:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:24:7: ( ':' )
            // Kernel.g:24:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:25:7: ( ';' )
            // Kernel.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:26:7: ( '=' )
            // Kernel.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:27:7: ( '>' )
            // Kernel.g:27:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:28:7: ( 'Procedure' )
            // Kernel.g:28:9: 'Procedure'
            {
            match("Procedure"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:29:7: ( '[' )
            // Kernel.g:29:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:30:7: ( ']' )
            // Kernel.g:30:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:31:7: ( 'abort' )
            // Kernel.g:31:9: 'abort'
            {
            match("abort"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:32:7: ( 'affects' )
            // Kernel.g:32:9: 'affects'
            {
            match("affects"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:33:7: ( 'call' )
            // Kernel.g:33:9: 'call'
            {
            match("call"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:34:7: ( 'defines' )
            // Kernel.g:34:9: 'defines'
            {
            match("defines"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:35:7: ( 'do' )
            // Kernel.g:35:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:36:7: ( 'else' )
            // Kernel.g:36:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:37:7: ( 'exception' )
            // Kernel.g:37:9: 'exception'
            {
            match("exception"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:38:7: ( 'goto' )
            // Kernel.g:38:9: 'goto'
            {
            match("goto"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:39:7: ( 'if' )
            // Kernel.g:39:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:40:7: ( 'interleaved' )
            // Kernel.g:40:9: 'interleaved'
            {
            match("interleaved"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:41:7: ( 'l2r' )
            // Kernel.g:41:9: 'l2r'
            {
            match("l2r"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:42:7: ( 'main' )
            // Kernel.g:42:9: 'main'
            {
            match("main"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:43:7: ( 'none' )
            // Kernel.g:43:9: 'none'
            {
            match("none"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:44:7: ( 'order' )
            // Kernel.g:44:9: 'order'
            {
            match("order"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:45:7: ( 'r2l' )
            // Kernel.g:45:9: 'r2l'
            {
            match("r2l"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:46:7: ( 'ref' )
            // Kernel.g:46:9: 'ref'
            {
            match("ref"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:47:7: ( 'return' )
            // Kernel.g:47:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:48:7: ( 'skip' )
            // Kernel.g:48:9: 'skip'
            {
            match("skip"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:49:7: ( 'then' )
            // Kernel.g:49:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:50:7: ( 'try' )
            // Kernel.g:50:9: 'try'
            {
            match("try"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:51:7: ( 'uses' )
            // Kernel.g:51:9: 'uses'
            {
            match("uses"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:52:7: ( 'val' )
            // Kernel.g:52:9: 'val'
            {
            match("val"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:53:7: ( 'var' )
            // Kernel.g:53:9: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:54:7: ( 'while' )
            // Kernel.g:54:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:55:7: ( 'with' )
            // Kernel.g:55:9: 'with'
            {
            match("with"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:56:7: ( '{' )
            // Kernel.g:56:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:57:7: ( '{*' )
            // Kernel.g:57:9: '{*'
            {
            match("{*"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:58:7: ( '|' )
            // Kernel.g:58:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:59:7: ( '}' )
            // Kernel.g:59:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "SL_COMMENT"
    public final void mSL_COMMENT() throws RecognitionException {
        try {
            int _type = SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:3713:11: ( ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Kernel.g:3714:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Kernel.g:3714:2: ( '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Kernel.g:3714:3: '//' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("//"); 



            // Kernel.g:3714:7: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\u0000' && LA1_0 <= '\t')||(LA1_0 >= '\u000B' && LA1_0 <= '\f')||(LA1_0 >= '\u000E' && LA1_0 <= '\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kernel.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
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
            	    break loop1;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SL_COMMENT"

    // $ANTLR start "CHARACTER_LITERAL"
    public final void mCHARACTER_LITERAL() throws RecognitionException {
        try {
            int _type = CHARACTER_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:3717:18: ( ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? ) )
            // Kernel.g:3718:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            {
            // Kernel.g:3718:2: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // Kernel.g:3718:3: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // Kernel.g:3718:3: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Kernel.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            // Kernel.g:3718:14: ( '.' ( '0' .. '9' )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='.') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Kernel.g:3718:15: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // Kernel.g:3718:18: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Kernel.g:
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
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHARACTER_LITERAL"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:3720:11: ( ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* ) )
            // Kernel.g:3721:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            {
            // Kernel.g:3721:2: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )* )
            // Kernel.g:3721:3: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Kernel.g:3721:22: ( ( 'a' .. 'z' | 'A' .. 'Z' ) | ( '0' .. '9' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Kernel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop5;
                }
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
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Kernel.g:3723:11: ( ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ ) )
            // Kernel.g:3724:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            {
            // Kernel.g:3724:2: ( ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+ )
            // Kernel.g:3724:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            {
            // Kernel.g:3724:3: ( ' ' | '\\t' | '\\f' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Kernel.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    public void mTokens() throws RecognitionException {
        // Kernel.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | SL_COMMENT | CHARACTER_LITERAL | IDENTIFIER | WHITESPACE )
        int alt7=44;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // Kernel.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // Kernel.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // Kernel.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // Kernel.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // Kernel.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // Kernel.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // Kernel.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // Kernel.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // Kernel.g:1:56: T__16
                {
                mT__16(); 


                }
                break;
            case 10 :
                // Kernel.g:1:62: T__17
                {
                mT__17(); 


                }
                break;
            case 11 :
                // Kernel.g:1:68: T__18
                {
                mT__18(); 


                }
                break;
            case 12 :
                // Kernel.g:1:74: T__19
                {
                mT__19(); 


                }
                break;
            case 13 :
                // Kernel.g:1:80: T__20
                {
                mT__20(); 


                }
                break;
            case 14 :
                // Kernel.g:1:86: T__21
                {
                mT__21(); 


                }
                break;
            case 15 :
                // Kernel.g:1:92: T__22
                {
                mT__22(); 


                }
                break;
            case 16 :
                // Kernel.g:1:98: T__23
                {
                mT__23(); 


                }
                break;
            case 17 :
                // Kernel.g:1:104: T__24
                {
                mT__24(); 


                }
                break;
            case 18 :
                // Kernel.g:1:110: T__25
                {
                mT__25(); 


                }
                break;
            case 19 :
                // Kernel.g:1:116: T__26
                {
                mT__26(); 


                }
                break;
            case 20 :
                // Kernel.g:1:122: T__27
                {
                mT__27(); 


                }
                break;
            case 21 :
                // Kernel.g:1:128: T__28
                {
                mT__28(); 


                }
                break;
            case 22 :
                // Kernel.g:1:134: T__29
                {
                mT__29(); 


                }
                break;
            case 23 :
                // Kernel.g:1:140: T__30
                {
                mT__30(); 


                }
                break;
            case 24 :
                // Kernel.g:1:146: T__31
                {
                mT__31(); 


                }
                break;
            case 25 :
                // Kernel.g:1:152: T__32
                {
                mT__32(); 


                }
                break;
            case 26 :
                // Kernel.g:1:158: T__33
                {
                mT__33(); 


                }
                break;
            case 27 :
                // Kernel.g:1:164: T__34
                {
                mT__34(); 


                }
                break;
            case 28 :
                // Kernel.g:1:170: T__35
                {
                mT__35(); 


                }
                break;
            case 29 :
                // Kernel.g:1:176: T__36
                {
                mT__36(); 


                }
                break;
            case 30 :
                // Kernel.g:1:182: T__37
                {
                mT__37(); 


                }
                break;
            case 31 :
                // Kernel.g:1:188: T__38
                {
                mT__38(); 


                }
                break;
            case 32 :
                // Kernel.g:1:194: T__39
                {
                mT__39(); 


                }
                break;
            case 33 :
                // Kernel.g:1:200: T__40
                {
                mT__40(); 


                }
                break;
            case 34 :
                // Kernel.g:1:206: T__41
                {
                mT__41(); 


                }
                break;
            case 35 :
                // Kernel.g:1:212: T__42
                {
                mT__42(); 


                }
                break;
            case 36 :
                // Kernel.g:1:218: T__43
                {
                mT__43(); 


                }
                break;
            case 37 :
                // Kernel.g:1:224: T__44
                {
                mT__44(); 


                }
                break;
            case 38 :
                // Kernel.g:1:230: T__45
                {
                mT__45(); 


                }
                break;
            case 39 :
                // Kernel.g:1:236: T__46
                {
                mT__46(); 


                }
                break;
            case 40 :
                // Kernel.g:1:242: T__47
                {
                mT__47(); 


                }
                break;
            case 41 :
                // Kernel.g:1:248: SL_COMMENT
                {
                mSL_COMMENT(); 


                }
                break;
            case 42 :
                // Kernel.g:1:259: CHARACTER_LITERAL
                {
                mCHARACTER_LITERAL(); 


                }
                break;
            case 43 :
                // Kernel.g:1:277: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 44 :
                // Kernel.g:1:288: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\11\uffff\1\41\2\uffff\20\41\1\74\6\uffff\5\41\1\102\3\41\1\106"+
        "\16\41\2\uffff\5\41\1\uffff\3\41\1\uffff\1\41\1\140\3\41\1\144\1"+
        "\145\3\41\1\151\1\41\1\153\1\154\5\41\1\162\1\41\1\164\1\41\1\166"+
        "\1\41\1\uffff\1\170\1\171\1\41\2\uffff\1\41\1\174\1\175\1\uffff"+
        "\1\176\2\uffff\1\41\1\u0080\1\41\1\u0082\1\41\1\uffff\1\41\1\uffff"+
        "\1\41\1\uffff\1\41\2\uffff\1\u0087\1\41\3\uffff\1\u0089\1\uffff"+
        "\1\41\1\uffff\4\41\1\uffff\1\u008f\1\uffff\1\41\1\u0091\1\u0092"+
        "\2\41\1\uffff\1\41\2\uffff\2\41\1\u0098\1\u0099\1\41\2\uffff\1\41"+
        "\1\u009c\1\uffff";
    static final String DFA7_eofS =
        "\u009d\uffff";
    static final String DFA7_minS =
        "\1\11\10\uffff\1\162\2\uffff\1\142\1\141\1\145\1\154\1\157\1\146"+
        "\1\62\1\141\1\157\1\162\1\62\1\153\1\150\1\163\1\141\1\150\1\52"+
        "\6\uffff\2\157\1\146\1\154\1\146\1\60\1\163\1\143\1\164\1\60\1\164"+
        "\1\162\1\151\1\156\1\144\1\154\1\146\1\151\1\145\1\171\1\145\1\154"+
        "\1\151\1\164\2\uffff\1\143\1\162\1\145\1\154\1\151\1\uffff\2\145"+
        "\1\157\1\uffff\1\145\1\60\1\156\2\145\2\60\1\165\1\160\1\156\1\60"+
        "\1\163\2\60\1\154\1\150\1\145\1\164\1\143\1\60\1\156\1\60\1\160"+
        "\1\60\1\162\1\uffff\2\60\1\162\2\uffff\1\162\2\60\1\uffff\1\60\2"+
        "\uffff\1\145\1\60\1\144\1\60\1\164\1\uffff\1\145\1\uffff\1\164\1"+
        "\uffff\1\154\2\uffff\1\60\1\156\3\uffff\1\60\1\uffff\1\165\1\uffff"+
        "\2\163\1\151\1\145\1\uffff\1\60\1\uffff\1\162\2\60\1\157\1\141\1"+
        "\uffff\1\145\2\uffff\1\156\1\166\2\60\1\145\2\uffff\1\144\1\60\1"+
        "\uffff";
    static final String DFA7_maxS =
        "\1\175\10\uffff\1\162\2\uffff\1\146\1\141\1\157\1\170\1\157\1\156"+
        "\1\62\1\141\1\157\1\162\1\145\1\153\1\162\1\163\1\141\1\151\1\52"+
        "\6\uffff\2\157\1\146\1\154\1\146\1\172\1\163\1\143\1\164\1\172\1"+
        "\164\1\162\1\151\1\156\1\144\1\154\1\164\1\151\1\145\1\171\1\145"+
        "\1\162\1\151\1\164\2\uffff\1\143\1\162\1\145\1\154\1\151\1\uffff"+
        "\2\145\1\157\1\uffff\1\145\1\172\1\156\2\145\2\172\1\165\1\160\1"+
        "\156\1\172\1\163\2\172\1\154\1\150\1\145\1\164\1\143\1\172\1\156"+
        "\1\172\1\160\1\172\1\162\1\uffff\2\172\1\162\2\uffff\1\162\2\172"+
        "\1\uffff\1\172\2\uffff\1\145\1\172\1\144\1\172\1\164\1\uffff\1\145"+
        "\1\uffff\1\164\1\uffff\1\154\2\uffff\1\172\1\156\3\uffff\1\172\1"+
        "\uffff\1\165\1\uffff\2\163\1\151\1\145\1\uffff\1\172\1\uffff\1\162"+
        "\2\172\1\157\1\141\1\uffff\1\145\2\uffff\1\156\1\166\2\172\1\145"+
        "\2\uffff\1\144\1\172\1\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\12\1\13\21\uffff"+
        "\1\47\1\50\1\51\1\52\1\53\1\54\30\uffff\1\46\1\45\5\uffff\1\20\3"+
        "\uffff\1\24\31\uffff\1\26\3\uffff\1\32\1\33\3\uffff\1\37\1\uffff"+
        "\1\41\1\42\5\uffff\1\16\1\uffff\1\21\1\uffff\1\23\1\uffff\1\27\1"+
        "\30\2\uffff\1\35\1\36\1\40\1\uffff\1\44\1\uffff\1\14\4\uffff\1\31"+
        "\1\uffff\1\43\5\uffff\1\34\1\uffff\1\15\1\17\5\uffff\1\11\1\22\2"+
        "\uffff\1\25";
    static final String DFA7_specialS =
        "\u009d\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\42\1\uffff\2\42\22\uffff\1\42\7\uffff\1\1\1\2\1\3\1\uffff"+
            "\1\4\2\uffff\1\37\12\40\1\5\1\6\1\uffff\1\7\1\10\2\uffff\17"+
            "\41\1\11\12\41\1\12\1\uffff\1\13\3\uffff\1\14\1\41\1\15\1\16"+
            "\1\17\1\41\1\20\1\41\1\21\2\41\1\22\1\23\1\24\1\25\2\41\1\26"+
            "\1\27\1\30\1\31\1\32\1\33\3\41\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "",
            "",
            "\1\44\3\uffff\1\45",
            "\1\46",
            "\1\47\11\uffff\1\50",
            "\1\51\13\uffff\1\52",
            "\1\53",
            "\1\54\7\uffff\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62\62\uffff\1\63",
            "\1\64",
            "\1\65\11\uffff\1\66",
            "\1\67",
            "\1\70",
            "\1\71\1\72",
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\103",
            "\1\104",
            "\1\105",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115\15\uffff\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123\5\uffff\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\152",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\163",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\165",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\167",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\172",
            "",
            "",
            "\1\173",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "",
            "\1\177",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0081",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0083",
            "",
            "\1\u0084",
            "",
            "\1\u0085",
            "",
            "\1\u0086",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0088",
            "",
            "",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\u008a",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "",
            "\1\u0090",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u0093",
            "\1\u0094",
            "",
            "\1\u0095",
            "",
            "",
            "\1\u0096",
            "\1\u0097",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            "\1\u009a",
            "",
            "",
            "\1\u009b",
            "\12\41\7\uffff\32\41\6\uffff\32\41",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | SL_COMMENT | CHARACTER_LITERAL | IDENTIFIER | WHITESPACE );";
        }
    }
 

}