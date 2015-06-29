/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.arithmetics.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticsFactoryImpl extends EFactoryImpl implements ArithmeticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ArithmeticsFactory init() {
		try {
			ArithmeticsFactory theArithmeticsFactory = (ArithmeticsFactory)EPackage.Registry.INSTANCE.getEFactory(ArithmeticsPackage.eNS_URI);
			if (theArithmeticsFactory != null) {
				return theArithmeticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArithmeticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticsFactoryImpl() {
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
			case ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION: return createAdditiveArithmeticExpression();
			case ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION: return createMultiplicativeArithmeticExpression();
			case ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION: return createPowerArithmeticExpression();
			case ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION: return createUnaryArithmeticExpression();
			case ArithmeticsPackage.ASSIGNMENT_EXPRESSION: return createAssignmentExpression();
			case ArithmeticsPackage.RANGE_EXPRESSION: return createRangeExpression();
			case ArithmeticsPackage.NESTED_ARITHMETIC_EXPRESSION: return createNestedArithmeticExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditiveArithmeticExpression createAdditiveArithmeticExpression() {
		AdditiveArithmeticExpressionImpl additiveArithmeticExpression = new AdditiveArithmeticExpressionImpl();
		return additiveArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicativeArithmeticExpression createMultiplicativeArithmeticExpression() {
		MultiplicativeArithmeticExpressionImpl multiplicativeArithmeticExpression = new MultiplicativeArithmeticExpressionImpl();
		return multiplicativeArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerArithmeticExpression createPowerArithmeticExpression() {
		PowerArithmeticExpressionImpl powerArithmeticExpression = new PowerArithmeticExpressionImpl();
		return powerArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryArithmeticExpression createUnaryArithmeticExpression() {
		UnaryArithmeticExpressionImpl unaryArithmeticExpression = new UnaryArithmeticExpressionImpl();
		return unaryArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssignmentExpression createAssignmentExpression() {
		AssignmentExpressionImpl assignmentExpression = new AssignmentExpressionImpl();
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedArithmeticExpression createNestedArithmeticExpression() {
		NestedArithmeticExpressionImpl nestedArithmeticExpression = new NestedArithmeticExpressionImpl();
		return nestedArithmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticsPackage getArithmeticsPackage() {
		return (ArithmeticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ArithmeticsPackage getPackage() {
		return ArithmeticsPackage.eINSTANCE;
	}

} //ArithmeticsFactoryImpl
