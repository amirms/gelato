/**
 */
package org.servicifi.gelato.language.kernel.dataitems;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory
 * @generated
 */
public interface DataitemsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dataitems";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/kernel/dataitems";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dataitems";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataitemsPackage eINSTANCE = org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.kernel.dataitems.impl.DataItemImpl <em>Data Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.kernel.dataitems.impl.DataItemImpl
	 * @see org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsPackageImpl#getDataItem()
	 * @generated
	 */
	int DATA_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__NAME = ReferencesPackage.REFERENCEABLE_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_FEATURE_COUNT = ReferencesPackage.REFERENCEABLE_ELEMENT_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.kernel.dataitems.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item</em>'.
	 * @see org.servicifi.gelato.language.kernel.dataitems.DataItem
	 * @generated
	 */
	EClass getDataItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataitemsFactory getDataitemsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.kernel.dataitems.impl.DataItemImpl <em>Data Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.kernel.dataitems.impl.DataItemImpl
		 * @see org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsPackageImpl#getDataItem()
		 * @generated
		 */
		EClass DATA_ITEM = eINSTANCE.getDataItem();

	}

} //DataitemsPackage
