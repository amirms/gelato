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

import org.servicifi.gelato.language.cobol.handlers.Handler;

import org.servicifi.gelato.language.cobol.identifiers.Identifier;

import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;

import org.servicifi.gelato.language.cobol.references.MnemonicNameReference;

import org.servicifi.gelato.language.cobol.statements.ErrorHandled;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl#getRecordName <em>Record Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl#getNumLines <em>Num Lines</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl#getMnemonicName <em>Mnemonic Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl#getSender <em>Sender</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteImpl extends StatementImpl implements Write {
	/**
	 * The cached value of the '{@link #getHandlers() <em>Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<Handler> handlers;

	/**
	 * The cached value of the '{@link #getRecordName() <em>Record Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordName()
	 * @generated
	 * @ordered
	 */
	protected Identifier recordName;

	/**
	 * The cached value of the '{@link #getNumLines() <em>Num Lines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumLines()
	 * @generated
	 * @ordered
	 */
	protected Identifier numLines;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected IntegerLiteral integer;

	/**
	 * The cached value of the '{@link #getMnemonicName() <em>Mnemonic Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMnemonicName()
	 * @generated
	 * @ordered
	 */
	protected MnemonicNameReference mnemonicName;

	/**
	 * The cached value of the '{@link #getSender() <em>Sender</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSender()
	 * @generated
	 * @ordered
	 */
	protected Identifier sender;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WriteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.WRITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, StatementsPackage.WRITE__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getRecordName() {
		return recordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecordName(Identifier newRecordName, NotificationChain msgs) {
		Identifier oldRecordName = recordName;
		recordName = newRecordName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__RECORD_NAME, oldRecordName, newRecordName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordName(Identifier newRecordName) {
		if (newRecordName != recordName) {
			NotificationChain msgs = null;
			if (recordName != null)
				msgs = ((InternalEObject)recordName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__RECORD_NAME, null, msgs);
			if (newRecordName != null)
				msgs = ((InternalEObject)newRecordName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__RECORD_NAME, null, msgs);
			msgs = basicSetRecordName(newRecordName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__RECORD_NAME, newRecordName, newRecordName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getNumLines() {
		return numLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNumLines(Identifier newNumLines, NotificationChain msgs) {
		Identifier oldNumLines = numLines;
		numLines = newNumLines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__NUM_LINES, oldNumLines, newNumLines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumLines(Identifier newNumLines) {
		if (newNumLines != numLines) {
			NotificationChain msgs = null;
			if (numLines != null)
				msgs = ((InternalEObject)numLines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__NUM_LINES, null, msgs);
			if (newNumLines != null)
				msgs = ((InternalEObject)newNumLines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__NUM_LINES, null, msgs);
			msgs = basicSetNumLines(newNumLines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__NUM_LINES, newNumLines, newNumLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerLiteral getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteger(IntegerLiteral newInteger, NotificationChain msgs) {
		IntegerLiteral oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__INTEGER, oldInteger, newInteger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(IntegerLiteral newInteger) {
		if (newInteger != integer) {
			NotificationChain msgs = null;
			if (integer != null)
				msgs = ((InternalEObject)integer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__INTEGER, null, msgs);
			if (newInteger != null)
				msgs = ((InternalEObject)newInteger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__INTEGER, null, msgs);
			msgs = basicSetInteger(newInteger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__INTEGER, newInteger, newInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MnemonicNameReference getMnemonicName() {
		return mnemonicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMnemonicName(MnemonicNameReference newMnemonicName, NotificationChain msgs) {
		MnemonicNameReference oldMnemonicName = mnemonicName;
		mnemonicName = newMnemonicName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__MNEMONIC_NAME, oldMnemonicName, newMnemonicName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMnemonicName(MnemonicNameReference newMnemonicName) {
		if (newMnemonicName != mnemonicName) {
			NotificationChain msgs = null;
			if (mnemonicName != null)
				msgs = ((InternalEObject)mnemonicName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__MNEMONIC_NAME, null, msgs);
			if (newMnemonicName != null)
				msgs = ((InternalEObject)newMnemonicName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__MNEMONIC_NAME, null, msgs);
			msgs = basicSetMnemonicName(newMnemonicName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__MNEMONIC_NAME, newMnemonicName, newMnemonicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getSender() {
		return sender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSender(Identifier newSender, NotificationChain msgs) {
		Identifier oldSender = sender;
		sender = newSender;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__SENDER, oldSender, newSender);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSender(Identifier newSender) {
		if (newSender != sender) {
			NotificationChain msgs = null;
			if (sender != null)
				msgs = ((InternalEObject)sender).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__SENDER, null, msgs);
			if (newSender != null)
				msgs = ((InternalEObject)newSender).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WRITE__SENDER, null, msgs);
			msgs = basicSetSender(newSender, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WRITE__SENDER, newSender, newSender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.WRITE__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case StatementsPackage.WRITE__RECORD_NAME:
				return basicSetRecordName(null, msgs);
			case StatementsPackage.WRITE__NUM_LINES:
				return basicSetNumLines(null, msgs);
			case StatementsPackage.WRITE__INTEGER:
				return basicSetInteger(null, msgs);
			case StatementsPackage.WRITE__MNEMONIC_NAME:
				return basicSetMnemonicName(null, msgs);
			case StatementsPackage.WRITE__SENDER:
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
			case StatementsPackage.WRITE__HANDLERS:
				return getHandlers();
			case StatementsPackage.WRITE__RECORD_NAME:
				return getRecordName();
			case StatementsPackage.WRITE__NUM_LINES:
				return getNumLines();
			case StatementsPackage.WRITE__INTEGER:
				return getInteger();
			case StatementsPackage.WRITE__MNEMONIC_NAME:
				return getMnemonicName();
			case StatementsPackage.WRITE__SENDER:
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
			case StatementsPackage.WRITE__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case StatementsPackage.WRITE__RECORD_NAME:
				setRecordName((Identifier)newValue);
				return;
			case StatementsPackage.WRITE__NUM_LINES:
				setNumLines((Identifier)newValue);
				return;
			case StatementsPackage.WRITE__INTEGER:
				setInteger((IntegerLiteral)newValue);
				return;
			case StatementsPackage.WRITE__MNEMONIC_NAME:
				setMnemonicName((MnemonicNameReference)newValue);
				return;
			case StatementsPackage.WRITE__SENDER:
				setSender((Identifier)newValue);
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
			case StatementsPackage.WRITE__HANDLERS:
				getHandlers().clear();
				return;
			case StatementsPackage.WRITE__RECORD_NAME:
				setRecordName((Identifier)null);
				return;
			case StatementsPackage.WRITE__NUM_LINES:
				setNumLines((Identifier)null);
				return;
			case StatementsPackage.WRITE__INTEGER:
				setInteger((IntegerLiteral)null);
				return;
			case StatementsPackage.WRITE__MNEMONIC_NAME:
				setMnemonicName((MnemonicNameReference)null);
				return;
			case StatementsPackage.WRITE__SENDER:
				setSender((Identifier)null);
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
			case StatementsPackage.WRITE__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case StatementsPackage.WRITE__RECORD_NAME:
				return recordName != null;
			case StatementsPackage.WRITE__NUM_LINES:
				return numLines != null;
			case StatementsPackage.WRITE__INTEGER:
				return integer != null;
			case StatementsPackage.WRITE__MNEMONIC_NAME:
				return mnemonicName != null;
			case StatementsPackage.WRITE__SENDER:
				return sender != null;
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
		if (baseClass == ErrorHandled.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.WRITE__HANDLERS: return StatementsPackage.ERROR_HANDLED__HANDLERS;
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
		if (baseClass == ErrorHandled.class) {
			switch (baseFeatureID) {
				case StatementsPackage.ERROR_HANDLED__HANDLERS: return StatementsPackage.WRITE__HANDLERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //WriteImpl
