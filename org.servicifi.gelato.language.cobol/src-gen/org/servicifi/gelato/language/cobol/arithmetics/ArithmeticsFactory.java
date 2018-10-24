/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage
 * @generated
 */
public interface ArithmeticsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArithmeticsFactory eINSTANCE = org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Additive Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additive Arithmetic Expression</em>'.
	 * @generated
	 */
	AdditiveArithmeticExpression createAdditiveArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Multiplicative Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiplicative Arithmetic Expression</em>'.
	 * @generated
	 */
	MultiplicativeArithmeticExpression createMultiplicativeArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Power Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Power Arithmetic Expression</em>'.
	 * @generated
	 */
	PowerArithmeticExpression createPowerArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Unary Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Arithmetic Expression</em>'.
	 * @generated
	 */
	UnaryArithmeticExpression createUnaryArithmeticExpression();

	/**
	 * Returns a new object of class '<em>Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assignment Expression</em>'.
	 * @generated
	 */
	AssignmentExpression createAssignmentExpression();

	/**
	 * Returns a new object of class '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Expression</em>'.
	 * @generated
	 */
	RangeExpression createRangeExpression();

	/**
	 * Returns a new object of class '<em>Nested Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Arithmetic Expression</em>'.
	 * @generated
	 */
	NestedArithmeticExpression createNestedArithmeticExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ArithmeticsPackage getArithmeticsPackage();

} //ArithmeticsFactory
