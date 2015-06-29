/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl;


/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IJclResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessor getResourcePostProcessor();
	
}
