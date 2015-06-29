package org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.divisions.DataDivision;
import org.servicifi.gelato.language.cobol.files.FileName;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;
import org.servicifi.gelato.language.cobol.labels.Procedure;
import org.servicifi.gelato.language.cobol.labels.ProcedureLabel;
import org.servicifi.gelato.language.cobol.paragraphs.Paragraph;
import org.servicifi.gelato.language.cobol.sections.FileSection;
import org.servicifi.gelato.language.cobol.sections.LinkageStorageSection;
import org.servicifi.gelato.language.cobol.sections.LocalStorageSection;
import org.servicifi.gelato.language.cobol.sections.Section;
import org.servicifi.gelato.language.cobol.sections.WorkingStorageSection;

public class ProcedureDecider extends AbstractDecider {


	public boolean walkInto(EObject element) {
		if (element instanceof Section) 
			return true;
		
		if (element instanceof Paragraph)
			return true;
		
		return false;
	}
	
	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference containingReference) {
		
		if (referenceContainer instanceof ProcedureLabel) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsCandidates(EObject container,
			EReference containingReference) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isPossibleTarget(String id, EObject element) {
		if (element instanceof Procedure) {
			
			NamedElement ne = (NamedElement) element;
			//System.out.println("checking label " + id + " against procedure:" + ne.getName());
			return id.equals(ne.getName());
		}
		return false;
	}
}
