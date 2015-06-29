/**
 */
package org.servicifi.gelato.language.cobol.identifiers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.identifiers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdentifiersFactoryImpl extends EFactoryImpl implements IdentifiersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IdentifiersFactory init() {
		try {
			IdentifiersFactory theIdentifiersFactory = (IdentifiersFactory)EPackage.Registry.INSTANCE.getEFactory(IdentifiersPackage.eNS_URI);
			if (theIdentifiersFactory != null) {
				return theIdentifiersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IdentifiersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersFactoryImpl() {
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
			case IdentifiersPackage.IDENTIFIER_REFERENCE: return createIdentifierReference();
			case IdentifiersPackage.ALL: return createAll();
			case IdentifiersPackage.REFERENCE_MODIFIER: return createReferenceModifier();
			case IdentifiersPackage.LINAGE_COUNTER: return createLinageCounter();
			case IdentifiersPackage.QUALIFIER: return createQualifier();
			case IdentifiersPackage.RELATIVE_SUBSCRIPT: return createRelativeSubscript();
			case IdentifiersPackage.DIRECT_SUBSCRIPT: return createDirectSubscript();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReference createIdentifierReference() {
		IdentifierReferenceImpl identifierReference = new IdentifierReferenceImpl();
		return identifierReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public All createAll() {
		AllImpl all = new AllImpl();
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceModifier createReferenceModifier() {
		ReferenceModifierImpl referenceModifier = new ReferenceModifierImpl();
		return referenceModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinageCounter createLinageCounter() {
		LinageCounterImpl linageCounter = new LinageCounterImpl();
		return linageCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Qualifier createQualifier() {
		QualifierImpl qualifier = new QualifierImpl();
		return qualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelativeSubscript createRelativeSubscript() {
		RelativeSubscriptImpl relativeSubscript = new RelativeSubscriptImpl();
		return relativeSubscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectSubscript createDirectSubscript() {
		DirectSubscriptImpl directSubscript = new DirectSubscriptImpl();
		return directSubscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiersPackage getIdentifiersPackage() {
		return (IdentifiersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IdentifiersPackage getPackage() {
		return IdentifiersPackage.eINSTANCE;
	}

} //IdentifiersFactoryImpl
