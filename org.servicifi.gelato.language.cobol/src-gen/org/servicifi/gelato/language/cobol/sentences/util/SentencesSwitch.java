/**
 */
package org.servicifi.gelato.language.cobol.sentences.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.sentences.*;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

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
 * @see org.servicifi.gelato.language.cobol.sentences.SentencesPackage
 * @generated
 */
public class SentencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SentencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentencesSwitch() {
		if (modelPackage == null) {
			modelPackage = SentencesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case SentencesPackage.STATEMENT_CONTAINER: {
				StatementContainer statementContainer = (StatementContainer)theEObject;
				T result = caseStatementContainer(statementContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.EMPTY_SENTENCE: {
				EmptySentence emptySentence = (EmptySentence)theEObject;
				T result = caseEmptySentence(emptySentence);
				if (result == null) result = caseSentence(emptySentence);
				if (result == null) result = caseStatementContainer(emptySentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.USE_SENTENCE: {
				UseSentence useSentence = (UseSentence)theEObject;
				T result = caseUseSentence(useSentence);
				if (result == null) result = caseStatementContainer(useSentence);
				if (result == null) result = caseIncompleteElement(useSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.ALTERED_GO_TO: {
				AlteredGoTo alteredGoTo = (AlteredGoTo)theEObject;
				T result = caseAlteredGoTo(alteredGoTo);
				if (result == null) result = caseSentence(alteredGoTo);
				if (result == null) result = caseStatementContainer(alteredGoTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.EXIT_PROCEDURE: {
				ExitProcedure exitProcedure = (ExitProcedure)theEObject;
				T result = caseExitProcedure(exitProcedure);
				if (result == null) result = caseSentence(exitProcedure);
				if (result == null) result = caseStatementContainer(exitProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.ENTRY_SENTENCE: {
				EntrySentence entrySentence = (EntrySentence)theEObject;
				T result = caseEntrySentence(entrySentence);
				if (result == null) result = caseSentence(entrySentence);
				if (result == null) result = caseStatementContainer(entrySentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.EXECUTE_SENTENCE: {
				ExecuteSentence executeSentence = (ExecuteSentence)theEObject;
				T result = caseExecuteSentence(executeSentence);
				if (result == null) result = caseStatementContainer(executeSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SentencesPackage.SENTENCE: {
				Sentence sentence = (Sentence)theEObject;
				T result = caseSentence(sentence);
				if (result == null) result = caseStatementContainer(sentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementContainer(StatementContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmptySentence(EmptySentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseSentence(UseSentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Altered Go To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Altered Go To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlteredGoTo(AlteredGoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExitProcedure(ExitProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntrySentence(EntrySentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecuteSentence(ExecuteSentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentence(Sentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incomplete Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incomplete Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncompleteElement(IncompleteElement object) {
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

} //SentencesSwitch
