/**
 */
package org.servicifi.gelato.language.cobol.environments.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.environments.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentsFactoryImpl extends EFactoryImpl implements EnvironmentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnvironmentsFactory init() {
		try {
			EnvironmentsFactory theEnvironmentsFactory = (EnvironmentsFactory)EPackage.Registry.INSTANCE.getEFactory(EnvironmentsPackage.eNS_URI);
			if (theEnvironmentsFactory != null) {
				return theEnvironmentsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnvironmentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentsFactoryImpl() {
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
			case EnvironmentsPackage.SYSTEM_LOGICAL_INPUT: return createSystemLogicalInput();
			case EnvironmentsPackage.UPSI: return createUPSI();
			case EnvironmentsPackage.SYSTEM_LOGICAL_OUTPUT: return createSystemLogicalOutput();
			case EnvironmentsPackage.SYSTEM_PUNCH_DEVICE: return createSystemPunchDevice();
			case EnvironmentsPackage.CONSOLE: return createConsole();
			case EnvironmentsPackage.CHANNEL: return createChannel();
			case EnvironmentsPackage.ADVANCED_FUNCTION_PRINTING: return createAdvancedFunctionPrinting();
			case EnvironmentsPackage.SUPPRESS_SPACING: return createSuppressSpacing();
			case EnvironmentsPackage.POCKET: return createPocket();
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
			case EnvironmentsPackage.UPSI_SWITCHES:
				return createUPSISwitchesFromString(eDataType, initialValue);
			case EnvironmentsPackage.CHANNELS:
				return createChannelsFromString(eDataType, initialValue);
			case EnvironmentsPackage.SYSTEM_INPUTS:
				return createSystemInputsFromString(eDataType, initialValue);
			case EnvironmentsPackage.SYSTEM_OUTPUTS:
				return createSystemOutputsFromString(eDataType, initialValue);
			case EnvironmentsPackage.SYSTEM_PUNCH_DEVICES:
				return createSystemPunchDevicesFromString(eDataType, initialValue);
			case EnvironmentsPackage.SELECTS:
				return createSelectsFromString(eDataType, initialValue);
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
			case EnvironmentsPackage.UPSI_SWITCHES:
				return convertUPSISwitchesToString(eDataType, instanceValue);
			case EnvironmentsPackage.CHANNELS:
				return convertChannelsToString(eDataType, instanceValue);
			case EnvironmentsPackage.SYSTEM_INPUTS:
				return convertSystemInputsToString(eDataType, instanceValue);
			case EnvironmentsPackage.SYSTEM_OUTPUTS:
				return convertSystemOutputsToString(eDataType, instanceValue);
			case EnvironmentsPackage.SYSTEM_PUNCH_DEVICES:
				return convertSystemPunchDevicesToString(eDataType, instanceValue);
			case EnvironmentsPackage.SELECTS:
				return convertSelectsToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLogicalInput createSystemLogicalInput() {
		SystemLogicalInputImpl systemLogicalInput = new SystemLogicalInputImpl();
		return systemLogicalInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPSI createUPSI() {
		UPSIImpl upsi = new UPSIImpl();
		return upsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemLogicalOutput createSystemLogicalOutput() {
		SystemLogicalOutputImpl systemLogicalOutput = new SystemLogicalOutputImpl();
		return systemLogicalOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPunchDevice createSystemPunchDevice() {
		SystemPunchDeviceImpl systemPunchDevice = new SystemPunchDeviceImpl();
		return systemPunchDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Console createConsole() {
		ConsoleImpl console = new ConsoleImpl();
		return console;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvancedFunctionPrinting createAdvancedFunctionPrinting() {
		AdvancedFunctionPrintingImpl advancedFunctionPrinting = new AdvancedFunctionPrintingImpl();
		return advancedFunctionPrinting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SuppressSpacing createSuppressSpacing() {
		SuppressSpacingImpl suppressSpacing = new SuppressSpacingImpl();
		return suppressSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pocket createPocket() {
		PocketImpl pocket = new PocketImpl();
		return pocket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPSISwitches createUPSISwitchesFromString(EDataType eDataType, String initialValue) {
		UPSISwitches result = UPSISwitches.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUPSISwitchesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channels createChannelsFromString(EDataType eDataType, String initialValue) {
		Channels result = Channels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChannelsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemInputs createSystemInputsFromString(EDataType eDataType, String initialValue) {
		SystemInputs result = SystemInputs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemInputsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOutputs createSystemOutputsFromString(EDataType eDataType, String initialValue) {
		SystemOutputs result = SystemOutputs.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemOutputsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPunchDevices createSystemPunchDevicesFromString(EDataType eDataType, String initialValue) {
		SystemPunchDevices result = SystemPunchDevices.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemPunchDevicesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Selects createSelectsFromString(EDataType eDataType, String initialValue) {
		Selects result = Selects.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentsPackage getEnvironmentsPackage() {
		return (EnvironmentsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnvironmentsPackage getPackage() {
		return EnvironmentsPackage.eINSTANCE;
	}

} //EnvironmentsFactoryImpl
