/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.FlowsFactory;
import org.servicifi.gelato.language.kernel.members.Member;
import org.servicifi.gelato.language.kernel.statements.Conditional;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WhileLoopImpl extends StatementContainerImpl implements WhileLoop {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final long LABEL_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected long label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhileLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.WHILE_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.WHILE_LOOP__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WHILE_LOOP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.WHILE_LOOP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WHILE_LOOP__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(long newLabel) {
		long oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WHILE_LOOP__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LabellableElement first() {
		return getCondition(); //Expression is a labellableElement
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		res.add(getCondition());
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();	
		res.add(FlowsFactory.eINSTANCE.createRegularFlow(getCondition(), getStatement().first()));
		res.addAll(getStatement().internalFlow());
		for (LabellableElement e : getStatement().last()) {
			res.add(FlowsFactory.eINSTANCE.createRegularFlow(e, getCondition()));
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.WHILE_LOOP__CONDITION:
				return basicSetCondition(null, msgs);
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
			case StatementsPackage.WHILE_LOOP__CONDITION:
				return getCondition();
			case StatementsPackage.WHILE_LOOP__LABEL:
				return getLabel();
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
			case StatementsPackage.WHILE_LOOP__CONDITION:
				setCondition((Expression)newValue);
				return;
			case StatementsPackage.WHILE_LOOP__LABEL:
				setLabel((Long)newValue);
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
			case StatementsPackage.WHILE_LOOP__CONDITION:
				setCondition((Expression)null);
				return;
			case StatementsPackage.WHILE_LOOP__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case StatementsPackage.WHILE_LOOP__CONDITION:
				return condition != null;
			case StatementsPackage.WHILE_LOOP__LABEL:
				return label != LABEL_EDEFAULT;
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
				case StatementsPackage.WHILE_LOOP__CONDITION: return StatementsPackage.CONDITIONAL__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == LabellableElement.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.WHILE_LOOP__LABEL: return CommonsPackage.LABELLABLE_ELEMENT__LABEL;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
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
				case StatementsPackage.CONDITIONAL__CONDITION: return StatementsPackage.WHILE_LOOP__CONDITION;
				default: return -1;
			}
		}
		if (baseClass == LabellableElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.LABELLABLE_ELEMENT__LABEL: return StatementsPackage.WHILE_LOOP__LABEL;
				default: return -1;
			}
		}
		if (baseClass == Member.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //WhileLoopImpl
