grammar Kernel;

options {
	superClass = KernelANTLRParserBase;
	backtrack = true;
	memoize = false;
}

@lexer::header {
	package org.servicifi.gelato.language.kernel.resource.kernel.mopp;
	
	import java.util.ArrayList;
import java.util.List;
import org.antlr.runtime3_4_0.ANTLRStringStream;
import org.antlr.runtime3_4_0.RecognitionException;
}

@lexer::members {
	public List<RecognitionException> lexerExceptions  = new ArrayList<RecognitionException>();
	public List<Integer> lexerExceptionPositions = new ArrayList<Integer>();
	
	public void reportError(RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionPositions.add(((ANTLRStringStream) input).index());
	}
}
@header{
	package org.servicifi.gelato.language.kernel.resource.kernel.mopp;
	
	import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.antlr.runtime3_4_0.ANTLRInputStream;
import org.antlr.runtime3_4_0.BitSet;
import org.antlr.runtime3_4_0.CommonToken;
import org.antlr.runtime3_4_0.CommonTokenStream;
import org.antlr.runtime3_4_0.IntStream;
import org.antlr.runtime3_4_0.Lexer;
import org.antlr.runtime3_4_0.RecognitionException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
}

@members{
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenResolverFactory();
	
	/**
	 * the index of the last token that was handled by collectHiddenTokens()
	 */
	private int lastPosition;
	
	/**
	 * A flag that indicates whether the parser should remember all expected elements.
	 * This flag is set to true when using the parse for code completion. Otherwise it
	 * is set to false.
	 */
	private boolean rememberExpectedElements = false;
	
	private Object parseToIndexTypeObject;
	private int lastTokenIndex = 0;
	
	/**
	 * A list of expected elements the were collected while parsing the input stream.
	 * This list is only filled if <code>rememberExpectedElements</code> is set to
	 * true.
	 */
	private List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> expectedElements = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected List<RecognitionException> lexerExceptions = Collections.synchronizedList(new ArrayList<RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected List<Integer> lexerExceptionPositions = Collections.synchronizedList(new ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	List<EObject> incompleteObjects = new ArrayList<EObject>();
	
	private int stopIncludingHiddenTokens;
	private int stopExcludingHiddenTokens;
	private int tokenIndexOfLastCompleteElement;
	
	private int expectedElementsIndexOfLastCompleteElement;
	
	/**
	 * The offset indicating the cursor position when the parser is used for code
	 * completion by calling parseToExpectedElements().
	 */
	private int cursorOffset;
	
	/**
	 * The offset of the first hidden token of the last expected element. This offset
	 * is used to discard expected elements, which are not needed for code completion.
	 */
	private int lastStartIncludingHidden;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap;
	
	private org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxErrorMessageConverter syntaxErrorMessageConverter = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxErrorMessageConverter(tokenNames);
	
	@Override
	public void reportError(RecognitionException re) {
		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
	}
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelProblem() {
					public org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity getSeverity() {
						return org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity.ERROR;
					}
					public org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType getType() {
						return org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	protected void addErrorToResource(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLocalizedMessage message) {
		if (message == null) {
			return;
		}
		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
	}
	
	public void addExpectedElement(EClass eClass, int expectationStartIndex, int expectationEndIndex) {
		for (int expectationIndex = expectationStartIndex; expectationIndex <= expectationEndIndex; expectationIndex++) {
			addExpectedElement(eClass, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[expectationIndex]);
		}
	}
	
	public void addExpectedElement(EClass eClass, int expectationIndex) {
		addExpectedElement(eClass, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[expectationIndex]);
	}
	
	public void addExpectedElement(EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement terminal = org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFollowSetProvider.TERMINALS[terminalID];
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[] containmentFeatures = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFollowSetProvider.LINKS[ids[i]];
		}
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainmentTrace containmentTrace = new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainmentTrace(eClass, containmentFeatures);
		EObject container = getLastIncompleteElement();
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedElement = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(EObject element) {
	}
	
	protected void copyLocalizationInfos(final EObject source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final CommonToken source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				if (source == null) {
					return true;
				}
				locationMap.setCharStart(target, source.getStartIndex());
				locationMap.setCharEnd(target, source.getStopIndex());
				locationMap.setColumn(target, source.getCharPositionInLine());
				locationMap.setLine(target, source.getLine());
				return true;
			}
		});
	}
	
	/**
	 * Sets the end character index and the last line for the given object in the
	 * location map.
	 */
	protected void setLocalizationEnd(Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		final org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextParser createInstance(InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new KernelParser(new CommonTokenStream(new KernelLexer(new ANTLRInputStream(actualInputStream))));
			} else {
				return new KernelParser(new CommonTokenStream(new KernelLexer(new ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (IOException e) {
			new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public KernelParser() {
		super(null);
	}
	
	protected EObject doParse() throws RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((KernelLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((KernelLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof EClass) {
			EClass type = (EClass) typeObject;
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.containers.CompilationUnit.class) {
				return parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.dataitems.DataItem.class) {
				return parse_org_servicifi_gelato_language_kernel_dataitems_DataItem();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.procedures.Procedure.class) {
				return parse_org_servicifi_gelato_language_kernel_procedures_Procedure();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.procedures.MainProcedure.class) {
				return parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.WhileLoop.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_WhileLoop();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.Condition.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_Condition();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.Goto.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_Goto();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.Block.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_Block();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.ParallelBlock.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.ExpressionStatement.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.StatementWithException.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_StatementWithException();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.Abort.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_Abort();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.Skip.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_Skip();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.Return.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_Return();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.ProcedureCall.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.parameters.Parameter.class) {
				return parse_org_servicifi_gelato_language_kernel_parameters_Parameter();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.references.ArgumentReference.class) {
				return parse_org_servicifi_gelato_language_kernel_references_ArgumentReference();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.references.EmptyArgument.class) {
				return parse_org_servicifi_gelato_language_kernel_references_EmptyArgument();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.Expression.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_Expression();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.Defines.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_Defines();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.Uses.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_Uses();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.Affects.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_Affects();
			}
		}
		throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(IntStream arg0, RecognitionException arg1, int arg2, BitSet arg3) {
		mismatchedTokenRecoveryTries++;
		return super.getMissingSymbol(arg0, arg1, arg2, arg3);
	}
	
	public Object getParseToIndexTypeObject() {
		return parseToIndexTypeObject;
	}
	
	protected Object getTypeObject() {
		Object typeObject = getParseToIndexTypeObject();
		if (typeObject != null) {
			return typeObject;
		}
		Map<?,?> options = getOptions();
		if (options != null) {
			typeObject = options.get(org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelParseResult parse() {
		// Reset parser state
		terminateParsing = false;
		postParseCommands = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>>();
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelParseResult parseResult = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelParseResult();
		if (disableLocationMap) {
			locationMap = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelDevNullLocationMap();
		} else {
			locationMap = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLocationMap();
		}
		// Run parser
		try {
			EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
				parseResult.setLocationMap(locationMap);
			}
		} catch (RecognitionException re) {
			addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
		} catch (IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (RecognitionException re : lexerExceptions) {
			addErrorToResource(syntaxErrorMessageConverter.translateLexicalError(re, lexerExceptions, lexerExceptionPositions));
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> parseToExpectedElements(EClass type, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelParseResult result = parse();
		for (EObject incompleteObject : incompleteObjects) {
			Lexer lexer = (Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		Set<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> currentFollowSet = new LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal>();
		List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> newFollowSet = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 139;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			CommonToken nextToken = (CommonToken) tokenStream.get(i);
			if (nextToken.getType() < 0) {
				break;
			}
			if (nextToken.getChannel() == 99) {
				// hidden tokens do not reduce the follow set
			} else {
				// now that we have found the next visible token the position for that expected
				// terminals can be set
				for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						Collection<org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]> newFollowerPair : newFollowers) {
							org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement newFollower = newFollowerPair.getLeft();
							EObject container = getLastIncompleteElement();
							org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainmentTrace containmentTrace = new org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainmentTrace(null, newFollowerPair.getRight());
							org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal newFollowTerminal = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal(container, newFollower, followSetID, containmentTrace);
							newFollowSet.add(newFollowTerminal);
							expectedElements.add(newFollowTerminal);
						}
					}
				}
				currentFollowSet.clear();
				currentFollowSet.addAll(newFollowSet);
			}
			followSetID++;
		}
		// after the last token in the stream we must set the position for the elements
		// that were added during the last iteration of the loop
		for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedElement, int tokenIndex) {
		int currentIndex = Math.max(0, tokenIndex);
		for (int index = lastTokenIndex; index < currentIndex; index++) {
			if (index >= input.size()) {
				break;
			}
			CommonToken tokenAtIndex = (CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof EObject) {
			this.incompleteObjects.add((EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			this.incompleteObjects.remove(object);
		}
		if (object instanceof EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 0, 3);
		expectedElementsIndexOfLastCompleteElement = 3;
	}
	(
		c0 = parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit returns [org.servicifi.gelato.language.kernel.containers.CompilationUnit element = null]
@init{
}
:
	(
		(
			(
				a0_0 = parse_org_servicifi_gelato_language_kernel_dataitems_DataItem				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
						startIncompleteElement(element);
					}
					if (a0_0 != null) {
						if (a0_0 != null) {
							Object value = a0_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_0_0_0_0, a0_0, true);
						copyLocalizationInfos(a0_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 4, 7);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 8, 11);
	}
	
	(
		(
			(
				a1_0 = parse_org_servicifi_gelato_language_kernel_procedures_Procedure				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
						startIncompleteElement(element);
					}
					if (a1_0 != null) {
						if (a1_0 != null) {
							Object value = a1_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_2_0_0_0, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 12, 13);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 14, 15);
	}
	
	(
		a2_0 = parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.containers.ContainersFactory.eINSTANCE.createCompilationUnit();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_3, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
	}
	
;

parse_org_servicifi_gelato_language_kernel_dataitems_DataItem returns [org.servicifi.gelato.language.kernel.dataitems.DataItem element = null]
@init{
}
:
	a0 = 'var' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 16);
	}
	
	(
		a1 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
				startIncompleteElement(element);
			}
			if (a1 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a1.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a1).getLine(), ((CommonToken) a1).getCharPositionInLine(), ((CommonToken) a1).getStartIndex(), ((CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 17);
	}
	
	a2 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 18, 21);
	}
	
	|//derived choice rules for sub-classes: 
	
	c0 = parse_org_servicifi_gelato_language_kernel_parameters_Parameter{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_servicifi_gelato_language_kernel_procedures_Procedure returns [org.servicifi.gelato.language.kernel.procedures.Procedure element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 22);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 23);
	}
	
	a2 = 'Procedure' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 24, 25);
	}
	
	(
		(
			(
				a3 = IDENTIFIER				
				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
						startIncompleteElement(element);
					}
					if (a3 != null) {
						org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
						tokenResolver.setOptions(getOptions());
						org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
						tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME), result);
						Object resolvedObject = result.getResolvedToken();
						if (resolvedObject == null) {
							addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_3_0_0_0, resolved, true);
						copyLocalizationInfos((CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 26);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 27);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 28);
		addExpectedElement(null, 29);
	}
	
	(
		(
			(
				a5_0 = parse_org_servicifi_gelato_language_kernel_parameters_Parameter				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_5_0_0_0, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 30, 31);
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_5_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 32);
					}
					
					(
						a7_0 = parse_org_servicifi_gelato_language_kernel_parameters_Parameter						{
							if (terminateParsing) {
								throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
							}
							if (element == null) {
								element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
								startIncompleteElement(element);
							}
							if (a7_0 != null) {
								if (a7_0 != null) {
									Object value = a7_0;
									addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__PARAMETERS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_5_0_0_1_0_0_1, a7_0, true);
								copyLocalizationInfos(a7_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 33, 34);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 35, 36);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 37);
	}
	
	a8 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 38);
	}
	
	a9 = '{' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 39, 51);
		addExpectedElement(null, 52);
	}
	
	(
		(
			(
				a10_0 = parse_org_servicifi_gelato_language_kernel_procedures_Procedure				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
						startIncompleteElement(element);
					}
					if (a10_0 != null) {
						if (a10_0 != null) {
							Object value = a10_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__MEMBERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_8_0_0_1, a10_0, true);
						copyLocalizationInfos(a10_0, element);
					}
				}
				|				a10_1 = parse_org_servicifi_gelato_language_kernel_statements_Statement				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
						startIncompleteElement(element);
					}
					if (a10_1 != null) {
						if (a10_1 != null) {
							Object value = a10_1;
							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__MEMBERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_8_0_0_1, a10_1, true);
						copyLocalizationInfos(a10_1, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 53, 65);
				addExpectedElement(null, 66);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 67, 79);
		addExpectedElement(null, 80);
	}
	
	a11 = '}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_10, null, true);
		copyLocalizationInfos((CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 81, 82);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 83, 95);
		addExpectedElement(null, 96);
	}
	
;

parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure returns [org.servicifi.gelato.language.kernel.procedures.MainProcedure element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 97);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 98);
	}
	
	a2 = 'Procedure' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 99);
	}
	
	a3 = 'main' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 100);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 101);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 102);
	}
	
	a6 = '{' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 103, 114);
		addExpectedElement(null, 115);
	}
	
	(
		(
			(
				a7_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
						startIncompleteElement(element);
					}
					if (a7_0 != null) {
						if (a7_0 != null) {
							Object value = a7_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__MEMBERS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_7_0_0_1, a7_0, true);
						copyLocalizationInfos(a7_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 116, 127);
				addExpectedElement(null, 128);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 129, 140);
		addExpectedElement(null, 141);
	}
	
	a8 = '}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_9, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_WhileLoop returns [org.servicifi.gelato.language.kernel.statements.WhileLoop element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 142);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 143);
	}
	
	a2 = 'while' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 144);
	}
	
	a3 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), 145);
	}
	
	(
		a4_0 = parse_org_servicifi_gelato_language_kernel_expressions_Expression		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 146);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 147);
	}
	
	a6 = 'do' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), 148, 159);
	}
	
	(
		a7_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__STATEMENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_7, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 160);
	}
	
	a8 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_8, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 161, 173);
		addExpectedElement(null, 174);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 175, 186);
		addExpectedElement(null, 187, 190);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 191, 202);
		addExpectedElement(null, 203);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 204, 215);
		addExpectedElement(null, 216);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 217, 228);
		addExpectedElement(null, 229);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Condition returns [org.servicifi.gelato.language.kernel.statements.Condition element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 230);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 231);
	}
	
	a2 = 'if' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 232);
	}
	
	a3 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), 233);
	}
	
	(
		a4_0 = parse_org_servicifi_gelato_language_kernel_expressions_Expression		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__CONDITION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 234);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 235);
	}
	
	a6 = 'then' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), 236, 247);
	}
	
	(
		a7_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
				startIncompleteElement(element);
			}
			if (a7_0 != null) {
				if (a7_0 != null) {
					Object value = a7_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__STATEMENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_8, a7_0, true);
				copyLocalizationInfos(a7_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 248, 249);
	}
	
	(
		(
			a8 = 'else' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_9_0_0_1, null, true);
				copyLocalizationInfos((CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), 250, 261);
			}
			
			(
				a9_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
						startIncompleteElement(element);
					}
					if (a9_0 != null) {
						if (a9_0 != null) {
							Object value = a9_0;
							element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__ELSE_STATEMENT), value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_9_0_0_3, a9_0, true);
						copyLocalizationInfos(a9_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 262);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 263);
	}
	
	a10 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_10, null, true);
		copyLocalizationInfos((CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 264, 276);
		addExpectedElement(null, 277);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 278, 289);
		addExpectedElement(null, 290, 293);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 294, 305);
		addExpectedElement(null, 306);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 307, 318);
		addExpectedElement(null, 319);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 320, 331);
		addExpectedElement(null, 332);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Goto returns [org.servicifi.gelato.language.kernel.statements.Goto element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 333);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 334);
	}
	
	a2 = 'goto' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 335);
	}
	
	(
		a3 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.analysis.framework.commons.LabellableElement proxy = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.analysis.framework.commons.LabellableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getJumpTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_3, proxy, true);
				copyLocalizationInfos((CommonToken) a3, element);
				copyLocalizationInfos((CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 336);
	}
	
	a4 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 337, 349);
		addExpectedElement(null, 350);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 351, 362);
		addExpectedElement(null, 363, 366);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 367, 378);
		addExpectedElement(null, 379);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 380, 391);
		addExpectedElement(null, 392);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 393, 404);
		addExpectedElement(null, 405);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Block returns [org.servicifi.gelato.language.kernel.statements.Block element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 406);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 407);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 408, 419);
		addExpectedElement(null, 420);
	}
	
	(
		(
			a3_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement			{
				if (terminateParsing) {
					throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
				}
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						addObjectToList(element, org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__STATEMENTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_4, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 421, 432);
		addExpectedElement(null, 433);
	}
	
	a4 = '}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 434, 446);
		addExpectedElement(null, 447);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 448, 459);
		addExpectedElement(null, 460, 463);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 464, 475);
		addExpectedElement(null, 476);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 477, 488);
		addExpectedElement(null, 489);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 490, 501);
		addExpectedElement(null, 502);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock returns [org.servicifi.gelato.language.kernel.statements.ParallelBlock element = null]
