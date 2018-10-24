/**
 */
package org.servicifi.gelato.language.cobol.references.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.references.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReferencesFactoryImpl extends EFactoryImpl implements ReferencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReferencesFactory init() {
		try {
			ReferencesFactory theReferencesFactory = (ReferencesFactory)EPackage.Registry.INSTANCE.getEFactory(ReferencesPackage.eNS_URI);
			if (theReferencesFactory != null) {
				return theReferencesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ReferencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesFactoryImpl() {
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
			case ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE: return createSpecialNamesConditionNameReference();
			case ReferencesPackage.FILE_NAME_REFERENCE: return createFileNameReference();
			case ReferencesPackage.INDEX_NAME_REFERENCE: return createIndexNameReference();
			case ReferencesPackage.MNEMONIC_NAME_REFERENCE: return createMnemonicNameReference();
			case ReferencesPackage.ALPHABET_NAME_REFERENCE: return createAlphabetNameReference();
			case ReferencesPackage.CONDITION_NAME_REFERENCE: return createConditionNameReference();
			case ReferencesPackage.DATA_NAME_REFERENCE: return createDataNameReference();
			case ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER: return createIdentifierReferenceQualifier();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialNamesConditionNameReference createSpecialNamesConditionNameReference() {
		SpecialNamesConditionNameReferenceImpl specialNamesConditionNameReference = new SpecialNamesConditionNameReferenceImpl();
		return specialNamesConditionNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameReference createFileNameReference() {
		FileNameReferenceImpl fileNameReference = new FileNameReferenceImpl();
		return fileNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexNameReference createIndexNameReference() {
		IndexNameReferenceImpl indexNameReference = new IndexNameReferenceImpl();
		return indexNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MnemonicNameReference createMnemonicNameReference() {
		MnemonicNameReferenceImpl mnemonicNameReference = new MnemonicNameReferenceImpl();
		return mnemonicNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlphabetNameReference createAlphabetNameReference() {
		AlphabetNameReferenceImpl alphabetNameReference = new AlphabetNameReferenceImpl();
		return alphabetNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionNameReference createConditionNameReference() {
		ConditionNameReferenceImpl conditionNameReference = new ConditionNameReferenceImpl();
		return conditionNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataNameReference createDataNameReference() {
		DataNameReferenceImpl dataNameReference = new DataNameReferenceImpl();
		return dataNameReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierReferenceQualifier createIdentifierReferenceQualifier() {
		IdentifierReferenceQualifierImpl identifierReferenceQualifier = new IdentifierReferenceQualifierImpl();
		return identifierReferenceQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesPackage getReferencesPackage() {
		return (ReferencesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ReferencesPackage getPackage() {
		return ReferencesPackage.eINSTANCE;
	}

} //ReferencesFactoryImpl
