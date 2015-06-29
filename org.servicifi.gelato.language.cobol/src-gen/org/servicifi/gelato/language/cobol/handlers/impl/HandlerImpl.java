/**
 */
package org.servicifi.gelato.language.cobol.handlers.impl;

import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.language.cobol.handlers.Handler;
import org.servicifi.gelato.language.cobol.handlers.HandlersPackage;

import org.servicifi.gelato.language.cobol.statements.impl.NestedStatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class HandlerImpl extends NestedStatementImpl implements Handler {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HandlersPackage.Literals.HANDLER;
	}

} //HandlerImpl
