/**
 */
package org.servicifi.gelato.language.cobol.sections.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.labels.Procedure;

import org.servicifi.gelato.language.cobol.sections.*;

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
 * @see org.servicifi.gelato.language.cobol.sections.SectionsPackage
 * @generated
 */
public class SectionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SectionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionsSwitch() {
		if (modelPackage == null) {
			modelPackage = SectionsPackage.eINSTANCE;
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
			case SectionsPackage.SECTION: {
				Section section = (Section)theEObject;
				T result = caseSection(section);
				if (result == null) result = caseNamedElement(section);
				if (result == null) result = caseProcedure(section);
				if (result == null) result = caseCommentable(section);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.WORKING_STORAGE_SECTION: {
				WorkingStorageSection workingStorageSection = (WorkingStorageSection)theEObject;
				T result = caseWorkingStorageSection(workingStorageSection);
				if (result == null) result = caseDataDivisionSection(workingStorageSection);
				if (result == null) result = caseSection(workingStorageSection);
				if (result == null) result = caseNamedElement(workingStorageSection);
				if (result == null) result = caseProcedure(workingStorageSection);
				if (result == null) result = caseCommentable(workingStorageSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.LOCAL_STORAGE_SECTION: {
				LocalStorageSection localStorageSection = (LocalStorageSection)theEObject;
				T result = caseLocalStorageSection(localStorageSection);
				if (result == null) result = caseDataDivisionSection(localStorageSection);
				if (result == null) result = caseSection(localStorageSection);
				if (result == null) result = caseNamedElement(localStorageSection);
				if (result == null) result = caseProcedure(localStorageSection);
				if (result == null) result = caseCommentable(localStorageSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.LINKAGE_STORAGE_SECTION: {
				LinkageStorageSection linkageStorageSection = (LinkageStorageSection)theEObject;
				T result = caseLinkageStorageSection(linkageStorageSection);
				if (result == null) result = caseDataDivisionSection(linkageStorageSection);
				if (result == null) result = caseSection(linkageStorageSection);
				if (result == null) result = caseNamedElement(linkageStorageSection);
				if (result == null) result = caseProcedure(linkageStorageSection);
				if (result == null) result = caseCommentable(linkageStorageSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.IO_SECTION: {
				IOSection ioSection = (IOSection)theEObject;
				T result = caseIOSection(ioSection);
				if (result == null) result = caseEnvironmentDivisionSection(ioSection);
				if (result == null) result = caseSection(ioSection);
				if (result == null) result = caseNamedElement(ioSection);
				if (result == null) result = caseProcedure(ioSection);
				if (result == null) result = caseCommentable(ioSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.CONFIGURATION_SECTION: {
				ConfigurationSection configurationSection = (ConfigurationSection)theEObject;
				T result = caseConfigurationSection(configurationSection);
				if (result == null) result = caseEnvironmentDivisionSection(configurationSection);
				if (result == null) result = caseSection(configurationSection);
				if (result == null) result = caseNamedElement(configurationSection);
				if (result == null) result = caseProcedure(configurationSection);
				if (result == null) result = caseCommentable(configurationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.ENVIRONMENT_DIVISION_SECTION: {
				EnvironmentDivisionSection environmentDivisionSection = (EnvironmentDivisionSection)theEObject;
				T result = caseEnvironmentDivisionSection(environmentDivisionSection);
				if (result == null) result = caseSection(environmentDivisionSection);
				if (result == null) result = caseNamedElement(environmentDivisionSection);
				if (result == null) result = caseProcedure(environmentDivisionSection);
				if (result == null) result = caseCommentable(environmentDivisionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.DATA_DIVISION_SECTION: {
				DataDivisionSection dataDivisionSection = (DataDivisionSection)theEObject;
				T result = caseDataDivisionSection(dataDivisionSection);
				if (result == null) result = caseSection(dataDivisionSection);
				if (result == null) result = caseNamedElement(dataDivisionSection);
				if (result == null) result = caseProcedure(dataDivisionSection);
				if (result == null) result = caseCommentable(dataDivisionSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.FILE_SECTION: {
				FileSection fileSection = (FileSection)theEObject;
				T result = caseFileSection(fileSection);
				if (result == null) result = caseDataDivisionSection(fileSection);
				if (result == null) result = caseSection(fileSection);
				if (result == null) result = caseNamedElement(fileSection);
				if (result == null) result = caseProcedure(fileSection);
				if (result == null) result = caseCommentable(fileSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SectionsPackage.DECLARATIVE_SECTION: {
				DeclarativeSection declarativeSection = (DeclarativeSection)theEObject;
				T result = caseDeclarativeSection(declarativeSection);
				if (result == null) result = caseSection(declarativeSection);
				if (result == null) result = caseNamedElement(declarativeSection);
				if (result == null) result = caseProcedure(declarativeSection);
				if (result == null) result = caseCommentable(declarativeSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Working Storage Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Working Storage Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkingStorageSection(WorkingStorageSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Storage Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Storage Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalStorageSection(LocalStorageSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkage Storage Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkage Storage Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkageStorageSection(LinkageStorageSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOSection(IOSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSection(ConfigurationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Division Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Division Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentDivisionSection(EnvironmentDivisionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Division Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Division Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDivisionSection(DataDivisionSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSection(FileSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declarative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declarative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclarativeSection(DeclarativeSection object) {
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

} //SectionsSwitch
