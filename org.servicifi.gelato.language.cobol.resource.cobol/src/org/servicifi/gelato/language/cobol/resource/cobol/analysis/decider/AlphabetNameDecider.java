package org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;
import org.servicifi.gelato.language.cobol.specialnames.AlphabetName;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
public class AlphabetNameDecider extends AbstractDecider{

	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference crossReference) {
		return true;
	}

	public boolean continueAfterReference() {
		return false;
	}

	public boolean isPossibleTarget(String id, EObject element) {
		if (element instanceof AlphabetName) {
			NamedElement ne = (NamedElement) element;
			return id.equals(ne.getName());
		}
		return false;
	}

	public boolean containsCandidates(EObject container, EReference containingReference) {
		if (ReferencesPackage.Literals.ALPHABET_NAME_REFERENCE.equals(containingReference)) {
			return true;
		}
	return false;
	}

}
