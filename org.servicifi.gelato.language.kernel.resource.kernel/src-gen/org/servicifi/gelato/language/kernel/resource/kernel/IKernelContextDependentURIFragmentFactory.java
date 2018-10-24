/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

/**
 * An interface for factories to create instances of
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIF
 * ragment.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public interface IKernelContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> {
	
	/**
	 * Create a new instance of the
	 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIF
	 * ragment interface.
	 * 
	 * @param identifier the identifier that references an Object
	 * @param container the object that contains the reference
	 * @param reference the reference itself
	 * @param positionInReference the position of the identifier (if the reference is
	 * multiple)
	 * @param proxy the proxy that will be resolved later to the actual EObject
	 * 
	 * @return the new instance of
	 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIF
	 * ragment
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy);
}