@init{
}
:
	a0 = '{*' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 503);
	}
	
	a1 = 'order' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 504);
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 505);
	}
	
	(
		(
			a3 = 'l2r' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a3, element);
				// set value of enumeration attribute
				Object value = org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExecutionOrder().getEEnumLiteral(org.servicifi.gelato.language.kernel.statements.ExecutionOrder.L2R_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER), value);
				completedElement(value, false);
			}
			|			a4 = 'r2l' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a4, element);
				// set value of enumeration attribute
				Object value = org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExecutionOrder().getEEnumLiteral(org.servicifi.gelato.language.kernel.statements.ExecutionOrder.R2L_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER), value);
				completedElement(value, false);
			}
			|			a5 = 'interleaved' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_3, null, true);
				copyLocalizationInfos((CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExecutionOrder().getEEnumLiteral(org.servicifi.gelato.language.kernel.statements.ExecutionOrder.INTERLEAVED_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 506, 517);
	}
	
	(
		(
			a8_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement			{
				if (terminateParsing) {
					throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
				}
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
					startIncompleteElement(element);
				}
				if (a8_0 != null) {
					if (a8_0 != null) {
						Object value = a8_0;
						addObjectToList(element, org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__STATEMENTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_5, a8_0, true);
					copyLocalizationInfos(a8_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 518, 529);
		addExpectedElement(null, 530);
	}
	
	a9 = '*}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 531, 543);
		addExpectedElement(null, 544);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 545, 556);
		addExpectedElement(null, 557, 560);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 561, 572);
		addExpectedElement(null, 573);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 574, 585);
		addExpectedElement(null, 586);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 587, 598);
		addExpectedElement(null, 599);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock returns [org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element = null]
