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
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.expressions.Expression;

import org.servicifi.gelato.language.kernel.statements.Conditional;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementContainer;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>While
 * Loop</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl#getStatement
 * <em>Statement</em>}</li>
 * <li>{@link org.servicifi.gelato.language.kernel.statements.impl.WhileLoopImpl#getCondition
 * <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLoopImpl extends StatementImpl implements WhileLoop {
	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected Statement statement;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected WhileLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.WHILE_LOOP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Statement getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatement(Statement newStatement, NotificationChain msgs) {
		Statement oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.WHILE_LOOP__STATEMENT, oldStatement, newStatement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setStatement(Statement newStatement) {
		if (newStatement != statement) {
			NotificationChain msgs = null;
			if (statement != null)
				msgs = ((InternalEObject) statement).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.WHILE_LOOP__STATEMENT, null, msgs);
			if (newStatement != null)
				msgs = ((InternalEObject) newStatement).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.WHILE_LOOP__STATEMENT, null, msgs);
			msgs = basicSetStatement(newStatement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WHILE_LOOP__STATEMENT, newStatement,
					newStatement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StatementsPackage.WHILE_LOOP__CONDITION, oldCondition, newCondition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject) condition).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.WHILE_LOOP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject) newCondition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - StatementsPackage.WHILE_LOOP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.WHILE_LOOP__CONDITION, newCondition,
					newCondition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.WHILE_LOOP__STATEMENT:
			return basicSetStatement(null, msgs);
		case StatementsPackage.WHILE_LOOP__CONDITION:
			return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StatementsPackage.WHILE_LOOP__STATEMENT:
			return getStatement();
		case StatementsPackage.WHILE_LOOP__CONDITION:
			return getCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatementsPackage.WHILE_LOOP__STATEMENT:
			setStatement((Statement) newValue);
			return;
		case StatementsPackage.WHILE_LOOP__CONDITION:
			setCondition((Expression) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StatementsPackage.WHILE_LOOP__STATEMENT:
			setStatement((Statement) null);
			return;
		case StatementsPackage.WHILE_LOOP__CONDITION:
			setCondition((Expression) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StatementsPackage.WHILE_LOOP__STATEMENT:
			return statement != null;
		case StatementsPackage.WHILE_LOOP__CONDITION:
			return condition != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == StatementContainer.class) {
			switch (derivedFeatureID) {
			case StatementsPackage.WHILE_LOOP__STATEMENT:
				return StatementsPackage.STATEMENT_CONTAINER__STATEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Conditional.class) {
			switch (derivedFeatureID) {
			case StatementsPackage.WHILE_LOOP__CONDITION:
				return StatementsPackage.CONDITIONAL__CONDITION;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == StatementContainer.class) {
			switch (baseFeatureID) {
			case StatementsPackage.STATEMENT_CONTAINER__STATEMENT:
				return StatementsPackage.WHILE_LOOP__STATEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Conditional.class) {
			switch (baseFeatureID) {
			case StatementsPackage.CONDITIONAL__CONDITION:
				return StatementsPackage.WHILE_LOOP__CONDITION;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public LabellableElement first() {
		return getCondition(); // Expression is a labellableElement
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		res.add(getCondition());
		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();
		res.add(GraphsFactory.eINSTANCE.createRegularFlow(getCondition(), getStatement().first()));
		res.addAll(getStatement().internalFlow());
		for (LabellableElement e : getStatement().last()) {
			res.add(GraphsFactory.eINSTANCE.createRegularFlow(e, getCondition()));
		}
		return res;
	}

} // WhileLoopImpl
