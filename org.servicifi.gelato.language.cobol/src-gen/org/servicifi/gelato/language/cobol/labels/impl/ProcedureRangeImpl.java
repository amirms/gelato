/**
 */
package org.servicifi.gelato.language.cobol.labels.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.servicifi.gelato.language.cobol.labels.LabelsPackage;
import org.servicifi.gelato.language.cobol.labels.ProcedureRange;
import org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild;

import org.servicifi.gelato.language.cobol.operators.Through;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.labels.impl.ProcedureRangeImpl#getThroughOperator <em>Through Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureRangeImpl extends ProcedureRangeLabelImpl implements ProcedureRange {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcedureRangeChild> children;

	/**
	 * The cached value of the '{@link #getThroughOperator() <em>Through Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughOperator()
	 * @generated
	 * @ordered
	 */
	protected Through throughOperator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureRangeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LabelsPackage.Literals.PROCEDURE_RANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcedureRangeChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ProcedureRangeChild>(ProcedureRangeChild.class, this, LabelsPackage.PROCEDURE_RANGE__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Through getThroughOperator() {
		return throughOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThroughOperator(Through newThroughOperator, NotificationChain msgs) {
		Through oldThroughOperator = throughOperator;
		throughOperator = newThroughOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR, oldThroughOperator, newThroughOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughOperator(Through newThroughOperator) {
		if (newThroughOperator != throughOperator) {
			NotificationChain msgs = null;
			if (throughOperator != null)
				msgs = ((InternalEObject)throughOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR, null, msgs);
			if (newThroughOperator != null)
				msgs = ((InternalEObject)newThroughOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR, null, msgs);
			msgs = basicSetThroughOperator(newThroughOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR, newThroughOperator, newThroughOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LabelsPackage.PROCEDURE_RANGE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR:
				return basicSetThroughOperator(null, msgs);
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
			case LabelsPackage.PROCEDURE_RANGE__CHILDREN:
				return getChildren();
			case LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR:
				return getThroughOperator();
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
			case LabelsPackage.PROCEDURE_RANGE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ProcedureRangeChild>)newValue);
				return;
			case LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR:
				setThroughOperator((Through)newValue);
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
			case LabelsPackage.PROCEDURE_RANGE__CHILDREN:
				getChildren().clear();
				return;
			case LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR:
				setThroughOperator((Through)null);
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
			case LabelsPackage.PROCEDURE_RANGE__CHILDREN:
				return children != null && !children.isEmpty();
			case LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR:
				return throughOperator != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcedureRangeImpl
