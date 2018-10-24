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

import org.servicifi.gelato.language.cobol.references.FileNameReference;

import org.servicifi.gelato.language.cobol.statements.ErrorHandled;
import org.servicifi.gelato.language.cobol.statements.Read;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ReadImpl#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ReadImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ReadImpl#getKeyName <em>Key Name</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.ReadImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadImpl extends StatementImpl implements Read {
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
	 * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiver()
	 * @generated
	 * @ordered
	 */
	protected Identifier receiver;

	/**
	 * The cached value of the '{@link #getKeyName() <em>Key Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyName()
	 * @generated
	 * @ordered
	 */
	protected Identifier keyName;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected FileNameReference fileName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.READ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Handler> getHandlers() {
		if (handlers == null) {
			handlers = new EObjectContainmentEList<Handler>(Handler.class, this, StatementsPackage.READ__HANDLERS);
		}
		return handlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getReceiver() {
		return receiver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiver(Identifier newReceiver, NotificationChain msgs) {
		Identifier oldReceiver = receiver;
		receiver = newReceiver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.READ__RECEIVER, oldReceiver, newReceiver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiver(Identifier newReceiver) {
		if (newReceiver != receiver) {
			NotificationChain msgs = null;
			if (receiver != null)
				msgs = ((InternalEObject)receiver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.READ__RECEIVER, null, msgs);
			if (newReceiver != null)
				msgs = ((InternalEObject)newReceiver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.READ__RECEIVER, null, msgs);
			msgs = basicSetReceiver(newReceiver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.READ__RECEIVER, newReceiver, newReceiver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Identifier getKeyName() {
		return keyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeyName(Identifier newKeyName, NotificationChain msgs) {
		Identifier oldKeyName = keyName;
		keyName = newKeyName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.READ__KEY_NAME, oldKeyName, newKeyName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyName(Identifier newKeyName) {
		if (newKeyName != keyName) {
			NotificationChain msgs = null;
			if (keyName != null)
				msgs = ((InternalEObject)keyName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.READ__KEY_NAME, null, msgs);
			if (newKeyName != null)
				msgs = ((InternalEObject)newKeyName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.READ__KEY_NAME, null, msgs);
			msgs = basicSetKeyName(newKeyName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.READ__KEY_NAME, newKeyName, newKeyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameReference getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileName(FileNameReference newFileName, NotificationChain msgs) {
		FileNameReference oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.READ__FILE_NAME, oldFileName, newFileName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(FileNameReference newFileName) {
		if (newFileName != fileName) {
			NotificationChain msgs = null;
			if (fileName != null)
				msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.READ__FILE_NAME, null, msgs);
			if (newFileName != null)
				msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.READ__FILE_NAME, null, msgs);
			msgs = basicSetFileName(newFileName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.READ__FILE_NAME, newFileName, newFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.READ__HANDLERS:
				return ((InternalEList<?>)getHandlers()).basicRemove(otherEnd, msgs);
			case StatementsPackage.READ__RECEIVER:
				return basicSetReceiver(null, msgs);
			case StatementsPackage.READ__KEY_NAME:
				return basicSetKeyName(null, msgs);
			case StatementsPackage.READ__FILE_NAME:
				return basicSetFileName(null, msgs);
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
			case StatementsPackage.READ__HANDLERS:
				return getHandlers();
			case StatementsPackage.READ__RECEIVER:
				return getReceiver();
			case StatementsPackage.READ__KEY_NAME:
				return getKeyName();
			case StatementsPackage.READ__FILE_NAME:
				return getFileName();
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
			case StatementsPackage.READ__HANDLERS:
				getHandlers().clear();
				getHandlers().addAll((Collection<? extends Handler>)newValue);
				return;
			case StatementsPackage.READ__RECEIVER:
				setReceiver((Identifier)newValue);
				return;
			case StatementsPackage.READ__KEY_NAME:
				setKeyName((Identifier)newValue);
				return;
			case StatementsPackage.READ__FILE_NAME:
				setFileName((FileNameReference)newValue);
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
			case StatementsPackage.READ__HANDLERS:
				getHandlers().clear();
				return;
			case StatementsPackage.READ__RECEIVER:
				setReceiver((Identifier)null);
				return;
			case StatementsPackage.READ__KEY_NAME:
				setKeyName((Identifier)null);
				return;
			case StatementsPackage.READ__FILE_NAME:
				setFileName((FileNameReference)null);
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
			case StatementsPackage.READ__HANDLERS:
				return handlers != null && !handlers.isEmpty();
			case StatementsPackage.READ__RECEIVER:
				return receiver != null;
			case StatementsPackage.READ__KEY_NAME:
				return keyName != null;
			case StatementsPackage.READ__FILE_NAME:
				return fileName != null;
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
				case StatementsPackage.READ__HANDLERS: return StatementsPackage.ERROR_HANDLED__HANDLERS;
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
				case StatementsPackage.ERROR_HANDLED__HANDLERS: return StatementsPackage.READ__HANDLERS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ReadImpl
