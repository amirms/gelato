/**
 */
package org.servicifi.gelato.language.cobol.statements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.servicifi.gelato.language.cobol.statements.Accept;
import org.servicifi.gelato.language.cobol.statements.Add;
import org.servicifi.gelato.language.cobol.statements.Adjustings;
import org.servicifi.gelato.language.cobol.statements.AfterUntilCondition;
import org.servicifi.gelato.language.cobol.statements.BinarySearch;
import org.servicifi.gelato.language.cobol.statements.Call;
import org.servicifi.gelato.language.cobol.statements.Cancel;
import org.servicifi.gelato.language.cobol.statements.Close;
import org.servicifi.gelato.language.cobol.statements.Compute;
import org.servicifi.gelato.language.cobol.statements.Condition;
import org.servicifi.gelato.language.cobol.statements.Continue;
import org.servicifi.gelato.language.cobol.statements.Corresponding;
import org.servicifi.gelato.language.cobol.statements.Delete;
import org.servicifi.gelato.language.cobol.statements.Display;
import org.servicifi.gelato.language.cobol.statements.Divide;
import org.servicifi.gelato.language.cobol.statements.EOP;
import org.servicifi.gelato.language.cobol.statements.Entry;
import org.servicifi.gelato.language.cobol.statements.Evaluate;
import org.servicifi.gelato.language.cobol.statements.Execute;
import org.servicifi.gelato.language.cobol.statements.Exit;
import org.servicifi.gelato.language.cobol.statements.ExitLabels;
import org.servicifi.gelato.language.cobol.statements.GoBack;
import org.servicifi.gelato.language.cobol.statements.GoTo;
import org.servicifi.gelato.language.cobol.statements.IOFile;
import org.servicifi.gelato.language.cobol.statements.IOFileDescriptor;
import org.servicifi.gelato.language.cobol.statements.IOTypes;
import org.servicifi.gelato.language.cobol.statements.Initialize;
import org.servicifi.gelato.language.cobol.statements.Inspect;
import org.servicifi.gelato.language.cobol.statements.KeyDescriptor;
import org.servicifi.gelato.language.cobol.statements.Merge;
import org.servicifi.gelato.language.cobol.statements.Move;
import org.servicifi.gelato.language.cobol.statements.Multiply;
import org.servicifi.gelato.language.cobol.statements.NextSentence;
import org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Open;
import org.servicifi.gelato.language.cobol.statements.Orders;
import org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatement;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition;
import org.servicifi.gelato.language.cobol.statements.PerformProcedure;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition;
import org.servicifi.gelato.language.cobol.statements.Read;
import org.servicifi.gelato.language.cobol.statements.Release;
import org.servicifi.gelato.language.cobol.statements.Replace;
import org.servicifi.gelato.language.cobol.statements.Return;
import org.servicifi.gelato.language.cobol.statements.Rewrite;
import org.servicifi.gelato.language.cobol.statements.SerialSearch;
import org.servicifi.gelato.language.cobol.statements.Set;
import org.servicifi.gelato.language.cobol.statements.SetIndexName;
import org.servicifi.gelato.language.cobol.statements.SetSwitches;
import org.servicifi.gelato.language.cobol.statements.Sort;
import org.servicifi.gelato.language.cobol.statements.Start;
import org.servicifi.gelato.language.cobol.statements.StatementsFactory;
import org.servicifi.gelato.language.cobol.statements.StatementsPackage;
import org.servicifi.gelato.language.cobol.statements.Status;
import org.servicifi.gelato.language.cobol.statements.Stop;
import org.servicifi.gelato.language.cobol.statements.Subtract;
import org.servicifi.gelato.language.cobol.statements.SwitchStatus;
import org.servicifi.gelato.language.cobol.statements.TallyingIn;
import org.servicifi.gelato.language.cobol.statements.Unstring;
import org.servicifi.gelato.language.cobol.statements.Write;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatementsFactoryImpl extends EFactoryImpl implements StatementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatementsFactory init() {
		try {
			StatementsFactory theStatementsFactory = (StatementsFactory)EPackage.Registry.INSTANCE.getEFactory(StatementsPackage.eNS_URI);
			if (theStatementsFactory != null) {
				return theStatementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsFactoryImpl() {
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
			case StatementsPackage.ADD: return createAdd();
			case StatementsPackage.SUBTRACT: return createSubtract();
			case StatementsPackage.MULTIPLY: return createMultiply();
			case StatementsPackage.DIVIDE: return createDivide();
			case StatementsPackage.PERFORM_NESTED_STATEMENT: return createPerformNestedStatement();
			case StatementsPackage.PERFORM_PROCEDURE: return createPerformProcedure();
			case StatementsPackage.NEXT_SENTENCE: return createNextSentence();
			case StatementsPackage.GO_TO: return createGoTo();
			case StatementsPackage.GO_BACK: return createGoBack();
			case StatementsPackage.MOVE: return createMove();
			case StatementsPackage.EXIT: return createExit();
			case StatementsPackage.CONDITION: return createCondition();
			case StatementsPackage.STOP: return createStop();
			case StatementsPackage.DISPLAY: return createDisplay();
			case StatementsPackage.COMPUTE: return createCompute();
			case StatementsPackage.ACCEPT: return createAccept();
			case StatementsPackage.EXECUTE: return createExecute();
			case StatementsPackage.RETURN: return createReturn();
			case StatementsPackage.SET_SWITCHES: return createSetSwitches();
			case StatementsPackage.SET_INDEX_NAME: return createSetIndexName();
			case StatementsPackage.STRING: return createString();
			case StatementsPackage.CLOSE: return createClose();
			case StatementsPackage.CANCEL: return createCancel();
			case StatementsPackage.CALL: return createCall();
			case StatementsPackage.INITIALIZE: return createInitialize();
			case StatementsPackage.OPEN: return createOpen();
			case StatementsPackage.SERIAL_SEARCH: return createSerialSearch();
			case StatementsPackage.BINARY_SEARCH: return createBinarySearch();
			case StatementsPackage.UNSTRING: return createUnstring();
			case StatementsPackage.EVALUATE: return createEvaluate();
			case StatementsPackage.NORMAL_EVALUATE_CASE: return createNormalEvaluateCase();
			case StatementsPackage.OTHER_EVALUATE_CASE: return createOtherEvaluateCase();
			case StatementsPackage.REPLACE: return createReplace();
			case StatementsPackage.ENTRY: return createEntry();
			case StatementsPackage.INSPECT: return createInspect();
			case StatementsPackage.SET: return createSet();
			case StatementsPackage.READ: return createRead();
			case StatementsPackage.WRITE: return createWrite();
			case StatementsPackage.REWRITE: return createRewrite();
			case StatementsPackage.SWITCH_STATUS: return createSwitchStatus();
			case StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES: return createPerformProcedureFixedTimes();
			case StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION: return createPerformProcedureUntilCondition();
			case StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES: return createPerformNestedStatementFixedTimes();
			case StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION: return createPerformNestedStatementUntilCondition();
			case StatementsPackage.CONTINUE: return createContinue();
			case StatementsPackage.SORT: return createSort();
			case StatementsPackage.MERGE: return createMerge();
			case StatementsPackage.RELEASE: return createRelease();
			case StatementsPackage.KEY_DESCRIPTOR: return createKeyDescriptor();
			case StatementsPackage.IO_FILE_DESCRIPTOR: return createIOFileDescriptor();
			case StatementsPackage.IO_FILE: return createIOFile();
			case StatementsPackage.TALLYING_IN: return createTallyingIn();
			case StatementsPackage.AFTER_UNTIL_CONDITION: return createAfterUntilCondition();
			case StatementsPackage.START: return createStart();
			case StatementsPackage.DELETE: return createDelete();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case StatementsPackage.EXIT_LABELS:
				return createExitLabelsFromString(eDataType, initialValue);
			case StatementsPackage.ADJUSTINGS:
				return createAdjustingsFromString(eDataType, initialValue);
			case StatementsPackage.STATUS:
				return createStatusFromString(eDataType, initialValue);
			case StatementsPackage.EOP:
				return createEOPFromString(eDataType, initialValue);
			case StatementsPackage.IO_TYPES:
				return createIOTypesFromString(eDataType, initialValue);
			case StatementsPackage.ORDERS:
				return createOrdersFromString(eDataType, initialValue);
			case StatementsPackage.CORRESPONDING:
				return createCorrespondingFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case StatementsPackage.EXIT_LABELS:
				return convertExitLabelsToString(eDataType, instanceValue);
			case StatementsPackage.ADJUSTINGS:
				return convertAdjustingsToString(eDataType, instanceValue);
			case StatementsPackage.STATUS:
				return convertStatusToString(eDataType, instanceValue);
			case StatementsPackage.EOP:
				return convertEOPToString(eDataType, instanceValue);
			case StatementsPackage.IO_TYPES:
				return convertIOTypesToString(eDataType, instanceValue);
			case StatementsPackage.ORDERS:
				return convertOrdersToString(eDataType, instanceValue);
			case StatementsPackage.CORRESPONDING:
				return convertCorrespondingToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Add createAdd() {
		AddImpl add = new AddImpl();
		return add;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subtract createSubtract() {
		SubtractImpl subtract = new SubtractImpl();
		return subtract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiply createMultiply() {
		MultiplyImpl multiply = new MultiplyImpl();
		return multiply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Divide createDivide() {
		DivideImpl divide = new DivideImpl();
		return divide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformNestedStatement createPerformNestedStatement() {
		PerformNestedStatementImpl performNestedStatement = new PerformNestedStatementImpl();
		return performNestedStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformProcedure createPerformProcedure() {
		PerformProcedureImpl performProcedure = new PerformProcedureImpl();
		return performProcedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextSentence createNextSentence() {
		NextSentenceImpl nextSentence = new NextSentenceImpl();
		return nextSentence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTo createGoTo() {
		GoToImpl goTo = new GoToImpl();
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoBack createGoBack() {
		GoBackImpl goBack = new GoBackImpl();
		return goBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exit createExit() {
		ExitImpl exit = new ExitImpl();
		return exit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display createDisplay() {
		DisplayImpl display = new DisplayImpl();
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compute createCompute() {
		ComputeImpl compute = new ComputeImpl();
		return compute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Accept createAccept() {
		AcceptImpl accept = new AcceptImpl();
		return accept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Execute createExecute() {
		ExecuteImpl execute = new ExecuteImpl();
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetSwitches createSetSwitches() {
		SetSwitchesImpl setSwitches = new SetSwitchesImpl();
		return setSwitches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetIndexName createSetIndexName() {
		SetIndexNameImpl setIndexName = new SetIndexNameImpl();
		return setIndexName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.servicifi.gelato.language.cobol.statements.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Close createClose() {
		CloseImpl close = new CloseImpl();
		return close;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cancel createCancel() {
		CancelImpl cancel = new CancelImpl();
		return cancel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initialize createInitialize() {
		InitializeImpl initialize = new InitializeImpl();
		return initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Open createOpen() {
		OpenImpl open = new OpenImpl();
		return open;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SerialSearch createSerialSearch() {
		SerialSearchImpl serialSearch = new SerialSearchImpl();
		return serialSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinarySearch createBinarySearch() {
		BinarySearchImpl binarySearch = new BinarySearchImpl();
		return binarySearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unstring createUnstring() {
		UnstringImpl unstring = new UnstringImpl();
		return unstring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evaluate createEvaluate() {
		EvaluateImpl evaluate = new EvaluateImpl();
		return evaluate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalEvaluateCase createNormalEvaluateCase() {
		NormalEvaluateCaseImpl normalEvaluateCase = new NormalEvaluateCaseImpl();
		return normalEvaluateCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherEvaluateCase createOtherEvaluateCase() {
		OtherEvaluateCaseImpl otherEvaluateCase = new OtherEvaluateCaseImpl();
		return otherEvaluateCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Replace createReplace() {
		ReplaceImpl replace = new ReplaceImpl();
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entry createEntry() {
		EntryImpl entry = new EntryImpl();
		return entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inspect createInspect() {
		InspectImpl inspect = new InspectImpl();
		return inspect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Set createSet() {
		SetImpl set = new SetImpl();
		return set;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Write createWrite() {
		WriteImpl write = new WriteImpl();
		return write;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rewrite createRewrite() {
		RewriteImpl rewrite = new RewriteImpl();
		return rewrite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchStatus createSwitchStatus() {
		SwitchStatusImpl switchStatus = new SwitchStatusImpl();
		return switchStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformProcedureFixedTimes createPerformProcedureFixedTimes() {
		PerformProcedureFixedTimesImpl performProcedureFixedTimes = new PerformProcedureFixedTimesImpl();
		return performProcedureFixedTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformProcedureUntilCondition createPerformProcedureUntilCondition() {
		PerformProcedureUntilConditionImpl performProcedureUntilCondition = new PerformProcedureUntilConditionImpl();
		return performProcedureUntilCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformNestedStatementFixedTimes createPerformNestedStatementFixedTimes() {
		PerformNestedStatementFixedTimesImpl performNestedStatementFixedTimes = new PerformNestedStatementFixedTimesImpl();
		return performNestedStatementFixedTimes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformNestedStatementUntilCondition createPerformNestedStatementUntilCondition() {
		PerformNestedStatementUntilConditionImpl performNestedStatementUntilCondition = new PerformNestedStatementUntilConditionImpl();
		return performNestedStatementUntilCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Continue createContinue() {
		ContinueImpl continue_ = new ContinueImpl();
		return continue_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort createSort() {
		SortImpl sort = new SortImpl();
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merge createMerge() {
		MergeImpl merge = new MergeImpl();
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyDescriptor createKeyDescriptor() {
		KeyDescriptorImpl keyDescriptor = new KeyDescriptorImpl();
		return keyDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOFileDescriptor createIOFileDescriptor() {
		IOFileDescriptorImpl ioFileDescriptor = new IOFileDescriptorImpl();
		return ioFileDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOFile createIOFile() {
		IOFileImpl ioFile = new IOFileImpl();
		return ioFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TallyingIn createTallyingIn() {
		TallyingInImpl tallyingIn = new TallyingInImpl();
		return tallyingIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AfterUntilCondition createAfterUntilCondition() {
		AfterUntilConditionImpl afterUntilCondition = new AfterUntilConditionImpl();
		return afterUntilCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExitLabels createExitLabelsFromString(EDataType eDataType, String initialValue) {
		ExitLabels result = ExitLabels.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExitLabelsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adjustings createAdjustingsFromString(EDataType eDataType, String initialValue) {
		Adjustings result = Adjustings.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustingsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatusFromString(EDataType eDataType, String initialValue) {
		Status result = Status.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOP createEOPFromString(EDataType eDataType, String initialValue) {
		EOP result = EOP.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOPToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOTypes createIOTypesFromString(EDataType eDataType, String initialValue) {
		IOTypes result = IOTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orders createOrdersFromString(EDataType eDataType, String initialValue) {
		Orders result = Orders.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrdersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Corresponding createCorrespondingFromString(EDataType eDataType, String initialValue) {
		Corresponding result = Corresponding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCorrespondingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementsPackage getStatementsPackage() {
		return (StatementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatementsPackage getPackage() {
		return StatementsPackage.eINSTANCE;
	}

} //StatementsFactoryImpl
