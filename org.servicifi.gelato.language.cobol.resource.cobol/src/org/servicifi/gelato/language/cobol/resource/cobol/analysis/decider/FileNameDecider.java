package org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.divisions.DataDivision;
import org.servicifi.gelato.language.cobol.files.FileName;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;
import org.servicifi.gelato.language.cobol.references.FileNameReference;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;
import org.servicifi.gelato.language.cobol.sections.FileSection;
import org.servicifi.gelato.language.cobol.sections.LinkageStorageSection;
import org.servicifi.gelato.language.cobol.sections.LocalStorageSection;
import org.servicifi.gelato.language.cobol.sections.WorkingStorageSection;
import org.servicifi.gelato.language.cobol.specialnames.AlphabetName;

public class FileNameDecider extends AbstractDecider {

	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference crossReference) {
		if (referenceContainer instanceof FileNameReference) {
			return true;
		}
		return false;
	}
	
	public boolean walkInto(EObject element) {
		if (element instanceof DataDivision) 
			return true;
		
		if (element instanceof FileSection)
			return true;
		
		if (element instanceof FileName)
			return true;
		
		return false;
	}

	public boolean continueAfterReference() {
		return false;
	}

	public boolean isPossibleTarget(String id, EObject element) {
		if (element instanceof FileName) {
			NamedElement ne = (NamedElement) element;
			return id.equals(ne.getName());
		}
		return false;
	}

	public boolean containsCandidates(EObject container, EReference containingReference) {
		return true;

	}

}
