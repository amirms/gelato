/**
 */
package org.servicifi.gelato.language.cobol.handlers.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.handlers.*;

import org.servicifi.gelato.language.cobol.statements.NestedStatement;

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
 * @see org.servicifi.gelato.language.cobol.handlers.HandlersPackage
 * @generated
 */
public class HandlersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HandlersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlersSwitch() {
		if (modelPackage == null) {
			modelPackage = HandlersPackage.eINSTANCE;
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
			case HandlersPackage.ON_SIZE_ERROR: {
				OnSizeError onSizeError = (OnSizeError)theEObject;
				T result = caseOnSizeError(onSizeError);
				if (result == null) result = caseHandler(onSizeError);
				if (result == null) result = caseNestedStatement(onSizeError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.HANDLER: {
				Handler handler = (Handler)theEObject;
				T result = caseHandler(handler);
				if (result == null) result = caseNestedStatement(handler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_ON_SIZE_ERROR: {
				NotOnSizeError notOnSizeError = (NotOnSizeError)theEObject;
				T result = caseNotOnSizeError(notOnSizeError);
				if (result == null) result = caseNotErrorHandler(notOnSizeError);
				if (result == null) result = caseHandler(notOnSizeError);
				if (result == null) result = caseNestedStatement(notOnSizeError);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.ON_OVERFLOW: {
				OnOverflow onOverflow = (OnOverflow)theEObject;
				T result = caseOnOverflow(onOverflow);
				if (result == null) result = caseHandler(onOverflow);
				if (result == null) result = caseNestedStatement(onOverflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.ON_EXCEPTION: {
				OnException onException = (OnException)theEObject;
				T result = caseOnException(onException);
				if (result == null) result = caseHandler(onException);
				if (result == null) result = caseNestedStatement(onException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_ON_EXCEPTION: {
				NotOnException notOnException = (NotOnException)theEObject;
				T result = caseNotOnException(notOnException);
				if (result == null) result = caseNotErrorHandler(notOnException);
				if (result == null) result = caseHandler(notOnException);
				if (result == null) result = caseNestedStatement(notOnException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_ERROR_HANDLER: {
				NotErrorHandler notErrorHandler = (NotErrorHandler)theEObject;
				T result = caseNotErrorHandler(notErrorHandler);
				if (result == null) result = caseHandler(notErrorHandler);
				if (result == null) result = caseNestedStatement(notErrorHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_ON_OVERFLOW: {
				NotOnOverflow notOnOverflow = (NotOnOverflow)theEObject;
				T result = caseNotOnOverflow(notOnOverflow);
				if (result == null) result = caseNotErrorHandler(notOnOverflow);
				if (result == null) result = caseHandler(notOnOverflow);
				if (result == null) result = caseNestedStatement(notOnOverflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_AT_END: {
				NotAtEnd notAtEnd = (NotAtEnd)theEObject;
				T result = caseNotAtEnd(notAtEnd);
				if (result == null) result = caseNotErrorHandler(notAtEnd);
				if (result == null) result = caseHandler(notAtEnd);
				if (result == null) result = caseNestedStatement(notAtEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.AT_END: {
				AtEnd atEnd = (AtEnd)theEObject;
				T result = caseAtEnd(atEnd);
				if (result == null) result = caseHandler(atEnd);
				if (result == null) result = caseNestedStatement(atEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.AT_END_OF_PAGE: {
				AtEndOfPage atEndOfPage = (AtEndOfPage)theEObject;
				T result = caseAtEndOfPage(atEndOfPage);
				if (result == null) result = caseHandler(atEndOfPage);
				if (result == null) result = caseNestedStatement(atEndOfPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.INVALID_KEY: {
				InvalidKey invalidKey = (InvalidKey)theEObject;
				T result = caseInvalidKey(invalidKey);
				if (result == null) result = caseHandler(invalidKey);
				if (result == null) result = caseNestedStatement(invalidKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_AT_END_OF_PAGE: {
				NotAtEndOfPage notAtEndOfPage = (NotAtEndOfPage)theEObject;
				T result = caseNotAtEndOfPage(notAtEndOfPage);
				if (result == null) result = caseNotErrorHandler(notAtEndOfPage);
				if (result == null) result = caseHandler(notAtEndOfPage);
				if (result == null) result = caseNestedStatement(notAtEndOfPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HandlersPackage.NOT_INVALID_KEY: {
				NotInvalidKey notInvalidKey = (NotInvalidKey)theEObject;
				T result = caseNotInvalidKey(notInvalidKey);
				if (result == null) result = caseNotErrorHandler(notInvalidKey);
				if (result == null) result = caseHandler(notInvalidKey);
				if (result == null) result = caseNestedStatement(notInvalidKey);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Size Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Size Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnSizeError(OnSizeError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHandler(Handler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not On Size Error</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not On Size Error</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOnSizeError(NotOnSizeError object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Overflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Overflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnOverflow(OnOverflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnException(OnException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not On Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not On Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOnException(NotOnException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Error Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Error Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotErrorHandler(NotErrorHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not On Overflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not On Overflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotOnOverflow(NotOnOverflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not At End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not At End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotAtEnd(NotAtEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtEnd(AtEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At End Of Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At End Of Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtEndOfPage(AtEndOfPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invalid Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invalid Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvalidKey(InvalidKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not At End Of Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not At End Of Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotAtEndOfPage(NotAtEndOfPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Invalid Key</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Invalid Key</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotInvalidKey(NotInvalidKey object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nested Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nested Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNestedStatement(NestedStatement object) {
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

} //HandlersSwitch
