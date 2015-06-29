/**
 */
package org.servicifi.gelato.analysis.framework.analyses.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesFactory;
import org.servicifi.gelato.analysis.framework.analyses.AnalysesPackage;
import org.servicifi.gelato.analysis.framework.analyses.AnalysisDirection;
import org.servicifi.gelato.analysis.framework.analyses.ExitEntryPair;
import org.servicifi.gelato.analysis.framework.analyses.IteratorElement;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsAnalysis;
import org.servicifi.gelato.analysis.framework.analyses.ReachingDefinitionsResult;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.variables.Variable;

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
			case AnalysesPackage.REACHING_DEFINITIONS_ANALYSIS: return createReachingDefinitionsAnalysis();
			case AnalysesPackage.REACHING_DEFINITIONS_RESULT: return createReachingDefinitionsResult();
			case AnalysesPackage.EXIT_ENTRY_PAIR: return createExitEntryPair();
			case AnalysesPackage.ITERATOR_ELEMENT: return createIteratorElement();
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
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachingDefinitionsAnalysis createReachingDefinitionsAnalysis() {
		ReachingDefinitionsAnalysisImpl reachingDefinitionsAnalysis = new ReachingDefinitionsAnalysisImpl();
		return reachingDefinitionsAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReachingDefinitionsResult createReachingDefinitionsResult() {
		ReachingDefinitionsResultImpl reachingDefinitionsResult = new ReachingDefinitionsResultImpl();
		return reachingDefinitionsResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitEntryPair createExitEntryPair() {
		ExitEntryPairImpl exitEntryPair = new ExitEntryPairImpl();
		return exitEntryPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorElement createIteratorElement() {
		IteratorElementImpl iteratorElement = new IteratorElementImpl();
		return iteratorElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public IteratorElement createIteratorElement(int iteration, LabellableElement e) {
		IteratorElementImpl iteratorElement = new IteratorElementImpl(iteration, e);
		return iteratorElement;
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

	public ReachingDefinitionsResult createReachingDefinitionsResult(
			Variable v, long i) {
		ReachingDefinitionsResultImpl reachingDefinitionsResult = new ReachingDefinitionsResultImpl(v, i);
		return reachingDefinitionsResult;
	}

} //AnalysesFactoryImpl
