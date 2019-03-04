/**
 */
package org.servicifi.gelato.language.kernel.parameters.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.dataitems.impl.DataItemImpl;
import org.servicifi.gelato.language.kernel.parameters.Parameter;
import org.servicifi.gelato.language.kernel.parameters.ParametersPackage;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.impl.ElementReferenceImpl;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.parameters.impl.ParameterImpl#getCorrespondingArgument <em>Corresponding Argument</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.parameters.impl.ParameterImpl#isByReference <em>By Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterImpl extends DataItemImpl implements Parameter {
	/**
	 * The cached value of the '{@link #getCorrespondingArgument() <em>Corresponding Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrespondingArgument()
	 * @generated
	 * @ordered
	 */
	protected Map<ProcedureCall, Argument> correspondingArgument;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParametersPackage.Literals.PARAMETER;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<ProcedureCall, Argument> getCorrespondingArgument() {
		return correspondingArgument;
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	public Variable getCorrespondingArgument() {
//		
//		ProcedureCall caller = (ProcedureCall)this.eContainer;
//		Procedure callee = (Procedure)caller.getTarget();
//		
//		for (int i = 0; i < caller.getParameters().size(); i++)
//			if (caller.getParameters().get(i).equals(this))
//				return callee.getArguments().get(i); 
//		
//		return null;
//		
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrespondingArgument(Map<ProcedureCall, Argument> newCorrespondingArgument) {
		Map<ProcedureCall, Argument> oldCorrespondingArgument = correspondingArgument;
		correspondingArgument = newCorrespondingArgument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER__CORRESPONDING_ARGUMENT, oldCorrespondingArgument, correspondingArgument));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ParametersPackage.PARAMETER__BY_REFERENCE, oldByReference, byReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ParametersPackage.PARAMETER__CORRESPONDING_ARGUMENT:
				return getCorrespondingArgument();
			case ParametersPackage.PARAMETER__BY_REFERENCE:
				return isByReference();
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
			case ParametersPackage.PARAMETER__CORRESPONDING_ARGUMENT:
				setCorrespondingArgument((Map<ProcedureCall, Argument>)newValue);
				return;
			case ParametersPackage.PARAMETER__BY_REFERENCE:
				setByReference((Boolean)newValue);
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
			case ParametersPackage.PARAMETER__CORRESPONDING_ARGUMENT:
				setCorrespondingArgument((Map<ProcedureCall, Argument>)null);
				return;
			case ParametersPackage.PARAMETER__BY_REFERENCE:
				setByReference(BY_REFERENCE_EDEFAULT);
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
			case ParametersPackage.PARAMETER__CORRESPONDING_ARGUMENT:
				return correspondingArgument != null;
			case ParametersPackage.PARAMETER__BY_REFERENCE:
				return byReference != BY_REFERENCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		return getName();
	}
	

	
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof DataItem) {
			DataItem other = (DataItem) obj;
			return (getName().equals(other.getName()));
		}
		return false;
	}
	
	@Override 
	public int hashCode() {
		return 3 * getName().hashCode();
	}

} //ParameterImpl
