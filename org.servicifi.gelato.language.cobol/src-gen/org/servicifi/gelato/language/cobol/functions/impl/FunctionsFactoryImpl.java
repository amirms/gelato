/**
 */
package org.servicifi.gelato.language.cobol.functions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.functions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionsFactoryImpl extends EFactoryImpl implements FunctionsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FunctionsFactory init() {
		try {
			FunctionsFactory theFunctionsFactory = (FunctionsFactory)EPackage.Registry.INSTANCE.getEFactory(FunctionsPackage.eNS_URI);
			if (theFunctionsFactory != null) {
				return theFunctionsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FunctionsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsFactoryImpl() {
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
			case FunctionsPackage.FUNCTION_CALL: return createFunctionCall();
			case FunctionsPackage.BY_REFERENCE_ARGUMENT: return createByReferenceArgument();
			case FunctionsPackage.BY_VALUE_ARGUMENT: return createByValueArgument();
			case FunctionsPackage.BY_CONTENT_ARGUMENT: return createByContentArgument();
			case FunctionsPackage.OMITTED_ARGUMENT: return createOmittedArgument();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByReferenceArgument createByReferenceArgument() {
		ByReferenceArgumentImpl byReferenceArgument = new ByReferenceArgumentImpl();
		return byReferenceArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByValueArgument createByValueArgument() {
		ByValueArgumentImpl byValueArgument = new ByValueArgumentImpl();
		return byValueArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ByContentArgument createByContentArgument() {
		ByContentArgumentImpl byContentArgument = new ByContentArgumentImpl();
		return byContentArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OmittedArgument createOmittedArgument() {
		OmittedArgumentImpl omittedArgument = new OmittedArgumentImpl();
		return omittedArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionsPackage getFunctionsPackage() {
		return (FunctionsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FunctionsPackage getPackage() {
		return FunctionsPackage.eINSTANCE;
	}

} //FunctionsFactoryImpl
