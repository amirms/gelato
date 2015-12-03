/**
 */
package org.servicifi.gelato.language.cobol.environments.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.environments.*;

import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.Water;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage
 * @generated
 */
public class EnvironmentsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnvironmentsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentsSwitch() {
		if (modelPackage == null) {
			modelPackage = EnvironmentsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case EnvironmentsPackage.SYSTEM_DEVICE: {
				SystemDevice systemDevice = (SystemDevice)theEObject;
				T result = caseSystemDevice(systemDevice);
				if (result == null) result = caseEnvironment(systemDevice);
				if (result == null) result = caseAcceptStatementWater(systemDevice);
				if (result == null) result = caseWater(systemDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.SYSTEM_LOGICAL_INPUT: {
				SystemLogicalInput systemLogicalInput = (SystemLogicalInput)theEObject;
				T result = caseSystemLogicalInput(systemLogicalInput);
				if (result == null) result = caseSystemDevice(systemLogicalInput);
				if (result == null) result = caseEnvironment(systemLogicalInput);
				if (result == null) result = caseAcceptStatementWater(systemLogicalInput);
				if (result == null) result = caseWater(systemLogicalInput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.UPSI: {
				UPSI upsi = (UPSI)theEObject;
				T result = caseUPSI(upsi);
				if (result == null) result = caseEnvironment(upsi);
				if (result == null) result = caseAcceptStatementWater(upsi);
				if (result == null) result = caseWater(upsi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.SYSTEM_LOGICAL_OUTPUT: {
				SystemLogicalOutput systemLogicalOutput = (SystemLogicalOutput)theEObject;
				T result = caseSystemLogicalOutput(systemLogicalOutput);
				if (result == null) result = caseSystemDevice(systemLogicalOutput);
				if (result == null) result = caseEnvironment(systemLogicalOutput);
				if (result == null) result = caseAcceptStatementWater(systemLogicalOutput);
				if (result == null) result = caseWater(systemLogicalOutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.SYSTEM_PUNCH_DEVICE: {
				SystemPunchDevice systemPunchDevice = (SystemPunchDevice)theEObject;
				T result = caseSystemPunchDevice(systemPunchDevice);
				if (result == null) result = caseSystemDevice(systemPunchDevice);
				if (result == null) result = caseEnvironment(systemPunchDevice);
				if (result == null) result = caseAcceptStatementWater(systemPunchDevice);
				if (result == null) result = caseWater(systemPunchDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.CONSOLE: {
				Console console = (Console)theEObject;
				T result = caseConsole(console);
				if (result == null) result = caseSystemDevice(console);
				if (result == null) result = caseEnvironment(console);
				if (result == null) result = caseAcceptStatementWater(console);
				if (result == null) result = caseWater(console);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.CHANNEL: {
				Channel channel = (Channel)theEObject;
				T result = caseChannel(channel);
				if (result == null) result = caseSystemDevice(channel);
				if (result == null) result = caseEnvironment(channel);
				if (result == null) result = caseAcceptStatementWater(channel);
				if (result == null) result = caseWater(channel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.ADVANCED_FUNCTION_PRINTING: {
				AdvancedFunctionPrinting advancedFunctionPrinting = (AdvancedFunctionPrinting)theEObject;
				T result = caseAdvancedFunctionPrinting(advancedFunctionPrinting);
				if (result == null) result = caseSystemDevice(advancedFunctionPrinting);
				if (result == null) result = caseEnvironment(advancedFunctionPrinting);
				if (result == null) result = caseAcceptStatementWater(advancedFunctionPrinting);
				if (result == null) result = caseWater(advancedFunctionPrinting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.SUPPRESS_SPACING: {
				SuppressSpacing suppressSpacing = (SuppressSpacing)theEObject;
				T result = caseSuppressSpacing(suppressSpacing);
				if (result == null) result = caseSystemDevice(suppressSpacing);
				if (result == null) result = caseEnvironment(suppressSpacing);
				if (result == null) result = caseAcceptStatementWater(suppressSpacing);
				if (result == null) result = caseWater(suppressSpacing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.POCKET: {
				Pocket pocket = (Pocket)theEObject;
				T result = casePocket(pocket);
				if (result == null) result = caseSystemDevice(pocket);
				if (result == null) result = caseEnvironment(pocket);
				if (result == null) result = caseAcceptStatementWater(pocket);
				if (result == null) result = caseWater(pocket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EnvironmentsPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseAcceptStatementWater(environment);
				if (result == null) result = caseWater(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemDevice(SystemDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Logical Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Logical Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemLogicalInput(SystemLogicalInput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UPSI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UPSI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUPSI(UPSI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Logical Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Logical Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemLogicalOutput(SystemLogicalOutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Punch Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Punch Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemPunchDevice(SystemPunchDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Console</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Console</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsole(Console object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChannel(Channel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advanced Function Printing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advanced Function Printing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvancedFunctionPrinting(AdvancedFunctionPrinting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Suppress Spacing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Suppress Spacing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSuppressSpacing(SuppressSpacing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pocket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pocket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePocket(Pocket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWater(Water object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Statement Water</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Statement Water</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptStatementWater(AcceptStatementWater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //EnvironmentsSwitch
