/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl;


/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IJclResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource getResource();
	
}
