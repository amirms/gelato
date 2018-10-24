/**
 */
package org.servicifi.gelato.language.kernel.expressions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage
 * @generated
 */
public interface ExpressionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionsFactory eINSTANCE = org.servicifi.gelato.language.kernel.expressions.impl.ExpressionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Defines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Defines</em>'.
	 * @generated
	 */
	Defines createDefines();

	/**
	 * Returns a new object of class '<em>Post Defines</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Defines</em>'.
	 * @generated
	 */
	PostDefines createPostDefines();

	/**
	 * Returns a new object of class '<em>Affects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Affects</em>'.
	 * @generated
	 */
	Affects createAffects();

	/**
	 * Returns a new object of class '<em>Post Affects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post Affects</em>'.
	 * @generated
	 */
	PostAffects createPostAffects();

	/**
	 * Returns a new object of class '<em>Uses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Uses</em>'.
	 * @generated
	 */
	Uses createUses();

	/**
	 * Returns a new object of class '<em>Pre Uses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pre Uses</em>'.
	 * @generated
	 */
	PreUses createPreUses();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExpressionsPackage getExpressionsPackage();

} //ExpressionsFactory
