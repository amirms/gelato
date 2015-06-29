grammar Jcl;

options {
	superClass = JclANTLRParserBase;
	backtrack = true;
	memoize = true;
}

@lexer::header {
	package org.servicifi.gelato.language.jcl.resource.jcl.mopp;
	
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
	package org.servicifi.gelato.language.jcl.resource.jcl.mopp;
	
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
}

@members{
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTokenResolverFactory();
	
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
	private List<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal> expectedElements = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal>();
	
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
	
	private org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap;
	
	private org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclSyntaxErrorMessageConverter syntaxErrorMessageConverter = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclSyntaxErrorMessageConverter(tokenNames);
	
	@Override
	public void reportError(RecognitionException re) {
		addErrorToResource(syntaxErrorMessageConverter.translateParseError(re));
	}
	
	protected void addErrorToResource(final String errorMessage, final int column, final int line, final int startIndex, final int stopIndex) {
		postParseCommands.add(new org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>() {
			public boolean execute(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource) {
				if (resource == null) {
					// the resource can be null if the parser is used for code completion
					return true;
				}
				resource.addProblem(new org.servicifi.gelato.language.jcl.resource.jcl.IJclProblem() {
					public org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity getSeverity() {
						return org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemSeverity.ERROR;
					}
					public org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType getType() {
						return org.servicifi.gelato.language.jcl.resource.jcl.JclEProblemType.SYNTAX_ERROR;
					}
					public String getMessage() {
						return errorMessage;
					}
					public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	protected void addErrorToResource(org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLocalizedMessage message) {
		if (message == null) {
			return;
		}
		addErrorToResource(message.getMessage(), message.getColumn(), message.getLine(), message.getCharStart(), message.getCharEnd());
	}
	
	public void addExpectedElement(EClass eClass, int[] ids) {
		if (!this.rememberExpectedElements) {
			return;
		}
		int terminalID = ids[0];
		int followSetID = ids[1];
		org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement terminal = org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclFollowSetProvider.TERMINALS[terminalID];
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[] containmentFeatures = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[ids.length - 2];
		for (int i = 2; i < ids.length; i++) {
			containmentFeatures[i - 2] = org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclFollowSetProvider.LINKS[ids[i]];
		}
		org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainmentTrace containmentTrace = new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainmentTrace(eClass, containmentFeatures);
		EObject container = getLastIncompleteElement();
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal expectedElement = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal(container, terminal, followSetID, containmentTrace);
		setPosition(expectedElement, input.index());
		int startIncludingHiddenTokens = expectedElement.getStartIncludingHiddenTokens();
		if (lastStartIncludingHidden >= 0 && lastStartIncludingHidden < startIncludingHiddenTokens && cursorOffset > startIncludingHiddenTokens) {
			// clear list of expected elements
			this.expectedElements.clear();
			this.expectedElementsIndexOfLastCompleteElement = 0;
		}
		lastStartIncludingHidden = startIncludingHiddenTokens;
		this.expectedElements.add(expectedElement);
	}
	
	protected void collectHiddenTokens(EObject element) {
	}
	
	protected void copyLocalizationInfos(final EObject source, final EObject target) {
		if (disableLocationMap) {
			return;
		}
		final org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>() {
			public boolean execute(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource) {
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
		final org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>() {
			public boolean execute(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource) {
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
	protected void setLocalizationEnd(Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>> postParseCommands , final EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		final org.servicifi.gelato.language.jcl.resource.jcl.IJclLocationMap locationMap = this.locationMap;
		if (locationMap == null) {
			// the locationMap can be null if the parser is used for code completion
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>() {
			public boolean execute(org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource resource) {
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclTextParser createInstance(InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new JclParser(new CommonTokenStream(new JclLexer(new ANTLRInputStream(actualInputStream))));
			} else {
				return new JclParser(new CommonTokenStream(new JclLexer(new ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (IOException e) {
			new org.servicifi.gelato.language.jcl.resource.jcl.util.JclRuntimeUtil().logError("Error while creating parser.", e);
			return null;
		}
	}
	
	/**
	 * This default constructor is only used to call createInstance() on it.
	 */
	public JclParser() {
		super(null);
	}
	
	protected EObject doParse() throws RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((JclLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((JclLexer) getTokenStream().getTokenSource()).lexerExceptionPositions = lexerExceptionPositions;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof EClass) {
			EClass type = (EClass) typeObject;
			if (type.getInstanceClass() == org.servicifi.gelato.language.jcl.containers.JobUnit.class) {
				return parse_org_servicifi_gelato_language_jcl_containers_JobUnit();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.jcl.statements.Execute.class) {
				return parse_org_servicifi_gelato_language_jcl_statements_Execute();
			}
		}
		throw new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclUnexpectedContentTypeException(typeObject);
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
			typeObject = options.get(org.servicifi.gelato.language.jcl.resource.jcl.IJclOptions.RESOURCE_CONTENT_TYPE);
		}
		return typeObject;
	}
	
	/**
	 * Implementation that calls {@link #doParse()} and handles the thrown
	 * RecognitionExceptions.
	 */
	public org.servicifi.gelato.language.jcl.resource.jcl.IJclParseResult parse() {
		// Reset parser state
		terminateParsing = false;
		postParseCommands = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource>>();
		org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclParseResult parseResult = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclParseResult();
		if (disableLocationMap) {
			locationMap = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclDevNullLocationMap();
		} else {
			locationMap = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclLocationMap();
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
	
	public List<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal> parseToExpectedElements(EClass type, org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final CommonTokenStream tokenStream = (CommonTokenStream) getTokenStream();
		org.servicifi.gelato.language.jcl.resource.jcl.IJclParseResult result = parse();
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
			for (org.servicifi.gelato.language.jcl.resource.jcl.IJclCommand<org.servicifi.gelato.language.jcl.resource.jcl.IJclTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		Set<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal> currentFollowSet = new LinkedHashSet<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal>();
		List<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal> newFollowSet = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 4;
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
				for (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal nextFollow : newFollowSet) {
					lastTokenIndex = 0;
					setPosition(nextFollow, i);
				}
				newFollowSet.clear();
				// normal tokens do reduce the follow set - only elements that match the token are
				// kept
				for (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal nextFollow : currentFollowSet) {
					if (nextFollow.getTerminal().getTokenNames().contains(getTokenNames()[nextToken.getType()])) {
						// keep this one - it matches
						Collection<org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.servicifi.gelato.language.jcl.resource.jcl.util.JclPair<org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclContainedFeature[]> newFollowerPair : newFollowers) {
							org.servicifi.gelato.language.jcl.resource.jcl.IJclExpectedElement newFollower = newFollowerPair.getLeft();
							EObject container = getLastIncompleteElement();
							org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainmentTrace containmentTrace = new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainmentTrace(null, newFollowerPair.getRight());
							org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal newFollowTerminal = new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal(container, newFollower, followSetID, containmentTrace);
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
		for (org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal nextFollow : newFollowSet) {
			lastTokenIndex = 0;
			setPosition(nextFollow, i);
		}
		return this.expectedElements;
	}
	
	public void setPosition(org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectedTerminal expectedElement, int tokenIndex) {
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
			boolean exists = this.incompleteObjects.remove(object);
			if (!exists) {
			}
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
		addExpectedElement(org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit(), org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectationConstants.EXPECTATIONS[0]);
		expectedElementsIndexOfLastCompleteElement = 0;
	}
	(
		c0 = parse_org_servicifi_gelato_language_jcl_containers_JobUnit{ element = c0; }
	)
	EOF	{
		retrieveLayoutInformation(element, null, null, false);
	}
	
;

parse_org_servicifi_gelato_language_jcl_containers_JobUnit returns [org.servicifi.gelato.language.jcl.containers.JobUnit element = null]
@init{
}
:
	(
		(
			a0_0 = parse_org_servicifi_gelato_language_jcl_statements_Statement			{
				if (terminateParsing) {
					throw new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTerminateParsingException();
				}
				if (element == null) {
					element = org.servicifi.gelato.language.jcl.containers.ContainersFactory.eINSTANCE.createJobUnit();
					startIncompleteElement(element);
				}
				if (a0_0 != null) {
					if (a0_0 != null) {
						Object value = a0_0;
						element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.containers.ContainersPackage.JOB_UNIT__STATEMENTS), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.JCL_0_0_0_0, a0_0, true);
					copyLocalizationInfos(a0_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit(), org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectationConstants.EXPECTATIONS[1]);
	}
	
;

parse_org_servicifi_gelato_language_jcl_statements_Execute returns [org.servicifi.gelato.language.jcl.statements.Execute element = null]
@init{
}
:
	(
		a0 = JCL_WORD		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.jcl.statements.StatementsFactory.eINSTANCE.createExecute();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("JCL_WORD");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.jcl.resource.jcl.IJclTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.EXECUTE__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.EXECUTE__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.JCL_1_0_0_0, resolved, true);
				copyLocalizationInfos((CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectationConstants.EXPECTATIONS[2]);
	}
	
	a1 = 'EXEC' {
		if (element == null) {
			element = org.servicifi.gelato.language.jcl.statements.StatementsFactory.eINSTANCE.createExecute();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.JCL_1_0_0_1, null, true);
		copyLocalizationInfos((CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit(), org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclExpectationConstants.EXPECTATIONS[3]);
	}
	
;

parse_org_servicifi_gelato_language_jcl_statements_Statement returns [org.servicifi.gelato.language.jcl.statements.Statement element = null]
:
	c0 = parse_org_servicifi_gelato_language_jcl_statements_Execute{ element = c0; /* this is a subclass or primitive expression choice */ }
	
;

JCL_WORD:
	((('A'..'Z' | 'a'..'z' | '0'..'9' | '_' | '\\' | '+' | '-'| '*'| '!' | '/' | '~') 
						('['('0'..'9')+']')? )+)
;

