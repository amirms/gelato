/**
 */
package org.servicifi.gelato.language.cobol.files.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.servicifi.gelato.language.cobol.files.FileStatus;
import org.servicifi.gelato.language.cobol.files.FilesPackage;
import org.servicifi.gelato.language.cobol.files.SelectStatement;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

import org.servicifi.gelato.language.cobol.water.impl.IncompleteElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl#getFileStatus <em>File Status</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl#isIsOptional <em>Is Optional</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl#getExternalFileNames <em>External File Names</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.files.impl.SelectStatementImpl#getFileNameReference <em>File Name Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectStatementImpl extends IncompleteElementImpl implements SelectStatement {
	/**
	 * The cached value of the '{@link #getFileStatus() <em>File Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileStatus()
	 * @generated
	 * @ordered
	 */
	protected FileStatus fileStatus;

	/**
	 * The default value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOptional() <em>Is Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean isOptional = IS_OPTIONAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalFileNames() <em>External File Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> externalFileNames;

	/**
	 * The cached value of the '{@link #getFileNameReference() <em>File Name Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileNameReference()
	 * @generated
	 * @ordered
	 */
	protected FileNameReference fileNameReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FilesPackage.Literals.SELECT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileStatus getFileStatus() {
		return fileStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileStatus(FileStatus newFileStatus, NotificationChain msgs) {
		FileStatus oldFileStatus = fileStatus;
		fileStatus = newFileStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FilesPackage.SELECT_STATEMENT__FILE_STATUS, oldFileStatus, newFileStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileStatus(FileStatus newFileStatus) {
		if (newFileStatus != fileStatus) {
			NotificationChain msgs = null;
			if (fileStatus != null)
				msgs = ((InternalEObject)fileStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FilesPackage.SELECT_STATEMENT__FILE_STATUS, null, msgs);
			if (newFileStatus != null)
				msgs = ((InternalEObject)newFileStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FilesPackage.SELECT_STATEMENT__FILE_STATUS, null, msgs);
			msgs = basicSetFileStatus(newFileStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SELECT_STATEMENT__FILE_STATUS, newFileStatus, newFileStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOptional() {
		return isOptional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOptional(boolean newIsOptional) {
		boolean oldIsOptional = isOptional;
		isOptional = newIsOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SELECT_STATEMENT__IS_OPTIONAL, oldIsOptional, isOptional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExternalFileNames() {
		if (externalFileNames == null) {
			externalFileNames = new EDataTypeUniqueEList<String>(String.class, this, FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES);
		}
		return externalFileNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameReference getFileNameReference() {
		return fileNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFileNameReference(FileNameReference newFileNameReference, NotificationChain msgs) {
		FileNameReference oldFileNameReference = fileNameReference;
		fileNameReference = newFileNameReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE, oldFileNameReference, newFileNameReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileNameReference(FileNameReference newFileNameReference) {
		if (newFileNameReference != fileNameReference) {
			NotificationChain msgs = null;
			if (fileNameReference != null)
				msgs = ((InternalEObject)fileNameReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE, null, msgs);
			if (newFileNameReference != null)
				msgs = ((InternalEObject)newFileNameReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE, null, msgs);
			msgs = basicSetFileNameReference(newFileNameReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE, newFileNameReference, newFileNameReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FilesPackage.SELECT_STATEMENT__FILE_STATUS:
				return basicSetFileStatus(null, msgs);
			case FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE:
				return basicSetFileNameReference(null, msgs);
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
			case FilesPackage.SELECT_STATEMENT__FILE_STATUS:
				return getFileStatus();
			case FilesPackage.SELECT_STATEMENT__IS_OPTIONAL:
				return isIsOptional();
			case FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES:
				return getExternalFileNames();
			case FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE:
				return getFileNameReference();
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
			case FilesPackage.SELECT_STATEMENT__FILE_STATUS:
				setFileStatus((FileStatus)newValue);
				return;
			case FilesPackage.SELECT_STATEMENT__IS_OPTIONAL:
				setIsOptional((Boolean)newValue);
				return;
			case FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES:
				getExternalFileNames().clear();
				getExternalFileNames().addAll((Collection<? extends String>)newValue);
				return;
			case FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE:
				setFileNameReference((FileNameReference)newValue);
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
			case FilesPackage.SELECT_STATEMENT__FILE_STATUS:
				setFileStatus((FileStatus)null);
				return;
			case FilesPackage.SELECT_STATEMENT__IS_OPTIONAL:
				setIsOptional(IS_OPTIONAL_EDEFAULT);
				return;
			case FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES:
				getExternalFileNames().clear();
				return;
			case FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE:
				setFileNameReference((FileNameReference)null);
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
			case FilesPackage.SELECT_STATEMENT__FILE_STATUS:
				return fileStatus != null;
			case FilesPackage.SELECT_STATEMENT__IS_OPTIONAL:
				return isOptional != IS_OPTIONAL_EDEFAULT;
			case FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES:
				return externalFileNames != null && !externalFileNames.isEmpty();
			case FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE:
				return fileNameReference != null;
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
		result.append(" (isOptional: ");
		result.append(isOptional);
		result.append(", externalFileNames: ");
		result.append(externalFileNames);
		result.append(')');
		return result.toString();
	}

} //SelectStatementImpl
