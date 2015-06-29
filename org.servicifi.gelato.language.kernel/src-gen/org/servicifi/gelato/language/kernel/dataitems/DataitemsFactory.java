/**
 */
package org.servicifi.gelato.language.kernel.dataitems;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage
 * @generated
 */
public interface DataitemsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataitemsFactory eINSTANCE = org.servicifi.gelato.language.kernel.dataitems.impl.DataitemsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Item</em>'.
	 * @generated
	 */
	DataItem createDataItem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DataitemsPackage getDataitemsPackage();

} //DataitemsFactory
