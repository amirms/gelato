/**
 */
package org.servicifi.gelato.language.cobol.registers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.registers.RegistersPackage
 * @generated
 */
public interface RegistersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegistersFactory eINSTANCE = org.servicifi.gelato.language.cobol.registers.impl.RegistersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Shift In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift In</em>'.
	 * @generated
	 */
	ShiftIn createShiftIn();

	/**
	 * Returns a new object of class '<em>Shift Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Shift Out</em>'.
	 * @generated
	 */
	ShiftOut createShiftOut();

	/**
	 * Returns a new object of class '<em>Address Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Of</em>'.
	 * @generated
	 */
	AddressOf createAddressOf();

	/**
	 * Returns a new object of class '<em>Length Of</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Length Of</em>'.
	 * @generated
	 */
	LengthOf createLengthOf();

	/**
	 * Returns a new object of class '<em>Return Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return Code</em>'.
	 * @generated
	 */
	ReturnCode createReturnCode();

	/**
	 * Returns a new object of class '<em>When Compiled</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>When Compiled</em>'.
	 * @generated
	 */
	WhenCompiled createWhenCompiled();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RegistersPackage getRegistersPackage();

} //RegistersFactory
