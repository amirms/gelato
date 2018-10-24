/**
 */
package org.servicifi.gelato.language.cobol.divisions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.divisions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DivisionsFactoryImpl extends EFactoryImpl implements DivisionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DivisionsFactory init() {
		try {
			DivisionsFactory theDivisionsFactory = (DivisionsFactory)EPackage.Registry.INSTANCE.getEFactory(DivisionsPackage.eNS_URI);
			if (theDivisionsFactory != null) {
				return theDivisionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DivisionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionsFactoryImpl() {
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
			case DivisionsPackage.DATA_DIVISION: return createDataDivision();
			case DivisionsPackage.ENVIRONMENT_DIVISION: return createEnvironmentDivision();
			case DivisionsPackage.IDENTIFICATION_DIVISION: return createIdentificationDivision();
			case DivisionsPackage.PROCEDURE_DIVISION: return createProcedureDivision();
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
			case DivisionsPackage.PROPERTIES:
				return createPropertiesFromString(eDataType, initialValue);
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
			case DivisionsPackage.PROPERTIES:
				return convertPropertiesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDivision createDataDivision() {
		DataDivisionImpl dataDivision = new DataDivisionImpl();
		return dataDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentDivision createEnvironmentDivision() {
		EnvironmentDivisionImpl environmentDivision = new EnvironmentDivisionImpl();
		return environmentDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationDivision createIdentificationDivision() {
		IdentificationDivisionImpl identificationDivision = new IdentificationDivisionImpl();
		return identificationDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDivision createProcedureDivision() {
		ProcedureDivisionImpl procedureDivision = new ProcedureDivisionImpl();
		return procedureDivision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createPropertiesFromString(EDataType eDataType, String initialValue) {
		Properties result = Properties.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivisionsPackage getDivisionsPackage() {
		return (DivisionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DivisionsPackage getPackage() {
		return DivisionsPackage.eINSTANCE;
	}

} //DivisionsFactoryImpl
