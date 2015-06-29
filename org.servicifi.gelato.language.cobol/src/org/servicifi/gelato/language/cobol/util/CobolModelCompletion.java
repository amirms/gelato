package org.servicifi.gelato.language.cobol.util;

import java.util.Iterator;
import java.util.Stack;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute;
import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.cobol.dataitems.Redefines;
import org.servicifi.gelato.language.cobol.dataitems.RenamingDataName;
import org.servicifi.gelato.language.cobol.divisions.Division;
import org.servicifi.gelato.language.cobol.divisions.IdentificationDivision;
import org.servicifi.gelato.language.cobol.files.FileName;
import org.servicifi.gelato.language.cobol.paragraphs.Paragraph;
import org.servicifi.gelato.language.cobol.references.DataNameReference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.sections.DataDivisionSection;
import org.servicifi.gelato.language.cobol.sections.LinkageStorageSection;
import org.servicifi.gelato.language.cobol.sections.LocalStorageSection;
import org.servicifi.gelato.language.cobol.sections.Section;
import org.servicifi.gelato.language.cobol.sections.WorkingStorageSection;
import org.servicifi.gelato.language.cobol.sentences.Sentence;
import org.servicifi.gelato.language.cobol.sentences.StatementContainer;
import org.servicifi.gelato.language.cobol.statements.NestedStatement;
import org.servicifi.gelato.language.cobol.statements.Statement;


public class CobolModelCompletion {

	public static void complete(Resource resource) {
		//Logger.log("completing the model");
		for(Iterator<EObject> contentIterator = resource.getAllContents(); contentIterator.hasNext(); ) {
			EObject element = contentIterator.next();
			if (element instanceof DataDivisionSection) {
				addElementaryToGroupDataItems((DataDivisionSection) element);
			}
			if(element instanceof FileName) {
				FileName fileName = (FileName) element;
				
				addGroupEntries(fileName.getRecords());
				addDataItemAliases(fileName.getRecords());
				
			}
			if(element instanceof WorkingStorageSection) {
				WorkingStorageSection section = (WorkingStorageSection) element;
				
				addGroupEntries(section.getRecords());
				addDataItemAliases(section.getRecords());
			}
			
			if(element instanceof LocalStorageSection) {
				LocalStorageSection section = (LocalStorageSection) element;
				
				addGroupEntries(section.getRecords());
				addDataItemAliases(section.getRecords());
			}
			
			if(element instanceof LinkageStorageSection) {
				LinkageStorageSection section = (LinkageStorageSection) element;
				
				addGroupEntries(section.getRecords());
				addDataItemAliases(section.getRecords());
			}
			
			
			if (element instanceof CompilationUnit) {
				setCompilationUnitName((CompilationUnit) element);
			}
			/*
			if (element instanceof Paragraph) {
				setNextParagraph((Paragraph) element);
			}*/
			if (element instanceof Sentence) {
				setNextSentence((Sentence) element);
			}
			if (element instanceof Statement) {
				setNextStatement((Statement) element);
				
			}
			
			//
			
			
		}
		//simplifyExpressions(resource);
	}
	
	private static void addDataItemAliases(EList<DataItem> records) {
		// TODO Auto-generated method stub
		Iterator<DataItem> it = records.iterator();
		
		DataItem currentDataItem = null;
		DataItem previousDataItem = null;
		
		while (it.hasNext()) {
			currentDataItem = it.next();
			
			Iterator<DataItem> entriesit = currentDataItem.getSubentries().iterator();
			
			while (entriesit.hasNext()) {
				DataItem subentry = entriesit.next();
				
				if (!aliasExists(currentDataItem, subentry)) {
					
					currentDataItem.getAliasesTo().add(subentry);
					
					subentry.getAliasesFrom().add(currentDataItem);
					
				}
					
			}
			
			
			if (isConditionName(currentDataItem)){
				if (previousDataItem != null) {
					if (!aliasExists(previousDataItem, currentDataItem)) {
						currentDataItem.getAliasesTo().add(previousDataItem);
						
						previousDataItem.getAliasesFrom().add(currentDataItem);
						
					}
				}
			}
			
			Redefines redefines = getRedefiningClause(currentDataItem);
			
			if (redefines != null) {
				
				ReferenceableElement target = redefines.getDataName().getTarget();
				
				if (!aliasExists(currentDataItem, target)) {
					currentDataItem.getAliasesTo().add(target);
					
					target.getAliasesFrom().add(currentDataItem);
					
				}
			}
			//TODO Not Done
			if (isRenamingDataItem(currentDataItem)){
				RenamingDataName renamingDataItem = (RenamingDataName) currentDataItem;
				
				RangeExpression nameRange = renamingDataItem.getNameRange();
				
				
			}
			
		
			previousDataItem = currentDataItem;
		}
	}
	
