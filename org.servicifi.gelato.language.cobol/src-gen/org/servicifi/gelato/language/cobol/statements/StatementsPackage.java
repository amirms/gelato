/**
 */
package org.servicifi.gelato.language.cobol.statements;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.servicifi.gelato.language.cobol.parameters.ParametersPackage;

import org.servicifi.gelato.language.cobol.water.WaterPackage;

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
 * @see org.servicifi.gelato.language.cobol.statements.StatementsFactory
 * @model kind="package"
 * @generated
 */
public interface StatementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.servicifi.org/gelato/language/cobol/statements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsPackage eINSTANCE = org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__NEXT = 0;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__END_VERB = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl <em>Arithmetic Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getArithmeticStatement()
	 * @generated
	 */
	int ARITHMETIC_STATEMENT = 1;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corresponding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT__CORRESPONDING = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT__OPERANDS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Givings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT__GIVINGS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Arithmetic Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.AddImpl <em>Add</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.AddImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAdd()
	 * @generated
	 */
	int ADD = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__NEXT = ARITHMETIC_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__END_VERB = ARITHMETIC_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__HANDLERS = ARITHMETIC_STATEMENT__HANDLERS;

	/**
	 * The feature id for the '<em><b>Corresponding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__CORRESPONDING = ARITHMETIC_STATEMENT__CORRESPONDING;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__OPERANDS = ARITHMETIC_STATEMENT__OPERANDS;

	/**
	 * The feature id for the '<em><b>Givings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__GIVINGS = ARITHMETIC_STATEMENT__GIVINGS;

	/**
	 * The feature id for the '<em><b>Tos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD__TOS = ARITHMETIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_FEATURE_COUNT = ARITHMETIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SubtractImpl <em>Subtract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SubtractImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSubtract()
	 * @generated
	 */
	int SUBTRACT = 3;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__NEXT = ARITHMETIC_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__END_VERB = ARITHMETIC_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__HANDLERS = ARITHMETIC_STATEMENT__HANDLERS;

	/**
	 * The feature id for the '<em><b>Corresponding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__CORRESPONDING = ARITHMETIC_STATEMENT__CORRESPONDING;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__OPERANDS = ARITHMETIC_STATEMENT__OPERANDS;

	/**
	 * The feature id for the '<em><b>Givings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__GIVINGS = ARITHMETIC_STATEMENT__GIVINGS;

	/**
	 * The feature id for the '<em><b>Froms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT__FROMS = ARITHMETIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subtract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTRACT_FEATURE_COUNT = ARITHMETIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.MultiplyImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 4;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__NEXT = ARITHMETIC_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__END_VERB = ARITHMETIC_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__HANDLERS = ARITHMETIC_STATEMENT__HANDLERS;

	/**
	 * The feature id for the '<em><b>Corresponding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__CORRESPONDING = ARITHMETIC_STATEMENT__CORRESPONDING;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__OPERANDS = ARITHMETIC_STATEMENT__OPERANDS;

	/**
	 * The feature id for the '<em><b>Givings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__GIVINGS = ARITHMETIC_STATEMENT__GIVINGS;

	/**
	 * The feature id for the '<em><b>Bys</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__BYS = ARITHMETIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = ARITHMETIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.DivideImpl <em>Divide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.DivideImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getDivide()
	 * @generated
	 */
	int DIVIDE = 5;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__NEXT = ARITHMETIC_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__END_VERB = ARITHMETIC_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__HANDLERS = ARITHMETIC_STATEMENT__HANDLERS;

	/**
	 * The feature id for the '<em><b>Corresponding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__CORRESPONDING = ARITHMETIC_STATEMENT__CORRESPONDING;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__OPERANDS = ARITHMETIC_STATEMENT__OPERANDS;

	/**
	 * The feature id for the '<em><b>Givings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__GIVINGS = ARITHMETIC_STATEMENT__GIVINGS;

	/**
	 * The feature id for the '<em><b>Intos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__INTOS = ARITHMETIC_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Remainders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE__REMAINDERS = ARITHMETIC_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Divide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVIDE_FEATURE_COUNT = ARITHMETIC_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformImpl <em>Perform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerform()
	 * @generated
	 */
	int PERFORM = 6;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM__END_VERB = STATEMENT__END_VERB;

	/**
	 * The number of structural features of the '<em>Perform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementImpl <em>Perform Nested Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformNestedStatement()
	 * @generated
	 */
	int PERFORM_NESTED_STATEMENT = 7;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT__NEXT = PERFORM__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT__END_VERB = PERFORM__END_VERB;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT__STATEMENTS = PERFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform Nested Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_FEATURE_COUNT = PERFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureImpl <em>Perform Procedure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformProcedure()
	 * @generated
	 */
	int PERFORM_PROCEDURE = 8;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE__NEXT = PERFORM__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE__END_VERB = PERFORM__END_VERB;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE__LABEL = PERFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform Procedure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_FEATURE_COUNT = PERFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.JumpImpl <em>Jump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.JumpImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getJump()
	 * @generated
	 */
	int JUMP = 9;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP__LABELS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Jump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.NextSentenceImpl <em>Next Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.NextSentenceImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getNextSentence()
	 * @generated
	 */
	int NEXT_SENTENCE = 10;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_SENTENCE__NEXT = JUMP__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_SENTENCE__END_VERB = JUMP__END_VERB;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_SENTENCE__LABELS = JUMP__LABELS;

	/**
	 * The number of structural features of the '<em>Next Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_SENTENCE_FEATURE_COUNT = JUMP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.GoToImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 11;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__NEXT = JUMP__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__END_VERB = JUMP__END_VERB;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__LABELS = JUMP__LABELS;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__DEPENDS_ON = JUMP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = JUMP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.GoBackImpl <em>Go Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.GoBackImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getGoBack()
	 * @generated
	 */
	int GO_BACK = 12;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK__NEXT = JUMP__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK__END_VERB = JUMP__END_VERB;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK__LABELS = JUMP__LABELS;

	/**
	 * The number of structural features of the '<em>Go Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_BACK_FEATURE_COUNT = JUMP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.NestedStatementImpl <em>Nested Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.NestedStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getNestedStatement()
	 * @generated
	 */
	int NESTED_STATEMENT = 13;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STATEMENT__STATEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Nested Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.MoveImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 14;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__RECEIVERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Corresponding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__CORRESPONDING = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__SENDER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ExitImpl <em>Exit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ExitImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getExit()
	 * @generated
	 */
	int EXIT = 15;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Exit Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT__EXIT_LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXIT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ConditionImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATEMENTS = NESTED_STATEMENT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = NESTED_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NEXT = NESTED_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__END_VERB = NESTED_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__ELSE_STATEMENTS = NESTED_STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = NESTED_STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ConditionalImpl <em>Conditional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ConditionalImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getConditional()
	 * @generated
	 */
	int CONDITIONAL = 17;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Conditional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StopImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getStop()
	 * @generated
	 */
	int STOP = 18;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__LABEL = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.DisplayImpl <em>Display</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.DisplayImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getDisplay()
	 * @generated
	 */
	int DISPLAY = 19;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__OPERANDS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY__OUTPUT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ComputeImpl <em>Compute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ComputeImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCompute()
	 * @generated
	 */
	int COMPUTE = 20;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE__EXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Compute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPUTE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.AcceptImpl <em>Accept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.AcceptImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAccept()
	 * @generated
	 */
	int ACCEPT = 21;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT__WATER = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT__RECEIVER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Accept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ExecuteImpl <em>Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ExecuteImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getExecute()
	 * @generated
	 */
	int EXECUTE = 22;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE__WATER = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ErrorHandledImpl <em>Error Handled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ErrorHandledImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getErrorHandled()
	 * @generated
	 */
	int ERROR_HANDLED = 23;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLED__HANDLERS = 0;

	/**
	 * The number of structural features of the '<em>Error Handled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_HANDLED_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ReturnImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 24;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__FILE_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__OUTPUT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetStatementImpl <em>Set Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SetStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSetStatement()
	 * @generated
	 */
	int SET_STATEMENT = 25;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STATEMENT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STATEMENT__SENDER = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetSwitchesImpl <em>Set Switches</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SetSwitchesImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSetSwitches()
	 * @generated
	 */
	int SET_SWITCHES = 26;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SWITCHES__NEXT = SET_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SWITCHES__END_VERB = SET_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SWITCHES__SENDER = SET_STATEMENT__SENDER;

	/**
	 * The feature id for the '<em><b>Switches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SWITCHES__SWITCHES = SET_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Switches</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_SWITCHES_FEATURE_COUNT = SET_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetIndexNameImpl <em>Set Index Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SetIndexNameImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSetIndexName()
	 * @generated
	 */
	int SET_INDEX_NAME = 27;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INDEX_NAME__NEXT = SET_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INDEX_NAME__END_VERB = SET_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INDEX_NAME__SENDER = SET_STATEMENT__SENDER;

	/**
	 * The feature id for the '<em><b>Adjust</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INDEX_NAME__ADJUST = SET_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INDEX_NAME__RECEIVERS = SET_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Index Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_INDEX_NAME_FEATURE_COUNT = SET_STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StringImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getString()
	 * @generated
	 */
	int STRING = 28;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__POINTER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__RECEIVER = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Senders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING__SENDERS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.CloseImpl <em>Close</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.CloseImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getClose()
	 * @generated
	 */
	int CLOSE = 29;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__WATER = WaterPackage.INCOMPLETE_ELEMENT__WATER;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__NEXT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__END_VERB = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Io File Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE__IO_FILE_DESCRIPTORS = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Close</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_FEATURE_COUNT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.CancelImpl <em>Cancel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.CancelImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCancel()
	 * @generated
	 */
	int CANCEL = 30;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Subprograms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL__SUBPROGRAMS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cancel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CANCEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.CallImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 31;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ARGUMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__RETURNING = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__HANDLERS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subprogram</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__SUBPROGRAM = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.InitializeImpl <em>Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.InitializeImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getInitialize()
	 * @generated
	 */
	int INITIALIZE = 32;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Subprograms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__SUBPROGRAMS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replacements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__REPLACEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.OpenImpl <em>Open</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.OpenImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getOpen()
	 * @generated
	 */
	int OPEN = 33;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__WATER = WaterPackage.INCOMPLETE_ELEMENT__WATER;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__NEXT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__END_VERB = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Io File Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN__IO_FILE_DESCRIPTORS = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Open</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FEATURE_COUNT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SearchStatementImpl <em>Search Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SearchStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSearchStatement()
	 * @generated
	 */
	int SEARCH_STATEMENT = 34;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATEMENT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATEMENT__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATEMENT__CASES = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATEMENT__TABLE = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Search Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SerialSearchImpl <em>Serial Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SerialSearchImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSerialSearch()
	 * @generated
	 */
	int SERIAL_SEARCH = 35;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH__NEXT = SEARCH_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH__END_VERB = SEARCH_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH__HANDLERS = SEARCH_STATEMENT__HANDLERS;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH__CASES = SEARCH_STATEMENT__CASES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH__TABLE = SEARCH_STATEMENT__TABLE;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH__VARIABLE = SEARCH_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Serial Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERIAL_SEARCH_FEATURE_COUNT = SEARCH_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.BinarySearchImpl <em>Binary Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.BinarySearchImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getBinarySearch()
	 * @generated
	 */
	int BINARY_SEARCH = 36;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SEARCH__NEXT = SEARCH_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SEARCH__END_VERB = SEARCH_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SEARCH__HANDLERS = SEARCH_STATEMENT__HANDLERS;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SEARCH__CASES = SEARCH_STATEMENT__CASES;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SEARCH__TABLE = SEARCH_STATEMENT__TABLE;

	/**
	 * The number of structural features of the '<em>Binary Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SEARCH_FEATURE_COUNT = SEARCH_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl <em>Unstring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getUnstring()
	 * @generated
	 */
	int UNSTRING = 37;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__HANDLERS = ERROR_HANDLED__HANDLERS;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__NEXT = ERROR_HANDLED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__END_VERB = ERROR_HANDLED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__POINTER = ERROR_HANDLED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__TALLY = ERROR_HANDLED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__SENDER = ERROR_HANDLED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__RECEIVERS = ERROR_HANDLED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__DELIMITER = ERROR_HANDLED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING__COUNTER = ERROR_HANDLED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Unstring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNSTRING_FEATURE_COUNT = ERROR_HANDLED_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.EvaluateImpl <em>Evaluate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.EvaluateImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEvaluate()
	 * @generated
	 */
	int EVALUATE = 38;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__CASES = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE__SUBJECT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Evaluate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.EvaluateCaseImpl <em>Evaluate Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.EvaluateCaseImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEvaluateCase()
	 * @generated
	 */
	int EVALUATE_CASE = 41;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_CASE__STATEMENTS = NESTED_STATEMENT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_CASE__OBJECTS = NESTED_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evaluate Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVALUATE_CASE_FEATURE_COUNT = NESTED_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.NormalEvaluateCaseImpl <em>Normal Evaluate Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.NormalEvaluateCaseImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getNormalEvaluateCase()
	 * @generated
	 */
	int NORMAL_EVALUATE_CASE = 39;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_EVALUATE_CASE__STATEMENTS = EVALUATE_CASE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_EVALUATE_CASE__OBJECTS = EVALUATE_CASE__OBJECTS;

	/**
	 * The number of structural features of the '<em>Normal Evaluate Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_EVALUATE_CASE_FEATURE_COUNT = EVALUATE_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.OtherEvaluateCaseImpl <em>Other Evaluate Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.OtherEvaluateCaseImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getOtherEvaluateCase()
	 * @generated
	 */
	int OTHER_EVALUATE_CASE = 40;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_EVALUATE_CASE__STATEMENTS = EVALUATE_CASE__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_EVALUATE_CASE__OBJECTS = EVALUATE_CASE__OBJECTS;

	/**
	 * The number of structural features of the '<em>Other Evaluate Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_EVALUATE_CASE_FEATURE_COUNT = EVALUATE_CASE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReplaceImpl <em>Replace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ReplaceImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getReplace()
	 * @generated
	 */
	int REPLACE = 42;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Replace Switch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__REPLACE_SWITCH = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.EntryImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 43;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PARAMETERS = ParametersPackage.PARAMETRIZABLE__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Returning</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__RETURNING = ParametersPackage.PARAMETRIZABLE__RETURNING;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__NEXT = ParametersPackage.PARAMETRIZABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__END_VERB = ParametersPackage.PARAMETRIZABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = ParametersPackage.PARAMETRIZABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.InspectImpl <em>Inspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.InspectImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getInspect()
	 * @generated
	 */
	int INSPECT = 44;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Tallying Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__TALLYING_INS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replacements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__REPLACEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conversions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__CONVERSIONS = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT__STRING = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Inspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSPECT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SetImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSet()
	 * @generated
	 */
	int SET = 45;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__NEXT = SET_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__END_VERB = SET_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__SENDER = SET_STATEMENT__SENDER;

	/**
	 * The feature id for the '<em><b>Receivers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__RECEIVERS = SET_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = SET_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ReadImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getRead()
	 * @generated
	 */
	int READ = 46;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Receiver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__RECEIVER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__KEY_NAME = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__FILE_NAME = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl <em>Write</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.WriteImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getWrite()
	 * @generated
	 */
	int WRITE = 47;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__HANDLERS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Record Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__RECORD_NAME = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Num Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__NUM_LINES = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__INTEGER = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mnemonic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__MNEMONIC_NAME = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE__SENDER = STATEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Write</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.RewriteImpl <em>Rewrite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.RewriteImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getRewrite()
	 * @generated
	 */
	int REWRITE = 48;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__NEXT = WRITE__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__END_VERB = WRITE__END_VERB;

	/**
	 * The feature id for the '<em><b>Handlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__HANDLERS = WRITE__HANDLERS;

	/**
	 * The feature id for the '<em><b>Record Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__RECORD_NAME = WRITE__RECORD_NAME;

	/**
	 * The feature id for the '<em><b>Num Lines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__NUM_LINES = WRITE__NUM_LINES;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__INTEGER = WRITE__INTEGER;

	/**
	 * The feature id for the '<em><b>Mnemonic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__MNEMONIC_NAME = WRITE__MNEMONIC_NAME;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE__SENDER = WRITE__SENDER;

	/**
	 * The number of structural features of the '<em>Rewrite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REWRITE_FEATURE_COUNT = WRITE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SwitchStatusImpl <em>Switch Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SwitchStatusImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSwitchStatus()
	 * @generated
	 */
	int SWITCH_STATUS = 49;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATUS__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Mnemonic Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATUS__MNEMONIC_NAMES = 1;

	/**
	 * The number of structural features of the '<em>Switch Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_STATUS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureFixedTimesImpl <em>Perform Procedure Fixed Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureFixedTimesImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformProcedureFixedTimes()
	 * @generated
	 */
	int PERFORM_PROCEDURE_FIXED_TIMES = 50;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_FIXED_TIMES__NEXT = PERFORM_PROCEDURE__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_FIXED_TIMES__END_VERB = PERFORM_PROCEDURE__END_VERB;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_FIXED_TIMES__LABEL = PERFORM_PROCEDURE__LABEL;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS = PERFORM_PROCEDURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform Procedure Fixed Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_FIXED_TIMES_FEATURE_COUNT = PERFORM_PROCEDURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl <em>Perform Until Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformUntilCondition()
	 * @generated
	 */
	int PERFORM_UNTIL_CONDITION = 51;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__NEXT = PERFORM__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__END_VERB = PERFORM__END_VERB;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__CONDITION = PERFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__VARIABLE = PERFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__INIT = PERFORM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__INCREMENT = PERFORM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__POSITION = PERFORM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION__CONDITIONS = PERFORM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Perform Until Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_UNTIL_CONDITION_FEATURE_COUNT = PERFORM_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformFixedTimesImpl <em>Perform Fixed Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformFixedTimesImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformFixedTimes()
	 * @generated
	 */
	int PERFORM_FIXED_TIMES = 52;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FIXED_TIMES__NEXT = PERFORM__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FIXED_TIMES__END_VERB = PERFORM__END_VERB;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FIXED_TIMES__ITERATIONS = PERFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform Fixed Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_FIXED_TIMES_FEATURE_COUNT = PERFORM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureUntilConditionImpl <em>Perform Procedure Until Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureUntilConditionImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformProcedureUntilCondition()
	 * @generated
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION = 53;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__NEXT = PERFORM_UNTIL_CONDITION__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__END_VERB = PERFORM_UNTIL_CONDITION__END_VERB;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__CONDITION = PERFORM_UNTIL_CONDITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__VARIABLE = PERFORM_UNTIL_CONDITION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__INIT = PERFORM_UNTIL_CONDITION__INIT;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__INCREMENT = PERFORM_UNTIL_CONDITION__INCREMENT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__POSITION = PERFORM_UNTIL_CONDITION__POSITION;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__CONDITIONS = PERFORM_UNTIL_CONDITION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL = PERFORM_UNTIL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Afters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS = PERFORM_UNTIL_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Perform Procedure Until Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_PROCEDURE_UNTIL_CONDITION_FEATURE_COUNT = PERFORM_UNTIL_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementFixedTimesImpl <em>Perform Nested Statement Fixed Times</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementFixedTimesImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformNestedStatementFixedTimes()
	 * @generated
	 */
	int PERFORM_NESTED_STATEMENT_FIXED_TIMES = 54;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_FIXED_TIMES__NEXT = PERFORM_NESTED_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_FIXED_TIMES__END_VERB = PERFORM_NESTED_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_FIXED_TIMES__STATEMENTS = PERFORM_NESTED_STATEMENT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Iterations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_FIXED_TIMES__ITERATIONS = PERFORM_NESTED_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform Nested Statement Fixed Times</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_FIXED_TIMES_FEATURE_COUNT = PERFORM_NESTED_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementUntilConditionImpl <em>Perform Nested Statement Until Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementUntilConditionImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformNestedStatementUntilCondition()
	 * @generated
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION = 55;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__NEXT = PERFORM_UNTIL_CONDITION__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__END_VERB = PERFORM_UNTIL_CONDITION__END_VERB;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__CONDITION = PERFORM_UNTIL_CONDITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__VARIABLE = PERFORM_UNTIL_CONDITION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__INIT = PERFORM_UNTIL_CONDITION__INIT;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__INCREMENT = PERFORM_UNTIL_CONDITION__INCREMENT;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__POSITION = PERFORM_UNTIL_CONDITION__POSITION;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__CONDITIONS = PERFORM_UNTIL_CONDITION__CONDITIONS;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__STATEMENTS = PERFORM_UNTIL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Perform Nested Statement Until Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORM_NESTED_STATEMENT_UNTIL_CONDITION_FEATURE_COUNT = PERFORM_UNTIL_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ContinueImpl <em>Continue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ContinueImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getContinue()
	 * @generated
	 */
	int CONTINUE = 56;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE__NEXT = JUMP__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE__END_VERB = JUMP__END_VERB;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE__LABELS = JUMP__LABELS;

	/**
	 * The number of structural features of the '<em>Continue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_FEATURE_COUNT = JUMP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl <em>File IO Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getFileIOStatement()
	 * @generated
	 */
	int FILE_IO_STATEMENT = 57;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT__FILE_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT__INPUT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT__OUTPUT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Key Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT__KEY_DESCRIPTORS = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File IO Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_IO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.SortImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSort()
	 * @generated
	 */
	int SORT = 58;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__NEXT = FILE_IO_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__END_VERB = FILE_IO_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__FILE_NAME = FILE_IO_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__INPUT = FILE_IO_STATEMENT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__OUTPUT = FILE_IO_STATEMENT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Key Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__KEY_DESCRIPTORS = FILE_IO_STATEMENT__KEY_DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__WATER = FILE_IO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = FILE_IO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.MergeImpl <em>Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.MergeImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getMerge()
	 * @generated
	 */
	int MERGE = 59;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__NEXT = FILE_IO_STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__END_VERB = FILE_IO_STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__FILE_NAME = FILE_IO_STATEMENT__FILE_NAME;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__INPUT = FILE_IO_STATEMENT__INPUT;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__OUTPUT = FILE_IO_STATEMENT__OUTPUT;

	/**
	 * The feature id for the '<em><b>Key Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__KEY_DESCRIPTORS = FILE_IO_STATEMENT__KEY_DESCRIPTORS;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE__WATER = FILE_IO_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGE_FEATURE_COUNT = FILE_IO_STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.ReleaseImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 60;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Record Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__RECORD_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sender</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__SENDER = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.KeyDescriptorImpl <em>Key Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.KeyDescriptorImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getKeyDescriptor()
	 * @generated
	 */
	int KEY_DESCRIPTOR = 61;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DESCRIPTOR__ORDER = 0;

	/**
	 * The feature id for the '<em><b>Key Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DESCRIPTOR__KEY_NAMES = 1;

	/**
	 * The number of structural features of the '<em>Key Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.IOStatementImpl <em>IO Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.IOStatementImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOStatement()
	 * @generated
	 */
	int IO_STATEMENT = 62;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_STATEMENT__NEXT = STATEMENT__NEXT;

	/**
	 * The feature id for the '<em><b>End Verb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_STATEMENT__END_VERB = STATEMENT__END_VERB;

	/**
	 * The feature id for the '<em><b>Io File Descriptors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_STATEMENT__IO_FILE_DESCRIPTORS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileDescriptorImpl <em>IO File Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.IOFileDescriptorImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOFileDescriptor()
	 * @generated
	 */
	int IO_FILE_DESCRIPTOR = 63;

	/**
	 * The feature id for the '<em><b>Io Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FILE_DESCRIPTOR__IO_FILES = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FILE_DESCRIPTOR__TYPE = 1;

	/**
	 * The number of structural features of the '<em>IO File Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FILE_DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileImpl <em>IO File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.IOFileImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOFile()
	 * @generated
	 */
	int IO_FILE = 64;

	/**
	 * The feature id for the '<em><b>Water</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FILE__WATER = WaterPackage.INCOMPLETE_ELEMENT__WATER;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FILE__FILE_NAME = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FILE_FEATURE_COUNT = WaterPackage.INCOMPLETE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.TallyingInImpl <em>Tallying In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.TallyingInImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getTallyingIn()
	 * @generated
	 */
	int TALLYING_IN = 65;

	/**
	 * The feature id for the '<em><b>Occurrences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_IN__OCCURRENCES = 0;

	/**
	 * The feature id for the '<em><b>Counter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_IN__COUNTER = 1;

	/**
	 * The number of structural features of the '<em>Tallying In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALLYING_IN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.VaryingUntilConditionImpl <em>Varying Until Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.VaryingUntilConditionImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getVaryingUntilCondition()
	 * @generated
	 */
	int VARYING_UNTIL_CONDITION = 66;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARYING_UNTIL_CONDITION__CONDITION = CONDITIONAL__CONDITION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARYING_UNTIL_CONDITION__VARIABLE = CONDITIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARYING_UNTIL_CONDITION__INIT = CONDITIONAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARYING_UNTIL_CONDITION__INCREMENT = CONDITIONAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Varying Until Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARYING_UNTIL_CONDITION_FEATURE_COUNT = CONDITIONAL_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.impl.AfterUntilConditionImpl <em>After Until Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.impl.AfterUntilConditionImpl
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAfterUntilCondition()
	 * @generated
	 */
	int AFTER_UNTIL_CONDITION = 67;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL_CONDITION__CONDITION = VARYING_UNTIL_CONDITION__CONDITION;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL_CONDITION__VARIABLE = VARYING_UNTIL_CONDITION__VARIABLE;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL_CONDITION__INIT = VARYING_UNTIL_CONDITION__INIT;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL_CONDITION__INCREMENT = VARYING_UNTIL_CONDITION__INCREMENT;

	/**
	 * The number of structural features of the '<em>After Until Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL_CONDITION_FEATURE_COUNT = VARYING_UNTIL_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.ExitLabels <em>Exit Labels</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.ExitLabels
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getExitLabels()
	 * @generated
	 */
	int EXIT_LABELS = 68;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.Adjustings <em>Adjustings</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.Adjustings
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAdjustings()
	 * @generated
	 */
	int ADJUSTINGS = 69;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.Status <em>Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.Status
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 70;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.EOP <em>EOP</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.EOP
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEOP()
	 * @generated
	 */
	int EOP = 71;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.IOTypes <em>IO Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.IOTypes
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOTypes()
	 * @generated
	 */
	int IO_TYPES = 72;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.Orders <em>Orders</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.Orders
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getOrders()
	 * @generated
	 */
	int ORDERS = 73;

	/**
	 * The meta object id for the '{@link org.servicifi.gelato.language.cobol.statements.Corresponding <em>Corresponding</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
	 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCorresponding()
	 * @generated
	 */
	int CORRESPONDING = 74;


	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the reference '{@link org.servicifi.gelato.language.cobol.statements.Statement#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Statement#getNext()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Next();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.Statement#isEndVerb <em>End Verb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Verb</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Statement#isEndVerb()
	 * @see #getStatement()
	 * @generated
	 */
	EAttribute getStatement_EndVerb();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement <em>Arithmetic Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ArithmeticStatement
	 * @generated
	 */
	EClass getArithmeticStatement();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getCorresponding <em>Corresponding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getCorresponding()
	 * @see #getArithmeticStatement()
	 * @generated
	 */
	EAttribute getArithmeticStatement_Corresponding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getOperands()
	 * @see #getArithmeticStatement()
	 * @generated
	 */
	EReference getArithmeticStatement_Operands();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getGivings <em>Givings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Givings</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ArithmeticStatement#getGivings()
	 * @see #getArithmeticStatement()
	 * @generated
	 */
	EReference getArithmeticStatement_Givings();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Add <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Add
	 * @generated
	 */
	EClass getAdd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Add#getTos <em>Tos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tos</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Add#getTos()
	 * @see #getAdd()
	 * @generated
	 */
	EReference getAdd_Tos();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Subtract <em>Subtract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtract</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Subtract
	 * @generated
	 */
	EClass getSubtract();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Subtract#getFroms <em>Froms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Froms</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Subtract#getFroms()
	 * @see #getSubtract()
	 * @generated
	 */
	EReference getSubtract_Froms();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Multiply#getBys <em>Bys</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bys</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Multiply#getBys()
	 * @see #getMultiply()
	 * @generated
	 */
	EReference getMultiply_Bys();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Divide <em>Divide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divide</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Divide
	 * @generated
	 */
	EClass getDivide();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Divide#getIntos <em>Intos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intos</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Divide#getIntos()
	 * @see #getDivide()
	 * @generated
	 */
	EReference getDivide_Intos();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Divide#getRemainders <em>Remainders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remainders</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Divide#getRemainders()
	 * @see #getDivide()
	 * @generated
	 */
	EReference getDivide_Remainders();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Perform <em>Perform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Perform
	 * @generated
	 */
	EClass getPerform();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformNestedStatement <em>Perform Nested Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Nested Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformNestedStatement
	 * @generated
	 */
	EClass getPerformNestedStatement();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformProcedure <em>Perform Procedure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Procedure</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformProcedure
	 * @generated
	 */
	EClass getPerformProcedure();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.PerformProcedure#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformProcedure#getLabel()
	 * @see #getPerformProcedure()
	 * @generated
	 */
	EReference getPerformProcedure_Label();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Jump <em>Jump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Jump
	 * @generated
	 */
	EClass getJump();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Jump#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Jump#getLabels()
	 * @see #getJump()
	 * @generated
	 */
	EReference getJump_Labels();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.NextSentence <em>Next Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next Sentence</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.NextSentence
	 * @generated
	 */
	EClass getNextSentence();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.GoTo#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends On</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.GoTo#getDependsOn()
	 * @see #getGoTo()
	 * @generated
	 */
	EReference getGoTo_DependsOn();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.GoBack <em>Go Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Back</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.GoBack
	 * @generated
	 */
	EClass getGoBack();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.NestedStatement <em>Nested Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.NestedStatement
	 * @generated
	 */
	EClass getNestedStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.NestedStatement#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.NestedStatement#getStatements()
	 * @see #getNestedStatement()
	 * @generated
	 */
	EReference getNestedStatement_Statements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Move#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Move#getReceivers()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Receivers();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.Move#getCorresponding <em>Corresponding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Corresponding</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Move#getCorresponding()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Corresponding();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Move#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sender</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Move#getSender()
	 * @see #getMove()
	 * @generated
	 */
	EReference getMove_Sender();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Exit <em>Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exit</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Exit
	 * @generated
	 */
	EClass getExit();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.Exit#getExitLabel <em>Exit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exit Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Exit#getExitLabel()
	 * @see #getExit()
	 * @generated
	 */
	EAttribute getExit_ExitLabel();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Condition#getElseStatements <em>Else Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Statements</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Condition#getElseStatements()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_ElseStatements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Conditional <em>Conditional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Conditional
	 * @generated
	 */
	EClass getConditional();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Conditional#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Conditional#getCondition()
	 * @see #getConditional()
	 * @generated
	 */
	EReference getConditional_Condition();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Stop#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Stop#getLabel()
	 * @see #getStop()
	 * @generated
	 */
	EReference getStop_Label();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Display <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Display
	 * @generated
	 */
	EClass getDisplay();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Display#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Display#getOperands()
	 * @see #getDisplay()
	 * @generated
	 */
	EReference getDisplay_Operands();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Display#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Display#getOutput()
	 * @see #getDisplay()
	 * @generated
	 */
	EReference getDisplay_Output();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Compute <em>Compute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compute</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Compute
	 * @generated
	 */
	EClass getCompute();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Compute#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Compute#getExpression()
	 * @see #getCompute()
	 * @generated
	 */
	EReference getCompute_Expression();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Accept <em>Accept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Accept
	 * @generated
	 */
	EClass getAccept();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Accept#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Accept#getReceiver()
	 * @see #getAccept()
	 * @generated
	 */
	EReference getAccept_Receiver();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Execute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execute</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Execute
	 * @generated
	 */
	EClass getExecute();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.Execute#getWater <em>Water</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Water</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Execute#getWater()
	 * @see #getExecute()
	 * @generated
	 */
	EAttribute getExecute_Water();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.ErrorHandled <em>Error Handled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Handled</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ErrorHandled
	 * @generated
	 */
	EClass getErrorHandled();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.ErrorHandled#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handlers</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ErrorHandled#getHandlers()
	 * @see #getErrorHandled()
	 * @generated
	 */
	EReference getErrorHandled_Handlers();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Return#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Return#getFileName()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_FileName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Return#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Return#getOutput()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Output();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.SetStatement <em>Set Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetStatement
	 * @generated
	 */
	EClass getSetStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.SetStatement#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetStatement#getSender()
	 * @see #getSetStatement()
	 * @generated
	 */
	EReference getSetStatement_Sender();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.SetSwitches <em>Set Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Switches</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetSwitches
	 * @generated
	 */
	EClass getSetSwitches();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.SetSwitches#getSwitches <em>Switches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Switches</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetSwitches#getSwitches()
	 * @see #getSetSwitches()
	 * @generated
	 */
	EReference getSetSwitches_Switches();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.SetIndexName <em>Set Index Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Index Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetIndexName
	 * @generated
	 */
	EClass getSetIndexName();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.SetIndexName#getAdjust <em>Adjust</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adjust</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetIndexName#getAdjust()
	 * @see #getSetIndexName()
	 * @generated
	 */
	EAttribute getSetIndexName_Adjust();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.SetIndexName#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SetIndexName#getReceivers()
	 * @see #getSetIndexName()
	 * @generated
	 */
	EReference getSetIndexName_Receivers();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.String#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointer</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.String#getPointer()
	 * @see #getString()
	 * @generated
	 */
	EReference getString_Pointer();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.String#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.String#getReceiver()
	 * @see #getString()
	 * @generated
	 */
	EReference getString_Receiver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.String#getSenders <em>Senders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Senders</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.String#getSenders()
	 * @see #getString()
	 * @generated
	 */
	EReference getString_Senders();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Close <em>Close</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Close
	 * @generated
	 */
	EClass getClose();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Cancel <em>Cancel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cancel</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Cancel
	 * @generated
	 */
	EClass getCancel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Cancel#getSubprograms <em>Subprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subprograms</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Cancel#getSubprograms()
	 * @see #getCancel()
	 * @generated
	 */
	EReference getCancel_Subprograms();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Call#getSubprogram <em>Subprogram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subprogram</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Call#getSubprogram()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Subprogram();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Initialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialize</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Initialize
	 * @generated
	 */
	EClass getInitialize();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Initialize#getSubprograms <em>Subprograms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subprograms</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Initialize#getSubprograms()
	 * @see #getInitialize()
	 * @generated
	 */
	EReference getInitialize_Subprograms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Initialize#getReplacements <em>Replacements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replacements</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Initialize#getReplacements()
	 * @see #getInitialize()
	 * @generated
	 */
	EReference getInitialize_Replacements();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Open <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Open
	 * @generated
	 */
	EClass getOpen();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.SearchStatement <em>Search Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SearchStatement
	 * @generated
	 */
	EClass getSearchStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.SearchStatement#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SearchStatement#getCases()
	 * @see #getSearchStatement()
	 * @generated
	 */
	EReference getSearchStatement_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.SearchStatement#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SearchStatement#getTable()
	 * @see #getSearchStatement()
	 * @generated
	 */
	EReference getSearchStatement_Table();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.SerialSearch <em>Serial Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Serial Search</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SerialSearch
	 * @generated
	 */
	EClass getSerialSearch();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.SerialSearch#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SerialSearch#getVariable()
	 * @see #getSerialSearch()
	 * @generated
	 */
	EReference getSerialSearch_Variable();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.BinarySearch <em>Binary Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Search</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.BinarySearch
	 * @generated
	 */
	EClass getBinarySearch();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Unstring <em>Unstring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unstring</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring
	 * @generated
	 */
	EClass getUnstring();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointer</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring#getPointer()
	 * @see #getUnstring()
	 * @generated
	 */
	EReference getUnstring_Pointer();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getTally <em>Tally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tally</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring#getTally()
	 * @see #getUnstring()
	 * @generated
	 */
	EReference getUnstring_Tally();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring#getSender()
	 * @see #getUnstring()
	 * @generated
	 */
	EReference getUnstring_Sender();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring#getReceivers()
	 * @see #getUnstring()
	 * @generated
	 */
	EReference getUnstring_Receivers();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delimiter</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring#getDelimiter()
	 * @see #getUnstring()
	 * @generated
	 */
	EReference getUnstring_Delimiter();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Unstring#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Unstring#getCounter()
	 * @see #getUnstring()
	 * @generated
	 */
	EReference getUnstring_Counter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Evaluate <em>Evaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Evaluate
	 * @generated
	 */
	EClass getEvaluate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Evaluate#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Evaluate#getCases()
	 * @see #getEvaluate()
	 * @generated
	 */
	EReference getEvaluate_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Evaluate#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subject</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Evaluate#getSubject()
	 * @see #getEvaluate()
	 * @generated
	 */
	EReference getEvaluate_Subject();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase <em>Normal Evaluate Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Evaluate Case</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase
	 * @generated
	 */
	EClass getNormalEvaluateCase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase <em>Other Evaluate Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Evaluate Case</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase
	 * @generated
	 */
	EClass getOtherEvaluateCase();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.EvaluateCase <em>Evaluate Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evaluate Case</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.EvaluateCase
	 * @generated
	 */
	EClass getEvaluateCase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.EvaluateCase#getObjects <em>Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Objects</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.EvaluateCase#getObjects()
	 * @see #getEvaluateCase()
	 * @generated
	 */
	EReference getEvaluateCase_Objects();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Replace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Replace
	 * @generated
	 */
	EClass getReplace();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.Replace#isReplaceSwitch <em>Replace Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Replace Switch</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Replace#isReplaceSwitch()
	 * @see #getReplace()
	 * @generated
	 */
	EAttribute getReplace_ReplaceSwitch();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Inspect <em>Inspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inspect</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Inspect
	 * @generated
	 */
	EClass getInspect();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Inspect#getTallyingIns <em>Tallying Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tallying Ins</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Inspect#getTallyingIns()
	 * @see #getInspect()
	 * @generated
	 */
	EReference getInspect_TallyingIns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Inspect#getReplacements <em>Replacements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replacements</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Inspect#getReplacements()
	 * @see #getInspect()
	 * @generated
	 */
	EReference getInspect_Replacements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Inspect#getConversions <em>Conversions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conversions</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Inspect#getConversions()
	 * @see #getInspect()
	 * @generated
	 */
	EReference getInspect_Conversions();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Inspect#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>String</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Inspect#getString()
	 * @see #getInspect()
	 * @generated
	 */
	EReference getInspect_String();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.Set#getReceivers <em>Receivers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Receivers</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Set#getReceivers()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_Receivers();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Read#getReceiver <em>Receiver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Receiver</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Read#getReceiver()
	 * @see #getRead()
	 * @generated
	 */
	EReference getRead_Receiver();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Read#getKeyName <em>Key Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Read#getKeyName()
	 * @see #getRead()
	 * @generated
	 */
	EReference getRead_KeyName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Read#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Read#getFileName()
	 * @see #getRead()
	 * @generated
	 */
	EReference getRead_FileName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Write <em>Write</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Write
	 * @generated
	 */
	EClass getWrite();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Write#getRecordName <em>Record Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Write#getRecordName()
	 * @see #getWrite()
	 * @generated
	 */
	EReference getWrite_RecordName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Write#getNumLines <em>Num Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Lines</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Write#getNumLines()
	 * @see #getWrite()
	 * @generated
	 */
	EReference getWrite_NumLines();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Write#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Integer</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Write#getInteger()
	 * @see #getWrite()
	 * @generated
	 */
	EReference getWrite_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Write#getMnemonicName <em>Mnemonic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mnemonic Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Write#getMnemonicName()
	 * @see #getWrite()
	 * @generated
	 */
	EReference getWrite_MnemonicName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Write#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Write#getSender()
	 * @see #getWrite()
	 * @generated
	 */
	EReference getWrite_Sender();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Rewrite <em>Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rewrite</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Rewrite
	 * @generated
	 */
	EClass getRewrite();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.SwitchStatus <em>Switch Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SwitchStatus
	 * @generated
	 */
	EClass getSwitchStatus();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.SwitchStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SwitchStatus#getStatus()
	 * @see #getSwitchStatus()
	 * @generated
	 */
	EAttribute getSwitchStatus_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.SwitchStatus#getMnemonicNames <em>Mnemonic Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mnemonic Names</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.SwitchStatus#getMnemonicNames()
	 * @see #getSwitchStatus()
	 * @generated
	 */
	EReference getSwitchStatus_MnemonicNames();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes <em>Perform Procedure Fixed Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Procedure Fixed Times</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes
	 * @generated
	 */
	EClass getPerformProcedureFixedTimes();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformUntilCondition <em>Perform Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Until Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformUntilCondition
	 * @generated
	 */
	EClass getPerformUntilCondition();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getPosition()
	 * @see #getPerformUntilCondition()
	 * @generated
	 */
	EAttribute getPerformUntilCondition_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformUntilCondition#getConditions()
	 * @see #getPerformUntilCondition()
	 * @generated
	 */
	EReference getPerformUntilCondition_Conditions();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformFixedTimes <em>Perform Fixed Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Fixed Times</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformFixedTimes
	 * @generated
	 */
	EClass getPerformFixedTimes();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.PerformFixedTimes#getIterations <em>Iterations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Iterations</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformFixedTimes#getIterations()
	 * @see #getPerformFixedTimes()
	 * @generated
	 */
	EReference getPerformFixedTimes_Iterations();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition <em>Perform Procedure Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Procedure Until Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition
	 * @generated
	 */
	EClass getPerformProcedureUntilCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition#getAfters <em>Afters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Afters</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition#getAfters()
	 * @see #getPerformProcedureUntilCondition()
	 * @generated
	 */
	EReference getPerformProcedureUntilCondition_Afters();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes <em>Perform Nested Statement Fixed Times</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Nested Statement Fixed Times</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes
	 * @generated
	 */
	EClass getPerformNestedStatementFixedTimes();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition <em>Perform Nested Statement Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Perform Nested Statement Until Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition
	 * @generated
	 */
	EClass getPerformNestedStatementUntilCondition();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Continue <em>Continue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continue</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Continue
	 * @generated
	 */
	EClass getContinue();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement <em>File IO Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File IO Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.FileIOStatement
	 * @generated
	 */
	EClass getFileIOStatement();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.FileIOStatement#getFileName()
	 * @see #getFileIOStatement()
	 * @generated
	 */
	EReference getFileIOStatement_FileName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.FileIOStatement#getInput()
	 * @see #getFileIOStatement()
	 * @generated
	 */
	EReference getFileIOStatement_Input();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.FileIOStatement#getOutput()
	 * @see #getFileIOStatement()
	 * @generated
	 */
	EReference getFileIOStatement_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.FileIOStatement#getKeyDescriptors <em>Key Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Descriptors</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.FileIOStatement#getKeyDescriptors()
	 * @see #getFileIOStatement()
	 * @generated
	 */
	EReference getFileIOStatement_KeyDescriptors();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Merge <em>Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merge</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Merge
	 * @generated
	 */
	EClass getMerge();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Release#getRecordName <em>Record Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Release#getRecordName()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_RecordName();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.Release#getSender <em>Sender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sender</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Release#getSender()
	 * @see #getRelease()
	 * @generated
	 */
	EReference getRelease_Sender();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor <em>Key Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Descriptor</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.KeyDescriptor
	 * @generated
	 */
	EClass getKeyDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getOrder()
	 * @see #getKeyDescriptor()
	 * @generated
	 */
	EAttribute getKeyDescriptor_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getKeyNames <em>Key Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Key Names</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.KeyDescriptor#getKeyNames()
	 * @see #getKeyDescriptor()
	 * @generated
	 */
	EReference getKeyDescriptor_KeyNames();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.IOStatement <em>IO Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Statement</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOStatement
	 * @generated
	 */
	EClass getIOStatement();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.IOStatement#getIoFileDescriptors <em>Io File Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io File Descriptors</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOStatement#getIoFileDescriptors()
	 * @see #getIOStatement()
	 * @generated
	 */
	EReference getIOStatement_IoFileDescriptors();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor <em>IO File Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO File Descriptor</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOFileDescriptor
	 * @generated
	 */
	EClass getIOFileDescriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getIoFiles <em>Io Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Io Files</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getIoFiles()
	 * @see #getIOFileDescriptor()
	 * @generated
	 */
	EReference getIOFileDescriptor_IoFiles();

	/**
	 * Returns the meta object for the attribute '{@link org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOFileDescriptor#getType()
	 * @see #getIOFileDescriptor()
	 * @generated
	 */
	EAttribute getIOFileDescriptor_Type();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.IOFile <em>IO File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO File</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOFile
	 * @generated
	 */
	EClass getIOFile();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.IOFile#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File Name</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOFile#getFileName()
	 * @see #getIOFile()
	 * @generated
	 */
	EReference getIOFile_FileName();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.TallyingIn <em>Tallying In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tallying In</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.TallyingIn
	 * @generated
	 */
	EClass getTallyingIn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.servicifi.gelato.language.cobol.statements.TallyingIn#getOccurrences <em>Occurrences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrences</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.TallyingIn#getOccurrences()
	 * @see #getTallyingIn()
	 * @generated
	 */
	EReference getTallyingIn_Occurrences();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.TallyingIn#getCounter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Counter</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.TallyingIn#getCounter()
	 * @see #getTallyingIn()
	 * @generated
	 */
	EReference getTallyingIn_Counter();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition <em>Varying Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Varying Until Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition
	 * @generated
	 */
	EClass getVaryingUntilCondition();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getVariable()
	 * @see #getVaryingUntilCondition()
	 * @generated
	 */
	EReference getVaryingUntilCondition_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getInit()
	 * @see #getVaryingUntilCondition()
	 * @generated
	 */
	EReference getVaryingUntilCondition_Init();

	/**
	 * Returns the meta object for the containment reference '{@link org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Increment</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition#getIncrement()
	 * @see #getVaryingUntilCondition()
	 * @generated
	 */
	EReference getVaryingUntilCondition_Increment();

	/**
	 * Returns the meta object for class '{@link org.servicifi.gelato.language.cobol.statements.AfterUntilCondition <em>After Until Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Until Condition</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.AfterUntilCondition
	 * @generated
	 */
	EClass getAfterUntilCondition();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.ExitLabels <em>Exit Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Exit Labels</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.ExitLabels
	 * @generated
	 */
	EEnum getExitLabels();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.Adjustings <em>Adjustings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adjustings</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Adjustings
	 * @generated
	 */
	EEnum getAdjustings();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Status</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Status
	 * @generated
	 */
	EEnum getStatus();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.EOP <em>EOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOP</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.EOP
	 * @generated
	 */
	EEnum getEOP();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.IOTypes <em>IO Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>IO Types</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.IOTypes
	 * @generated
	 */
	EEnum getIOTypes();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.Orders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Orders</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Orders
	 * @generated
	 */
	EEnum getOrders();

	/**
	 * Returns the meta object for enum '{@link org.servicifi.gelato.language.cobol.statements.Corresponding <em>Corresponding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Corresponding</em>'.
	 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
	 * @generated
	 */
	EEnum getCorresponding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatementsFactory getStatementsFactory();

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
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__NEXT = eINSTANCE.getStatement_Next();

		/**
		 * The meta object literal for the '<em><b>End Verb</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEMENT__END_VERB = eINSTANCE.getStatement_EndVerb();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl <em>Arithmetic Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ArithmeticStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getArithmeticStatement()
		 * @generated
		 */
		EClass ARITHMETIC_STATEMENT = eINSTANCE.getArithmeticStatement();

		/**
		 * The meta object literal for the '<em><b>Corresponding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_STATEMENT__CORRESPONDING = eINSTANCE.getArithmeticStatement_Corresponding();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_STATEMENT__OPERANDS = eINSTANCE.getArithmeticStatement_Operands();

		/**
		 * The meta object literal for the '<em><b>Givings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_STATEMENT__GIVINGS = eINSTANCE.getArithmeticStatement_Givings();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.AddImpl <em>Add</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.AddImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAdd()
		 * @generated
		 */
		EClass ADD = eINSTANCE.getAdd();

		/**
		 * The meta object literal for the '<em><b>Tos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD__TOS = eINSTANCE.getAdd_Tos();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SubtractImpl <em>Subtract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SubtractImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSubtract()
		 * @generated
		 */
		EClass SUBTRACT = eINSTANCE.getSubtract();

		/**
		 * The meta object literal for the '<em><b>Froms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTRACT__FROMS = eINSTANCE.getSubtract_Froms();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.MultiplyImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '<em><b>Bys</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLY__BYS = eINSTANCE.getMultiply_Bys();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.DivideImpl <em>Divide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.DivideImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getDivide()
		 * @generated
		 */
		EClass DIVIDE = eINSTANCE.getDivide();

		/**
		 * The meta object literal for the '<em><b>Intos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVIDE__INTOS = eINSTANCE.getDivide_Intos();

		/**
		 * The meta object literal for the '<em><b>Remainders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIVIDE__REMAINDERS = eINSTANCE.getDivide_Remainders();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformImpl <em>Perform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerform()
		 * @generated
		 */
		EClass PERFORM = eINSTANCE.getPerform();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementImpl <em>Perform Nested Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformNestedStatement()
		 * @generated
		 */
		EClass PERFORM_NESTED_STATEMENT = eINSTANCE.getPerformNestedStatement();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureImpl <em>Perform Procedure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformProcedure()
		 * @generated
		 */
		EClass PERFORM_PROCEDURE = eINSTANCE.getPerformProcedure();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_PROCEDURE__LABEL = eINSTANCE.getPerformProcedure_Label();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.JumpImpl <em>Jump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.JumpImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getJump()
		 * @generated
		 */
		EClass JUMP = eINSTANCE.getJump();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP__LABELS = eINSTANCE.getJump_Labels();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.NextSentenceImpl <em>Next Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.NextSentenceImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getNextSentence()
		 * @generated
		 */
		EClass NEXT_SENTENCE = eINSTANCE.getNextSentence();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.GoToImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_TO__DEPENDS_ON = eINSTANCE.getGoTo_DependsOn();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.GoBackImpl <em>Go Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.GoBackImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getGoBack()
		 * @generated
		 */
		EClass GO_BACK = eINSTANCE.getGoBack();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.NestedStatementImpl <em>Nested Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.NestedStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getNestedStatement()
		 * @generated
		 */
		EClass NESTED_STATEMENT = eINSTANCE.getNestedStatement();

		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NESTED_STATEMENT__STATEMENTS = eINSTANCE.getNestedStatement_Statements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.MoveImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__RECEIVERS = eINSTANCE.getMove_Receivers();

		/**
		 * The meta object literal for the '<em><b>Corresponding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__CORRESPONDING = eINSTANCE.getMove_Corresponding();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOVE__SENDER = eINSTANCE.getMove_Sender();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ExitImpl <em>Exit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ExitImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getExit()
		 * @generated
		 */
		EClass EXIT = eINSTANCE.getExit();

		/**
		 * The meta object literal for the '<em><b>Exit Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXIT__EXIT_LABEL = eINSTANCE.getExit_ExitLabel();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ConditionImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__ELSE_STATEMENTS = eINSTANCE.getCondition_ElseStatements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ConditionalImpl <em>Conditional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ConditionalImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getConditional()
		 * @generated
		 */
		EClass CONDITIONAL = eINSTANCE.getConditional();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL__CONDITION = eINSTANCE.getConditional_Condition();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StopImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP__LABEL = eINSTANCE.getStop_Label();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.DisplayImpl <em>Display</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.DisplayImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getDisplay()
		 * @generated
		 */
		EClass DISPLAY = eINSTANCE.getDisplay();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY__OPERANDS = eINSTANCE.getDisplay_Operands();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY__OUTPUT = eINSTANCE.getDisplay_Output();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ComputeImpl <em>Compute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ComputeImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCompute()
		 * @generated
		 */
		EClass COMPUTE = eINSTANCE.getCompute();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPUTE__EXPRESSION = eINSTANCE.getCompute_Expression();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.AcceptImpl <em>Accept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.AcceptImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAccept()
		 * @generated
		 */
		EClass ACCEPT = eINSTANCE.getAccept();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT__RECEIVER = eINSTANCE.getAccept_Receiver();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ExecuteImpl <em>Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ExecuteImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getExecute()
		 * @generated
		 */
		EClass EXECUTE = eINSTANCE.getExecute();

		/**
		 * The meta object literal for the '<em><b>Water</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTE__WATER = eINSTANCE.getExecute_Water();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ErrorHandledImpl <em>Error Handled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ErrorHandledImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getErrorHandled()
		 * @generated
		 */
		EClass ERROR_HANDLED = eINSTANCE.getErrorHandled();

		/**
		 * The meta object literal for the '<em><b>Handlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_HANDLED__HANDLERS = eINSTANCE.getErrorHandled_Handlers();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ReturnImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__FILE_NAME = eINSTANCE.getReturn_FileName();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__OUTPUT = eINSTANCE.getReturn_Output();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetStatementImpl <em>Set Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SetStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSetStatement()
		 * @generated
		 */
		EClass SET_STATEMENT = eINSTANCE.getSetStatement();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_STATEMENT__SENDER = eINSTANCE.getSetStatement_Sender();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetSwitchesImpl <em>Set Switches</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SetSwitchesImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSetSwitches()
		 * @generated
		 */
		EClass SET_SWITCHES = eINSTANCE.getSetSwitches();

		/**
		 * The meta object literal for the '<em><b>Switches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_SWITCHES__SWITCHES = eINSTANCE.getSetSwitches_Switches();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetIndexNameImpl <em>Set Index Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SetIndexNameImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSetIndexName()
		 * @generated
		 */
		EClass SET_INDEX_NAME = eINSTANCE.getSetIndexName();

		/**
		 * The meta object literal for the '<em><b>Adjust</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_INDEX_NAME__ADJUST = eINSTANCE.getSetIndexName_Adjust();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_INDEX_NAME__RECEIVERS = eINSTANCE.getSetIndexName_Receivers();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StringImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING__POINTER = eINSTANCE.getString_Pointer();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING__RECEIVER = eINSTANCE.getString_Receiver();

		/**
		 * The meta object literal for the '<em><b>Senders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING__SENDERS = eINSTANCE.getString_Senders();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.CloseImpl <em>Close</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.CloseImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getClose()
		 * @generated
		 */
		EClass CLOSE = eINSTANCE.getClose();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.CancelImpl <em>Cancel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.CancelImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCancel()
		 * @generated
		 */
		EClass CANCEL = eINSTANCE.getCancel();

		/**
		 * The meta object literal for the '<em><b>Subprograms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CANCEL__SUBPROGRAMS = eINSTANCE.getCancel_Subprograms();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.CallImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Subprogram</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__SUBPROGRAM = eINSTANCE.getCall_Subprogram();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.InitializeImpl <em>Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.InitializeImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getInitialize()
		 * @generated
		 */
		EClass INITIALIZE = eINSTANCE.getInitialize();

		/**
		 * The meta object literal for the '<em><b>Subprograms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZE__SUBPROGRAMS = eINSTANCE.getInitialize_Subprograms();

		/**
		 * The meta object literal for the '<em><b>Replacements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INITIALIZE__REPLACEMENTS = eINSTANCE.getInitialize_Replacements();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.OpenImpl <em>Open</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.OpenImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getOpen()
		 * @generated
		 */
		EClass OPEN = eINSTANCE.getOpen();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SearchStatementImpl <em>Search Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SearchStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSearchStatement()
		 * @generated
		 */
		EClass SEARCH_STATEMENT = eINSTANCE.getSearchStatement();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_STATEMENT__CASES = eINSTANCE.getSearchStatement_Cases();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEARCH_STATEMENT__TABLE = eINSTANCE.getSearchStatement_Table();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SerialSearchImpl <em>Serial Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SerialSearchImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSerialSearch()
		 * @generated
		 */
		EClass SERIAL_SEARCH = eINSTANCE.getSerialSearch();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERIAL_SEARCH__VARIABLE = eINSTANCE.getSerialSearch_Variable();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.BinarySearchImpl <em>Binary Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.BinarySearchImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getBinarySearch()
		 * @generated
		 */
		EClass BINARY_SEARCH = eINSTANCE.getBinarySearch();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl <em>Unstring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.UnstringImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getUnstring()
		 * @generated
		 */
		EClass UNSTRING = eINSTANCE.getUnstring();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRING__POINTER = eINSTANCE.getUnstring_Pointer();

		/**
		 * The meta object literal for the '<em><b>Tally</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRING__TALLY = eINSTANCE.getUnstring_Tally();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRING__SENDER = eINSTANCE.getUnstring_Sender();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRING__RECEIVERS = eINSTANCE.getUnstring_Receivers();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRING__DELIMITER = eINSTANCE.getUnstring_Delimiter();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNSTRING__COUNTER = eINSTANCE.getUnstring_Counter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.EvaluateImpl <em>Evaluate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.EvaluateImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEvaluate()
		 * @generated
		 */
		EClass EVALUATE = eINSTANCE.getEvaluate();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE__CASES = eINSTANCE.getEvaluate_Cases();

		/**
		 * The meta object literal for the '<em><b>Subject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE__SUBJECT = eINSTANCE.getEvaluate_Subject();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.NormalEvaluateCaseImpl <em>Normal Evaluate Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.NormalEvaluateCaseImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getNormalEvaluateCase()
		 * @generated
		 */
		EClass NORMAL_EVALUATE_CASE = eINSTANCE.getNormalEvaluateCase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.OtherEvaluateCaseImpl <em>Other Evaluate Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.OtherEvaluateCaseImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getOtherEvaluateCase()
		 * @generated
		 */
		EClass OTHER_EVALUATE_CASE = eINSTANCE.getOtherEvaluateCase();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.EvaluateCaseImpl <em>Evaluate Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.EvaluateCaseImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEvaluateCase()
		 * @generated
		 */
		EClass EVALUATE_CASE = eINSTANCE.getEvaluateCase();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVALUATE_CASE__OBJECTS = eINSTANCE.getEvaluateCase_Objects();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReplaceImpl <em>Replace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ReplaceImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getReplace()
		 * @generated
		 */
		EClass REPLACE = eINSTANCE.getReplace();

		/**
		 * The meta object literal for the '<em><b>Replace Switch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACE__REPLACE_SWITCH = eINSTANCE.getReplace_ReplaceSwitch();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.EntryImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.InspectImpl <em>Inspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.InspectImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getInspect()
		 * @generated
		 */
		EClass INSPECT = eINSTANCE.getInspect();

		/**
		 * The meta object literal for the '<em><b>Tallying Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECT__TALLYING_INS = eINSTANCE.getInspect_TallyingIns();

		/**
		 * The meta object literal for the '<em><b>Replacements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECT__REPLACEMENTS = eINSTANCE.getInspect_Replacements();

		/**
		 * The meta object literal for the '<em><b>Conversions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECT__CONVERSIONS = eINSTANCE.getInspect_Conversions();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSPECT__STRING = eINSTANCE.getInspect_String();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SetImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Receivers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__RECEIVERS = eINSTANCE.getSet_Receivers();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ReadImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();

		/**
		 * The meta object literal for the '<em><b>Receiver</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ__RECEIVER = eINSTANCE.getRead_Receiver();

		/**
		 * The meta object literal for the '<em><b>Key Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ__KEY_NAME = eINSTANCE.getRead_KeyName();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ__FILE_NAME = eINSTANCE.getRead_FileName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.WriteImpl <em>Write</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.WriteImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getWrite()
		 * @generated
		 */
		EClass WRITE = eINSTANCE.getWrite();

		/**
		 * The meta object literal for the '<em><b>Record Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE__RECORD_NAME = eINSTANCE.getWrite_RecordName();

		/**
		 * The meta object literal for the '<em><b>Num Lines</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE__NUM_LINES = eINSTANCE.getWrite_NumLines();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE__INTEGER = eINSTANCE.getWrite_Integer();

		/**
		 * The meta object literal for the '<em><b>Mnemonic Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE__MNEMONIC_NAME = eINSTANCE.getWrite_MnemonicName();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE__SENDER = eINSTANCE.getWrite_Sender();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.RewriteImpl <em>Rewrite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.RewriteImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getRewrite()
		 * @generated
		 */
		EClass REWRITE = eINSTANCE.getRewrite();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SwitchStatusImpl <em>Switch Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SwitchStatusImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSwitchStatus()
		 * @generated
		 */
		EClass SWITCH_STATUS = eINSTANCE.getSwitchStatus();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH_STATUS__STATUS = eINSTANCE.getSwitchStatus_Status();

		/**
		 * The meta object literal for the '<em><b>Mnemonic Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_STATUS__MNEMONIC_NAMES = eINSTANCE.getSwitchStatus_MnemonicNames();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureFixedTimesImpl <em>Perform Procedure Fixed Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureFixedTimesImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformProcedureFixedTimes()
		 * @generated
		 */
		EClass PERFORM_PROCEDURE_FIXED_TIMES = eINSTANCE.getPerformProcedureFixedTimes();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl <em>Perform Until Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformUntilConditionImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformUntilCondition()
		 * @generated
		 */
		EClass PERFORM_UNTIL_CONDITION = eINSTANCE.getPerformUntilCondition();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERFORM_UNTIL_CONDITION__POSITION = eINSTANCE.getPerformUntilCondition_Position();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_UNTIL_CONDITION__CONDITIONS = eINSTANCE.getPerformUntilCondition_Conditions();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformFixedTimesImpl <em>Perform Fixed Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformFixedTimesImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformFixedTimes()
		 * @generated
		 */
		EClass PERFORM_FIXED_TIMES = eINSTANCE.getPerformFixedTimes();

		/**
		 * The meta object literal for the '<em><b>Iterations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_FIXED_TIMES__ITERATIONS = eINSTANCE.getPerformFixedTimes_Iterations();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureUntilConditionImpl <em>Perform Procedure Until Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformProcedureUntilConditionImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformProcedureUntilCondition()
		 * @generated
		 */
		EClass PERFORM_PROCEDURE_UNTIL_CONDITION = eINSTANCE.getPerformProcedureUntilCondition();

		/**
		 * The meta object literal for the '<em><b>Afters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS = eINSTANCE.getPerformProcedureUntilCondition_Afters();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementFixedTimesImpl <em>Perform Nested Statement Fixed Times</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementFixedTimesImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformNestedStatementFixedTimes()
		 * @generated
		 */
		EClass PERFORM_NESTED_STATEMENT_FIXED_TIMES = eINSTANCE.getPerformNestedStatementFixedTimes();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementUntilConditionImpl <em>Perform Nested Statement Until Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.PerformNestedStatementUntilConditionImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getPerformNestedStatementUntilCondition()
		 * @generated
		 */
		EClass PERFORM_NESTED_STATEMENT_UNTIL_CONDITION = eINSTANCE.getPerformNestedStatementUntilCondition();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ContinueImpl <em>Continue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ContinueImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getContinue()
		 * @generated
		 */
		EClass CONTINUE = eINSTANCE.getContinue();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl <em>File IO Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.FileIOStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getFileIOStatement()
		 * @generated
		 */
		EClass FILE_IO_STATEMENT = eINSTANCE.getFileIOStatement();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_IO_STATEMENT__FILE_NAME = eINSTANCE.getFileIOStatement_FileName();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_IO_STATEMENT__INPUT = eINSTANCE.getFileIOStatement_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_IO_STATEMENT__OUTPUT = eINSTANCE.getFileIOStatement_Output();

		/**
		 * The meta object literal for the '<em><b>Key Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_IO_STATEMENT__KEY_DESCRIPTORS = eINSTANCE.getFileIOStatement_KeyDescriptors();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.SortImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.MergeImpl <em>Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.MergeImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getMerge()
		 * @generated
		 */
		EClass MERGE = eINSTANCE.getMerge();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.ReleaseImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Record Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__RECORD_NAME = eINSTANCE.getRelease_RecordName();

		/**
		 * The meta object literal for the '<em><b>Sender</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELEASE__SENDER = eINSTANCE.getRelease_Sender();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.KeyDescriptorImpl <em>Key Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.KeyDescriptorImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getKeyDescriptor()
		 * @generated
		 */
		EClass KEY_DESCRIPTOR = eINSTANCE.getKeyDescriptor();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_DESCRIPTOR__ORDER = eINSTANCE.getKeyDescriptor_Order();

		/**
		 * The meta object literal for the '<em><b>Key Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KEY_DESCRIPTOR__KEY_NAMES = eINSTANCE.getKeyDescriptor_KeyNames();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.IOStatementImpl <em>IO Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.IOStatementImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOStatement()
		 * @generated
		 */
		EClass IO_STATEMENT = eINSTANCE.getIOStatement();

		/**
		 * The meta object literal for the '<em><b>Io File Descriptors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_STATEMENT__IO_FILE_DESCRIPTORS = eINSTANCE.getIOStatement_IoFileDescriptors();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileDescriptorImpl <em>IO File Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.IOFileDescriptorImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOFileDescriptor()
		 * @generated
		 */
		EClass IO_FILE_DESCRIPTOR = eINSTANCE.getIOFileDescriptor();

		/**
		 * The meta object literal for the '<em><b>Io Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_FILE_DESCRIPTOR__IO_FILES = eINSTANCE.getIOFileDescriptor_IoFiles();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO_FILE_DESCRIPTOR__TYPE = eINSTANCE.getIOFileDescriptor_Type();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.IOFileImpl <em>IO File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.IOFileImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOFile()
		 * @generated
		 */
		EClass IO_FILE = eINSTANCE.getIOFile();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_FILE__FILE_NAME = eINSTANCE.getIOFile_FileName();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.TallyingInImpl <em>Tallying In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.TallyingInImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getTallyingIn()
		 * @generated
		 */
		EClass TALLYING_IN = eINSTANCE.getTallyingIn();

		/**
		 * The meta object literal for the '<em><b>Occurrences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALLYING_IN__OCCURRENCES = eINSTANCE.getTallyingIn_Occurrences();

		/**
		 * The meta object literal for the '<em><b>Counter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALLYING_IN__COUNTER = eINSTANCE.getTallyingIn_Counter();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.VaryingUntilConditionImpl <em>Varying Until Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.VaryingUntilConditionImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getVaryingUntilCondition()
		 * @generated
		 */
		EClass VARYING_UNTIL_CONDITION = eINSTANCE.getVaryingUntilCondition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARYING_UNTIL_CONDITION__VARIABLE = eINSTANCE.getVaryingUntilCondition_Variable();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARYING_UNTIL_CONDITION__INIT = eINSTANCE.getVaryingUntilCondition_Init();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARYING_UNTIL_CONDITION__INCREMENT = eINSTANCE.getVaryingUntilCondition_Increment();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.impl.AfterUntilConditionImpl <em>After Until Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.impl.AfterUntilConditionImpl
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAfterUntilCondition()
		 * @generated
		 */
		EClass AFTER_UNTIL_CONDITION = eINSTANCE.getAfterUntilCondition();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.ExitLabels <em>Exit Labels</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.ExitLabels
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getExitLabels()
		 * @generated
		 */
		EEnum EXIT_LABELS = eINSTANCE.getExitLabels();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.Adjustings <em>Adjustings</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.Adjustings
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getAdjustings()
		 * @generated
		 */
		EEnum ADJUSTINGS = eINSTANCE.getAdjustings();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.Status <em>Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.Status
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getStatus()
		 * @generated
		 */
		EEnum STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.EOP <em>EOP</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.EOP
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getEOP()
		 * @generated
		 */
		EEnum EOP = eINSTANCE.getEOP();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.IOTypes <em>IO Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.IOTypes
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getIOTypes()
		 * @generated
		 */
		EEnum IO_TYPES = eINSTANCE.getIOTypes();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.Orders <em>Orders</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.Orders
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getOrders()
		 * @generated
		 */
		EEnum ORDERS = eINSTANCE.getOrders();

		/**
		 * The meta object literal for the '{@link org.servicifi.gelato.language.cobol.statements.Corresponding <em>Corresponding</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.servicifi.gelato.language.cobol.statements.Corresponding
		 * @see org.servicifi.gelato.language.cobol.statements.impl.StatementsPackageImpl#getCorresponding()
		 * @generated
		 */
		EEnum CORRESPONDING = eINSTANCE.getCorresponding();

	}

} //StatementsPackage
