/**
 */
package org.servicifi.gelato.analysis.framework.commons.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.CommonsPackage;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Variable;
import org.servicifi.gelato.analysis.framework.graphs.Flow;

import org.servicifi.gelato.analysis.framework.graphs.impl.NodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Labellable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LabellableElementImpl extends NodeImpl implements LabellableElement {
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
	protected LabellableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonsPackage.Literals.LABELLABLE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CommonsPackage.LABELLABLE_ELEMENT__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabellableElement first() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EList<LabellableElement>> last() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EList<Flow>> internalFlow() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AnalysisResult> gen(EClass configuration) {
		EList<AnalysisResult> res = new UniqueEList<>();
//		if (e instanceof AssignmentStatement) {
//			DataItem v = (DataItem) ((AssignmentStatement) e).getTarget();
//			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
//			if (assignments.containsKey(v)) {
//				assignments.get(v).add(e.getLabel());
//			} else {
//				EList<Long> i = new BasicEList<>(1);
//				i.add(e.getLabel());
//				assignments.put(v, i);
//			}
//		}
		// else if (e instanceof ProcedureCall) {
		// Variable v = ((ProcedureCall) e).getReturnVal();
		// res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v,
		// -1));
		// if (assignments.containsKey(v)) {
		// assignments.get(v).add(e.getLabel());
		// }
		// else {
		// EList<Long> i = new BasicEList<>(1);
		// i.add(e.getLabel());
		// assignments.put(v, i);
		// }
		// }
//		else 
		if (this instanceof UsageExpression) {
			// Order matters
			EList<Variable> vars = ((UsageExpression) e).getUsedVariables();
			for (Variable v : vars) {
				res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
				if (assignments.containsKey(v)) {
					assignments.get(v).add(e.getLabel());
				} else {
					EList<Long> i = new BasicEList<>(1);
					i.add(e.getLabel());
					assignments.put(v, i);
				}
			}
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AnalysisResult> kill(EClass configuration) {
		EList<AnalysisResult> res = new UniqueEList<>();

//		if (e instanceof DefinitionExpression) {
//			// LHS is a data item
//			DefinitionExpression definitonVariable = (DefinitionExpression) e;
//			Variable v = definitonVariable.getDefinedVariable();
//			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
//			if (assignments.containsKey(v)) {
//				for (Long i : assignments.get(v)) {
//					res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
//				}
//			}
//
//		}
		// else if (e instanceof ProcedureCall) {
		// Variable v = ((ProcedureCall) e).getReturnVal();
		// res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v,
		// -1));
		// if (assignments.containsKey(v)) {
		// for (Long i : assignments.get(v)) {
		// res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v,
		// i));
		// }
		// }
		// }
//		else
			if (this instanceof DefinitionExpression) {
			// Order matters
			EList<Variable> vars = ((DefinitionExpression) e).getDefinedVariables();
			for (Variable v : vars) {
				res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
				if (assignments.containsKey(v)) {
					for (Long i : assignments.get(v)) {
						res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
					}
				}
			}
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
			case CommonsPackage.LABELLABLE_ELEMENT__LABEL:
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
			case CommonsPackage.LABELLABLE_ELEMENT__LABEL:
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
			case CommonsPackage.LABELLABLE_ELEMENT__LABEL:
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
			case CommonsPackage.LABELLABLE_ELEMENT__LABEL:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommonsPackage.LABELLABLE_ELEMENT___FIRST:
				return first();
			case CommonsPackage.LABELLABLE_ELEMENT___LAST:
				return last();
			case CommonsPackage.LABELLABLE_ELEMENT___INTERNAL_FLOW:
				return internalFlow();
			case CommonsPackage.LABELLABLE_ELEMENT___GEN__ECLASS:
				return gen((EClass)arguments.get(0));
			case CommonsPackage.LABELLABLE_ELEMENT___KILL__ECLASS:
				return kill((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //LabellableElementImpl
