/**
 */
package org.servicifi.gelato.language.cobol.environments;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.servicifi.gelato.language.cobol.water.WaterPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsFactory
 * @model kind="package"
 * @generated
 */
public interface EnvironmentsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "environments";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/environments";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "environments";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnvironmentsPackage eINSTANCE = org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 10;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = WaterPackage.ACCEPT_STATEMENT_WATER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemDeviceImpl <em>System Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemDeviceImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemDevice()
	 * @generated
	 */
	int SYSTEM_DEVICE = 0;

	/**
	 * The number of structural features of the '<em>System Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DEVICE_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalInputImpl <em>System Logical Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalInputImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemLogicalInput()
	 * @generated
	 */
	int SYSTEM_LOGICAL_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LOGICAL_INPUT__VALUE = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Logical Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LOGICAL_INPUT_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.UPSIImpl <em>UPSI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.UPSIImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getUPSI()
	 * @generated
	 */
	int UPSI = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI__VALUE = ENVIRONMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UPSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPSI_FEATURE_COUNT = ENVIRONMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalOutputImpl <em>System Logical Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalOutputImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemLogicalOutput()
	 * @generated
	 */
	int SYSTEM_LOGICAL_OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LOGICAL_OUTPUT__VALUE = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Logical Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_LOGICAL_OUTPUT_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemPunchDeviceImpl <em>System Punch Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemPunchDeviceImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemPunchDevice()
	 * @generated
	 */
	int SYSTEM_PUNCH_DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PUNCH_DEVICE__VALUE = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>System Punch Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PUNCH_DEVICE_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.ConsoleImpl <em>Console</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.ConsoleImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getConsole()
	 * @generated
	 */
	int CONSOLE = 5;

	/**
	 * The number of structural features of the '<em>Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSOLE_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.ChannelImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__VALUE = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.AdvancedFunctionPrintingImpl <em>Advanced Function Printing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.AdvancedFunctionPrintingImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getAdvancedFunctionPrinting()
	 * @generated
	 */
	int ADVANCED_FUNCTION_PRINTING = 7;

	/**
	 * The number of structural features of the '<em>Advanced Function Printing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVANCED_FUNCTION_PRINTING_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SuppressSpacingImpl <em>Suppress Spacing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.SuppressSpacingImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSuppressSpacing()
	 * @generated
	 */
	int SUPPRESS_SPACING = 8;

	/**
	 * The number of structural features of the '<em>Suppress Spacing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPRESS_SPACING_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.impl.PocketImpl <em>Pocket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.impl.PocketImpl
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getPocket()
	 * @generated
	 */
	int POCKET = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POCKET__VALUE = SYSTEM_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pocket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POCKET_FEATURE_COUNT = SYSTEM_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.UPSISwitches <em>UPSI Switches</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.UPSISwitches
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getUPSISwitches()
	 * @generated
	 */
	int UPSI_SWITCHES = 11;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.Channels <em>Channels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.Channels
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getChannels()
	 * @generated
	 */
	int CHANNELS = 12;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.SystemInputs <em>System Inputs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.SystemInputs
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemInputs()
	 * @generated
	 */
	int SYSTEM_INPUTS = 13;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.SystemOutputs <em>System Outputs</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.SystemOutputs
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemOutputs()
	 * @generated
	 */
	int SYSTEM_OUTPUTS = 14;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevices <em>System Punch Devices</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevices
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemPunchDevices()
	 * @generated
	 */
	int SYSTEM_PUNCH_DEVICES = 15;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.environments.Selects <em>Selects</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.environments.Selects
	 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSelects()
	 * @generated
	 */
	int SELECTS = 16;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.SystemDevice <em>System Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Device</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemDevice
	 * @generated
	 */
	EClass getSystemDevice();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalInput <em>System Logical Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Logical Input</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemLogicalInput
	 * @generated
	 */
	EClass getSystemLogicalInput();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalInput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemLogicalInput#getValue()
	 * @see #getSystemLogicalInput()
	 * @generated
	 */
	EAttribute getSystemLogicalInput_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.UPSI <em>UPSI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UPSI</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.UPSI
	 * @generated
	 */
	EClass getUPSI();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.environments.UPSI#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.UPSI#getValue()
	 * @see #getUPSI()
	 * @generated
	 */
	EAttribute getUPSI_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput <em>System Logical Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Logical Output</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput
	 * @generated
	 */
	EClass getSystemLogicalOutput();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput#getValue()
	 * @see #getSystemLogicalOutput()
	 * @generated
	 */
	EAttribute getSystemLogicalOutput_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevice <em>System Punch Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Punch Device</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevice
	 * @generated
	 */
	EClass getSystemPunchDevice();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevice#getValue()
	 * @see #getSystemPunchDevice()
	 * @generated
	 */
	EAttribute getSystemPunchDevice_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.Console <em>Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Console</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Console
	 * @generated
	 */
	EClass getConsole();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.environments.Channel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Channel#getValue()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting <em>Advanced Function Printing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advanced Function Printing</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting
	 * @generated
	 */
	EClass getAdvancedFunctionPrinting();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.SuppressSpacing <em>Suppress Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Suppress Spacing</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SuppressSpacing
	 * @generated
	 */
	EClass getSuppressSpacing();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.Pocket <em>Pocket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pocket</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Pocket
	 * @generated
	 */
	EClass getPocket();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.environments.Pocket#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Pocket#getValue()
	 * @see #getPocket()
	 * @generated
	 */
	EAttribute getPocket_Value();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.environments.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.environments.UPSISwitches <em>UPSI Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>UPSI Switches</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.UPSISwitches
	 * @generated
	 */
	EEnum getUPSISwitches();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.environments.Channels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Channels</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Channels
	 * @generated
	 */
	EEnum getChannels();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.environments.SystemInputs <em>System Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Inputs</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemInputs
	 * @generated
	 */
	EEnum getSystemInputs();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.environments.SystemOutputs <em>System Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Outputs</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemOutputs
	 * @generated
	 */
	EEnum getSystemOutputs();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevices <em>System Punch Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>System Punch Devices</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevices
	 * @generated
	 */
	EEnum getSystemPunchDevices();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.environments.Selects <em>Selects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Selects</em>'.
	 * @see org.servicifi.gelato.language.cobol.environments.Selects
	 * @generated
	 */
	EEnum getSelects();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnvironmentsFactory getEnvironmentsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemDeviceImpl <em>System Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemDeviceImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemDevice()
		 * @generated
		 */
		EClass SYSTEM_DEVICE = eINSTANCE.getSystemDevice();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalInputImpl <em>System Logical Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalInputImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemLogicalInput()
		 * @generated
		 */
		EClass SYSTEM_LOGICAL_INPUT = eINSTANCE.getSystemLogicalInput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_LOGICAL_INPUT__VALUE = eINSTANCE.getSystemLogicalInput_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.UPSIImpl <em>UPSI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.UPSIImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getUPSI()
		 * @generated
		 */
		EClass UPSI = eINSTANCE.getUPSI();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPSI__VALUE = eINSTANCE.getUPSI_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalOutputImpl <em>System Logical Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemLogicalOutputImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemLogicalOutput()
		 * @generated
		 */
		EClass SYSTEM_LOGICAL_OUTPUT = eINSTANCE.getSystemLogicalOutput();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_LOGICAL_OUTPUT__VALUE = eINSTANCE.getSystemLogicalOutput_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SystemPunchDeviceImpl <em>System Punch Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.SystemPunchDeviceImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemPunchDevice()
		 * @generated
		 */
		EClass SYSTEM_PUNCH_DEVICE = eINSTANCE.getSystemPunchDevice();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_PUNCH_DEVICE__VALUE = eINSTANCE.getSystemPunchDevice_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.ConsoleImpl <em>Console</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.ConsoleImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getConsole()
		 * @generated
		 */
		EClass CONSOLE = eINSTANCE.getConsole();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.ChannelImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__VALUE = eINSTANCE.getChannel_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.AdvancedFunctionPrintingImpl <em>Advanced Function Printing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.AdvancedFunctionPrintingImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getAdvancedFunctionPrinting()
		 * @generated
		 */
		EClass ADVANCED_FUNCTION_PRINTING = eINSTANCE.getAdvancedFunctionPrinting();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.SuppressSpacingImpl <em>Suppress Spacing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.SuppressSpacingImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSuppressSpacing()
		 * @generated
		 */
		EClass SUPPRESS_SPACING = eINSTANCE.getSuppressSpacing();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.PocketImpl <em>Pocket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.PocketImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getPocket()
		 * @generated
		 */
		EClass POCKET = eINSTANCE.getPocket();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POCKET__VALUE = eINSTANCE.getPocket_Value();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentImpl
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.UPSISwitches <em>UPSI Switches</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.UPSISwitches
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getUPSISwitches()
		 * @generated
		 */
		EEnum UPSI_SWITCHES = eINSTANCE.getUPSISwitches();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.Channels <em>Channels</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.Channels
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getChannels()
		 * @generated
		 */
		EEnum CHANNELS = eINSTANCE.getChannels();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.SystemInputs <em>System Inputs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.SystemInputs
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemInputs()
		 * @generated
		 */
		EEnum SYSTEM_INPUTS = eINSTANCE.getSystemInputs();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.SystemOutputs <em>System Outputs</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.SystemOutputs
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemOutputs()
		 * @generated
		 */
		EEnum SYSTEM_OUTPUTS = eINSTANCE.getSystemOutputs();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.SystemPunchDevices <em>System Punch Devices</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.SystemPunchDevices
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSystemPunchDevices()
		 * @generated
		 */
		EEnum SYSTEM_PUNCH_DEVICES = eINSTANCE.getSystemPunchDevices();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.environments.Selects <em>Selects</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.environments.Selects
		 * @see org.servicifi.gelato.language.cobol.environments.impl.EnvironmentsPackageImpl#getSelects()
		 * @generated
		 */
		EEnum SELECTS = eINSTANCE.getSelects();

	}

} //EnvironmentsPackage
