/**
 */
package org.servicifi.gelato.language.kernel.statements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.GraphsFactory;
import org.servicifi.gelato.analysis.framework.procedures.ProceduresFactory;
import org.servicifi.gelato.analysis.framework.procedures.ReturnSite;

import org.servicifi.gelato.language.kernel.references.Argument;
import org.servicifi.gelato.language.kernel.references.ElementReference;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.references.ReferencesPackage;

import org.servicifi.gelato.language.kernel.statements.ProcedureCall;
import org.servicifi.gelato.language.kernel.statements.StatementsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.statements.impl.ProcedureCallImpl#getReturnSite <em>Return Site</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureCallImpl extends StatementImpl implements ProcedureCall {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ReferenceableElement target;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<Argument> arguments;

	/**
	 * The cached value of the '{@link #getReturnSite() <em>Return Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnSite()
	 * @generated
	 * @ordered
	 */
	protected ReturnSite returnSite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementsPackage.Literals.PROCEDURE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableElement getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ReferenceableElement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatementsPackage.PROCEDURE_CALL__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceableElement basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ReferenceableElement newTarget) {
		ReferenceableElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PROCEDURE_CALL__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<Argument>(Argument.class, this, StatementsPackage.PROCEDURE_CALL__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReturnSite getReturnSite() {
		return returnSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnSite(ReturnSite newReturnSite, NotificationChain msgs) {
		ReturnSite oldReturnSite = returnSite;
		returnSite = newReturnSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementsPackage.PROCEDURE_CALL__RETURN_SITE, oldReturnSite, newReturnSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnSite(ReturnSite newReturnSite) {
		if (newReturnSite != returnSite) {
			NotificationChain msgs = null;
			if (returnSite != null)
				msgs = ((InternalEObject)returnSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PROCEDURE_CALL__RETURN_SITE, null, msgs);
			if (newReturnSite != null)
				msgs = ((InternalEObject)newReturnSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementsPackage.PROCEDURE_CALL__RETURN_SITE, null, msgs);
			msgs = basicSetReturnSite(newReturnSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementsPackage.PROCEDURE_CALL__RETURN_SITE, newReturnSite, newReturnSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementsPackage.PROCEDURE_CALL__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case StatementsPackage.PROCEDURE_CALL__RETURN_SITE:
				return basicSetReturnSite(null, msgs);
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
			case StatementsPackage.PROCEDURE_CALL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatementsPackage.PROCEDURE_CALL__ARGUMENTS:
				return getArguments();
			case StatementsPackage.PROCEDURE_CALL__RETURN_SITE:
				return getReturnSite();
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
			case StatementsPackage.PROCEDURE_CALL__TARGET:
				setTarget((ReferenceableElement)newValue);
				return;
			case StatementsPackage.PROCEDURE_CALL__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends Argument>)newValue);
				return;
			case StatementsPackage.PROCEDURE_CALL__RETURN_SITE:
				setReturnSite((ReturnSite)newValue);
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
			case StatementsPackage.PROCEDURE_CALL__TARGET:
				setTarget((ReferenceableElement)null);
				return;
			case StatementsPackage.PROCEDURE_CALL__ARGUMENTS:
				getArguments().clear();
				return;
			case StatementsPackage.PROCEDURE_CALL__RETURN_SITE:
				setReturnSite((ReturnSite)null);
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
			case StatementsPackage.PROCEDURE_CALL__TARGET:
				return target != null;
			case StatementsPackage.PROCEDURE_CALL__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case StatementsPackage.PROCEDURE_CALL__RETURN_SITE:
				return returnSite != null;
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
		if (baseClass == ElementReference.class) {
			switch (derivedFeatureID) {
				case StatementsPackage.PROCEDURE_CALL__TARGET: return ReferencesPackage.ELEMENT_REFERENCE__TARGET;
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
		if (baseClass == ElementReference.class) {
			switch (baseFeatureID) {
				case ReferencesPackage.ELEMENT_REFERENCE__TARGET: return StatementsPackage.PROCEDURE_CALL__TARGET;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public LabellableElement first() {
		return this;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public EList<LabellableElement> last() {
		EList<LabellableElement> res = new BasicEList<>();

		ReturnSite returnSite = getReturnSite();

		if (returnSite == null)
			setReturnSite(ProceduresFactory.eINSTANCE.createReturnSite());

		res.add(getReturnSite());

		return res;
	}
	
	@Override
	public EList<Flow> internalFlow() {
		EList<Flow> res = new BasicEList<>();

		ReturnSite returnSite = getReturnSite();

		if (returnSite == null)
			setReturnSite(ProceduresFactory.eINSTANCE.createReturnSite());

		// res.add(FlowsFactory.eINSTANCE.createRegularFlow(this, getReturnSite()));
		res.add(GraphsFactory.eINSTANCE.createSummaryFlow(this, getReturnSite()));

		return res;
	}

	public String toString() {
		return String.format("Procedure Call(%s,%s)", getTarget(), getArguments());
	}

	@Override
	public EList<AnalysisResult> kill(AnalysisConfiguration configuration) {
		EList<AnalysisResult> res = new UniqueEList<>();

		// TODO need to change the language to have something like v := call(e)
//		if (configuration instanceof ReachingDefinitionsAnalysisConfiguration) {
//			ReachingDefinitionsAnalysisConfiguration rdConfig = (ReachingDefinitionsAnalysisConfiguration) configuration;
//			Map<Variable, EList<Long>> assignments = rdConfig.getAssignments();
//
//			DataItem v = getReturnVal();
//			res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, -1));
//			if (assignments.containsKey(v)) {
//				for (Long i : assignments.get(v)) {
//					res.add(AnalysesFactory.eINSTANCE.createReachingDefinitionsResult(v, i));
//				}
//			}
//		}

		return res;
	}
} //ProcedureCallImpl
