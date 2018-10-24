/**
 */
package org.servicifi.gelato.language.cobol.handlers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.statements.StatementsPackage;

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
 * @see org.servicifi.gelato.language.cobol.handlers.HandlersFactory
 * @model kind="package"
 * @generated
 */
public interface HandlersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "handlers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/handlers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "handlers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HandlersPackage eINSTANCE = org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.HandlerImpl <em>Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlerImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getHandler()
	 * @generated
	 */
	int HANDLER = 1;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER__STATEMENTS = StatementsPackage.NESTED_STATEMENT__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HANDLER_FEATURE_COUNT = StatementsPackage.NESTED_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.OnSizeErrorImpl <em>On Size Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.OnSizeErrorImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getOnSizeError()
	 * @generated
	 */
	int ON_SIZE_ERROR = 0;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE_ERROR__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>On Size Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_SIZE_ERROR_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotErrorHandlerImpl <em>Not Error Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotErrorHandlerImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotErrorHandler()
	 * @generated
	 */
	int NOT_ERROR_HANDLER = 6;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ERROR_HANDLER__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ERROR_HANDLER__HANDLER_STATEMENT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Error Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ERROR_HANDLER_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotOnSizeErrorImpl <em>Not On Size Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotOnSizeErrorImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotOnSizeError()
	 * @generated
	 */
	int NOT_ON_SIZE_ERROR = 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_SIZE_ERROR__STATEMENTS = NOT_ERROR_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_SIZE_ERROR__HANDLER_STATEMENT = NOT_ERROR_HANDLER__HANDLER_STATEMENT;

	/**
	 * The number of structural features of the '<em>Not On Size Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_SIZE_ERROR_FEATURE_COUNT = NOT_ERROR_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.OnOverflowImpl <em>On Overflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.OnOverflowImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getOnOverflow()
	 * @generated
	 */
	int ON_OVERFLOW = 3;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_OVERFLOW__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>On Overflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_OVERFLOW_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.OnExceptionImpl <em>On Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.OnExceptionImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getOnException()
	 * @generated
	 */
	int ON_EXCEPTION = 4;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXCEPTION__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>On Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_EXCEPTION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotOnExceptionImpl <em>Not On Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotOnExceptionImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotOnException()
	 * @generated
	 */
	int NOT_ON_EXCEPTION = 5;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_EXCEPTION__STATEMENTS = NOT_ERROR_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_EXCEPTION__HANDLER_STATEMENT = NOT_ERROR_HANDLER__HANDLER_STATEMENT;

	/**
	 * The number of structural features of the '<em>Not On Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_EXCEPTION_FEATURE_COUNT = NOT_ERROR_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotOnOverflowImpl <em>Not On Overflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotOnOverflowImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotOnOverflow()
	 * @generated
	 */
	int NOT_ON_OVERFLOW = 7;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_OVERFLOW__STATEMENTS = NOT_ERROR_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_OVERFLOW__HANDLER_STATEMENT = NOT_ERROR_HANDLER__HANDLER_STATEMENT;

	/**
	 * The number of structural features of the '<em>Not On Overflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ON_OVERFLOW_FEATURE_COUNT = NOT_ERROR_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndImpl <em>Not At End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotAtEnd()
	 * @generated
	 */
	int NOT_AT_END = 8;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AT_END__STATEMENTS = NOT_ERROR_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AT_END__HANDLER_STATEMENT = NOT_ERROR_HANDLER__HANDLER_STATEMENT;

	/**
	 * The number of structural features of the '<em>Not At End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AT_END_FEATURE_COUNT = NOT_ERROR_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.AtEndImpl <em>At End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.AtEndImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getAtEnd()
	 * @generated
	 */
	int AT_END = 9;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_END__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>At End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_END_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.AtEndOfPageImpl <em>At End Of Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.AtEndOfPageImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getAtEndOfPage()
	 * @generated
	 */
	int AT_END_OF_PAGE = 10;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_END_OF_PAGE__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Eop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_END_OF_PAGE__EOP = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>At End Of Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_END_OF_PAGE_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.InvalidKeyImpl <em>Invalid Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.InvalidKeyImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getInvalidKey()
	 * @generated
	 */
	int INVALID_KEY = 11;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_KEY__STATEMENTS = HANDLER__STATEMENTS;

	/**
	 * The number of structural features of the '<em>Invalid Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_KEY_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndOfPageImpl <em>Not At End Of Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndOfPageImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotAtEndOfPage()
	 * @generated
	 */
	int NOT_AT_END_OF_PAGE = 12;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AT_END_OF_PAGE__STATEMENTS = NOT_ERROR_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AT_END_OF_PAGE__HANDLER_STATEMENT = NOT_ERROR_HANDLER__HANDLER_STATEMENT;

	/**
	 * The number of structural features of the '<em>Not At End Of Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_AT_END_OF_PAGE_FEATURE_COUNT = NOT_ERROR_HANDLER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotInvalidKeyImpl <em>Not Invalid Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotInvalidKeyImpl
	 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotInvalidKey()
	 * @generated
	 */
	int NOT_INVALID_KEY = 13;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INVALID_KEY__STATEMENTS = NOT_ERROR_HANDLER__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Handler Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INVALID_KEY__HANDLER_STATEMENT = NOT_ERROR_HANDLER__HANDLER_STATEMENT;

	/**
	 * The number of structural features of the '<em>Not Invalid Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_INVALID_KEY_FEATURE_COUNT = NOT_ERROR_HANDLER_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.OnSizeError <em>On Size Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Size Error</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.OnSizeError
	 * @generated
	 */
	EClass getOnSizeError();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.Handler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Handler</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.Handler
	 * @generated
	 */
	EClass getHandler();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotOnSizeError <em>Not On Size Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not On Size Error</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotOnSizeError
	 * @generated
	 */
	EClass getNotOnSizeError();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.OnOverflow <em>On Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Overflow</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.OnOverflow
	 * @generated
	 */
	EClass getOnOverflow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.OnException <em>On Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Exception</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.OnException
	 * @generated
	 */
	EClass getOnException();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotOnException <em>Not On Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not On Exception</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotOnException
	 * @generated
	 */
	EClass getNotOnException();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotErrorHandler <em>Not Error Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Error Handler</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotErrorHandler
	 * @generated
	 */
	EClass getNotErrorHandler();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.handlers.NotErrorHandler#getHandlerStatement <em>Handler Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Handler Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotErrorHandler#getHandlerStatement()
	 * @see #getNotErrorHandler()
	 * @generated
	 */
	EReference getNotErrorHandler_HandlerStatement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotOnOverflow <em>Not On Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not On Overflow</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotOnOverflow
	 * @generated
	 */
	EClass getNotOnOverflow();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotAtEnd <em>Not At End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not At End</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotAtEnd
	 * @generated
	 */
	EClass getNotAtEnd();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.AtEnd <em>At End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At End</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.AtEnd
	 * @generated
	 */
	EClass getAtEnd();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.AtEndOfPage <em>At End Of Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At End Of Page</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.AtEndOfPage
	 * @generated
	 */
	EClass getAtEndOfPage();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.handlers.AtEndOfPage#getEop <em>Eop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eop</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.AtEndOfPage#getEop()
	 * @see #getAtEndOfPage()
	 * @generated
	 */
	EAttribute getAtEndOfPage_Eop();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.InvalidKey <em>Invalid Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Key</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.InvalidKey
	 * @generated
	 */
	EClass getInvalidKey();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage <em>Not At End Of Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not At End Of Page</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage
	 * @generated
	 */
	EClass getNotAtEndOfPage();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.handlers.NotInvalidKey <em>Not Invalid Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Invalid Key</em>'.
	 * @see org.servicifi.gelato.language.cobol.handlers.NotInvalidKey
	 * @generated
	 */
	EClass getNotInvalidKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HandlersFactory getHandlersFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.OnSizeErrorImpl <em>On Size Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.OnSizeErrorImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getOnSizeError()
		 * @generated
		 */
		EClass ON_SIZE_ERROR = eINSTANCE.getOnSizeError();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.HandlerImpl <em>Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlerImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getHandler()
		 * @generated
		 */
		EClass HANDLER = eINSTANCE.getHandler();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotOnSizeErrorImpl <em>Not On Size Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotOnSizeErrorImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotOnSizeError()
		 * @generated
		 */
		EClass NOT_ON_SIZE_ERROR = eINSTANCE.getNotOnSizeError();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.OnOverflowImpl <em>On Overflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.OnOverflowImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getOnOverflow()
		 * @generated
		 */
		EClass ON_OVERFLOW = eINSTANCE.getOnOverflow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.OnExceptionImpl <em>On Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.OnExceptionImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getOnException()
		 * @generated
		 */
		EClass ON_EXCEPTION = eINSTANCE.getOnException();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotOnExceptionImpl <em>Not On Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotOnExceptionImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotOnException()
		 * @generated
		 */
		EClass NOT_ON_EXCEPTION = eINSTANCE.getNotOnException();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotErrorHandlerImpl <em>Not Error Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotErrorHandlerImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotErrorHandler()
		 * @generated
		 */
		EClass NOT_ERROR_HANDLER = eINSTANCE.getNotErrorHandler();

		/**
		 * The meta object literal for the '<em><b>Handler Statement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_ERROR_HANDLER__HANDLER_STATEMENT = eINSTANCE.getNotErrorHandler_HandlerStatement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotOnOverflowImpl <em>Not On Overflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotOnOverflowImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotOnOverflow()
		 * @generated
		 */
		EClass NOT_ON_OVERFLOW = eINSTANCE.getNotOnOverflow();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndImpl <em>Not At End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotAtEnd()
		 * @generated
		 */
		EClass NOT_AT_END = eINSTANCE.getNotAtEnd();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.AtEndImpl <em>At End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.AtEndImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getAtEnd()
		 * @generated
		 */
		EClass AT_END = eINSTANCE.getAtEnd();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.AtEndOfPageImpl <em>At End Of Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.AtEndOfPageImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getAtEndOfPage()
		 * @generated
		 */
		EClass AT_END_OF_PAGE = eINSTANCE.getAtEndOfPage();

		/**
		 * The meta object literal for the '<em><b>Eop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AT_END_OF_PAGE__EOP = eINSTANCE.getAtEndOfPage_Eop();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.InvalidKeyImpl <em>Invalid Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.InvalidKeyImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getInvalidKey()
		 * @generated
		 */
		EClass INVALID_KEY = eINSTANCE.getInvalidKey();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndOfPageImpl <em>Not At End Of Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotAtEndOfPageImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotAtEndOfPage()
		 * @generated
		 */
		EClass NOT_AT_END_OF_PAGE = eINSTANCE.getNotAtEndOfPage();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.handlers.impl.NotInvalidKeyImpl <em>Not Invalid Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.NotInvalidKeyImpl
		 * @see org.servicifi.gelato.language.cobol.handlers.impl.HandlersPackageImpl#getNotInvalidKey()
		 * @generated
		 */
		EClass NOT_INVALID_KEY = eINSTANCE.getNotInvalidKey();

	}

} //HandlersPackage
