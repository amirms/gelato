/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisConfigurationImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisConfigurationImpl#getAnalysisType <em>Analysis Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalysisConfigurationImpl extends MinimalEObjectImpl.Container implements AnalysisConfiguration {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final AnalysisDirection DIRECTION_EDEFAULT = AnalysisDirection.FORWARDS;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected AnalysisDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected static final AnalysisType ANALYSIS_TYPE_EDEFAULT = AnalysisType.MUST;

	/**
	 * The cached value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected AnalysisType analysisType = ANALYSIS_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.ANALYSIS_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(AnalysisDirection newDirection) {
		AnalysisDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS_CONFIGURATION__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysisType getAnalysisType() {
		return analysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalysisType(AnalysisType newAnalysisType) {
		AnalysisType oldAnalysisType = analysisType;
		analysisType = newAnalysisType == null ? ANALYSIS_TYPE_EDEFAULT : newAnalysisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS_CONFIGURATION__ANALYSIS_TYPE, oldAnalysisType, analysisType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysesPackage.ANALYSIS_CONFIGURATION__DIRECTION:
				return getDirection();
			case AnalysesPackage.ANALYSIS_CONFIGURATION__ANALYSIS_TYPE:
				return getAnalysisType();
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
			case AnalysesPackage.ANALYSIS_CONFIGURATION__DIRECTION:
				setDirection((AnalysisDirection)newValue);
				return;
			case AnalysesPackage.ANALYSIS_CONFIGURATION__ANALYSIS_TYPE:
				setAnalysisType((AnalysisType)newValue);
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
			case AnalysesPackage.ANALYSIS_CONFIGURATION__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AnalysesPackage.ANALYSIS_CONFIGURATION__ANALYSIS_TYPE:
				setAnalysisType(ANALYSIS_TYPE_EDEFAULT);
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
			case AnalysesPackage.ANALYSIS_CONFIGURATION__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case AnalysesPackage.ANALYSIS_CONFIGURATION__ANALYSIS_TYPE:
				return analysisType != ANALYSIS_TYPE_EDEFAULT;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(", analysisType: ");
		result.append(analysisType);
		result.append(')');
		return result.toString();
	}

} //AnalysisConfigurationImpl
