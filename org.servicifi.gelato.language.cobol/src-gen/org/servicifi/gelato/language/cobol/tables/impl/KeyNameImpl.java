/**
 */
package org.servicifi.gelato.language.cobol.tables.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.tables.KeyName;
import org.servicifi.gelato.language.cobol.tables.SortingOrder;
import org.servicifi.gelato.language.cobol.tables.TablesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Key Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.KeyNameImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.tables.impl.KeyNameImpl#getKeyOrder <em>Key Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeyNameImpl extends EObjectImpl implements KeyName {
	/**
	 * The cached value of the '{@link #getKeys() <em>Keys</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeys()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierReference> keys;

	/**
	 * The default value of the '{@link #getKeyOrder() <em>Key Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyOrder()
	 * @generated
	 * @ordered
	 */
	protected static final SortingOrder KEY_ORDER_EDEFAULT = SortingOrder.ASC;

	/**
	 * The cached value of the '{@link #getKeyOrder() <em>Key Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyOrder()
	 * @generated
	 * @ordered
	 */
	protected SortingOrder keyOrder = KEY_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeyNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablesPackage.Literals.KEY_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifierReference> getKeys() {
		if (keys == null) {
			keys = new EObjectContainmentEList<IdentifierReference>(IdentifierReference.class, this, TablesPackage.KEY_NAME__KEYS);
		}
		return keys;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortingOrder getKeyOrder() {
		return keyOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyOrder(SortingOrder newKeyOrder) {
		SortingOrder oldKeyOrder = keyOrder;
		keyOrder = newKeyOrder == null ? KEY_ORDER_EDEFAULT : newKeyOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablesPackage.KEY_NAME__KEY_ORDER, oldKeyOrder, keyOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablesPackage.KEY_NAME__KEYS:
				return ((InternalEList<?>)getKeys()).basicRemove(otherEnd, msgs);
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
			case TablesPackage.KEY_NAME__KEYS:
				return getKeys();
			case TablesPackage.KEY_NAME__KEY_ORDER:
				return getKeyOrder();
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
			case TablesPackage.KEY_NAME__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends IdentifierReference>)newValue);
				return;
			case TablesPackage.KEY_NAME__KEY_ORDER:
				setKeyOrder((SortingOrder)newValue);
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
			case TablesPackage.KEY_NAME__KEYS:
				getKeys().clear();
				return;
			case TablesPackage.KEY_NAME__KEY_ORDER:
				setKeyOrder(KEY_ORDER_EDEFAULT);
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
			case TablesPackage.KEY_NAME__KEYS:
				return keys != null && !keys.isEmpty();
			case TablesPackage.KEY_NAME__KEY_ORDER:
				return keyOrder != KEY_ORDER_EDEFAULT;
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
		result.append(" (keyOrder: ");
		result.append(keyOrder);
		result.append(')');
		return result.toString();
	}

} //KeyNameImpl
