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
import org.servicifi.gelato.language.cobol.sections.FileSection;
import org.servicifi.gelato.language.cobol.sections.LinkageStorageSection;
import org.servicifi.gelato.language.cobol.sections.LocalStorageSection;
import org.servicifi.gelato.language.cobol.sections.WorkingStorageSection;

public class DataNameDecider extends AbstractDecider {
	public EList<? extends EObject> getAdditionalCandidates(String identifier, EObject container) {
		EList<EObject> resultList = new BasicEList<EObject>();
		if (container instanceof FileName){
			EList<DataItem> recordsList =
					((FileName)container).getRecords();
				for(DataItem entry : recordsList) {
					resultList.add(entry);
				}
			
		}
		if (container instanceof DataItem) {
				EList<DataItem> entriesList =
					((DataItem)container).getSubentries();
				for(DataItem entry : entriesList) {
					resultList.add(entry);
				}
				
		}

		return resultList;
	}


	public boolean walkInto(EObject element) {
		if (element instanceof DataDivision) 
			return true;
		
		if (element instanceof FileSection)
			return true;
		
		if (element instanceof FileName)
			return true;
		
		if (element instanceof WorkingStorageSection)
			return true;
		
		if (element instanceof LocalStorageSection)
			return true;
		
		if (element instanceof LinkageStorageSection)
			return true;
		
		if (element instanceof DataItem)
			return true;
		
		return false;
	}
	
	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference containingReference) {
		
		if (referenceContainer instanceof IdentifierReference) {
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
		if (element instanceof DataItem) {
			
			NamedElement ne = (NamedElement) element;
			return id.equals(ne.getName());
		}
		return false;
	}
}
