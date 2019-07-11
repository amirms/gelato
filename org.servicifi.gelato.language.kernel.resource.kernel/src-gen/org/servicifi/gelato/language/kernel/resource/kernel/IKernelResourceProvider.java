/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;


/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IKernelResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource getResource();
	
}
