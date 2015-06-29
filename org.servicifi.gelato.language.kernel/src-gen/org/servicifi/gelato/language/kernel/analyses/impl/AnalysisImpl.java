/**
 */
package org.servicifi.gelato.language.kernel.analyses.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.servicifi.gelato.language.kernel.analyses.AnalysesFactory;
import org.servicifi.gelato.language.kernel.analyses.AnalysesPackage;
import org.servicifi.gelato.language.kernel.analyses.Analysis;
import org.servicifi.gelato.language.kernel.analyses.AnalysisDirection;
import org.servicifi.gelato.language.kernel.analyses.AnalysisResult;
import org.servicifi.gelato.language.kernel.analyses.AnalysisType;
import org.servicifi.gelato.language.kernel.analyses.ExitEntryPair;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.End;
import org.servicifi.gelato.language.kernel.containers.Start;
import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.flows.RegularFlow;
import org.servicifi.gelato.language.kernel.statements.ProcedureCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl#getCfg <em>Cfg</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl#getExitTable <em>Exit Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl#getEntryTable <em>Entry Table</em>}</li>
 *   <li>{@link org.servicifi.gelato.language.kernel.analyses.impl.AnalysisImpl#getAnalysisType <em>Analysis Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AnalysisImpl extends EObjectImpl implements Analysis {
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
	 * @generated NOT
	 * @ordered
	 */
	protected Map<LabellableElement, EList<AnalysisResult>> exitTable = new HashMap<>();;

	/**
	 * The cached value of the '{@link #getEntryTable() <em>Entry Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryTable()
	 * @generated NOT
	 * @ordered
	 */
	protected Map<LabellableElement, EList<AnalysisResult>> entryTable = new HashMap<>();;

	/**
	 * The default value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected static final AnalysisType ANALYSIS_TYPE_EDEFAULT = AnalysisType.MUST;

	/**
	 * The cached value of the '{@link #getAnalysisType() <em>Analysis Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisType()
	 * @generated
	 * @ordered
	 */
	protected AnalysisType analysisType = ANALYSIS_TYPE_EDEFAULT;

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
	protected AnalysisImpl(EList<Flow> cfg, AnalysisDirection dir, AnalysisType type) {
		super();
		
		eSet(AnalysesPackage.ANALYSIS__CFG, cfg);
		setDirection(dir);
		setAnalysisType(type);
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
	public Map<LabellableElement, EList<AnalysisResult>> getExitTable() {
		return exitTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExitTable(Map<LabellableElement, EList<AnalysisResult>> newExitTable) {
		Map<LabellableElement, EList<AnalysisResult>> oldExitTable = exitTable;
		exitTable = newExitTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__EXIT_TABLE, oldExitTable, exitTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<LabellableElement, EList<AnalysisResult>> getEntryTable() {
		return entryTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryTable(Map<LabellableElement, EList<AnalysisResult>> newEntryTable) {
		Map<LabellableElement, EList<AnalysisResult>> oldEntryTable = entryTable;
		entryTable = newEntryTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__ENTRY_TABLE, oldEntryTable, entryTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisType getAnalysisType() {
		return analysisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnalysisType(AnalysisType newAnalysisType) {
		AnalysisType oldAnalysisType = analysisType;
		analysisType = newAnalysisType == null ? ANALYSIS_TYPE_EDEFAULT : newAnalysisType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnalysesPackage.ANALYSIS__ANALYSIS_TYPE, oldAnalysisType, analysisType));
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
	public EList<AnalysisResult> entry(LabellableElement e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AnalysisResult> exit(LabellableElement e) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

//	public Map<Long, ExitEntryPair> performInterproceduralAnalysis() {
//
//		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
//		Queue<LabellableElement> worklist = new LinkedList<>();
//		Queue<LabellableElement> pathEdge = new LinkedList<>();
//		
//		worklist.add(cfg.get(0).getFrom());
//		
//		LabellableElement workElement = null;
//		
//		while (!worklist.isEmpty()){
//			//select the front of queue and remove it from the queue
//			workElement = worklist.poll();	
//			
//			EList<AnalysisResult> entry =  entry(workElement);
//			EList<AnalysisResult> exit =  exit(workElement);
//			
//			if (workElement instanceof ProcedureCall)
//			
//			
//			}
//
//			
//		}
//		
//		
//		return null;
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Map<Long, ExitEntryPair> performAnalysis() {
		
		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
		Queue<LabellableElement> worklist = new LinkedList<>();
	
		//for every node in cfg, insert in the worklist
		//The first edge must be from START
		
		worklist.add(cfg.get(0).getFrom());
		
		LabellableElement workElement = null;
		
		while (!worklist.isEmpty()){
			
			workElement = worklist.poll();	
			
			//get the last iteration
//			int curIteration = 0;
//			if (iterationmap.containsKey(workElement))
//				curIteration = iterationmap.get(workElement) + 1;
			
//			iterationmap.put(workElement, curIteration);
			
			EList<AnalysisResult> entry =  entry(workElement);
			EList<AnalysisResult> exit =  exit(workElement);
			
			ExitEntryPair pair = AnalysesFactory.eINSTANCE.createExitEntryPair(exit, entry);
				// Add elements to worklist
			//if old != new 
			if (map.containsKey(workElement.getLabel())){
				System.out.println("map size is: " + map.size());
				System.out.println(map.get(workElement.getLabel()));

				
				if (map.get(workElement.getLabel()).getExit().equals(pair.getExit()))
					continue;
				
			}
			
			map.put(workElement.getLabel(), pair);
			System.out.println(workElement);
			EList<LabellableElement> nodes = getAllNodesWithDirection(workElement, getDirection(), Flow.class);
			
			System.out.println(nodes.size());

			worklist.addAll(nodes);
			
		}
		//FIXME remove all start and end nodes
		map.remove(new Long(0)); // the label for the start node
		map.remove(new Long(Long.MAX_VALUE)); // the label for the start node
		result = map;
		return map;
	}
	
	
	

	
	
//	public Map<Long, ExitEntryPair> performAnalysis() {
//		Map<Long, ExitEntryPair> map = new HashMap<Long, ExitEntryPair>();
//		for (int i = 0; i < this.cfg.size(); i++) {
//			map = new TreeMap<>();
//			for (Flow f : this.cfg) {
//				
//				ExitEntryPair pair = AnalysesFactory.eINSTANCE.createExitEntryPair(exit(f.getFrom(), i), entry(f.getFrom(), i));
//				map.put(f.getFrom().getLabel(), pair);
//				//System.out.print(b);
//			}
//		}
//		
//		map.remove(new Long(1)); // Thats the Program.START one
//		map.remove(new Long(2)); // Thats the Program.END one
//		result = map;
//		return map;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<LabellableElement> getAllNodesWithDirection(LabellableElement e, AnalysisDirection dir, Class<? extends Flow> flowType ) {
		//there is a unique pair of start and end nodes
		
		if ((e instanceof Start) && (dir == AnalysisDirection.BACKWARDS ))
			return new UniqueEList<>();
				
		if ((e instanceof End) && (dir == AnalysisDirection.FORWARDS)) 
			return new UniqueEList<>();
				
		EList<LabellableElement> res = new UniqueEList<>();

		for (Flow f : getCfg()) {
			if(flowType.isInstance(f))
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
	 * @generated NOT
	 */
	public EList<AnalysisResult> meet(EList<EList<AnalysisResult>> exits) {
		EList<AnalysisResult> res = new UniqueEList<AnalysisResult>();
		
		if (getAnalysisType().equals(AnalysisType.MUST)){
			for (EList<AnalysisResult> e : exits)
				res.addAll(e);
			
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
			case AnalysesPackage.ANALYSIS__ANALYSIS_TYPE:
				return getAnalysisType();
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
				setExitTable((Map<LabellableElement, EList<AnalysisResult>>)newValue);
				return;
			case AnalysesPackage.ANALYSIS__ENTRY_TABLE:
				setEntryTable((Map<LabellableElement, EList<AnalysisResult>>)newValue);
				return;
			case AnalysesPackage.ANALYSIS__ANALYSIS_TYPE:
				setAnalysisType((AnalysisType)newValue);
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
				setExitTable((Map<LabellableElement, EList<AnalysisResult>>)null);
				return;
			case AnalysesPackage.ANALYSIS__ENTRY_TABLE:
				setEntryTable((Map<LabellableElement, EList<AnalysisResult>>)null);
				return;
			case AnalysesPackage.ANALYSIS__ANALYSIS_TYPE:
				setAnalysisType(ANALYSIS_TYPE_EDEFAULT);
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
			case AnalysesPackage.ANALYSIS__ANALYSIS_TYPE:
				return analysisType != ANALYSIS_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", analysisType: ");
		result.append(analysisType);
		result.append(')');
		return result.toString();
	}

} //AnalysisImpl
