/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.Token;

public class KernelAntlrScanner implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextScanner {
	
	private Lexer antlrLexer;
	
	public KernelAntlrScanner(Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken result = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new ANTLRStringStream(text));
	}
	
}
