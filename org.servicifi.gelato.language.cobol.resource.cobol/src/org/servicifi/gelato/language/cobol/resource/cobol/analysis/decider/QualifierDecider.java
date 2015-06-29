package org.servicifi.gelato.language.cobol.resource.cobol.analysis.decider;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.files.FileName;
import org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage;
import org.servicifi.gelato.language.cobol.references.ReferencesPackage;

public class QualifierDecider extends AbstractDecider {

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

	@Override
	public boolean canFindTargetsFor(EObject referenceContainer,
			EReference containingReference) {
		return true;
	}

	@Override
	public boolean containsCandidates(EObject container,
			EReference containingReference) {
		/*if (IdentifiersPackage.Literals.QUALIFIER.equals(containingReference)) {
			return true;
		}
		return false;*/
		
		return true;
	}

	@Override
	public boolean isPossibleTarget(String id, EObject element) {
		if ((element instanceof DataItem) || (element instanceof FileName)) {
			NamedElement ne = (NamedElement) element;
			return id.equals(ne.getName());
		}
		return false;
	}
	
}
