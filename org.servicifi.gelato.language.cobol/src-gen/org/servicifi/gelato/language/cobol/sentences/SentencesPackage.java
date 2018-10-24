/**
 */
package org.servicifi.gelato.language.cobol.sentences;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.sentences.SentencesFactory
 * @model kind="package"
 * @generated
 */
public interface SentencesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sentences";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/sentences";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sentences";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SentencesPackage eINSTANCE = org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.StatementContainerImpl <em>Statement Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.StatementContainerImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getStatementContainer()
	 * @generated
	 */
	int STATEMENT_CONTAINER = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CONTAINER__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Statement Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentenceImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 7;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__STATEMENTS = STATEMENT_CONTAINER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__NEXT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.EmptySentenceImpl <em>Empty Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.EmptySentenceImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getEmptySentence()
	 * @generated
	 */
	int EMPTY_SENTENCE = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_SENTENCE__STATEMENTS = SENTENCE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_SENTENCE__NEXT = SENTENCE__NEXT;

	/**
	 * The number of structural features of the '<em>Empty Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.UseSentenceImpl <em>Use Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.UseSentenceImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getUseSentence()
	 * @generated
	 */
	int USE_SENTENCE = 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_SENTENCE__STATEMENTS = STATEMENT_CONTAINER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_SENTENCE__WATER = STATEMENT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_SENTENCE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.AlteredGoToImpl <em>Altered Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.AlteredGoToImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getAlteredGoTo()
	 * @generated
	 */
	int ALTERED_GO_TO = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERED_GO_TO__STATEMENTS = SENTENCE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERED_GO_TO__NEXT = SENTENCE__NEXT;

	/**
	 * The number of structural features of the '<em>Altered Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERED_GO_TO_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.ExitProcedureImpl <em>Exit Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.ExitProcedureImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getExitProcedure()
	 * @generated
	 */
	int EXIT_PROCEDURE = 4;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_PROCEDURE__STATEMENTS = SENTENCE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_PROCEDURE__NEXT = SENTENCE__NEXT;

	/**
	 * The number of structural features of the '<em>Exit Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_PROCEDURE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.EntrySentenceImpl <em>Entry Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.EntrySentenceImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getEntrySentence()
	 * @generated
	 */
	int ENTRY_SENTENCE = 5;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SENTENCE__STATEMENTS = SENTENCE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SENTENCE__NEXT = SENTENCE__NEXT;

	/**
	 * The number of structural features of the '<em>Entry Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_SENTENCE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.ExecuteSentenceImpl <em>Execute Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.ExecuteSentenceImpl
	 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getExecuteSentence()
	 * @generated
	 */
	int EXECUTE_SENTENCE = 6;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_SENTENCE__STATEMENTS = STATEMENT_CONTAINER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Execute Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_SENTENCE_FEATURE_COUNT = STATEMENT_CONTAINER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.StatementContainer <em>Statement Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement Container</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.StatementContainer
	 * @generated
	 */
	EClass getStatementContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.sentences.StatementContainer#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.StatementContainer#getStatements()
	 * @see #getStatementContainer()
	 * @generated
	 */
	EReference getStatementContainer_Statements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.EmptySentence <em>Empty Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Sentence</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.EmptySentence
	 * @generated
	 */
	EClass getEmptySentence();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.UseSentence <em>Use Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Sentence</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.UseSentence
	 * @generated
	 */
	EClass getUseSentence();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.AlteredGoTo <em>Altered Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Altered Go To</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.AlteredGoTo
	 * @generated
	 */
	EClass getAlteredGoTo();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.ExitProcedure <em>Exit Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit Procedure</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.ExitProcedure
	 * @generated
	 */
	EClass getExitProcedure();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.EntrySentence <em>Entry Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Sentence</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.EntrySentence
	 * @generated
	 */
	EClass getEntrySentence();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.ExecuteSentence <em>Execute Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute Sentence</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.ExecuteSentence
	 * @generated
	 */
	EClass getExecuteSentence();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.sentences.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.cobol.sentences.Sentence#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.servicifi.gelato.language.cobol.sentences.Sentence#getNext()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Next();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SentencesFactory getSentencesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.StatementContainerImpl <em>Statement Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.StatementContainerImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getStatementContainer()
		 * @generated
		 */
		EClass STATEMENT_CONTAINER = eINSTANCE.getStatementContainer();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT_CONTAINER__STATEMENTS = eINSTANCE.getStatementContainer_Statements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.EmptySentenceImpl <em>Empty Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.EmptySentenceImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getEmptySentence()
		 * @generated
		 */
		EClass EMPTY_SENTENCE = eINSTANCE.getEmptySentence();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.UseSentenceImpl <em>Use Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.UseSentenceImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getUseSentence()
		 * @generated
		 */
		EClass USE_SENTENCE = eINSTANCE.getUseSentence();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.AlteredGoToImpl <em>Altered Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.AlteredGoToImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getAlteredGoTo()
		 * @generated
		 */
		EClass ALTERED_GO_TO = eINSTANCE.getAlteredGoTo();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.ExitProcedureImpl <em>Exit Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.ExitProcedureImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getExitProcedure()
		 * @generated
		 */
		EClass EXIT_PROCEDURE = eINSTANCE.getExitProcedure();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.EntrySentenceImpl <em>Entry Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.EntrySentenceImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getEntrySentence()
		 * @generated
		 */
		EClass ENTRY_SENTENCE = eINSTANCE.getEntrySentence();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.ExecuteSentenceImpl <em>Execute Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.ExecuteSentenceImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getExecuteSentence()
		 * @generated
		 */
		EClass EXECUTE_SENTENCE = eINSTANCE.getExecuteSentence();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.sentences.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentenceImpl
		 * @see org.servicifi.gelato.language.cobol.sentences.impl.SentencesPackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__NEXT = eINSTANCE.getSentence_Next();

	}

} //SentencesPackage
