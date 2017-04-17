/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class KernelIDENTIFIERTokenResolver implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultTokenResolver defaultTokenResolver = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultTokenResolver(true);
	
	public String deResolve(Object value, EStructuralFeature feature, EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, EStructuralFeature feature, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
