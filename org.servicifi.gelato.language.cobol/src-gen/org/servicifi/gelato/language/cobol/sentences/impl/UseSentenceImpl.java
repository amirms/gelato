/**
 */
package org.servicifi.gelato.language.cobol.sentences.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.sentences.SentencesPackage;
import org.servicifi.gelato.language.cobol.sentences.UseSentence;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;
import org.servicifi.gelato.language.cobol.water.Water;
import org.servicifi.gelato.language.cobol.water.WaterPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Use Sentence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sentences.impl.UseSentenceImpl#getWater <em>Water</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UseSentenceImpl extends StatementContainerImpl implements UseSentence {
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
	protected UseSentenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SentencesPackage.Literals.USE_SENTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Water> getWater() {
		if (water == null) {
			water = new EObjectContainmentEList<Water>(Water.class, this, SentencesPackage.USE_SENTENCE__WATER);
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
			case SentencesPackage.USE_SENTENCE__WATER:
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
			case SentencesPackage.USE_SENTENCE__WATER:
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
			case SentencesPackage.USE_SENTENCE__WATER:
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
			case SentencesPackage.USE_SENTENCE__WATER:
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
			case SentencesPackage.USE_SENTENCE__WATER:
				return water != null && !water.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IncompleteElement.class) {
			switch (derivedFeatureID) {
				case SentencesPackage.USE_SENTENCE__WATER: return WaterPackage.INCOMPLETE_ELEMENT__WATER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IncompleteElement.class) {
			switch (baseFeatureID) {
				case WaterPackage.INCOMPLETE_ELEMENT__WATER: return SentencesPackage.USE_SENTENCE__WATER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //UseSentenceImpl
