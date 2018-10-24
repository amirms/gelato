/**
 */
package org.servicifi.gelato.language.cobol.operands.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild;

import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.Condition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.operands.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.operands.OperandsPackage
 * @generated
 */
public class OperandsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OperandsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OperandsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperandsSwitch<Adapter> modelSwitch =
		new OperandsSwitch<Adapter>() {
			@Override
			public Adapter casePrimaryOperand(PrimaryOperand object) {
				return createPrimaryOperandAdapter();
			}
			@Override
			public Adapter caseRoundedIdentifier(RoundedIdentifier object) {
				return createRoundedIdentifierAdapter();
			}
			@Override
			public Adapter caseReplacementOperand(ReplacementOperand object) {
				return createReplacementOperandAdapter();
			}
			@Override
			public Adapter caseEncoding(Encoding object) {
				return createEncodingAdapter();
			}
			@Override
			public Adapter caseOperand(Operand object) {
				return createOperandAdapter();
			}
			@Override
			public Adapter caseArithmeticOperand(ArithmeticOperand object) {
				return createArithmeticOperandAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionalOrExpressionChild(ConditionalOrExpressionChild object) {
				return createConditionalOrExpressionChildAdapter();
			}
			@Override
			public Adapter caseConditionalAndExpressionChild(ConditionalAndExpressionChild object) {
				return createConditionalAndExpressionChildAdapter();
			}
			@Override
			public Adapter caseAbbreviatedConditionalExpressionChild(AbbreviatedConditionalExpressionChild object) {
				return createAbbreviatedConditionalExpressionChildAdapter();
			}
			@Override
			public Adapter caseNegatedAbbreviatedConditionalExpressionChild(NegatedAbbreviatedConditionalExpressionChild object) {
				return createNegatedAbbreviatedConditionalExpressionChildAdapter();
			}
			@Override
			public Adapter caseAbbreviatedRelationalExpressionChild(AbbreviatedRelationalExpressionChild object) {
				return createAbbreviatedRelationalExpressionChildAdapter();
			}
			@Override
			public Adapter caseNegatedConditionalExpressionChild(NegatedConditionalExpressionChild object) {
				return createNegatedConditionalExpressionChildAdapter();
			}
			@Override
			public Adapter caseSimpleConditionChild(SimpleConditionChild object) {
				return createSimpleConditionChildAdapter();
			}
			@Override
			public Adapter caseArithmeticExpression(ArithmeticExpression object) {
				return createArithmeticExpressionAdapter();
			}
			@Override
			public Adapter caseRangeExpressionChild(RangeExpressionChild object) {
				return createRangeExpressionChildAdapter();
			}
			@Override
			public Adapter caseAdditiveArithmeticExpressionChild(AdditiveArithmeticExpressionChild object) {
				return createAdditiveArithmeticExpressionChildAdapter();
			}
			@Override
			public Adapter caseMultiplicativeArithmeticExpressionChild(MultiplicativeArithmeticExpressionChild object) {
				return createMultiplicativeArithmeticExpressionChildAdapter();
			}
			@Override
			public Adapter casePowerArithmeticExpressionChild(PowerArithmeticExpressionChild object) {
				return createPowerArithmeticExpressionChildAdapter();
			}
			@Override
			public Adapter caseUnaryArithmeticExpressionChild(UnaryArithmeticExpressionChild object) {
				return createUnaryArithmeticExpressionChildAdapter();
			}
			@Override
			public Adapter casePrimaryExpression(PrimaryExpression object) {
				return createPrimaryExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.operands.PrimaryOperand <em>Primary Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.operands.PrimaryOperand
	 * @generated
	 */
	public Adapter createPrimaryOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.operands.RoundedIdentifier <em>Rounded Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.operands.RoundedIdentifier
	 * @generated
	 */
	public Adapter createRoundedIdentifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.operands.ReplacementOperand <em>Replacement Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.operands.ReplacementOperand
	 * @generated
	 */
	public Adapter createReplacementOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.operands.Encoding <em>Encoding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.operands.Encoding
	 * @generated
	 */
	public Adapter createEncodingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.operands.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.operands.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.operands.ArithmeticOperand <em>Arithmetic Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.operands.ArithmeticOperand
	 * @generated
	 */
	public Adapter createArithmeticOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild
	 * @generated
	 */
	public Adapter createConditionalOrExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild <em>Conditional And Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild
	 * @generated
	 */
	public Adapter createConditionalAndExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild <em>Abbreviated Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild
	 * @generated
	 */
	public Adapter createAbbreviatedConditionalExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild <em>Negated Abbreviated Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild
	 * @generated
	 */
	public Adapter createNegatedAbbreviatedConditionalExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild <em>Abbreviated Relational Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild
	 * @generated
	 */
	public Adapter createAbbreviatedRelationalExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild <em>Negated Conditional Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild
	 * @generated
	 */
	public Adapter createNegatedConditionalExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild <em>Simple Condition Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild
	 * @generated
	 */
	public Adapter createSimpleConditionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression <em>Arithmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression
	 * @generated
	 */
	public Adapter createArithmeticExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild <em>Range Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild
	 * @generated
	 */
	public Adapter createRangeExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild <em>Additive Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild
	 * @generated
	 */
	public Adapter createAdditiveArithmeticExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild <em>Multiplicative Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild
	 * @generated
	 */
	public Adapter createMultiplicativeArithmeticExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild <em>Power Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild
	 * @generated
	 */
	public Adapter createPowerArithmeticExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild <em>Unary Arithmetic Expression Child</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild
	 * @generated
	 */
	public Adapter createUnaryArithmeticExpressionChildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression <em>Primary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression
	 * @generated
	 */
	public Adapter createPrimaryExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OperandsAdapterFactory
