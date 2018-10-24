/**
 */
package org.servicifi.gelato.language.cobol.dataitems.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.cobol.dataitems.Redefines;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redefines</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.RedefinesImpl#getDataName <em>Data Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedefinesImpl extends DataItemAttributeImpl implements Redefines {
	/**
	 * The cached value of the '{@link #getDataName() <em>Data Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataName()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference dataName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedefinesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataitemsPackage.Literals.REDEFINES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getDataName() {
		return dataName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataName(IdentifierReference newDataName, NotificationChain msgs) {
		IdentifierReference oldDataName = dataName;
		dataName = newDataName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataitemsPackage.REDEFINES__DATA_NAME, oldDataName, newDataName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataName(IdentifierReference newDataName) {
		if (newDataName != dataName) {
			NotificationChain msgs = null;
			if (dataName != null)
				msgs = ((InternalEObject)dataName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataitemsPackage.REDEFINES__DATA_NAME, null, msgs);
			if (newDataName != null)
				msgs = ((InternalEObject)newDataName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataitemsPackage.REDEFINES__DATA_NAME, null, msgs);
			msgs = basicSetDataName(newDataName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataitemsPackage.REDEFINES__DATA_NAME, newDataName, newDataName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataitemsPackage.REDEFINES__DATA_NAME:
				return basicSetDataName(null, msgs);
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
			case DataitemsPackage.REDEFINES__DATA_NAME:
				return getDataName();
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
			case DataitemsPackage.REDEFINES__DATA_NAME:
				setDataName((IdentifierReference)newValue);
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
			case DataitemsPackage.REDEFINES__DATA_NAME:
				setDataName((IdentifierReference)null);
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
			case DataitemsPackage.REDEFINES__DATA_NAME:
				return dataName != null;
		}
		return super.eIsSet(featureID);
	}

} //RedefinesImpl
