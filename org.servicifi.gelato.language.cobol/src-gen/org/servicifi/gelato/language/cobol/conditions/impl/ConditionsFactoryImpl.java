/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.conditions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionsFactoryImpl extends EFactoryImpl implements ConditionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConditionsFactory init() {
		try {
			ConditionsFactory theConditionsFactory = (ConditionsFactory)EPackage.Registry.INSTANCE.getEFactory(ConditionsPackage.eNS_URI);
			if (theConditionsFactory != null) {
				return theConditionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConditionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConditionsPackage.CONDITIONAL_OR_EXPRESSION: return createConditionalOrExpression();
			case ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION: return createNegatedConditionalExpression();
			case ConditionsPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case ConditionsPackage.EXPRESSION_LIST: return createExpressionList();
			case ConditionsPackage.CONDITIONAL_AND_EXPRESSION: return createConditionalAndExpression();
			case ConditionsPackage.ABBREVIATED_CONDITIONAL_EXPRESSION: return createAbbreviatedConditionalExpression();
			case ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION: return createNegatedAbbreviatedConditionalExpression();
			case ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION: return createAbbreviatedRelationalExpression();
			case ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION: return createNestedAbbreviatedConditionalExpression();
			case ConditionsPackage.SIGN_CONDITION: return createSignCondition();
			case ConditionsPackage.CLASS_CONDITION: return createClassCondition();
			case ConditionsPackage.NESTED_CONDITION: return createNestedCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalOrExpression createConditionalOrExpression() {
		ConditionalOrExpressionImpl conditionalOrExpression = new ConditionalOrExpressionImpl();
		return conditionalOrExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatedConditionalExpression createNegatedConditionalExpression() {
		NegatedConditionalExpressionImpl negatedConditionalExpression = new NegatedConditionalExpressionImpl();
		return negatedConditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionList createExpressionList() {
		ExpressionListImpl expressionList = new ExpressionListImpl();
		return expressionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalAndExpression createConditionalAndExpression() {
		ConditionalAndExpressionImpl conditionalAndExpression = new ConditionalAndExpressionImpl();
		return conditionalAndExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbreviatedConditionalExpression createAbbreviatedConditionalExpression() {
		AbbreviatedConditionalExpressionImpl abbreviatedConditionalExpression = new AbbreviatedConditionalExpressionImpl();
		return abbreviatedConditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegatedAbbreviatedConditionalExpression createNegatedAbbreviatedConditionalExpression() {
		NegatedAbbreviatedConditionalExpressionImpl negatedAbbreviatedConditionalExpression = new NegatedAbbreviatedConditionalExpressionImpl();
		return negatedAbbreviatedConditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbreviatedRelationalExpression createAbbreviatedRelationalExpression() {
		AbbreviatedRelationalExpressionImpl abbreviatedRelationalExpression = new AbbreviatedRelationalExpressionImpl();
		return abbreviatedRelationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedAbbreviatedConditionalExpression createNestedAbbreviatedConditionalExpression() {
		NestedAbbreviatedConditionalExpressionImpl nestedAbbreviatedConditionalExpression = new NestedAbbreviatedConditionalExpressionImpl();
		return nestedAbbreviatedConditionalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignCondition createSignCondition() {
		SignConditionImpl signCondition = new SignConditionImpl();
		return signCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassCondition createClassCondition() {
		ClassConditionImpl classCondition = new ClassConditionImpl();
		return classCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedCondition createNestedCondition() {
		NestedConditionImpl nestedCondition = new NestedConditionImpl();
		return nestedCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionsPackage getConditionsPackage() {
		return (ConditionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConditionsPackage getPackage() {
		return ConditionsPackage.eINSTANCE;
	}

} //ConditionsFactoryImpl
