grammar Kernel;

options {
	superClass = KernelANTLRParserBase;
	backtrack = true;
	memoize = false;
}

@lexer::header {
	package org.servicifi.gelato.language.kernel.resource.kernel.mopp;
}

@lexer::members {
	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
	
	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
		lexerExceptions.add(e);
		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
	}
}
@header{
	package org.servicifi.gelato.language.kernel.resource.kernel.mopp;
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
	private java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> expectedElements = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal>();
	
	private int mismatchedTokenRecoveryTries = 0;
	/**
	 * A helper list to allow a lexer to pass errors to its parser
	 */
	protected java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions = java.util.Collections.synchronizedList(new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>());
	
	/**
	 * Another helper list to allow a lexer to pass positions of errors to its parser
	 */
	protected java.util.List<Integer> lexerExceptionsPosition = java.util.Collections.synchronizedList(new java.util.ArrayList<Integer>());
	
	/**
	 * A stack for incomplete objects. This stack is used filled when the parser is
	 * used for code completion. Whenever the parser starts to read an object it is
	 * pushed on the stack. Once the element was parser completely it is popped from
	 * the stack.
	 */
	java.util.List<org.eclipse.emf.ecore.EObject> incompleteObjects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
	
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
					public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> getQuickFixes() {
						return null;
					}
				}, column, line, startIndex, stopIndex);
				return true;
			}
		});
	}
	
	public void addExpectedElement(org.eclipse.emf.ecore.EClass eClass, int[] ids) {
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
		org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedElement = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal(container, terminal, followSetID, containmentTrace);
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
	
	protected void collectHiddenTokens(org.eclipse.emf.ecore.EObject element) {
	}
	
	protected void copyLocalizationInfos(final org.eclipse.emf.ecore.EObject source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharStart(target, locationMap.getCharStart(source));
				locationMap.setCharEnd(target, locationMap.getCharEnd(source));
				locationMap.setColumn(target, locationMap.getColumn(source));
				locationMap.setLine(target, locationMap.getLine(source));
				return true;
			}
		});
	}
	
	protected void copyLocalizationInfos(final org.antlr.runtime3_4_0.CommonToken source, final org.eclipse.emf.ecore.EObject target) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
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
	protected void setLocalizationEnd(java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>> postParseCommands , final org.eclipse.emf.ecore.EObject object, final int endChar, final int endLine) {
		if (disableLocationMap) {
			return;
		}
		postParseCommands.add(new org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>() {
			public boolean execute(org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelLocationMap locationMap = resource.getLocationMap();
				if (locationMap == null) {
					// the locationMap can be null if the parser is used for code completion
					return true;
				}
				locationMap.setCharEnd(object, endChar);
				locationMap.setLine(object, endLine);
				return true;
			}
		});
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextParser createInstance(java.io.InputStream actualInputStream, String encoding) {
		try {
			if (encoding == null) {
				return new KernelParser(new org.antlr.runtime3_4_0.CommonTokenStream(new KernelLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream))));
			} else {
				return new KernelParser(new org.antlr.runtime3_4_0.CommonTokenStream(new KernelLexer(new org.antlr.runtime3_4_0.ANTLRInputStream(actualInputStream, encoding))));
			}
		} catch (java.io.IOException e) {
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
	
	protected org.eclipse.emf.ecore.EObject doParse() throws org.antlr.runtime3_4_0.RecognitionException {
		this.lastPosition = 0;
		// required because the lexer class can not be subclassed
		((KernelLexer) getTokenStream().getTokenSource()).lexerExceptions = lexerExceptions;
		((KernelLexer) getTokenStream().getTokenSource()).lexerExceptionsPosition = lexerExceptionsPosition;
		Object typeObject = getTypeObject();
		if (typeObject == null) {
			return start();
		} else if (typeObject instanceof org.eclipse.emf.ecore.EClass) {
			org.eclipse.emf.ecore.EClass type = (org.eclipse.emf.ecore.EClass) typeObject;
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
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.statements.AssignmentStatement.class) {
				return parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement();
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
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.references.Argument.class) {
				return parse_org_servicifi_gelato_language_kernel_references_Argument();
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
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.PostDefines.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_PostDefines();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.PreUses.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_PreUses();
			}
			if (type.getInstanceClass() == org.servicifi.gelato.language.kernel.expressions.PostAffects.class) {
				return parse_org_servicifi_gelato_language_kernel_expressions_PostAffects();
			}
		}
		throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelUnexpectedContentTypeException(typeObject);
	}
	
	public int getMismatchedTokenRecoveryTries() {
		return mismatchedTokenRecoveryTries;
	}
	
	public Object getMissingSymbol(org.antlr.runtime3_4_0.IntStream arg0, org.antlr.runtime3_4_0.RecognitionException arg1, int arg2, org.antlr.runtime3_4_0.BitSet arg3) {
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
		java.util.Map<?,?> options = getOptions();
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
		terminateParsing = false;
		postParseCommands = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource>>();
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelParseResult parseResult = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelParseResult();
		try {
			org.eclipse.emf.ecore.EObject result =  doParse();
			if (lexerExceptions.isEmpty()) {
				parseResult.setRoot(result);
			}
		} catch (org.antlr.runtime3_4_0.RecognitionException re) {
			reportError(re);
		} catch (java.lang.IllegalArgumentException iae) {
			if ("The 'no null' constraint is violated".equals(iae.getMessage())) {
				// can be caused if a null is set on EMF models where not allowed. this will just
				// happen if other errors occurred before
			} else {
				iae.printStackTrace();
			}
		}
		for (org.antlr.runtime3_4_0.RecognitionException re : lexerExceptions) {
			reportLexicalError(re);
		}
		parseResult.getPostParseCommands().addAll(postParseCommands);
		return parseResult;
	}
	
	public java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> parseToExpectedElements(org.eclipse.emf.ecore.EClass type, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource dummyResource, int cursorOffset) {
		this.rememberExpectedElements = true;
		this.parseToIndexTypeObject = type;
		this.cursorOffset = cursorOffset;
		this.lastStartIncludingHidden = -1;
		final org.antlr.runtime3_4_0.CommonTokenStream tokenStream = (org.antlr.runtime3_4_0.CommonTokenStream) getTokenStream();
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelParseResult result = parse();
		for (org.eclipse.emf.ecore.EObject incompleteObject : incompleteObjects) {
			org.antlr.runtime3_4_0.Lexer lexer = (org.antlr.runtime3_4_0.Lexer) tokenStream.getTokenSource();
			int endChar = lexer.getCharIndex();
			int endLine = lexer.getLine();
			setLocalizationEnd(result.getPostParseCommands(), incompleteObject, endChar, endLine);
		}
		if (result != null) {
			org.eclipse.emf.ecore.EObject root = result.getRoot();
			if (root != null) {
				dummyResource.getContentsInternal().add(root);
			}
			for (org.servicifi.gelato.language.kernel.resource.kernel.IKernelCommand<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource> command : result.getPostParseCommands()) {
				command.execute(dummyResource);
			}
		}
		// remove all expected elements that were added after the last complete element
		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
		int lastFollowSetID = expectedElements.get(expectedElementsIndexOfLastCompleteElement).getFollowSetID();
		java.util.Set<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> currentFollowSet = new java.util.LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal>();
		java.util.List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal> newFollowSet = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal>();
		for (int i = expectedElementsIndexOfLastCompleteElement; i >= 0; i--) {
			org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectedTerminal expectedElementI = expectedElements.get(i);
			if (expectedElementI.getFollowSetID() == lastFollowSetID) {
				currentFollowSet.add(expectedElementI);
			} else {
				break;
			}
		}
		int followSetID = 157;
		int i;
		for (i = tokenIndexOfLastCompleteElement; i < tokenStream.size(); i++) {
			org.antlr.runtime3_4_0.CommonToken nextToken = (org.antlr.runtime3_4_0.CommonToken) tokenStream.get(i);
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
						java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]>> newFollowers = nextFollow.getTerminal().getFollowers();
						for (org.servicifi.gelato.language.kernel.resource.kernel.util.KernelPair<org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContainedFeature[]> newFollowerPair : newFollowers) {
							org.servicifi.gelato.language.kernel.resource.kernel.IKernelExpectedElement newFollower = newFollowerPair.getLeft();
							org.eclipse.emf.ecore.EObject container = getLastIncompleteElement();
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
			org.antlr.runtime3_4_0.CommonToken tokenAtIndex = (org.antlr.runtime3_4_0.CommonToken) input.get(index);
			stopIncludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			if (tokenAtIndex.getChannel() != 99 && !anonymousTokens.contains(tokenAtIndex)) {
				stopExcludingHiddenTokens = tokenAtIndex.getStopIndex() + 1;
			}
		}
		lastTokenIndex = Math.max(0, currentIndex);
		expectedElement.setPosition(stopExcludingHiddenTokens, stopIncludingHiddenTokens);
	}
	
	public Object recoverFromMismatchedToken(org.antlr.runtime3_4_0.IntStream input, int ttype, org.antlr.runtime3_4_0.BitSet follow) throws org.antlr.runtime3_4_0.RecognitionException {
		if (!rememberExpectedElements) {
			return super.recoverFromMismatchedToken(input, ttype, follow);
		} else {
			return null;
		}
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public void reportError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			String expectedTokenName = formatTokenName(mte.expecting);
			String actualTokenName = formatTokenName(e.token.getType());
			message = "Syntax error on token \"" + e.token.getText() + " (" + actualTokenName + ")\", \"" + expectedTokenName + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
			String expectedTokenName = formatTokenName(mtne.expecting);
			message = "mismatched tree node: " + "xxx" + "; tokenName " + expectedTokenName;
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", check following tokens";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			message = "Syntax error on token \"" + e.token.getText() + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched token: " + e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched token: " +  e.token + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" +  fpe.predicateText + "}?";
		}
		// the resource may be null if the parser is used for code completion
		final String finalMessage = message;
		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
			final org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
			addErrorToResource(finalMessage, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			addErrorToResource(finalMessage, e.token.getCharPositionInLine(), e.token.getLine(), 1, 5);
		}
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public void reportLexicalError(final org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = "";
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			message = "Syntax error on token \"" + ((char) e.c) + "\", \"" + (char) mte.expecting + "\" expected";
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + ((char) e.c) + "\", delete this token";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			org.antlr.runtime3_4_0.EarlyExitException eee = (org.antlr.runtime3_4_0.EarlyExitException) e;
			message = "required (...)+ loop (decision=" + eee.decisionNumber + ") did not match anything; on line " + e.line + ":" + e.charPositionInLine + " char=" + ((char) e.c) + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
			org.antlr.runtime3_4_0.MismatchedRangeException mre = (org.antlr.runtime3_4_0.MismatchedRangeException) e;
			message = "mismatched char: '" + ((char) e.c) + "' on line " + e.line + ":" + e.charPositionInLine + "; expecting set '" + (char) mre.a + "'..'" + (char) mre.b + "'";
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "rule " + fpe.ruleName + " failed predicate: {" + fpe.predicateText + "}?";
		}
		addErrorToResource(message, e.charPositionInLine, e.line, lexerExceptionsPosition.get(lexerExceptions.indexOf(e)), lexerExceptionsPosition.get(lexerExceptions.indexOf(e)));
	}
	
	private void startIncompleteElement(Object object) {
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.incompleteObjects.add((org.eclipse.emf.ecore.EObject) object);
		}
	}
	
	private void completedElement(Object object, boolean isContainment) {
		if (isContainment && !this.incompleteObjects.isEmpty()) {
			boolean exists = this.incompleteObjects.remove(object);
			if (!exists) {
			}
		}
		if (object instanceof org.eclipse.emf.ecore.EObject) {
			this.tokenIndexOfLastCompleteElement = getTokenStream().index();
			this.expectedElementsIndexOfLastCompleteElement = expectedElements.size() - 1;
		}
	}
	
	private org.eclipse.emf.ecore.EObject getLastIncompleteElement() {
		if (incompleteObjects.isEmpty()) {
			return null;
		}
		return incompleteObjects.get(incompleteObjects.size() - 1);
	}
	
}

