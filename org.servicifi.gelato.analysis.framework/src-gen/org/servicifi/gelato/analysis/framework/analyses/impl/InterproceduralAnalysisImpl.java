/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.InterproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interprocedural Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InterproceduralAnalysisImpl extends AnalysisImpl implements InterproceduralAnalysis {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterproceduralAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnalysesPackage.Literals.INTERPROCEDURAL_ANALYSIS;
	}

	@Override
	public Map<Double, ExitEntryPair> performAnalysis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<AnalysisResult> meet(EList<EList<AnalysisResult>> exits) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<AnalysisResult> entry(LabellableElement e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<AnalysisResult> exit(LabellableElement e) {
		// TODO Auto-generated method stub
		return null;
	}
} //InterproceduralAnalysisImpl
