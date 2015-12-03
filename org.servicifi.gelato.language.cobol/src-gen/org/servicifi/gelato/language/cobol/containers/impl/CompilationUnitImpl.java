/**
 */
package org.servicifi.gelato.language.cobol.containers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.commons.impl.NamedElementImpl;

import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.containers.ContainersPackage;

import org.servicifi.gelato.language.cobol.divisions.DataDivision;
import org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision;
import org.servicifi.gelato.language.cobol.divisions.IdentificationDivision;
import org.servicifi.gelato.language.cobol.divisions.ProcedureDivision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compilation Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl#getIdentificationDivision <em>Identification Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl#getEnvironmentDivision <em>Environment Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl#getDataDivision <em>Data Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl#getProcedureDivision <em>Procedure Division</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.containers.impl.CompilationUnitImpl#getNestedCompilationUnits <em>Nested Compilation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompilationUnitImpl extends NamedElementImpl implements CompilationUnit {
	/**
	 * The cached value of the '{@link #getIdentificationDivision() <em>Identification Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentificationDivision()
	 * @generated
	 * @ordered
	 */
	protected IdentificationDivision identificationDivision;

	/**
	 * The cached value of the '{@link #getEnvironmentDivision() <em>Environment Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironmentDivision()
	 * @generated
	 * @ordered
	 */
	protected EnvironmentDivision environmentDivision;

	/**
	 * The cached value of the '{@link #getDataDivision() <em>Data Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataDivision()
	 * @generated
	 * @ordered
	 */
	protected DataDivision dataDivision;

	/**
	 * The cached value of the '{@link #getProcedureDivision() <em>Procedure Division</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureDivision()
	 * @generated
	 * @ordered
	 */
	protected ProcedureDivision procedureDivision;

	/**
	 * The cached value of the '{@link #getNestedCompilationUnits() <em>Nested Compilation Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedCompilationUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<CompilationUnit> nestedCompilationUnits;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilationUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContainersPackage.Literals.COMPILATION_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationDivision getIdentificationDivision() {
		return identificationDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdentificationDivision(IdentificationDivision newIdentificationDivision, NotificationChain msgs) {
		IdentificationDivision oldIdentificationDivision = identificationDivision;
		identificationDivision = newIdentificationDivision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION, oldIdentificationDivision, newIdentificationDivision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentificationDivision(IdentificationDivision newIdentificationDivision) {
		if (newIdentificationDivision != identificationDivision) {
			NotificationChain msgs = null;
			if (identificationDivision != null)
				msgs = ((InternalEObject)identificationDivision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION, null, msgs);
			if (newIdentificationDivision != null)
				msgs = ((InternalEObject)newIdentificationDivision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION, null, msgs);
			msgs = basicSetIdentificationDivision(newIdentificationDivision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION, newIdentificationDivision, newIdentificationDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentDivision getEnvironmentDivision() {
		return environmentDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironmentDivision(EnvironmentDivision newEnvironmentDivision, NotificationChain msgs) {
		EnvironmentDivision oldEnvironmentDivision = environmentDivision;
		environmentDivision = newEnvironmentDivision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION, oldEnvironmentDivision, newEnvironmentDivision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmentDivision(EnvironmentDivision newEnvironmentDivision) {
		if (newEnvironmentDivision != environmentDivision) {
			NotificationChain msgs = null;
			if (environmentDivision != null)
				msgs = ((InternalEObject)environmentDivision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION, null, msgs);
			if (newEnvironmentDivision != null)
				msgs = ((InternalEObject)newEnvironmentDivision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION, null, msgs);
			msgs = basicSetEnvironmentDivision(newEnvironmentDivision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION, newEnvironmentDivision, newEnvironmentDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDivision getDataDivision() {
		return dataDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataDivision(DataDivision newDataDivision, NotificationChain msgs) {
		DataDivision oldDataDivision = dataDivision;
		dataDivision = newDataDivision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__DATA_DIVISION, oldDataDivision, newDataDivision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataDivision(DataDivision newDataDivision) {
		if (newDataDivision != dataDivision) {
			NotificationChain msgs = null;
			if (dataDivision != null)
				msgs = ((InternalEObject)dataDivision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__DATA_DIVISION, null, msgs);
			if (newDataDivision != null)
				msgs = ((InternalEObject)newDataDivision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__DATA_DIVISION, null, msgs);
			msgs = basicSetDataDivision(newDataDivision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__DATA_DIVISION, newDataDivision, newDataDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDivision getProcedureDivision() {
		return procedureDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureDivision(ProcedureDivision newProcedureDivision, NotificationChain msgs) {
		ProcedureDivision oldProcedureDivision = procedureDivision;
		procedureDivision = newProcedureDivision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION, oldProcedureDivision, newProcedureDivision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureDivision(ProcedureDivision newProcedureDivision) {
		if (newProcedureDivision != procedureDivision) {
			NotificationChain msgs = null;
			if (procedureDivision != null)
				msgs = ((InternalEObject)procedureDivision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION, null, msgs);
			if (newProcedureDivision != null)
				msgs = ((InternalEObject)newProcedureDivision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION, null, msgs);
			msgs = basicSetProcedureDivision(newProcedureDivision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION, newProcedureDivision, newProcedureDivision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CompilationUnit> getNestedCompilationUnits() {
		if (nestedCompilationUnits == null) {
			nestedCompilationUnits = new EObjectContainmentEList<CompilationUnit>(CompilationUnit.class, this, ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS);
		}
		return nestedCompilationUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION:
				return basicSetIdentificationDivision(null, msgs);
			case ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION:
				return basicSetEnvironmentDivision(null, msgs);
			case ContainersPackage.COMPILATION_UNIT__DATA_DIVISION:
				return basicSetDataDivision(null, msgs);
			case ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION:
				return basicSetProcedureDivision(null, msgs);
			case ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS:
				return ((InternalEList<?>)getNestedCompilationUnits()).basicRemove(otherEnd, msgs);
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
			case ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION:
				return getIdentificationDivision();
			case ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION:
				return getEnvironmentDivision();
			case ContainersPackage.COMPILATION_UNIT__DATA_DIVISION:
				return getDataDivision();
			case ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION:
				return getProcedureDivision();
			case ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS:
				return getNestedCompilationUnits();
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
			case ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION:
				setIdentificationDivision((IdentificationDivision)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION:
				setEnvironmentDivision((EnvironmentDivision)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__DATA_DIVISION:
				setDataDivision((DataDivision)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION:
				setProcedureDivision((ProcedureDivision)newValue);
				return;
			case ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS:
				getNestedCompilationUnits().clear();
				getNestedCompilationUnits().addAll((Collection<? extends CompilationUnit>)newValue);
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
			case ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION:
				setIdentificationDivision((IdentificationDivision)null);
				return;
			case ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION:
				setEnvironmentDivision((EnvironmentDivision)null);
				return;
			case ContainersPackage.COMPILATION_UNIT__DATA_DIVISION:
				setDataDivision((DataDivision)null);
				return;
			case ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION:
				setProcedureDivision((ProcedureDivision)null);
				return;
			case ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS:
				getNestedCompilationUnits().clear();
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
			case ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION:
				return identificationDivision != null;
			case ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION:
				return environmentDivision != null;
			case ContainersPackage.COMPILATION_UNIT__DATA_DIVISION:
				return dataDivision != null;
			case ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION:
				return procedureDivision != null;
			case ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS:
				return nestedCompilationUnits != null && !nestedCompilationUnits.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompilationUnitImpl
