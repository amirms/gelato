/**
 */
package org.servicifi.gelato.language.cobol.sentences.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.sentences.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SentencesFactoryImpl extends EFactoryImpl implements SentencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SentencesFactory init() {
		try {
			SentencesFactory theSentencesFactory = (SentencesFactory)EPackage.Registry.INSTANCE.getEFactory(SentencesPackage.eNS_URI);
			if (theSentencesFactory != null) {
				return theSentencesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SentencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentencesFactoryImpl() {
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
			case SentencesPackage.EMPTY_SENTENCE: return createEmptySentence();
			case SentencesPackage.USE_SENTENCE: return createUseSentence();
			case SentencesPackage.ALTERED_GO_TO: return createAlteredGoTo();
			case SentencesPackage.EXIT_PROCEDURE: return createExitProcedure();
			case SentencesPackage.ENTRY_SENTENCE: return createEntrySentence();
			case SentencesPackage.EXECUTE_SENTENCE: return createExecuteSentence();
			case SentencesPackage.SENTENCE: return createSentence();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmptySentence createEmptySentence() {
		EmptySentenceImpl emptySentence = new EmptySentenceImpl();
		return emptySentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseSentence createUseSentence() {
		UseSentenceImpl useSentence = new UseSentenceImpl();
		return useSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlteredGoTo createAlteredGoTo() {
		AlteredGoToImpl alteredGoTo = new AlteredGoToImpl();
		return alteredGoTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitProcedure createExitProcedure() {
		ExitProcedureImpl exitProcedure = new ExitProcedureImpl();
		return exitProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntrySentence createEntrySentence() {
		EntrySentenceImpl entrySentence = new EntrySentenceImpl();
		return entrySentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecuteSentence createExecuteSentence() {
		ExecuteSentenceImpl executeSentence = new ExecuteSentenceImpl();
		return executeSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sentence createSentence() {
		SentenceImpl sentence = new SentenceImpl();
		return sentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SentencesPackage getSentencesPackage() {
		return (SentencesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SentencesPackage getPackage() {
		return SentencesPackage.eINSTANCE;
	}

} //SentencesFactoryImpl
