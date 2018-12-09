/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.language.kernel.statements.ExecutionOrder;
import org.servicifi.gelato.language.kernel.statements.ParallelBlock;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementListContainer;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Parallel Block</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl#getStatements
 * <em>Statements</em>}</li>
 * <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl#getOrder
 * <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParallelBlockImpl extends StatementImpl implements ParallelBlock {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionOrder ORDER_EDEFAULT = ExecutionOrder.L2R;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected ExecutionOrder order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ParallelBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PARALLEL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this,
					StatementsPackage.PARALLEL_BLOCK__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ExecutionOrder getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOrder(ExecutionOrder newOrder) {
		ExecutionOrder oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PARALLEL_BLOCK__ORDER, oldOrder,
					order));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatementsPackage.PARALLEL_BLOCK__STATEMENTS:
			return ((InternalEList<?>) getStatements()).basicRemove(otherEnd, msgs);
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
		case StatementsPackage.PARALLEL_BLOCK__STATEMENTS:
			return getStatements();
		case StatementsPackage.PARALLEL_BLOCK__ORDER:
			return getOrder();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StatementsPackage.PARALLEL_BLOCK__STATEMENTS:
			getStatements().clear();
			getStatements().addAll((Collection<? extends Statement>) newValue);
			return;
		case StatementsPackage.PARALLEL_BLOCK__ORDER:
			setOrder((ExecutionOrder) newValue);
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
		case StatementsPackage.PARALLEL_BLOCK__STATEMENTS:
			getStatements().clear();
			return;
		case StatementsPackage.PARALLEL_BLOCK__ORDER:
			setOrder(ORDER_EDEFAULT);
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
		case StatementsPackage.PARALLEL_BLOCK__STATEMENTS:
			return statements != null && !statements.isEmpty();
		case StatementsPackage.PARALLEL_BLOCK__ORDER:
			return order != ORDER_EDEFAULT;
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
		if (baseClass == StatementListContainer.class) {
			switch (derivedFeatureID) {
			case StatementsPackage.PARALLEL_BLOCK__STATEMENTS:
				return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
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
		if (baseClass == StatementListContainer.class) {
			switch (baseFeatureID) {
			case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS:
				return StatementsPackage.PARALLEL_BLOCK__STATEMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public LabellableElement first() {
		// if(getOrder().equals(ExecutionOrder.L2R_VALUE))

		// TODO incorprate interleaved semantics

		if (getOrder().equals(ExecutionOrder.R2L))
			return getStatements().get(getStatements().size() - 1).first();

		return getStatements().get(0).first();

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<LabellableElement>();

		// if(getOrder().equals(ExecutionOrder.L2R_VALUE))
		// TODO incorprate interleaved semantics

		if (getOrder().equals(ExecutionOrder.R2L))
			res.addAll(getStatements().get(0).last());
		else

			res.addAll(getStatements().get(getStatements().size() - 1).last());

		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		// TODO incorporate interleaved semantics
		// TODO R2L order is yet to be implemented!
		EList<Flow> res = new BasicEList<>();
		// If no statements, i.e. {}
		if (getStatements().isEmpty())
			return res;

		Statement firstStatement = getStatements().get(0);
		EList<LabellableElement> prev = new BasicEList<>();
		prev.addAll(firstStatement.last());
		res.addAll(firstStatement.internalFlow());
		for (int i = 1; i < getStatements().size(); i++) {
			LabellableElement elem = getStatements().get(i);
			for (LabellableElement e : prev) {
				if (e instanceof ProcedureCall) {
					res.add(GraphsFactory.eINSTANCE.createProcedureFlow(e, elem.first()));
				} else {
					res.add(GraphsFactory.eINSTANCE.createRegularFlow(e, elem.first()));
				}
			}
			res.addAll(elem.internalFlow());

			prev = elem.last();
		}

		return res;
	}

} // ParallelBlockImpl
