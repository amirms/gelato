/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.analysis;

import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;

public class JumpTargetReferenceResolver implements
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.analysis.framework.commons.LabellableElement> {

	private org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultResolverDelegate<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.analysis.framework.commons.LabellableElement> delegate = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.KernelDefaultResolverDelegate<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.analysis.framework.commons.LabellableElement>();

	public void resolve(String identifier, org.servicifi.gelato.language.kernel.statements.Jump container,
			EReference reference, int position, boolean resolveFuzzy,
			final org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResult<org.servicifi.gelato.analysis.framework.commons.LabellableElement> result) {
		EObject startingPoint = null;
		EObject target = null;

		startingPoint = container;
//		while (!(startingPoint instanceof Procedure || startingPoint instanceof MainProcedure)) {
//			startingPoint = startingPoint.eContainer();
//		}

		// target labels can be outside procedure boundaries
		while (!(startingPoint instanceof CompilationUnit)) {
			startingPoint = startingPoint.eContainer();
		}

		TreeIterator<EObject> iterator = startingPoint.eAllContents();

		while (iterator.hasNext()) {
			EObject currentObject = iterator.next();

			if (!(currentObject instanceof LabellableElement)) {
				continue;
			}

			if (((LabellableElement) currentObject).getLabel() == Double.parseDouble(identifier)) {
				target = currentObject;
			}
		}

		if (target != null) {
			if (target.eIsProxy()) {
				target = EcoreUtil.resolve(target, container);
			} else {
				result.addMapping(identifier, (LabellableElement) target);
			}
		}
	}

	public String deResolve(org.servicifi.gelato.analysis.framework.commons.LabellableElement element,
			org.servicifi.gelato.language.kernel.statements.Jump container, EReference reference) {
		if (element != null) {
			return Double.toString(element.getLabel());
		}

		return "";
	}

	public void setOptions(Map<?, ?> options) {
		// save options in a field or leave method empty if this resolver does not
		// depend
		// on any option
	}

}
