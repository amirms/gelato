/**
 */
package org.servicifi.gelato.language.cobol.declaratives.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.declaratives.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarativesFactoryImpl extends EFactoryImpl implements DeclarativesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclarativesFactory init() {
		try {
			DeclarativesFactory theDeclarativesFactory = (DeclarativesFactory)EPackage.Registry.INSTANCE.getEFactory(DeclarativesPackage.eNS_URI);
			if (theDeclarativesFactory != null) {
				return theDeclarativesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarativesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarativesFactoryImpl() {
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
			case DeclarativesPackage.DECLARATIVES: return createDeclaratives();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaratives createDeclaratives() {
		DeclarativesImpl declaratives = new DeclarativesImpl();
		return declaratives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarativesPackage getDeclarativesPackage() {
		return (DeclarativesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclarativesPackage getPackage() {
		return DeclarativesPackage.eINSTANCE;
	}

} //DeclarativesFactoryImpl