start returns [ org.eclipse.emf.ecore.EObject element = null]
:
	{
		// follow set for start rule(s)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[0]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[1]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[2]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[3]);
		expectedElementsIndexOfLastCompleteElement = 0;
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
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[4]);
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[5]);
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[6]);
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[7]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[8]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[9]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[10]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[11]);
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
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_1_0_0_0, a1_0, true);
						copyLocalizationInfos(a1_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[12]);
				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[13]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[14]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[15]);
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
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
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
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[16]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a1).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a1).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.dataitems.DataitemsPackage.DATA_ITEM__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_1, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a1, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[17]);
	}
	
	a2 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[18]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[19]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[20]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[21]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[22]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[23]);
	}
	
	a2 = 'Procedure' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[24]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[25]);
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
							addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
						}
						java.lang.String resolved = (java.lang.String) resolvedObject;
						if (resolved != null) {
							Object value = resolved;
							element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.PROCEDURE__NAME), value);
							completedElement(value, false);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_3_0_0_0, resolved, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[26]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[27]);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[28]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[29]);
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
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[30]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[31]);
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
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[32]);
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
						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[33]);
						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[34]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[35]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[36]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[37]);
	}
	
	a8 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[38]);
	}
	
	a9 = '{' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[39]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[40]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[41]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[42]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[43]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[44]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[45]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[46]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[47]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[48]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[49]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[50]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[51]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[52]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[53]);
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
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[54]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[55]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[56]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[57]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[58]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[59]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[60]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[61]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[62]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[63]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[64]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[65]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[66]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[67]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[68]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[69]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[70]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[71]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[72]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[73]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[74]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[75]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[76]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[77]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[78]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[79]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[80]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[81]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[82]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[83]);
	}
	
	a11 = '}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[84]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[85]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[86]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[87]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[88]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[89]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[90]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[91]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[92]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[93]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[94]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[95]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[96]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[97]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[98]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[99]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[100]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[101]);
	}
	
	a2 = 'Procedure' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[102]);
	}
	
	a3 = 'main' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[103]);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[104]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[105]);
	}
	
	a6 = '{' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[106]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[107]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[108]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[109]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[110]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[111]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[112]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[113]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[114]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[115]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[116]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[117]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[118]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[119]);
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
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[120]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[121]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[122]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[123]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[124]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[125]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[126]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[127]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[128]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[129]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[130]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[131]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[132]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[133]);
			}
			
		)
		
	)*	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[134]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[135]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[136]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[137]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[138]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[139]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[140]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[141]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[142]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[143]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[144]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[145]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[146]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[147]);
	}
	
	a8 = '}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_9, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.WHILE_LOOP__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[148]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[149]);
	}
	
	a2 = 'while' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[150]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[151]);
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
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[152]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[153]);
	}
	
	a6 = 'do' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[154]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[155]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[156]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[157]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[158]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[159]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[160]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[161]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[162]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[163]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[164]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[165]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[166]);
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
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[167]);
	}
	
	a8 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_8, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[168]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[169]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[170]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[171]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[172]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[173]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[174]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[175]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[176]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[177]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[178]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[179]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[180]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[181]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[182]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[183]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[184]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[185]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[186]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[187]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[188]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[189]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.CONDITION__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[190]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[191]);
	}
	
	a2 = 'if' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[192]);
	}
	
	a3 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[193]);
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
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[194]);
	}
	
	a5 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[195]);
	}
	
	a6 = 'then' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[196]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[197]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[198]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[199]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[200]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[201]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[202]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[203]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[204]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[205]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[206]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[207]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[208]);
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
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[209]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[210]);
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
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
			}
			{
				// expected elements (follow set)
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[211]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[212]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[213]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[214]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[215]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[216]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[217]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[218]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[219]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[220]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[221]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[222]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[223]);
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
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[224]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[225]);
	}
	
	a10 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_10, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[226]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[227]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[228]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[229]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[230]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[231]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[232]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[233]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[234]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[235]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[236]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[237]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[238]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[239]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[240]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[241]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[242]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[243]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[244]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[245]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[246]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[247]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[248]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[249]);
	}
	
	a2 = 'goto' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[250]);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.commons.LabellableElement proxy = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.language.kernel.commons.LabellableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getJumpTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[251]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[252]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[253]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[254]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[255]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[256]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[257]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[258]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[259]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[260]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[261]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[262]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[263]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[264]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[265]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[266]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[267]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[268]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[269]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[270]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[271]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[272]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[273]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.BLOCK__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[274]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[275]);
	}
	
	a2 = '{' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[276]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[277]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[278]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[279]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[280]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[281]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[282]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[283]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[284]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[285]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[286]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[287]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[288]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[289]);
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
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[290]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[291]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[292]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[293]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[294]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[295]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[296]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[297]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[298]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[299]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[300]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[301]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[302]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[303]);
	}
	
	a4 = '}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[304]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[305]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[306]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[307]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[308]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[309]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[310]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[311]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[312]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[313]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[314]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[315]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[316]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[317]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[318]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[319]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[320]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[321]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[322]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[323]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[324]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[325]);
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
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[326]);
	}
	
	a1 = 'order' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[327]);
	}
	
	a2 = '=' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[328]);
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
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
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
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
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
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
				// set value of enumeration attribute
				Object value = org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExecutionOrder().getEEnumLiteral(org.servicifi.gelato.language.kernel.statements.ExecutionOrder.INTERLEAVED_VALUE).getInstance();
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PARALLEL_BLOCK__ORDER), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[329]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[330]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[331]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[332]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[333]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[334]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[335]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[336]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[337]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[338]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[339]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[340]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[341]);
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
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[342]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[343]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[344]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[345]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[346]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[347]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[348]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[349]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[350]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[351]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[352]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[353]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[354]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[355]);
	}
	
	a9 = '*}' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[356]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[357]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[358]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[359]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[360]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[361]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[362]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[363]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[364]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[365]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[366]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[367]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[368]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[369]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[370]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[371]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[372]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[373]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[374]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[375]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[376]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[377]);
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
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[378]);
	}
	
	a1 = '|' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[379]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[380]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[381]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[382]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[383]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[384]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[385]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[386]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[387]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[388]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[389]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[390]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[391]);
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
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[392]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[393]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[394]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[395]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[396]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[397]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[398]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[399]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[400]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[401]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[402]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[403]);
				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[404]);
				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[405]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[406]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[407]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[408]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[409]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[410]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[411]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[412]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[413]);
			}
			
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[414]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[415]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[416]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[417]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[418]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[419]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[420]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[421]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[422]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[423]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[424]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[425]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[426]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[427]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[428]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[429]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[430]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[431]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[432]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[433]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[434]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[435]);
	}
	