@init{
}
:
	a0 = '>' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 600);
	}
	
	a1 = '|' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 601, 612);
	}
	
	(
		(
			(
				a2_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
						startIncompleteElement(element);
					}
					if (a2_0 != null) {
						if (a2_0 != null) {
							Object value = a2_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.statements.StatementsPackage.NON_DETERMINISTIC_BLOCK__STATEMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_2_0_0_0, a2_0, true);
						copyLocalizationInfos(a2_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				// We've found the last token for this rule. The constructed EObject is now
				// complete.
				completedElement(element, true);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 613, 624);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 625, 637);
				addExpectedElement(null, 638);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 639, 650);
				addExpectedElement(null, 651, 654);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 655, 666);
				addExpectedElement(null, 667);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 668, 679);
				addExpectedElement(null, 680, 681);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 682, 693);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 694, 706);
		addExpectedElement(null, 707);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 708, 719);
		addExpectedElement(null, 720, 723);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 724, 735);
		addExpectedElement(null, 736);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 737, 748);
		addExpectedElement(null, 749, 750);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement returns [org.servicifi.gelato.language.kernel.statements.ExpressionStatement element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 751);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), 752);
	}
	
	(
		a2_0 = parse_org_servicifi_gelato_language_kernel_expressions_Expression		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
				startIncompleteElement(element);
			}
			if (a2_0 != null) {
				if (a2_0 != null) {
					Object value = a2_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__EXPRESSION), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 753);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 754, 766);
		addExpectedElement(null, 767);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 768, 779);
		addExpectedElement(null, 780, 783);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 784, 795);
		addExpectedElement(null, 796);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 797, 808);
		addExpectedElement(null, 809);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 810, 821);
		addExpectedElement(null, 822);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_StatementWithException returns [org.servicifi.gelato.language.kernel.statements.StatementWithException element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 823);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 824);
	}
	
	a2 = 'try' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), 825, 836);
	}
	
	(
		a3_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__STATEMENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 837);
	}
	
	a4 = 'with' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_5, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), 838);
	}
	
	(
		(
			a5_0 = parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement			{
				if (terminateParsing) {
					throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
				}
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
					startIncompleteElement(element);
				}
				if (a5_0 != null) {
					if (a5_0 != null) {
						Object value = a5_0;
						addObjectToList(element, org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__EXCEPTION_STATEMENTS, value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_6, a5_0, true);
					copyLocalizationInfos(a5_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), 839);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 840, 852);
		addExpectedElement(null, 853);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 854, 865);
		addExpectedElement(null, 866, 869);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 870, 881);
		addExpectedElement(null, 882);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 883, 894);
		addExpectedElement(null, 895);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 896, 907);
		addExpectedElement(null, 908);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement returns [org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 909);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 910);
	}
	
	a2 = 'exception' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), 911, 922);
	}
	
	(
		a3_0 = parse_org_servicifi_gelato_language_kernel_statements_Statement		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
				startIncompleteElement(element);
			}
			if (a3_0 != null) {
				if (a3_0 != null) {
					Object value = a3_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__STATEMENT), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), 923);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 924, 936);
		addExpectedElement(null, 937);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 938, 949);
		addExpectedElement(null, 950, 953);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 954, 965);
		addExpectedElement(null, 966);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 967, 978);
		addExpectedElement(null, 979);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 980, 991);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Abort returns [org.servicifi.gelato.language.kernel.statements.Abort element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 992);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 993);
	}
	
	a2 = 'abort' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 994);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 995, 1007);
		addExpectedElement(null, 1008);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 1009, 1020);
		addExpectedElement(null, 1021, 1024);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 1025, 1036);
		addExpectedElement(null, 1037);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 1038, 1049);
		addExpectedElement(null, 1050);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 1051, 1062);
		addExpectedElement(null, 1063);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Skip returns [org.servicifi.gelato.language.kernel.statements.Skip element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1064);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1065);
	}
	
	a2 = 'skip' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1066);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 1067, 1079);
		addExpectedElement(null, 1080);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 1081, 1092);
		addExpectedElement(null, 1093, 1096);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 1097, 1108);
		addExpectedElement(null, 1109);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 1110, 1121);
		addExpectedElement(null, 1122);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 1123, 1134);
		addExpectedElement(null, 1135);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Return returns [org.servicifi.gelato.language.kernel.statements.Return element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1136);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1137);
	}
	
	a2 = 'return' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1138);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 1139, 1151);
		addExpectedElement(null, 1152);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 1153, 1164);
		addExpectedElement(null, 1165, 1168);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 1169, 1180);
		addExpectedElement(null, 1181);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 1182, 1193);
		addExpectedElement(null, 1194);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 1195, 1206);
		addExpectedElement(null, 1207);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall returns [org.servicifi.gelato.language.kernel.statements.ProcedureCall element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1208);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1209);
	}
	
	a2 = 'call' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1210);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_3, proxy, true);
				copyLocalizationInfos((CommonToken) a3, element);
				copyLocalizationInfos((CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1211);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), 1212, 1213);
		addExpectedElement(null, 1214);
	}
	
	(
		(
			(
				a5_0 = parse_org_servicifi_gelato_language_kernel_references_Argument				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
						startIncompleteElement(element);
					}
					if (a5_0 != null) {
						if (a5_0 != null) {
							Object value = a5_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_5_0_0_0, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 1215, 1216);
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_5_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), 1217, 1218);
					}
					
					(
						a7_0 = parse_org_servicifi_gelato_language_kernel_references_Argument						{
							if (terminateParsing) {
								throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
							}
							if (element == null) {
								element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
								startIncompleteElement(element);
							}
							if (a7_0 != null) {
								if (a7_0 != null) {
									Object value = a7_0;
									addObjectToList(element, org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__ARGUMENTS, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_5_0_0_1_0_0_1, a7_0, true);
								copyLocalizationInfos(a7_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 1219, 1220);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 1221, 1222);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 1223);
	}
	
	a8 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_6, null, true);
		copyLocalizationInfos((CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1224);
	}
	
	a9 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_7, null, true);
		copyLocalizationInfos((CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 1225, 1237);
		addExpectedElement(null, 1238);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 1239, 1250);
		addExpectedElement(null, 1251, 1254);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 1255, 1266);
		addExpectedElement(null, 1267);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 1268, 1279);
		addExpectedElement(null, 1280);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 1281, 1292);
		addExpectedElement(null, 1293);
	}
	
