/**
 */
package org.servicifi.gelato.language.kernel.expressions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage;
import org.servicifi.gelato.language.kernel.expressions.SubExpression;
import org.servicifi.gelato.language.kernel.references.impl.ElementReferenceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SubExpressionImpl extends ElementReferenceImpl implements SubExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.SUB_EXPRESSION;
	}

} //SubExpressionImpl
