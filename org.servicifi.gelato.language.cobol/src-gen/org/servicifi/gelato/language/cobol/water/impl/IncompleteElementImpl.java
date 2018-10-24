/**
 */
package org.servicifi.gelato.language.cobol.water.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;
import org.servicifi.gelato.language.cobol.water.Water;
import org.servicifi.gelato.language.cobol.water.WaterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Incomplete Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IncompleteElementImpl extends EObjectImpl implements IncompleteElement {
	/**
	 * The cached value of the '{@link #getWater() <em>Water</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWater()
	 * @generated
	 * @ordered
	 */
	protected EList<Water> water;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncompleteElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WaterPackage.Literals.INCOMPLETE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Water> getWater() {
		if (water == null) {
			water = new EObjectContainmentEList<Water>(Water.class, this, WaterPackage.INCOMPLETE_ELEMENT__WATER);
		}
		return water;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WaterPackage.INCOMPLETE_ELEMENT__WATER:
				return ((InternalEList<?>)getWater()).basicRemove(otherEnd, msgs);
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
			case WaterPackage.INCOMPLETE_ELEMENT__WATER:
				return getWater();
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
			case WaterPackage.INCOMPLETE_ELEMENT__WATER:
				getWater().clear();
				getWater().addAll((Collection<? extends Water>)newValue);
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
			case WaterPackage.INCOMPLETE_ELEMENT__WATER:
				getWater().clear();
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
			case WaterPackage.INCOMPLETE_ELEMENT__WATER:
				return water != null && !water.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IncompleteElementImpl
