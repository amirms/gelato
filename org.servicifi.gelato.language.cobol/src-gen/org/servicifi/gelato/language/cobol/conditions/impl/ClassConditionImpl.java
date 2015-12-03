/**
 */
package org.servicifi.gelato.language.cobol.conditions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.servicifi.gelato.language.cobol.conditions.ClassCondition;
import org.servicifi.gelato.language.cobol.conditions.ConditionsPackage;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;

import org.servicifi.gelato.language.cobol.operators.ClassOperator;
import org.servicifi.gelato.language.cobol.operators.Negate;

import org.servicifi.gelato.language.cobol.verbs.Is;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl#getClassOperator <em>Class Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl#getNegateOperator <em>Negate Operator</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.cobol.conditions.impl.ClassConditionImpl#getIs <em>Is</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassConditionImpl extends NegatedConditionalExpressionChildImpl implements ClassCondition {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected SimpleConditionChild child;

	/**
	 * The cached value of the '{@link #getClassOperator() <em>Class Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassOperator()
	 * @generated
	 * @ordered
	 */
	protected ClassOperator classOperator;

	/**
	 * The cached value of the '{@link #getNegateOperator() <em>Negate Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegateOperator()
	 * @generated
	 * @ordered
	 */
	protected Negate negateOperator;

	/**
	 * The cached value of the '{@link #getIs() <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIs()
	 * @generated
	 * @ordered
	 */
	protected Is is;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConditionsPackage.Literals.CLASS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleConditionChild getChild() {
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChild(SimpleConditionChild newChild, NotificationChain msgs) {
		SimpleConditionChild oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChild(SimpleConditionChild newChild) {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__CHILD, null, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__CHILD, null, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__CHILD, newChild, newChild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassOperator getClassOperator() {
		return classOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassOperator(ClassOperator newClassOperator, NotificationChain msgs) {
		ClassOperator oldClassOperator = classOperator;
		classOperator = newClassOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR, oldClassOperator, newClassOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassOperator(ClassOperator newClassOperator) {
		if (newClassOperator != classOperator) {
			NotificationChain msgs = null;
			if (classOperator != null)
				msgs = ((InternalEObject)classOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR, null, msgs);
			if (newClassOperator != null)
				msgs = ((InternalEObject)newClassOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR, null, msgs);
			msgs = basicSetClassOperator(newClassOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR, newClassOperator, newClassOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Negate getNegateOperator() {
		return negateOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegateOperator(Negate newNegateOperator, NotificationChain msgs) {
		Negate oldNegateOperator = negateOperator;
		negateOperator = newNegateOperator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR, oldNegateOperator, newNegateOperator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegateOperator(Negate newNegateOperator) {
		if (newNegateOperator != negateOperator) {
			NotificationChain msgs = null;
			if (negateOperator != null)
				msgs = ((InternalEObject)negateOperator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR, null, msgs);
			if (newNegateOperator != null)
				msgs = ((InternalEObject)newNegateOperator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR, null, msgs);
			msgs = basicSetNegateOperator(newNegateOperator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR, newNegateOperator, newNegateOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Is getIs() {
		return is;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIs(Is newIs, NotificationChain msgs) {
		Is oldIs = is;
		is = newIs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__IS, oldIs, newIs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs(Is newIs) {
		if (newIs != is) {
			NotificationChain msgs = null;
			if (is != null)
				msgs = ((InternalEObject)is).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__IS, null, msgs);
			if (newIs != null)
				msgs = ((InternalEObject)newIs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConditionsPackage.CLASS_CONDITION__IS, null, msgs);
			msgs = basicSetIs(newIs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConditionsPackage.CLASS_CONDITION__IS, newIs, newIs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConditionsPackage.CLASS_CONDITION__CHILD:
				return basicSetChild(null, msgs);
			case ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR:
				return basicSetClassOperator(null, msgs);
			case ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR:
				return basicSetNegateOperator(null, msgs);
			case ConditionsPackage.CLASS_CONDITION__IS:
				return basicSetIs(null, msgs);
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
			case ConditionsPackage.CLASS_CONDITION__CHILD:
				return getChild();
			case ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR:
				return getClassOperator();
			case ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR:
				return getNegateOperator();
			case ConditionsPackage.CLASS_CONDITION__IS:
				return getIs();
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
			case ConditionsPackage.CLASS_CONDITION__CHILD:
				setChild((SimpleConditionChild)newValue);
				return;
			case ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR:
				setClassOperator((ClassOperator)newValue);
				return;
			case ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR:
				setNegateOperator((Negate)newValue);
				return;
			case ConditionsPackage.CLASS_CONDITION__IS:
				setIs((Is)newValue);
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
			case ConditionsPackage.CLASS_CONDITION__CHILD:
				setChild((SimpleConditionChild)null);
				return;
			case ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR:
				setClassOperator((ClassOperator)null);
				return;
			case ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR:
				setNegateOperator((Negate)null);
				return;
			case ConditionsPackage.CLASS_CONDITION__IS:
				setIs((Is)null);
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
			case ConditionsPackage.CLASS_CONDITION__CHILD:
				return child != null;
			case ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR:
				return classOperator != null;
			case ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR:
				return negateOperator != null;
			case ConditionsPackage.CLASS_CONDITION__IS:
				return is != null;
		}
		return super.eIsSet(featureID);
	}

} //ClassConditionImpl
