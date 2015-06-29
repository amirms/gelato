/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;

public class ElementReferenceTargetReferenceResolver implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement> {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultResolverDelegate<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement> delegate = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultResolverDelegate<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>();
	
	public void resolve(String identifier, org.servicifi.gelato.language.kernel.references.ElementReference container, EReference reference, int position, boolean resolveFuzzy, final org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResult<org.servicifi.gelato.language.kernel.references.ReferenceableElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.servicifi.gelato.language.kernel.references.ReferenceableElement element, org.servicifi.gelato.language.kernel.references.ElementReference container, EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
