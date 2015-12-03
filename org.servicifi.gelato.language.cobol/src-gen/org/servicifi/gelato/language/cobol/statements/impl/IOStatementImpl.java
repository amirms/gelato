/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.statements.IOFileDescriptor;
import org.servicifi.gelato.language.cobol.statements.IOStatement;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.IOStatementImpl#getIoFileDescriptors <em>Io File Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class IOStatementImpl extends StatementImpl implements IOStatement {
	/**
	 * The cached value of the '{@link #getIoFileDescriptors() <em>Io File Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoFileDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<IOFileDescriptor> ioFileDescriptors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.IO_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOFileDescriptor> getIoFileDescriptors() {
		if (ioFileDescriptors == null) {
			ioFileDescriptors = new EObjectContainmentEList<IOFileDescriptor>(IOFileDescriptor.class, this, StatementsPackage.IO_STATEMENT__IO_FILE_DESCRIPTORS);
		}
		return ioFileDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.IO_STATEMENT__IO_FILE_DESCRIPTORS:
				return ((InternalEList<?>)getIoFileDescriptors()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.IO_STATEMENT__IO_FILE_DESCRIPTORS:
				return getIoFileDescriptors();
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
			case StatementsPackage.IO_STATEMENT__IO_FILE_DESCRIPTORS:
				getIoFileDescriptors().clear();
				getIoFileDescriptors().addAll((Collection<? extends IOFileDescriptor>)newValue);
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
			case StatementsPackage.IO_STATEMENT__IO_FILE_DESCRIPTORS:
				getIoFileDescriptors().clear();
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
			case StatementsPackage.IO_STATEMENT__IO_FILE_DESCRIPTORS:
				return ioFileDescriptors != null && !ioFileDescriptors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IOStatementImpl
