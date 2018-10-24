/**
 */
package org.servicifi.gelato.language.cobol.functions.impl;

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

import org.servicifi.gelato.language.cobol.functions.Argument;
import org.servicifi.gelato.language.cobol.functions.Argumentable;
import org.servicifi.gelato.language.cobol.functions.FunctionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argumentable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.impl.ArgumentableImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.functions.impl.ArgumentableImpl#getReturning <em>Returning</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ArgumentableImpl extends EObjectImpl implements Argumentable {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getReturning() <em>Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturning()
	 * @generated
	 * @ordered
	 */
	protected Argument returning;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunctionsPackage.Literals.ARGUMENTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, FunctionsPackage.ARGUMENTABLE__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Argument getReturning() {
		return returning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturning(Argument newReturning, NotificationChain msgs) {
		Argument oldReturning = returning;
		returning = newReturning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunctionsPackage.ARGUMENTABLE__RETURNING, oldReturning, newReturning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturning(Argument newReturning) {
		if (newReturning != returning) {
			NotificationChain msgs = null;
			if (returning != null)
				msgs = ((InternalEObject)returning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.ARGUMENTABLE__RETURNING, null, msgs);
			if (newReturning != null)
				msgs = ((InternalEObject)newReturning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunctionsPackage.ARGUMENTABLE__RETURNING, null, msgs);
			msgs = basicSetReturning(newReturning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunctionsPackage.ARGUMENTABLE__RETURNING, newReturning, newReturning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunctionsPackage.ARGUMENTABLE__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case FunctionsPackage.ARGUMENTABLE__RETURNING:
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
			case FunctionsPackage.ARGUMENTABLE__ARGUMENTS:
				return getArguments();
			case FunctionsPackage.ARGUMENTABLE__RETURNING:
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
			case FunctionsPackage.ARGUMENTABLE__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case FunctionsPackage.ARGUMENTABLE__RETURNING:
				setReturning((Argument)newValue);
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
			case FunctionsPackage.ARGUMENTABLE__ARGUMENTS:
				getArguments().clear();
				return;
			case FunctionsPackage.ARGUMENTABLE__RETURNING:
				setReturning((Argument)null);
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
			case FunctionsPackage.ARGUMENTABLE__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case FunctionsPackage.ARGUMENTABLE__RETURNING:
				return returning != null;
		}
		return super.eIsSet(featureID);
	}

} //ArgumentableImpl
