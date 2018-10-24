/**
 */
package org.servicifi.gelato.language.cobol.dataitems.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage;
import org.servicifi.gelato.language.cobol.dataitems.Usage;
import org.servicifi.gelato.language.cobol.dataitems.Usages;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.UsageImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.dataitems.impl.UsageImpl#isIsNative <em>Is Native</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsageImpl extends DataItemAttributeImpl implements Usage {
	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final Usages USAGE_EDEFAULT = Usages.BINARY;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected Usages usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNative() <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNative() <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNative()
	 * @generated
	 * @ordered
	 */
	protected boolean isNative = IS_NATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataitemsPackage.Literals.USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usages getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(Usages newUsage) {
		Usages oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataitemsPackage.USAGE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNative() {
		return isNative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNative(boolean newIsNative) {
		boolean oldIsNative = isNative;
		isNative = newIsNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataitemsPackage.USAGE__IS_NATIVE, oldIsNative, isNative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DataitemsPackage.USAGE__USAGE:
				return getUsage();
			case DataitemsPackage.USAGE__IS_NATIVE:
				return isIsNative();
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
			case DataitemsPackage.USAGE__USAGE:
				setUsage((Usages)newValue);
				return;
			case DataitemsPackage.USAGE__IS_NATIVE:
				setIsNative((Boolean)newValue);
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
			case DataitemsPackage.USAGE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case DataitemsPackage.USAGE__IS_NATIVE:
				setIsNative(IS_NATIVE_EDEFAULT);
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
			case DataitemsPackage.USAGE__USAGE:
				return usage != USAGE_EDEFAULT;
			case DataitemsPackage.USAGE__IS_NATIVE:
				return isNative != IS_NATIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (usage: ");
		result.append(usage);
		result.append(", isNative: ");
		result.append(isNative);
		result.append(')');
		return result.toString();
	}

} //UsageImpl
