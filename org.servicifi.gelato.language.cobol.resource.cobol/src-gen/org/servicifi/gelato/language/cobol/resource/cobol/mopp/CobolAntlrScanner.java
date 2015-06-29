/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.Token;

public class CobolAntlrScanner implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextScanner {
	
	private Lexer antlrLexer;
	
	public CobolAntlrScanner(Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextToken result = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new ANTLRStringStream(text));
	}
	
}
