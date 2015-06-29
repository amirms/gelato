/**
 */
package org.servicifi.gelato.language.cobol.paragraphs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.labels.Procedure;

import org.servicifi.gelato.language.cobol.paragraphs.*;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

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
 * @see org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage
 * @generated
 */
public class ParagraphsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ParagraphsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParagraphsSwitch() {
		if (modelPackage == null) {
			modelPackage = ParagraphsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case ParagraphsPackage.PARAGRAPH: {
				Paragraph paragraph = (Paragraph)theEObject;
				T result = caseParagraph(paragraph);
				if (result == null) result = caseNamedElement(paragraph);
				if (result == null) result = caseProcedure(paragraph);
				if (result == null) result = caseCommentable(paragraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH: {
				SourceComputerParagraph sourceComputerParagraph = (SourceComputerParagraph)theEObject;
				T result = caseSourceComputerParagraph(sourceComputerParagraph);
				if (result == null) result = caseConfigurationSectionParagraph(sourceComputerParagraph);
				if (result == null) result = caseParagraph(sourceComputerParagraph);
				if (result == null) result = caseNamedElement(sourceComputerParagraph);
				if (result == null) result = caseProcedure(sourceComputerParagraph);
				if (result == null) result = caseCommentable(sourceComputerParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH: {
				ObjectComputerParagraph objectComputerParagraph = (ObjectComputerParagraph)theEObject;
				T result = caseObjectComputerParagraph(objectComputerParagraph);
				if (result == null) result = caseConfigurationSectionParagraph(objectComputerParagraph);
				if (result == null) result = caseIncompleteElement(objectComputerParagraph);
				if (result == null) result = caseParagraph(objectComputerParagraph);
				if (result == null) result = caseNamedElement(objectComputerParagraph);
				if (result == null) result = caseProcedure(objectComputerParagraph);
				if (result == null) result = caseCommentable(objectComputerParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.FILE_CONTROL_PARAGRAPH: {
				FileControlParagraph fileControlParagraph = (FileControlParagraph)theEObject;
				T result = caseFileControlParagraph(fileControlParagraph);
				if (result == null) result = caseIOSectionParagraph(fileControlParagraph);
				if (result == null) result = caseParagraph(fileControlParagraph);
				if (result == null) result = caseNamedElement(fileControlParagraph);
				if (result == null) result = caseProcedure(fileControlParagraph);
				if (result == null) result = caseCommentable(fileControlParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.IO_CONTROL_PARAGRAPH: {
				IOControlParagraph ioControlParagraph = (IOControlParagraph)theEObject;
				T result = caseIOControlParagraph(ioControlParagraph);
				if (result == null) result = caseIOSectionParagraph(ioControlParagraph);
				if (result == null) result = caseIncompleteElement(ioControlParagraph);
				if (result == null) result = caseParagraph(ioControlParagraph);
				if (result == null) result = caseNamedElement(ioControlParagraph);
				if (result == null) result = caseProcedure(ioControlParagraph);
				if (result == null) result = caseCommentable(ioControlParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.CONFIGURATION_SECTION_PARAGRAPH: {
				ConfigurationSectionParagraph configurationSectionParagraph = (ConfigurationSectionParagraph)theEObject;
				T result = caseConfigurationSectionParagraph(configurationSectionParagraph);
				if (result == null) result = caseParagraph(configurationSectionParagraph);
				if (result == null) result = caseNamedElement(configurationSectionParagraph);
				if (result == null) result = caseProcedure(configurationSectionParagraph);
				if (result == null) result = caseCommentable(configurationSectionParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.IO_SECTION_PARAGRAPH: {
				IOSectionParagraph ioSectionParagraph = (IOSectionParagraph)theEObject;
				T result = caseIOSectionParagraph(ioSectionParagraph);
				if (result == null) result = caseParagraph(ioSectionParagraph);
				if (result == null) result = caseNamedElement(ioSectionParagraph);
				if (result == null) result = caseProcedure(ioSectionParagraph);
				if (result == null) result = caseCommentable(ioSectionParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH: {
				SpecialNamesParagraph specialNamesParagraph = (SpecialNamesParagraph)theEObject;
				T result = caseSpecialNamesParagraph(specialNamesParagraph);
				if (result == null) result = caseConfigurationSectionParagraph(specialNamesParagraph);
				if (result == null) result = caseParagraph(specialNamesParagraph);
				if (result == null) result = caseNamedElement(specialNamesParagraph);
				if (result == null) result = caseProcedure(specialNamesParagraph);
				if (result == null) result = caseCommentable(specialNamesParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.REPOSITORY_PARAGRAPH: {
				RepositoryParagraph repositoryParagraph = (RepositoryParagraph)theEObject;
				T result = caseRepositoryParagraph(repositoryParagraph);
				if (result == null) result = caseConfigurationSectionParagraph(repositoryParagraph);
				if (result == null) result = caseIncompleteElement(repositoryParagraph);
				if (result == null) result = caseParagraph(repositoryParagraph);
				if (result == null) result = caseNamedElement(repositoryParagraph);
				if (result == null) result = caseProcedure(repositoryParagraph);
				if (result == null) result = caseCommentable(repositoryParagraph);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ParagraphsPackage.DEBUGGING_MODE: {
				DebuggingMode debuggingMode = (DebuggingMode)theEObject;
				T result = caseDebuggingMode(debuggingMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Computer Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Computer Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceComputerParagraph(SourceComputerParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Computer Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Computer Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComputerParagraph(ObjectComputerParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Control Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Control Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileControlParagraph(FileControlParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Control Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Control Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOControlParagraph(IOControlParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Section Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Section Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSectionParagraph(ConfigurationSectionParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Section Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Section Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOSectionParagraph(IOSectionParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Names Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Names Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialNamesParagraph(SpecialNamesParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repository Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repository Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepositoryParagraph(RepositoryParagraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Debugging Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Debugging Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDebuggingMode(DebuggingMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommentable(Commentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
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

} //ParagraphsSwitch
