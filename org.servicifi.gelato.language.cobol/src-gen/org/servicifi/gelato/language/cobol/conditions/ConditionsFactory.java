/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsPackage
 * @generated
 */
public interface ConditionsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConditionsFactory eINSTANCE = org.servicifi.gelato.language.cobol.conditions.impl.ConditionsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Conditional Or Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Or Expression</em>'.
	 * @generated
	 */
	ConditionalOrExpression createConditionalOrExpression();

	/**
	 * Returns a new object of class '<em>Negated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negated Conditional Expression</em>'.
	 * @generated
	 */
	NegatedConditionalExpression createNegatedConditionalExpression();

	/**
	 * Returns a new object of class '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relational Expression</em>'.
	 * @generated
	 */
	RelationalExpression createRelationalExpression();

	/**
	 * Returns a new object of class '<em>Expression List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression List</em>'.
	 * @generated
	 */
	ExpressionList createExpressionList();

	/**
	 * Returns a new object of class '<em>Conditional And Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional And Expression</em>'.
	 * @generated
	 */
	ConditionalAndExpression createConditionalAndExpression();

	/**
	 * Returns a new object of class '<em>Abbreviated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abbreviated Conditional Expression</em>'.
	 * @generated
	 */
	AbbreviatedConditionalExpression createAbbreviatedConditionalExpression();

	/**
	 * Returns a new object of class '<em>Negated Abbreviated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negated Abbreviated Conditional Expression</em>'.
	 * @generated
	 */
	NegatedAbbreviatedConditionalExpression createNegatedAbbreviatedConditionalExpression();

	/**
	 * Returns a new object of class '<em>Abbreviated Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abbreviated Relational Expression</em>'.
	 * @generated
	 */
	AbbreviatedRelationalExpression createAbbreviatedRelationalExpression();

	/**
	 * Returns a new object of class '<em>Nested Abbreviated Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Abbreviated Conditional Expression</em>'.
	 * @generated
	 */
	NestedAbbreviatedConditionalExpression createNestedAbbreviatedConditionalExpression();

	/**
	 * Returns a new object of class '<em>Sign Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sign Condition</em>'.
	 * @generated
	 */
	SignCondition createSignCondition();

	/**
	 * Returns a new object of class '<em>Class Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Condition</em>'.
	 * @generated
	 */
	ClassCondition createClassCondition();

	/**
	 * Returns a new object of class '<em>Nested Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Condition</em>'.
	 * @generated
	 */
	NestedCondition createNestedCondition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConditionsPackage getConditionsPackage();

} //ConditionsFactory