;

parse_org_servicifi_gelato_language_kernel_parameters_Parameter returns [org.servicifi.gelato.language.kernel.parameters.Parameter element = null]
@init{
}
:
	(
		(
			a0 = 'ref' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.parameters.ParametersFactory.eINSTANCE.createParameter();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_0, true, true);
				copyLocalizationInfos((CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__BY_REFERENCE), value);
				completedElement(value, false);
			}
			|			a1 = 'val' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.parameters.ParametersFactory.eINSTANCE.createParameter();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_0, false, true);
				copyLocalizationInfos((CommonToken)a1, element);
				// set value of boolean attribute
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__BY_REFERENCE), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1294);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.parameters.ParametersFactory.eINSTANCE.createParameter();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_1, resolved, true);
				copyLocalizationInfos((CommonToken) a3, element);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 1295, 1298);
		addExpectedElement(null, 1299, 1300);
	}
	
;

parse_org_servicifi_gelato_language_kernel_references_ArgumentReference returns [org.servicifi.gelato.language.kernel.references.ArgumentReference element = null]
@init{
}
:
	(
		a0 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createArgumentReference();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT_REFERENCE__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT_REFERENCE__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT_REFERENCE__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_18_0_0_0, proxy, true);
				copyLocalizationInfos((CommonToken) a0, element);
				copyLocalizationInfos((CommonToken) a0, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1301, 1302);
	}
	