	private static Redefines getRedefiningClause(DataItem dataItem) {

		Iterator<DataItemAttribute> attit = dataItem.getAttributes().iterator();
		
		while (attit.hasNext()) {
			
			DataItemAttribute attribute = attit.next();
			
			if (attribute instanceof Redefines)
				return (Redefines)attribute;
					
		}
		
		return null;
	}

	private static boolean isRenamingDataItem(DataItem dataItem) {

		if (dataItem instanceof RenamingDataName)
			return true;
		
		return false;
	}

	private static boolean isConditionName(DataItem dataItem) {
		// TODO Auto-generated method stub
		int levelNo = Integer.parseInt(dataItem.getLevelNumber());
		
		if (levelNo == 88)
			return true;
		
		return false;
	}

	private static boolean aliasExists(ReferenceableElement item1, ReferenceableElement item2){
		
		Iterator<ReferenceableElement> it = item1.getAliasesTo().iterator();
		
		while (it.hasNext()) {
			
			ReferenceableElement element = it.next();
			
			if (element.equals(item2))
				return true;
		}
		
		it = item1.getAliasesFrom().iterator();
		
		while (it.hasNext()) {
			
			ReferenceableElement element = it.next();
			
			if (element.equals(item2))
				return true;
		}
		
		return false;
	}

	private static Stack<DataItem> groupStack = new Stack<DataItem>(); 
	
	private static DataItem currentGroupItem = null;
	
	private static int currentGroupLevelNumber = -1;
	
	private static void addGroupEntries(EList<DataItem> records) {
		// TODO Auto-generated method stub
		
		Iterator<DataItem> recit = records.iterator();
		
		DataItem currentDataItem = null;
		
		int currentLevelNumber = 0;
		
		while(recit.hasNext()) {
			
			currentDataItem = recit.next();
			
			currentLevelNumber = Integer.parseInt(currentDataItem.getLevelNumber());
			if (currentGroupItem != null)
			
				if (currentLevelNumber > currentGroupLevelNumber) {
					
	
					currentDataItem.setSuperentry(currentGroupItem);
					
					//TODO check if this works
					currentGroupItem.getSubentries().add(currentDataItem);
					
					
				} else //  if (currentLevelNumber <= currentGroupLevelNumber)
					//find the new super entry, by popping 
				{
					while ((!groupStack.isEmpty()) && (currentLevelNumber <= currentGroupLevelNumber)){
						currentGroupItem = groupStack.pop();
					
						currentGroupLevelNumber = Integer.parseInt(currentGroupItem.getLevelNumber());
	
							
						if (currentLevelNumber > currentGroupLevelNumber) {
							currentDataItem.setSuperentry(currentGroupItem);
							
							//TODO check if this works
							currentGroupItem.getSubentries().add(currentDataItem);
							
						}
					
					}
					
				}
			
			groupStack.add(currentDataItem);
				
			currentGroupItem = currentDataItem;
				
			currentGroupLevelNumber = currentLevelNumber;
			
		}
		
	}

	private static void setNextStatement(Statement statement) {
		// TODO Auto-generated method stub
		if (statement.eContainer() instanceof Sentence){
			Sentence sentence = (Sentence) statement.eContainer();
			Iterator<Statement> it = sentence.getStatements().iterator();
			
			while (it.hasNext()) {
					
				Statement containingStatement = it.next();
				if (statement.equals(containingStatement ))
					break;
					
			}
			
			if (it.hasNext())
				
				statement.setNext(it.next());
			
			/*
			else{
				Sentence nextSentence = sentence.getNext();
				if (nextSentence != null ){
					while (!nextSentence.getStatements().isEmpty()) {
						nextSentence = nextSentence.getNext();					
						
					}
					
					statement.setNext(nextSentence.getStatements().get(0));
				}
			}*/
			
		} else if (statement.eContainer() instanceof NestedStatement) {
				NestedStatement nestedStatement = (NestedStatement) statement.eContainer();
				Iterator<Statement> it = nestedStatement.getStatements().iterator();
			
				Statement containingStatement = null;
				while (it.hasNext()) {
					
				containingStatement = it.next();
				if (statement.equals(containingStatement ))
					break;
					
			}
			
			if (it.hasNext())
				
				statement.setNext(it.next());
			/*
			else{
				statement.setNext(containingStatement.getNext());
					
			}
			*/
			
		} 
		
		if (statement.eContainer() instanceof org.servicifi.gelato.language.cobol.statements.Condition) {
			org.servicifi.gelato.language.cobol.statements.Condition conditionStatement 
				= (org.servicifi.gelato.language.cobol.statements.Condition) statement.eContainer();
			Iterator<Statement> it = conditionStatement.getElseStatements().iterator();
			
			Statement containingStatement = null;
			while (it.hasNext()) {
					
				containingStatement = it.next();
				if (statement.equals(containingStatement ))
					break;
					
			}
			
			if (it.hasNext())
				
				statement.setNext(it.next());
			/*
			else{
				statement.setNext(containingStatement.getNext());
					
			}*/
		}
	}

