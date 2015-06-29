package org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class ConditionNameDecider extends AbstractDecider {

	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference crossReference) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsCandidates(EObject container,
			EReference containingReference) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isPossibleTarget(String identifier, EObject element) {
		// TODO Auto-generated method stub
		return false;
	}

}
