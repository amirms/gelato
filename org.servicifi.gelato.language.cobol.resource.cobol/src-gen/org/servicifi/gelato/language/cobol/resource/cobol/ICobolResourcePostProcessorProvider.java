/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol;


/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface ICobolResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolResourcePostProcessor getResourcePostProcessor();
	
}
