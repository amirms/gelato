/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

/**
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * 
 * @see org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions
 */
public interface IKernelDelegatingReferenceResolver<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> extends org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
