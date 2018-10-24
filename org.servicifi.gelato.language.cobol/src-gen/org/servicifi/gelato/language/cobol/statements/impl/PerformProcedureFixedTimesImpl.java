/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.statements.PerformFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Procedure Fixed Times</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureFixedTimesImpl#getIterations <em>Iterations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformProcedureFixedTimesImpl extends PerformProcedureImpl implements PerformProcedureFixedTimes {
	/**
	 * The cached value of the '{@link #getIterations() <em>Iterations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterations()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand iterations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformProcedureFixedTimesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PERFORM_PROCEDURE_FIXED_TIMES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getIterations() {
		return iterations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIterations(PrimaryOperand newIterations, NotificationChain msgs) {
		PrimaryOperand oldIterations = iterations;
		iterations = newIterations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS, oldIterations, newIterations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterations(PrimaryOperand newIterations) {
		if (newIterations != iterations) {
			NotificationChain msgs = null;
			if (iterations != null)
				msgs = ((InternalEObject)iterations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS, null, msgs);
			if (newIterations != null)
				msgs = ((InternalEObject)newIterations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS, null, msgs);
			msgs = basicSetIterations(newIterations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS, newIterations, newIterations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS:
				return basicSetIterations(null, msgs);
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
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS:
				return getIterations();
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
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS:
				setIterations((PrimaryOperand)newValue);
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
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS:
				setIterations((PrimaryOperand)null);
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
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS:
				return iterations != null;
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
		if (baseClass == PerformFixedTimes.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS: return StatementsPackage.PERFORM_FIXED_TIMES__ITERATIONS;
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
		if (baseClass == PerformFixedTimes.class) {
			switch (baseFeatureID) {
				case StatementsPackage.PERFORM_FIXED_TIMES__ITERATIONS: return StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PerformProcedureFixedTimesImpl