;

parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement returns [org.servicifi.gelato.language.kernel.statements.AssignmentStatement element = null]
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
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("CHARACTER_LITERAL");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[436]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[437]);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[438]);
	}
	
	a3 = ':=' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[439]);
	}
	
	(
		a4_0 = parse_org_servicifi_gelato_language_kernel_expressions_Expression		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
				startIncompleteElement(element);
			}
			if (a4_0 != null) {
				if (a4_0 != null) {
					Object value = a4_0;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__VALUE), value);
					completedElement(value, true);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_4, a4_0, true);
				copyLocalizationInfos(a4_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[440]);
	}
	
	a5 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[441]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[442]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[443]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[444]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[445]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[446]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[447]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[448]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[449]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[450]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[451]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[452]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[453]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[454]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[455]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[456]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[457]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[458]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[459]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[460]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[461]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[462]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[463]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[464]);
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
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_2, a2_0, true);
				copyLocalizationInfos(a2_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[465]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[466]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[467]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[468]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[469]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[470]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[471]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[472]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[473]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[474]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[475]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[476]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[477]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[478]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[479]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[480]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[481]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[482]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[483]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[484]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[485]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[486]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[487]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[488]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[489]);
	}
	
	a2 = 'try' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[490]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[491]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[492]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[493]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[494]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[495]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[496]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[497]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[498]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[499]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[500]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[501]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[502]);
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
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[503]);
	}
	
	a4 = 'with' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_5, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[504]);
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
					retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_6, a5_0, true);
					copyLocalizationInfos(a5_0, element);
				}
			}
		)
		
	)+	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[505]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[506]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[507]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[508]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[509]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[510]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[511]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[512]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[513]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[514]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[515]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[516]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[517]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[518]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[519]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[520]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[521]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[522]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[523]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[524]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[525]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[526]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[527]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[528]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[529]);
	}
	
	a2 = 'exception' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[530]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[531]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[532]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[533]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[534]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[535]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[536]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[537]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[538]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[539]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[540]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[541]);
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[542]);
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
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_3, a3_0, true);
				copyLocalizationInfos(a3_0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[543]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[544]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[545]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[546]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[547]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[548]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[549]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[550]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[551]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[552]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[553]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[554]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[555]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[556]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[557]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[558]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[559]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[560]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[561]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[562]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[563]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[564]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[565]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[566]);
	}
	
	a2 = 'abort' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[567]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[568]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[569]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[570]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[571]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[572]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[573]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[574]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[575]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[576]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[577]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[578]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[579]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[580]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[581]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[582]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[583]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[584]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[585]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[586]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[587]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[588]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[589]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[590]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[591]);
	}
	
	a2 = 'skip' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[592]);
	}
	
	a3 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[593]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[594]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[595]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[596]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[597]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[598]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[599]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[600]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[601]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[602]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[603]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[604]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[605]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[606]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[607]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[608]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[609]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[610]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[611]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[612]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[613]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[614]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[615]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[616]);
	}
	
	a2 = 'return' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getReturn(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[617]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[618]);
	}
	
	(
		(
			a3_0 = parse_org_servicifi_gelato_language_kernel_expressions_Expression			{
				if (terminateParsing) {
					throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
				}
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
					startIncompleteElement(element);
				}
				if (a3_0 != null) {
					if (a3_0 != null) {
						Object value = a3_0;
						element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.RETURN__RETURN_VALUE), value);
						completedElement(value, true);
					}
					collectHiddenTokens(element);
					retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_3, a3_0, true);
					copyLocalizationInfos(a3_0, element);
				}
			}
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[619]);
	}
	
	a4 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[620]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[621]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[622]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[623]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[624]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[625]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[626]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[627]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[628]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[629]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[630]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[631]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[632]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[633]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[634]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[635]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[636]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[637]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[638]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[639]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[640]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[641]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[642]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[643]);
	}
	
	a2 = 'call' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[644]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.PROCEDURE_CALL__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_3, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[645]);
	}
	
	a4 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[646]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[647]);
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
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_5_0_0_0, a5_0, true);
						copyLocalizationInfos(a5_0, element);
					}
				}
			)
			{
				// expected elements (follow set)
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[648]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[649]);
			}
			
			(
				(
					a6 = ',' {
						if (element == null) {
							element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
							startIncompleteElement(element);
						}
						collectHiddenTokens(element);
						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_5_0_0_1_0_0_0, null, true);
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[650]);
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
								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_5_0_0_1_0_0_1, a7_0, true);
								copyLocalizationInfos(a7_0, element);
							}
						}
					)
					{
						// expected elements (follow set)
						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[651]);
						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[652]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[653]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[654]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[655]);
	}
	
	a8 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_6, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[656]);
	}
	
	a9 = ';' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_7, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[657]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[658]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[659]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[660]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[661]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[662]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[663]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[664]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[665]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[666]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[667]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[668]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[669]);
		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[670]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[671]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[672]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[673]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[674]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[675]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[676]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[677]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[678]);
	}
	
