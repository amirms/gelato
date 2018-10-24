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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.statements.IOFile;
import org.servicifi.gelato.language.cobol.statements.IOFileDescriptor;
import org.servicifi.gelato.language.cobol.statements.IOTypes;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO File Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileDescriptorImpl#getIoFiles <em>Io Files</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileDescriptorImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IOFileDescriptorImpl extends EObjectImpl implements IOFileDescriptor {
	/**
	 * The cached value of the '{@link #getIoFiles() <em>Io Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<IOFile> ioFiles;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IOTypes TYPE_EDEFAULT = IOTypes.INPUT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IOTypes type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOFileDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.IO_FILE_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOFile> getIoFiles() {
		if (ioFiles == null) {
			ioFiles = new EObjectContainmentEList<IOFile>(IOFile.class, this, StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES);
		}
		return ioFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IOTypes newType) {
		IOTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.IO_FILE_DESCRIPTOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES:
				return ((InternalEList<?>)getIoFiles()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES:
				return getIoFiles();
			case StatementsPackage.IO_FILE_DESCRIPTOR__TYPE:
				return getType();
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
			case StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES:
				getIoFiles().clear();
				getIoFiles().addAll((Collection<? extends IOFile>)newValue);
				return;
			case StatementsPackage.IO_FILE_DESCRIPTOR__TYPE:
				setType((IOTypes)newValue);
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
			case StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES:
				getIoFiles().clear();
				return;
			case StatementsPackage.IO_FILE_DESCRIPTOR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES:
				return ioFiles != null && !ioFiles.isEmpty();
			case StatementsPackage.IO_FILE_DESCRIPTOR__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //IOFileDescriptorImpl
