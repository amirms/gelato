/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <p>
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * </p>
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class CobolContextDependentURIFragmentFactory<ContainerType extends EObject, ReferenceType extends EObject>  implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public CobolContextDependentURIFragmentFactory(org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolContextDependentURIFragment<?> create(String identifier, ContainerType container, EReference reference, int positionInReference, EObject proxy) {
		
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
