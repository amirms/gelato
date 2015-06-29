/**
 */
package org.servicifi.gelato.language.cobol.strings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.strings.ManipulatedStrings;
import org.servicifi.gelato.language.cobol.strings.StringsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manipulated Strings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.ManipulatedStringsImpl#getStrings <em>Strings</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.strings.impl.ManipulatedStringsImpl#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ManipulatedStringsImpl extends StringImpl implements ManipulatedStrings {
	/**
	 * The cached value of the '{@link #getStrings() <em>Strings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierReference> strings;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand delimiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManipulatedStringsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StringsPackage.Literals.MANIPULATED_STRINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdentifierReference> getStrings() {
		if (strings == null) {
			strings = new EObjectContainmentEList<IdentifierReference>(IdentifierReference.class, this, StringsPackage.MANIPULATED_STRINGS__STRINGS);
		}
		return strings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelimiter(PrimaryOperand newDelimiter, NotificationChain msgs) {
		PrimaryOperand oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StringsPackage.MANIPULATED_STRINGS__DELIMITER, oldDelimiter, newDelimiter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelimiter(PrimaryOperand newDelimiter) {
		if (newDelimiter != delimiter) {
			NotificationChain msgs = null;
			if (delimiter != null)
				msgs = ((InternalEObject)delimiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StringsPackage.MANIPULATED_STRINGS__DELIMITER, null, msgs);
			if (newDelimiter != null)
				msgs = ((InternalEObject)newDelimiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StringsPackage.MANIPULATED_STRINGS__DELIMITER, null, msgs);
			msgs = basicSetDelimiter(newDelimiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StringsPackage.MANIPULATED_STRINGS__DELIMITER, newDelimiter, newDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StringsPackage.MANIPULATED_STRINGS__STRINGS:
				return ((InternalEList<?>)getStrings()).basicRemove(otherEnd, msgs);
			case StringsPackage.MANIPULATED_STRINGS__DELIMITER:
				return basicSetDelimiter(null, msgs);
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
			case StringsPackage.MANIPULATED_STRINGS__STRINGS:
				return getStrings();
			case StringsPackage.MANIPULATED_STRINGS__DELIMITER:
				return getDelimiter();
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
			case StringsPackage.MANIPULATED_STRINGS__STRINGS:
				getStrings().clear();
				getStrings().addAll((Collection<? extends IdentifierReference>)newValue);
				return;
			case StringsPackage.MANIPULATED_STRINGS__DELIMITER:
				setDelimiter((PrimaryOperand)newValue);
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
			case StringsPackage.MANIPULATED_STRINGS__STRINGS:
				getStrings().clear();
				return;
			case StringsPackage.MANIPULATED_STRINGS__DELIMITER:
				setDelimiter((PrimaryOperand)null);
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
			case StringsPackage.MANIPULATED_STRINGS__STRINGS:
				return strings != null && !strings.isEmpty();
			case StringsPackage.MANIPULATED_STRINGS__DELIMITER:
				return delimiter != null;
		}
		return super.eIsSet(featureID);
	}

} //ManipulatedStringsImpl
