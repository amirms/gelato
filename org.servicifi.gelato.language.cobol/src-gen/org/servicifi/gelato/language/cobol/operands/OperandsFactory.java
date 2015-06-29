/**
 */
package org.servicifi.gelato.language.cobol.operands;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage
 * @generated
 */
public interface OperandsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperandsFactory eINSTANCE = org.servicifi.gelato.language.cobol.operands.impl.OperandsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Rounded Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rounded Identifier</em>'.
	 * @generated
	 */
	RoundedIdentifier createRoundedIdentifier();

	/**
	 * Returns a new object of class '<em>Encoding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encoding</em>'.
	 * @generated
	 */
	Encoding createEncoding();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperandsPackage getOperandsPackage();

} //OperandsFactory
