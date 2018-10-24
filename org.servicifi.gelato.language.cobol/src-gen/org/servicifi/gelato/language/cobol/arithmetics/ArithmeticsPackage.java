/**
 */
package org.servicifi.gelato.language.cobol.arithmetics;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;

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
 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsFactory
 * @model kind="package"
 * @generated
 */
public interface ArithmeticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "arithmetics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/arithmetics";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "arithmetics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ArithmeticsPackage eINSTANCE = org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getArithmeticExpression()
	 * @generated
	 */
	int ARITHMETIC_EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_EXPRESSION_FEATURE_COUNT = ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionChildImpl <em>Range Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getRangeExpressionChild()
	 * @generated
	 */
	int RANGE_EXPRESSION_CHILD = 11;

	/**
	 * The number of structural features of the '<em>Range Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_CHILD_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionImpl <em>Additive Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getAdditiveArithmeticExpression()
	 * @generated
	 */
	int ADDITIVE_ARITHMETIC_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_ARITHMETIC_EXPRESSION__CHILDREN = RANGE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Additive Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_ARITHMETIC_EXPRESSION__ADDITIVE_OPERATORS = RANGE_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Additive Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_ARITHMETIC_EXPRESSION_FEATURE_COUNT = RANGE_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionChildImpl <em>Additive Arithmetic Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getAdditiveArithmeticExpressionChild()
	 * @generated
	 */
	int ADDITIVE_ARITHMETIC_EXPRESSION_CHILD = 1;

	/**
	 * The number of structural features of the '<em>Additive Arithmetic Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT = RANGE_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionImpl <em>Multiplicative Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getMultiplicativeArithmeticExpression()
	 * @generated
	 */
	int MULTIPLICATIVE_ARITHMETIC_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN = ADDITIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Multiplicative Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS = ADDITIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiplicative Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_ARITHMETIC_EXPRESSION_FEATURE_COUNT = ADDITIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionChildImpl <em>Multiplicative Arithmetic Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getMultiplicativeArithmeticExpressionChild()
	 * @generated
	 */
	int MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD = 3;

	/**
	 * The number of structural features of the '<em>Multiplicative Arithmetic Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT = ADDITIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionImpl <em>Power Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getPowerArithmeticExpression()
	 * @generated
	 */
	int POWER_ARITHMETIC_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_ARITHMETIC_EXPRESSION__CHILDREN = MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Power Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_ARITHMETIC_EXPRESSION_FEATURE_COUNT = MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionChildImpl <em>Power Arithmetic Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getPowerArithmeticExpressionChild()
	 * @generated
	 */
	int POWER_ARITHMETIC_EXPRESSION_CHILD = 5;

	/**
	 * The number of structural features of the '<em>Power Arithmetic Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT = MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionChildImpl <em>Unary Arithmetic Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getUnaryArithmeticExpressionChild()
	 * @generated
	 */
	int UNARY_ARITHMETIC_EXPRESSION_CHILD = 6;

	/**
	 * The number of structural features of the '<em>Unary Arithmetic Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT = POWER_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionImpl <em>Unary Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getUnaryArithmeticExpression()
	 * @generated
	 */
	int UNARY_ARITHMETIC_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ARITHMETIC_EXPRESSION__CHILD = POWER_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unary Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR = POWER_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ARITHMETIC_EXPRESSION_FEATURE_COUNT = POWER_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.PrimaryExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getPrimaryExpression()
	 * @generated
	 */
	int PRIMARY_EXPRESSION = 8;

	/**
	 * The number of structural features of the '<em>Primary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_EXPRESSION_FEATURE_COUNT = UNARY_ARITHMETIC_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getAssignmentExpression()
	 * @generated
	 */
	int ASSIGNMENT_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Assignment Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__CHILDREN = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Assignment Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_EXPRESSION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getRangeExpression()
	 * @generated
	 */
	int RANGE_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__CHILDREN = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Through Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__THROUGH_OPERATOR = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_FEATURE_COUNT = ARITHMETIC_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.NestedArithmeticExpressionImpl <em>Nested Arithmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.NestedArithmeticExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getNestedArithmeticExpression()
	 * @generated
	 */
	int NESTED_ARITHMETIC_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ARITHMETIC_EXPRESSION__EXPRESSION = PRIMARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Arithmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ARITHMETIC_EXPRESSION_FEATURE_COUNT = PRIMARY_EXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression <em>Additive Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Arithmetic Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression
	 * @generated
	 */
	EClass getAdditiveArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression#getChildren()
	 * @see #getAdditiveArithmeticExpression()
	 * @generated
	 */
	EReference getAdditiveArithmeticExpression_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression#getAdditiveOperators <em>Additive Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additive Operators</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression#getAdditiveOperators()
	 * @see #getAdditiveArithmeticExpression()
	 * @generated
	 */
	EReference getAdditiveArithmeticExpression_AdditiveOperators();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild <em>Additive Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Arithmetic Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild
	 * @generated
	 */
	EClass getAdditiveArithmeticExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression <em>Multiplicative Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Arithmetic Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression
	 * @generated
	 */
	EClass getMultiplicativeArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression#getChildren()
	 * @see #getMultiplicativeArithmeticExpression()
	 * @generated
	 */
	EReference getMultiplicativeArithmeticExpression_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression#getMultiplicativeOperators <em>Multiplicative Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multiplicative Operators</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression#getMultiplicativeOperators()
	 * @see #getMultiplicativeArithmeticExpression()
	 * @generated
	 */
	EReference getMultiplicativeArithmeticExpression_MultiplicativeOperators();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild <em>Multiplicative Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Arithmetic Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild
	 * @generated
	 */
	EClass getMultiplicativeArithmeticExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression <em>Power Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Arithmetic Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression
	 * @generated
	 */
	EClass getPowerArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression#getChildren()
	 * @see #getPowerArithmeticExpression()
	 * @generated
	 */
	EReference getPowerArithmeticExpression_Children();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild <em>Power Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Arithmetic Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild
	 * @generated
	 */
	EClass getPowerArithmeticExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild <em>Unary Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Arithmetic Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild
	 * @generated
	 */
	EClass getUnaryArithmeticExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression <em>Unary Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Arithmetic Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression
	 * @generated
	 */
	EClass getUnaryArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getChild()
	 * @see #getUnaryArithmeticExpression()
	 * @generated
	 */
	EReference getUnaryArithmeticExpression_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getUnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unary Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression#getUnaryOperator()
	 * @see #getUnaryArithmeticExpression()
	 * @generated
	 */
	EReference getUnaryArithmeticExpression_UnaryOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression
	 * @generated
	 */
	EClass getPrimaryExpression();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression
	 * @generated
	 */
	EClass getAssignmentExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getAssignmentOperator <em>Assignment Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignment Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getAssignmentOperator()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_AssignmentOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getChildren()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression#getValue()
	 * @see #getAssignmentExpression()
	 * @generated
	 */
	EReference getAssignmentExpression_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.RangeExpression
	 * @generated
	 */
	EClass getRangeExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.arithmetics.RangeExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.RangeExpression#getChildren()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.arithmetics.RangeExpression#getThroughOperator <em>Through Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Through Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.RangeExpression#getThroughOperator()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EReference getRangeExpression_ThroughOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild <em>Range Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild
	 * @generated
	 */
	EClass getRangeExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression <em>Nested Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Arithmetic Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression
	 * @generated
	 */
	EClass getNestedArithmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression#getExpression()
	 * @see #getNestedArithmeticExpression()
	 * @generated
	 */
	EReference getNestedArithmeticExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression
	 * @generated
	 */
	EClass getArithmeticExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ArithmeticsFactory getArithmeticsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionImpl <em>Additive Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getAdditiveArithmeticExpression()
		 * @generated
		 */
		EClass ADDITIVE_ARITHMETIC_EXPRESSION = eINSTANCE.getAdditiveArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_ARITHMETIC_EXPRESSION__CHILDREN = eINSTANCE.getAdditiveArithmeticExpression_Children();

		/**
		 * The meta object literal for the '<em><b>Additive Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIVE_ARITHMETIC_EXPRESSION__ADDITIVE_OPERATORS = eINSTANCE.getAdditiveArithmeticExpression_AdditiveOperators();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionChildImpl <em>Additive Arithmetic Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.AdditiveArithmeticExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getAdditiveArithmeticExpressionChild()
		 * @generated
		 */
		EClass ADDITIVE_ARITHMETIC_EXPRESSION_CHILD = eINSTANCE.getAdditiveArithmeticExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionImpl <em>Multiplicative Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getMultiplicativeArithmeticExpression()
		 * @generated
		 */
		EClass MULTIPLICATIVE_ARITHMETIC_EXPRESSION = eINSTANCE.getMultiplicativeArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN = eINSTANCE.getMultiplicativeArithmeticExpression_Children();

		/**
		 * The meta object literal for the '<em><b>Multiplicative Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS = eINSTANCE.getMultiplicativeArithmeticExpression_MultiplicativeOperators();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionChildImpl <em>Multiplicative Arithmetic Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.MultiplicativeArithmeticExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getMultiplicativeArithmeticExpressionChild()
		 * @generated
		 */
		EClass MULTIPLICATIVE_ARITHMETIC_EXPRESSION_CHILD = eINSTANCE.getMultiplicativeArithmeticExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionImpl <em>Power Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getPowerArithmeticExpression()
		 * @generated
		 */
		EClass POWER_ARITHMETIC_EXPRESSION = eINSTANCE.getPowerArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER_ARITHMETIC_EXPRESSION__CHILDREN = eINSTANCE.getPowerArithmeticExpression_Children();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionChildImpl <em>Power Arithmetic Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.PowerArithmeticExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getPowerArithmeticExpressionChild()
		 * @generated
		 */
		EClass POWER_ARITHMETIC_EXPRESSION_CHILD = eINSTANCE.getPowerArithmeticExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionChildImpl <em>Unary Arithmetic Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getUnaryArithmeticExpressionChild()
		 * @generated
		 */
		EClass UNARY_ARITHMETIC_EXPRESSION_CHILD = eINSTANCE.getUnaryArithmeticExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionImpl <em>Unary Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.UnaryArithmeticExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getUnaryArithmeticExpression()
		 * @generated
		 */
		EClass UNARY_ARITHMETIC_EXPRESSION = eINSTANCE.getUnaryArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_ARITHMETIC_EXPRESSION__CHILD = eINSTANCE.getUnaryArithmeticExpression_Child();

		/**
		 * The meta object literal for the '<em><b>Unary Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR = eINSTANCE.getUnaryArithmeticExpression_UnaryOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.PrimaryExpressionImpl <em>Primary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.PrimaryExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getPrimaryExpression()
		 * @generated
		 */
		EClass PRIMARY_EXPRESSION = eINSTANCE.getPrimaryExpression();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl <em>Assignment Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.AssignmentExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getAssignmentExpression()
		 * @generated
		 */
		EClass ASSIGNMENT_EXPRESSION = eINSTANCE.getAssignmentExpression();

		/**
		 * The meta object literal for the '<em><b>Assignment Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR = eINSTANCE.getAssignmentExpression_AssignmentOperator();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__CHILDREN = eINSTANCE.getAssignmentExpression_Children();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_EXPRESSION__VALUE = eINSTANCE.getAssignmentExpression_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getRangeExpression()
		 * @generated
		 */
		EClass RANGE_EXPRESSION = eINSTANCE.getRangeExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__CHILDREN = eINSTANCE.getRangeExpression_Children();

		/**
		 * The meta object literal for the '<em><b>Through Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_EXPRESSION__THROUGH_OPERATOR = eINSTANCE.getRangeExpression_ThroughOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionChildImpl <em>Range Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.RangeExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getRangeExpressionChild()
		 * @generated
		 */
		EClass RANGE_EXPRESSION_CHILD = eINSTANCE.getRangeExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.NestedArithmeticExpressionImpl <em>Nested Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.NestedArithmeticExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getNestedArithmeticExpression()
		 * @generated
		 */
		EClass NESTED_ARITHMETIC_EXPRESSION = eINSTANCE.getNestedArithmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ARITHMETIC_EXPRESSION__EXPRESSION = eINSTANCE.getNestedArithmeticExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticExpressionImpl <em>Arithmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.arithmetics.impl.ArithmeticsPackageImpl#getArithmeticExpression()
		 * @generated
		 */
		EClass ARITHMETIC_EXPRESSION = eINSTANCE.getArithmeticExpression();

	}

} //ArithmeticsPackage
