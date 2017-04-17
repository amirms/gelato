/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.cobol.preprocess.CobolPreprocessClasspath;
import org.servicifi.gelato.language.cobol.preprocess.containers.Copybook;

public class CopySentenceTargetReferenceResolver implements org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessReferenceResolver<org.servicifi.gelato.language.cobol.preprocess.sentences.CopySentence, org.servicifi.gelato.language.cobol.preprocess.containers.Copybook> {
	
	private org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis.PreprocessDefaultResolverDelegate<org.servicifi.gelato.language.cobol.preprocess.sentences.CopySentence, org.servicifi.gelato.language.cobol.preprocess.containers.Copybook> delegate = new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.analysis.PreprocessDefaultResolverDelegate<org.servicifi.gelato.language.cobol.preprocess.sentences.CopySentence, org.servicifi.gelato.language.cobol.preprocess.containers.Copybook>();
	
	public void resolve(String identifier, org.servicifi.gelato.language.cobol.preprocess.sentences.CopySentence container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessReferenceResolveResult<org.servicifi.gelato.language.cobol.preprocess.containers.Copybook> result) {
		EObject target = null;
		Copybook proxy = null;
		proxy = (Copybook)CobolPreprocessClasspath.get().getCopybook(identifier);
			

		target = (Copybook) EcoreUtil.resolve(
					proxy, container.eResource());
			
		if (target != null) {
			if (!target.eIsProxy())
			{
				result.addMapping(identifier, (Copybook) target);
			}
		} 
	}
	
	public String deResolve(org.servicifi.gelato.language.cobol.preprocess.containers.Copybook element, org.servicifi.gelato.language.cobol.preprocess.sentences.CopySentence container, org.eclipse.emf.ecore.EReference reference) {

		if (element.eIsProxy()) {
			return delegate.deResolve(element, container, reference);
		}
		return element.getName();
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
