/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class JclJCL_WORDTokenResolver implements org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver {
	
	private org.servicifi.gelato.language.jcl.resource.jcl.analysis.JclDefaultTokenResolver defaultTokenResolver = new org.servicifi.gelato.language.jcl.resource.jcl.analysis.JclDefaultTokenResolver(true);
	
	public String deResolve(Object value, EStructuralFeature feature, EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, EStructuralFeature feature, org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