;

parse_org_servicifi_gelato_language_kernel_parameters_Parameter returns [org.servicifi.gelato.language.kernel.parameters.Parameter element = null]
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
				element = org.servicifi.gelato.language.kernel.parameters.ParametersFactory.eINSTANCE.createParameter();
				startIncompleteElement(element);
			}
			if (a0 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a0.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.String resolved = (java.lang.String) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_18_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[679]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[680]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[681]);
		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[682]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[683]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[684]);
	}
	
;

parse_org_servicifi_gelato_language_kernel_references_Argument returns [org.servicifi.gelato.language.kernel.references.Argument element = null]
@init{
}
:
	(
		(
			a0 = 'ref' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createArgument();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_0, true, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
				// set value of boolean attribute
				Object value = true;
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE), value);
				completedElement(value, false);
			}
			|			a1 = 'val' {
				if (element == null) {
					element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createArgument();
					startIncompleteElement(element);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_0, false, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
				// set value of boolean attribute
				Object value = false;
				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE), value);
				completedElement(value, false);
			}
		)
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[685]);
	}
	
	(
		a3 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createArgument();
				startIncompleteElement(element);
			}
			if (a3 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a3.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_1, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a3, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[686]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[687]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a0).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a0).getStopIndex());
				}
				java.lang.Long resolved = (java.lang.Long) resolvedObject;
				if (resolved != null) {
					Object value = resolved;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_0, resolved, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a0, element);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[688]);
	}
	
	a1 = ':' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[689]);
	}
	
	a2 = '[' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_2, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[690]);
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[691]);
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[692]);
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[693]);
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[694]);
		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[695]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[696]);
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
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[697]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[698]);
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
						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
					}
					{
						// expected elements (follow set)
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[699]);
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[700]);
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[701]);
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[702]);
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[703]);
						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[704]);
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
						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[705]);
						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[706]);
					}
					
				)
				
			)*			{
				// expected elements (follow set)
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[707]);
				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[708]);
			}
			
		)
		
	)?	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[709]);
	}
	
	a6 = ']' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_4, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[710]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[711]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[712]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[713]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[714]);
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
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[715]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[716]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.DEFINES__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[717]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[718]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[719]);
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
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[720]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[721]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.USES__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[722]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[723]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[724]);
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
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[725]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[726]);
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
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.AFFECTS__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[727]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[728]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[729]);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_PostDefines returns [org.servicifi.gelato.language.kernel.expressions.PostDefines element = null]
@init{
}
:
	a0 = 'postdefines' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[730]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[731]);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[732]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[733]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[734]);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_PreUses returns [org.servicifi.gelato.language.kernel.expressions.PreUses element = null]
