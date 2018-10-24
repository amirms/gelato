/**
 */
package org.servicifi.gelato.language.cobol.specialnames.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.specialnames.ConditionName;
import org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage;
import org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UPSI Switch Is</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.UPSISwitchIsImpl#getConditionNames <em>Condition Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UPSISwitchIsImpl extends MnemonicNameImpl implements UPSISwitchIs {
	/**
	 * The cached value of the '{@link #getConditionNames() <em>Condition Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionNames()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionName> conditionNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UPSISwitchIsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecialnamesPackage.Literals.UPSI_SWITCH_IS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionName> getConditionNames() {
		if (conditionNames == null) {
			conditionNames = new EObjectContainmentEList<ConditionName>(ConditionName.class, this, SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES);
		}
		return conditionNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES:
				return ((InternalEList<?>)getConditionNames()).basicRemove(otherEnd, msgs);
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
			case SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES:
				return getConditionNames();
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
			case SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES:
				getConditionNames().clear();
				getConditionNames().addAll((Collection<? extends ConditionName>)newValue);
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
			case SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES:
				getConditionNames().clear();
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
			case SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES:
				return conditionNames != null && !conditionNames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UPSISwitchIsImpl
