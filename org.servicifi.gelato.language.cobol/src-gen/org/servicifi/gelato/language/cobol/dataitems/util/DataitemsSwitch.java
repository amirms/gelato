/**
 */
package org.servicifi.gelato.language.cobol.dataitems.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.NamedElement;

import org.servicifi.gelato.language.cobol.dataitems.*;

import org.servicifi.gelato.language.cobol.references.ReferenceableElement;

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
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage
 * @generated
 */
public class DataitemsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DataitemsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataitemsSwitch() {
		if (modelPackage == null) {
			modelPackage = DataitemsPackage.eINSTANCE;
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
			case DataitemsPackage.PICTURE_STRING: {
				PictureString pictureString = (PictureString)theEObject;
				T result = casePictureString(pictureString);
				if (result == null) result = caseDataItemAttribute(pictureString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.RENAMING_DATA_NAME: {
				RenamingDataName renamingDataName = (RenamingDataName)theEObject;
				T result = caseRenamingDataName(renamingDataName);
				if (result == null) result = caseDataName(renamingDataName);
				if (result == null) result = caseDataItem(renamingDataName);
				if (result == null) result = caseReferenceableElement(renamingDataName);
				if (result == null) result = caseIncompleteElement(renamingDataName);
				if (result == null) result = caseNamedElement(renamingDataName);
				if (result == null) result = caseCommentable(renamingDataName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.CONDITION_NAME: {
				ConditionName conditionName = (ConditionName)theEObject;
				T result = caseConditionName(conditionName);
				if (result == null) result = caseDataItem(conditionName);
				if (result == null) result = caseReferenceableElement(conditionName);
				if (result == null) result = caseIncompleteElement(conditionName);
				if (result == null) result = caseNamedElement(conditionName);
				if (result == null) result = caseCommentable(conditionName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.GLOBAL: {
				Global global = (Global)theEObject;
				T result = caseGlobal(global);
				if (result == null) result = caseDataItemAttribute(global);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.EXTERNAL: {
				External external = (External)theEObject;
				T result = caseExternal(external);
				if (result == null) result = caseDataItemAttribute(external);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.VALUE: {
				Value value = (Value)theEObject;
				T result = caseValue(value);
				if (result == null) result = caseDataItemAttribute(value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.DATA_ITEM_ATTRIBUTE: {
				DataItemAttribute dataItemAttribute = (DataItemAttribute)theEObject;
				T result = caseDataItemAttribute(dataItemAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.USAGE: {
				Usage usage = (Usage)theEObject;
				T result = caseUsage(usage);
				if (result == null) result = caseDataItemAttribute(usage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.GROUP_USAGE: {
				GroupUsage groupUsage = (GroupUsage)theEObject;
				T result = caseGroupUsage(groupUsage);
				if (result == null) result = caseDataItemAttribute(groupUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.DATA_ITEM: {
				DataItem dataItem = (DataItem)theEObject;
				T result = caseDataItem(dataItem);
				if (result == null) result = caseReferenceableElement(dataItem);
				if (result == null) result = caseIncompleteElement(dataItem);
				if (result == null) result = caseNamedElement(dataItem);
				if (result == null) result = caseCommentable(dataItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.RECORD_NAME: {
				RecordName recordName = (RecordName)theEObject;
				T result = caseRecordName(recordName);
				if (result == null) result = caseDataItem(recordName);
				if (result == null) result = caseReferenceableElement(recordName);
				if (result == null) result = caseIncompleteElement(recordName);
				if (result == null) result = caseNamedElement(recordName);
				if (result == null) result = caseCommentable(recordName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.DATA_NAME: {
				DataName dataName = (DataName)theEObject;
				T result = caseDataName(dataName);
				if (result == null) result = caseDataItem(dataName);
				if (result == null) result = caseReferenceableElement(dataName);
				if (result == null) result = caseIncompleteElement(dataName);
				if (result == null) result = caseNamedElement(dataName);
				if (result == null) result = caseCommentable(dataName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DataitemsPackage.REDEFINES: {
				Redefines redefines = (Redefines)theEObject;
				T result = caseRedefines(redefines);
				if (result == null) result = caseDataItemAttribute(redefines);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Picture String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Picture String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePictureString(PictureString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Renaming Data Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Renaming Data Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenamingDataName(RenamingDataName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionName(ConditionName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobal(Global object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal(External object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItemAttribute(DataItemAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsage(Usage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupUsage(GroupUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataItem(DataItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordName(RecordName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataName(DataName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefines</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefines</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefines(Redefines object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceableElement(ReferenceableElement object) {
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

} //DataitemsSwitch
