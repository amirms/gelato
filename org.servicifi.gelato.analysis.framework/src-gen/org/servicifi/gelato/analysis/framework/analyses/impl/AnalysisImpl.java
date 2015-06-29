/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.Analysis;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IteratorElement;
import org.servicifi.gelato.analysis.framework.flows.Flow;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.End;
import org.servicifi.gelato.language.kernel.containers.Start;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getExitTable <em>Exit Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.AnalysisImpl#getEntryTable <em>Entry Table</em>}</li>
 * </ul>
 * </p>
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
	protected AnalysisImpl(EList<Flow> cfg, AnalysisDirection dir) {
		super();
		
		eSet(AnalysesPackage.ANALYSIS__CFG, cfg);
		setDirection(dir);
		if (getDirection().equals(AnalysisDirection.BACKWARDS)) {
			
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
	public EList<AnalysisResult> kill(LabellableElement e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisResult> gen(LabellableElement e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisResult> entry(LabellableElement e, int iteration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisResult> exit(LabellableElement e, int iteration) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<Long, ExitEntryPair> performAnalysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
		for (int i = 0; i < this.cfg.size(); i++) {
			map = new TreeMap<>();
			for (Flow f : this.cfg) {
				//FIXME replace it with the factory
				ExitEntryPair pair = new ExitEntryPairImpl(exit(f.getFrom(), i), entry(f.getFrom(), i));
				map.put(f.getFrom().getLabel(), pair);
			}
		}
		
		map.remove(1); // Thats the Program.START one
		map.remove(2); // Thats the Program.END one
		result = map;
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> getAllNodesWithDirection(LabellableElement e, AnalysisDirection dir) {
		//there is a unique pair of start and end nodes
		
		if ((e instanceof Start) || (e instanceof End)) {
			return new UniqueEList<>();
		}
		EList<LabellableElement> res = new UniqueEList<>();

		for (Flow f : getCfg()) {
			if (dir == AnalysisDirection.BACKWARDS && f.getTo().equals(e)) {
				res.add(f.getFrom());
			}
			else if (dir == AnalysisDirection.FORWARDS && f.getFrom().equals(e)) {
				res.add(f.getTo());
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
			case AnalysesPackage.ANALYSIS___KILL__LABELLABLEELEMENT:
				return kill((LabellableElement)arguments.get(0));
			case AnalysesPackage.ANALYSIS___GEN__LABELLABLEELEMENT:
				return gen((LabellableElement)arguments.get(0));
			case AnalysesPackage.ANALYSIS___ENTRY__LABELLABLEELEMENT_INT:
				return entry((LabellableElement)arguments.get(0), (Integer)arguments.get(1));
			case AnalysesPackage.ANALYSIS___EXIT__LABELLABLEELEMENT_INT:
				return exit((LabellableElement)arguments.get(0), (Integer)arguments.get(1));
			case AnalysesPackage.ANALYSIS___PERFORM_ANALYSIS:
				return performAnalysis();
			case AnalysesPackage.ANALYSIS___GET_ALL_NODES_WITH_DIRECTION__LABELLABLEELEMENT_ANALYSISDIRECTION:
				return getAllNodesWithDirection((LabellableElement)arguments.get(0), (AnalysisDirection)arguments.get(1));
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
