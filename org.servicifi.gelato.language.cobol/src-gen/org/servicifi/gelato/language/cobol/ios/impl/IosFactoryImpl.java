/**
 */
package org.servicifi.gelato.language.cobol.ios.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.ios.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IosFactoryImpl extends EFactoryImpl implements IosFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IosFactory init() {
		try {
			IosFactory theIosFactory = (IosFactory)EPackage.Registry.INSTANCE.getEFactory(IosPackage.eNS_URI);
			if (theIosFactory != null) {
				return theIosFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IosFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IosFactoryImpl() {
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
			case IosPackage.INPUT_PROCEDURE: return createInputProcedure();
			case IosPackage.INPUT_FILE: return createInputFile();
			case IosPackage.OUTPUT_PROCEDURE: return createOutputProcedure();
			case IosPackage.OUTPUT_FILE: return createOutputFile();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputProcedure createInputProcedure() {
		InputProcedureImpl inputProcedure = new InputProcedureImpl();
		return inputProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFile createInputFile() {
		InputFileImpl inputFile = new InputFileImpl();
		return inputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputProcedure createOutputProcedure() {
		OutputProcedureImpl outputProcedure = new OutputProcedureImpl();
		return outputProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFile createOutputFile() {
		OutputFileImpl outputFile = new OutputFileImpl();
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IosPackage getIosPackage() {
		return (IosPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IosPackage getPackage() {
		return IosPackage.eINSTANCE;
	}

} //IosFactoryImpl
