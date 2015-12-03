/**
 */
package org.servicifi.gelato.language.cobol.sections.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.files.FileName;

import org.servicifi.gelato.language.cobol.sections.FileSection;
import org.servicifi.gelato.language.cobol.sections.SectionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.sections.impl.FileSectionImpl#getFileDescriptors <em>File Descriptors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileSectionImpl extends DataDivisionSectionImpl implements FileSection {
	/**
	 * The cached value of the '{@link #getFileDescriptors() <em>File Descriptors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileDescriptors()
	 * @generated
	 * @ordered
	 */
	protected EList<FileName> fileDescriptors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SectionsPackage.Literals.FILE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileName> getFileDescriptors() {
		if (fileDescriptors == null) {
			fileDescriptors = new EObjectContainmentEList<FileName>(FileName.class, this, SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS);
		}
		return fileDescriptors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS:
				return ((InternalEList<?>)getFileDescriptors()).basicRemove(otherEnd, msgs);
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
			case SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS:
				return getFileDescriptors();
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
			case SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS:
				getFileDescriptors().clear();
				getFileDescriptors().addAll((Collection<? extends FileName>)newValue);
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
			case SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS:
				getFileDescriptors().clear();
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
			case SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS:
				return fileDescriptors != null && !fileDescriptors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileSectionImpl
