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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel;

import org.servicifi.gelato.language.cobol.statements.AfterUntilCondition;
import org.servicifi.gelato.language.cobol.statements.PerformProcedure;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Procedure Until Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureUntilConditionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureUntilConditionImpl#getAfters <em>Afters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformProcedureUntilConditionImpl extends PerformUntilConditionImpl implements PerformProcedureUntilCondition {
	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected ProcedureRangeLabel label;

	/**
	 * The cached value of the '{@link #getAfters() <em>Afters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfters()
	 * @generated
	 * @ordered
	 */
	protected EList<AfterUntilCondition> afters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformProcedureUntilConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PERFORM_PROCEDURE_UNTIL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRangeLabel getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(ProcedureRangeLabel newLabel, NotificationChain msgs) {
		ProcedureRangeLabel oldLabel = label;
		label = newLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL, oldLabel, newLabel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(ProcedureRangeLabel newLabel) {
		if (newLabel != label) {
			NotificationChain msgs = null;
			if (label != null)
				msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL, null, msgs);
			if (newLabel != null)
				msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL, null, msgs);
			msgs = basicSetLabel(newLabel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL, newLabel, newLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AfterUntilCondition> getAfters() {
		if (afters == null) {
			afters = new EObjectContainmentEList<AfterUntilCondition>(AfterUntilCondition.class, this, StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS);
		}
		return afters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL:
				return basicSetLabel(null, msgs);
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS:
				return ((InternalEList<?>)getAfters()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL:
				return getLabel();
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS:
				return getAfters();
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
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL:
				setLabel((ProcedureRangeLabel)newValue);
				return;
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS:
				getAfters().clear();
				getAfters().addAll((Collection<? extends AfterUntilCondition>)newValue);
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
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL:
				setLabel((ProcedureRangeLabel)null);
				return;
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS:
				getAfters().clear();
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
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL:
				return label != null;
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS:
				return afters != null && !afters.isEmpty();
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
		if (baseClass == PerformProcedure.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL: return StatementsPackage.PERFORM_PROCEDURE__LABEL;
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
		if (baseClass == PerformProcedure.class) {
			switch (baseFeatureID) {
				case StatementsPackage.PERFORM_PROCEDURE__LABEL: return StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PerformProcedureUntilConditionImpl
