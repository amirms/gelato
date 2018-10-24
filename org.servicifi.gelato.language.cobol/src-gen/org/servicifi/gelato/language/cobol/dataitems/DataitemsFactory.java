/**
 */
package org.servicifi.gelato.language.cobol.dataitems;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage
 * @generated
 */
public interface DataitemsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataitemsFactory eINSTANCE = org.servicifi.gelato.language.cobol.dataitems.impl.DataitemsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Picture String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Picture String</em>'.
	 * @generated
	 */
	PictureString createPictureString();

	/**
	 * Returns a new object of class '<em>Renaming Data Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Renaming Data Name</em>'.
	 * @generated
	 */
	RenamingDataName createRenamingDataName();

	/**
	 * Returns a new object of class '<em>Condition Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Name</em>'.
	 * @generated
	 */
	ConditionName createConditionName();

	/**
	 * Returns a new object of class '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global</em>'.
	 * @generated
	 */
	Global createGlobal();

	/**
	 * Returns a new object of class '<em>External</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External</em>'.
	 * @generated
	 */
	External createExternal();

	/**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
	Value createValue();

	/**
	 * Returns a new object of class '<em>Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Usage</em>'.
	 * @generated
	 */
	Usage createUsage();

	/**
	 * Returns a new object of class '<em>Group Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Usage</em>'.
	 * @generated
	 */
	GroupUsage createGroupUsage();

	/**
	 * Returns a new object of class '<em>Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Item</em>'.
	 * @generated
	 */
	DataItem createDataItem();

	/**
	 * Returns a new object of class '<em>Record Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Name</em>'.
	 * @generated
	 */
	RecordName createRecordName();

	/**
	 * Returns a new object of class '<em>Data Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Name</em>'.
	 * @generated
	 */
	DataName createDataName();

	/**
	 * Returns a new object of class '<em>Redefines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Redefines</em>'.
	 * @generated
	 */
	Redefines createRedefines();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataitemsPackage getDataitemsPackage();

} //DataitemsFactory
