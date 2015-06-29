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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;
import org.servicifi.gelato.language.cobol.identifiers.Qualifier;
import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.Reference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.AlphabetNameDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.ConditionNameDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.DataNameDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.FileNameDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.IndexNameDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider.MnemonicNameDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.helper.IResolutionTargetDecider;
import org.servicifi.gelato.language.cobol.resource.cobol.analysis.helper.ScopedTreeWalker;

public class ElementReferenceTargetReferenceResolver implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<org.servicifi.gelato.language.cobol.references.ElementReference, org.servicifi.gelato.language.cobol.references.ReferenceableElement> {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultResolverDelegate<org.servicifi.gelato.language.cobol.references.ElementReference, org.servicifi.gelato.language.cobol.references.ReferenceableElement> delegate = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.CobolDefaultResolverDelegate<org.servicifi.gelato.language.cobol.references.ElementReference, org.servicifi.gelato.language.cobol.references.ReferenceableElement>();
	public void resolve(String identifier, org.servicifi.gelato.language.cobol.references.ElementReference container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<org.servicifi.gelato.language.cobol.references.ReferenceableElement> result) {
		//System.out.println("Resolving identifier: " + identifier);
		//delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
		//System.out.println("The container object is: " + container.toString());
		//delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
		
		EObject startingPoint = null;
		EObject target = null;
		Reference parentReference = null;
		
		startingPoint = container;
		while (!(startingPoint instanceof CompilationUnit)) {
			startingPoint = startingPoint.eContainer();
			
		}
		if (startingPoint instanceof CompilationUnit)
			startingPoint = ((CompilationUnit)startingPoint).getDataDivision();
		
		
		if ( container instanceof Qualifier ) {
			
			Qualifier qualifier = (Qualifier) container;
			
			IdentifierReference parentIdentifierReference = (IdentifierReference) qualifier.eContainer();
			
			Iterator<Qualifier> it = parentIdentifierReference.getQualifiers().iterator();
			
			while (it.hasNext()) {
				 Qualifier q = it.next();
				 
				 if (qualifier.equals(q))
					 break;
				
			}
			
			if (it.hasNext()) {
				
				Qualifier parentQualifier = it.next();
				
				startingPoint = parentQualifier.getTarget();
				
			}
			
		}
		
		if ( container instanceof IdentifierReference) {
			
			
			
			IdentifierReference identifierReference = (IdentifierReference) container;
			if (!((IdentifierReference) container).getQualifiers().isEmpty())
			{
				Qualifier containingQualifier = identifierReference.getQualifiers().get(0);
			
				startingPoint = containingQualifier.getTarget();
			}
		}
		
		//System.out.println("Resolving " + identifier + " within container " + container.toString());
		
		target = searchFromStartingPoint(identifier, container, reference,
					startingPoint);
		
		if (target != null) {
			if (target.eIsProxy()) {
				target = EcoreUtil.resolve(target, container);
			}
			if (!target.eIsProxy()) {
				result.addMapping(identifier, (ReferenceableElement) target);
			}
		}
		
	}
	private EObject searchFromStartingPoint(String identifier,
			ElementReference container, EReference reference, EObject startingPoint) {
		List<IResolutionTargetDecider> deciderList = new ArrayList<IResolutionTargetDecider>();
		deciderList.add(new AlphabetNameDecider());
		deciderList.add(new DataNameDecider());
		deciderList.add(new ConditionNameDecider());
		deciderList.add(new FileNameDecider());
		deciderList.add(new IndexNameDecider());
		deciderList.add(new MnemonicNameDecider());

		ScopedTreeWalker treeWalker = new ScopedTreeWalker(deciderList);

		return treeWalker.walk(startingPoint, identifier, container, reference);
	}

	public String deResolve(org.servicifi.gelato.language.cobol.references.ReferenceableElement element, org.servicifi.gelato.language.cobol.references.ElementReference container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
