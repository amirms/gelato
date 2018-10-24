/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

import org.servicifi.gelato.language.cobol.statements.IOFile;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

import org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileImpl#getFileName <em>File Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOFileImpl extends IncompleteElementImpl implements IOFile {
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
	protected IOFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.IO_FILE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.IO_FILE__FILE_NAME, oldFileName, newFileName);
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
				msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IO_FILE__FILE_NAME, null, msgs);
			if (newFileName != null)
				msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.IO_FILE__FILE_NAME, null, msgs);
			msgs = basicSetFileName(newFileName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.IO_FILE__FILE_NAME, newFileName, newFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.IO_FILE__FILE_NAME:
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
			case StatementsPackage.IO_FILE__FILE_NAME:
				return getFileName();
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
			case StatementsPackage.IO_FILE__FILE_NAME:
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
			case StatementsPackage.IO_FILE__FILE_NAME:
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
			case StatementsPackage.IO_FILE__FILE_NAME:
				return fileName != null;
		}
		return super.eIsSet(featureID);
	}

} //IOFileImpl
