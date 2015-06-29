/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.analysis;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;

public class JumpTargetReferenceResolver implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.language.kernel.commons.LabellableElement> {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultResolverDelegate<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.language.kernel.commons.LabellableElement> delegate = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultResolverDelegate<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.language.kernel.commons.LabellableElement>();
	
	public void resolve(String identifier, org.servicifi.gelato.language.kernel.statements.Jump container, EReference reference, int position, boolean resolveFuzzy, final org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResult<org.servicifi.gelato.language.kernel.commons.LabellableElement> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.servicifi.gelato.language.kernel.commons.LabellableElement element, org.servicifi.gelato.language.kernel.statements.Jump container, EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
