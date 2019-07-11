/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisResult;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisType;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.InterproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.IntraproceduralAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysisResult;
import org.servicifi.gelato.analysis.framework.commons.Variable;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisConfiguration;
import org.servicifi.gelato.analysis.framework.graphs.Flow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnalysesFactoryImpl extends EFactoryImpl implements AnalysesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnalysesFactory init() {
		try {
			AnalysesFactory theAnalysesFactory = (AnalysesFactory)EPackage.Registry.INSTANCE.getEFactory(AnalysesPackage.eNS_URI);
			if (theAnalysesFactory != null) {
				return theAnalysesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnalysesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnalysesPackage.EXIT_ENTRY_PAIR: return createExitEntryPair();
			case AnalysesPackage.INTRAPROCEDURAL_ANALYSIS: return createIntraproceduralAnalysis();
			case AnalysesPackage.INTERPROCEDURAL_ANALYSIS: return createInterproceduralAnalysis();
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_CONFIGURATION: return createReachingDefinitionsAnalysisConfiguration();
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS_RESULT: return createReachingDefinitionsAnalysisResult();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysesPackage.ANALYSIS_DIRECTION:
				return createAnalysisDirectionFromString(eDataType, initialValue);
			case AnalysesPackage.ANALYSIS_TYPE:
				return createAnalysisTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnalysesPackage.ANALYSIS_DIRECTION:
				return convertAnalysisDirectionToString(eDataType, instanceValue);
			case AnalysesPackage.ANALYSIS_TYPE:
				return convertAnalysisTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExitEntryPair createExitEntryPair() {
		ExitEntryPairImpl exitEntryPair = new ExitEntryPairImpl();
		return exitEntryPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntraproceduralAnalysis createIntraproceduralAnalysis() {
		IntraproceduralAnalysisImpl intraproceduralAnalysis = new IntraproceduralAnalysisImpl();
		return intraproceduralAnalysis;
	}
	
	public IntraproceduralAnalysis createIntraproceduralAnalysis(EList<Flow> cfg, AnalysisConfiguration configuration) {
		IntraproceduralAnalysisImpl intraproceduralAnalysis = new IntraproceduralAnalysisImpl(cfg, configuration);
		return intraproceduralAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterproceduralAnalysis createInterproceduralAnalysis() {
		InterproceduralAnalysisImpl interproceduralAnalysis = new InterproceduralAnalysisImpl();
		return interproceduralAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReachingDefinitionsAnalysisConfiguration createReachingDefinitionsAnalysisConfiguration() {
		ReachingDefinitionsAnalysisConfigurationImpl reachingDefinitionsAnalysisConfiguration = new ReachingDefinitionsAnalysisConfigurationImpl();
		return reachingDefinitionsAnalysisConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReachingDefinitionsAnalysisResult createReachingDefinitionsAnalysisResult() {
		ReachingDefinitionsAnalysisResultImpl reachingDefinitionsAnalysisResult = new ReachingDefinitionsAnalysisResultImpl();
		return reachingDefinitionsAnalysisResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisDirection createAnalysisDirectionFromString(EDataType eDataType, String initialValue) {
		AnalysisDirection result = AnalysisDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnalysisDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalysisType createAnalysisTypeFromString(EDataType eDataType, String initialValue) {
		AnalysisType result = AnalysisType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnalysisTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnalysesPackage getAnalysesPackage() {
		return (AnalysesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnalysesPackage getPackage() {
		return AnalysesPackage.eINSTANCE;
	}

//	@Override
//	public IteratorElement createIteratorElement(int i, LabellableElement workElement) {
//		IteratorElementImpl iteratorElement = new IteratorElementImpl(i, workElement);
//		return iteratorElement;
//	}

	@Override
	public AnalysisResult createReachingDefinitionsResult(Variable v, double i) {
		ReachingDefinitionsAnalysisResultImpl reachingDefinitionsAnalysisResult = 
				new ReachingDefinitionsAnalysisResultImpl(v,i);
		return reachingDefinitionsAnalysisResult;
	}

	@Override
	public ExitEntryPair createExitEntryPair(EList<AnalysisResult> exit, EList<AnalysisResult> entry) {
		ExitEntryPair exitEntry = 
				new ExitEntryPairImpl(exit,entry);
		return exitEntry;
	}

} //AnalysesFactoryImpl
