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

import org.servicifi.gelato.language.cobol.conditions.Condition;

import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;

import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;

import org.servicifi.gelato.language.cobol.statements.Conditional;
import org.servicifi.gelato.language.cobol.statements.PerformUntilCondition;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition;

import org.servicifi.gelato.language.cobol.strings.Positions;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Until Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl#getInit <em>Init</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PerformUntilConditionImpl extends PerformImpl implements PerformUntilCondition {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected IdentifierReference variable;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand init;

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected PrimaryOperand increment;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final Positions POSITION_EDEFAULT = Positions.BEFORE;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Positions position = POSITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformUntilConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PERFORM_UNTIL_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(IdentifierReference newVariable, NotificationChain msgs) {
		IdentifierReference oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(IdentifierReference newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(PrimaryOperand newInit, NotificationChain msgs) {
		PrimaryOperand oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(PrimaryOperand newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryOperand getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncrement(PrimaryOperand newIncrement, NotificationChain msgs) {
		PrimaryOperand oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT, oldIncrement, newIncrement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(PrimaryOperand newIncrement) {
		if (newIncrement != increment) {
			NotificationChain msgs = null;
			if (increment != null)
				msgs = ((InternalEObject)increment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT, null, msgs);
			if (newIncrement != null)
				msgs = ((InternalEObject)newIncrement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT, null, msgs);
			msgs = basicSetIncrement(newIncrement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT, newIncrement, newIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Positions getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Positions newPosition) {
		Positions oldPosition = position;
		position = newPosition == null ? POSITION_EDEFAULT : newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PERFORM_UNTIL_CONDITION__POSITION, oldPosition, position));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<Condition>(Condition.class, this, StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION:
				return basicSetCondition(null, msgs);
			case StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE:
				return basicSetVariable(null, msgs);
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INIT:
				return basicSetInit(null, msgs);
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT:
				return basicSetIncrement(null, msgs);
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION:
				return getCondition();
			case StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE:
				return getVariable();
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INIT:
				return getInit();
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT:
				return getIncrement();
			case StatementsPackage.PERFORM_UNTIL_CONDITION__POSITION:
				return getPosition();
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITIONS:
				return getConditions();
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
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE:
				setVariable((IdentifierReference)newValue);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INIT:
				setInit((PrimaryOperand)newValue);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT:
				setIncrement((PrimaryOperand)newValue);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__POSITION:
				setPosition((Positions)newValue);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends Condition>)newValue);
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
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION:
				setCondition((Condition)null);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE:
				setVariable((IdentifierReference)null);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INIT:
				setInit((PrimaryOperand)null);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT:
				setIncrement((PrimaryOperand)null);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITIONS:
				getConditions().clear();
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
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION:
				return condition != null;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE:
				return variable != null;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INIT:
				return init != null;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT:
				return increment != null;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__POSITION:
				return position != POSITION_EDEFAULT;
			case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
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
		if (baseClass == Conditional.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION: return StatementsPackage.CONDITIONAL__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == VaryingUntilCondition.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE: return StatementsPackage.VARYING_UNTIL_CONDITION__VARIABLE;
				case StatementsPackage.PERFORM_UNTIL_CONDITION__INIT: return StatementsPackage.VARYING_UNTIL_CONDITION__INIT;
				case StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT: return StatementsPackage.VARYING_UNTIL_CONDITION__INCREMENT;
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
		if (baseClass == Conditional.class) {
			switch (baseFeatureID) {
				case StatementsPackage.CONDITIONAL__CONDITION: return StatementsPackage.PERFORM_UNTIL_CONDITION__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == VaryingUntilCondition.class) {
			switch (baseFeatureID) {
				case StatementsPackage.VARYING_UNTIL_CONDITION__VARIABLE: return StatementsPackage.PERFORM_UNTIL_CONDITION__VARIABLE;
				case StatementsPackage.VARYING_UNTIL_CONDITION__INIT: return StatementsPackage.PERFORM_UNTIL_CONDITION__INIT;
				case StatementsPackage.VARYING_UNTIL_CONDITION__INCREMENT: return StatementsPackage.PERFORM_UNTIL_CONDITION__INCREMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (position: ");
		result.append(position);
		result.append(')');
		return result.toString();
	}

} //PerformUntilConditionImpl
