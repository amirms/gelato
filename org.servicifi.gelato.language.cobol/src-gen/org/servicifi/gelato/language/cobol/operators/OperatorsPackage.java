/**
 */
package org.servicifi.gelato.language.cobol.operators;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.servicifi.gelato.language.cobol.operators.OperatorsFactory
 * @model kind="package"
 * @generated
 */
public interface OperatorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "operators";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/operators";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "operators";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperatorsPackage eINSTANCE = org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AdditiveOperatorImpl <em>Additive Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.AdditiveOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAdditiveOperator()
	 * @generated
	 */
	int ADDITIVE_OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Additive Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIVE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.MultiplicativeOperatorImpl <em>Multiplicative Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.MultiplicativeOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getMultiplicativeOperator()
	 * @generated
	 */
	int MULTIPLICATIVE_OPERATOR = 2;

	/**
	 * The number of structural features of the '<em>Multiplicative Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATIVE_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.UnaryOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 3;

	/**
	 * The number of structural features of the '<em>Unary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LogicalOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 4;

	/**
	 * The number of structural features of the '<em>Logical Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.RelationalOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 5;

	/**
	 * The number of structural features of the '<em>Relational Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ConditionOrImpl <em>Condition Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.ConditionOrImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getConditionOr()
	 * @generated
	 */
	int CONDITION_OR = 6;

	/**
	 * The number of structural features of the '<em>Condition Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OR_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ConditionAndImpl <em>Condition And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.ConditionAndImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getConditionAnd()
	 * @generated
	 */
	int CONDITION_AND = 7;

	/**
	 * The number of structural features of the '<em>Condition And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_AND_FEATURE_COUNT = LOGICAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.MultiplicationImpl <em>Multiplication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.MultiplicationImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getMultiplication()
	 * @generated
	 */
	int MULTIPLICATION = 8;

	/**
	 * The number of structural features of the '<em>Multiplication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICATION_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.SignOperatorImpl <em>Sign Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.SignOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getSignOperator()
	 * @generated
	 */
	int SIGN_OPERATOR = 9;

	/**
	 * The number of structural features of the '<em>Sign Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.PositiveImpl <em>Positive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.PositiveImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getPositive()
	 * @generated
	 */
	int POSITIVE = 10;

	/**
	 * The number of structural features of the '<em>Positive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITIVE_FEATURE_COUNT = SIGN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.NegativeImpl <em>Negative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.NegativeImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getNegative()
	 * @generated
	 */
	int NEGATIVE = 11;

	/**
	 * The number of structural features of the '<em>Negative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATIVE_FEATURE_COUNT = SIGN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.DivisionImpl <em>Division</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.DivisionImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getDivision()
	 * @generated
	 */
	int DIVISION = 12;

	/**
	 * The number of structural features of the '<em>Division</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISION_FEATURE_COUNT = MULTIPLICATIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AdditionImpl <em>Addition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.AdditionImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAddition()
	 * @generated
	 */
	int ADDITION = 13;

	/**
	 * The number of structural features of the '<em>Addition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITION_FEATURE_COUNT = ADDITIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.SubtractionImpl <em>Subtraction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.SubtractionImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getSubtraction()
	 * @generated
	 */
	int SUBTRACTION = 14;

	/**
	 * The number of structural features of the '<em>Subtraction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACTION_FEATURE_COUNT = ADDITIVE_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.GreaterThanOrEqualImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGreaterThanOrEqual()
	 * @generated
	 */
	int GREATER_THAN_OR_EQUAL = 15;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__THAN = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL__TO = RELATIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Greater Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_OR_EQUAL_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GreaterThanImpl <em>Greater Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.GreaterThanImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGreaterThan()
	 * @generated
	 */
	int GREATER_THAN = 16;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN__THAN = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Greater Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GREATER_THAN_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LessThanImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 17;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__THAN = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LessThanOrEqualImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLessThanOrEqual()
	 * @generated
	 */
	int LESS_THAN_OR_EQUAL = 18;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__THAN = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL__TO = RELATIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Less Than Or Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OR_EQUAL_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.EqualImpl <em>Equal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.EqualImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getEqual()
	 * @generated
	 */
	int EQUAL = 19;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL__TO = RELATIONAL_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_FEATURE_COUNT = RELATIONAL_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.PowerImpl <em>Power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.PowerImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getPower()
	 * @generated
	 */
	int POWER = 20;

	/**
	 * The number of structural features of the '<em>Power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.NegateImpl <em>Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.NegateImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getNegate()
	 * @generated
	 */
	int NEGATE = 21;

	/**
	 * The number of structural features of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ThroughImpl <em>Through</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.ThroughImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getThrough()
	 * @generated
	 */
	int THROUGH = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGH__VALUE = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Through</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROUGH_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ClassOperatorImpl <em>Class Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.ClassOperatorImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getClassOperator()
	 * @generated
	 */
	int CLASS_OPERATOR = 23;

	/**
	 * The number of structural features of the '<em>Class Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ZeroImpl <em>Zero</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.ZeroImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getZero()
	 * @generated
	 */
	int ZERO = 24;

	/**
	 * The number of structural features of the '<em>Zero</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZERO_FEATURE_COUNT = SIGN_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ClassNameImpl <em>Class Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.ClassNameImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getClassName()
	 * @generated
	 */
	int CLASS_NAME = 25;

	/**
	 * The number of structural features of the '<em>Class Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_NAME_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AlphabeticImpl <em>Alphabetic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.AlphabeticImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAlphabetic()
	 * @generated
	 */
	int ALPHABETIC = 26;

	/**
	 * The number of structural features of the '<em>Alphabetic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABETIC_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.DBCSImpl <em>DBCS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.DBCSImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getDBCS()
	 * @generated
	 */
	int DBCS = 27;

	/**
	 * The number of structural features of the '<em>DBCS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBCS_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.NumericImpl <em>Numeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.NumericImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getNumeric()
	 * @generated
	 */
	int NUMERIC = 28;

	/**
	 * The number of structural features of the '<em>Numeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AlphabeticUpperImpl <em>Alphabetic Upper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.AlphabeticUpperImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAlphabeticUpper()
	 * @generated
	 */
	int ALPHABETIC_UPPER = 29;

	/**
	 * The number of structural features of the '<em>Alphabetic Upper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABETIC_UPPER_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AlphabeticLowerImpl <em>Alphabetic Lower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.AlphabeticLowerImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAlphabeticLower()
	 * @generated
	 */
	int ALPHABETIC_LOWER = 30;

	/**
	 * The number of structural features of the '<em>Alphabetic Lower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALPHABETIC_LOWER_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.KanjiImpl <em>Kanji</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.KanjiImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getKanji()
	 * @generated
	 */
	int KANJI = 31;

	/**
	 * The number of structural features of the '<em>Kanji</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KANJI_FEATURE_COUNT = CLASS_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.EqualPhraseImpl <em>Equal Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.EqualPhraseImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getEqualPhrase()
	 * @generated
	 */
	int EQUAL_PHRASE = 32;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_PHRASE__TO = EQUAL__TO;

	/**
	 * The number of structural features of the '<em>Equal Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_PHRASE_FEATURE_COUNT = EQUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.EqualSignImpl <em>Equal Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.EqualSignImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getEqualSign()
	 * @generated
	 */
	int EQUAL_SIGN = 33;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_SIGN__TO = EQUAL__TO;

	/**
	 * The number of structural features of the '<em>Equal Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUAL_SIGN_FEATURE_COUNT = EQUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTPhraseImpl <em>LT Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LTPhraseImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTPhrase()
	 * @generated
	 */
	int LT_PHRASE = 34;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_PHRASE__THAN = LESS_THAN__THAN;

	/**
	 * The number of structural features of the '<em>LT Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_PHRASE_FEATURE_COUNT = LESS_THAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTSignImpl <em>LT Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LTSignImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTSign()
	 * @generated
	 */
	int LT_SIGN = 35;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_SIGN__THAN = LESS_THAN__THAN;

	/**
	 * The number of structural features of the '<em>LT Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LT_SIGN_FEATURE_COUNT = LESS_THAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTEQPhraseImpl <em>LTEQ Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LTEQPhraseImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTEQPhrase()
	 * @generated
	 */
	int LTEQ_PHRASE = 36;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTEQ_PHRASE__THAN = LESS_THAN_OR_EQUAL__THAN;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTEQ_PHRASE__TO = LESS_THAN_OR_EQUAL__TO;

	/**
	 * The number of structural features of the '<em>LTEQ Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTEQ_PHRASE_FEATURE_COUNT = LESS_THAN_OR_EQUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTEQSignImpl <em>LTEQ Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.LTEQSignImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTEQSign()
	 * @generated
	 */
	int LTEQ_SIGN = 37;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTEQ_SIGN__THAN = LESS_THAN_OR_EQUAL__THAN;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTEQ_SIGN__TO = LESS_THAN_OR_EQUAL__TO;

	/**
	 * The number of structural features of the '<em>LTEQ Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LTEQ_SIGN_FEATURE_COUNT = LESS_THAN_OR_EQUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTPhraseImpl <em>GT Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.GTPhraseImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTPhrase()
	 * @generated
	 */
	int GT_PHRASE = 38;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_PHRASE__THAN = GREATER_THAN__THAN;

	/**
	 * The number of structural features of the '<em>GT Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_PHRASE_FEATURE_COUNT = GREATER_THAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTSignImpl <em>GT Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.GTSignImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTSign()
	 * @generated
	 */
	int GT_SIGN = 39;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_SIGN__THAN = GREATER_THAN__THAN;

	/**
	 * The number of structural features of the '<em>GT Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GT_SIGN_FEATURE_COUNT = GREATER_THAN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTEQPhraseImpl <em>GTEQ Phrase</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.GTEQPhraseImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTEQPhrase()
	 * @generated
	 */
	int GTEQ_PHRASE = 40;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEQ_PHRASE__THAN = GREATER_THAN_OR_EQUAL__THAN;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEQ_PHRASE__TO = GREATER_THAN_OR_EQUAL__TO;

	/**
	 * The number of structural features of the '<em>GTEQ Phrase</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEQ_PHRASE_FEATURE_COUNT = GREATER_THAN_OR_EQUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTEQSignImpl <em>GTEQ Sign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.impl.GTEQSignImpl
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTEQSign()
	 * @generated
	 */
	int GTEQ_SIGN = 41;

	/**
	 * The feature id for the '<em><b>Than</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEQ_SIGN__THAN = GREATER_THAN_OR_EQUAL__THAN;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEQ_SIGN__TO = GREATER_THAN_OR_EQUAL__TO;

	/**
	 * The number of structural features of the '<em>GTEQ Sign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTEQ_SIGN_FEATURE_COUNT = GREATER_THAN_OR_EQUAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.operators.ThroughPhrase <em>Through Phrase</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.operators.ThroughPhrase
	 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getThroughPhrase()
	 * @generated
	 */
	int THROUGH_PHRASE = 42;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.AdditiveOperator <em>Additive Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additive Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.AdditiveOperator
	 * @generated
	 */
	EClass getAdditiveOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator <em>Multiplicative Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicative Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator
	 * @generated
	 */
	EClass getMultiplicativeOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.UnaryOperator
	 * @generated
	 */
	EClass getUnaryOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LogicalOperator
	 * @generated
	 */
	EClass getLogicalOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.RelationalOperator
	 * @generated
	 */
	EClass getRelationalOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.ConditionOr <em>Condition Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Or</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.ConditionOr
	 * @generated
	 */
	EClass getConditionOr();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.ConditionAnd <em>Condition And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition And</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.ConditionAnd
	 * @generated
	 */
	EClass getConditionAnd();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Multiplication <em>Multiplication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplication</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Multiplication
	 * @generated
	 */
	EClass getMultiplication();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.SignOperator <em>Sign Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.SignOperator
	 * @generated
	 */
	EClass getSignOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Positive <em>Positive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Positive</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Positive
	 * @generated
	 */
	EClass getPositive();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Negative <em>Negative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negative</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Negative
	 * @generated
	 */
	EClass getNegative();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Division <em>Division</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Division</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Division
	 * @generated
	 */
	EClass getDivision();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Addition <em>Addition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Addition</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Addition
	 * @generated
	 */
	EClass getAddition();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Subtraction <em>Subtraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtraction</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Subtraction
	 * @generated
	 */
	EClass getSubtraction();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual <em>Greater Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than Or Equal</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual
	 * @generated
	 */
	EClass getGreaterThanOrEqual();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual#isThan <em>Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Than</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual#isThan()
	 * @see #getGreaterThanOrEqual()
	 * @generated
	 */
	EAttribute getGreaterThanOrEqual_Than();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual#isTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual#isTo()
	 * @see #getGreaterThanOrEqual()
	 * @generated
	 */
	EAttribute getGreaterThanOrEqual_To();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.GreaterThan <em>Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Greater Than</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GreaterThan
	 * @generated
	 */
	EClass getGreaterThan();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.GreaterThan#isThan <em>Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Than</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GreaterThan#isThan()
	 * @see #getGreaterThan()
	 * @generated
	 */
	EAttribute getGreaterThan_Than();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.LessThan#isThan <em>Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Than</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LessThan#isThan()
	 * @see #getLessThan()
	 * @generated
	 */
	EAttribute getLessThan_Than();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LessThanOrEqual <em>Less Than Or Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than Or Equal</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LessThanOrEqual
	 * @generated
	 */
	EClass getLessThanOrEqual();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.LessThanOrEqual#isThan <em>Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Than</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LessThanOrEqual#isThan()
	 * @see #getLessThanOrEqual()
	 * @generated
	 */
	EAttribute getLessThanOrEqual_Than();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.LessThanOrEqual#isTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LessThanOrEqual#isTo()
	 * @see #getLessThanOrEqual()
	 * @generated
	 */
	EAttribute getLessThanOrEqual_To();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Equal <em>Equal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Equal
	 * @generated
	 */
	EClass getEqual();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.Equal#isTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Equal#isTo()
	 * @see #getEqual()
	 * @generated
	 */
	EAttribute getEqual_To();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Power <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Power
	 * @generated
	 */
	EClass getPower();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Negate
	 * @generated
	 */
	EClass getNegate();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Through <em>Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Through</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Through
	 * @generated
	 */
	EClass getThrough();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.operators.Through#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Through#getValue()
	 * @see #getThrough()
	 * @generated
	 */
	EAttribute getThrough_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.ClassOperator <em>Class Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Operator</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.ClassOperator
	 * @generated
	 */
	EClass getClassOperator();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Zero <em>Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zero</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Zero
	 * @generated
	 */
	EClass getZero();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.ClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.ClassName
	 * @generated
	 */
	EClass getClassName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Alphabetic <em>Alphabetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabetic</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Alphabetic
	 * @generated
	 */
	EClass getAlphabetic();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.DBCS <em>DBCS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBCS</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.DBCS
	 * @generated
	 */
	EClass getDBCS();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Numeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Numeric
	 * @generated
	 */
	EClass getNumeric();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.AlphabeticUpper <em>Alphabetic Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabetic Upper</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.AlphabeticUpper
	 * @generated
	 */
	EClass getAlphabeticUpper();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.AlphabeticLower <em>Alphabetic Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alphabetic Lower</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.AlphabeticLower
	 * @generated
	 */
	EClass getAlphabeticLower();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.Kanji <em>Kanji</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kanji</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.Kanji
	 * @generated
	 */
	EClass getKanji();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.EqualPhrase <em>Equal Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Phrase</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.EqualPhrase
	 * @generated
	 */
	EClass getEqualPhrase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.EqualSign <em>Equal Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equal Sign</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.EqualSign
	 * @generated
	 */
	EClass getEqualSign();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LTPhrase <em>LT Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT Phrase</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LTPhrase
	 * @generated
	 */
	EClass getLTPhrase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LTSign <em>LT Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LT Sign</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LTSign
	 * @generated
	 */
	EClass getLTSign();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LTEQPhrase <em>LTEQ Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTEQ Phrase</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LTEQPhrase
	 * @generated
	 */
	EClass getLTEQPhrase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.LTEQSign <em>LTEQ Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LTEQ Sign</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.LTEQSign
	 * @generated
	 */
	EClass getLTEQSign();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.GTPhrase <em>GT Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GT Phrase</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GTPhrase
	 * @generated
	 */
	EClass getGTPhrase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.GTSign <em>GT Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GT Sign</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GTSign
	 * @generated
	 */
	EClass getGTSign();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.GTEQPhrase <em>GTEQ Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTEQ Phrase</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GTEQPhrase
	 * @generated
	 */
	EClass getGTEQPhrase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.operators.GTEQSign <em>GTEQ Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTEQ Sign</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.GTEQSign
	 * @generated
	 */
	EClass getGTEQSign();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.operators.ThroughPhrase <em>Through Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Through Phrase</em>'.
	 * @see org.servicifi.gelato.language.cobol.operators.ThroughPhrase
	 * @generated
	 */
	EEnum getThroughPhrase();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OperatorsFactory getOperatorsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AdditiveOperatorImpl <em>Additive Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.AdditiveOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAdditiveOperator()
		 * @generated
		 */
		EClass ADDITIVE_OPERATOR = eINSTANCE.getAdditiveOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.MultiplicativeOperatorImpl <em>Multiplicative Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.MultiplicativeOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getMultiplicativeOperator()
		 * @generated
		 */
		EClass MULTIPLICATIVE_OPERATOR = eINSTANCE.getMultiplicativeOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.UnaryOperatorImpl <em>Unary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.UnaryOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EClass UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LogicalOperatorImpl <em>Logical Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LogicalOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EClass LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.RelationalOperatorImpl <em>Relational Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.RelationalOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EClass RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ConditionOrImpl <em>Condition Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.ConditionOrImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getConditionOr()
		 * @generated
		 */
		EClass CONDITION_OR = eINSTANCE.getConditionOr();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ConditionAndImpl <em>Condition And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.ConditionAndImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getConditionAnd()
		 * @generated
		 */
		EClass CONDITION_AND = eINSTANCE.getConditionAnd();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.MultiplicationImpl <em>Multiplication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.MultiplicationImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getMultiplication()
		 * @generated
		 */
		EClass MULTIPLICATION = eINSTANCE.getMultiplication();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.SignOperatorImpl <em>Sign Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.SignOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getSignOperator()
		 * @generated
		 */
		EClass SIGN_OPERATOR = eINSTANCE.getSignOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.PositiveImpl <em>Positive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.PositiveImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getPositive()
		 * @generated
		 */
		EClass POSITIVE = eINSTANCE.getPositive();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.NegativeImpl <em>Negative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.NegativeImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getNegative()
		 * @generated
		 */
		EClass NEGATIVE = eINSTANCE.getNegative();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.DivisionImpl <em>Division</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.DivisionImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getDivision()
		 * @generated
		 */
		EClass DIVISION = eINSTANCE.getDivision();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AdditionImpl <em>Addition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.AdditionImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAddition()
		 * @generated
		 */
		EClass ADDITION = eINSTANCE.getAddition();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.SubtractionImpl <em>Subtraction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.SubtractionImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getSubtraction()
		 * @generated
		 */
		EClass SUBTRACTION = eINSTANCE.getSubtraction();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GreaterThanOrEqualImpl <em>Greater Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.GreaterThanOrEqualImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGreaterThanOrEqual()
		 * @generated
		 */
		EClass GREATER_THAN_OR_EQUAL = eINSTANCE.getGreaterThanOrEqual();

		/**
		 * The meta object literal for the '<em><b>Than</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN_OR_EQUAL__THAN = eINSTANCE.getGreaterThanOrEqual_Than();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN_OR_EQUAL__TO = eINSTANCE.getGreaterThanOrEqual_To();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GreaterThanImpl <em>Greater Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.GreaterThanImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGreaterThan()
		 * @generated
		 */
		EClass GREATER_THAN = eINSTANCE.getGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Than</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GREATER_THAN__THAN = eINSTANCE.getGreaterThan_Than();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LessThanImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '<em><b>Than</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESS_THAN__THAN = eINSTANCE.getLessThan_Than();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LessThanOrEqualImpl <em>Less Than Or Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LessThanOrEqualImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLessThanOrEqual()
		 * @generated
		 */
		EClass LESS_THAN_OR_EQUAL = eINSTANCE.getLessThanOrEqual();

		/**
		 * The meta object literal for the '<em><b>Than</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESS_THAN_OR_EQUAL__THAN = eINSTANCE.getLessThanOrEqual_Than();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LESS_THAN_OR_EQUAL__TO = eINSTANCE.getLessThanOrEqual_To();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.EqualImpl <em>Equal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.EqualImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getEqual()
		 * @generated
		 */
		EClass EQUAL = eINSTANCE.getEqual();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUAL__TO = eINSTANCE.getEqual_To();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.PowerImpl <em>Power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.PowerImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getPower()
		 * @generated
		 */
		EClass POWER = eINSTANCE.getPower();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.NegateImpl <em>Negate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.NegateImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getNegate()
		 * @generated
		 */
		EClass NEGATE = eINSTANCE.getNegate();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ThroughImpl <em>Through</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.ThroughImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getThrough()
		 * @generated
		 */
		EClass THROUGH = eINSTANCE.getThrough();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THROUGH__VALUE = eINSTANCE.getThrough_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ClassOperatorImpl <em>Class Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.ClassOperatorImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getClassOperator()
		 * @generated
		 */
		EClass CLASS_OPERATOR = eINSTANCE.getClassOperator();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ZeroImpl <em>Zero</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.ZeroImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getZero()
		 * @generated
		 */
		EClass ZERO = eINSTANCE.getZero();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.ClassNameImpl <em>Class Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.ClassNameImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getClassName()
		 * @generated
		 */
		EClass CLASS_NAME = eINSTANCE.getClassName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AlphabeticImpl <em>Alphabetic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.AlphabeticImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAlphabetic()
		 * @generated
		 */
		EClass ALPHABETIC = eINSTANCE.getAlphabetic();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.DBCSImpl <em>DBCS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.DBCSImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getDBCS()
		 * @generated
		 */
		EClass DBCS = eINSTANCE.getDBCS();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.NumericImpl <em>Numeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.NumericImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getNumeric()
		 * @generated
		 */
		EClass NUMERIC = eINSTANCE.getNumeric();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AlphabeticUpperImpl <em>Alphabetic Upper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.AlphabeticUpperImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAlphabeticUpper()
		 * @generated
		 */
		EClass ALPHABETIC_UPPER = eINSTANCE.getAlphabeticUpper();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.AlphabeticLowerImpl <em>Alphabetic Lower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.AlphabeticLowerImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getAlphabeticLower()
		 * @generated
		 */
		EClass ALPHABETIC_LOWER = eINSTANCE.getAlphabeticLower();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.KanjiImpl <em>Kanji</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.KanjiImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getKanji()
		 * @generated
		 */
		EClass KANJI = eINSTANCE.getKanji();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.EqualPhraseImpl <em>Equal Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.EqualPhraseImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getEqualPhrase()
		 * @generated
		 */
		EClass EQUAL_PHRASE = eINSTANCE.getEqualPhrase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.EqualSignImpl <em>Equal Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.EqualSignImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getEqualSign()
		 * @generated
		 */
		EClass EQUAL_SIGN = eINSTANCE.getEqualSign();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTPhraseImpl <em>LT Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LTPhraseImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTPhrase()
		 * @generated
		 */
		EClass LT_PHRASE = eINSTANCE.getLTPhrase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTSignImpl <em>LT Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LTSignImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTSign()
		 * @generated
		 */
		EClass LT_SIGN = eINSTANCE.getLTSign();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTEQPhraseImpl <em>LTEQ Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LTEQPhraseImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTEQPhrase()
		 * @generated
		 */
		EClass LTEQ_PHRASE = eINSTANCE.getLTEQPhrase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.LTEQSignImpl <em>LTEQ Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.LTEQSignImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getLTEQSign()
		 * @generated
		 */
		EClass LTEQ_SIGN = eINSTANCE.getLTEQSign();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTPhraseImpl <em>GT Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.GTPhraseImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTPhrase()
		 * @generated
		 */
		EClass GT_PHRASE = eINSTANCE.getGTPhrase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTSignImpl <em>GT Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.GTSignImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTSign()
		 * @generated
		 */
		EClass GT_SIGN = eINSTANCE.getGTSign();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTEQPhraseImpl <em>GTEQ Phrase</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.GTEQPhraseImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTEQPhrase()
		 * @generated
		 */
		EClass GTEQ_PHRASE = eINSTANCE.getGTEQPhrase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.impl.GTEQSignImpl <em>GTEQ Sign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.impl.GTEQSignImpl
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getGTEQSign()
		 * @generated
		 */
		EClass GTEQ_SIGN = eINSTANCE.getGTEQSign();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.operators.ThroughPhrase <em>Through Phrase</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.operators.ThroughPhrase
		 * @see org.servicifi.gelato.language.cobol.operators.impl.OperatorsPackageImpl#getThroughPhrase()
		 * @generated
		 */
		EEnum THROUGH_PHRASE = eINSTANCE.getThroughPhrase();

	}

} //OperatorsPackage
