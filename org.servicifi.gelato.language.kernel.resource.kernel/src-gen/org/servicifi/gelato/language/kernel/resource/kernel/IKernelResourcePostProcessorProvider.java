/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

/**
 * Implementors of this interface can provide a post-processor for text
 * resources.
 */
public interface IKernelResourcePostProcessorProvider {

	/**
	 * Returns the processor that shall be called after text resource are
	 * successfully parsed.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelResourcePostProcessor getResourcePostProcessor();

}
