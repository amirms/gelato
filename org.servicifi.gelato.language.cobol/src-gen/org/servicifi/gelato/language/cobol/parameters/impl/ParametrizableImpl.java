/**
 */
package org.servicifi.gelato.language.cobol.parameters.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.parameters.Parameter;
import org.servicifi.gelato.language.cobol.parameters.ParametersPackage;
import org.servicifi.gelato.language.cobol.parameters.Parametrizable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parametrizable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.parameters.impl.ParametrizableImpl#getReturning <em>Returning</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ParametrizableImpl extends EObjectImpl implements Parametrizable {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturning() <em>Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturning()
	 * @generated
	 * @ordered
	 */
	protected Parameter returning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParametrizableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETRIZABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, ParametersPackage.PARAMETRIZABLE__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturning() {
		return returning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturning(Parameter newReturning, NotificationChain msgs) {
		Parameter oldReturning = returning;
		returning = newReturning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETRIZABLE__RETURNING, oldReturning, newReturning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturning(Parameter newReturning) {
		if (newReturning != returning) {
			NotificationChain msgs = null;
			if (returning != null)
				msgs = ((InternalEObject)returning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.PARAMETRIZABLE__RETURNING, null, msgs);
			if (newReturning != null)
				msgs = ((InternalEObject)newReturning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ParametersPackage.PARAMETRIZABLE__RETURNING, null, msgs);
			msgs = basicSetReturning(newReturning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETRIZABLE__RETURNING, newReturning, newReturning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case ParametersPackage.PARAMETRIZABLE__RETURNING:
				return basicSetReturning(null, msgs);
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
			case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
				return getParameters();
			case ParametersPackage.PARAMETRIZABLE__RETURNING:
				return getReturning();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ParametersPackage.PARAMETRIZABLE__RETURNING:
				setReturning((Parameter)newValue);
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
			case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
				getParameters().clear();
				return;
			case ParametersPackage.PARAMETRIZABLE__RETURNING:
				setReturning((Parameter)null);
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
			case ParametersPackage.PARAMETRIZABLE__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ParametersPackage.PARAMETRIZABLE__RETURNING:
				return returning != null;
		}
		return super.eIsSet(featureID);
	}

} //ParametrizableImpl
