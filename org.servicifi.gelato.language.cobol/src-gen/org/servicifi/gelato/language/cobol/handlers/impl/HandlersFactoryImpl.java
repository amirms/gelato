/**
 */
package org.servicifi.gelato.language.cobol.handlers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.handlers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HandlersFactoryImpl extends EFactoryImpl implements HandlersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HandlersFactory init() {
		try {
			HandlersFactory theHandlersFactory = (HandlersFactory)EPackage.Registry.INSTANCE.getEFactory(HandlersPackage.eNS_URI);
			if (theHandlersFactory != null) {
				return theHandlersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HandlersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlersFactoryImpl() {
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
			case HandlersPackage.ON_SIZE_ERROR: return createOnSizeError();
			case HandlersPackage.NOT_ON_SIZE_ERROR: return createNotOnSizeError();
			case HandlersPackage.ON_OVERFLOW: return createOnOverflow();
			case HandlersPackage.ON_EXCEPTION: return createOnException();
			case HandlersPackage.NOT_ON_EXCEPTION: return createNotOnException();
			case HandlersPackage.NOT_ON_OVERFLOW: return createNotOnOverflow();
			case HandlersPackage.NOT_AT_END: return createNotAtEnd();
			case HandlersPackage.AT_END: return createAtEnd();
			case HandlersPackage.AT_END_OF_PAGE: return createAtEndOfPage();
			case HandlersPackage.INVALID_KEY: return createInvalidKey();
			case HandlersPackage.NOT_AT_END_OF_PAGE: return createNotAtEndOfPage();
			case HandlersPackage.NOT_INVALID_KEY: return createNotInvalidKey();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnSizeError createOnSizeError() {
		OnSizeErrorImpl onSizeError = new OnSizeErrorImpl();
		return onSizeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOnSizeError createNotOnSizeError() {
		NotOnSizeErrorImpl notOnSizeError = new NotOnSizeErrorImpl();
		return notOnSizeError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnOverflow createOnOverflow() {
		OnOverflowImpl onOverflow = new OnOverflowImpl();
		return onOverflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnException createOnException() {
		OnExceptionImpl onException = new OnExceptionImpl();
		return onException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOnException createNotOnException() {
		NotOnExceptionImpl notOnException = new NotOnExceptionImpl();
		return notOnException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOnOverflow createNotOnOverflow() {
		NotOnOverflowImpl notOnOverflow = new NotOnOverflowImpl();
		return notOnOverflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotAtEnd createNotAtEnd() {
		NotAtEndImpl notAtEnd = new NotAtEndImpl();
		return notAtEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtEnd createAtEnd() {
		AtEndImpl atEnd = new AtEndImpl();
		return atEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtEndOfPage createAtEndOfPage() {
		AtEndOfPageImpl atEndOfPage = new AtEndOfPageImpl();
		return atEndOfPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvalidKey createInvalidKey() {
		InvalidKeyImpl invalidKey = new InvalidKeyImpl();
		return invalidKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotAtEndOfPage createNotAtEndOfPage() {
		NotAtEndOfPageImpl notAtEndOfPage = new NotAtEndOfPageImpl();
		return notAtEndOfPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInvalidKey createNotInvalidKey() {
		NotInvalidKeyImpl notInvalidKey = new NotInvalidKeyImpl();
		return notInvalidKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HandlersPackage getHandlersPackage() {
		return (HandlersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HandlersPackage getPackage() {
		return HandlersPackage.eINSTANCE;
	}

} //HandlersFactoryImpl
