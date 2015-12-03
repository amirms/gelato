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

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;

import org.servicifi.gelato.language.cobol.statements.Divide;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Divide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.DivideImpl#getIntos <em>Intos</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.DivideImpl#getRemainders <em>Remainders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DivideImpl extends ArithmeticStatementImpl implements Divide {
	/**
	 * The cached value of the '{@link #getIntos() <em>Intos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntos()
	 * @generated
	 * @ordered
	 */
	protected EList<ArithmeticOperand> intos;

	/**
	 * The cached value of the '{@link #getRemainders() <em>Remainders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainders()
	 * @generated
	 * @ordered
	 */
	protected EList<Identifier> remainders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DivideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.DIVIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArithmeticOperand> getIntos() {
		if (intos == null) {
			intos = new EObjectContainmentEList<ArithmeticOperand>(ArithmeticOperand.class, this, StatementsPackage.DIVIDE__INTOS);
		}
		return intos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Identifier> getRemainders() {
		if (remainders == null) {
			remainders = new EObjectContainmentEList<Identifier>(Identifier.class, this, StatementsPackage.DIVIDE__REMAINDERS);
		}
		return remainders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.DIVIDE__INTOS:
				return ((InternalEList<?>)getIntos()).basicRemove(otherEnd, msgs);
			case StatementsPackage.DIVIDE__REMAINDERS:
				return ((InternalEList<?>)getRemainders()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.DIVIDE__INTOS:
				return getIntos();
			case StatementsPackage.DIVIDE__REMAINDERS:
				return getRemainders();
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
			case StatementsPackage.DIVIDE__INTOS:
				getIntos().clear();
				getIntos().addAll((Collection<? extends ArithmeticOperand>)newValue);
				return;
			case StatementsPackage.DIVIDE__REMAINDERS:
				getRemainders().clear();
				getRemainders().addAll((Collection<? extends Identifier>)newValue);
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
			case StatementsPackage.DIVIDE__INTOS:
				getIntos().clear();
				return;
			case StatementsPackage.DIVIDE__REMAINDERS:
				getRemainders().clear();
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
			case StatementsPackage.DIVIDE__INTOS:
				return intos != null && !intos.isEmpty();
			case StatementsPackage.DIVIDE__REMAINDERS:
				return remainders != null && !remainders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DivideImpl
