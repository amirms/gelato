/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.Analysis;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IteratorElement;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.analysis.framework.commons.Start;
import org.servicifi.gelato.analysis.framework.graphs.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getExitTable <em>Exit Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getEntryTable <em>Entry Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AnalysisImpl extends MinimalEObjectImpl.Container implements Analysis {
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
	 * The cached value of the '{@link #getCfg() <em>Cfg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCfg()
	 * @generated
	 * @ordered
	 */
	protected EList<Flow> cfg;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected Map<Long, ExitEntryPair> result;

	/**
	 * The cached value of the '{@link #getExitTable() <em>Exit Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitTable()
	 * @generated
	 * @ordered
	 */
	protected Map<IteratorElement, EList<AnalysisResult>> exitTable;

	/**
	 * The cached value of the '{@link #getEntryTable() <em>Entry Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryTable()
	 * @generated
	 * @ordered
	 */
	protected Map<IteratorElement, EList<AnalysisResult>> entryTable;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected AnalysisConfiguration configuration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisImpl() {
		super();
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */	
	protected AnalysisImpl(EList<Flow> cfg, AnalysisConfiguration configuration) {
		super();
		
		eSet(AnalysesPackage.ANALYSIS__CFG, cfg);
		setConfiguration(configuration);
		if (configuration.getDirection().equals(AnalysisDirection.BACKWARDS)) {			
			//FIXME reverse cfg
			//EList.reverse(get);
			Collections.reverse(this.cfg);		
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(AnalysisDirection newDirection) {
		AnalysisDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Flow> getCfg() {
		if (cfg == null) {
			cfg = new EObjectResolvingEList<Flow>(Flow.class, this, AnalysesPackage.ANALYSIS__CFG);
		}
		return cfg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Long, ExitEntryPair> getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(Map<Long, ExitEntryPair> newResult) {
		Map<Long, ExitEntryPair> oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<IteratorElement, EList<AnalysisResult>> getExitTable() {
		return exitTable;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitTable(Map<IteratorElement, EList<AnalysisResult>> newExitTable) {
		Map<IteratorElement, EList<AnalysisResult>> oldExitTable = exitTable;
		exitTable = newExitTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__EXIT_TABLE, oldExitTable, exitTable));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<IteratorElement, EList<AnalysisResult>> getEntryTable() {
		return entryTable;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryTable(Map<IteratorElement, EList<AnalysisResult>> newEntryTable) {
		Map<IteratorElement, EList<AnalysisResult>> oldEntryTable = entryTable;
		entryTable = newEntryTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__ENTRY_TABLE, oldEntryTable, entryTable));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisConfiguration getConfiguration() {
		return configuration;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(AnalysisConfiguration newConfiguration, NotificationChain msgs) {
		AnalysisConfiguration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(AnalysisConfiguration newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnalysesPackage.ANALYSIS__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnalysesPackage.ANALYSIS__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__CONFIGURATION, newConfiguration, newConfiguration));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AnalysisResult> entry(LabellableElement e, int i) {
		if (e instanceof Start) {
			return new UniqueEList<>();
		}
		// res must be TreeSet
		EList<AnalysisResult> res = new UniqueEList<>();
		for (LabellableElement workElement : getAllNodesWithDirection(e, AnalysisDirection.BACKWARDS, Flow.class)) {
			EList<AnalysisResult> x = getExitTable()
					.get(AnalysesFactory.eINSTANCE.createIteratorElement(i, workElement));
			if (x == null) {
				x = new UniqueEList<>();
			}
			res.addAll(x);
		}
		getEntryTable().put(AnalysesFactory.eINSTANCE.createIteratorElement(i, e), res);
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<AnalysisResult> exit(LabellableElement e, int i) {
		if (e instanceof Start) {
			return new UniqueEList<>();
		}
		EList<AnalysisResult> res = getEntryTable().get(AnalysesFactory.eINSTANCE.createIteratorElement(i - 1, e));
		if (res == null) {
			res = new UniqueEList<>();
		}
		for (AnalysisResult ar : this.getConfiguration().kill(e)) {
			res.remove(ar);
		}
		res.addAll(this.getConfiguration().gen(e));
		// TreeSet or UniqueEList
		res = new UniqueEList<>(res);
		getExitTable().put(AnalysesFactory.eINSTANCE.createIteratorElement(i, e), res);
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<Long, ExitEntryPair> performAnalysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabellableElement> getAllNodesWithDirection(LabellableElement e, AnalysisDirection dir, EClass flowType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisResult> meet(EList<EList<AnalysisResult>> exits) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> getAllNodesWithDirection(LabellableElement e, AnalysisDirection analysisDirection, Class<? extends Flow> flowType ) {
		//there is a unique pair of start and end nodes
		
		if ((e instanceof Start) && (analysisDirection == AnalysisDirection.BACKWARDS ))
			return new UniqueEList<>();
				
		if ((e instanceof End) && (analysisDirection == AnalysisDirection.FORWARDS)) 
			return new UniqueEList<>();
				
		EList<LabellableElement> res = new UniqueEList<>();

		for (Flow f : getCfg()) {
			if(flowType.isInstance(f))
				if (analysisDirection == AnalysisDirection.BACKWARDS && f.getTo().equals(e)) {
					res.add(f.getFrom());
				}
				else if (analysisDirection == AnalysisDirection.FORWARDS && f.getFrom().equals(e)) {
					res.add(f.getTo());
				}
		}
		return res;
	}
	
	public EList<Flow> getAllEdgesWithDirection(LabellableElement e, AnalysisDirection dir, Class<? extends Flow> flowType ) {
		if ((e instanceof Start) && (dir == AnalysisDirection.BACKWARDS ))
			return new UniqueEList<>();
				
		if ((e instanceof End) && (dir == AnalysisDirection.FORWARDS)) 
			return new UniqueEList<>();
		
		EList<Flow> res = new UniqueEList<>();
		
		for (Flow f : getCfg()) {
			if(flowType.isInstance(f))
				if (dir == AnalysisDirection.BACKWARDS && f.getTo().equals(e)) {
					res.add(f);
				}
				else if (dir == AnalysisDirection.FORWARDS && f.getFrom().equals(e)) {
					res.add(f);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnalysesPackage.ANALYSIS__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
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
			case AnalysesPackage.ANALYSIS__DIRECTION:
				return getDirection();
			case AnalysesPackage.ANALYSIS__CFG:
				return getCfg();
			case AnalysesPackage.ANALYSIS__RESULT:
				return getResult();
			case AnalysesPackage.ANALYSIS__EXIT_TABLE:
				return getExitTable();
			case AnalysesPackage.ANALYSIS__ENTRY_TABLE:
				return getEntryTable();
			case AnalysesPackage.ANALYSIS__CONFIGURATION:
				return getConfiguration();
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
			case AnalysesPackage.ANALYSIS__DIRECTION:
				setDirection((AnalysisDirection)newValue);
				return;
			case AnalysesPackage.ANALYSIS__CFG:
				getCfg().clear();
				getCfg().addAll((Collection<? extends Flow>)newValue);
				return;
			case AnalysesPackage.ANALYSIS__RESULT:
				setResult((Map<Long, ExitEntryPair>)newValue);
				return;
			case AnalysesPackage.ANALYSIS__EXIT_TABLE:
				setExitTable((Map<IteratorElement, EList<AnalysisResult>>)newValue);
				return;
			case AnalysesPackage.ANALYSIS__ENTRY_TABLE:
				setEntryTable((Map<IteratorElement, EList<AnalysisResult>>)newValue);
				return;
			case AnalysesPackage.ANALYSIS__CONFIGURATION:
				setConfiguration((AnalysisConfiguration)newValue);
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
			case AnalysesPackage.ANALYSIS__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case AnalysesPackage.ANALYSIS__CFG:
				getCfg().clear();
				return;
			case AnalysesPackage.ANALYSIS__RESULT:
				setResult((Map<Long, ExitEntryPair>)null);
				return;
			case AnalysesPackage.ANALYSIS__EXIT_TABLE:
				setExitTable((Map<IteratorElement, EList<AnalysisResult>>)null);
				return;
			case AnalysesPackage.ANALYSIS__ENTRY_TABLE:
				setEntryTable((Map<IteratorElement, EList<AnalysisResult>>)null);
				return;
			case AnalysesPackage.ANALYSIS__CONFIGURATION:
				setConfiguration((AnalysisConfiguration)null);
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
			case AnalysesPackage.ANALYSIS__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case AnalysesPackage.ANALYSIS__CFG:
				return cfg != null && !cfg.isEmpty();
			case AnalysesPackage.ANALYSIS__RESULT:
				return result != null;
			case AnalysesPackage.ANALYSIS__EXIT_TABLE:
				return exitTable != null;
			case AnalysesPackage.ANALYSIS__ENTRY_TABLE:
				return entryTable != null;
			case AnalysesPackage.ANALYSIS__CONFIGURATION:
				return configuration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnalysesPackage.ANALYSIS___ENTRY__LABELLABLEELEMENT_INT:
				return entry((LabellableElement)arguments.get(0), (Integer)arguments.get(1));
			case AnalysesPackage.ANALYSIS___EXIT__LABELLABLEELEMENT_INT:
				return exit((LabellableElement)arguments.get(0), (Integer)arguments.get(1));
			case AnalysesPackage.ANALYSIS___PERFORM_ANALYSIS:
				return performAnalysis();
			case AnalysesPackage.ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION_ECLASS:
				return getAllNodesWithDirection((LabellableElement)arguments.get(0), (AnalysisDirection)arguments.get(1), (EClass)arguments.get(2));
			case AnalysesPackage.ANALYSIS___MEET__ELIST:
				return meet((EList<EList<AnalysisResult>>)arguments.get(0));
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(", result: ");
		result.append(result);
		result.append(", exitTable: ");
		result.append(exitTable);
		result.append(", entryTable: ");
		result.append(entryTable);
		result.append(')');
		return result.toString();
	}

} //AnalysisImpl
