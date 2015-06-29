/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.statements.Corresponding;
import org.servicifi.gelato.language.cobol.statements.Move;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.MoveImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.MoveImpl#getCorresponding <em>Corresponding</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.MoveImpl#getSender <em>Sender</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveImpl extends StatementImpl implements Move {
	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryOperand> receivers;

	/**
	 * The default value of the '{@link #getCorresponding() <em>Corresponding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresponding()
	 * @generated
	 * @ordered
	 */
	protected static final Corresponding CORRESPONDING_EDEFAULT = Corresponding.CORR;

	/**
	 * The cached value of the '{@link #getCorresponding() <em>Corresponding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorresponding()
	 * @generated
	 * @ordered
	 */
	protected Corresponding corresponding = CORRESPONDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected EList<PrimaryOperand> sender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.MOVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryOperand> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<PrimaryOperand>(PrimaryOperand.class, this, StatementsPackage.MOVE__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corresponding getCorresponding() {
		return corresponding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorresponding(Corresponding newCorresponding) {
		Corresponding oldCorresponding = corresponding;
		corresponding = newCorresponding == null ? CORRESPONDING_EDEFAULT : newCorresponding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.MOVE__CORRESPONDING, oldCorresponding, corresponding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrimaryOperand> getSender() {
		if (sender == null) {
			sender = new EObjectContainmentEList<PrimaryOperand>(PrimaryOperand.class, this, StatementsPackage.MOVE__SENDER);
		}
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.MOVE__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
			case StatementsPackage.MOVE__SENDER:
				return ((InternalEList<?>)getSender()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.MOVE__RECEIVERS:
				return getReceivers();
			case StatementsPackage.MOVE__CORRESPONDING:
				return getCorresponding();
			case StatementsPackage.MOVE__SENDER:
				return getSender();
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
			case StatementsPackage.MOVE__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends PrimaryOperand>)newValue);
				return;
			case StatementsPackage.MOVE__CORRESPONDING:
				setCorresponding((Corresponding)newValue);
				return;
			case StatementsPackage.MOVE__SENDER:
				getSender().clear();
				getSender().addAll((Collection<? extends PrimaryOperand>)newValue);
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
			case StatementsPackage.MOVE__RECEIVERS:
				getReceivers().clear();
				return;
			case StatementsPackage.MOVE__CORRESPONDING:
				setCorresponding(CORRESPONDING_EDEFAULT);
				return;
			case StatementsPackage.MOVE__SENDER:
				getSender().clear();
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
			case StatementsPackage.MOVE__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
			case StatementsPackage.MOVE__CORRESPONDING:
				return corresponding != CORRESPONDING_EDEFAULT;
			case StatementsPackage.MOVE__SENDER:
				return sender != null && !sender.isEmpty();
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
		result.append(" (corresponding: ");
		result.append(corresponding);
		result.append(')');
		return result.toString();
	}

} //MoveImpl
