/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.statements.Release;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Release</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ReleaseImpl#getRecordName <em>Record Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ReleaseImpl#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReleaseImpl extends StatementImpl implements Release {
	/**
	 * The cached value of the '{@link #getRecordName() <em>Record Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordName()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference recordName;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference sender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReleaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.RELEASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getRecordName() {
		return recordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordName(IdentifierReference newRecordName, NotificationChain msgs) {
		IdentifierReference oldRecordName = recordName;
		recordName = newRecordName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.RELEASE__RECORD_NAME, oldRecordName, newRecordName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordName(IdentifierReference newRecordName) {
		if (newRecordName != recordName) {
			NotificationChain msgs = null;
			if (recordName != null)
				msgs = ((InternalEObject)recordName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.RELEASE__RECORD_NAME, null, msgs);
			if (newRecordName != null)
				msgs = ((InternalEObject)newRecordName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.RELEASE__RECORD_NAME, null, msgs);
			msgs = basicSetRecordName(newRecordName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.RELEASE__RECORD_NAME, newRecordName, newRecordName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(IdentifierReference newSender, NotificationChain msgs) {
		IdentifierReference oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.RELEASE__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(IdentifierReference newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.RELEASE__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.RELEASE__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.RELEASE__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.RELEASE__RECORD_NAME:
				return basicSetRecordName(null, msgs);
			case StatementsPackage.RELEASE__SENDER:
				return basicSetSender(null, msgs);
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
			case StatementsPackage.RELEASE__RECORD_NAME:
				return getRecordName();
			case StatementsPackage.RELEASE__SENDER:
				return getSender();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementsPackage.RELEASE__RECORD_NAME:
				setRecordName((IdentifierReference)newValue);
				return;
			case StatementsPackage.RELEASE__SENDER:
				setSender((IdentifierReference)newValue);
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
			case StatementsPackage.RELEASE__RECORD_NAME:
				setRecordName((IdentifierReference)null);
				return;
			case StatementsPackage.RELEASE__SENDER:
				setSender((IdentifierReference)null);
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
			case StatementsPackage.RELEASE__RECORD_NAME:
				return recordName != null;
			case StatementsPackage.RELEASE__SENDER:
				return sender != null;
		}
		return super.eIsSet(featureID);
	}

} //ReleaseImpl
