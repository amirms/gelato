/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class KernelContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public KernelContextDependentURIFragmentFactory(org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
