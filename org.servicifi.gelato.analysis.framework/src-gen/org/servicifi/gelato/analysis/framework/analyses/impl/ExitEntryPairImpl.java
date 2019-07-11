/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exit Entry Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.ExitEntryPairImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.servicifi.gelato.analysis.framework.analyses.impl.ExitEntryPairImpl#getExit <em>Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExitEntryPairImpl extends MinimalEObjectImpl.Container implements ExitEntryPair {
	/**
	 * The cached value of the '{@link #getEntry() <em>Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisResult> entry;

	/**
	 * The cached value of the '{@link #getExit() <em>Exit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExit()
	 * @generated
	 * @ordered
	 */
	protected EList<AnalysisResult> exit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitEntryPairImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */

	public ExitEntryPairImpl(EList<AnalysisResult> exit,
			EList<AnalysisResult> entry) {
		eSet(AnalysesPackage.EXIT_ENTRY_PAIR__EXIT, exit);
		eSet(AnalysesPackage.EXIT_ENTRY_PAIR__ENTRY, entry);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.EXIT_ENTRY_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnalysisResult> getEntry() {
		if (entry == null) {
			entry = new EObjectResolvingEList<AnalysisResult>(AnalysisResult.class, this, AnalysesPackage.EXIT_ENTRY_PAIR__ENTRY);
		}
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AnalysisResult> getExit() {
		if (exit == null) {
			exit = new EObjectResolvingEList<AnalysisResult>(AnalysisResult.class, this, AnalysesPackage.EXIT_ENTRY_PAIR__EXIT);
		}
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AnalysesPackage.EXIT_ENTRY_PAIR__ENTRY:
				return getEntry();
			case AnalysesPackage.EXIT_ENTRY_PAIR__EXIT:
				return getExit();
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
			case AnalysesPackage.EXIT_ENTRY_PAIR__ENTRY:
				getEntry().clear();
				getEntry().addAll((Collection<? extends AnalysisResult>)newValue);
				return;
			case AnalysesPackage.EXIT_ENTRY_PAIR__EXIT:
				getExit().clear();
				getExit().addAll((Collection<? extends AnalysisResult>)newValue);
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
			case AnalysesPackage.EXIT_ENTRY_PAIR__ENTRY:
				getEntry().clear();
				return;
			case AnalysesPackage.EXIT_ENTRY_PAIR__EXIT:
				getExit().clear();
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
			case AnalysesPackage.EXIT_ENTRY_PAIR__ENTRY:
				return entry != null && !entry.isEmpty();
			case AnalysesPackage.EXIT_ENTRY_PAIR__EXIT:
				return exit != null && !exit.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public String toString() {
		Collection<AnalysisResult> intEntry = new HashSet<AnalysisResult>(getEntry());
		Collection<AnalysisResult> intExit = new HashSet<AnalysisResult>(getExit());
		return String.format("Entry: %s; Exit; %s\n", intEntry, intExit);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ExitEntryPair) {
			ExitEntryPair other = (ExitEntryPair) obj;
			return this.getEntry().equals(other.getEntry()) && this.getExit().equals(other.getExit());
		}
		return false;
	}

} //ExitEntryPairImpl
