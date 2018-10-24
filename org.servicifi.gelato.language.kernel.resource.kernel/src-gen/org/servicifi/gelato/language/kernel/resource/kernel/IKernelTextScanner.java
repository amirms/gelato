/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

/**
 * A common interface for scanners to be used by EMFText. A scanner is initialized
 * with a text and delivers a sequence of tokens.
 */
public interface IKernelTextScanner {
	
	/**
	 * Sets the text that must be scanned.
	 */
	public void setText(String text);
	
	/**
	 * Returns the next token found in the text.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken getNextToken();
	
}
