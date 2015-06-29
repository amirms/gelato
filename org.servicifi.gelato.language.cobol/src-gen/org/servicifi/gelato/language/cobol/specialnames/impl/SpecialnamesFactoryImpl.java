/**
 */
package org.servicifi.gelato.language.cobol.specialnames.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.specialnames.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpecialnamesFactoryImpl extends EFactoryImpl implements SpecialnamesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpecialnamesFactory init() {
		try {
			SpecialnamesFactory theSpecialnamesFactory = (SpecialnamesFactory)EPackage.Registry.INSTANCE.getEFactory(SpecialnamesPackage.eNS_URI);
			if (theSpecialnamesFactory != null) {
				return theSpecialnamesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpecialnamesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialnamesFactoryImpl() {
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
			case SpecialnamesPackage.ON_STATUS: return createOnStatus();
			case SpecialnamesPackage.OFF_STATUS: return createOffStatus();
			case SpecialnamesPackage.ALPHABET_NAME: return createAlphabetName();
			case SpecialnamesPackage.UPSI_SWITCH_IS: return createUPSISwitchIs();
			case SpecialnamesPackage.PREDEFINED_ALPHABET_TYPE: return createPredefinedAlphabetType();
			case SpecialnamesPackage.EXPLICIT_ALPHABET_TYPE: return createExplicitAlphabetType();
			case SpecialnamesPackage.CODE_NAME_ALPHABET_TYPE: return createCodeNameAlphabetType();
			case SpecialnamesPackage.CURRENCY_SIGN: return createCurrencySign();
			case SpecialnamesPackage.CLASS_NAME: return createClassName();
			case SpecialnamesPackage.SYSTEM_DEVICE_IS: return createSystemDeviceIs();
			case SpecialnamesPackage.SYMBOLIC_CHARACTER: return createSymbolicCharacter();
			case SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT: return createSymbolicCharacterStatement();
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
			case SpecialnamesPackage.PREDEFINED_ALPHABET_TYPES:
				return createPredefinedAlphabetTypesFromString(eDataType, initialValue);
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
			case SpecialnamesPackage.PREDEFINED_ALPHABET_TYPES:
				return convertPredefinedAlphabetTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnStatus createOnStatus() {
		OnStatusImpl onStatus = new OnStatusImpl();
		return onStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OffStatus createOffStatus() {
		OffStatusImpl offStatus = new OffStatusImpl();
		return offStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabetName createAlphabetName() {
		AlphabetNameImpl alphabetName = new AlphabetNameImpl();
		return alphabetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPSISwitchIs createUPSISwitchIs() {
		UPSISwitchIsImpl upsiSwitchIs = new UPSISwitchIsImpl();
		return upsiSwitchIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedAlphabetType createPredefinedAlphabetType() {
		PredefinedAlphabetTypeImpl predefinedAlphabetType = new PredefinedAlphabetTypeImpl();
		return predefinedAlphabetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplicitAlphabetType createExplicitAlphabetType() {
		ExplicitAlphabetTypeImpl explicitAlphabetType = new ExplicitAlphabetTypeImpl();
		return explicitAlphabetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeNameAlphabetType createCodeNameAlphabetType() {
		CodeNameAlphabetTypeImpl codeNameAlphabetType = new CodeNameAlphabetTypeImpl();
		return codeNameAlphabetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrencySign createCurrencySign() {
		CurrencySignImpl currencySign = new CurrencySignImpl();
		return currencySign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassName createClassName() {
		ClassNameImpl className = new ClassNameImpl();
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemDeviceIs createSystemDeviceIs() {
		SystemDeviceIsImpl systemDeviceIs = new SystemDeviceIsImpl();
		return systemDeviceIs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicCharacter createSymbolicCharacter() {
		SymbolicCharacterImpl symbolicCharacter = new SymbolicCharacterImpl();
		return symbolicCharacter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicCharacterStatement createSymbolicCharacterStatement() {
		SymbolicCharacterStatementImpl symbolicCharacterStatement = new SymbolicCharacterStatementImpl();
		return symbolicCharacterStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredefinedAlphabetTypes createPredefinedAlphabetTypesFromString(EDataType eDataType, String initialValue) {
		PredefinedAlphabetTypes result = PredefinedAlphabetTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPredefinedAlphabetTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialnamesPackage getSpecialnamesPackage() {
		return (SpecialnamesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpecialnamesPackage getPackage() {
		return SpecialnamesPackage.eINSTANCE;
	}

} //SpecialnamesFactoryImpl
