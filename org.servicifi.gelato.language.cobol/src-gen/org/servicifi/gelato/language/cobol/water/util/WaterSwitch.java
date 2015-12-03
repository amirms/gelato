/**
 */
package org.servicifi.gelato.language.cobol.water.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.water.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.water.WaterPackage
 * @generated
 */
public class WaterSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WaterPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterSwitch() {
		if (modelPackage == null) {
			modelPackage = WaterPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WaterPackage.INCOMPLETE_ELEMENT: {
				IncompleteElement incompleteElement = (IncompleteElement)theEObject;
				T result = caseIncompleteElement(incompleteElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.IDENTIFICATION_DIVISION_WATER: {
				IdentificationDivisionWater identificationDivisionWater = (IdentificationDivisionWater)theEObject;
				T result = caseIdentificationDivisionWater(identificationDivisionWater);
				if (result == null) result = caseWater(identificationDivisionWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.WATER: {
				Water water = (Water)theEObject;
				T result = caseWater(water);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.PROGRAM_DESCRIPTION: {
				ProgramDescription programDescription = (ProgramDescription)theEObject;
				T result = caseProgramDescription(programDescription);
				if (result == null) result = caseIdentificationDivisionWater(programDescription);
				if (result == null) result = caseWater(programDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.DOT: {
				Dot dot = (Dot)theEObject;
				T result = caseDot(dot);
				if (result == null) result = caseIdentificationDivisionWater(dot);
				if (result == null) result = caseSQLStatementWater(dot);
				if (result == null) result = caseWater(dot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.OBJECT_COMPUTER_PARAGRAPH_WATER: {
				ObjectComputerParagraphWater objectComputerParagraphWater = (ObjectComputerParagraphWater)theEObject;
				T result = caseObjectComputerParagraphWater(objectComputerParagraphWater);
				if (result == null) result = caseWater(objectComputerParagraphWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.OBJECT_COMPUTER_DESCRIPTION: {
				ObjectComputerDescription objectComputerDescription = (ObjectComputerDescription)theEObject;
				T result = caseObjectComputerDescription(objectComputerDescription);
				if (result == null) result = caseObjectComputerParagraphWater(objectComputerDescription);
				if (result == null) result = caseWater(objectComputerDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.PRIORITY_NUMBER: {
				PriorityNumber priorityNumber = (PriorityNumber)theEObject;
				T result = casePriorityNumber(priorityNumber);
				if (result == null) result = caseObjectComputerParagraphWater(priorityNumber);
				if (result == null) result = caseWater(priorityNumber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SELECT_STATEMENT_WATER: {
				SelectStatementWater selectStatementWater = (SelectStatementWater)theEObject;
				T result = caseSelectStatementWater(selectStatementWater);
				if (result == null) result = caseWater(selectStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SELECT_STATEMENT_CLAUSE: {
				SelectStatementClause selectStatementClause = (SelectStatementClause)theEObject;
				T result = caseSelectStatementClause(selectStatementClause);
				if (result == null) result = caseSelectStatementWater(selectStatementClause);
				if (result == null) result = caseWater(selectStatementClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SPECIAL_NAMES_PARAGRAPH_WATER: {
				SpecialNamesParagraphWater specialNamesParagraphWater = (SpecialNamesParagraphWater)theEObject;
				T result = caseSpecialNamesParagraphWater(specialNamesParagraphWater);
				if (result == null) result = caseWater(specialNamesParagraphWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SPECIAL_NAMES_CLAUSE: {
				SpecialNamesClause specialNamesClause = (SpecialNamesClause)theEObject;
				T result = caseSpecialNamesClause(specialNamesClause);
				if (result == null) result = caseSpecialNamesParagraphWater(specialNamesClause);
				if (result == null) result = caseWater(specialNamesClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.FILE_DESCRIPTOR_WATER: {
				FileDescriptorWater fileDescriptorWater = (FileDescriptorWater)theEObject;
				T result = caseFileDescriptorWater(fileDescriptorWater);
				if (result == null) result = caseWater(fileDescriptorWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.FILE_DESCRIPTION: {
				FileDescription fileDescription = (FileDescription)theEObject;
				T result = caseFileDescription(fileDescription);
				if (result == null) result = caseFileDescriptorWater(fileDescription);
				if (result == null) result = caseWater(fileDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.DATA_DESCRIPTOR_WATER: {
				DataDescriptorWater dataDescriptorWater = (DataDescriptorWater)theEObject;
				T result = caseDataDescriptorWater(dataDescriptorWater);
				if (result == null) result = caseWater(dataDescriptorWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.DATA_DESCRIPTION: {
				DataDescription dataDescription = (DataDescription)theEObject;
				T result = caseDataDescription(dataDescription);
				if (result == null) result = caseDataDescriptorWater(dataDescription);
				if (result == null) result = caseWater(dataDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.IO_CONTROL_PARAGRAPH_WATER: {
				IOControlParagraphWater ioControlParagraphWater = (IOControlParagraphWater)theEObject;
				T result = caseIOControlParagraphWater(ioControlParagraphWater);
				if (result == null) result = caseWater(ioControlParagraphWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.IO_CONTROL_DESCRIPTION: {
				IOControlDescription ioControlDescription = (IOControlDescription)theEObject;
				T result = caseIOControlDescription(ioControlDescription);
				if (result == null) result = caseIOControlParagraphWater(ioControlDescription);
				if (result == null) result = caseWater(ioControlDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.REPOSITORY_PARAGRAPH_WATER: {
				RepositoryParagraphWater repositoryParagraphWater = (RepositoryParagraphWater)theEObject;
				T result = caseRepositoryParagraphWater(repositoryParagraphWater);
				if (result == null) result = caseWater(repositoryParagraphWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.REPOSITORY_DESCRIPTION: {
				RepositoryDescription repositoryDescription = (RepositoryDescription)theEObject;
				T result = caseRepositoryDescription(repositoryDescription);
				if (result == null) result = caseRepositoryParagraphWater(repositoryDescription);
				if (result == null) result = caseWater(repositoryDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SQL_STATEMENT_WATER: {
				SQLStatementWater sqlStatementWater = (SQLStatementWater)theEObject;
				T result = caseSQLStatementWater(sqlStatementWater);
				if (result == null) result = caseWater(sqlStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.CICS_STATEMENT_WATER: {
				CICSStatementWater cicsStatementWater = (CICSStatementWater)theEObject;
				T result = caseCICSStatementWater(cicsStatementWater);
				if (result == null) result = caseWater(cicsStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SQL_STATEMENT_TOKEN: {
				SQLStatementToken sqlStatementToken = (SQLStatementToken)theEObject;
				T result = caseSQLStatementToken(sqlStatementToken);
				if (result == null) result = caseSQLStatementWater(sqlStatementToken);
				if (result == null) result = caseWater(sqlStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.CICS_STATEMENT_TOKEN: {
				CICSStatementToken cicsStatementToken = (CICSStatementToken)theEObject;
				T result = caseCICSStatementToken(cicsStatementToken);
				if (result == null) result = caseCICSStatementWater(cicsStatementToken);
				if (result == null) result = caseWater(cicsStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.ACCEPT_STATEMENT_WATER: {
				AcceptStatementWater acceptStatementWater = (AcceptStatementWater)theEObject;
				T result = caseAcceptStatementWater(acceptStatementWater);
				if (result == null) result = caseWater(acceptStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.ACCEPT_STATEMENT_TOKEN: {
				AcceptStatementToken acceptStatementToken = (AcceptStatementToken)theEObject;
				T result = caseAcceptStatementToken(acceptStatementToken);
				if (result == null) result = caseAcceptStatementWater(acceptStatementToken);
				if (result == null) result = caseWater(acceptStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.USE_STATEMENT_WATER: {
				UseStatementWater useStatementWater = (UseStatementWater)theEObject;
				T result = caseUseStatementWater(useStatementWater);
				if (result == null) result = caseWater(useStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.USE_STATEMENT_TOKEN: {
				UseStatementToken useStatementToken = (UseStatementToken)theEObject;
				T result = caseUseStatementToken(useStatementToken);
				if (result == null) result = caseUseStatementWater(useStatementToken);
				if (result == null) result = caseWater(useStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.CLOSE_STATEMENT_WATER: {
				CloseStatementWater closeStatementWater = (CloseStatementWater)theEObject;
				T result = caseCloseStatementWater(closeStatementWater);
				if (result == null) result = caseWater(closeStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.CLOSE_STATEMENT_TOKEN: {
				CloseStatementToken closeStatementToken = (CloseStatementToken)theEObject;
				T result = caseCloseStatementToken(closeStatementToken);
				if (result == null) result = caseCloseStatementWater(closeStatementToken);
				if (result == null) result = caseWater(closeStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.INVOKE_STATEMENT_WATER: {
				InvokeStatementWater invokeStatementWater = (InvokeStatementWater)theEObject;
				T result = caseInvokeStatementWater(invokeStatementWater);
				if (result == null) result = caseWater(invokeStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.INVOKE_STATEMENT_TOKEN: {
				InvokeStatementToken invokeStatementToken = (InvokeStatementToken)theEObject;
				T result = caseInvokeStatementToken(invokeStatementToken);
				if (result == null) result = caseInvokeStatementWater(invokeStatementToken);
				if (result == null) result = caseWater(invokeStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.OPEN_STATEMENT_WATER: {
				OpenStatementWater openStatementWater = (OpenStatementWater)theEObject;
				T result = caseOpenStatementWater(openStatementWater);
				if (result == null) result = caseWater(openStatementWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.OPEN_STATEMENT_TOKEN: {
				OpenStatementToken openStatementToken = (OpenStatementToken)theEObject;
				T result = caseOpenStatementToken(openStatementToken);
				if (result == null) result = caseOpenStatementWater(openStatementToken);
				if (result == null) result = caseWater(openStatementToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SORT_PHRASE_TOKEN: {
				SortPhraseToken sortPhraseToken = (SortPhraseToken)theEObject;
				T result = caseSortPhraseToken(sortPhraseToken);
				if (result == null) result = caseSortPhraseWater(sortPhraseToken);
				if (result == null) result = caseWater(sortPhraseToken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WaterPackage.SORT_PHRASE_WATER: {
				SortPhraseWater sortPhraseWater = (SortPhraseWater)theEObject;
				T result = caseSortPhraseWater(sortPhraseWater);
				if (result == null) result = caseWater(sortPhraseWater);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incomplete Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incomplete Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncompleteElement(IncompleteElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identification Division Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identification Division Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentificationDivisionWater(IdentificationDivisionWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWater(Water object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramDescription(ProgramDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDot(Dot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Computer Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Computer Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComputerParagraphWater(ObjectComputerParagraphWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Computer Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Computer Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComputerDescription(ObjectComputerDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorityNumber(PriorityNumber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectStatementWater(SelectStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Statement Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Statement Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectStatementClause(SelectStatementClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Names Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Names Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialNamesParagraphWater(SpecialNamesParagraphWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Names Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Names Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialNamesClause(SpecialNamesClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Descriptor Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Descriptor Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDescriptorWater(FileDescriptorWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDescription(FileDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Descriptor Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Descriptor Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDescriptorWater(DataDescriptorWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDescription(DataDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlParagraphWater(IOControlParagraphWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlDescription(IOControlDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Paragraph Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Paragraph Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryParagraphWater(RepositoryParagraphWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryDescription(RepositoryDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLStatementWater(SQLStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CICS Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CICS Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCICSStatementWater(CICSStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLStatementToken(SQLStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CICS Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CICS Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCICSStatementToken(CICSStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptStatementWater(AcceptStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptStatementToken(AcceptStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseStatementWater(UseStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseStatementToken(UseStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseStatementWater(CloseStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseStatementToken(CloseStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeStatementWater(InvokeStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvokeStatementToken(InvokeStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStatementWater(OpenStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Statement Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Statement Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenStatementToken(OpenStatementToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Phrase Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Phrase Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortPhraseToken(SortPhraseToken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Phrase Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Phrase Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortPhraseWater(SortPhraseWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WaterSwitch