;

parse_org_servicifi_gelato_language_kernel_references_EmptyArgument returns [org.servicifi.gelato.language.kernel.references.EmptyArgument element = null]
@init{
}
:
	a0 = 'none' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createEmptyArgument();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1303, 1304);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_Expression returns [org.servicifi.gelato.language.kernel.expressions.Expression element = null]
@init{
}
:
	(
		a0 = CHARACTER_LITERAL		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.Double resolved = (java.lang.Double) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1305);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1306);
	}
	
	a2 = '[' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_2, null, true);
		copyLocalizationInfos((CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), 1307, 1309);
		addExpectedElement(null, 1310);
	}
	
	(
		(
			(
				a3_0 = parse_org_servicifi_gelato_language_kernel_expressions_SubExpression				{
					if (terminateParsing) {
						throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
					}
					if (element == null) {
						element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
						startIncompleteElement(element);
					}
					if (a3_0 != null) {
						if (a3_0 != null) {
							Object value = a3_0;
							addObjectToList(element, org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN, value);
							completedElement(value, true);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_3_0_0_0, a3_0, true);
						copyLocalizationInfos(a3_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, 1311, 1312);
			}
			
			(
				(
					a4 = ';' {
						if (element == null) {
							element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_3_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), 1313, 1315);
					}
					
					(
						a5_0 = parse_org_servicifi_gelato_language_kernel_expressions_SubExpression						{
							if (terminateParsing) {
								throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
							}
							if (element == null) {
								element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
								startIncompleteElement(element);
							}
							if (a5_0 != null) {
								if (a5_0 != null) {
									Object value = a5_0;
									addObjectToList(element, org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__CHILDREN, value);
									completedElement(value, true);
								}
								collectHiddenTokens(element);
								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_3_0_0_1_0_0_1, a5_0, true);
								copyLocalizationInfos(a5_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, 1316, 1317);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, 1318, 1319);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, 1320);
	}
	
	a6 = ']' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_4, null, true);
		copyLocalizationInfos((CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1321, 1323);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_Defines returns [org.servicifi.gelato.language.kernel.expressions.Defines element = null]
@init{
}
:
	a0 = 'defines' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1324);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1325);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_2, proxy, true);
				copyLocalizationInfos((CommonToken) a2, element);
				copyLocalizationInfos((CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1326);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1327, 1328);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_Uses returns [org.servicifi.gelato.language.kernel.expressions.Uses element = null]
@init{
}
:
	a0 = 'uses' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1329);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1330);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_2, proxy, true);
				copyLocalizationInfos((CommonToken) a2, element);
				copyLocalizationInfos((CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1331);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1332, 1333);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_Affects returns [org.servicifi.gelato.language.kernel.expressions.Affects element = null]
