/**
 */
package org.servicifi.gelato.language.cobol.files.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.servicifi.gelato.language.cobol.files.FileStatus;
import org.servicifi.gelato.language.cobol.files.FilesPackage;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileStatusImpl#getFileStatus <em>File Status</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.FileStatusImpl#getVsamFileStatus <em>Vsam File Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileStatusImpl extends EObjectImpl implements FileStatus {
	/**
	 * The cached value of the '{@link #getFileStatus() <em>File Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileStatus()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference fileStatus;

	/**
	 * The cached value of the '{@link #getVsamFileStatus() <em>Vsam File Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsamFileStatus()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference vsamFileStatus;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.FILE_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getFileStatus() {
		return fileStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileStatus(IdentifierReference newFileStatus, NotificationChain msgs) {
		IdentifierReference oldFileStatus = fileStatus;
		fileStatus = newFileStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FilesPackage.FILE_STATUS__FILE_STATUS, oldFileStatus, newFileStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileStatus(IdentifierReference newFileStatus) {
		if (newFileStatus != fileStatus) {
			NotificationChain msgs = null;
			if (fileStatus != null)
				msgs = ((InternalEObject)fileStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FilesPackage.FILE_STATUS__FILE_STATUS, null, msgs);
			if (newFileStatus != null)
				msgs = ((InternalEObject)newFileStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FilesPackage.FILE_STATUS__FILE_STATUS, null, msgs);
			msgs = basicSetFileStatus(newFileStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.FILE_STATUS__FILE_STATUS, newFileStatus, newFileStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getVsamFileStatus() {
		return vsamFileStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVsamFileStatus(IdentifierReference newVsamFileStatus, NotificationChain msgs) {
		IdentifierReference oldVsamFileStatus = vsamFileStatus;
		vsamFileStatus = newVsamFileStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FilesPackage.FILE_STATUS__VSAM_FILE_STATUS, oldVsamFileStatus, newVsamFileStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsamFileStatus(IdentifierReference newVsamFileStatus) {
		if (newVsamFileStatus != vsamFileStatus) {
			NotificationChain msgs = null;
			if (vsamFileStatus != null)
				msgs = ((InternalEObject)vsamFileStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FilesPackage.FILE_STATUS__VSAM_FILE_STATUS, null, msgs);
			if (newVsamFileStatus != null)
				msgs = ((InternalEObject)newVsamFileStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FilesPackage.FILE_STATUS__VSAM_FILE_STATUS, null, msgs);
			msgs = basicSetVsamFileStatus(newVsamFileStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.FILE_STATUS__VSAM_FILE_STATUS, newVsamFileStatus, newVsamFileStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesPackage.FILE_STATUS__FILE_STATUS:
				return basicSetFileStatus(null, msgs);
			case FilesPackage.FILE_STATUS__VSAM_FILE_STATUS:
				return basicSetVsamFileStatus(null, msgs);
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
			case FilesPackage.FILE_STATUS__FILE_STATUS:
				return getFileStatus();
			case FilesPackage.FILE_STATUS__VSAM_FILE_STATUS:
				return getVsamFileStatus();
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
			case FilesPackage.FILE_STATUS__FILE_STATUS:
				setFileStatus((IdentifierReference)newValue);
				return;
			case FilesPackage.FILE_STATUS__VSAM_FILE_STATUS:
				setVsamFileStatus((IdentifierReference)newValue);
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
			case FilesPackage.FILE_STATUS__FILE_STATUS:
				setFileStatus((IdentifierReference)null);
				return;
			case FilesPackage.FILE_STATUS__VSAM_FILE_STATUS:
				setVsamFileStatus((IdentifierReference)null);
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
			case FilesPackage.FILE_STATUS__FILE_STATUS:
				return fileStatus != null;
			case FilesPackage.FILE_STATUS__VSAM_FILE_STATUS:
				return vsamFileStatus != null;
		}
		return super.eIsSet(featureID);
	}

} //FileStatusImpl
