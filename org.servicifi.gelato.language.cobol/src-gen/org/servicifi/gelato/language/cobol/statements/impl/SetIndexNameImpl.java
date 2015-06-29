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

import org.servicifi.gelato.language.cobol.references.IndexNameReference;

import org.servicifi.gelato.language.cobol.statements.Adjustings;
import org.servicifi.gelato.language.cobol.statements.SetIndexName;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Index Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.SetIndexNameImpl#getAdjust <em>Adjust</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.SetIndexNameImpl#getReceivers <em>Receivers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetIndexNameImpl extends SetStatementImpl implements SetIndexName {
	/**
	 * The default value of the '{@link #getAdjust() <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjust()
	 * @generated
	 * @ordered
	 */
	protected static final Adjustings ADJUST_EDEFAULT = Adjustings.UP;

	/**
	 * The cached value of the '{@link #getAdjust() <em>Adjust</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdjust()
	 * @generated
	 * @ordered
	 */
	protected Adjustings adjust = ADJUST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<IndexNameReference> receivers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetIndexNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.SET_INDEX_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adjustings getAdjust() {
		return adjust;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdjust(Adjustings newAdjust) {
		Adjustings oldAdjust = adjust;
		adjust = newAdjust == null ? ADJUST_EDEFAULT : newAdjust;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.SET_INDEX_NAME__ADJUST, oldAdjust, adjust));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IndexNameReference> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectContainmentEList<IndexNameReference>(IndexNameReference.class, this, StatementsPackage.SET_INDEX_NAME__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.SET_INDEX_NAME__RECEIVERS:
				return ((InternalEList<?>)getReceivers()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.SET_INDEX_NAME__ADJUST:
				return getAdjust();
			case StatementsPackage.SET_INDEX_NAME__RECEIVERS:
				return getReceivers();
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
			case StatementsPackage.SET_INDEX_NAME__ADJUST:
				setAdjust((Adjustings)newValue);
				return;
			case StatementsPackage.SET_INDEX_NAME__RECEIVERS:
				getReceivers().clear();
				getReceivers().addAll((Collection<? extends IndexNameReference>)newValue);
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
			case StatementsPackage.SET_INDEX_NAME__ADJUST:
				setAdjust(ADJUST_EDEFAULT);
				return;
			case StatementsPackage.SET_INDEX_NAME__RECEIVERS:
				getReceivers().clear();
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
			case StatementsPackage.SET_INDEX_NAME__ADJUST:
				return adjust != ADJUST_EDEFAULT;
			case StatementsPackage.SET_INDEX_NAME__RECEIVERS:
				return receivers != null && !receivers.isEmpty();
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
		result.append(" (adjust: ");
		result.append(adjust);
		result.append(')');
		return result.toString();
	}

} //SetIndexNameImpl
