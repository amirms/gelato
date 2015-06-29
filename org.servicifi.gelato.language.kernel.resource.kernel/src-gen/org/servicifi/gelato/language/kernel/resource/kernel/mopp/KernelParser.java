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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARACTER_LITERAL", "IDENTIFIER", "SL_COMMENT", "WHITESPACE", "'('", "')'", "'*}'", "','", "':'", "':='", "';'", "'='", "'>'", "'Procedure'", "'['", "']'", "'abort'", "'affects'", "'call'", "'defines'", "'do'", "'else'", "'exception'", "'goto'", "'if'", "'interleaved'", "'l2r'", "'main'", "'order'", "'postaffects'", "'postdefines'", "'preuses'", "'r2l'", "'ref'", "'skip'", "'then'", "'try'", "'uses'", "'val'", "'var'", "'while'", "'with'", "'{'", "'{*'", "'|'", "'}'"
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
    public static final int T__48=48;
    public static final int T__49=49;
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
    		// remove all expected elements that were added after the last complete element
    		expectedElements = expectedElements.subList(0, expectedElementsIndexOfLastCompleteElement + 1);
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
    		int followSetID = 157;
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
    	



    // $ANTLR start "start"
    // Kernel.g:556:1: start returns [ EObject element = null] : (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF ;
    public final EObject start() throws RecognitionException {
        EObject element =  null;


        org.servicifi.gelato.language.kernel.containers.CompilationUnit c0 =null;


        try {
            // Kernel.g:557:2: ( (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF )
            // Kernel.g:558:2: (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[2]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Kernel.g:565:2: (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit )
            // Kernel.g:566:3: c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit
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
    // Kernel.g:574:1: parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit returns [org.servicifi.gelato.language.kernel.containers.CompilationUnit element = null] : ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* ;
    public final org.servicifi.gelato.language.kernel.containers.CompilationUnit parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit() throws RecognitionException {
        org.servicifi.gelato.language.kernel.containers.CompilationUnit element =  null;


        org.servicifi.gelato.language.kernel.dataitems.DataItem a0_0 =null;

        org.servicifi.gelato.language.kernel.procedures.MainProcedure a1_0 =null;

        org.servicifi.gelato.language.kernel.procedures.Procedure a2_0 =null;




        try {
            // Kernel.g:577:2: ( ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* )
            // Kernel.g:578:2: ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )*
            {
            // Kernel.g:578:2: ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==43) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kernel.g:579:3: ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) )
            	    {
            	    // Kernel.g:579:3: ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) )
            	    // Kernel.g:580:4: (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem )
            	    {
            	    // Kernel.g:580:4: (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem )
            	    // Kernel.g:581:5: a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem
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
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[3]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[4]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[5]);
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
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[6]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[7]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[8]);
            	}

            // Kernel.g:617:2: (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure )
            // Kernel.g:618:3: a1_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit175);
            a1_0=parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure();

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
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__MAIN_PROCEDURE), value);
            					completedElement(value, true);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_1, a1_0, true);
            				copyLocalizationInfos(a1_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[10]);
            	}

            // Kernel.g:644:2: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHARACTER_LITERAL) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Kernel.g:645:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) )
            	    {
            	    // Kernel.g:645:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) )
            	    // Kernel.g:646:4: (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure )
            	    {
            	    // Kernel.g:646:4: (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure )
            	    // Kernel.g:647:5: a2_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit208);
            	    a2_0=parse_org_servicifi_gelato_language_kernel_procedures_Procedure();

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
            	    							addObjectToList(element, org.servicifi.gelato.language.kernel.containers.ContainersPackage.COMPILATION_UNIT__DECLARATIONS, value);
            	    							completedElement(value, true);
            	    						}
            	    						collectHiddenTokens(element);
            	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_3_0_0_0, a2_0, true);
            	    						copyLocalizationInfos(a2_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[11]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[12]);
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
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[13]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[14]);
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
    // Kernel.g:683:1: parse_org_servicifi_gelato_language_kernel_dataitems_DataItem returns [org.servicifi.gelato.language.kernel.dataitems.DataItem element = null] : (a0= 'var' (a1= IDENTIFIER ) a2= ';' |c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter );
    public final org.servicifi.gelato.language.kernel.dataitems.DataItem parse_org_servicifi_gelato_language_kernel_dataitems_DataItem() throws RecognitionException {
        org.servicifi.gelato.language.kernel.dataitems.DataItem element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.servicifi.gelato.language.kernel.parameters.Parameter c0 =null;




        try {
            // Kernel.g:686:2: (a0= 'var' (a1= IDENTIFIER ) a2= ';' |c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==43) ) {
                alt3=1;
            }
            else if ( (LA3_0==IDENTIFIER) ) {
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
                    // Kernel.g:687:2: a0= 'var' (a1= IDENTIFIER ) a2= ';'
                    {
                    a0=(Token)match(input,43,FOLLOW_43_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem264); if (state.failed) return element;

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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[15]);
                    	}

                    // Kernel.g:701:2: (a1= IDENTIFIER )
                    // Kernel.g:702:3: a1= IDENTIFIER
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[16]);
                    	}

                    a2=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem303); if (state.failed) return element;

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
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[17]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[18]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[19]);
                    	}

                    }
                    break;
                case 2 :
                    // Kernel.g:755:2: c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
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
    // Kernel.g:759:1: parse_org_servicifi_gelato_language_kernel_procedures_Procedure returns [org.servicifi.gelato.language.kernel.procedures.Procedure element = null] : ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' |c0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure );
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

        org.servicifi.gelato.language.kernel.procedures.MainProcedure c0 =null;




        try {
            // Kernel.g:762:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' |c0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CHARACTER_LITERAL) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==12) ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2==17) ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3==IDENTIFIER||LA9_3==8) ) {
                            alt9=1;
                        }
                        else if ( (LA9_3==31) ) {
                            alt9=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return element;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 9, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Kernel.g:763:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}'
                    {
                    // Kernel.g:763:2: (a0= CHARACTER_LITERAL )
                    // Kernel.g:764:3: a0= CHARACTER_LITERAL
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
                    				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[20]);
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[21]);
                    	}

                    a2=(Token)match(input,17,FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure386); if (state.failed) return element;

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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[22]);
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[23]);
                    	}

                    // Kernel.g:828:2: ( ( (a3= IDENTIFIER ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==IDENTIFIER) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Kernel.g:829:3: ( (a3= IDENTIFIER ) )
                            {
                            // Kernel.g:829:3: ( (a3= IDENTIFIER ) )
                            // Kernel.g:830:4: (a3= IDENTIFIER )
                            {
                            // Kernel.g:830:4: (a3= IDENTIFIER )
                            // Kernel.g:831:5: a3= IDENTIFIER
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
                            				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[24]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[25]);
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
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[26]);
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[27]);
                    	}

                    // Kernel.g:888:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==IDENTIFIER) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // Kernel.g:889:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                            {
                            // Kernel.g:889:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                            // Kernel.g:890:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                            {
                            // Kernel.g:890:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                            // Kernel.g:891:5: a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
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
                            				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[28]);
                            				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[29]);
                            			}

                            // Kernel.g:917:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==11) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // Kernel.g:918:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                            	    {
                            	    // Kernel.g:918:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                            	    // Kernel.g:919:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
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
                            	    						addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[30]);
                            	    					}

                            	    // Kernel.g:933:6: (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                            	    // Kernel.g:934:7: a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
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
                            	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[31]);
                            	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[32]);
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
                            				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[33]);
                            				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[34]);
                            			}

                            }


                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[35]);
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[36]);
                    	}

                    a9=(Token)match(input,46,FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure653); if (state.failed) return element;

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
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[37]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[38]);
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[51]);
                    	}

                    // Kernel.g:1017:2: ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==CHARACTER_LITERAL||LA8_0==16||LA8_0==47) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Kernel.g:1018:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    	    {
                    	    // Kernel.g:1018:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    	    // Kernel.g:1019:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    	    {
                    	    // Kernel.g:1019:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    	    int alt7=2;
                    	    int LA7_0 = input.LA(1);

                    	    if ( (LA7_0==CHARACTER_LITERAL) ) {
                    	        int LA7_1 = input.LA(2);

                    	        if ( (LA7_1==12) ) {
                    	            int LA7_3 = input.LA(3);

                    	            if ( (LA7_3==17) ) {
                    	                alt7=1;
                    	            }
                    	            else if ( ((LA7_3 >= CHARACTER_LITERAL && LA7_3 <= IDENTIFIER)||LA7_3==20||LA7_3==22||(LA7_3 >= 27 && LA7_3 <= 28)||LA7_3==38||LA7_3==40||LA7_3==44||LA7_3==46) ) {
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
                    	    else if ( (LA7_0==16||LA7_0==47) ) {
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
                    	            // Kernel.g:1020:5: a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
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
                    	            // Kernel.g:1039:10: a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement
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
                    	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[52]);
                    	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[53]);
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
                    	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[66]);
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
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[67]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[68]);
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[81]);
                    	}

                    a11=(Token)match(input,49,FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure743); if (state.failed) return element;

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
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[82]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[83]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[84]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[85]);
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
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[96]);
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[97]);
                    	}

                    }
                    break;
                case 2 :
                    // Kernel.g:1130:2: c0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure762);
                    c0=parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure();

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
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_procedures_Procedure"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure"
    // Kernel.g:1134:1: parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure returns [org.servicifi.gelato.language.kernel.procedures.MainProcedure element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' ;
    public final org.servicifi.gelato.language.kernel.procedures.MainProcedure parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure() throws RecognitionException {
        org.servicifi.gelato.language.kernel.procedures.MainProcedure element =  null;


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
            // Kernel.g:1137:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' )
            // Kernel.g:1138:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}'
            {
            // Kernel.g:1138:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1139:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure791); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[98]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure812); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[99]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure826); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[100]);
            	}

            a3=(Token)match(input,31,FOLLOW_31_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure840); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[101]);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure854); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[102]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[103]);
            	}

            // Kernel.g:1231:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IDENTIFIER) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Kernel.g:1232:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                    {
                    // Kernel.g:1232:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                    // Kernel.g:1233:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                    {
                    // Kernel.g:1233:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    // Kernel.g:1234:5: a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure883);
                    a5_0=parse_org_servicifi_gelato_language_kernel_parameters_Parameter();

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
                    					if (a5_0 != null) {
                    						if (a5_0 != null) {
                    							Object value = a5_0;
                    							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__PARAMETERS, value);
                    							completedElement(value, true);
                    						}
                    						collectHiddenTokens(element);
                    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5_0_0_0, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[104]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[105]);
                    			}

                    // Kernel.g:1260:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==11) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Kernel.g:1261:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                    	    {
                    	    // Kernel.g:1261:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                    	    // Kernel.g:1262:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    	    {
                    	    a6=(Token)match(input,11,FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure924); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[106]);
                    	    					}

                    	    // Kernel.g:1276:6: (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    	    // Kernel.g:1277:7: a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure958);
                    	    a7_0=parse_org_servicifi_gelato_language_kernel_parameters_Parameter();

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
                    	    									addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__PARAMETERS, value);
                    	    									completedElement(value, true);
                    	    								}
                    	    								collectHiddenTokens(element);
                    	    								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5_0_0_1_0_0_1, a7_0, true);
                    	    								copyLocalizationInfos(a7_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[107]);
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[108]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[109]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[110]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[111]);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1032); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_6, null, true);
            		copyLocalizationInfos((CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[112]);
            	}

            a9=(Token)match(input,46,FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1046); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_7, null, true);
            		copyLocalizationInfos((CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[113]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[114]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[115]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[116]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[117]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[118]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[119]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[120]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[121]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[122]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[123]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[124]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[125]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[126]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[127]);
            	}

            // Kernel.g:1360:2: ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==CHARACTER_LITERAL||LA13_0==16||LA13_0==47) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Kernel.g:1361:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:1361:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:1362:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:1362:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==CHARACTER_LITERAL) ) {
            	        int LA12_1 = input.LA(2);

            	        if ( (LA12_1==12) ) {
            	            int LA12_3 = input.LA(3);

            	            if ( (LA12_3==17) ) {
            	                alt12=1;
            	            }
            	            else if ( ((LA12_3 >= CHARACTER_LITERAL && LA12_3 <= IDENTIFIER)||LA12_3==20||LA12_3==22||(LA12_3 >= 27 && LA12_3 <= 28)||LA12_3==38||LA12_3==40||LA12_3==44||LA12_3==46) ) {
            	                alt12=2;
            	            }
            	            else {
            	                if (state.backtracking>0) {state.failed=true; return element;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 12, 3, input);

            	                throw nvae;

            	            }
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return element;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 12, 1, input);

            	            throw nvae;

            	        }
            	    }
            	    else if ( (LA12_0==16||LA12_0==47) ) {
            	        alt12=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return element;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // Kernel.g:1363:5: a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
            	            {
            	            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1075);
            	            a10_0=parse_org_servicifi_gelato_language_kernel_procedures_Procedure();

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
            	            					if (a10_0 != null) {
            	            						if (a10_0 != null) {
            	            							Object value = a10_0;
            	            							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__MEMBERS, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_8_0_0_1, a10_0, true);
            	            						copyLocalizationInfos(a10_0, element);
            	            					}
            	            				}

            	            }
            	            break;
            	        case 2 :
            	            // Kernel.g:1382:10: a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	            {
            	            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1095);
            	            a10_1=parse_org_servicifi_gelato_language_kernel_statements_Statement();

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
            	            					if (a10_1 != null) {
            	            						if (a10_1 != null) {
            	            							Object value = a10_1;
            	            							addObjectToList(element, org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.MAIN_PROCEDURE__MEMBERS, value);
            	            							completedElement(value, true);
            	            						}
            	            						collectHiddenTokens(element);
            	            						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_8_0_0_1, a10_1, true);
            	            						copyLocalizationInfos(a10_1, element);
            	            					}
            	            				}

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[128]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[129]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[130]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[131]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[132]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[133]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[134]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[135]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[136]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[137]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[138]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[139]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[140]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[141]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[142]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[143]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[144]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[145]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[146]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[147]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[148]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[149]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[150]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[151]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[152]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[153]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[154]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[155]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getMainProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[156]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[157]);
            	}

            a11=(Token)match(input,49,FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1136); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_10, null, true);
            		copyLocalizationInfos((CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[158]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[159]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[160]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[161]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[162]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[163]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[164]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[165]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[166]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[167]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[168]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[169]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[170]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[171]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[172]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[173]);
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
    // Kernel.g:1473:1: parse_org_servicifi_gelato_language_kernel_statements_WhileLoop returns [org.servicifi.gelato.language.kernel.statements.WhileLoop element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';' ;
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
            // Kernel.g:1476:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';' )
            // Kernel.g:1477:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';'
            {
            // Kernel.g:1477:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1478:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1169); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[174]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1190); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[175]);
            	}

            a2=(Token)match(input,44,FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1204); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[176]);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1218); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[177]);
            	}

            // Kernel.g:1555:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:1556:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1236);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[178]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1254); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[179]);
            	}

            a6=(Token)match(input,24,FOLLOW_24_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1268); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[180]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[181]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[182]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[183]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[184]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[185]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[186]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[187]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[188]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[189]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[190]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[191]);
            	}

            // Kernel.g:1620:2: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:1621:3: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1286);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[192]);
            	}

            a8=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1304); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[193]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[194]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[195]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[196]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[197]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[198]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[199]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[200]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[201]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[202]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[203]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[204]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[205]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[206]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[207]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[208]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[209]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[210]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[211]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[212]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[213]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[214]);
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
    // Kernel.g:1683:1: parse_org_servicifi_gelato_language_kernel_statements_Condition returns [org.servicifi.gelato.language.kernel.statements.Condition element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';' ;
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
            // Kernel.g:1686:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';' )
            // Kernel.g:1687:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';'
            {
            // Kernel.g:1687:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1688:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1337); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[215]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1358); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[216]);
            	}

            a2=(Token)match(input,28,FOLLOW_28_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1372); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[217]);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1386); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[218]);
            	}

            // Kernel.g:1765:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:1766:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1404);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[219]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1422); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[220]);
            	}

            a6=(Token)match(input,39,FOLLOW_39_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1436); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[221]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[222]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[223]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[224]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[225]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[226]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[227]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[228]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[229]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[230]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[231]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[232]);
            	}

            // Kernel.g:1830:2: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:1831:3: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1454);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[233]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[234]);
            	}

            // Kernel.g:1857:2: ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Kernel.g:1858:3: (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    {
                    // Kernel.g:1858:3: (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    // Kernel.g:1859:4: a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    {
                    a8=(Token)match(input,25,FOLLOW_25_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1481); if (state.failed) return element;

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
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[235]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[236]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[237]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[238]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[239]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[240]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[241]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[242]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[243]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[244]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[245]);
                    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[246]);
                    			}

                    // Kernel.g:1884:4: (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    // Kernel.g:1885:5: a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1507);
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[247]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[248]);
            	}

            a10=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1548); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[249]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[250]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[251]);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[263]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[264]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[265]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[266]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[267]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[268]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[269]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[270]);
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
    // Kernel.g:1954:1: parse_org_servicifi_gelato_language_kernel_statements_Goto returns [org.servicifi.gelato.language.kernel.statements.Goto element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= IDENTIFIER ) a4= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Goto parse_org_servicifi_gelato_language_kernel_statements_Goto() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Goto element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            // Kernel.g:1957:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= IDENTIFIER ) a4= ';' )
            // Kernel.g:1958:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= IDENTIFIER ) a4= ';'
            {
            // Kernel.g:1958:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1959:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1581); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[271]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1602); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[272]);
            	}

            a2=(Token)match(input,27,FOLLOW_27_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1616); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[273]);
            	}

            // Kernel.g:2022:2: (a3= IDENTIFIER )
            // Kernel.g:2023:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1634); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.language.kernel.commons.LabellableElement proxy = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.language.kernel.commons.LabellableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getJumpTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), resolved, proxy);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[274]);
            	}

            a4=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1655); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[275]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[276]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[277]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[278]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[279]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[280]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[281]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[282]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[283]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[284]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[285]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[286]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[287]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[288]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[289]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[290]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[291]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[292]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[293]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[294]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[295]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[296]);
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
    // Kernel.g:2099:1: parse_org_servicifi_gelato_language_kernel_statements_Block returns [org.servicifi.gelato.language.kernel.statements.Block element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}' ;
    public final org.servicifi.gelato.language.kernel.statements.Block parse_org_servicifi_gelato_language_kernel_statements_Block() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Block element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;




        try {
            // Kernel.g:2102:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}' )
            // Kernel.g:2103:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}'
            {
            // Kernel.g:2103:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2104:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Block1688); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[297]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Block1709); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[298]);
            	}

            a2=(Token)match(input,46,FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_statements_Block1723); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[299]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[300]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[301]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[302]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[303]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[304]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[305]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[306]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[307]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[308]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[309]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[310]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[311]);
            	}

            // Kernel.g:2179:2: ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==CHARACTER_LITERAL||LA15_0==16||LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Kernel.g:2180:3: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2180:3: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2181:4: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Block1746);
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
            	    break loop15;
                }
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[312]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[313]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[314]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[315]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[316]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[317]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[318]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[319]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[320]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[321]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[322]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[323]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[324]);
            	}

            a4=(Token)match(input,49,FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_statements_Block1772); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[325]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[326]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[327]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[328]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[329]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[330]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[331]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[332]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[333]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[334]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[335]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[336]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[337]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[338]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[339]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[340]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[341]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[342]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[343]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[344]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[345]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[346]);
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
    // Kernel.g:2256:1: parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock returns [org.servicifi.gelato.language.kernel.statements.ParallelBlock element = null] : a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}' ;
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
            // Kernel.g:2259:2: (a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}' )
            // Kernel.g:2260:2: a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}'
            {
            a0=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1801); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[347]);
            	}

            a1=(Token)match(input,32,FOLLOW_32_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1815); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[348]);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1829); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[349]);
            	}

            // Kernel.g:2302:2: ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) )
            // Kernel.g:2303:3: (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' )
            {
            // Kernel.g:2303:3: (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 36:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // Kernel.g:2304:4: a3= 'l2r'
                    {
                    a3=(Token)match(input,30,FOLLOW_30_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1852); if (state.failed) return element;

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
                    // Kernel.g:2317:8: a4= 'r2l'
                    {
                    a4=(Token)match(input,36,FOLLOW_36_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1867); if (state.failed) return element;

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
                    // Kernel.g:2330:8: a5= 'interleaved'
                    {
                    a5=(Token)match(input,29,FOLLOW_29_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1882); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[350]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[351]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[352]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[353]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[354]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[355]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[356]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[357]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[358]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[359]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[360]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[361]);
            	}

            // Kernel.g:2361:2: ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==CHARACTER_LITERAL||LA17_0==16||LA17_0==47) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Kernel.g:2362:3: (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2362:3: (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2363:4: a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1912);
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
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[362]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[363]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[364]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[365]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[366]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[367]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[368]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[369]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[370]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[371]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[372]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getParallelBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[373]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[374]);
            	}

            a9=(Token)match(input,10,FOLLOW_10_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1938); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[375]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[376]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[377]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[378]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[379]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[380]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[381]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[382]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[383]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[384]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[385]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[386]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[387]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[388]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[389]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[390]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[391]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[392]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[393]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[394]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[395]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[396]);
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
    // Kernel.g:2438:1: parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock returns [org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element = null] : a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+ ;
    public final org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element =  null;


        Token a0=null;
        Token a1=null;
        org.servicifi.gelato.language.kernel.statements.Statement a2_0 =null;




        try {
            // Kernel.g:2441:2: (a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+ )
            // Kernel.g:2442:2: a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1967); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[397]);
            	}

            a1=(Token)match(input,48,FOLLOW_48_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1981); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[398]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[399]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[400]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[401]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[402]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[403]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[404]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[405]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[406]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[407]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[408]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[409]);
            	}

            // Kernel.g:2481:2: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case CHARACTER_LITERAL:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred19_Kernel()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 47:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred19_Kernel()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 16:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred19_Kernel()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // Kernel.g:2482:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:2482:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:2483:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2483:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2484:5: a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock2010);
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
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[410]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[411]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[412]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[413]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[414]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[415]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[416]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[417]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[418]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[419]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[420]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[421]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[422]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[423]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[424]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[425]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[426]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[427]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[428]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[429]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[430]);
            	    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[431]);
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[432]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[433]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[434]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[435]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[436]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[437]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[438]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[439]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[440]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[441]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[442]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getNonDeterministicBlock(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[443]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[444]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[445]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[446]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[447]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[448]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[449]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[450]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[451]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[452]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[453]);
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



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement"
    // Kernel.g:2560:1: parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement returns [org.servicifi.gelato.language.kernel.statements.AssignmentStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' (a2= IDENTIFIER ) a3= ':=' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.AssignmentStatement parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.AssignmentStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a4_0 =null;




        try {
            // Kernel.g:2563:2: ( (a0= CHARACTER_LITERAL ) a1= ':' (a2= IDENTIFIER ) a3= ':=' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ';' )
            // Kernel.g:2564:2: (a0= CHARACTER_LITERAL ) a1= ':' (a2= IDENTIFIER ) a3= ':=' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ';'
            {
            // Kernel.g:2564:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2565:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2070); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__LABEL), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[454]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2091); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[455]);
            	}

            // Kernel.g:2614:2: (a2= IDENTIFIER )
            // Kernel.g:2615:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2109); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ASSIGNMENT_STATEMENT__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_2, proxy, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            				copyLocalizationInfos((CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[456]);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2130); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[457]);
            	}

            // Kernel.g:2668:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:2669:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2148);
            a4_0=parse_org_servicifi_gelato_language_kernel_expressions_Expression();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[458]);
            	}

            a5=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2166); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[459]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[460]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[461]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[462]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[463]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[464]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[465]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[466]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[467]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[468]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[469]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[470]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[471]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[472]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[473]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[474]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[475]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[476]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[477]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[478]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[479]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[480]);
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
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement"
    // Kernel.g:2731:1: parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement returns [org.servicifi.gelato.language.kernel.statements.ExpressionStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.ExpressionStatement parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExpressionStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a2_0 =null;




        try {
            // Kernel.g:2734:2: ( (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';' )
            // Kernel.g:2735:2: (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';'
            {
            // Kernel.g:2735:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2736:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2199); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXPRESSION_STATEMENT__LABEL), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[481]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2220); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[482]);
            	}

            // Kernel.g:2785:2: (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:2786:3: a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2238);
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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[483]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2256); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[484]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[485]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[486]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[487]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[488]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[489]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[490]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[491]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[492]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[493]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[494]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[495]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[496]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[497]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[498]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[499]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[500]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[501]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[502]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[503]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[504]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[505]);
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
    // Kernel.g:2848:1: parse_org_servicifi_gelato_language_kernel_statements_StatementWithException returns [org.servicifi.gelato.language.kernel.statements.StatementWithException element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+ ;
    public final org.servicifi.gelato.language.kernel.statements.StatementWithException parse_org_servicifi_gelato_language_kernel_statements_StatementWithException() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.StatementWithException element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;

        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement a5_0 =null;




        try {
            // Kernel.g:2851:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+ )
            // Kernel.g:2852:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+
            {
            // Kernel.g:2852:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2853:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2289); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.STATEMENT_WITH_EXCEPTION__LABEL), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[506]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2310); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[507]);
            	}

            a2=(Token)match(input,40,FOLLOW_40_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2324); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[508]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[509]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[510]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[511]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[512]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[513]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[514]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[515]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[516]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[517]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[518]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[519]);
            	}

            // Kernel.g:2927:2: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:2928:3: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2342);
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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[520]);
            	}

            a4=(Token)match(input,45,FOLLOW_45_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2360); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_5, null, true);
            		copyLocalizationInfos((CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[521]);
            	}

            // Kernel.g:2967:2: ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==CHARACTER_LITERAL) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred20_Kernel()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // Kernel.g:2968:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
            	    {
            	    // Kernel.g:2968:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
            	    // Kernel.g:2969:4: a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2383);
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
            	    					retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_6, a5_0, true);
            	    					copyLocalizationInfos(a5_0, element);
            	    				}
            	    			}

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[522]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[523]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[524]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[525]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[526]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[527]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[528]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[529]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[530]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[531]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[532]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[533]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[534]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[535]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[536]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[537]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[538]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[539]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[540]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[541]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[542]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[543]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[544]);
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
    // Kernel.g:3019:1: parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement returns [org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ;
    public final org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;




        try {
            // Kernel.g:3022:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            // Kernel.g:3023:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            {
            // Kernel.g:3023:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3024:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2428); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.EXCEPTION_HANDLER_STATEMENT__LABEL), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[545]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2449); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[546]);
            	}

            a2=(Token)match(input,26,FOLLOW_26_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2463); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[547]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[548]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[549]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[550]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[551]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[552]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[553]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[554]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[555]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[556]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[557]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExceptionHandlerStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[558]);
            	}

            // Kernel.g:3098:2: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:3099:3: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2481);
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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_3, a3_0, true);
            				copyLocalizationInfos(a3_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[559]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[560]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[561]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[562]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[563]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[564]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[565]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[566]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[567]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[568]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[569]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[570]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[571]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[572]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[573]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[574]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[575]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[576]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[577]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[578]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[579]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[580]);
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
    // Kernel.g:3147:1: parse_org_servicifi_gelato_language_kernel_statements_Abort returns [org.servicifi.gelato.language.kernel.statements.Abort element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Abort parse_org_servicifi_gelato_language_kernel_statements_Abort() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Abort element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3150:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';' )
            // Kernel.g:3151:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';'
            {
            // Kernel.g:3151:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3152:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2518); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.ABORT__LABEL), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[581]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2539); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[582]);
            	}

            a2=(Token)match(input,20,FOLLOW_20_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2553); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[583]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2567); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[584]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[585]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[586]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[587]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[588]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[589]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[590]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[591]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[592]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[593]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[594]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[595]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[596]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[597]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[598]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[599]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[600]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[601]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[602]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[603]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[604]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[605]);
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
    // Kernel.g:3252:1: parse_org_servicifi_gelato_language_kernel_statements_Skip returns [org.servicifi.gelato.language.kernel.statements.Skip element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Skip parse_org_servicifi_gelato_language_kernel_statements_Skip() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Skip element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3255:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';' )
            // Kernel.g:3256:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';'
            {
            // Kernel.g:3256:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3257:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2600); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.SKIP__LABEL), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[606]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2621); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[607]);
            	}

            a2=(Token)match(input,38,FOLLOW_38_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2635); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[608]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2649); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[609]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[610]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[611]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[612]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[613]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[614]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[615]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[616]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[617]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[618]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[619]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[620]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[621]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[622]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[623]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[624]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[625]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[626]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[627]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[628]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[629]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[630]);
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



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall"
    // Kernel.g:3357:1: parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall returns [org.servicifi.gelato.language.kernel.statements.ProcedureCall element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';' ;
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
            // Kernel.g:3360:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';' )
            // Kernel.g:3361:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';'
            {
            // Kernel.g:3361:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3362:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2682); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[631]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2703); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[632]);
            	}

            a2=(Token)match(input,22,FOLLOW_22_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2717); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[633]);
            	}

            // Kernel.g:3425:2: (a3= IDENTIFIER )
            // Kernel.g:3426:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2735); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[634]);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2756); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[635]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[636]);
            	}

            // Kernel.g:3480:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37||LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Kernel.g:3481:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* )
                    {
                    // Kernel.g:3481:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* )
                    // Kernel.g:3482:4: (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )*
                    {
                    // Kernel.g:3482:4: (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    // Kernel.g:3483:5: a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2785);
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[637]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[638]);
                    			}

                    // Kernel.g:3509:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==11) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Kernel.g:3510:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) )
                    	    {
                    	    // Kernel.g:3510:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) )
                    	    // Kernel.g:3511:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    	    {
                    	    a6=(Token)match(input,11,FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2826); if (state.failed) return element;

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
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[639]);
                    	    					}

                    	    // Kernel.g:3525:6: (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    	    // Kernel.g:3526:7: a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2860);
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
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[640]);
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[641]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[642]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[643]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[644]);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2934); if (state.failed) return element;

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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[645]);
            	}

            a9=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2948); if (state.failed) return element;

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
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[646]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[647]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[648]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[649]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[650]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[651]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[652]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[653]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[654]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[655]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[656]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[657]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[658]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[659]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[660]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[661]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[662]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[663]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[664]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[665]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[666]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[667]);
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
    // Kernel.g:3618:1: parse_org_servicifi_gelato_language_kernel_parameters_Parameter returns [org.servicifi.gelato.language.kernel.parameters.Parameter element = null] : (a0= IDENTIFIER ) ;
    public final org.servicifi.gelato.language.kernel.parameters.Parameter parse_org_servicifi_gelato_language_kernel_parameters_Parameter() throws RecognitionException {
        org.servicifi.gelato.language.kernel.parameters.Parameter element =  null;


        Token a0=null;



        try {
            // Kernel.g:3621:2: ( (a0= IDENTIFIER ) )
            // Kernel.g:3622:2: (a0= IDENTIFIER )
            {
            // Kernel.g:3622:2: (a0= IDENTIFIER )
            // Kernel.g:3623:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2981); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a0).getLine(), ((CommonToken) a0).getCharPositionInLine(), ((CommonToken) a0).getStartIndex(), ((CommonToken) a0).getStopIndex());
            				}
            				java.lang.String resolved = (java.lang.String) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.parameters.ParametersPackage.PARAMETER__NAME), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[668]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[669]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[670]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[671]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[672]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[673]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[674]);
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



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_references_Argument"
    // Kernel.g:3666:1: parse_org_servicifi_gelato_language_kernel_references_Argument returns [org.servicifi.gelato.language.kernel.references.Argument element = null] : ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER ) ;
    public final org.servicifi.gelato.language.kernel.references.Argument parse_org_servicifi_gelato_language_kernel_references_Argument() throws RecognitionException {
        org.servicifi.gelato.language.kernel.references.Argument element =  null;


        Token a0=null;
        Token a1=null;
        Token a3=null;



        try {
            // Kernel.g:3669:2: ( ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER ) )
            // Kernel.g:3670:2: ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER )
            {
            // Kernel.g:3670:2: ( (a0= 'ref' |a1= 'val' ) )
            // Kernel.g:3671:3: (a0= 'ref' |a1= 'val' )
            {
            // Kernel.g:3671:3: (a0= 'ref' |a1= 'val' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==37) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
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
                    // Kernel.g:3672:4: a0= 'ref'
                    {
                    a0=(Token)match(input,37,FOLLOW_37_in_parse_org_servicifi_gelato_language_kernel_references_Argument3026); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createArgument();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_18_0_0_0, true, true);
                    				copyLocalizationInfos((CommonToken)a0, element);
                    				// set value of boolean attribute
                    				Object value = true;
                    				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;
                case 2 :
                    // Kernel.g:3685:8: a1= 'val'
                    {
                    a1=(Token)match(input,42,FOLLOW_42_in_parse_org_servicifi_gelato_language_kernel_references_Argument3041); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.servicifi.gelato.language.kernel.references.ReferencesFactory.eINSTANCE.createArgument();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_18_0_0_0, false, true);
                    				copyLocalizationInfos((CommonToken)a1, element);
                    				// set value of boolean attribute
                    				Object value = false;
                    				element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__BY_REFERENCE), value);
                    				completedElement(value, false);
                    			}

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[675]);
            	}

            // Kernel.g:3705:2: (a3= IDENTIFIER )
            // Kernel.g:3706:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_references_Argument3066); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a3).getLine(), ((CommonToken) a3).getCharPositionInLine(), ((CommonToken) a3).getStartIndex(), ((CommonToken) a3).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.references.ReferencesPackage.ARGUMENT__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_18_0_0_1, proxy, true);
            				copyLocalizationInfos((CommonToken) a3, element);
            				copyLocalizationInfos((CommonToken) a3, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[676]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[677]);
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
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_references_Argument"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_Expression"
    // Kernel.g:3748:1: parse_org_servicifi_gelato_language_kernel_expressions_Expression returns [org.servicifi.gelato.language.kernel.expressions.Expression element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']' ;
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
            // Kernel.g:3751:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']' )
            // Kernel.g:3752:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']'
            {
            // Kernel.g:3752:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3753:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3106); if (state.failed) return element;

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
            				java.lang.Long resolved = (java.lang.Long) resolvedObject;
            				if (resolved != null) {
            					Object value = resolved;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.EXPRESSION__LABEL), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_0, resolved, true);
            				copyLocalizationInfos((CommonToken) a0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[678]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3127); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[679]);
            	}

            a2=(Token)match(input,18,FOLLOW_18_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3141); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_2, null, true);
            		copyLocalizationInfos((CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[680]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[681]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[682]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[683]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[684]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[685]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[686]);
            	}

            // Kernel.g:3822:2: ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21||LA24_0==23||(LA24_0 >= 33 && LA24_0 <= 35)||LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Kernel.g:3823:3: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* )
                    {
                    // Kernel.g:3823:3: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* )
                    // Kernel.g:3824:4: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )*
                    {
                    // Kernel.g:3824:4: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    // Kernel.g:3825:5: a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3170);
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
                    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_3_0_0_0, a3_0, true);
                    						copyLocalizationInfos(a3_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[687]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[688]);
                    			}

                    // Kernel.g:3851:4: ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // Kernel.g:3852:5: (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) )
                    	    {
                    	    // Kernel.g:3852:5: (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) )
                    	    // Kernel.g:3853:6: a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    	    {
                    	    a4=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3211); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_3_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((CommonToken)a4, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[689]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[690]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[691]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[692]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[693]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[694]);
                    	    					}

                    	    // Kernel.g:3872:6: (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    	    // Kernel.g:3873:7: a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3245);
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
                    	    								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_3_0_0_1_0_0_1, a5_0, true);
                    	    								copyLocalizationInfos(a5_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[695]);
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[696]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[697]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[698]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[699]);
            	}

            a6=(Token)match(input,19,FOLLOW_19_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3319); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19_0_0_4, null, true);
            		copyLocalizationInfos((CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[700]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[701]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[702]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[703]);
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
    // Kernel.g:3933:1: parse_org_servicifi_gelato_language_kernel_expressions_Defines returns [org.servicifi.gelato.language.kernel.expressions.Defines element = null] : a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Defines parse_org_servicifi_gelato_language_kernel_expressions_Defines() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Defines element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3936:2: (a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:3937:2: a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3348); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[704]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3362); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[705]);
            	}

            // Kernel.g:3965:2: (a2= IDENTIFIER )
            // Kernel.g:3966:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3380); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_2, proxy, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            				copyLocalizationInfos((CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[706]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3401); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[707]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[708]);
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
    // Kernel.g:4022:1: parse_org_servicifi_gelato_language_kernel_expressions_Uses returns [org.servicifi.gelato.language.kernel.expressions.Uses element = null] : a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Uses parse_org_servicifi_gelato_language_kernel_expressions_Uses() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Uses element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4025:2: (a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4026:2: a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,41,FOLLOW_41_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3430); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[709]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3444); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[710]);
            	}

            // Kernel.g:4054:2: (a2= IDENTIFIER )
            // Kernel.g:4055:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3462); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_2, proxy, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            				copyLocalizationInfos((CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[711]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3483); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[712]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[713]);
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
    // Kernel.g:4111:1: parse_org_servicifi_gelato_language_kernel_expressions_Affects returns [org.servicifi.gelato.language.kernel.expressions.Affects element = null] : a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Affects parse_org_servicifi_gelato_language_kernel_expressions_Affects() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Affects element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4114:2: (a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4115:2: a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3512); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[714]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3526); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[715]);
            	}

            // Kernel.g:4143:2: (a2= IDENTIFIER )
            // Kernel.g:4144:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3544); if (state.failed) return element;

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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_2, proxy, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            				copyLocalizationInfos((CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[716]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3565); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[717]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[718]);
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



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_PostDefines"
    // Kernel.g:4200:1: parse_org_servicifi_gelato_language_kernel_expressions_PostDefines returns [org.servicifi.gelato.language.kernel.expressions.PostDefines element = null] : a0= 'postdefines' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.PostDefines parse_org_servicifi_gelato_language_kernel_expressions_PostDefines() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.PostDefines element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4203:2: (a0= 'postdefines' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4204:2: a0= 'postdefines' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3594); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[719]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3608); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[720]);
            	}

            // Kernel.g:4232:2: (a2= IDENTIFIER )
            // Kernel.g:4233:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3626); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_DEFINES__TARGET), value);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[721]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3647); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[722]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[723]);
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
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_PostDefines"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_PreUses"
    // Kernel.g:4289:1: parse_org_servicifi_gelato_language_kernel_expressions_PreUses returns [org.servicifi.gelato.language.kernel.expressions.PreUses element = null] : a0= 'preuses' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.PreUses parse_org_servicifi_gelato_language_kernel_expressions_PreUses() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.PreUses element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4292:2: (a0= 'preuses' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4293:2: a0= 'preuses' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3676); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[724]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3690); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[725]);
            	}

            // Kernel.g:4321:2: (a2= IDENTIFIER )
            // Kernel.g:4322:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3708); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.PRE_USES__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_2, proxy, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            				copyLocalizationInfos((CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[726]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3729); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[727]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[728]);
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
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_PreUses"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_PostAffects"
    // Kernel.g:4378:1: parse_org_servicifi_gelato_language_kernel_expressions_PostAffects returns [org.servicifi.gelato.language.kernel.expressions.PostAffects element = null] : a0= 'postaffects' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.PostAffects parse_org_servicifi_gelato_language_kernel_expressions_PostAffects() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.PostAffects element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4381:2: (a0= 'postaffects' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4382:2: a0= 'postaffects' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3758); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_0, null, true);
            		copyLocalizationInfos((CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[729]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3772); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_1, null, true);
            		copyLocalizationInfos((CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[730]);
            	}

            // Kernel.g:4410:2: (a2= IDENTIFIER )
            // Kernel.g:4411:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3790); if (state.failed) return element;

            if ( state.backtracking==0 ) {
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
            					addErrorToResource(result.getErrorMessage(), ((CommonToken) a2).getLine(), ((CommonToken) a2).getCharPositionInLine(), ((CommonToken) a2).getStartIndex(), ((CommonToken) a2).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.language.kernel.references.ReferenceableElement proxy = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver()), element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), resolved, proxy);
            				if (proxy != null) {
            					Object value = proxy;
            					element.eSet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.POST_AFFECTS__TARGET), value);
            					completedElement(value, false);
            				}
            				collectHiddenTokens(element);
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_2, proxy, true);
            				copyLocalizationInfos((CommonToken) a2, element);
            				copyLocalizationInfos((CommonToken) a2, proxy);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[731]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3811); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_3, null, true);
            		copyLocalizationInfos((CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[732]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[733]);
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
    // $ANTLR end "parse_org_servicifi_gelato_language_kernel_expressions_PostAffects"



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_statements_Statement"
    // Kernel.g:4467:1: parse_org_servicifi_gelato_language_kernel_statements_Statement returns [org.servicifi.gelato.language.kernel.statements.Statement element = null] : (c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop |c1= parse_org_servicifi_gelato_language_kernel_statements_Condition |c2= parse_org_servicifi_gelato_language_kernel_statements_Goto |c3= parse_org_servicifi_gelato_language_kernel_statements_Block |c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock |c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock |c6= parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement |c7= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement |c8= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException |c9= parse_org_servicifi_gelato_language_kernel_statements_Abort |c10= parse_org_servicifi_gelato_language_kernel_statements_Skip |c11= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall );
    public final org.servicifi.gelato.language.kernel.statements.Statement parse_org_servicifi_gelato_language_kernel_statements_Statement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Statement element =  null;


        org.servicifi.gelato.language.kernel.statements.WhileLoop c0 =null;

        org.servicifi.gelato.language.kernel.statements.Condition c1 =null;

        org.servicifi.gelato.language.kernel.statements.Goto c2 =null;

        org.servicifi.gelato.language.kernel.statements.Block c3 =null;

        org.servicifi.gelato.language.kernel.statements.ParallelBlock c4 =null;

        org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock c5 =null;

        org.servicifi.gelato.language.kernel.statements.AssignmentStatement c6 =null;

        org.servicifi.gelato.language.kernel.statements.ExpressionStatement c7 =null;

        org.servicifi.gelato.language.kernel.statements.StatementWithException c8 =null;

        org.servicifi.gelato.language.kernel.statements.Abort c9 =null;

        org.servicifi.gelato.language.kernel.statements.Skip c10 =null;

        org.servicifi.gelato.language.kernel.statements.ProcedureCall c11 =null;


        try {
            // Kernel.g:4468:2: (c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop |c1= parse_org_servicifi_gelato_language_kernel_statements_Condition |c2= parse_org_servicifi_gelato_language_kernel_statements_Goto |c3= parse_org_servicifi_gelato_language_kernel_statements_Block |c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock |c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock |c6= parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement |c7= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement |c8= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException |c9= parse_org_servicifi_gelato_language_kernel_statements_Abort |c10= parse_org_servicifi_gelato_language_kernel_statements_Skip |c11= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall )
            int alt25=12;
            switch ( input.LA(1) ) {
            case CHARACTER_LITERAL:
                {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==12) ) {
                    switch ( input.LA(3) ) {
                    case 44:
                        {
                        alt25=1;
                        }
                        break;
                    case 28:
                        {
                        alt25=2;
                        }
                        break;
                    case 27:
                        {
                        alt25=3;
                        }
                        break;
                    case 46:
                        {
                        alt25=4;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt25=7;
                        }
                        break;
                    case CHARACTER_LITERAL:
                        {
                        alt25=8;
                        }
                        break;
                    case 40:
                        {
                        alt25=9;
                        }
                        break;
                    case 20:
                        {
                        alt25=10;
                        }
                        break;
                    case 38:
                        {
                        alt25=11;
                        }
                        break;
                    case 22:
                        {
                        alt25=12;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;

                }
                }
                break;
            case 47:
                {
                alt25=5;
                }
                break;
            case 16:
                {
                alt25=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // Kernel.g:4469:2: c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3836);
                    c0=parse_org_servicifi_gelato_language_kernel_statements_WhileLoop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:4470:4: c1= parse_org_servicifi_gelato_language_kernel_statements_Condition
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Condition_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3846);
                    c1=parse_org_servicifi_gelato_language_kernel_statements_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Kernel.g:4471:4: c2= parse_org_servicifi_gelato_language_kernel_statements_Goto
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Goto_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3856);
                    c2=parse_org_servicifi_gelato_language_kernel_statements_Goto();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Kernel.g:4472:4: c3= parse_org_servicifi_gelato_language_kernel_statements_Block
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Block_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3866);
                    c3=parse_org_servicifi_gelato_language_kernel_statements_Block();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Kernel.g:4473:4: c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3876);
                    c4=parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Kernel.g:4474:4: c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3886);
                    c5=parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Kernel.g:4475:4: c6= parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3896);
                    c6=parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // Kernel.g:4476:4: c7= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3906);
                    c7=parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // Kernel.g:4477:4: c8= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3916);
                    c8=parse_org_servicifi_gelato_language_kernel_statements_StatementWithException();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 10 :
                    // Kernel.g:4478:4: c9= parse_org_servicifi_gelato_language_kernel_statements_Abort
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Abort_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3926);
                    c9=parse_org_servicifi_gelato_language_kernel_statements_Abort();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c9; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 11 :
                    // Kernel.g:4479:4: c10= parse_org_servicifi_gelato_language_kernel_statements_Skip
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Skip_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3936);
                    c10=parse_org_servicifi_gelato_language_kernel_statements_Skip();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c10; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 12 :
                    // Kernel.g:4480:4: c11= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3946);
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



    // $ANTLR start "parse_org_servicifi_gelato_language_kernel_expressions_SubExpression"
    // Kernel.g:4484:1: parse_org_servicifi_gelato_language_kernel_expressions_SubExpression returns [org.servicifi.gelato.language.kernel.expressions.SubExpression element = null] : (c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines |c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses |c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects |c3= parse_org_servicifi_gelato_language_kernel_expressions_PostDefines |c4= parse_org_servicifi_gelato_language_kernel_expressions_PreUses |c5= parse_org_servicifi_gelato_language_kernel_expressions_PostAffects );
    public final org.servicifi.gelato.language.kernel.expressions.SubExpression parse_org_servicifi_gelato_language_kernel_expressions_SubExpression() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.SubExpression element =  null;


        org.servicifi.gelato.language.kernel.expressions.Defines c0 =null;

        org.servicifi.gelato.language.kernel.expressions.Uses c1 =null;

        org.servicifi.gelato.language.kernel.expressions.Affects c2 =null;

        org.servicifi.gelato.language.kernel.expressions.PostDefines c3 =null;

        org.servicifi.gelato.language.kernel.expressions.PreUses c4 =null;

        org.servicifi.gelato.language.kernel.expressions.PostAffects c5 =null;


        try {
            // Kernel.g:4485:2: (c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines |c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses |c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects |c3= parse_org_servicifi_gelato_language_kernel_expressions_PostDefines |c4= parse_org_servicifi_gelato_language_kernel_expressions_PreUses |c5= parse_org_servicifi_gelato_language_kernel_expressions_PostAffects )
            int alt26=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 21:
                {
                alt26=3;
                }
                break;
            case 34:
                {
                alt26=4;
                }
                break;
            case 35:
                {
                alt26=5;
                }
                break;
            case 33:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Kernel.g:4486:2: c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Defines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3967);
                    c0=parse_org_servicifi_gelato_language_kernel_expressions_Defines();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:4487:4: c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Uses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3977);
                    c1=parse_org_servicifi_gelato_language_kernel_expressions_Uses();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Kernel.g:4488:4: c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Affects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3987);
                    c2=parse_org_servicifi_gelato_language_kernel_expressions_Affects();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Kernel.g:4489:4: c3= parse_org_servicifi_gelato_language_kernel_expressions_PostDefines
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3997);
                    c3=parse_org_servicifi_gelato_language_kernel_expressions_PostDefines();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Kernel.g:4490:4: c4= parse_org_servicifi_gelato_language_kernel_expressions_PreUses
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PreUses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression4007);
                    c4=parse_org_servicifi_gelato_language_kernel_expressions_PreUses();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Kernel.g:4491:4: c5= parse_org_servicifi_gelato_language_kernel_expressions_PostAffects
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression4017);
                    c5=parse_org_servicifi_gelato_language_kernel_expressions_PostAffects();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

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

    // $ANTLR start synpred19_Kernel
    public final void synpred19_Kernel_fragment() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Statement a2_0 =null;


        // Kernel.g:2482:3: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )
        // Kernel.g:2482:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
        {
        // Kernel.g:2482:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
        // Kernel.g:2483:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
        {
        // Kernel.g:2483:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
        // Kernel.g:2484:5: a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
        {
        pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_synpred19_Kernel2010);
        a2_0=parse_org_servicifi_gelato_language_kernel_statements_Statement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }

    }
    // $ANTLR end synpred19_Kernel

    // $ANTLR start synpred20_Kernel
    public final void synpred20_Kernel_fragment() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement a5_0 =null;


        // Kernel.g:2968:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )
        // Kernel.g:2968:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
        {
        // Kernel.g:2968:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
        // Kernel.g:2969:4: a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement
        {
        pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_synpred20_Kernel2383);
        a5_0=parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred20_Kernel

    // Delegated rules

    public final boolean synpred20_Kernel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Kernel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Kernel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Kernel_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit130 = new BitSet(new long[]{0x0000080000000030L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit175 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit208 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_43_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure351 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure372 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure386 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure415 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure461 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure490 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure531 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure565 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure639 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure653 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure682 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure702 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure791 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure812 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure826 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure840 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure854 = new BitSet(new long[]{0x0000000000000220L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure883 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure924 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_parameters_Parameter_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure958 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1032 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1046 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1075 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1095 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1169 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1190 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1204 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1236 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1254 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1268 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1286 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1358 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1372 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1404 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1422 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1436 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1454 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1481 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1507 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1581 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1602 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1616 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Block1688 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Block1709 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_statements_Block1723 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Block1746 = new BitSet(new long[]{0x0002800000010010L});
    public static final BitSet FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_statements_Block1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1801 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1815 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1829 = new BitSet(new long[]{0x0000001060000000L});
    public static final BitSet FOLLOW_30_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1852 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_36_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1867 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_29_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1882 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1912 = new BitSet(new long[]{0x0000800000010410L});
    public static final BitSet FOLLOW_10_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1967 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1981 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock2010 = new BitSet(new long[]{0x0000800000010012L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2070 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2109 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2130 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2148 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2199 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2238 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2289 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2310 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2324 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2342 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2383 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2428 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2449 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2463 = new BitSet(new long[]{0x0000800000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2518 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2539 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2553 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2621 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2635 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2682 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2703 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2717 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2735 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2756 = new BitSet(new long[]{0x0000042000000200L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2785 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2826 = new BitSet(new long[]{0x0000042000000000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2860 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2934 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_org_servicifi_gelato_language_kernel_references_Argument3026 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42_in_parse_org_servicifi_gelato_language_kernel_references_Argument3041 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_references_Argument3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3106 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3127 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3141 = new BitSet(new long[]{0x0000020E00A80000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3170 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3211 = new BitSet(new long[]{0x0000020E00A00000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3245 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3348 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3380 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3462 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3512 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3544 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3594 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3676 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3708 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3758 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3772 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3790 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Condition_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Goto_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Block_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Abort_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Skip_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Defines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Uses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Affects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PreUses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression4007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_synpred19_Kernel2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_synpred20_Kernel2383 = new BitSet(new long[]{0x0000000000000002L});

}