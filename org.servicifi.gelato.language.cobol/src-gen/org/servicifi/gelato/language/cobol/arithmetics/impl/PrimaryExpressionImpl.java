/**
 */
package org.servicifi.gelato.language.cobol.arithmetics.impl;

import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage;
import org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PrimaryExpressionImpl extends UnaryArithmeticExpressionChildImpl implements PrimaryExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArithmeticsPackage.Literals.PRIMARY_EXPRESSION;
	}

} //PrimaryExpressionImpl
