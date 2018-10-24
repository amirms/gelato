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

import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;

import org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType;
import org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Explicit Alphabet Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.ExplicitAlphabetTypeImpl#getRange <em>Range</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExplicitAlphabetTypeImpl extends AlphabetTypeImpl implements ExplicitAlphabetType {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<RangeExpression> range;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExplicitAlphabetTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecialnamesPackage.Literals.EXPLICIT_ALPHABET_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RangeExpression> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList<RangeExpression>(RangeExpression.class, this, SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
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
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE__RANGE:
				return getRange();
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
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends RangeExpression>)newValue);
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
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE__RANGE:
				getRange().clear();
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
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE__RANGE:
				return range != null && !range.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExplicitAlphabetTypeImpl
