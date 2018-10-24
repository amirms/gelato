/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.language.kernel.commons.CommonsPackage;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.FlowsFactory;
import org.servicifi.gelato.language.kernel.members.Member;
import org.servicifi.gelato.language.kernel.statements.ExecutionOrder;
import org.servicifi.gelato.language.kernel.statements.ParallelBlock;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.Statement;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ParallelBlockImpl#getOrder <em>Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelBlockImpl extends StatementListContainerImpl implements ParallelBlock {
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
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final ExecutionOrder ORDER_EDEFAULT = ExecutionOrder.L2R;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected ExecutionOrder order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PARALLEL_BLOCK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PARALLEL_BLOCK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionOrder getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(ExecutionOrder newOrder) {
		ExecutionOrder oldOrder = order;
		order = newOrder == null ? ORDER_EDEFAULT : newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PARALLEL_BLOCK__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public LabellableElement first() {
		//if(getOrder().equals(ExecutionOrder.L2R_VALUE))
		
		//TODO incorprate interleaved semantics
		
		if (getOrder().equals(ExecutionOrder.R2L_VALUE))
			return getStatements().get(getStatements().size()-1).first();
		
		return getStatements().get(0).first();
		  
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> last() {
		EList <LabellableElement> res = new BasicEList<LabellableElement>();
		
		//if(getOrder().equals(ExecutionOrder.L2R_VALUE))
		//TODO incorprate interleaved semantics
		
		if (getOrder().equals(ExecutionOrder.R2L_VALUE))
			res.addAll(getStatements().get(0).last());
		else
			
			res.addAll(getStatements().get(getStatements().size()-1).last());
		
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Flow> internalFlow() {
		//TODO incorporate interleaved semantics
		//TODO R2L order is yet to be implemented!
		EList<Flow> res = new BasicEList<>();
		//If no statements, i.e. {}
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
					res.add(FlowsFactory.eINSTANCE.createProcedureFlow(e, elem.first()));
				}
				else {
					res.add(FlowsFactory.eINSTANCE.createRegularFlow(e, elem.first()));
				}
			}
			res.addAll(elem.internalFlow());
			
			prev = elem.last();
		}
		
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementsPackage.PARALLEL_BLOCK__LABEL:
				return getLabel();
			case StatementsPackage.PARALLEL_BLOCK__ORDER:
				return getOrder();
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
			case StatementsPackage.PARALLEL_BLOCK__LABEL:
				setLabel((Long)newValue);
				return;
			case StatementsPackage.PARALLEL_BLOCK__ORDER:
				setOrder((ExecutionOrder)newValue);
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
			case StatementsPackage.PARALLEL_BLOCK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case StatementsPackage.PARALLEL_BLOCK__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case StatementsPackage.PARALLEL_BLOCK__LABEL:
				return label != LABEL_EDEFAULT;
			case StatementsPackage.PARALLEL_BLOCK__ORDER:
				return order != ORDER_EDEFAULT;
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
		if (baseClass == LabellableElement.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.PARALLEL_BLOCK__LABEL: return CommonsPackage.LABELLABLE_ELEMENT__LABEL;
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
		if (baseClass == LabellableElement.class) {
			switch (baseFeatureID) {
				case CommonsPackage.LABELLABLE_ELEMENT__LABEL: return StatementsPackage.PARALLEL_BLOCK__LABEL;
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
		result.append(", order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //ParallelBlockImpl
