/**
 */
package org.servicifi.gelato.language.cobol.statements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.servicifi.gelato.language.cobol.statements.StatementsPackage
 * @generated
 */
public interface StatementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatementsFactory eINSTANCE = org.servicifi.gelato.language.cobol.statements.impl.StatementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add</em>'.
	 * @generated
	 */
	Add createAdd();

	/**
	 * Returns a new object of class '<em>Subtract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Subtract</em>'.
	 * @generated
	 */
	Subtract createSubtract();

	/**
	 * Returns a new object of class '<em>Multiply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiply</em>'.
	 * @generated
	 */
	Multiply createMultiply();

	/**
	 * Returns a new object of class '<em>Divide</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Divide</em>'.
	 * @generated
	 */
	Divide createDivide();

	/**
	 * Returns a new object of class '<em>Perform Nested Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Nested Statement</em>'.
	 * @generated
	 */
	PerformNestedStatement createPerformNestedStatement();

	/**
	 * Returns a new object of class '<em>Perform Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Procedure</em>'.
	 * @generated
	 */
	PerformProcedure createPerformProcedure();

	/**
	 * Returns a new object of class '<em>Next Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next Sentence</em>'.
	 * @generated
	 */
	NextSentence createNextSentence();

	/**
	 * Returns a new object of class '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To</em>'.
	 * @generated
	 */
	GoTo createGoTo();

	/**
	 * Returns a new object of class '<em>Go Back</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Back</em>'.
	 * @generated
	 */
	GoBack createGoBack();

	/**
	 * Returns a new object of class '<em>Move</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move</em>'.
	 * @generated
	 */
	Move createMove();

	/**
	 * Returns a new object of class '<em>Exit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exit</em>'.
	 * @generated
	 */
	Exit createExit();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Stop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop</em>'.
	 * @generated
	 */
	Stop createStop();

	/**
	 * Returns a new object of class '<em>Display</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display</em>'.
	 * @generated
	 */
	Display createDisplay();

	/**
	 * Returns a new object of class '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compute</em>'.
	 * @generated
	 */
	Compute createCompute();

	/**
	 * Returns a new object of class '<em>Accept</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept</em>'.
	 * @generated
	 */
	Accept createAccept();

	/**
	 * Returns a new object of class '<em>Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execute</em>'.
	 * @generated
	 */
	Execute createExecute();

	/**
	 * Returns a new object of class '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Return</em>'.
	 * @generated
	 */
	Return createReturn();

	/**
	 * Returns a new object of class '<em>Set Switches</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Switches</em>'.
	 * @generated
	 */
	SetSwitches createSetSwitches();

	/**
	 * Returns a new object of class '<em>Set Index Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Index Name</em>'.
	 * @generated
	 */
	SetIndexName createSetIndexName();

	/**
	 * Returns a new object of class '<em>String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String</em>'.
	 * @generated
	 */
	String createString();

	/**
	 * Returns a new object of class '<em>Close</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close</em>'.
	 * @generated
	 */
	Close createClose();

	/**
	 * Returns a new object of class '<em>Cancel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cancel</em>'.
	 * @generated
	 */
	Cancel createCancel();

	/**
	 * Returns a new object of class '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call</em>'.
	 * @generated
	 */
	Call createCall();

	/**
	 * Returns a new object of class '<em>Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialize</em>'.
	 * @generated
	 */
	Initialize createInitialize();

	/**
	 * Returns a new object of class '<em>Open</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open</em>'.
	 * @generated
	 */
	Open createOpen();

	/**
	 * Returns a new object of class '<em>Serial Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Serial Search</em>'.
	 * @generated
	 */
	SerialSearch createSerialSearch();

	/**
	 * Returns a new object of class '<em>Binary Search</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Search</em>'.
	 * @generated
	 */
	BinarySearch createBinarySearch();

	/**
	 * Returns a new object of class '<em>Unstring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unstring</em>'.
	 * @generated
	 */
	Unstring createUnstring();

	/**
	 * Returns a new object of class '<em>Evaluate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate</em>'.
	 * @generated
	 */
	Evaluate createEvaluate();

	/**
	 * Returns a new object of class '<em>Normal Evaluate Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Normal Evaluate Case</em>'.
	 * @generated
	 */
	NormalEvaluateCase createNormalEvaluateCase();

	/**
	 * Returns a new object of class '<em>Other Evaluate Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Other Evaluate Case</em>'.
	 * @generated
	 */
	OtherEvaluateCase createOtherEvaluateCase();

	/**
	 * Returns a new object of class '<em>Replace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Replace</em>'.
	 * @generated
	 */
	Replace createReplace();

	/**
	 * Returns a new object of class '<em>Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entry</em>'.
	 * @generated
	 */
	Entry createEntry();

	/**
	 * Returns a new object of class '<em>Inspect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inspect</em>'.
	 * @generated
	 */
	Inspect createInspect();

	/**
	 * Returns a new object of class '<em>Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set</em>'.
	 * @generated
	 */
	Set createSet();

	/**
	 * Returns a new object of class '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read</em>'.
	 * @generated
	 */
	Read createRead();

	/**
	 * Returns a new object of class '<em>Write</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Write</em>'.
	 * @generated
	 */
	Write createWrite();

	/**
	 * Returns a new object of class '<em>Rewrite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rewrite</em>'.
	 * @generated
	 */
	Rewrite createRewrite();

	/**
	 * Returns a new object of class '<em>Switch Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch Status</em>'.
	 * @generated
	 */
	SwitchStatus createSwitchStatus();

	/**
	 * Returns a new object of class '<em>Perform Procedure Fixed Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Procedure Fixed Times</em>'.
	 * @generated
	 */
	PerformProcedureFixedTimes createPerformProcedureFixedTimes();

	/**
	 * Returns a new object of class '<em>Perform Procedure Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Procedure Until Condition</em>'.
	 * @generated
	 */
	PerformProcedureUntilCondition createPerformProcedureUntilCondition();

	/**
	 * Returns a new object of class '<em>Perform Nested Statement Fixed Times</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Nested Statement Fixed Times</em>'.
	 * @generated
	 */
	PerformNestedStatementFixedTimes createPerformNestedStatementFixedTimes();

	/**
	 * Returns a new object of class '<em>Perform Nested Statement Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Perform Nested Statement Until Condition</em>'.
	 * @generated
	 */
	PerformNestedStatementUntilCondition createPerformNestedStatementUntilCondition();

	/**
	 * Returns a new object of class '<em>Continue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continue</em>'.
	 * @generated
	 */
	Continue createContinue();

	/**
	 * Returns a new object of class '<em>Sort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sort</em>'.
	 * @generated
	 */
	Sort createSort();

	/**
	 * Returns a new object of class '<em>Merge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Merge</em>'.
	 * @generated
	 */
	Merge createMerge();

	/**
	 * Returns a new object of class '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Release</em>'.
	 * @generated
	 */
	Release createRelease();

	/**
	 * Returns a new object of class '<em>Key Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Descriptor</em>'.
	 * @generated
	 */
	KeyDescriptor createKeyDescriptor();

	/**
	 * Returns a new object of class '<em>IO File Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO File Descriptor</em>'.
	 * @generated
	 */
	IOFileDescriptor createIOFileDescriptor();

	/**
	 * Returns a new object of class '<em>IO File</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO File</em>'.
	 * @generated
	 */
	IOFile createIOFile();

	/**
	 * Returns a new object of class '<em>Tallying In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tallying In</em>'.
	 * @generated
	 */
	TallyingIn createTallyingIn();

	/**
	 * Returns a new object of class '<em>After Until Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Until Condition</em>'.
	 * @generated
	 */
	AfterUntilCondition createAfterUntilCondition();

	/**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * Returns a new object of class '<em>Delete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delete</em>'.
	 * @generated
	 */
	Delete createDelete();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatementsPackage getStatementsPackage();

} //StatementsFactory