	private static void setNextSentence(Sentence sentence) {
		// TODO Auto-generated method stub
		if (sentence.eContainer() instanceof Paragraph){
			Paragraph paragraph = (Paragraph) sentence.eContainer();
			Iterator<StatementContainer> it = paragraph.getSentences().iterator();
			while (it.hasNext()) {
				
				StatementContainer statementContainer = it.next();
				
				if (sentence.equals(statementContainer))
					break;
			}	
			
			while (it.hasNext()) {
					
				StatementContainer containingStatement = it.next();
				if (sentence.equals(containingStatement ))
					break;
					
			}
			
			if (it.hasNext())
				
				sentence.setNext((Sentence)it.next());
			/*
			else{
				Paragraph nextParagraph = paragraph.getNext();
			
				while (!nextParagraph.getSentences().isEmpty()) {
					nextParagraph = nextParagraph.getNext();					
					
				}
				
				sentence.setNext((Sentence)nextParagraph.getSentences().get(0));
					
			}*/
			
		} else if (sentence.eContainer() instanceof Section) {
			Section section = (Section) sentence.eContainer();
			Iterator<StatementContainer> it = section.getSentences().iterator();
			while (it.hasNext()) {
				
				StatementContainer statementContainer = it.next();
				
				if (sentence.equals(statementContainer))
					break;
			}	
			
			while (it.hasNext()) {
					
				StatementContainer containingStatement = it.next();
				if (sentence.equals(containingStatement ))
					break;
					
			}
			
			if (it.hasNext())
				
				sentence.setNext((Sentence)it.next());
			
		} else if (sentence.eContainer() instanceof Division) {
			
			Division division = (Division) sentence.eContainer();
			Iterator<StatementContainer> it = division .getSentences().iterator();
			while (it.hasNext()) {
				
				StatementContainer statementContainer = it.next();
				
				if (sentence.equals(statementContainer))
					break;
			}	
			
			while (it.hasNext()) {
					
				StatementContainer containingStatement = it.next();
				if (sentence.equals(containingStatement ))
					break;
					
			}
			
			if (it.hasNext())
				
				sentence.setNext((Sentence)it.next());
		}
	}

	private static void setCompilationUnitName(CompilationUnit cu) {
		IdentificationDivision id = cu.getIdentificationDivision();
		
		cu.setName(id.getName());
		
	}
	
	private static void addElementaryToGroupDataItems(
			DataDivisionSection element) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Simplifies all expression in the given resource by removing empty containers
	 * in all expression trees.
	 * 
	 * @author Jamopp
	 * @param resource
	 */
	public static void simplifyExpressions(Resource resource) {
		simplifyDown(resource.getContents());
	}

	private static void simplifyDown(EList<EObject> parentList) {
		for(EObject child : new BasicEList<EObject>(parentList)) {
			EObject singleContained = getSingleContained(child);
			EObject next = singleContained;
			while (next != null) {
				next = getSingleContained(singleContained);
				if (next != null) {
					singleContained = next;
				}
			}
			if (singleContained != null) {
				EcoreUtil.replace(child, singleContained);
				child = singleContained;
			}
			simplifyDown(child.eContents());
		}
	}

	private static EObject getSingleContained(EObject parent) {
		if (!(parent instanceof Condition)) {
			return null;
		}
		//never kill a primary
		if (parent instanceof SimpleConditionChild) {
			return null;
		}

		EObject singleContained = null;
		for(EObject contained : parent.eContents()) {
			if (singleContained != null) {
				return null;
			}
			singleContained = contained;
		}
		if (!(singleContained instanceof Condition)) {
			return null;
		}

		return singleContained;
	}
	
}
