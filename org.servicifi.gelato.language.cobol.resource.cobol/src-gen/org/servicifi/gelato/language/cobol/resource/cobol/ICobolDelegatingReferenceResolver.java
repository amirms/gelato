/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * </p>
 * 
 * @see org.servicifi.gelato.language.cobol.resource.cobol.ICobolOptions
 */
public interface ICobolDelegatingReferenceResolver<ContainerType extends EObject, ReferenceType extends EObject> extends org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
