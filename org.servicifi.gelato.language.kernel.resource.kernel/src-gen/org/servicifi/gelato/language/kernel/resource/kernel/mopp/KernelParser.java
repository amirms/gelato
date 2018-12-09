// $ANTLR 3.4

	package org.servicifi.gelato.language.kernel.resource.kernel.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class KernelParser extends KernelANTLRParserBase {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHARACTER_LITERAL", "IDENTIFIER", "SL_COMMENT", "WHITESPACE", "'('", "')'", "'*}'", "','", "':'", "':='", "';'", "'='", "'>'", "'Procedure'", "'['", "']'", "'abort'", "'affects'", "'call'", "'defines'", "'do'", "'else'", "'exception'", "'goto'", "'if'", "'interleaved'", "'l2r'", "'main'", "'order'", "'postaffects'", "'postdefines'", "'preuses'", "'r2l'", "'ref'", "'return'", "'skip'", "'then'", "'try'", "'uses'", "'val'", "'var'", "'while'", "'with'", "'{'", "'{*'", "'|'", "'}'"
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
    public static final int T__50=50;
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
    	



    // $ANTLR start "start"
    // Kernel.g:577:1: start returns [ org.eclipse.emf.ecore.EObject element = null] : (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF ;
    public final org.eclipse.emf.ecore.EObject start() throws RecognitionException {
        org.eclipse.emf.ecore.EObject element =  null;


        org.servicifi.gelato.language.kernel.containers.CompilationUnit c0 =null;


        try {
            // Kernel.g:578:2: ( (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF )
            // Kernel.g:579:2: (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit ) EOF
            {
            if ( state.backtracking==0 ) {
            		// follow set for start rule(s)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[0]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[1]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[2]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[3]);
            		expectedElementsIndexOfLastCompleteElement = 0;
            	}

            // Kernel.g:587:2: (c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit )
            // Kernel.g:588:3: c0= parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit
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
    // Kernel.g:596:1: parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit returns [org.servicifi.gelato.language.kernel.containers.CompilationUnit element = null] : ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) ;
    public final org.servicifi.gelato.language.kernel.containers.CompilationUnit parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit() throws RecognitionException {
        org.servicifi.gelato.language.kernel.containers.CompilationUnit element =  null;


        org.servicifi.gelato.language.kernel.dataitems.DataItem a0_0 =null;

        org.servicifi.gelato.language.kernel.procedures.Procedure a1_0 =null;

        org.servicifi.gelato.language.kernel.procedures.MainProcedure a2_0 =null;




        try {
            // Kernel.g:599:2: ( ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure ) )
            // Kernel.g:600:2: ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )* ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )* (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure )
            {
            // Kernel.g:600:2: ( ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==IDENTIFIER||LA1_0==44) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Kernel.g:601:3: ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) )
            	    {
            	    // Kernel.g:601:3: ( (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem ) )
            	    // Kernel.g:602:4: (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem )
            	    {
            	    // Kernel.g:602:4: (a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem )
            	    // Kernel.g:603:5: a0_0= parse_org_servicifi_gelato_language_kernel_dataitems_DataItem
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
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[4]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[5]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[6]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[7]);
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
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[8]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[9]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[10]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[11]);
            	}

            // Kernel.g:641:2: ( ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==CHARACTER_LITERAL) ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==12) ) {
                        int LA2_2 = input.LA(3);

                        if ( (LA2_2==17) ) {
                            int LA2_3 = input.LA(4);

                            if ( (LA2_3==IDENTIFIER||LA2_3==8) ) {
                                alt2=1;
                            }


                        }


                    }


                }


                switch (alt2) {
            	case 1 :
            	    // Kernel.g:642:3: ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) )
            	    {
            	    // Kernel.g:642:3: ( (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure ) )
            	    // Kernel.g:643:4: (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure )
            	    {
            	    // Kernel.g:643:4: (a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure )
            	    // Kernel.g:644:5: a1_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
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
            	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_1_0_0_0, a1_0, true);
            	    						copyLocalizationInfos(a1_0, element);
            	    					}
            	    				}

            	    }


            	    if ( state.backtracking==0 ) {
            	    				// expected elements (follow set)
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[12]);
            	    				addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[13]);
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
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[14]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[15]);
            	}

            // Kernel.g:678:2: (a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure )
            // Kernel.g:679:3: a2_0= parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure
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
            				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0_0_0_2, a2_0, true);
            				copyLocalizationInfos(a2_0, element);
            			}
            		}

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
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
    // Kernel.g:705:1: parse_org_servicifi_gelato_language_kernel_dataitems_DataItem returns [org.servicifi.gelato.language.kernel.dataitems.DataItem element = null] : (a0= 'var' (a1= IDENTIFIER ) a2= ';' |c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter );
    public final org.servicifi.gelato.language.kernel.dataitems.DataItem parse_org_servicifi_gelato_language_kernel_dataitems_DataItem() throws RecognitionException {
        org.servicifi.gelato.language.kernel.dataitems.DataItem element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.servicifi.gelato.language.kernel.parameters.Parameter c0 =null;




        try {
            // Kernel.g:708:2: (a0= 'var' (a1= IDENTIFIER ) a2= ';' |c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
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
                    // Kernel.g:709:2: a0= 'var' (a1= IDENTIFIER ) a2= ';'
                    {
                    a0=(Token)match(input,44,FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem264); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_0, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[16]);
                    	}

                    // Kernel.g:723:2: (a1= IDENTIFIER )
                    // Kernel.g:724:3: a1= IDENTIFIER
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

                    }


                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[17]);
                    	}

                    a2=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem303); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    		if (element == null) {
                    			element = org.servicifi.gelato.language.kernel.dataitems.DataitemsFactory.eINSTANCE.createDataItem();
                    			startIncompleteElement(element);
                    		}
                    		collectHiddenTokens(element);
                    		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1_0_0_2, null, true);
                    		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
                    	}

                    if ( state.backtracking==0 ) {
                    		// expected elements (follow set)
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[18]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[19]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[20]);
                    		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[21]);
                    	}

                    }
                    break;
                case 2 :
                    // Kernel.g:778:2: c0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
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
    // Kernel.g:782:1: parse_org_servicifi_gelato_language_kernel_procedures_Procedure returns [org.servicifi.gelato.language.kernel.procedures.Procedure element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' ;
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
            // Kernel.g:785:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}' )
            // Kernel.g:786:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' ( ( (a3= IDENTIFIER ) ) )? a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )? a8= ')' a9= '{' ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a11= '}'
            {
            // Kernel.g:786:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:787:3: a0= CHARACTER_LITERAL
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[22]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure372); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[23]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure386); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[24]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[25]);
            	}

            // Kernel.g:851:2: ( ( (a3= IDENTIFIER ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==IDENTIFIER) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Kernel.g:852:3: ( (a3= IDENTIFIER ) )
                    {
                    // Kernel.g:852:3: ( (a3= IDENTIFIER ) )
                    // Kernel.g:853:4: (a3= IDENTIFIER )
                    {
                    // Kernel.g:853:4: (a3= IDENTIFIER )
                    // Kernel.g:854:5: a3= IDENTIFIER
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

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[26]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[27]);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure461); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[28]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[29]);
            	}

            // Kernel.g:911:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==IDENTIFIER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // Kernel.g:912:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                    {
                    // Kernel.g:912:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )* )
                    // Kernel.g:913:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                    {
                    // Kernel.g:913:4: (a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    // Kernel.g:914:5: a5_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[30]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[31]);
                    			}

                    // Kernel.g:940:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==11) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // Kernel.g:941:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                    	    {
                    	    // Kernel.g:941:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter ) )
                    	    // Kernel.g:942:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    	    {
                    	    a6=(Token)match(input,11,FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure531); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_5_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.procedures.ProceduresPackage.eINSTANCE.getProcedure(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[32]);
                    	    					}

                    	    // Kernel.g:956:6: (a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter )
                    	    // Kernel.g:957:7: a7_0= parse_org_servicifi_gelato_language_kernel_parameters_Parameter
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
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[33]);
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[34]);
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[35]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[36]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[37]);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure639); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[38]);
            	}

            a9=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure653); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:1040:2: ( ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==CHARACTER_LITERAL||LA8_0==16||LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Kernel.g:1041:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:1041:3: ( (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:1042:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:1042:4: (a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure |a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==CHARACTER_LITERAL) ) {
            	        int LA7_1 = input.LA(2);

            	        if ( (LA7_1==12) ) {
            	            int LA7_3 = input.LA(3);

            	            if ( (LA7_3==17) ) {
            	                alt7=1;
            	            }
            	            else if ( ((LA7_3 >= CHARACTER_LITERAL && LA7_3 <= IDENTIFIER)||LA7_3==20||LA7_3==22||(LA7_3 >= 27 && LA7_3 <= 28)||(LA7_3 >= 38 && LA7_3 <= 39)||LA7_3==41||LA7_3==45||LA7_3==47) ) {
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
            	    else if ( (LA7_0==16||LA7_0==48) ) {
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
            	            // Kernel.g:1043:5: a10_0= parse_org_servicifi_gelato_language_kernel_procedures_Procedure
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
            	            // Kernel.g:1062:10: a10_1= parse_org_servicifi_gelato_language_kernel_statements_Statement
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            if ( state.backtracking==0 ) {
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

            a11=(Token)match(input,50,FOLLOW_50_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure743); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a11, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:1153:1: parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure returns [org.servicifi.gelato.language.kernel.procedures.MainProcedure element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' a5= ')' a6= '{' ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a8= '}' ;
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
            // Kernel.g:1156:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' a5= ')' a6= '{' ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a8= '}' )
            // Kernel.g:1157:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'Procedure' a3= 'main' a4= '(' a5= ')' a6= '{' ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )* a8= '}'
            {
            // Kernel.g:1157:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1158:3: a0= CHARACTER_LITERAL
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[100]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure797); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[101]);
            	}

            a2=(Token)match(input,17,FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure811); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[102]);
            	}

            a3=(Token)match(input,31,FOLLOW_31_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure825); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[103]);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure839); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[104]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure853); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[105]);
            	}

            a6=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure867); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:1290:2: ( ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CHARACTER_LITERAL||LA9_0==16||LA9_0==48) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Kernel.g:1291:3: ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:1291:3: ( (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:1292:4: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:1292:4: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:1293:5: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            if ( state.backtracking==0 ) {
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

            a8=(Token)match(input,50,FOLLOW_50_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure937); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.procedures.ProceduresFactory.eINSTANCE.createMainProcedure();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3_0_0_9, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
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
    // Kernel.g:1366:1: parse_org_servicifi_gelato_language_kernel_statements_WhileLoop returns [org.servicifi.gelato.language.kernel.statements.WhileLoop element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';' ;
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
            // Kernel.g:1369:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';' )
            // Kernel.g:1370:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'while' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'do' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a8= ';'
            {
            // Kernel.g:1370:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1371:3: a0= CHARACTER_LITERAL
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[148]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop991); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[149]);
            	}

            a2=(Token)match(input,45,FOLLOW_45_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1005); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[150]);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1019); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getWhileLoop(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[151]);
            	}

            // Kernel.g:1448:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:1449:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[152]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1055); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[153]);
            	}

            a6=(Token)match(input,24,FOLLOW_24_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1069); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:1514:2: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:1515:3: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[167]);
            	}

            a8=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1105); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createWhileLoop();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4_0_0_8, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:1577:1: parse_org_servicifi_gelato_language_kernel_statements_Condition returns [org.servicifi.gelato.language.kernel.statements.Condition element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';' ;
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
            // Kernel.g:1580:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';' )
            // Kernel.g:1581:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'if' a3= '(' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ')' a6= 'then' (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )? a10= ';'
            {
            // Kernel.g:1581:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1582:3: a0= CHARACTER_LITERAL
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[190]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1159); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[191]);
            	}

            a2=(Token)match(input,28,FOLLOW_28_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1173); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[192]);
            	}

            a3=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1187); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getCondition(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[193]);
            	}

            // Kernel.g:1659:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:1660:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[194]);
            	}

            a5=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1223); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[195]);
            	}

            a6=(Token)match(input,40,FOLLOW_40_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1237); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:1725:2: (a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:1726:3: a7_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[209]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[210]);
            	}

            // Kernel.g:1752:2: ( (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Kernel.g:1753:3: (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    {
                    // Kernel.g:1753:3: (a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
                    // Kernel.g:1754:4: a8= 'else' (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    {
                    a8=(Token)match(input,25,FOLLOW_25_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1282); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
                    				if (element == null) {
                    					element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
                    					startIncompleteElement(element);
                    				}
                    				collectHiddenTokens(element);
                    				retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_9_0_0_1, null, true);
                    				copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
                    			}

                    if ( state.backtracking==0 ) {
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

                    // Kernel.g:1780:4: (a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
                    // Kernel.g:1781:5: a9_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[224]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[225]);
            	}

            a10=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1349); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5_0_0_10, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a10, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:1850:1: parse_org_servicifi_gelato_language_kernel_statements_Goto returns [org.servicifi.gelato.language.kernel.statements.Goto element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= IDENTIFIER ) a4= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Goto parse_org_servicifi_gelato_language_kernel_statements_Goto() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Goto element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a4=null;



        try {
            // Kernel.g:1853:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= IDENTIFIER ) a4= ';' )
            // Kernel.g:1854:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'goto' (a3= IDENTIFIER ) a4= ';'
            {
            // Kernel.g:1854:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:1855:3: a0= CHARACTER_LITERAL
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[248]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1403); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[249]);
            	}

            a2=(Token)match(input,27,FOLLOW_27_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1417); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[250]);
            	}

            // Kernel.g:1918:2: (a3= IDENTIFIER )
            // Kernel.g:1919:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1435); if (state.failed) return element;

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
            					addErrorToResource(result.getErrorMessage(), ((org.antlr.runtime3_4_0.CommonToken) a3).getLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getCharPositionInLine(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStartIndex(), ((org.antlr.runtime3_4_0.CommonToken) a3).getStopIndex());
            				}
            				String resolved = (String) resolvedObject;
            				org.servicifi.gelato.analysis.framework.commons.LabellableElement proxy = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createCondition();
            				collectHiddenTokens(element);
            				registerContextDependentProxy(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelContextDependentURIFragmentFactory<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.analysis.framework.commons.LabellableElement>(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getJumpTargetReferenceResolver()), element, (org.eclipse.emf.ecore.EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.kernel.statements.StatementsPackage.GOTO__TARGET), resolved, proxy);
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[251]);
            	}

            a4=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1456); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createGoto();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:1995:1: parse_org_servicifi_gelato_language_kernel_statements_Block returns [org.servicifi.gelato.language.kernel.statements.Block element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}' ;
    public final org.servicifi.gelato.language.kernel.statements.Block parse_org_servicifi_gelato_language_kernel_statements_Block() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Block element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;




        try {
            // Kernel.g:1998:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}' )
            // Kernel.g:1999:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= '{' ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )* a4= '}'
            {
            // Kernel.g:1999:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2000:3: a0= CHARACTER_LITERAL
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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[274]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Block1510); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[275]);
            	}

            a2=(Token)match(input,47,FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_statements_Block1524); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:2076:2: ( (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==CHARACTER_LITERAL||LA11_0==16||LA11_0==48) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Kernel.g:2077:3: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2077:3: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2078:4: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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

            a4=(Token)match(input,50,FOLLOW_50_in_parse_org_servicifi_gelato_language_kernel_statements_Block1573); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:2154:1: parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock returns [org.servicifi.gelato.language.kernel.statements.ParallelBlock element = null] : a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}' ;
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
            // Kernel.g:2157:2: (a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}' )
            // Kernel.g:2158:2: a0= '{*' a1= 'order' a2= '=' ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) ) ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+ a9= '*}'
            {
            a0=(Token)match(input,48,FOLLOW_48_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1602); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[326]);
            	}

            a1=(Token)match(input,32,FOLLOW_32_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1616); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[327]);
            	}

            a2=(Token)match(input,15,FOLLOW_15_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1630); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[328]);
            	}

            // Kernel.g:2200:2: ( (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' ) )
            // Kernel.g:2201:3: (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' )
            {
            // Kernel.g:2201:3: (a3= 'l2r' |a4= 'r2l' |a5= 'interleaved' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 36:
                {
                alt12=2;
                }
                break;
            case 29:
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
                    // Kernel.g:2202:4: a3= 'l2r'
                    {
                    a3=(Token)match(input,30,FOLLOW_30_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1653); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 2 :
                    // Kernel.g:2215:8: a4= 'r2l'
                    {
                    a4=(Token)match(input,36,FOLLOW_36_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1668); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 3 :
                    // Kernel.g:2228:8: a5= 'interleaved'
                    {
                    a5=(Token)match(input,29,FOLLOW_29_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1683); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
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

            // Kernel.g:2260:2: ( (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==CHARACTER_LITERAL||LA13_0==16||LA13_0==48) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Kernel.g:2261:3: (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2261:3: (a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2262:4: a8_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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

            a9=(Token)match(input,10,FOLLOW_10_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1739); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createParallelBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:2338:1: parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock returns [org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element = null] : a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+ ;
    public final org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock element =  null;


        Token a0=null;
        Token a1=null;
        org.servicifi.gelato.language.kernel.statements.Statement a2_0 =null;




        try {
            // Kernel.g:2341:2: (a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+ )
            // Kernel.g:2342:2: a0= '>' a1= '|' ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+
            {
            a0=(Token)match(input,16,FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1768); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[378]);
            	}

            a1=(Token)match(input,49,FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1782); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createNonDeterministicBlock();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:2382:2: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )+
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
                case 48:
                    {
                    int LA14_3 = input.LA(2);

                    if ( (synpred15_Kernel()) ) {
                        alt14=1;
                    }


                    }
                    break;
                case 16:
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
            	    // Kernel.g:2383:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    {
            	    // Kernel.g:2383:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            	    // Kernel.g:2384:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    {
            	    // Kernel.g:2384:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            	    // Kernel.g:2385:5: a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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
    // Kernel.g:2461:1: parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement returns [org.servicifi.gelato.language.kernel.statements.AssignmentStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' (a2= IDENTIFIER ) a3= ':=' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.AssignmentStatement parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.AssignmentStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;
        Token a5=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a4_0 =null;




        try {
            // Kernel.g:2464:2: ( (a0= CHARACTER_LITERAL ) a1= ':' (a2= IDENTIFIER ) a3= ':=' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ';' )
            // Kernel.g:2465:2: (a0= CHARACTER_LITERAL ) a1= ':' (a2= IDENTIFIER ) a3= ':=' (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a5= ';'
            {
            // Kernel.g:2465:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2466:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1871); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[436]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1892); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[437]);
            	}

            // Kernel.g:2515:2: (a2= IDENTIFIER )
            // Kernel.g:2516:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1910); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[438]);
            	}

            a3=(Token)match(input,13,FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1931); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getAssignmentStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[439]);
            	}

            // Kernel.g:2569:2: (a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:2570:3: a4_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1949);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[440]);
            	}

            a5=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1967); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAssignmentStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a5, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:2632:1: parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement returns [org.servicifi.gelato.language.kernel.statements.ExpressionStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.ExpressionStatement parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExpressionStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a3=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a2_0 =null;




        try {
            // Kernel.g:2635:2: ( (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';' )
            // Kernel.g:2636:2: (a0= CHARACTER_LITERAL ) a1= ':' (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) a3= ';'
            {
            // Kernel.g:2636:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2637:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2000); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[463]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2021); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[464]);
            	}

            // Kernel.g:2686:2: (a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
            // Kernel.g:2687:3: a2_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2039);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[465]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2057); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExpressionStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:2749:1: parse_org_servicifi_gelato_language_kernel_statements_StatementWithException returns [org.servicifi.gelato.language.kernel.statements.StatementWithException element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+ ;
    public final org.servicifi.gelato.language.kernel.statements.StatementWithException parse_org_servicifi_gelato_language_kernel_statements_StatementWithException() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.StatementWithException element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;

        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement a5_0 =null;




        try {
            // Kernel.g:2752:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+ )
            // Kernel.g:2753:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'try' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) a4= 'with' ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+
            {
            // Kernel.g:2753:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2754:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2090); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[488]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2111); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[489]);
            	}

            a2=(Token)match(input,41,FOLLOW_41_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2125); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:2829:2: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:2830:3: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2143);
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
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[503]);
            	}

            a4=(Token)match(input,46,FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2161); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createStatementWithException();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12_0_0_5, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getStatementWithException(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[504]);
            	}

            // Kernel.g:2869:2: ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )+
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
            	    // Kernel.g:2870:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
            	    {
            	    // Kernel.g:2870:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
            	    // Kernel.g:2871:4: a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement
            	    {
            	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2184);
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
    // Kernel.g:2921:1: parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement returns [org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ;
    public final org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        org.servicifi.gelato.language.kernel.statements.Statement a3_0 =null;




        try {
            // Kernel.g:2924:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
            // Kernel.g:2925:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'exception' (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            {
            // Kernel.g:2925:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:2926:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2229); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[528]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2250); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[529]);
            	}

            a2=(Token)match(input,26,FOLLOW_26_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2264); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createExceptionHandlerStatement();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
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

            // Kernel.g:3001:2: (a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
            // Kernel.g:3002:3: a3_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
            {
            pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2282);
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
    // Kernel.g:3050:1: parse_org_servicifi_gelato_language_kernel_statements_Abort returns [org.servicifi.gelato.language.kernel.statements.Abort element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Abort parse_org_servicifi_gelato_language_kernel_statements_Abort() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Abort element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3053:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';' )
            // Kernel.g:3054:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'abort' a3= ';'
            {
            // Kernel.g:3054:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3055:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2319); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[565]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2340); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[566]);
            	}

            a2=(Token)match(input,20,FOLLOW_20_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2354); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[567]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2368); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createAbort();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:3155:1: parse_org_servicifi_gelato_language_kernel_statements_Skip returns [org.servicifi.gelato.language.kernel.statements.Skip element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Skip parse_org_servicifi_gelato_language_kernel_statements_Skip() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Skip element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3158:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';' )
            // Kernel.g:3159:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'skip' a3= ';'
            {
            // Kernel.g:3159:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3160:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2401); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[590]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2422); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[591]);
            	}

            a2=(Token)match(input,39,FOLLOW_39_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2436); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[592]);
            	}

            a3=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2450); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createSkip();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:3260:1: parse_org_servicifi_gelato_language_kernel_statements_Return returns [org.servicifi.gelato.language.kernel.statements.Return element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'return' ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) )? a4= ';' ;
    public final org.servicifi.gelato.language.kernel.statements.Return parse_org_servicifi_gelato_language_kernel_statements_Return() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Return element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a4=null;
        org.servicifi.gelato.language.kernel.expressions.Expression a3_0 =null;




        try {
            // Kernel.g:3263:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'return' ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) )? a4= ';' )
            // Kernel.g:3264:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'return' ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) )? a4= ';'
            {
            // Kernel.g:3264:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3265:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Return2483); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[615]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Return2504); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[616]);
            	}

            a2=(Token)match(input,38,FOLLOW_38_in_parse_org_servicifi_gelato_language_kernel_statements_Return2518); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getReturn(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[617]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[618]);
            	}

            // Kernel.g:3329:2: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==CHARACTER_LITERAL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // Kernel.g:3330:3: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
                    {
                    // Kernel.g:3330:3: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression )
                    // Kernel.g:3331:4: a3_0= parse_org_servicifi_gelato_language_kernel_expressions_Expression
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Return2541);
                    a3_0=parse_org_servicifi_gelato_language_kernel_expressions_Expression();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[619]);
            	}

            a4=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Return2567); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createReturn();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:3394:1: parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall returns [org.servicifi.gelato.language.kernel.statements.ProcedureCall element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';' ;
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
            // Kernel.g:3397:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';' )
            // Kernel.g:3398:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= 'call' (a3= IDENTIFIER ) a4= '(' ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )? a8= ')' a9= ';'
            {
            // Kernel.g:3398:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3399:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2600); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[642]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2621); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[643]);
            	}

            a2=(Token)match(input,22,FOLLOW_22_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2635); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[644]);
            	}

            // Kernel.g:3462:2: (a3= IDENTIFIER )
            // Kernel.g:3463:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2653); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[645]);
            	}

            a4=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2674); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[646]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[647]);
            	}

            // Kernel.g:3517:2: ( ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37||LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Kernel.g:3518:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* )
                    {
                    // Kernel.g:3518:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )* )
                    // Kernel.g:3519:4: (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )*
                    {
                    // Kernel.g:3519:4: (a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    // Kernel.g:3520:5: a5_0= parse_org_servicifi_gelato_language_kernel_references_Argument
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2703);
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
                    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_5_0_0_0, a5_0, true);
                    						copyLocalizationInfos(a5_0, element);
                    					}
                    				}

                    }


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[648]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[649]);
                    			}

                    // Kernel.g:3546:4: ( (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==11) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Kernel.g:3547:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) )
                    	    {
                    	    // Kernel.g:3547:5: (a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument ) )
                    	    // Kernel.g:3548:6: a6= ',' (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    	    {
                    	    a6=(Token)match(input,11,FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2744); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_5_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getProcedureCall(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[650]);
                    	    					}

                    	    // Kernel.g:3562:6: (a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument )
                    	    // Kernel.g:3563:7: a7_0= parse_org_servicifi_gelato_language_kernel_references_Argument
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2778);
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
                    	    								retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_5_0_0_1_0_0_1, a7_0, true);
                    	    								copyLocalizationInfos(a7_0, element);
                    	    							}
                    	    						}

                    	    }


                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[651]);
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[652]);
                    	    					}

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    if ( state.backtracking==0 ) {
                    				// expected elements (follow set)
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[653]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[654]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[655]);
            	}

            a8=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2852); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_6, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a8, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[656]);
            	}

            a9=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2866); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.statements.StatementsFactory.eINSTANCE.createProcedureCall();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17_0_0_7, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a9, element);
            	}

            if ( state.backtracking==0 ) {
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
    // Kernel.g:3655:1: parse_org_servicifi_gelato_language_kernel_parameters_Parameter returns [org.servicifi.gelato.language.kernel.parameters.Parameter element = null] : (a0= IDENTIFIER ) ;
    public final org.servicifi.gelato.language.kernel.parameters.Parameter parse_org_servicifi_gelato_language_kernel_parameters_Parameter() throws RecognitionException {
        org.servicifi.gelato.language.kernel.parameters.Parameter element =  null;


        Token a0=null;



        try {
            // Kernel.g:3658:2: ( (a0= IDENTIFIER ) )
            // Kernel.g:3659:2: (a0= IDENTIFIER )
            {
            // Kernel.g:3659:2: (a0= IDENTIFIER )
            // Kernel.g:3660:3: a0= IDENTIFIER
            {
            a0=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2899); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[679]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[680]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[681]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[682]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[683]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[684]);
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
    // Kernel.g:3702:1: parse_org_servicifi_gelato_language_kernel_references_Argument returns [org.servicifi.gelato.language.kernel.references.Argument element = null] : ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER ) ;
    public final org.servicifi.gelato.language.kernel.references.Argument parse_org_servicifi_gelato_language_kernel_references_Argument() throws RecognitionException {
        org.servicifi.gelato.language.kernel.references.Argument element =  null;


        Token a0=null;
        Token a1=null;
        Token a3=null;



        try {
            // Kernel.g:3705:2: ( ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER ) )
            // Kernel.g:3706:2: ( (a0= 'ref' |a1= 'val' ) ) (a3= IDENTIFIER )
            {
            // Kernel.g:3706:2: ( (a0= 'ref' |a1= 'val' ) )
            // Kernel.g:3707:3: (a0= 'ref' |a1= 'val' )
            {
            // Kernel.g:3707:3: (a0= 'ref' |a1= 'val' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==43) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // Kernel.g:3708:4: a0= 'ref'
                    {
                    a0=(Token)match(input,37,FOLLOW_37_in_parse_org_servicifi_gelato_language_kernel_references_Argument2944); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;
                case 2 :
                    // Kernel.g:3721:8: a1= 'val'
                    {
                    a1=(Token)match(input,43,FOLLOW_43_in_parse_org_servicifi_gelato_language_kernel_references_Argument2959); if (state.failed) return element;

                    if ( state.backtracking==0 ) {
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

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[685]);
            	}

            // Kernel.g:3741:2: (a3= IDENTIFIER )
            // Kernel.g:3742:3: a3= IDENTIFIER
            {
            a3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_references_Argument2984); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[686]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[687]);
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
    // Kernel.g:3784:1: parse_org_servicifi_gelato_language_kernel_expressions_Expression returns [org.servicifi.gelato.language.kernel.expressions.Expression element = null] : (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']' ;
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
            // Kernel.g:3787:2: ( (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']' )
            // Kernel.g:3788:2: (a0= CHARACTER_LITERAL ) a1= ':' a2= '[' ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )? a6= ']'
            {
            // Kernel.g:3788:2: (a0= CHARACTER_LITERAL )
            // Kernel.g:3789:3: a0= CHARACTER_LITERAL
            {
            a0=(Token)match(input,CHARACTER_LITERAL,FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3024); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[688]);
            	}

            a1=(Token)match(input,12,FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3045); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[689]);
            	}

            a2=(Token)match(input,18,FOLLOW_18_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3059); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_2, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a2, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[690]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[691]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[692]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[693]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[694]);
            		addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[695]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[696]);
            	}

            // Kernel.g:3858:2: ( ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21||LA21_0==23||(LA21_0 >= 33 && LA21_0 <= 35)||LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // Kernel.g:3859:3: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* )
                    {
                    // Kernel.g:3859:3: ( (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )* )
                    // Kernel.g:3860:4: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )*
                    {
                    // Kernel.g:3860:4: (a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    // Kernel.g:3861:5: a3_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3088);
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[697]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[698]);
                    			}

                    // Kernel.g:3887:4: ( (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==14) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // Kernel.g:3888:5: (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) )
                    	    {
                    	    // Kernel.g:3888:5: (a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression ) )
                    	    // Kernel.g:3889:6: a4= ';' (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    	    {
                    	    a4=(Token)match(input,14,FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3129); if (state.failed) return element;

                    	    if ( state.backtracking==0 ) {
                    	    						if (element == null) {
                    	    							element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
                    	    							startIncompleteElement(element);
                    	    						}
                    	    						collectHiddenTokens(element);
                    	    						retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_3_0_0_1_0_0_0, null, true);
                    	    						copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a4, element);
                    	    					}

                    	    if ( state.backtracking==0 ) {
                    	    						// expected elements (follow set)
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[699]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[700]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[701]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[702]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[703]);
                    	    						addExpectedElement(org.servicifi.gelato.language.kernel.expressions.ExpressionsPackage.eINSTANCE.getExpression(), org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[704]);
                    	    					}

                    	    // Kernel.g:3908:6: (a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression )
                    	    // Kernel.g:3909:7: a5_0= parse_org_servicifi_gelato_language_kernel_expressions_SubExpression
                    	    {
                    	    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3163);
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
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[705]);
                    	    						addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[706]);
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
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[707]);
                    				addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[708]);
                    			}

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[709]);
            	}

            a6=(Token)match(input,19,FOLLOW_19_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3237); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createExpression();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20_0_0_4, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a6, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[710]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[711]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[712]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[713]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[714]);
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
    // Kernel.g:3970:1: parse_org_servicifi_gelato_language_kernel_expressions_Defines returns [org.servicifi.gelato.language.kernel.expressions.Defines element = null] : a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Defines parse_org_servicifi_gelato_language_kernel_expressions_Defines() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Defines element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:3973:2: (a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:3974:2: a0= 'defines' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,23,FOLLOW_23_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3266); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[715]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3280); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[716]);
            	}

            // Kernel.g:4002:2: (a2= IDENTIFIER )
            // Kernel.g:4003:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3298); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[717]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3319); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[718]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[719]);
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
    // Kernel.g:4059:1: parse_org_servicifi_gelato_language_kernel_expressions_Uses returns [org.servicifi.gelato.language.kernel.expressions.Uses element = null] : a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Uses parse_org_servicifi_gelato_language_kernel_expressions_Uses() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Uses element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4062:2: (a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4063:2: a0= 'uses' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,42,FOLLOW_42_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3348); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[720]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3362); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[721]);
            	}

            // Kernel.g:4091:2: (a2= IDENTIFIER )
            // Kernel.g:4092:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3380); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[722]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3401); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[723]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[724]);
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
    // Kernel.g:4148:1: parse_org_servicifi_gelato_language_kernel_expressions_Affects returns [org.servicifi.gelato.language.kernel.expressions.Affects element = null] : a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.Affects parse_org_servicifi_gelato_language_kernel_expressions_Affects() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.Affects element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4151:2: (a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4152:2: a0= 'affects' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,21,FOLLOW_21_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3430); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[725]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3444); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[726]);
            	}

            // Kernel.g:4180:2: (a2= IDENTIFIER )
            // Kernel.g:4181:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3462); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[727]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3483); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[728]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[729]);
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
    // Kernel.g:4237:1: parse_org_servicifi_gelato_language_kernel_expressions_PostDefines returns [org.servicifi.gelato.language.kernel.expressions.PostDefines element = null] : a0= 'postdefines' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.PostDefines parse_org_servicifi_gelato_language_kernel_expressions_PostDefines() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.PostDefines element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4240:2: (a0= 'postdefines' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4241:2: a0= 'postdefines' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,34,FOLLOW_34_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3512); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[730]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3526); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[731]);
            	}

            // Kernel.g:4269:2: (a2= IDENTIFIER )
            // Kernel.g:4270:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3544); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[732]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3565); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostDefines();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[733]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[734]);
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
    // Kernel.g:4326:1: parse_org_servicifi_gelato_language_kernel_expressions_PreUses returns [org.servicifi.gelato.language.kernel.expressions.PreUses element = null] : a0= 'preuses' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.PreUses parse_org_servicifi_gelato_language_kernel_expressions_PreUses() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.PreUses element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4329:2: (a0= 'preuses' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4330:2: a0= 'preuses' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,35,FOLLOW_35_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3594); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[735]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3608); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[736]);
            	}

            // Kernel.g:4358:2: (a2= IDENTIFIER )
            // Kernel.g:4359:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3626); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[737]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3647); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPreUses();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[738]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[739]);
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
    // Kernel.g:4415:1: parse_org_servicifi_gelato_language_kernel_expressions_PostAffects returns [org.servicifi.gelato.language.kernel.expressions.PostAffects element = null] : a0= 'postaffects' a1= '(' (a2= IDENTIFIER ) a3= ')' ;
    public final org.servicifi.gelato.language.kernel.expressions.PostAffects parse_org_servicifi_gelato_language_kernel_expressions_PostAffects() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.PostAffects element =  null;


        Token a0=null;
        Token a1=null;
        Token a2=null;
        Token a3=null;



        try {
            // Kernel.g:4418:2: (a0= 'postaffects' a1= '(' (a2= IDENTIFIER ) a3= ')' )
            // Kernel.g:4419:2: a0= 'postaffects' a1= '(' (a2= IDENTIFIER ) a3= ')'
            {
            a0=(Token)match(input,33,FOLLOW_33_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3676); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_0, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a0, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[740]);
            	}

            a1=(Token)match(input,8,FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3690); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_1, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a1, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[741]);
            	}

            // Kernel.g:4447:2: (a2= IDENTIFIER )
            // Kernel.g:4448:3: a2= IDENTIFIER
            {
            a2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3708); if (state.failed) return element;

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

            }


            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[742]);
            	}

            a3=(Token)match(input,9,FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3729); if (state.failed) return element;

            if ( state.backtracking==0 ) {
            		if (element == null) {
            			element = org.servicifi.gelato.language.kernel.expressions.ExpressionsFactory.eINSTANCE.createPostAffects();
            			startIncompleteElement(element);
            		}
            		collectHiddenTokens(element);
            		retrieveLayoutInformation(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26_0_0_3, null, true);
            		copyLocalizationInfos((org.antlr.runtime3_4_0.CommonToken)a3, element);
            	}

            if ( state.backtracking==0 ) {
            		// expected elements (follow set)
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[743]);
            		addExpectedElement(null, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelExpectationConstants.EXPECTATIONS[744]);
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
    // Kernel.g:4504:1: parse_org_servicifi_gelato_language_kernel_statements_Statement returns [org.servicifi.gelato.language.kernel.statements.Statement element = null] : (c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop |c1= parse_org_servicifi_gelato_language_kernel_statements_Condition |c2= parse_org_servicifi_gelato_language_kernel_statements_Goto |c3= parse_org_servicifi_gelato_language_kernel_statements_Block |c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock |c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock |c6= parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement |c7= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement |c8= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException |c9= parse_org_servicifi_gelato_language_kernel_statements_Abort |c10= parse_org_servicifi_gelato_language_kernel_statements_Skip |c11= parse_org_servicifi_gelato_language_kernel_statements_Return |c12= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall );
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

        org.servicifi.gelato.language.kernel.statements.Return c11 =null;

        org.servicifi.gelato.language.kernel.statements.ProcedureCall c12 =null;


        try {
            // Kernel.g:4505:2: (c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop |c1= parse_org_servicifi_gelato_language_kernel_statements_Condition |c2= parse_org_servicifi_gelato_language_kernel_statements_Goto |c3= parse_org_servicifi_gelato_language_kernel_statements_Block |c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock |c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock |c6= parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement |c7= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement |c8= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException |c9= parse_org_servicifi_gelato_language_kernel_statements_Abort |c10= parse_org_servicifi_gelato_language_kernel_statements_Skip |c11= parse_org_servicifi_gelato_language_kernel_statements_Return |c12= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall )
            int alt22=13;
            switch ( input.LA(1) ) {
            case CHARACTER_LITERAL:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==12) ) {
                    switch ( input.LA(3) ) {
                    case 45:
                        {
                        alt22=1;
                        }
                        break;
                    case 28:
                        {
                        alt22=2;
                        }
                        break;
                    case 27:
                        {
                        alt22=3;
                        }
                        break;
                    case 47:
                        {
                        alt22=4;
                        }
                        break;
                    case IDENTIFIER:
                        {
                        alt22=7;
                        }
                        break;
                    case CHARACTER_LITERAL:
                        {
                        alt22=8;
                        }
                        break;
                    case 41:
                        {
                        alt22=9;
                        }
                        break;
                    case 20:
                        {
                        alt22=10;
                        }
                        break;
                    case 39:
                        {
                        alt22=11;
                        }
                        break;
                    case 38:
                        {
                        alt22=12;
                        }
                        break;
                    case 22:
                        {
                        alt22=13;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return element;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
                }
                break;
            case 48:
                {
                alt22=5;
                }
                break;
            case 16:
                {
                alt22=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // Kernel.g:4506:2: c0= parse_org_servicifi_gelato_language_kernel_statements_WhileLoop
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3754);
                    c0=parse_org_servicifi_gelato_language_kernel_statements_WhileLoop();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:4507:4: c1= parse_org_servicifi_gelato_language_kernel_statements_Condition
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Condition_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3764);
                    c1=parse_org_servicifi_gelato_language_kernel_statements_Condition();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Kernel.g:4508:4: c2= parse_org_servicifi_gelato_language_kernel_statements_Goto
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Goto_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3774);
                    c2=parse_org_servicifi_gelato_language_kernel_statements_Goto();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Kernel.g:4509:4: c3= parse_org_servicifi_gelato_language_kernel_statements_Block
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Block_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3784);
                    c3=parse_org_servicifi_gelato_language_kernel_statements_Block();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Kernel.g:4510:4: c4= parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3794);
                    c4=parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Kernel.g:4511:4: c5= parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3804);
                    c5=parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c5; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 7 :
                    // Kernel.g:4512:4: c6= parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3814);
                    c6=parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c6; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 8 :
                    // Kernel.g:4513:4: c7= parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3824);
                    c7=parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c7; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 9 :
                    // Kernel.g:4514:4: c8= parse_org_servicifi_gelato_language_kernel_statements_StatementWithException
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3834);
                    c8=parse_org_servicifi_gelato_language_kernel_statements_StatementWithException();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c8; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 10 :
                    // Kernel.g:4515:4: c9= parse_org_servicifi_gelato_language_kernel_statements_Abort
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Abort_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3844);
                    c9=parse_org_servicifi_gelato_language_kernel_statements_Abort();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c9; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 11 :
                    // Kernel.g:4516:4: c10= parse_org_servicifi_gelato_language_kernel_statements_Skip
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Skip_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3854);
                    c10=parse_org_servicifi_gelato_language_kernel_statements_Skip();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c10; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 12 :
                    // Kernel.g:4517:4: c11= parse_org_servicifi_gelato_language_kernel_statements_Return
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Return_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3864);
                    c11=parse_org_servicifi_gelato_language_kernel_statements_Return();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c11; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 13 :
                    // Kernel.g:4518:4: c12= parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3874);
                    c12=parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c12; /* this is a subclass or primitive expression choice */ }

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
    // Kernel.g:4522:1: parse_org_servicifi_gelato_language_kernel_expressions_SubExpression returns [org.servicifi.gelato.language.kernel.expressions.SubExpression element = null] : (c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines |c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses |c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects |c3= parse_org_servicifi_gelato_language_kernel_expressions_PostDefines |c4= parse_org_servicifi_gelato_language_kernel_expressions_PreUses |c5= parse_org_servicifi_gelato_language_kernel_expressions_PostAffects );
    public final org.servicifi.gelato.language.kernel.expressions.SubExpression parse_org_servicifi_gelato_language_kernel_expressions_SubExpression() throws RecognitionException {
        org.servicifi.gelato.language.kernel.expressions.SubExpression element =  null;


        org.servicifi.gelato.language.kernel.expressions.Defines c0 =null;

        org.servicifi.gelato.language.kernel.expressions.Uses c1 =null;

        org.servicifi.gelato.language.kernel.expressions.Affects c2 =null;

        org.servicifi.gelato.language.kernel.expressions.PostDefines c3 =null;

        org.servicifi.gelato.language.kernel.expressions.PreUses c4 =null;

        org.servicifi.gelato.language.kernel.expressions.PostAffects c5 =null;


        try {
            // Kernel.g:4523:2: (c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines |c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses |c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects |c3= parse_org_servicifi_gelato_language_kernel_expressions_PostDefines |c4= parse_org_servicifi_gelato_language_kernel_expressions_PreUses |c5= parse_org_servicifi_gelato_language_kernel_expressions_PostAffects )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt23=1;
                }
                break;
            case 42:
                {
                alt23=2;
                }
                break;
            case 21:
                {
                alt23=3;
                }
                break;
            case 34:
                {
                alt23=4;
                }
                break;
            case 35:
                {
                alt23=5;
                }
                break;
            case 33:
                {
                alt23=6;
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
                    // Kernel.g:4524:2: c0= parse_org_servicifi_gelato_language_kernel_expressions_Defines
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Defines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3895);
                    c0=parse_org_servicifi_gelato_language_kernel_expressions_Defines();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c0; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 2 :
                    // Kernel.g:4525:4: c1= parse_org_servicifi_gelato_language_kernel_expressions_Uses
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Uses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3905);
                    c1=parse_org_servicifi_gelato_language_kernel_expressions_Uses();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c1; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 3 :
                    // Kernel.g:4526:4: c2= parse_org_servicifi_gelato_language_kernel_expressions_Affects
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Affects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3915);
                    c2=parse_org_servicifi_gelato_language_kernel_expressions_Affects();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c2; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 4 :
                    // Kernel.g:4527:4: c3= parse_org_servicifi_gelato_language_kernel_expressions_PostDefines
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3925);
                    c3=parse_org_servicifi_gelato_language_kernel_expressions_PostDefines();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c3; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 5 :
                    // Kernel.g:4528:4: c4= parse_org_servicifi_gelato_language_kernel_expressions_PreUses
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PreUses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3935);
                    c4=parse_org_servicifi_gelato_language_kernel_expressions_PreUses();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) { element = c4; /* this is a subclass or primitive expression choice */ }

                    }
                    break;
                case 6 :
                    // Kernel.g:4529:4: c5= parse_org_servicifi_gelato_language_kernel_expressions_PostAffects
                    {
                    pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3945);
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

    // $ANTLR start synpred15_Kernel
    public final void synpred15_Kernel_fragment() throws RecognitionException {
        org.servicifi.gelato.language.kernel.statements.Statement a2_0 =null;


        // Kernel.g:2383:3: ( ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) ) )
        // Kernel.g:2383:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
        {
        // Kernel.g:2383:3: ( (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement ) )
        // Kernel.g:2384:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
        {
        // Kernel.g:2384:4: (a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement )
        // Kernel.g:2385:5: a2_0= parse_org_servicifi_gelato_language_kernel_statements_Statement
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


        // Kernel.g:2870:3: ( (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement ) )
        // Kernel.g:2870:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
        {
        // Kernel.g:2870:3: (a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement )
        // Kernel.g:2871:4: a5_0= parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement
        {
        pushFollow(FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_synpred16_Kernel2184);
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
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit130 = new BitSet(new long[]{0x0000100000000030L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit186 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure_in_parse_org_servicifi_gelato_language_kernel_containers_CompilationUnit231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_parse_org_servicifi_gelato_language_kernel_dataitems_DataItem264 = new BitSet(new long[]{0x0000000000000020L});
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
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure639 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure653 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_procedures_Procedure_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure682 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure702 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_50_in_parse_org_servicifi_gelato_language_kernel_procedures_Procedure743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure776 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure797 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure811 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure825 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure839 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure853 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure867 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure896 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_50_in_parse_org_servicifi_gelato_language_kernel_procedures_MainProcedure937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop970 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop991 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1005 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1037 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1055 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1069 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1087 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1138 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1159 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1173 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1187 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1205 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1223 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1237 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1255 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1282 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Condition1349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1382 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1403 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1417 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1435 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Goto1456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Block1489 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Block1510 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_parse_org_servicifi_gelato_language_kernel_statements_Block1524 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_Block1547 = new BitSet(new long[]{0x0005000000010010L});
    public static final BitSet FOLLOW_50_in_parse_org_servicifi_gelato_language_kernel_statements_Block1573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1602 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1616 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1630 = new BitSet(new long[]{0x0000001060000000L});
    public static final BitSet FOLLOW_30_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1653 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_36_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1668 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_29_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1683 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1713 = new BitSet(new long[]{0x0001000000010410L});
    public static final BitSet FOLLOW_10_in_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1782 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock1811 = new BitSet(new long[]{0x0001000000010012L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1871 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1892 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1910 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1949 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2000 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2039 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2090 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2111 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2125 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2143 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException2184 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2250 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2264 = new BitSet(new long[]{0x0001000000010010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2340 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2354 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Abort2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2401 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2422 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2436 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Skip2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_Return2483 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_Return2504 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_parse_org_servicifi_gelato_language_kernel_statements_Return2518 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Expression_in_parse_org_servicifi_gelato_language_kernel_statements_Return2541 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_Return2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2600 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2621 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2653 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2674 = new BitSet(new long[]{0x0000082000000200L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2703 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_11_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2744 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_references_Argument_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2778 = new BitSet(new long[]{0x0000000000000A00L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2852 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_parameters_Parameter2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_parse_org_servicifi_gelato_language_kernel_references_Argument2944 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43_in_parse_org_servicifi_gelato_language_kernel_references_Argument2959 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_references_Argument2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARACTER_LITERAL_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3024 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3045 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3059 = new BitSet(new long[]{0x0000040E00A80000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3088 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3129 = new BitSet(new long[]{0x0000040E00A00000L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3163 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_parse_org_servicifi_gelato_language_kernel_expressions_Expression3237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3266 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3280 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3298 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Defines3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3348 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3380 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Uses3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3430 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3462 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_Affects3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3512 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3544 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3594 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3608 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3626 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PreUses3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3676 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3690 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IDENTIFIER_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3708 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_WhileLoop_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Condition_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Goto_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Block_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ParallelBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_NonDeterministicBlock_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_AssignmentStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExpressionStatement_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_StatementWithException_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Abort_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Skip_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Return_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ProcedureCall_in_parse_org_servicifi_gelato_language_kernel_statements_Statement3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Defines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Uses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_Affects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostDefines_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PreUses_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_expressions_PostAffects_in_parse_org_servicifi_gelato_language_kernel_expressions_SubExpression3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_Statement_in_synpred15_Kernel1811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parse_org_servicifi_gelato_language_kernel_statements_ExceptionHandlerStatement_in_synpred16_Kernel2184 = new BitSet(new long[]{0x0000000000000002L});

}