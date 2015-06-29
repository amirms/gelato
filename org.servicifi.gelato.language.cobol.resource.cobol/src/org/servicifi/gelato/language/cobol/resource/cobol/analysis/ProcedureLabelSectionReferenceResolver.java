/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.analysis;

public class ProcedureLabelSectionReferenceResolver implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<org.servicifi.gelato.language.cobol.labels.ProcedureLabel, org.servicifi.gelato.language.cobol.sections.Section> {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultResolverDelegate<org.servicifi.gelato.language.cobol.labels.ProcedureLabel, org.servicifi.gelato.language.cobol.sections.Section> delegate = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultResolverDelegate<org.servicifi.gelato.language.cobol.labels.ProcedureLabel, org.servicifi.gelato.language.cobol.sections.Section>();
	
	public void resolve(String identifier, org.servicifi.gelato.language.cobol.labels.ProcedureLabel container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<org.servicifi.gelato.language.cobol.sections.Section> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.servicifi.gelato.language.cobol.sections.Section element, org.servicifi.gelato.language.cobol.labels.ProcedureLabel container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
