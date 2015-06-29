/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.Token;

public class JclAntlrScanner implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTextScanner {
	
	private Lexer antlrLexer;
	
	public JclAntlrScanner(Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.servicifi.gelato.language.jcl.resource.jcl.IJclTextToken result = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new ANTLRStringStream(text));
	}
	
}
