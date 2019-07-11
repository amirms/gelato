/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * Implementors of this interface map identifiers to URIs. This is sometimes
 * necessary when resolving references depends on the resolution of others.
 * </p>
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping.
 */
public interface IKernelURIMapping<ReferenceType> extends org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType> {
	
	/**
	 * Returns an alternative proxy URI that should follow EMF's default naming scheme
	 * such that it can be resolved by the default resolution mechanism that will be
	 * called on this URI (see <code>Resource.getEObject()</code>).
	 */
	public URI getTargetIdentifier();
	
}
