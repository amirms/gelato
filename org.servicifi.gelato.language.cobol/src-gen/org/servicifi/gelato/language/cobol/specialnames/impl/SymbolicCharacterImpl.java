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

import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;

import org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage;
import org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbolic Character</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.specialnames.impl.SymbolicCharacterImpl#getIntegers <em>Integers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolicCharacterImpl extends SpecialNameImpl implements SymbolicCharacter {
	/**
	 * The cached value of the '{@link #getIntegers() <em>Integers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegers()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegerLiteral> integers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicCharacterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpecialnamesPackage.Literals.SYMBOLIC_CHARACTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntegerLiteral> getIntegers() {
		if (integers == null) {
			integers = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS);
		}
		return integers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS:
				return ((InternalEList<?>)getIntegers()).basicRemove(otherEnd, msgs);
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS:
				return getIntegers();
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS:
				getIntegers().clear();
				getIntegers().addAll((Collection<? extends IntegerLiteral>)newValue);
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS:
				getIntegers().clear();
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
			case SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS:
				return integers != null && !integers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SymbolicCharacterImpl
