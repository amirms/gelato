package org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;
import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;
import org.servicifi.gelato.language.cobol.references.IndexNameReference;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;
import org.servicifi.gelato.language.cobol.specialnames.AlphabetName;
import org.servicifi.gelato.language.cobol.tables.AdditionalIndexName;
import org.servicifi.gelato.language.cobol.tables.IndexName;


public class IndexNameDecider  extends AbstractDecider {

	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference containingReference) {
		
		if (referenceContainer instanceof IdentifierReference) {
			return true;
		} else if (referenceContainer instanceof IndexNameReference){
			return true;
		}
		return false;
	}

	public boolean continueAfterReference() {
		return false;
	}

	public boolean isPossibleTarget(String id, EObject element) {
		if ((element instanceof IndexName) || (element instanceof AdditionalIndexName)) {
			NamedElement ne = (NamedElement) element;
			return id.equals(ne.getName());
		}
		return false;
	}

	public boolean containsCandidates(EObject container, EReference containingReference) {
		if (IdentifiersPackage.Literals.IDENTIFIER_REFERENCE.equals(containingReference)) {
			return true;
		} else if (ReferencesPackage.Literals.INDEX_NAME_REFERENCE.equals(containingReference)) {
			return true;
		}
	return false;
	}

}
