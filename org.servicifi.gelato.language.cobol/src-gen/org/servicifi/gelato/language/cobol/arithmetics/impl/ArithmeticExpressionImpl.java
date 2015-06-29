/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.impl;

import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;

import org.servicifi.gelato.language.cobol.conditions.impl.AbbreviatedRelationalExpressionChildImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arithmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ArithmeticExpressionImpl extends AbbreviatedRelationalExpressionChildImpl implements ArithmeticExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArithmeticExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.ARITHMETIC_EXPRESSION;
	}

} //ArithmeticExpressionImpl
