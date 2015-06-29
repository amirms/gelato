/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.analysis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.labels.Procedure;
import org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild;
import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.ProcedureDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.helper.IResolutionTargetDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.helper.ScopedTreeWalker;

public class ProcedureRangeChildTargetReferenceResolver implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild, org.servicifi.gelato.language.cobol.labels.Procedure> {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultResolverDelegate<org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild, org.servicifi.gelato.language.cobol.labels.Procedure> delegate = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultResolverDelegate<org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild, org.servicifi.gelato.language.cobol.labels.Procedure>();
	
	public void resolve(String identifier, org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<org.servicifi.gelato.language.cobol.labels.Procedure> result) {

		EObject startingPoint = null;
		EObject target = null;
				
		startingPoint = container;
		while (!(startingPoint instanceof CompilationUnit)) {
			startingPoint = startingPoint.eContainer();
			
		}
		if (startingPoint instanceof CompilationUnit)
			startingPoint = ((CompilationUnit)startingPoint).getProcedureDivision();
		
				
		//System.out.println("Resolving " + identifier + " within container " + container.toString());
		
		target = searchFromStartingPoint(identifier, container, reference,
					startingPoint);
		
		if (target != null) {
			if (target.eIsProxy()) {
				target = EcoreUtil.resolve(target, container);
			}
			if (!target.eIsProxy()) {
				result.addMapping(identifier, (Procedure) target);
			}
		}
	}
	
	private EObject searchFromStartingPoint(String identifier,
			ProcedureRangeChild container, EReference reference, EObject startingPoint) {
		List<IResolutionTargetDecider> deciderList = new ArrayList<IResolutionTargetDecider>();
		deciderList.add(new ProcedureDecider());

		ScopedTreeWalker treeWalker = new ScopedTreeWalker(deciderList);

		return treeWalker.walk(startingPoint, identifier, container, reference);
	}
	
	public String deResolve(org.servicifi.gelato.language.cobol.labels.Procedure element, org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
