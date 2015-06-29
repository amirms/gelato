/**
 */
package org.servicifi.gelato.language.cobol.ios.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.ios.FileDirective;
import org.servicifi.gelato.language.cobol.ios.InputFile;
import org.servicifi.gelato.language.cobol.ios.IosPackage;

import org.servicifi.gelato.language.cobol.references.FileNameReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.ios.impl.InputFileImpl#getFileNames <em>File Names</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputFileImpl extends InputDirectiveImpl implements InputFile {
	/**
	 * The cached value of the '{@link #getFileNames() <em>File Names</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileNames()
	 * @generated
	 * @ordered
	 */
	protected EList<FileNameReference> fileNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IosPackage.Literals.INPUT_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileNameReference> getFileNames() {
		if (fileNames == null) {
			fileNames = new EObjectContainmentEList<FileNameReference>(FileNameReference.class, this, IosPackage.INPUT_FILE__FILE_NAMES);
		}
		return fileNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IosPackage.INPUT_FILE__FILE_NAMES:
				return ((InternalEList<?>)getFileNames()).basicRemove(otherEnd, msgs);
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
			case IosPackage.INPUT_FILE__FILE_NAMES:
				return getFileNames();
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
			case IosPackage.INPUT_FILE__FILE_NAMES:
				getFileNames().clear();
				getFileNames().addAll((Collection<? extends FileNameReference>)newValue);
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
			case IosPackage.INPUT_FILE__FILE_NAMES:
				getFileNames().clear();
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
			case IosPackage.INPUT_FILE__FILE_NAMES:
				return fileNames != null && !fileNames.isEmpty();
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
		if (baseClass == FileDirective.class) {
			switch (derivedFeatureID) {
				case IosPackage.INPUT_FILE__FILE_NAMES: return IosPackage.FILE_DIRECTIVE__FILE_NAMES;
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
		if (baseClass == FileDirective.class) {
			switch (baseFeatureID) {
				case IosPackage.FILE_DIRECTIVE__FILE_NAMES: return IosPackage.INPUT_FILE__FILE_NAMES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //InputFileImpl
