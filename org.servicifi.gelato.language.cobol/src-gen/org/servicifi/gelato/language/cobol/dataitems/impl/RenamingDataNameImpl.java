/**
 */
package org.servicifi.gelato.language.cobol.dataitems.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;

import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.cobol.dataitems.RenamingDataName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Renaming Data Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.RenamingDataNameImpl#getNameRange <em>Name Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenamingDataNameImpl extends DataNameImpl implements RenamingDataName {
	/**
	 * The cached value of the '{@link #getNameRange() <em>Name Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameRange()
	 * @generated
	 * @ordered
	 */
	protected RangeExpression nameRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenamingDataNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataitemsPackage.Literals.RENAMING_DATA_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression getNameRange() {
		return nameRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNameRange(RangeExpression newNameRange, NotificationChain msgs) {
		RangeExpression oldNameRange = nameRange;
		nameRange = newNameRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE, oldNameRange, newNameRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameRange(RangeExpression newNameRange) {
		if (newNameRange != nameRange) {
			NotificationChain msgs = null;
			if (nameRange != null)
				msgs = ((InternalEObject)nameRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE, null, msgs);
			if (newNameRange != null)
				msgs = ((InternalEObject)newNameRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE, null, msgs);
			msgs = basicSetNameRange(newNameRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE, newNameRange, newNameRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE:
				return basicSetNameRange(null, msgs);
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
			case DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE:
				return getNameRange();
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
			case DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE:
				setNameRange((RangeExpression)newValue);
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
			case DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE:
				setNameRange((RangeExpression)null);
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
			case DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE:
				return nameRange != null;
		}
		return super.eIsSet(featureID);
	}

} //RenamingDataNameImpl
