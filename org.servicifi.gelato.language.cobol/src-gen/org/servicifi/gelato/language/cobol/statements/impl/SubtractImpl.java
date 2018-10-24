/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.Subtract;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subtract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.SubtractImpl#getFroms <em>Froms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubtractImpl extends ArithmeticStatementImpl implements Subtract {
	/**
	 * The cached value of the '{@link #getFroms() <em>Froms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFroms()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperand> froms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.SUBTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperand> getFroms() {
		if (froms == null) {
			froms = new EObjectContainmentEList<ArithmeticOperand>(ArithmeticOperand.class, this, StatementsPackage.SUBTRACT__FROMS);
		}
		return froms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.SUBTRACT__FROMS:
				return ((InternalEList<?>)getFroms()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.SUBTRACT__FROMS:
				return getFroms();
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
			case StatementsPackage.SUBTRACT__FROMS:
				getFroms().clear();
				getFroms().addAll((Collection<? extends ArithmeticOperand>)newValue);
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
			case StatementsPackage.SUBTRACT__FROMS:
				getFroms().clear();
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
			case StatementsPackage.SUBTRACT__FROMS:
				return froms != null && !froms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubtractImpl
