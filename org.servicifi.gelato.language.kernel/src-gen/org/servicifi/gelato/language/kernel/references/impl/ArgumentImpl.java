/**
 */
package org.servicifi.gelato.language.kernel.references.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.kernel.parameters.Parameter;

import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.references.impl.ArgumentImpl#isByReference <em>By Reference</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.references.impl.ArgumentImpl#getCorrespondingParameter <em>Corresponding Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends ElementReferenceImpl implements Argument {
	/**
	 * The default value of the '{@link #isByReference() <em>By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isByReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BY_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isByReference() <em>By Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isByReference()
	 * @generated
	 * @ordered
	 */
	protected boolean byReference = BY_REFERENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCorrespondingParameter() <em>Corresponding Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter correspondingParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReferencesPackage.Literals.ARGUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isByReference() {
		return byReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByReference(boolean newByReference) {
		boolean oldByReference = byReference;
		byReference = newByReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.ARGUMENT__BY_REFERENCE, oldByReference, byReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getCorrespondingParameter() {
		if (correspondingParameter != null && correspondingParameter.eIsProxy()) {
			InternalEObject oldCorrespondingParameter = (InternalEObject)correspondingParameter;
			correspondingParameter = (Parameter)eResolveProxy(oldCorrespondingParameter);
			if (correspondingParameter != oldCorrespondingParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER, oldCorrespondingParameter, correspondingParameter));
			}
		}
		return correspondingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetCorrespondingParameter() {
		return correspondingParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingParameter(Parameter newCorrespondingParameter) {
		Parameter oldCorrespondingParameter = correspondingParameter;
		correspondingParameter = newCorrespondingParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER, oldCorrespondingParameter, correspondingParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReferencesPackage.ARGUMENT__BY_REFERENCE:
				return isByReference();
			case ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER:
				if (resolve) return getCorrespondingParameter();
				return basicGetCorrespondingParameter();
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
			case ReferencesPackage.ARGUMENT__BY_REFERENCE:
				setByReference((Boolean)newValue);
				return;
			case ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER:
				setCorrespondingParameter((Parameter)newValue);
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
			case ReferencesPackage.ARGUMENT__BY_REFERENCE:
				setByReference(BY_REFERENCE_EDEFAULT);
				return;
			case ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER:
				setCorrespondingParameter((Parameter)null);
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
			case ReferencesPackage.ARGUMENT__BY_REFERENCE:
				return byReference != BY_REFERENCE_EDEFAULT;
			case ReferencesPackage.ARGUMENT__CORRESPONDING_PARAMETER:
				return correspondingParameter != null;
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
		result.append(" (byReference: ");
		result.append(byReference);
		result.append(')');
		return result.toString();
	}

} //ArgumentImpl
