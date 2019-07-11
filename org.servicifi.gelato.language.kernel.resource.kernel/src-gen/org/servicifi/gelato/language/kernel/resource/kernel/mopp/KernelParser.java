// $ANTLR 3.4

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


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class KernelParser extends KernelANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARACTER_LITERAL", "IDENTIFIER", "SL_COMMENT", "WHITESPACE", "'('", "')'", "'*}'", "','", "':'", "';'", "'='", "'>'", "'Procedure'", "'['", "']'", "'abort'", "'affects'", "'call'", "'defines'", "'do'", "'else'", "'exception'", "'goto'", "'if'", "'interleaved'", "'l2r'", "'main'", "'none'", "'order'", "'r2l'", "'ref'", "'return'", "'skip'", "'then'", "'try'", "'uses'", "'val'", "'var'", "'while'", "'with'", "'{'", "'{*'", "'|'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int CHARACTER_LITERAL=4;
    public static final int IDENTIFIER=5;
    public static final int SL_COMMENT=6;
    public static final int WHITESPACE=7;

    // delegates
    public KernelANTLRParserBase[] getDelegates() {
        return new KernelANTLRParserBase[] {};
    }

    // delegators


    public KernelParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public KernelParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return KernelParser.tokenNames; }
    public String getGrammarFileName() { return "Kernel.g"; }


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
    	



    // $ANTLR start "start"
    // Kernel.g:551:1: start returns [ EObject element = null] : (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;


        org.servicifi.gelato.language.kernel.containers.CompilationUnit c0 =null;


        try {
            // Kernel.g:552:2: ( (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF )
            // Kernel.g:553:2: (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 0, 3);
            		expectedElementsIndexOfLastCompleteElement = 3;
            	}

            // Kernel.g:558:2: (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit )
            // Kernel.g:559:3: c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit_in_start82);
            c0=parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) { element = c0; }

            }


            match(input,EOF,FOLLOW_EOF_in_start89); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		retrieveLayoutInformation(element, null, null, false);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "start"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit"
    // Kernel.g:567:1: parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit returns [org.servicifi.gelato.language.kernel.containers.CompilationUnit element = null] : ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) ;
    public final org.servicifi.gelato.language.kernel.containers.CompilationUnit parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit() throws RecognitionException {
        org.servicifi.gelato.language.kernel.containers.CompilationUnit element =  null;


        org.servicifi.gelato.language.kernel.dataitems.DataItem a0_0 =null;

        org.servicifi.gelato.language.kernel.procedures.Procedure a1_0 =null;

        org.servicifi.gelato.language.kernel.procedures.MainProcedure a2_0 =null;




        try {
            // Kernel.g:570:2: ( ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) )
            // Kernel.g:571:2: ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure )
            {
            // Kernel.g:571:2: ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==34||(LA1_0 >= 40 && LA1_0 <= 41)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kernel.g:572:3: ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) )
            	    {
            	    // Kernel.g:572:3: ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) )
            	    // Kernel.g:573:4: (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem )
            	    {
            	    // Kernel.g:573:4: (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem )
            	    // Kernel.g:574:5: a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit130);
            	    a0_0=parse_org_servicifi_gelato_language_kernel_dataitems_DataItem();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 4, 7);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 8, 11);
            	}

            // Kernel.g:606:2: ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHARACTER_LITERAL) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==12) ) {
                        int LA2_2 = input.LA(3);

                        if ( (LA2_2==16) ) {
                            int LA2_3 = input.LA(4);

                            if ( (LA2_3==IDENTIFIER||LA2_3==8) ) {
                                alt2=1;
                            }


                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // Kernel.g:607:3: ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) )
            	    {
            	    // Kernel.g:607:3: ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) )
            	    // Kernel.g:608:4: (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure )
            	    {
            	    // Kernel.g:608:4: (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure )
            	    // Kernel.g:609:5: a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit186);
            	    a1_0=parse_org_servicifi_gelato_language_kernel_procedures_Procedure();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 12, 13);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 14, 15);
            	}

            // Kernel.g:641:2: (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure )
            // Kernel.g:642:3: a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit231);
            a2_0=parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_dataitems_DataItem"
    // Kernel.g:671:1: parse_org_servicifi_gelato_language_kernel_dataitems_DataItem returns [org.servicifi.gelato.language.kernel.dataitems.DataItem element = null] : (a0= 'var' (a1= IDENTIFIER ) a2= ';' |c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter );
    public final org.servicifi.gelato.language.kernel.dataitems.DataItem parse_org_servicifi_gelato_language_kernel_dataitems_DataItem() throws RecognitionException {
        org.servicifi.gelato.language.kernel.dataitems.DataItem element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.servicifi.gelato.language.kernel.parameters.Parameter c0 =null;




        try {
            // Kernel.g:674:2: (a0= 'var' (a1= IDENTIFIER ) a2= ';' |c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==41) ) {
                alt3=1;
            }
            else if ( (LA3_0==34||LA3_0==40) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Kernel.g:675:2: a0= 'var' (a1= IDENTIFIER ) a2= ';'
                    {
                    a0=(Token)match(input,41,FOLLOW_41_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem264); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_0, null, true);
                    		copyLocalizationInfos((CommonToken)a0, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, 16);
                    	}

                    // Kernel.g:689:2: (a1= IDENTIFIER )
                    // Kernel.g:690:3: a1= IDENTIFIER
                    {
                    a1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem282); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, 17);
                    	}

                    a2=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem303); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_2, null, true);
                    		copyLocalizationInfos((CommonToken)a2, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		// We've found the last token for this rule. The constructed EObject is now
                    		// complete.
                    		completedElement(element, true);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 18, 21);
                    	}

                    }
                    break;
                case 2 :
                    // Kernel.g:744:2: c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem322);
                    c0=parse_org_servicifi_gelato_language_kernel_parameters_Parameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_dataitems_DataItem"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_procedures_Procedure"
    // Kernel.g:748:1: parse_org_servicifi_gelato_language_kernel_procedures_Procedure returns [org.servicifi.gelato.language.kernel.procedures.Procedure element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' ;
    public final org.servicifi.gelato.language.kernel.procedures.Procedure parse_org_servicifi_gelato_language_kernel_procedures_Procedure() throws RecognitionException {
        org.servicifi.gelato.language.kernel.procedures.Procedure element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a9=null;
        Token a11=null;
        org.servicifi.gelato.language.kernel.parameters.Parameter a5_0 =null;

        org.servicifi.gelato.language.kernel.parameters.Parameter a7_0 =null;

        org.servicifi.gelato.language.kernel.procedures.Procedure a10_0 =null;

        org.servicifi.gelato.language.kernel.statements.Statement a10_1 =null;




        try {
            // Kernel.g:751:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' )
            // Kernel.g:752:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}'
            {
            // Kernel.g:752:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:753:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure351); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 22);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure372); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 23);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure386); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 24, 25);
            	}

            // Kernel.g:816:2: ( ( (a3= IDENTIFIER ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Kernel.g:817:3: ( (a3= IDENTIFIER ) )
                    {
                    // Kernel.g:817:3: ( (a3= IDENTIFIER ) )
                    // Kernel.g:818:4: (a3= IDENTIFIER )
                    {
                    // Kernel.g:818:4: (a3= IDENTIFIER )
                    // Kernel.g:819:5: a3= IDENTIFIER
                    {
                    a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure415); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 26);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 27);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure461); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 28);
            		addExpectedElement(null, 29);
            	}

            // Kernel.g:876:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==34||LA6_0==40) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kernel.g:877:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                    {
                    // Kernel.g:877:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                    // Kernel.g:878:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                    {
                    // Kernel.g:878:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    // Kernel.g:879:5: a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure490);
                    a5_0=parse_org_servicifi_gelato_language_kernel_parameters_Parameter();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 30, 31);
                    			}

                    // Kernel.g:904:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Kernel.g:905:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                    	    {
                    	    // Kernel.g:905:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                    	    // Kernel.g:906:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    	    {
                    	    a6=(Token)match(input,11,FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure531); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_5_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 32);
                    	    					}

                    	    // Kernel.g:920:6: (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    	    // Kernel.g:921:7: a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure565);
                    	    a7_0=parse_org_servicifi_gelato_language_kernel_parameters_Parameter();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 33, 34);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 35, 36);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 37);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure639); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 38);
            	}

            a9=(Token)match(input,44,FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure653); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 39, 51);
            		addExpectedElement(null, 52);
            	}

            // Kernel.g:989:2: ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CHARACTER_LITERAL||LA8_0==15||LA8_0==45) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Kernel.g:990:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:990:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:991:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:991:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==CHARACTER_LITERAL) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1==12) ) {
            	            int LA7_3 = input.LA(3);

            	            if ( (LA7_3==16) ) {
            	                alt7=1;
            	            }
            	            else if ( (LA7_3==CHARACTER_LITERAL||LA7_3==19||LA7_3==21||(LA7_3 >= 26 && LA7_3 <= 27)||(LA7_3 >= 35 && LA7_3 <= 36)||LA7_3==38||LA7_3==42||LA7_3==44) ) {
            	                alt7=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return element;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 7, 3, input);

            	                throw nvae;

            	            }
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return element;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 7, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA7_0==15||LA7_0==45) ) {
            	        alt7=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // Kernel.g:992:5: a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
            	            {
            	            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure682);
            	            a10_0=parse_org_servicifi_gelato_language_kernel_procedures_Procedure();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
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

            	            }
            	            break;
            	        case 2 :
            	            // Kernel.g:1011:10: a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	            {
            	            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure702);
            	            a10_1=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            	            state._fsp--;
            	            if (state.failed) return element;

            	            if ( state.backtracking==0 ) {
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

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 53, 65);
            	    				addExpectedElement(null, 66);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 67, 79);
            		addExpectedElement(null, 80);
            	}

            a11=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure743); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 81, 82);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), 83, 95);
            		addExpectedElement(null, 96);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_procedures_Procedure"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure"
    // Kernel.g:1066:1: parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure returns [org.servicifi.gelato.language.kernel.procedures.MainProcedure element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' a5= ')' a6= '{' ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a8= '}' ;
    public final org.servicifi.gelato.language.kernel.procedures.MainProcedure parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure() throws RecognitionException {
        org.servicifi.gelato.language.kernel.procedures.MainProcedure element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        org.servicifi.gelato.language.kernel.statements.Statement a7_0 =null;




        try {
            // Kernel.g:1069:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' a5= ')' a6= '{' ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a8= '}' )
            // Kernel.g:1070:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' a5= ')' a6= '{' ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a8= '}'
            {
            // Kernel.g:1070:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1071:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure776); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 97);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure797); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 98);
            	}

            a2=(Token)match(input,16,FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure811); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 99);
            	}

            a3=(Token)match(input,30,FOLLOW_30_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure825); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 100);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure839); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 101);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure853); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 102);
            	}

            a6=(Token)match(input,44,FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure867); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 103, 114);
            		addExpectedElement(null, 115);
            	}

            // Kernel.g:1191:2: ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CHARACTER_LITERAL||LA9_0==15||LA9_0==45) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Kernel.g:1192:3: ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:1192:3: ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:1193:4: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:1193:4: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:1194:5: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure896);
            	    a7_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 116, 127);
            	    				addExpectedElement(null, 128);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), 129, 140);
            		addExpectedElement(null, 141);
            	}

            a8=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure937); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_9, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_WhileLoop"
    // Kernel.g:1246:1: parse_org_servicifi_gelato_language_kernel_statements_WhileLoop returns [org.servicifi.gelato.language.kernel.statements.WhileLoop element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.WhileLoop parse_org_servicifi_gelato_language_kernel_statements_WhileLoop() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.WhileLoop element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a4_0 =null;

        org.servicifi.gelato.language.kernel.statements.Statement a7_0 =null;




        try {
            // Kernel.g:1249:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';' )
            // Kernel.g:1250:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';'
            {
            // Kernel.g:1250:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1251:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop970); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 142);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop991); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 143);
            	}

            a2=(Token)match(input,42,FOLLOW_42_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1005); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 144);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1019); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), 145);
            	}

            // Kernel.g:1328:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:1329:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1037);
            a4_0=parse_org_servicifi_gelato_language_kernel_expressions_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 146);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1055); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 147);
            	}

            a6=(Token)match(input,23,FOLLOW_23_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1069); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), 148, 159);
            	}

            // Kernel.g:1382:2: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:1383:3: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1087);
            a7_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 160);
            	}

            a8=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1105); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_8, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_WhileLoop"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Condition"
    // Kernel.g:1436:1: parse_org_servicifi_gelato_language_kernel_statements_Condition returns [org.servicifi.gelato.language.kernel.statements.Condition element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Condition parse_org_servicifi_gelato_language_kernel_statements_Condition() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Condition element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        Token a6=null;
        Token a8=null;
        Token a10=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a4_0 =null;

        org.servicifi.gelato.language.kernel.statements.Statement a7_0 =null;

        org.servicifi.gelato.language.kernel.statements.Statement a9_0 =null;




        try {
            // Kernel.g:1439:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';' )
            // Kernel.g:1440:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';'
            {
            // Kernel.g:1440:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1441:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1138); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 230);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1159); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 231);
            	}

            a2=(Token)match(input,27,FOLLOW_27_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1173); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 232);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1187); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), 233);
            	}

            // Kernel.g:1518:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:1519:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1205);
            a4_0=parse_org_servicifi_gelato_language_kernel_expressions_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 234);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1223); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 235);
            	}

            a6=(Token)match(input,37,FOLLOW_37_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1237); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), 236, 247);
            	}

            // Kernel.g:1572:2: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:1573:3: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1255);
            a7_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 248, 249);
            	}

            // Kernel.g:1598:2: ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Kernel.g:1599:3: (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    {
                    // Kernel.g:1599:3: (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    // Kernel.g:1600:4: a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    {
                    a8=(Token)match(input,24,FOLLOW_24_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1282); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_9_0_0_1, null, true);
                    				copyLocalizationInfos((CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), 250, 261);
                    			}

                    // Kernel.g:1614:4: (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    // Kernel.g:1615:5: a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1308);
                    a9_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 262);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 263);
            	}

            a10=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1349); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Condition"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Goto"
    // Kernel.g:1675:1: parse_org_servicifi_gelato_language_kernel_statements_Goto returns [org.servicifi.gelato.language.kernel.statements.Goto element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= CHARACTER_LITERAL ) a4= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Goto parse_org_servicifi_gelato_language_kernel_statements_Goto() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Goto element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            // Kernel.g:1678:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= CHARACTER_LITERAL ) a4= ';' )
            // Kernel.g:1679:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= CHARACTER_LITERAL ) a4= ';'
            {
            // Kernel.g:1679:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1680:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1382); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 333);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1403); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 334);
            	}

            a2=(Token)match(input,26,FOLLOW_26_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1417); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 335);
            	}

            // Kernel.g:1743:2: (a3= CHARACTER_LITERAL )
            // Kernel.g:1744:3: a3= CHARACTER_LITERAL
            {
            a3=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1435); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 336);
            	}

            a4=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1456); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Goto"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Block"
    // Kernel.g:1811:1: parse_org_servicifi_gelato_language_kernel_statements_Block returns [org.servicifi.gelato.language.kernel.statements.Block element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}' ;
    public final org.servicifi.gelato.language.kernel.statements.Block parse_org_servicifi_gelato_language_kernel_statements_Block() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Block element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;




        try {
            // Kernel.g:1814:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}' )
            // Kernel.g:1815:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}'
            {
            // Kernel.g:1815:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1816:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Block1489); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 406);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Block1510); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 407);
            	}

            a2=(Token)match(input,44,FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_statements_Block1524); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 408, 419);
            		addExpectedElement(null, 420);
            	}

            // Kernel.g:1880:2: ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CHARACTER_LITERAL||LA11_0==15||LA11_0==45) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Kernel.g:1881:3: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:1881:3: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:1882:4: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Block1547);
            	    a3_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), 421, 432);
            		addExpectedElement(null, 433);
            	}

            a4=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_statements_Block1573); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Block"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock"
    // Kernel.g:1937:1: parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock returns [org.servicifi.gelato.language.kernel.statements.ParallelBlock element = null] : a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}' ;
    public final org.servicifi.gelato.language.kernel.statements.ParallelBlock parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ParallelBlock element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a5=null;
        Token a9=null;
        org.servicifi.gelato.language.kernel.statements.Statement a8_0 =null;




        try {
            // Kernel.g:1940:2: (a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}' )
            // Kernel.g:1941:2: a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}'
            {
            a0=(Token)match(input,45,FOLLOW_45_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1602); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 503);
            	}

            a1=(Token)match(input,32,FOLLOW_32_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1616); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 504);
            	}

            a2=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1630); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 505);
            	}

            // Kernel.g:1983:2: ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) )
            // Kernel.g:1984:3: (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' )
            {
            // Kernel.g:1984:3: (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // Kernel.g:1985:4: a3= 'l2r'
                    {
                    a3=(Token)match(input,29,FOLLOW_29_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1653); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 2 :
                    // Kernel.g:1998:8: a4= 'r2l'
                    {
                    a4=(Token)match(input,33,FOLLOW_33_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1668); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 3 :
                    // Kernel.g:2011:8: a5= 'interleaved'
                    {
                    a5=(Token)match(input,28,FOLLOW_28_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1683); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 506, 517);
            	}

            // Kernel.g:2031:2: ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==CHARACTER_LITERAL||LA13_0==15||LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Kernel.g:2032:3: (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2032:3: (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2033:4: a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1713);
            	    a8_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), 518, 529);
            		addExpectedElement(null, 530);
            	}

            a9=(Token)match(input,10,FOLLOW_10_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1739); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock"
    // Kernel.g:2088:1: parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock returns [org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element = null] : a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+ ;
    public final org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element =  null;


        Token a0=null;
        Token a1=null;
        org.servicifi.gelato.language.kernel.statements.Statement a2_0 =null;




        try {
            // Kernel.g:2091:2: (a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+ )
            // Kernel.g:2092:2: a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+
            {
            a0=(Token)match(input,15,FOLLOW_15_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1768); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 600);
            	}

            a1=(Token)match(input,46,FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1782); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), 601, 612);
            	}

            // Kernel.g:2120:2: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case CHARACTER_LITERAL:
                    {
                    int LA14_2 = input.LA(2);

                    if ( (synpred15_Kernel()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred15_Kernel()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 15:
                    {
                    int LA14_4 = input.LA(2);

                    if ( (synpred15_Kernel()) ) {
                        alt14=1;
                    }


                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // Kernel.g:2121:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:2121:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:2122:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2122:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2123:5: a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1811);
            	    a2_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement"
    // Kernel.g:2179:1: parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement returns [org.servicifi.gelato.language.kernel.statements.ExpressionStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.ExpressionStatement parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExpressionStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a2_0 =null;




        try {
            // Kernel.g:2182:2: ( (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';' )
            // Kernel.g:2183:2: (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';'
            {
            // Kernel.g:2183:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2184:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1871); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 751);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1892); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), 752);
            	}

            // Kernel.g:2233:2: (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:2234:3: a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1910);
            a2_0=parse_org_servicifi_gelato_language_kernel_expressions_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 753);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1928); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_StatementWithException"
    // Kernel.g:2287:1: parse_org_servicifi_gelato_language_kernel_statements_StatementWithException returns [org.servicifi.gelato.language.kernel.statements.StatementWithException element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+ ;
    public final org.servicifi.gelato.language.kernel.statements.StatementWithException parse_org_servicifi_gelato_language_kernel_statements_StatementWithException() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.StatementWithException element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;

        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement a5_0 =null;




        try {
            // Kernel.g:2290:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+ )
            // Kernel.g:2291:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+
            {
            // Kernel.g:2291:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2292:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException1961); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 823);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException1982); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 824);
            	}

            a2=(Token)match(input,38,FOLLOW_38_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException1996); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), 825, 836);
            	}

            // Kernel.g:2355:2: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:2356:3: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2014);
            a3_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 837);
            	}

            a4=(Token)match(input,43,FOLLOW_43_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2032); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), 838);
            	}

            // Kernel.g:2395:2: ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==CHARACTER_LITERAL) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred16_Kernel()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // Kernel.g:2396:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
            	    {
            	    // Kernel.g:2396:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
            	    // Kernel.g:2397:4: a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2055);
            	    a5_0=parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {
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

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_StatementWithException"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement"
    // Kernel.g:2438:1: parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement returns [org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ;
    public final org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;




        try {
            // Kernel.g:2441:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            // Kernel.g:2442:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            {
            // Kernel.g:2442:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2443:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2100); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 909);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2121); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 910);
            	}

            a2=(Token)match(input,25,FOLLOW_25_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2135); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), 911, 922);
            	}

            // Kernel.g:2506:2: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:2507:3: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2153);
            a3_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Abort"
    // Kernel.g:2546:1: parse_org_servicifi_gelato_language_kernel_statements_Abort returns [org.servicifi.gelato.language.kernel.statements.Abort element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Abort parse_org_servicifi_gelato_language_kernel_statements_Abort() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Abort element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:2549:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';' )
            // Kernel.g:2550:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';'
            {
            // Kernel.g:2550:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2551:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2190); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 992);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2211); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 993);
            	}

            a2=(Token)match(input,19,FOLLOW_19_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2225); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 994);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2239); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Abort"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Skip"
    // Kernel.g:2642:1: parse_org_servicifi_gelato_language_kernel_statements_Skip returns [org.servicifi.gelato.language.kernel.statements.Skip element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Skip parse_org_servicifi_gelato_language_kernel_statements_Skip() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Skip element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:2645:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';' )
            // Kernel.g:2646:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';'
            {
            // Kernel.g:2646:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2647:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2272); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1064);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2293); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1065);
            	}

            a2=(Token)match(input,36,FOLLOW_36_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2307); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1066);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2321); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Skip"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Return"
    // Kernel.g:2738:1: parse_org_servicifi_gelato_language_kernel_statements_Return returns [org.servicifi.gelato.language.kernel.statements.Return element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'return' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Return parse_org_servicifi_gelato_language_kernel_statements_Return() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Return element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:2741:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'return' a3= ';' )
            // Kernel.g:2742:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'return' a3= ';'
            {
            // Kernel.g:2742:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2743:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Return2354); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1136);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Return2375); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1137);
            	}

            a2=(Token)match(input,35,FOLLOW_35_in_parse_org_servicifi_gelato_language_kernel_statements_Return2389); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1138);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Return2403); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Return"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall"
    // Kernel.g:2834:1: parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall returns [org.servicifi.gelato.language.kernel.statements.ProcedureCall element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.ProcedureCall parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ProcedureCall element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;
        Token a6=null;
        Token a8=null;
        Token a9=null;
        org.servicifi.gelato.language.kernel.references.Argument a5_0 =null;

        org.servicifi.gelato.language.kernel.references.Argument a7_0 =null;




        try {
            // Kernel.g:2837:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';' )
            // Kernel.g:2838:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';'
            {
            // Kernel.g:2838:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2839:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2436); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1208);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2457); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1209);
            	}

            a2=(Token)match(input,21,FOLLOW_21_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2471); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1210);
            	}

            // Kernel.g:2902:2: (a3= IDENTIFIER )
            // Kernel.g:2903:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2489); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1211);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2510); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), 1212, 1213);
            		addExpectedElement(null, 1214);
            	}

            // Kernel.g:2957:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IDENTIFIER||LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // Kernel.g:2958:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* )
                    {
                    // Kernel.g:2958:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* )
                    // Kernel.g:2959:4: (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )*
                    {
                    // Kernel.g:2959:4: (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    // Kernel.g:2960:5: a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2539);
                    a5_0=parse_org_servicifi_gelato_language_kernel_references_Argument();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 1215, 1216);
                    			}

                    // Kernel.g:2985:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==11) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // Kernel.g:2986:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) )
                    	    {
                    	    // Kernel.g:2986:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) )
                    	    // Kernel.g:2987:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    	    {
                    	    a6=(Token)match(input,11,FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2580); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_5_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), 1217, 1218);
                    	    					}

                    	    // Kernel.g:3001:6: (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    	    // Kernel.g:3002:7: a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2614);
                    	    a7_0=parse_org_servicifi_gelato_language_kernel_references_Argument();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 1219, 1220);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 1221, 1222);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1223);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2688); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1224);
            	}

            a9=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2702); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
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

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_parameters_Parameter"
    // Kernel.g:3083:1: parse_org_servicifi_gelato_language_kernel_parameters_Parameter returns [org.servicifi.gelato.language.kernel.parameters.Parameter element = null] : ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER ) ;
    public final org.servicifi.gelato.language.kernel.parameters.Parameter parse_org_servicifi_gelato_language_kernel_parameters_Parameter() throws RecognitionException {
        org.servicifi.gelato.language.kernel.parameters.Parameter element =  null;


        Token a0=null;
        Token a1=null;
        Token a3=null;



        try {
            // Kernel.g:3086:2: ( ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER ) )
            // Kernel.g:3087:2: ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER )
            {
            // Kernel.g:3087:2: ( (a0= 'ref' |a1= 'val' ) )
            // Kernel.g:3088:3: (a0= 'ref' |a1= 'val' )
            {
            // Kernel.g:3088:3: (a0= 'ref' |a1= 'val' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            else if ( (LA18_0==40) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // Kernel.g:3089:4: a0= 'ref'
                    {
                    a0=(Token)match(input,34,FOLLOW_34_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2740); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 2 :
                    // Kernel.g:3102:8: a1= 'val'
                    {
                    a1=(Token)match(input,40,FOLLOW_40_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2755); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1294);
            	}

            // Kernel.g:3122:2: (a3= IDENTIFIER )
            // Kernel.g:3123:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2780); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), 1295, 1298);
            		addExpectedElement(null, 1299, 1300);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_parameters_Parameter"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_references_ArgumentReference"
    // Kernel.g:3164:1: parse_org_servicifi_gelato_language_kernel_references_ArgumentReference returns [org.servicifi.gelato.language.kernel.references.ArgumentReference element = null] : (a0= IDENTIFIER ) ;
    public final org.servicifi.gelato.language.kernel.references.ArgumentReference parse_org_servicifi_gelato_language_kernel_references_ArgumentReference() throws RecognitionException {
        org.servicifi.gelato.language.kernel.references.ArgumentReference element =  null;


        Token a0=null;



        try {
            // Kernel.g:3167:2: ( (a0= IDENTIFIER ) )
            // Kernel.g:3168:2: (a0= IDENTIFIER )
            {
            // Kernel.g:3168:2: (a0= IDENTIFIER )
            // Kernel.g:3169:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_references_ArgumentReference2820); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 1301, 1302);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_references_ArgumentReference"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_references_EmptyArgument"
    // Kernel.g:3213:1: parse_org_servicifi_gelato_language_kernel_references_EmptyArgument returns [org.servicifi.gelato.language.kernel.references.EmptyArgument element = null] : a0= 'none' ;
    public final org.servicifi.gelato.language.kernel.references.EmptyArgument parse_org_servicifi_gelato_language_kernel_references_EmptyArgument() throws RecognitionException {
        org.servicifi.gelato.language.kernel.references.EmptyArgument element =  null;


        Token a0=null;



        try {
            // Kernel.g:3216:2: (a0= 'none' )
            // Kernel.g:3217:2: a0= 'none'
            {
            a0=(Token)match(input,31,FOLLOW_31_in_parse_org_servicifi_gelato_language_kernel_references_EmptyArgument2856); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createEmptyArgument();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 1303, 1304);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_references_EmptyArgument"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_Expression"
    // Kernel.g:3236:1: parse_org_servicifi_gelato_language_kernel_expressions_Expression returns [org.servicifi.gelato.language.kernel.expressions.Expression element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']' ;
    public final org.servicifi.gelato.language.kernel.expressions.Expression parse_org_servicifi_gelato_language_kernel_expressions_Expression() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Expression element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        Token a6=null;
        org.servicifi.gelato.language.kernel.expressions.SubExpression a3_0 =null;

        org.servicifi.gelato.language.kernel.expressions.SubExpression a5_0 =null;




        try {
            // Kernel.g:3239:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']' )
            // Kernel.g:3240:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']'
            {
            // Kernel.g:3240:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3241:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2889); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1305);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2910); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1306);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2924); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), 1307, 1309);
            		addExpectedElement(null, 1310);
            	}

            // Kernel.g:3305:2: ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20||LA20_0==22||LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Kernel.g:3306:3: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* )
                    {
                    // Kernel.g:3306:3: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* )
                    // Kernel.g:3307:4: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )*
                    {
                    // Kernel.g:3307:4: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    // Kernel.g:3308:5: a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2953);
                    a3_0=parse_org_servicifi_gelato_language_kernel_expressions_SubExpression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 1311, 1312);
                    			}

                    // Kernel.g:3333:4: ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==13) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Kernel.g:3334:5: (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) )
                    	    {
                    	    // Kernel.g:3334:5: (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) )
                    	    // Kernel.g:3335:6: a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    	    {
                    	    a4=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2994); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_3_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a4, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), 1313, 1315);
                    	    					}

                    	    // Kernel.g:3349:6: (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    	    // Kernel.g:3350:7: a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3028);
                    	    a5_0=parse_org_servicifi_gelato_language_kernel_expressions_SubExpression();

                    	    state._fsp--;
                    	    if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
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

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, 1316, 1317);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, 1318, 1319);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1320);
            	}

            a6=(Token)match(input,18,FOLLOW_18_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3102); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 1321, 1323);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_Expression"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_Defines"
    // Kernel.g:3408:1: parse_org_servicifi_gelato_language_kernel_expressions_Defines returns [org.servicifi.gelato.language.kernel.expressions.Defines element = null] : a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Defines parse_org_servicifi_gelato_language_kernel_expressions_Defines() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Defines element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3411:2: (a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:3412:2: a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,22,FOLLOW_22_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3131); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1324);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3145); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1325);
            	}

            // Kernel.g:3440:2: (a2= IDENTIFIER )
            // Kernel.g:3441:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3163); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1326);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3184); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 1327, 1328);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_Defines"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_Uses"
    // Kernel.g:3499:1: parse_org_servicifi_gelato_language_kernel_expressions_Uses returns [org.servicifi.gelato.language.kernel.expressions.Uses element = null] : a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Uses parse_org_servicifi_gelato_language_kernel_expressions_Uses() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Uses element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3502:2: (a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:3503:2: a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,39,FOLLOW_39_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3213); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1329);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3227); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1330);
            	}

            // Kernel.g:3531:2: (a2= IDENTIFIER )
            // Kernel.g:3532:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3245); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1331);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3266); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 1332, 1333);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_Uses"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_Affects"
    // Kernel.g:3590:1: parse_org_servicifi_gelato_language_kernel_expressions_Affects returns [org.servicifi.gelato.language.kernel.expressions.Affects element = null] : a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Affects parse_org_servicifi_gelato_language_kernel_expressions_Affects() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Affects element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3593:2: (a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:3594:2: a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,20,FOLLOW_20_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3295); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1334);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3309); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1335);
            	}

            // Kernel.g:3622:2: (a2= IDENTIFIER )
            // Kernel.g:3623:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3327); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, 1336);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3348); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		// We've found the last token for this rule. The constructed EObject is now
            		// complete.
            		completedElement(element, true);
            		addExpectedElement(null, 1337, 1338);
            	}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_Affects"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Statement"
    // Kernel.g:3681:1: parse_org_servicifi_gelato_language_kernel_statements_Statement returns [org.servicifi.gelato.language.kernel.statements.Statement element = null] : (c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop |c1= parse_org_servicifi_gelato_language_kernel_statements_Condition |c2= parse_org_servicifi_gelato_language_kernel_statements_Goto |c3= parse_org_servicifi_gelato_language_kernel_statements_Block |c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock |c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock |c6= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement |c7= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException |c8= parse_org_servicifi_gelato_language_kernel_statements_Abort |c9= parse_org_servicifi_gelato_language_kernel_statements_Skip |c10= parse_org_servicifi_gelato_language_kernel_statements_Return |c11= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall );
    public final org.servicifi.gelato.language.kernel.statements.Statement parse_org_servicifi_gelato_language_kernel_statements_Statement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Statement element =  null;


        org.servicifi.gelato.language.kernel.statements.WhileLoop c0 =null;

        org.servicifi.gelato.language.kernel.statements.Condition c1 =null;

        org.servicifi.gelato.language.kernel.statements.Goto c2 =null;

        org.servicifi.gelato.language.kernel.statements.Block c3 =null;

        org.servicifi.gelato.language.kernel.statements.ParallelBlock c4 =null;

        org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock c5 =null;

        org.servicifi.gelato.language.kernel.statements.ExpressionStatement c6 =null;

        org.servicifi.gelato.language.kernel.statements.StatementWithException c7 =null;

        org.servicifi.gelato.language.kernel.statements.Abort c8 =null;

        org.servicifi.gelato.language.kernel.statements.Skip c9 =null;

        org.servicifi.gelato.language.kernel.statements.Return c10 =null;

        org.servicifi.gelato.language.kernel.statements.ProcedureCall c11 =null;


        try {
            // Kernel.g:3682:2: (c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop |c1= parse_org_servicifi_gelato_language_kernel_statements_Condition |c2= parse_org_servicifi_gelato_language_kernel_statements_Goto |c3= parse_org_servicifi_gelato_language_kernel_statements_Block |c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock |c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock |c6= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement |c7= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException |c8= parse_org_servicifi_gelato_language_kernel_statements_Abort |c9= parse_org_servicifi_gelato_language_kernel_statements_Skip |c10= parse_org_servicifi_gelato_language_kernel_statements_Return |c11= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall )
            int alt21=12;
            switch ( input.LA(1) ) {
            case CHARACTER_LITERAL:
                {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==12) ) {
                    switch ( input.LA(3) ) {
                    case 42:
                        {
                        alt21=1;
                        }
                        break;
                    case 27:
                        {
                        alt21=2;
                        }
                        break;
                    case 26:
                        {
                        alt21=3;
                        }
                        break;
                    case 44:
                        {
                        alt21=4;
                        }
                        break;
                    case CHARACTER_LITERAL:
                        {
                        alt21=7;
                        }
                        break;
                    case 38:
                        {
                        alt21=8;
                        }
                        break;
                    case 19:
                        {
                        alt21=9;
                        }
                        break;
                    case 36:
                        {
                        alt21=10;
                        }
                        break;
                    case 35:
                        {
                        alt21=11;
                        }
                        break;
                    case 21:
                        {
                        alt21=12;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
                }
                break;
            case 45:
                {
                alt21=5;
                }
                break;
            case 15:
                {
                alt21=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // Kernel.g:3683:2: c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3373);
                    c0=parse_org_servicifi_gelato_language_kernel_statements_WhileLoop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:3684:4: c1= parse_org_servicifi_gelato_language_kernel_statements_Condition
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Condition_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3383);
                    c1=parse_org_servicifi_gelato_language_kernel_statements_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Kernel.g:3685:4: c2= parse_org_servicifi_gelato_language_kernel_statements_Goto
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Goto_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3393);
                    c2=parse_org_servicifi_gelato_language_kernel_statements_Goto();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Kernel.g:3686:4: c3= parse_org_servicifi_gelato_language_kernel_statements_Block
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Block_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3403);
                    c3=parse_org_servicifi_gelato_language_kernel_statements_Block();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Kernel.g:3687:4: c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3413);
                    c4=parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Kernel.g:3688:4: c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3423);
                    c5=parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Kernel.g:3689:4: c6= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3433);
                    c6=parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // Kernel.g:3690:4: c7= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3443);
                    c7=parse_org_servicifi_gelato_language_kernel_statements_StatementWithException();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // Kernel.g:3691:4: c8= parse_org_servicifi_gelato_language_kernel_statements_Abort
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Abort_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3453);
                    c8=parse_org_servicifi_gelato_language_kernel_statements_Abort();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 10 :
                    // Kernel.g:3692:4: c9= parse_org_servicifi_gelato_language_kernel_statements_Skip
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Skip_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3463);
                    c9=parse_org_servicifi_gelato_language_kernel_statements_Skip();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c9; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 11 :
                    // Kernel.g:3693:4: c10= parse_org_servicifi_gelato_language_kernel_statements_Return
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Return_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3473);
                    c10=parse_org_servicifi_gelato_language_kernel_statements_Return();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c10; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 12 :
                    // Kernel.g:3694:4: c11= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3483);
                    c11=parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c11; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_Statement"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_references_Argument"
    // Kernel.g:3698:1: parse_org_servicifi_gelato_language_kernel_references_Argument returns [org.servicifi.gelato.language.kernel.references.Argument element = null] : (c0= parse_org_servicifi_gelato_language_kernel_references_ArgumentReference |c1= parse_org_servicifi_gelato_language_kernel_references_EmptyArgument );
    public final org.servicifi.gelato.language.kernel.references.Argument parse_org_servicifi_gelato_language_kernel_references_Argument() throws RecognitionException {
        org.servicifi.gelato.language.kernel.references.Argument element =  null;


        org.servicifi.gelato.language.kernel.references.ArgumentReference c0 =null;

        org.servicifi.gelato.language.kernel.references.EmptyArgument c1 =null;


        try {
            // Kernel.g:3699:2: (c0= parse_org_servicifi_gelato_language_kernel_references_ArgumentReference |c1= parse_org_servicifi_gelato_language_kernel_references_EmptyArgument )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==IDENTIFIER) ) {
                alt22=1;
            }
            else if ( (LA22_0==31) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Kernel.g:3700:2: c0= parse_org_servicifi_gelato_language_kernel_references_ArgumentReference
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_ArgumentReference_in_parse_org_servicifi_gelato_language_kernel_references_Argument3504);
                    c0=parse_org_servicifi_gelato_language_kernel_references_ArgumentReference();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:3701:4: c1= parse_org_servicifi_gelato_language_kernel_references_EmptyArgument
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_EmptyArgument_in_parse_org_servicifi_gelato_language_kernel_references_Argument3514);
                    c1=parse_org_servicifi_gelato_language_kernel_references_EmptyArgument();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_references_Argument"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_SubExpression"
    // Kernel.g:3705:1: parse_org_servicifi_gelato_language_kernel_expressions_SubExpression returns [org.servicifi.gelato.language.kernel.expressions.SubExpression element = null] : (c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines |c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses |c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects );
    public final org.servicifi.gelato.language.kernel.expressions.SubExpression parse_org_servicifi_gelato_language_kernel_expressions_SubExpression() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.SubExpression element =  null;


        org.servicifi.gelato.language.kernel.expressions.Defines c0 =null;

        org.servicifi.gelato.language.kernel.expressions.Uses c1 =null;

        org.servicifi.gelato.language.kernel.expressions.Affects c2 =null;


        try {
            // Kernel.g:3706:2: (c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines |c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses |c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt23=1;
                }
                break;
            case 39:
                {
                alt23=2;
                }
                break;
            case 20:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // Kernel.g:3707:2: c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Defines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3535);
                    c0=parse_org_servicifi_gelato_language_kernel_expressions_Defines();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:3708:4: c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Uses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3545);
                    c1=parse_org_servicifi_gelato_language_kernel_expressions_Uses();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Kernel.g:3709:4: c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Affects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3555);
                    c2=parse_org_servicifi_gelato_language_kernel_expressions_Affects();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_SubExpression"

    // $ANTLR start synpred15_Kernel
    public final void synpred15_Kernel_fragment() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Statement a2_0 =null;


        // Kernel.g:2121:3: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )
        // Kernel.g:2121:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
        {
        // Kernel.g:2121:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
        // Kernel.g:2122:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
        {
        // Kernel.g:2122:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
        // Kernel.g:2123:5: a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
        {
        pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_synpred15_Kernel1811);
        a2_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred15_Kernel

    // $ANTLR start synpred16_Kernel
    public final void synpred16_Kernel_fragment() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement a5_0 =null;


        // Kernel.g:2396:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )
        // Kernel.g:2396:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
        {
        // Kernel.g:2396:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
        // Kernel.g:2397:4: a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement
        {
        pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_synpred16_Kernel2055);
        a5_0=parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred16_Kernel

    // Delegated rules

    public final boolean synpred16_Kernel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Kernel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_Kernel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Kernel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit_in_start82 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_start89 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit130 = new BitSet(new long[]{0x0000030400000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem282 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure351 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure372 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure386 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure415 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure461 = new BitSet(new long[]{0x0000010400000200L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure490 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure531 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure565 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure639 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure653 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure682 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure702 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure776 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure797 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure811 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure825 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure839 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure853 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure867 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure896 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop970 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop991 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1005 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1037 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1055 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1069 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1087 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1159 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1173 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1223 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1237 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1255 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_24_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1282 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1308 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1403 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1417 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1435 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Block1489 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Block1510 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_statements_Block1524 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Block1547 = new BitSet(new long[]{0x0000A00000008010L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_statements_Block1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1602 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1616 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1630 = new BitSet(new long[]{0x0000000230000000L});
    public static final BitSet FOLLOW_29_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1653 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_33_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1668 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_28_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1683 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1713 = new BitSet(new long[]{0x0000200000008410L});
    public static final BitSet FOLLOW_10_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1768 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1782 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1811 = new BitSet(new long[]{0x0000200000008012L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1871 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1910 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException1961 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException1982 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException1996 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2014 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2032 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2055 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2100 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2121 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2135 = new BitSet(new long[]{0x0000200000008010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2190 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2211 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2225 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2293 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2307 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Return2354 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Return2375 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parse_org_servicifi_gelato_language_kernel_statements_Return2389 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_Return2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2436 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2457 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2471 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2489 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2510 = new BitSet(new long[]{0x0000000080000220L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2539 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2580 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2614 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2688 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2755 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_references_ArgumentReference2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_parse_org_servicifi_gelato_language_kernel_references_EmptyArgument2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2889 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2910 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2924 = new BitSet(new long[]{0x0000008000540000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2953 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression2994 = new BitSet(new long[]{0x0000008000500000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3028 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_18_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3131 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3145 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3163 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3213 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3245 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3295 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3309 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3327 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Condition_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Goto_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Block_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Abort_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Skip_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Return_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_ArgumentReference_in_parse_org_servicifi_gelato_language_kernel_references_Argument3504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_EmptyArgument_in_parse_org_servicifi_gelato_language_kernel_references_Argument3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Defines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Uses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Affects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_synpred15_Kernel1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_synpred16_Kernel2055 = new BitSet(new long[]{0x0000000000000002L});

}