@init{
}
:
	a0 = 'preuses' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[735]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[736]);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[737]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[738]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[739]);
	}
	
;

parse_org_servicifi_gelato_language_kernel_expressions_PostAffects returns [org.servicifi.gelato.language.kernel.expressions.PostAffects element = null]
@init{
}
:
	a0 = 'postaffects' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_0, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[740]);
	}
	
	a1 = '(' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_1, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[741]);
	}
	
	(
		a2 = IDENTIFIER		
		{
			if (terminateParsing) {
				throw new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTerminateParsingException();
			}
			if (element == null) {
				element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
				startIncompleteElement(element);
			}
			if (a2 != null) {
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver("IDENTIFIER");
				tokenResolver.setOptions(getOptions());
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolveResult result = getFreshTokenResolveResult();
				tokenResolver.resolve(a2.getText(), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), result);
				Object resolvedObject = result.getResolvedToken();
				if (resolvedObject == null) {
					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a2).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a2).getStopIndex());
				}
				String resolved = (String) resolvedObject;
				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
				collectHiddenTokens(element);
				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), resolved, proxy);
				if (proxy != null) {
					Object value = proxy;
					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), value);
					completedElement(value, false);
				}
				collectHiddenTokens(element);
				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_2, proxy, true);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, element);
				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken) a2, proxy);
			}
		}
	)
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[742]);
	}
	
	a3 = ')' {
		if (element == null) {
			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
			startIncompleteElement(element);
		}
		collectHiddenTokens(element);
		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_3, null, true);
		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
	}
	{
		// expected elements (follow set)
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[743]);
		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[744]);
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
	|	c6 = parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement{ element = c6; /* this is a subclass or primitive expression choice */ }
	|	c7 = parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement{ element = c7; /* this is a subclass or primitive expression choice */ }
	|	c8 = parse_org_servicifi_gelato_language_kernel_statements_StatementWithException{ element = c8; /* this is a subclass or primitive expression choice */ }
	|	c9 = parse_org_servicifi_gelato_language_kernel_statements_Abort{ element = c9; /* this is a subclass or primitive expression choice */ }
	|	c10 = parse_org_servicifi_gelato_language_kernel_statements_Skip{ element = c10; /* this is a subclass or primitive expression choice */ }
	|	c11 = parse_org_servicifi_gelato_language_kernel_statements_Return{ element = c11; /* this is a subclass or primitive expression choice */ }
	|	c12 = parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall{ element = c12; /* this is a subclass or primitive expression choice */ }
	
