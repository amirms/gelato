/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.analysis;

public class CobolQUOTED_69886967_6978684569886967TokenResolver implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultTokenResolver defaultTokenResolver = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultTokenResolver(true);
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		// By default token de-resolving is delegated to the DefaultTokenResolver.
		String result = defaultTokenResolver.deResolve(value, feature, container, "EXEC", "END-EXEC", null);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolveResult result) {
		// By default token resolving is delegated to the DefaultTokenResolver.
		defaultTokenResolver.resolve(lexem, feature, result, "EXEC", "END-EXEC", null);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