@init{
}
:
	a0 = 'affects' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_0, null, true);
		copyLocalizationInfos((CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1334);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, 1335);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_2, proxy, true);
				copyLocalizationInfos((CommonToken) a2, element);
				copyLocalizationInfos((CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, 1336);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_3, null, true);
		copyLocalizationInfos((CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		// We've found the last token for this rule. The constructed EObject is now
		// complete.
		completedElement(element, true);
		addExpectedElement(null, 1337, 1338);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_Statement returns [org.servicifi.gelato.language.kernel.statements.Statement element = null]
:
	c0 = parse_org_servicifi_gelato_language_kernel_statements_WhileLoop{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_servicifi_gelato_language_kernel_statements_Condition{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_servicifi_gelato_language_kernel_statements_Goto{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_servicifi_gelato_language_kernel_statements_Block{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock{ element = c5; /* this is a subclass or primitive expression choice */ }
	|	c6 = parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_servicifi_gelato_language_kernel_statements_StatementWithException{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_servicifi_gelato_language_kernel_statements_Abort{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_servicifi_gelato_language_kernel_statements_Skip{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_org_servicifi_gelato_language_kernel_statements_Return{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall{ element = c11; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_servicifi_gelato_language_kernel_references_Argument returns [org.servicifi.gelato.language.kernel.references.Argument element = null]
:
	c0 = parse_org_servicifi_gelato_language_kernel_references_ArgumentReference{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_servicifi_gelato_language_kernel_references_EmptyArgument{ element = c1; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_servicifi_gelato_language_kernel_expressions_SubExpression returns [org.servicifi.gelato.language.kernel.expressions.SubExpression element = null]
:
	c0 = parse_org_servicifi_gelato_language_kernel_expressions_Defines{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_servicifi_gelato_language_kernel_expressions_Uses{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_servicifi_gelato_language_kernel_expressions_Affects{ element = c2; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))* )
	{ _channel = 99; }
;
CHARACTER_LITERAL:
	(('0'..'9')+('.'('0'..'9')+)?)
;
IDENTIFIER:
	(('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z')|('0'..'9'))*)
;
WHITESPACE:
	((' '|'\t'|'\f'|'\r'|'\n')+)
	{ _channel = 99; }
;

