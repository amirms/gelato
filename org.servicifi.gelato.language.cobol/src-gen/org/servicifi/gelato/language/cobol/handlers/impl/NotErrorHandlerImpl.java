/**
 */
package org.servicifi.gelato.language.cobol.handlers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.handlers.Handler;
import org.servicifi.gelato.language.cobol.handlers.HandlersPackage;
import org.servicifi.gelato.language.cobol.handlers.NotErrorHandler;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Error Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.handlers.impl.NotErrorHandlerImpl#getHandlerStatement <em>Handler Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NotErrorHandlerImpl extends HandlerImpl implements NotErrorHandler {
	/**
	 * The cached value of the '{@link #getHandlerStatement() <em>Handler Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerStatement()
	 * @generated
	 * @ordered
	 */
	protected Handler handlerStatement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotErrorHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HandlersPackage.Literals.NOT_ERROR_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Handler getHandlerStatement() {
		return handlerStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHandlerStatement(Handler newHandlerStatement, NotificationChain msgs) {
		Handler oldHandlerStatement = handlerStatement;
		handlerStatement = newHandlerStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT, oldHandlerStatement, newHandlerStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerStatement(Handler newHandlerStatement) {
		if (newHandlerStatement != handlerStatement) {
			NotificationChain msgs = null;
			if (handlerStatement != null)
				msgs = ((InternalEObject)handlerStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT, null, msgs);
			if (newHandlerStatement != null)
				msgs = ((InternalEObject)newHandlerStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT, null, msgs);
			msgs = basicSetHandlerStatement(newHandlerStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT, newHandlerStatement, newHandlerStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT:
				return basicSetHandlerStatement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT:
				return getHandlerStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT:
				setHandlerStatement((Handler)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT:
				setHandlerStatement((Handler)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HandlersPackage.NOT_ERROR_HANDLER__HANDLER_STATEMENT:
				return handlerStatement != null;
		}
		return super.eIsSet(featureID);
	}

} //NotErrorHandlerImpl
