/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis;

public class PreprocessNUMERIC_LITERALTokenResolver implements org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTokenResolver {
	
	private org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis.PreprocessDefaultTokenResolver defaultTokenResolver = new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis.PreprocessDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, null, null, null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, null, null, null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
