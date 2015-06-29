/**
 */
package org.servicifi.gelato.language.cobol.divisions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.declaratives.Declaratives;

import org.servicifi.gelato.language.cobol.divisions.DivisionsPackage;
import org.servicifi.gelato.language.cobol.divisions.ProcedureDivision;

import org.servicifi.gelato.language.cobol.parameters.Parameter;
import org.servicifi.gelato.language.cobol.parameters.ParametersPackage;
import org.servicifi.gelato.language.cobol.parameters.Parametrizable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Division</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl#getReturning <em>Returning</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.divisions.impl.ProcedureDivisionImpl#getDeclaratives <em>Declaratives</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureDivisionImpl extends DivisionImpl implements ProcedureDivision {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getReturning() <em>Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturning()
	 * @generated
	 * @ordered
	 */
	protected Parameter returning;

	/**
	 * The cached value of the '{@link #getDeclaratives() <em>Declaratives</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaratives()
	 * @generated
	 * @ordered
	 */
	protected Declaratives declaratives;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureDivisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DivisionsPackage.Literals.PROCEDURE_DIVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getReturning() {
		return returning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturning(Parameter newReturning, NotificationChain msgs) {
		Parameter oldReturning = returning;
		returning = newReturning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DivisionsPackage.PROCEDURE_DIVISION__RETURNING, oldReturning, newReturning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturning(Parameter newReturning) {
		if (newReturning != returning) {
			NotificationChain msgs = null;
			if (returning != null)
				msgs = ((InternalEObject)returning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DivisionsPackage.PROCEDURE_DIVISION__RETURNING, null, msgs);
			if (newReturning != null)
				msgs = ((InternalEObject)newReturning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DivisionsPackage.PROCEDURE_DIVISION__RETURNING, null, msgs);
			msgs = basicSetReturning(newReturning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DivisionsPackage.PROCEDURE_DIVISION__RETURNING, newReturning, newReturning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaratives getDeclaratives() {
		return declaratives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaratives(Declaratives newDeclaratives, NotificationChain msgs) {
		Declaratives oldDeclaratives = declaratives;
		declaratives = newDeclaratives;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES, oldDeclaratives, newDeclaratives);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaratives(Declaratives newDeclaratives) {
		if (newDeclaratives != declaratives) {
			NotificationChain msgs = null;
			if (declaratives != null)
				msgs = ((InternalEObject)declaratives).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES, null, msgs);
			if (newDeclaratives != null)
				msgs = ((InternalEObject)newDeclaratives).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES, null, msgs);
			msgs = basicSetDeclaratives(newDeclaratives, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES, newDeclaratives, newDeclaratives));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case DivisionsPackage.PROCEDURE_DIVISION__RETURNING:
				return basicSetReturning(null, msgs);
			case DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES:
				return basicSetDeclaratives(null, msgs);
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
			case DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS:
				return getParameters();
			case DivisionsPackage.PROCEDURE_DIVISION__RETURNING:
				return getReturning();
			case DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES:
				return getDeclaratives();
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
			case DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case DivisionsPackage.PROCEDURE_DIVISION__RETURNING:
				setReturning((Parameter)newValue);
				return;
			case DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES:
				setDeclaratives((Declaratives)newValue);
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
			case DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS:
				getParameters().clear();
				return;
			case DivisionsPackage.PROCEDURE_DIVISION__RETURNING:
				setReturning((Parameter)null);
				return;
			case DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES:
				setDeclaratives((Declaratives)null);
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
			case DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case DivisionsPackage.PROCEDURE_DIVISION__RETURNING:
				return returning != null;
			case DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES:
				return declaratives != null;
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
		if (baseClass == Parametrizable.class) {
			switch (derivedFeatureID) {
				case DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS: return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
				case DivisionsPackage.PROCEDURE_DIVISION__RETURNING: return ParametersPackage.PARAMETRIZABLE__RETURNING;
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
		if (baseClass == Parametrizable.class) {
			switch (baseFeatureID) {
				case ParametersPackage.PARAMETRIZABLE__PARAMETERS: return DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS;
				case ParametersPackage.PARAMETRIZABLE__RETURNING: return DivisionsPackage.PROCEDURE_DIVISION__RETURNING;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcedureDivisionImpl
