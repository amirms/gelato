/**
 */
package org.servicifi.gelato.language.cobol.statements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.servicifi.gelato.language.cobol.functions.Argumentable;

import org.servicifi.gelato.language.cobol.parameters.Parametrizable;

import org.servicifi.gelato.language.cobol.statements.Accept;
import org.servicifi.gelato.language.cobol.statements.Add;
import org.servicifi.gelato.language.cobol.statements.AfterUntilCondition;
import org.servicifi.gelato.language.cobol.statements.ArithmeticStatement;
import org.servicifi.gelato.language.cobol.statements.BinarySearch;
import org.servicifi.gelato.language.cobol.statements.Call;
import org.servicifi.gelato.language.cobol.statements.Cancel;
import org.servicifi.gelato.language.cobol.statements.Close;
import org.servicifi.gelato.language.cobol.statements.Compute;
import org.servicifi.gelato.language.cobol.statements.Condition;
import org.servicifi.gelato.language.cobol.statements.Conditional;
import org.servicifi.gelato.language.cobol.statements.Continue;
import org.servicifi.gelato.language.cobol.statements.Delete;
import org.servicifi.gelato.language.cobol.statements.Display;
import org.servicifi.gelato.language.cobol.statements.Divide;
import org.servicifi.gelato.language.cobol.statements.Entry;
import org.servicifi.gelato.language.cobol.statements.ErrorHandled;
import org.servicifi.gelato.language.cobol.statements.Evaluate;
import org.servicifi.gelato.language.cobol.statements.EvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Execute;
import org.servicifi.gelato.language.cobol.statements.Exit;
import org.servicifi.gelato.language.cobol.statements.FileIOStatement;
import org.servicifi.gelato.language.cobol.statements.GoBack;
import org.servicifi.gelato.language.cobol.statements.GoTo;
import org.servicifi.gelato.language.cobol.statements.IOFile;
import org.servicifi.gelato.language.cobol.statements.IOFileDescriptor;
import org.servicifi.gelato.language.cobol.statements.IOStatement;
import org.servicifi.gelato.language.cobol.statements.Initialize;
import org.servicifi.gelato.language.cobol.statements.Inspect;
import org.servicifi.gelato.language.cobol.statements.Jump;
import org.servicifi.gelato.language.cobol.statements.KeyDescriptor;
import org.servicifi.gelato.language.cobol.statements.Merge;
import org.servicifi.gelato.language.cobol.statements.Move;
import org.servicifi.gelato.language.cobol.statements.Multiply;
import org.servicifi.gelato.language.cobol.statements.NestedStatement;
import org.servicifi.gelato.language.cobol.statements.NextSentence;
import org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Open;
import org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Perform;
import org.servicifi.gelato.language.cobol.statements.PerformFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatement;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition;
import org.servicifi.gelato.language.cobol.statements.PerformProcedure;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition;
import org.servicifi.gelato.language.cobol.statements.PerformUntilCondition;
import org.servicifi.gelato.language.cobol.statements.Read;
import org.servicifi.gelato.language.cobol.statements.Release;
import org.servicifi.gelato.language.cobol.statements.Replace;
import org.servicifi.gelato.language.cobol.statements.Return;
import org.servicifi.gelato.language.cobol.statements.Rewrite;
import org.servicifi.gelato.language.cobol.statements.SearchStatement;
import org.servicifi.gelato.language.cobol.statements.SerialSearch;
import org.servicifi.gelato.language.cobol.statements.Set;
import org.servicifi.gelato.language.cobol.statements.SetIndexName;
import org.servicifi.gelato.language.cobol.statements.SetStatement;
import org.servicifi.gelato.language.cobol.statements.SetSwitches;
import org.servicifi.gelato.language.cobol.statements.Sort;
import org.servicifi.gelato.language.cobol.statements.Start;
import org.servicifi.gelato.language.cobol.statements.Statement;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.Stop;
import org.servicifi.gelato.language.cobol.statements.Subtract;
import org.servicifi.gelato.language.cobol.statements.SwitchStatus;
import org.servicifi.gelato.language.cobol.statements.TallyingIn;
import org.servicifi.gelato.language.cobol.statements.Unstring;
import org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition;
import org.servicifi.gelato.language.cobol.statements.Write;

import org.servicifi.gelato.language.cobol.water.IncompleteElement;

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
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage
 * @generated
 */
public class StatementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsSwitch() {
		if (modelPackage == null) {
			modelPackage = StatementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case StatementsPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ARITHMETIC_STATEMENT: {
				ArithmeticStatement arithmeticStatement = (ArithmeticStatement)theEObject;
				T result = caseArithmeticStatement(arithmeticStatement);
				if (result == null) result = caseStatement(arithmeticStatement);
				if (result == null) result = caseErrorHandled(arithmeticStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ADD: {
				Add add = (Add)theEObject;
				T result = caseAdd(add);
				if (result == null) result = caseArithmeticStatement(add);
				if (result == null) result = caseStatement(add);
				if (result == null) result = caseErrorHandled(add);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SUBTRACT: {
				Subtract subtract = (Subtract)theEObject;
				T result = caseSubtract(subtract);
				if (result == null) result = caseArithmeticStatement(subtract);
				if (result == null) result = caseStatement(subtract);
				if (result == null) result = caseErrorHandled(subtract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.MULTIPLY: {
				Multiply multiply = (Multiply)theEObject;
				T result = caseMultiply(multiply);
				if (result == null) result = caseArithmeticStatement(multiply);
				if (result == null) result = caseStatement(multiply);
				if (result == null) result = caseErrorHandled(multiply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.DIVIDE: {
				Divide divide = (Divide)theEObject;
				T result = caseDivide(divide);
				if (result == null) result = caseArithmeticStatement(divide);
				if (result == null) result = caseStatement(divide);
				if (result == null) result = caseErrorHandled(divide);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM: {
				Perform perform = (Perform)theEObject;
				T result = casePerform(perform);
				if (result == null) result = caseStatement(perform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_NESTED_STATEMENT: {
				PerformNestedStatement performNestedStatement = (PerformNestedStatement)theEObject;
				T result = casePerformNestedStatement(performNestedStatement);
				if (result == null) result = casePerform(performNestedStatement);
				if (result == null) result = caseNestedStatement(performNestedStatement);
				if (result == null) result = caseStatement(performNestedStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_PROCEDURE: {
				PerformProcedure performProcedure = (PerformProcedure)theEObject;
				T result = casePerformProcedure(performProcedure);
				if (result == null) result = casePerform(performProcedure);
				if (result == null) result = caseStatement(performProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.JUMP: {
				Jump jump = (Jump)theEObject;
				T result = caseJump(jump);
				if (result == null) result = caseStatement(jump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NEXT_SENTENCE: {
				NextSentence nextSentence = (NextSentence)theEObject;
				T result = caseNextSentence(nextSentence);
				if (result == null) result = caseJump(nextSentence);
				if (result == null) result = caseStatement(nextSentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.GO_TO: {
				GoTo goTo = (GoTo)theEObject;
				T result = caseGoTo(goTo);
				if (result == null) result = caseJump(goTo);
				if (result == null) result = caseStatement(goTo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.GO_BACK: {
				GoBack goBack = (GoBack)theEObject;
				T result = caseGoBack(goBack);
				if (result == null) result = caseJump(goBack);
				if (result == null) result = caseStatement(goBack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NESTED_STATEMENT: {
				NestedStatement nestedStatement = (NestedStatement)theEObject;
				T result = caseNestedStatement(nestedStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.MOVE: {
				Move move = (Move)theEObject;
				T result = caseMove(move);
				if (result == null) result = caseStatement(move);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EXIT: {
				Exit exit = (Exit)theEObject;
				T result = caseExit(exit);
				if (result == null) result = caseStatement(exit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseNestedStatement(condition);
				if (result == null) result = caseConditional(condition);
				if (result == null) result = caseStatement(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONDITIONAL: {
				Conditional conditional = (Conditional)theEObject;
				T result = caseConditional(conditional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STOP: {
				Stop stop = (Stop)theEObject;
				T result = caseStop(stop);
				if (result == null) result = caseStatement(stop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.DISPLAY: {
				Display display = (Display)theEObject;
				T result = caseDisplay(display);
				if (result == null) result = caseStatement(display);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.COMPUTE: {
				Compute compute = (Compute)theEObject;
				T result = caseCompute(compute);
				if (result == null) result = caseStatement(compute);
				if (result == null) result = caseErrorHandled(compute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ACCEPT: {
				Accept accept = (Accept)theEObject;
				T result = caseAccept(accept);
				if (result == null) result = caseStatement(accept);
				if (result == null) result = caseIncompleteElement(accept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EXECUTE: {
				Execute execute = (Execute)theEObject;
				T result = caseExecute(execute);
				if (result == null) result = caseStatement(execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ERROR_HANDLED: {
				ErrorHandled errorHandled = (ErrorHandled)theEObject;
				T result = caseErrorHandled(errorHandled);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseErrorHandled(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SET_STATEMENT: {
				SetStatement setStatement = (SetStatement)theEObject;
				T result = caseSetStatement(setStatement);
				if (result == null) result = caseStatement(setStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SET_SWITCHES: {
				SetSwitches setSwitches = (SetSwitches)theEObject;
				T result = caseSetSwitches(setSwitches);
				if (result == null) result = caseSetStatement(setSwitches);
				if (result == null) result = caseStatement(setSwitches);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SET_INDEX_NAME: {
				SetIndexName setIndexName = (SetIndexName)theEObject;
				T result = caseSetIndexName(setIndexName);
				if (result == null) result = caseSetStatement(setIndexName);
				if (result == null) result = caseStatement(setIndexName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.STRING: {
				org.servicifi.gelato.language.cobol.statements.String string = (org.servicifi.gelato.language.cobol.statements.String)theEObject;
				T result = caseString(string);
				if (result == null) result = caseStatement(string);
				if (result == null) result = caseErrorHandled(string);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CLOSE: {
				Close close = (Close)theEObject;
				T result = caseClose(close);
				if (result == null) result = caseIncompleteElement(close);
				if (result == null) result = caseIOStatement(close);
				if (result == null) result = caseStatement(close);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CANCEL: {
				Cancel cancel = (Cancel)theEObject;
				T result = caseCancel(cancel);
				if (result == null) result = caseStatement(cancel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseStatement(call);
				if (result == null) result = caseArgumentable(call);
				if (result == null) result = caseErrorHandled(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.INITIALIZE: {
				Initialize initialize = (Initialize)theEObject;
				T result = caseInitialize(initialize);
				if (result == null) result = caseStatement(initialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.OPEN: {
				Open open = (Open)theEObject;
				T result = caseOpen(open);
				if (result == null) result = caseIncompleteElement(open);
				if (result == null) result = caseIOStatement(open);
				if (result == null) result = caseStatement(open);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SEARCH_STATEMENT: {
				SearchStatement searchStatement = (SearchStatement)theEObject;
				T result = caseSearchStatement(searchStatement);
				if (result == null) result = caseStatement(searchStatement);
				if (result == null) result = caseErrorHandled(searchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SERIAL_SEARCH: {
				SerialSearch serialSearch = (SerialSearch)theEObject;
				T result = caseSerialSearch(serialSearch);
				if (result == null) result = caseSearchStatement(serialSearch);
				if (result == null) result = caseStatement(serialSearch);
				if (result == null) result = caseErrorHandled(serialSearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.BINARY_SEARCH: {
				BinarySearch binarySearch = (BinarySearch)theEObject;
				T result = caseBinarySearch(binarySearch);
				if (result == null) result = caseSearchStatement(binarySearch);
				if (result == null) result = caseStatement(binarySearch);
				if (result == null) result = caseErrorHandled(binarySearch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.UNSTRING: {
				Unstring unstring = (Unstring)theEObject;
				T result = caseUnstring(unstring);
				if (result == null) result = caseErrorHandled(unstring);
				if (result == null) result = caseStatement(unstring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EVALUATE: {
				Evaluate evaluate = (Evaluate)theEObject;
				T result = caseEvaluate(evaluate);
				if (result == null) result = caseStatement(evaluate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.NORMAL_EVALUATE_CASE: {
				NormalEvaluateCase normalEvaluateCase = (NormalEvaluateCase)theEObject;
				T result = caseNormalEvaluateCase(normalEvaluateCase);
				if (result == null) result = caseEvaluateCase(normalEvaluateCase);
				if (result == null) result = caseNestedStatement(normalEvaluateCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.OTHER_EVALUATE_CASE: {
				OtherEvaluateCase otherEvaluateCase = (OtherEvaluateCase)theEObject;
				T result = caseOtherEvaluateCase(otherEvaluateCase);
				if (result == null) result = caseEvaluateCase(otherEvaluateCase);
				if (result == null) result = caseNestedStatement(otherEvaluateCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.EVALUATE_CASE: {
				EvaluateCase evaluateCase = (EvaluateCase)theEObject;
				T result = caseEvaluateCase(evaluateCase);
				if (result == null) result = caseNestedStatement(evaluateCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.REPLACE: {
				Replace replace = (Replace)theEObject;
				T result = caseReplace(replace);
				if (result == null) result = caseStatement(replace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.ENTRY: {
				Entry entry = (Entry)theEObject;
				T result = caseEntry(entry);
				if (result == null) result = caseParametrizable(entry);
				if (result == null) result = caseStatement(entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.INSPECT: {
				Inspect inspect = (Inspect)theEObject;
				T result = caseInspect(inspect);
				if (result == null) result = caseStatement(inspect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SET: {
				Set set = (Set)theEObject;
				T result = caseSet(set);
				if (result == null) result = caseSetStatement(set);
				if (result == null) result = caseStatement(set);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.READ: {
				Read read = (Read)theEObject;
				T result = caseRead(read);
				if (result == null) result = caseStatement(read);
				if (result == null) result = caseErrorHandled(read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.WRITE: {
				Write write = (Write)theEObject;
				T result = caseWrite(write);
				if (result == null) result = caseStatement(write);
				if (result == null) result = caseErrorHandled(write);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.REWRITE: {
				Rewrite rewrite = (Rewrite)theEObject;
				T result = caseRewrite(rewrite);
				if (result == null) result = caseWrite(rewrite);
				if (result == null) result = caseStatement(rewrite);
				if (result == null) result = caseErrorHandled(rewrite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SWITCH_STATUS: {
				SwitchStatus switchStatus = (SwitchStatus)theEObject;
				T result = caseSwitchStatus(switchStatus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES: {
				PerformProcedureFixedTimes performProcedureFixedTimes = (PerformProcedureFixedTimes)theEObject;
				T result = casePerformProcedureFixedTimes(performProcedureFixedTimes);
				if (result == null) result = casePerformProcedure(performProcedureFixedTimes);
				if (result == null) result = casePerformFixedTimes(performProcedureFixedTimes);
				if (result == null) result = casePerform(performProcedureFixedTimes);
				if (result == null) result = caseStatement(performProcedureFixedTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_UNTIL_CONDITION: {
				PerformUntilCondition performUntilCondition = (PerformUntilCondition)theEObject;
				T result = casePerformUntilCondition(performUntilCondition);
				if (result == null) result = casePerform(performUntilCondition);
				if (result == null) result = caseVaryingUntilCondition(performUntilCondition);
				if (result == null) result = caseStatement(performUntilCondition);
				if (result == null) result = caseConditional(performUntilCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_FIXED_TIMES: {
				PerformFixedTimes performFixedTimes = (PerformFixedTimes)theEObject;
				T result = casePerformFixedTimes(performFixedTimes);
				if (result == null) result = casePerform(performFixedTimes);
				if (result == null) result = caseStatement(performFixedTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION: {
				PerformProcedureUntilCondition performProcedureUntilCondition = (PerformProcedureUntilCondition)theEObject;
				T result = casePerformProcedureUntilCondition(performProcedureUntilCondition);
				if (result == null) result = casePerformUntilCondition(performProcedureUntilCondition);
				if (result == null) result = casePerformProcedure(performProcedureUntilCondition);
				if (result == null) result = casePerform(performProcedureUntilCondition);
				if (result == null) result = caseVaryingUntilCondition(performProcedureUntilCondition);
				if (result == null) result = caseStatement(performProcedureUntilCondition);
				if (result == null) result = caseConditional(performProcedureUntilCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES: {
				PerformNestedStatementFixedTimes performNestedStatementFixedTimes = (PerformNestedStatementFixedTimes)theEObject;
				T result = casePerformNestedStatementFixedTimes(performNestedStatementFixedTimes);
				if (result == null) result = casePerformNestedStatement(performNestedStatementFixedTimes);
				if (result == null) result = casePerformFixedTimes(performNestedStatementFixedTimes);
				if (result == null) result = casePerform(performNestedStatementFixedTimes);
				if (result == null) result = caseNestedStatement(performNestedStatementFixedTimes);
				if (result == null) result = caseStatement(performNestedStatementFixedTimes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION: {
				PerformNestedStatementUntilCondition performNestedStatementUntilCondition = (PerformNestedStatementUntilCondition)theEObject;
				T result = casePerformNestedStatementUntilCondition(performNestedStatementUntilCondition);
				if (result == null) result = casePerformUntilCondition(performNestedStatementUntilCondition);
				if (result == null) result = casePerformNestedStatement(performNestedStatementUntilCondition);
				if (result == null) result = casePerform(performNestedStatementUntilCondition);
				if (result == null) result = caseVaryingUntilCondition(performNestedStatementUntilCondition);
				if (result == null) result = caseNestedStatement(performNestedStatementUntilCondition);
				if (result == null) result = caseStatement(performNestedStatementUntilCondition);
				if (result == null) result = caseConditional(performNestedStatementUntilCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.CONTINUE: {
				Continue continue_ = (Continue)theEObject;
				T result = caseContinue(continue_);
				if (result == null) result = caseJump(continue_);
				if (result == null) result = caseStatement(continue_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.FILE_IO_STATEMENT: {
				FileIOStatement fileIOStatement = (FileIOStatement)theEObject;
				T result = caseFileIOStatement(fileIOStatement);
				if (result == null) result = caseStatement(fileIOStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.SORT: {
				Sort sort = (Sort)theEObject;
				T result = caseSort(sort);
				if (result == null) result = caseFileIOStatement(sort);
				if (result == null) result = caseIncompleteElement(sort);
				if (result == null) result = caseStatement(sort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.MERGE: {
				Merge merge = (Merge)theEObject;
				T result = caseMerge(merge);
				if (result == null) result = caseFileIOStatement(merge);
				if (result == null) result = caseIncompleteElement(merge);
				if (result == null) result = caseStatement(merge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.RELEASE: {
				Release release = (Release)theEObject;
				T result = caseRelease(release);
				if (result == null) result = caseStatement(release);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.KEY_DESCRIPTOR: {
				KeyDescriptor keyDescriptor = (KeyDescriptor)theEObject;
				T result = caseKeyDescriptor(keyDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.IO_STATEMENT: {
				IOStatement ioStatement = (IOStatement)theEObject;
				T result = caseIOStatement(ioStatement);
				if (result == null) result = caseStatement(ioStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.IO_FILE_DESCRIPTOR: {
				IOFileDescriptor ioFileDescriptor = (IOFileDescriptor)theEObject;
				T result = caseIOFileDescriptor(ioFileDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.IO_FILE: {
				IOFile ioFile = (IOFile)theEObject;
				T result = caseIOFile(ioFile);
				if (result == null) result = caseIncompleteElement(ioFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.TALLYING_IN: {
				TallyingIn tallyingIn = (TallyingIn)theEObject;
				T result = caseTallyingIn(tallyingIn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.VARYING_UNTIL_CONDITION: {
				VaryingUntilCondition varyingUntilCondition = (VaryingUntilCondition)theEObject;
				T result = caseVaryingUntilCondition(varyingUntilCondition);
				if (result == null) result = caseConditional(varyingUntilCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.AFTER_UNTIL_CONDITION: {
				AfterUntilCondition afterUntilCondition = (AfterUntilCondition)theEObject;
				T result = caseAfterUntilCondition(afterUntilCondition);
				if (result == null) result = caseVaryingUntilCondition(afterUntilCondition);
				if (result == null) result = caseConditional(afterUntilCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.START: {
				Start start = (Start)theEObject;
				T result = caseStart(start);
				if (result == null) result = caseErrorHandled(start);
				if (result == null) result = caseStatement(start);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatementsPackage.DELETE: {
				Delete delete = (Delete)theEObject;
				T result = caseDelete(delete);
				if (result == null) result = caseStatement(delete);
				if (result == null) result = caseErrorHandled(delete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticStatement(ArithmeticStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdd(Add object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtract(Subtract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiply(Multiply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Divide</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivide(Divide object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerform(Perform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Nested Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Nested Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformNestedStatement(PerformNestedStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformProcedure(PerformProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJump(Jump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNextSentence(NextSentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoTo(GoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoBack(GoBack object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMove(Move object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExit(Exit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditional(Conditional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStop(Stop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay(Display object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccept(Accept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecute(Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Handled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Handled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorHandled(ErrorHandled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetStatement(SetStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Switches</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Switches</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetSwitches(SetSwitches object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Index Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Index Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetIndexName(SetIndexName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseString(org.servicifi.gelato.language.cobol.statements.String object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClose(Close object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cancel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCancel(Cancel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialize(Initialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpen(Open object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Search Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Search Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSearchStatement(SearchStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Serial Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Serial Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSerialSearch(SerialSearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Search</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Search</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinarySearch(BinarySearch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unstring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstring(Unstring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluate(Evaluate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Evaluate Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Evaluate Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalEvaluateCase(NormalEvaluateCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Evaluate Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Evaluate Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherEvaluateCase(OtherEvaluateCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Evaluate Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Evaluate Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvaluateCase(EvaluateCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplace(Replace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntry(Entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inspect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inspect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInspect(Inspect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSet(Set object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRead(Read object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Write</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Write</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWrite(Write object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rewrite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rewrite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRewrite(Rewrite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatus(SwitchStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Procedure Fixed Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Procedure Fixed Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformProcedureFixedTimes(PerformProcedureFixedTimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Until Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformUntilCondition(PerformUntilCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Fixed Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Fixed Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformFixedTimes(PerformFixedTimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Procedure Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Procedure Until Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformProcedureUntilCondition(PerformProcedureUntilCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Nested Statement Fixed Times</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Nested Statement Fixed Times</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformNestedStatementFixedTimes(PerformNestedStatementFixedTimes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Perform Nested Statement Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Perform Nested Statement Until Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformNestedStatementUntilCondition(PerformNestedStatementUntilCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinue(Continue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File IO Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File IO Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileIOStatement(FileIOStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSort(Sort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge(Merge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyDescriptor(KeyDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOStatement(IOStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO File Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOFileDescriptor(IOFileDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOFile(IOFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tallying In</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tallying In</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTallyingIn(TallyingIn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Varying Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Varying Until Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVaryingUntilCondition(VaryingUntilCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Until Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterUntilCondition(AfterUntilCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelete(Delete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incomplete Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incomplete Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncompleteElement(IncompleteElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argumentable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argumentable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentable(Argumentable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParametrizable(Parametrizable object) {
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

} //StatementsSwitch
