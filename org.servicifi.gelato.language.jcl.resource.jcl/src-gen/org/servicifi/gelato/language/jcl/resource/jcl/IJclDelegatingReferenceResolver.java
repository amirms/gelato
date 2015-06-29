/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl;

import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A delegating reference resolver is an extension of a normal reference resolver
 * that can be configured with another resolver that it may delegate method calls
 * to. This interface can be implemented by additional resolvers to customize
 * resolving using the load option ADDITIONAL_REFERENCE_RESOLVERS.
 * </p>
 * 
 * @see org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions
 */
public interface IJclDelegatingReferenceResolver<ContainerType extends EObject, ReferenceType extends EObject> extends org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver<ContainerType, ReferenceType> {
	
	/**
	 * Sets the delegate for this resolver.
	 */
	public void setDelegate(org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolver<ContainerType, ReferenceType> delegate);
	
}
