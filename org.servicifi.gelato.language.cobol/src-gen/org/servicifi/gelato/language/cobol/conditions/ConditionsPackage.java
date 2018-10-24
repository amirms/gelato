/**
 */
package org.servicifi.gelato.language.cobol.conditions;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.servicifi.gelato.language.cobol.conditions.ConditionsFactory
 * @model kind="package"
 * @generated
 */
public interface ConditionsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conditions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/conditions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conditions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConditionsPackage eINSTANCE = org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalOrExpression()
	 * @generated
	 */
	int CONDITIONAL_OR_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OR_EXPRESSION__CHILDREN = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Logical Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Or Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OR_EXPRESSION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionChildImpl <em>Conditional Or Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalOrExpressionChild()
	 * @generated
	 */
	int CONDITIONAL_OR_EXPRESSION_CHILD = 2;

	/**
	 * The number of structural features of the '<em>Conditional Or Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionChildImpl <em>Conditional And Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalAndExpressionChild()
	 * @generated
	 */
	int CONDITIONAL_AND_EXPRESSION_CHILD = 8;

	/**
	 * The number of structural features of the '<em>Conditional And Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionImpl <em>Negated Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedConditionalExpression()
	 * @generated
	 */
	int NEGATED_CONDITIONAL_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CONDITIONAL_EXPRESSION__CHILD = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Negated Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CONDITIONAL_EXPRESSION_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionChildImpl <em>Negated Conditional Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedConditionalExpressionChild()
	 * @generated
	 */
	int NEGATED_CONDITIONAL_EXPRESSION_CHILD = 4;

	/**
	 * The number of structural features of the '<em>Negated Conditional Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.SimpleConditionChildImpl <em>Simple Condition Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.SimpleConditionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getSimpleConditionChild()
	 * @generated
	 */
	int SIMPLE_CONDITION_CHILD = 5;

	/**
	 * The number of structural features of the '<em>Simple Condition Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CONDITION_CHILD_FEATURE_COUNT = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__CHILDREN = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__NEGATE_OPERATOR = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__IS = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ExpressionListImpl <em>Expression List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ExpressionListImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getExpressionList()
	 * @generated
	 */
	int EXPRESSION_LIST = 7;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST__EXPRESSIONS = 0;

	/**
	 * The number of structural features of the '<em>Expression List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalAndExpression()
	 * @generated
	 */
	int CONDITIONAL_AND_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_AND_EXPRESSION__CHILDREN = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Conditional And Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_AND_EXPRESSION_FEATURE_COUNT = CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionImpl <em>Abbreviated Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedConditionalExpression()
	 * @generated
	 */
	int ABBREVIATED_CONDITIONAL_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_CONDITIONAL_EXPRESSION__CHILDREN = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abbreviated Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_CONDITIONAL_EXPRESSION_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionChildImpl <em>Abbreviated Conditional Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedConditionalExpressionChild()
	 * @generated
	 */
	int ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD = 11;

	/**
	 * The number of structural features of the '<em>Abbreviated Conditional Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT = CONDITIONAL_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionImpl <em>Negated Abbreviated Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedAbbreviatedConditionalExpression()
	 * @generated
	 */
	int NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__CHILD = ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR = ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Negated Abbreviated Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_FEATURE_COUNT = ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionChildImpl <em>Negated Abbreviated Conditional Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedAbbreviatedConditionalExpressionChild()
	 * @generated
	 */
	int NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD = 13;

	/**
	 * The number of structural features of the '<em>Negated Abbreviated Conditional Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT = ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionImpl <em>Abbreviated Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedRelationalExpression()
	 * @generated
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Relational Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION__CHILD = NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION__NEGATE_OPERATOR = NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION__IS = NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abbreviated Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION_FEATURE_COUNT = NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionChildImpl <em>Abbreviated Relational Expression Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionChildImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedRelationalExpressionChild()
	 * @generated
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION_CHILD = 18;

	/**
	 * The number of structural features of the '<em>Abbreviated Relational Expression Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBREVIATED_RELATIONAL_EXPRESSION_CHILD_FEATURE_COUNT = NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NestedAbbreviatedConditionalExpressionImpl <em>Nested Abbreviated Conditional Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.NestedAbbreviatedConditionalExpressionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNestedAbbreviatedConditionalExpression()
	 * @generated
	 */
	int NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION = ABBREVIATED_RELATIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST = ABBREVIATED_RELATIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nested Abbreviated Conditional Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION_FEATURE_COUNT = ABBREVIATED_RELATIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl <em>Sign Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getSignCondition()
	 * @generated
	 */
	int SIGN_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CONDITION__CHILD = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sign Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CONDITION__SIGN_OPERATOR = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CONDITION__NEGATE_OPERATOR = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CONDITION__IS = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sign Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_CONDITION_FEATURE_COUNT = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl <em>Class Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getClassCondition()
	 * @generated
	 */
	int CLASS_CONDITION = 17;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONDITION__CHILD = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONDITION__CLASS_OPERATOR = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Negate Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONDITION__NEGATE_OPERATOR = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONDITION__IS = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Class Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_CONDITION_FEATURE_COUNT = NEGATED_CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NestedConditionImpl <em>Nested Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.NestedConditionImpl
	 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNestedCondition()
	 * @generated
	 */
	int NESTED_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONDITION__CONDITION = SIMPLE_CONDITION_CHILD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nested Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_CONDITION_FEATURE_COUNT = SIMPLE_CONDITION_CHILD_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression <em>Conditional Or Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Or Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression
	 * @generated
	 */
	EClass getConditionalOrExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression#getChildren()
	 * @see #getConditionalOrExpression()
	 * @generated
	 */
	EReference getConditionalOrExpression_Children();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression#getLogicalOperators <em>Logical Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logical Operators</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression#getLogicalOperators()
	 * @see #getConditionalOrExpression()
	 * @generated
	 */
	EReference getConditionalOrExpression_LogicalOperators();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Or Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild
	 * @generated
	 */
	EClass getConditionalOrExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression <em>Negated Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Conditional Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression
	 * @generated
	 */
	EClass getNegatedConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression#getChild()
	 * @see #getNegatedConditionalExpression()
	 * @generated
	 */
	EReference getNegatedConditionalExpression_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression#getNegateOperator <em>Negate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression#getNegateOperator()
	 * @see #getNegatedConditionalExpression()
	 * @generated
	 */
	EReference getNegatedConditionalExpression_NegateOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild <em>Negated Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Conditional Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild
	 * @generated
	 */
	EClass getNegatedConditionalExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild <em>Simple Condition Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Condition Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild
	 * @generated
	 */
	EClass getSimpleConditionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getChildren()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Children();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relational Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getRelationalOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_RelationalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getNegateOperator <em>Negate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getNegateOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_NegateOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.RelationalExpression#getIs()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EReference getRelationalExpression_Is();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.ExpressionList <em>Expression List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression List</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ExpressionList
	 * @generated
	 */
	EClass getExpressionList();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.conditions.ExpressionList#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ExpressionList#getExpressions()
	 * @see #getExpressionList()
	 * @generated
	 */
	EReference getExpressionList_Expressions();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional And Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild
	 * @generated
	 */
	EClass getConditionalAndExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression <em>Conditional And Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional And Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression
	 * @generated
	 */
	EClass getConditionalAndExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression#getChildren()
	 * @see #getConditionalAndExpression()
	 * @generated
	 */
	EReference getConditionalAndExpression_Children();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression <em>Abbreviated Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviated Conditional Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression
	 * @generated
	 */
	EClass getAbbreviatedConditionalExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression#getChildren()
	 * @see #getAbbreviatedConditionalExpression()
	 * @generated
	 */
	EReference getAbbreviatedConditionalExpression_Children();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild <em>Abbreviated Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviated Conditional Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild
	 * @generated
	 */
	EClass getAbbreviatedConditionalExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression <em>Negated Abbreviated Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Abbreviated Conditional Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression
	 * @generated
	 */
	EClass getNegatedAbbreviatedConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getChild()
	 * @see #getNegatedAbbreviatedConditionalExpression()
	 * @generated
	 */
	EReference getNegatedAbbreviatedConditionalExpression_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getNegateOperator <em>Negate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression#getNegateOperator()
	 * @see #getNegatedAbbreviatedConditionalExpression()
	 * @generated
	 */
	EReference getNegatedAbbreviatedConditionalExpression_NegateOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild <em>Negated Abbreviated Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negated Abbreviated Conditional Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild
	 * @generated
	 */
	EClass getNegatedAbbreviatedConditionalExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression <em>Abbreviated Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviated Relational Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression
	 * @generated
	 */
	EClass getAbbreviatedRelationalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getRelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Relational Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getRelationalOperator()
	 * @see #getAbbreviatedRelationalExpression()
	 * @generated
	 */
	EReference getAbbreviatedRelationalExpression_RelationalOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getChild()
	 * @see #getAbbreviatedRelationalExpression()
	 * @generated
	 */
	EReference getAbbreviatedRelationalExpression_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getNegateOperator <em>Negate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getNegateOperator()
	 * @see #getAbbreviatedRelationalExpression()
	 * @generated
	 */
	EReference getAbbreviatedRelationalExpression_NegateOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression#getIs()
	 * @see #getAbbreviatedRelationalExpression()
	 * @generated
	 */
	EReference getAbbreviatedRelationalExpression_Is();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression <em>Nested Abbreviated Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Abbreviated Conditional Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression
	 * @generated
	 */
	EClass getNestedAbbreviatedConditionalExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getExpression()
	 * @see #getNestedAbbreviatedConditionalExpression()
	 * @generated
	 */
	EReference getNestedAbbreviatedConditionalExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getRest <em>Rest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rest</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression#getRest()
	 * @see #getNestedAbbreviatedConditionalExpression()
	 * @generated
	 */
	EReference getNestedAbbreviatedConditionalExpression_Rest();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition <em>Sign Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.SignCondition
	 * @generated
	 */
	EClass getSignCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.SignCondition#getChild()
	 * @see #getSignCondition()
	 * @generated
	 */
	EReference getSignCondition_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getSignOperator <em>Sign Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sign Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.SignCondition#getSignOperator()
	 * @see #getSignCondition()
	 * @generated
	 */
	EReference getSignCondition_SignOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getNegateOperator <em>Negate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.SignCondition#getNegateOperator()
	 * @see #getSignCondition()
	 * @generated
	 */
	EReference getSignCondition_NegateOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.SignCondition#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.SignCondition#getIs()
	 * @see #getSignCondition()
	 * @generated
	 */
	EReference getSignCondition_Is();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition <em>Class Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ClassCondition
	 * @generated
	 */
	EClass getClassCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ClassCondition#getChild()
	 * @see #getClassCondition()
	 * @generated
	 */
	EReference getClassCondition_Child();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getClassOperator <em>Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ClassCondition#getClassOperator()
	 * @see #getClassCondition()
	 * @generated
	 */
	EReference getClassCondition_ClassOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getNegateOperator <em>Negate Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Negate Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ClassCondition#getNegateOperator()
	 * @see #getClassCondition()
	 * @generated
	 */
	EReference getClassCondition_NegateOperator();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.ClassCondition#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.ClassCondition#getIs()
	 * @see #getClassCondition()
	 * @generated
	 */
	EReference getClassCondition_Is();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild <em>Abbreviated Relational Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbreviated Relational Expression Child</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild
	 * @generated
	 */
	EClass getAbbreviatedRelationalExpressionChild();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.conditions.NestedCondition <em>Nested Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NestedCondition
	 * @generated
	 */
	EClass getNestedCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.conditions.NestedCondition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.conditions.NestedCondition#getCondition()
	 * @see #getNestedCondition()
	 * @generated
	 */
	EReference getNestedCondition_Condition();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConditionsFactory getConditionsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionImpl <em>Conditional Or Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalOrExpression()
		 * @generated
		 */
		EClass CONDITIONAL_OR_EXPRESSION = eINSTANCE.getConditionalOrExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OR_EXPRESSION__CHILDREN = eINSTANCE.getConditionalOrExpression_Children();

		/**
		 * The meta object literal for the '<em><b>Logical Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS = eINSTANCE.getConditionalOrExpression_LogicalOperators();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionChildImpl <em>Conditional Or Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalOrExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalOrExpressionChild()
		 * @generated
		 */
		EClass CONDITIONAL_OR_EXPRESSION_CHILD = eINSTANCE.getConditionalOrExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionImpl <em>Negated Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedConditionalExpression()
		 * @generated
		 */
		EClass NEGATED_CONDITIONAL_EXPRESSION = eINSTANCE.getNegatedConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATED_CONDITIONAL_EXPRESSION__CHILD = eINSTANCE.getNegatedConditionalExpression_Child();

		/**
		 * The meta object literal for the '<em><b>Negate Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR = eINSTANCE.getNegatedConditionalExpression_NegateOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionChildImpl <em>Negated Conditional Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedConditionalExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedConditionalExpressionChild()
		 * @generated
		 */
		EClass NEGATED_CONDITIONAL_EXPRESSION_CHILD = eINSTANCE.getNegatedConditionalExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.SimpleConditionChildImpl <em>Simple Condition Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.SimpleConditionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getSimpleConditionChild()
		 * @generated
		 */
		EClass SIMPLE_CONDITION_CHILD = eINSTANCE.getSimpleConditionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.RelationalExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__CHILDREN = eINSTANCE.getRelationalExpression_Children();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = eINSTANCE.getRelationalExpression_RelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Negate Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__NEGATE_OPERATOR = eINSTANCE.getRelationalExpression_NegateOperator();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONAL_EXPRESSION__IS = eINSTANCE.getRelationalExpression_Is();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ExpressionListImpl <em>Expression List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ExpressionListImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getExpressionList()
		 * @generated
		 */
		EClass EXPRESSION_LIST = eINSTANCE.getExpressionList();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_LIST__EXPRESSIONS = eINSTANCE.getExpressionList_Expressions();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionChildImpl <em>Conditional And Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalAndExpressionChild()
		 * @generated
		 */
		EClass CONDITIONAL_AND_EXPRESSION_CHILD = eINSTANCE.getConditionalAndExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionImpl <em>Conditional And Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionalAndExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getConditionalAndExpression()
		 * @generated
		 */
		EClass CONDITIONAL_AND_EXPRESSION = eINSTANCE.getConditionalAndExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_AND_EXPRESSION__CHILDREN = eINSTANCE.getConditionalAndExpression_Children();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionImpl <em>Abbreviated Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedConditionalExpression()
		 * @generated
		 */
		EClass ABBREVIATED_CONDITIONAL_EXPRESSION = eINSTANCE.getAbbreviatedConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATED_CONDITIONAL_EXPRESSION__CHILDREN = eINSTANCE.getAbbreviatedConditionalExpression_Children();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionChildImpl <em>Abbreviated Conditional Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedConditionalExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedConditionalExpressionChild()
		 * @generated
		 */
		EClass ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD = eINSTANCE.getAbbreviatedConditionalExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionImpl <em>Negated Abbreviated Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedAbbreviatedConditionalExpression()
		 * @generated
		 */
		EClass NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION = eINSTANCE.getNegatedAbbreviatedConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__CHILD = eINSTANCE.getNegatedAbbreviatedConditionalExpression_Child();

		/**
		 * The meta object literal for the '<em><b>Negate Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR = eINSTANCE.getNegatedAbbreviatedConditionalExpression_NegateOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionChildImpl <em>Negated Abbreviated Conditional Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.NegatedAbbreviatedConditionalExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNegatedAbbreviatedConditionalExpressionChild()
		 * @generated
		 */
		EClass NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION_CHILD = eINSTANCE.getNegatedAbbreviatedConditionalExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionImpl <em>Abbreviated Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedRelationalExpression()
		 * @generated
		 */
		EClass ABBREVIATED_RELATIONAL_EXPRESSION = eINSTANCE.getAbbreviatedRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Relational Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR = eINSTANCE.getAbbreviatedRelationalExpression_RelationalOperator();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATED_RELATIONAL_EXPRESSION__CHILD = eINSTANCE.getAbbreviatedRelationalExpression_Child();

		/**
		 * The meta object literal for the '<em><b>Negate Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATED_RELATIONAL_EXPRESSION__NEGATE_OPERATOR = eINSTANCE.getAbbreviatedRelationalExpression_NegateOperator();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABBREVIATED_RELATIONAL_EXPRESSION__IS = eINSTANCE.getAbbreviatedRelationalExpression_Is();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NestedAbbreviatedConditionalExpressionImpl <em>Nested Abbreviated Conditional Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.NestedAbbreviatedConditionalExpressionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNestedAbbreviatedConditionalExpression()
		 * @generated
		 */
		EClass NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION = eINSTANCE.getNestedAbbreviatedConditionalExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION = eINSTANCE.getNestedAbbreviatedConditionalExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>Rest</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST = eINSTANCE.getNestedAbbreviatedConditionalExpression_Rest();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl <em>Sign Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.SignConditionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getSignCondition()
		 * @generated
		 */
		EClass SIGN_CONDITION = eINSTANCE.getSignCondition();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGN_CONDITION__CHILD = eINSTANCE.getSignCondition_Child();

		/**
		 * The meta object literal for the '<em><b>Sign Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGN_CONDITION__SIGN_OPERATOR = eINSTANCE.getSignCondition_SignOperator();

		/**
		 * The meta object literal for the '<em><b>Negate Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGN_CONDITION__NEGATE_OPERATOR = eINSTANCE.getSignCondition_NegateOperator();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGN_CONDITION__IS = eINSTANCE.getSignCondition_Is();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl <em>Class Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getClassCondition()
		 * @generated
		 */
		EClass CLASS_CONDITION = eINSTANCE.getClassCondition();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONDITION__CHILD = eINSTANCE.getClassCondition_Child();

		/**
		 * The meta object literal for the '<em><b>Class Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONDITION__CLASS_OPERATOR = eINSTANCE.getClassCondition_ClassOperator();

		/**
		 * The meta object literal for the '<em><b>Negate Operator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONDITION__NEGATE_OPERATOR = eINSTANCE.getClassCondition_NegateOperator();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_CONDITION__IS = eINSTANCE.getClassCondition_Is();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionChildImpl <em>Abbreviated Relational Expression Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionChildImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getAbbreviatedRelationalExpressionChild()
		 * @generated
		 */
		EClass ABBREVIATED_RELATIONAL_EXPRESSION_CHILD = eINSTANCE.getAbbreviatedRelationalExpressionChild();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.conditions.impl.NestedConditionImpl <em>Nested Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.NestedConditionImpl
		 * @see org.servicifi.gelato.language.cobol.conditions.impl.ConditionsPackageImpl#getNestedCondition()
		 * @generated
		 */
		EClass NESTED_CONDITION = eINSTANCE.getNestedCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_CONDITION__CONDITION = eINSTANCE.getNestedCondition_Condition();

	}

} //ConditionsPackage
