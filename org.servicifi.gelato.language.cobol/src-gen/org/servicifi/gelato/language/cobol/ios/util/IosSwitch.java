/**
 */
package org.servicifi.gelato.language.cobol.ios.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.ios.*;

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
 * @see org.servicifi.gelato.language.cobol.ios.IosPackage
 * @generated
 */
public class IosSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IosPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IosSwitch() {
		if (modelPackage == null) {
			modelPackage = IosPackage.eINSTANCE;
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
			case IosPackage.INPUT_PROCEDURE: {
				InputProcedure inputProcedure = (InputProcedure)theEObject;
				T result = caseInputProcedure(inputProcedure);
				if (result == null) result = caseInputDirective(inputProcedure);
				if (result == null) result = caseProcedureDirective(inputProcedure);
				if (result == null) result = caseIODirectives(inputProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.INPUT_DIRECTIVE: {
				InputDirective inputDirective = (InputDirective)theEObject;
				T result = caseInputDirective(inputDirective);
				if (result == null) result = caseIODirectives(inputDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.INPUT_FILE: {
				InputFile inputFile = (InputFile)theEObject;
				T result = caseInputFile(inputFile);
				if (result == null) result = caseInputDirective(inputFile);
				if (result == null) result = caseFileDirective(inputFile);
				if (result == null) result = caseIODirectives(inputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.OUTPUT_DIRECTIVE: {
				OutputDirective outputDirective = (OutputDirective)theEObject;
				T result = caseOutputDirective(outputDirective);
				if (result == null) result = caseIODirectives(outputDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.OUTPUT_PROCEDURE: {
				OutputProcedure outputProcedure = (OutputProcedure)theEObject;
				T result = caseOutputProcedure(outputProcedure);
				if (result == null) result = caseProcedureDirective(outputProcedure);
				if (result == null) result = caseOutputDirective(outputProcedure);
				if (result == null) result = caseIODirectives(outputProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.OUTPUT_FILE: {
				OutputFile outputFile = (OutputFile)theEObject;
				T result = caseOutputFile(outputFile);
				if (result == null) result = caseOutputDirective(outputFile);
				if (result == null) result = caseFileDirective(outputFile);
				if (result == null) result = caseIODirectives(outputFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.IO_DIRECTIVES: {
				IODirectives ioDirectives = (IODirectives)theEObject;
				T result = caseIODirectives(ioDirectives);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.FILE_DIRECTIVE: {
				FileDirective fileDirective = (FileDirective)theEObject;
				T result = caseFileDirective(fileDirective);
				if (result == null) result = caseIODirectives(fileDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IosPackage.PROCEDURE_DIRECTIVE: {
				ProcedureDirective procedureDirective = (ProcedureDirective)theEObject;
				T result = caseProcedureDirective(procedureDirective);
				if (result == null) result = caseIODirectives(procedureDirective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputProcedure(InputProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDirective(InputDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFile(InputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDirective(OutputDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputProcedure(OutputProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFile(OutputFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Directives</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Directives</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIODirectives(IODirectives object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDirective(FileDirective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Directive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Directive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDirective(ProcedureDirective object) {
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

} //IosSwitch
