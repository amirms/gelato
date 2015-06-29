/**
 */
package org.servicifi.gelato.language.cobol.environments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage
 * @generated
 */
public interface EnvironmentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentsFactory eINSTANCE = org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>System Logical Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Logical Input</em>'.
	 * @generated
	 */
	SystemLogicalInput createSystemLogicalInput();

	/**
	 * Returns a new object of class '<em>UPSI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UPSI</em>'.
	 * @generated
	 */
	UPSI createUPSI();

	/**
	 * Returns a new object of class '<em>System Logical Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Logical Output</em>'.
	 * @generated
	 */
	SystemLogicalOutput createSystemLogicalOutput();

	/**
	 * Returns a new object of class '<em>System Punch Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>System Punch Device</em>'.
	 * @generated
	 */
	SystemPunchDevice createSystemPunchDevice();

	/**
	 * Returns a new object of class '<em>Console</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Console</em>'.
	 * @generated
	 */
	Console createConsole();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>Advanced Function Printing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Advanced Function Printing</em>'.
	 * @generated
	 */
	AdvancedFunctionPrinting createAdvancedFunctionPrinting();

	/**
	 * Returns a new object of class '<em>Suppress Spacing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Suppress Spacing</em>'.
	 * @generated
	 */
	SuppressSpacing createSuppressSpacing();

	/**
	 * Returns a new object of class '<em>Pocket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pocket</em>'.
	 * @generated
	 */
	Pocket createPocket();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnvironmentsPackage getEnvironmentsPackage();

} //EnvironmentsFactory
