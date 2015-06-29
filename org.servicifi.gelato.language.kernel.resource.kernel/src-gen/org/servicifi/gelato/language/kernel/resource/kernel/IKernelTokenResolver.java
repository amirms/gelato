/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <p>
 * A basic interface to convert parsed tokens to the attribute type in the meta
 * model. All generated TokenResolvers per default delegate requests to an
 * instance of KernelDefaultTokenResolver which performs a standard conversion
 * based on the EMF type conversion. This includes conversion of registered
 * EDataTypes.
 * </p>
 * 
 * @see
 * org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultToken
 * Resolver
 */
public interface IKernelTokenResolver extends org.servicifi.gelato.language.kernel.resource.kernel.IKernelConfigurable {
	
	/**
	 * <p>
	 * Converts a token into an Object (the value of the attribute).
	 * </p>
	 * 
	 * @param lexem the text of the parsed token
	 * @param feature the corresponding feature in the meta model
	 * @param result the result of resolving the lexem, can be used to add processing
	 * errors
	 */
	public void resolve(String lexem, EStructuralFeature feature, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result);
	
	/**
	 * <p>
	 * Converts an Object (the value of an attribute) to a string which can be
	 * printed. This is the inverse of resolving a token with a call to resolve().
	 * </p>
	 * 
	 * @param value the Object to be printed as String
	 * @param feature the corresponding feature (EAttribute)
	 * @param container the container of the object
	 * 
	 * @return the String representation or null if a problem occurred
	 */
	public String deResolve(Object value, EStructuralFeature feature, EObject container);
	
}