;

parse_org_servicifi_gelato_language_kernel_expressions_SubExpression returns [org.servicifi.gelato.language.kernel.expressions.SubExpression element = null]
:
	c0 = parse_org_servicifi_gelato_language_kernel_expressions_Defines{ element = c0; /* this is a subclass or primitive expression choice */ }
	|	c1 = parse_org_servicifi_gelato_language_kernel_expressions_Uses{ element = c1; /* this is a subclass or primitive expression choice */ }
	|	c2 = parse_org_servicifi_gelato_language_kernel_expressions_Affects{ element = c2; /* this is a subclass or primitive expression choice */ }
	|	c3 = parse_org_servicifi_gelato_language_kernel_expressions_PostDefines{ element = c3; /* this is a subclass or primitive expression choice */ }
	|	c4 = parse_org_servicifi_gelato_language_kernel_expressions_PreUses{ element = c4; /* this is a subclass or primitive expression choice */ }
	|	c5 = parse_org_servicifi_gelato_language_kernel_expressions_PostAffects{ element = c5; /* this is a subclass or primitive expression choice */ }
	
;

SL_COMMENT:
	('//'(~('\n'|'\r'|'\uffff'))* )
	{ _channel = 99; }
;
CHARACTER_LITERAL:
	((('0'..'9'))+)
;
IDENTIFIER:
	(('a'..'z'|'A'..'Z')(('a'..'z'|'A'..'Z')|('0'..'9'))*)
;
WHITESPACE:
	((' '|'\t'|'\f'|'\r'|'\n')+)
	{ _channel = 99; }
;

