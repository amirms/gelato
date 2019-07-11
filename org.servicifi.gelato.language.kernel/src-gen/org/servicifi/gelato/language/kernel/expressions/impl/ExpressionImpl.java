/**
 */
package org.servicifi.gelato.language.kernel.expressions.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Variable;
import org.servicifi.gelato.analysis.framework.commons.impl.LabellableElementImpl;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.language.kernel.dataitems.DataItem;
import org.servicifi.gelato.language.kernel.expressions.Definition;
import org.servicifi.gelato.language.kernel.expressions.Expression;
import org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage;
import org.servicifi.gelato.language.kernel.expressions.SubExpression;
import org.servicifi.gelato.language.kernel.expressions.Usage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.servicifi.gelato.language.kernel.expressions.impl.ExpressionImpl#getChildren
 * <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends LabellableElementImpl implements Expression {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SubExpression> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionsPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<SubExpression> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<SubExpression>(SubExpression.class, this,
					ExpressionsPackage.EXPRESSION__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<DataItem> getDefinedVariables() {
		EList<DataItem> res = new BasicEList<>();
		EList<SubExpression> subexpressions = getChildren();
		Iterator<SubExpression> itr = subexpressions.iterator();

		while (itr.hasNext()) {
			SubExpression element = itr.next();

			if (element instanceof Definition)
				res.add((DataItem) ((Definition) element).getTarget());
		}

		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<DataItem> getUsedVariables() {
		EList<DataItem> res = new BasicEList<>();
		EList<SubExpression> subexpressions = getChildren();
		Iterator<SubExpression> itr = subexpressions.iterator();

		while (itr.hasNext()) {
			SubExpression element = itr.next();

			if (element instanceof Usage)
				res.add((DataItem) ((Usage) element).getTarget());
		}

		return res;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ExpressionsPackage.EXPRESSION__CHILDREN:
			return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
		case ExpressionsPackage.EXPRESSION__CHILDREN:
			return getChildren();
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
		case ExpressionsPackage.EXPRESSION__CHILDREN:
			getChildren().clear();
			getChildren().addAll((Collection<? extends SubExpression>) newValue);
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
		case ExpressionsPackage.EXPRESSION__CHILDREN:
			getChildren().clear();
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
		case ExpressionsPackage.EXPRESSION__CHILDREN:
			return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public LabellableElement first() {
		return this;
	}

	@Override
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();
		res.add(this);
		return res;
	}

	@Override
	public EList<Flow> internalFlow() {
		return new BasicEList<>();
	}

	@Override
	public EList<AnalysisResult> gen(AnalysisConfiguration configuration) {
		EList<AnalysisResult> res = new UniqueEList<>();

		if (configuration instanceof ReachingDefinitionsAnalysisConfiguration) {
			ReachingDefinitionsAnalysisConfiguration rdConfig = (ReachingDefinitionsAnalysisConfiguration) configuration;
			Map<Variable, EList<Double>> assignments = rdConfig.getAssignments();

			// TODO: at entry, may be initialize variables with ?
//			EList<DataItem> usages = getUsedVariables();
//			for (DataItem item : usages) {
//				res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(item, -1));
//			}
//			
			EList<DataItem> definitions = getDefinedVariables();
			for (DataItem item : definitions) {
				res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(item, getLabel()));
				if (assignments.containsKey(item)) {
					assignments.get(item).add(getLabel());
				} else {
					EList<Double> i = new BasicEList<>(1);
					i.add(getLabel());
					assignments.put(item, i);
				}
			}
		}

		return res;
	}

	@Override
	public EList<AnalysisResult> kill(AnalysisConfiguration configuration) {
		EList<AnalysisResult> res = new UniqueEList<>();

		if (configuration instanceof ReachingDefinitionsAnalysisConfiguration) {
			ReachingDefinitionsAnalysisConfiguration rdConfig = (ReachingDefinitionsAnalysisConfiguration) configuration;
			Map<Variable, EList<Double>> assignments = rdConfig.getAssignments();

			// Order matters
			EList<DataItem> items = getDefinedVariables();
			
			for (DataItem item : items) {
				res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(item, -1));
				if (assignments.containsKey(item)) {
					for (Double i : assignments.get(item)) {
						res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(item, i));
					}
				}
			}
		}

		return res;
	}

} // ExpressionImpl
