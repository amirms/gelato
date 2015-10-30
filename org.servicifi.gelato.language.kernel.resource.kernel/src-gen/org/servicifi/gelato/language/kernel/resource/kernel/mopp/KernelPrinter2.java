/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

public class KernelPrinter2 implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextPrinter {
	
	protected class PrintToken {
		
		private String text;
		private String tokenName;
		private EObject container;
		
		public PrintToken(String text, String tokenName, EObject container) {
			this.text = text;
			this.tokenName = tokenName;
			this.container = container;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
		public EObject getContainer() {
			return container;
		}
		
		public String toString() {
			return "'" + text + "' [" + tokenName + "]";
		}
		
	}
	
	/**
	 * The PrintCountingMap keeps tracks of the values that must be printed for each
	 * feature of an EObject. It is also used to store the indices of all values that
	 * have been printed. This knowledge is used to avoid printing values twice. We
	 * must store the concrete indices of the printed values instead of basically
	 * counting them, because values may be printed in an order that differs from the
	 * order in which they are stored in the EObject's feature.
	 */
	protected class PrintCountingMap {
		
		private Map<String, List<Object>> featureToValuesMap = new LinkedHashMap<String, List<Object>>();
		private Map<String, Set<Integer>> featureToPrintedIndicesMap = new LinkedHashMap<String, Set<Integer>>();
		
		public void setFeatureValues(String featureName, List<Object> values) {
			featureToValuesMap.put(featureName, values);
			// If the feature does not have values it won't be printed. An entry in
			// 'featureToPrintedIndicesMap' is therefore not needed in this case.
			if (values != null) {
				featureToPrintedIndicesMap.put(featureName, new LinkedHashSet<Integer>());
			}
		}
		
		public Set<Integer> getIndicesToPrint(String featureName) {
			return featureToPrintedIndicesMap.get(featureName);
		}
		
		public void addIndexToPrint(String featureName, int index) {
			featureToPrintedIndicesMap.get(featureName).add(index);
		}
		
		public int getCountLeft(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal terminal) {
			EStructuralFeature feature = terminal.getFeature();
			String featureName = feature.getName();
			List<Object> totalValuesToPrint = featureToValuesMap.get(featureName);
			Set<Integer> printedIndices = featureToPrintedIndicesMap.get(featureName);
			if (totalValuesToPrint == null) {
				return 0;
			}
			if (feature instanceof EAttribute) {
				// for attributes we do not need to check the type, since the CS languages does
				// not allow type restrictions for attributes.
				return totalValuesToPrint.size() - printedIndices.size();
			} else if (feature instanceof EReference) {
				EReference reference = (EReference) feature;
				if (!reference.isContainment()) {
					// for non-containment references we also do not need to check the type, since the
					// CS languages does not allow type restrictions for these either.
					return totalValuesToPrint.size() - printedIndices.size();
				}
			}
			// now we're left with containment references for which we check the type of the
			// objects to print
			List<Class<?>> allowedTypes = getAllowedTypes(terminal);
			Set<Integer> indicesWithCorrectType = new LinkedHashSet<Integer>();
			int index = 0;
			for (Object valueToPrint : totalValuesToPrint) {
				for (Class<?> allowedType : allowedTypes) {
					if (allowedType.isInstance(valueToPrint)) {
						indicesWithCorrectType.add(index);
					}
				}
				index++;
			}
			indicesWithCorrectType.removeAll(printedIndices);
			return indicesWithCorrectType.size();
		}
		
		public int getNextIndexToPrint(String featureName) {
			int printedValues = featureToPrintedIndicesMap.get(featureName).size();
			return printedValues;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEClassUtil eClassUtil = new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEClassUtil();
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource;
	
	private Map<?, ?> options;
	private OutputStream outputStream;
	private String encoding = System.getProperty("file.encoding");
	protected List<PrintToken> tokenOutputStream;
	private org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether tokens have already been printed for some object.
	 * The flag is set to false whenever printing of an EObject tree is started. The
	 * status of the flag is used to avoid printing default token space in front of
	 * the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	/**
	 * This flag is used to indicate whether the number of tabs before the current
	 * object has been set for the current object. The flag is needed, because setting
	 * the number of tabs must be performed when the first token of the contained
	 * element is printed.
	 */
	private boolean startedPrintingContainedObject;
	
	public KernelPrinter2(OutputStream outputStream, org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(EObject element) throws IOException {
		tokenOutputStream = new ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		startedPrintingContainedObject = false;
		List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement>  formattingElements = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(element, formattingElements, layoutInformations, eofLayoutInformation);
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(EObject element, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.servicifi.gelato.language.kernel.containers.CompilationUnit) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.procedures.Procedure) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.procedures.MainProcedure) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.WhileLoop) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Condition) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_5, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Goto) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_6, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Block) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_7, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ParallelBlock) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_8, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.NonDeterministicBlock) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_9, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.AssignmentStatement) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_10, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ExpressionStatement) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_11, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.StatementWithException) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_12, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_13, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Abort) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_14, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Skip) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_15, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.Return) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_16, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.statements.ProcedureCall) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_17, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.parameters.Parameter) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_18, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.references.Argument) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_19, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Expression) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_20, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Defines) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_21, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Uses) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_22, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.Affects) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_23, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.PostDefines) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_24, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.PreUses) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_25, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.expressions.PostAffects) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_26, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.kernel.dataitems.DataItem) {
			printInternal(element, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.KERNEL_1, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(EObject eObject, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement ruleElement, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements) {
		List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator getDecoratorTree(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement syntaxElement) {
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator[] childDecorators = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator decorator = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator decorator, EObject eObject) {
		PrintCountingMap printCountingMap = initializePrintCountingMap(eObject);
		List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator> keywordsToPrint = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference held by
	 * the given EObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator decorator, EObject eObject, PrintCountingMap printCountingMap, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement syntaxElement = decorator.getDecoratedElement();
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator> subKeywordsToPrint = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal) {
				org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal terminal = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal) syntaxElement;
				EStructuralFeature feature = terminal.getFeature();
				if (feature == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				String featureName = feature.getName();
				int countLeft = printCountingMap.getCountLeft(terminal);
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					// normally we print the element at the next index
					int indexToPrint = printCountingMap.getNextIndexToPrint(featureName);
					// But, if there are type restrictions for containments, we must choose an index
					// of an element that fits (i.e., which has the correct type)
					if (terminal instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment) {
						org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment containment = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment) terminal;
						indexToPrint = findElementWithCorrectType(eObject, feature, printCountingMap.getIndicesToPrint(featureName), containment);
					}
					if (indexToPrint >= 0) {
						decorator.addIndexToPrint(indexToPrint);
						printCountingMap.addIndexToPrint(featureName, indexToPrint);
						keepDecorating = true;
					}
				}
			}
			if (syntaxElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice) {
				// for choices we do print only the choice which does print at least one feature
				org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator childToPrint = null;
				for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR || cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE || cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	private int findElementWithCorrectType(EObject eObject, EStructuralFeature feature, Set<Integer> indicesToPrint, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment containment) {
		// By default the type restrictions that are defined in the CS definition are
		// considered when printing models. You can change this behavior by setting the
		// 'ignoreTypeRestrictionsForPrinting' option to true.
		boolean ignoreTypeRestrictions = false;
		EClass[] allowedTypes = containment.getAllowedTypes();
		Object value = eObject.eGet(feature);
		if (value instanceof List<?>) {
			List<?> valueList = (List<?>) value;
			int listSize = valueList.size();
			for (int index = 0; index < listSize; index++) {
				if (indicesToPrint.contains(index)) {
					continue;
				}
				Object valueAtIndex = valueList.get(index);
				if (eClassUtil.isInstance(valueAtIndex, allowedTypes) || ignoreTypeRestrictions) {
					return index;
				}
			}
		} else {
			if (eClassUtil.isInstance(value, allowedTypes) || ignoreTypeRestrictions) {
				return 0;
			}
		}
		return -1;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference held by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator decorator, EObject eObject, PrintCountingMap printCountingMap) {
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal) {
			org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal terminal = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal) syntaxElement;
			EStructuralFeature feature = terminal.getFeature();
			if (feature == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.getCountLeft(terminal);
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator decorator, EObject eObject, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement printElement = decorator.getDecoratedElement();
		org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality = printElement.getCardinality();
		List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> cloned = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword) {
					printKeyword(eObject, (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder) {
					org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder placeholder = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment) {
					org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment containment = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal) {
					org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal booleanTerminal = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal) {
					org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal enumTerminal = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelWhiteSpace) {
				foundFormattingElements.add((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelWhiteSpace) printElement);
			}
			if (printElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak) {
				foundFormattingElements.add((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak) printElement);
			}
			for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelChoice) {
					break;
				}
			}
			if (cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.ONE || cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.STAR || cardinality == org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(EObject eObject, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelKeyword keyword, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation keywordLayout = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, keywordLayout);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.escapeToANTLRKeyword(value) + "'", eObject));
	}
	
	public void printFeature(EObject eObject, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder placeholder, int count, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof EAttribute) {
			printAttribute(eObject, (EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(EObject eObject, EAttribute attribute, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder placeholder, int index, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		String result = null;
		Object attributeValue = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName(), eObject));
		}
	}
	
	
	public void printBooleanTerminal(EObject eObject, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal booleanTerminal, int index, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		EAttribute attribute = booleanTerminal.getAttribute();
		String result = null;
		Object attributeValue = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printEnumerationTerminal(EObject eObject, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelEnumerationTerminal enumTerminal, int index, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		EAttribute attribute = enumTerminal.getAttribute();
		String result = null;
		Object attributeValue = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the enumeration attribute is converted to its textual
			// representation using the literals of the enumeration terminal
			assert attributeValue instanceof Enumerator;
			result = enumTerminal.getText(((Enumerator) attributeValue).getName());
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printContainedObject(EObject eObject, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment containment, int index, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		EStructuralFeature reference = containment.getFeature();
		Object o = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getFeatureValue(eObject, reference, index);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		startedPrintingContainedObject = false;
		currentTabs = 0;
		doPrint((EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(EObject eObject, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations, org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			if (layoutInformations != null) {
				layoutInformations.remove(layoutInformation);
			}
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null, eObject));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			setTabsBeforeCurrentObject(0);
			return;
		}
		int printedTabs = 0;
		if (foundFormattingElements.size() > 0) {
			for (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelWhiteSpace) {
					int amount = ((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(createSpaceToken(eObject));
					}
				}
				if (foundFormattingElement instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak) {
					currentTabs = ((org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelLineBreak) foundFormattingElement).getTabs();
					printedTabs += currentTabs;
					tokenOutputStream.add(createNewLineToken(eObject));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(createTabToken(eObject));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null, eObject));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		setTabsBeforeCurrentObject(printedTabs);
	}
	
	private void setTabsBeforeCurrentObject(int tabs) {
		if (startedPrintingContainedObject) {
			return;
		}
		tabsBeforeCurrentObject = tabsBeforeCurrentObject + tabs;
		startedPrintingContainedObject = true;
	}
	
	@SuppressWarnings("unchecked")
	public void printReference(EObject eObject, EReference reference, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelPlaceholder placeholder, int index, List<org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelEObjectUtil.getFeatureValue(eObject, reference, index, false);
		// first add layout before the reference
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation referenceLayout = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, referenceLayout);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof EObject) {
			EObject eObjectToDeResolve = (EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				// If the proxy was created by EMFText, we can try to recover the identifier from
				// the proxy URI
				if (deresolvedReference != null && deresolvedReference.startsWith(org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(org.servicifi.gelato.language.kernel.resource.kernel.IKernelContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((EObject) referencedObject, eObject, reference);
		}
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName, eObject));
	}
	
	@SuppressWarnings("unchecked")
	public PrintCountingMap initializePrintCountingMap(EObject eObject) {
		// The PrintCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		PrintCountingMap printCountingMap = new PrintCountingMap();
		List<EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature feature : features) {
			// We get the feature value without resolving it, because resolving is not
			// required to count the number of elements that are referenced by the feature.
			// Moreover, triggering reference resolving is not desired here, because we'd also
			// like to print models that contain unresolved references.
			Object featureValue = eObject.eGet(feature, false);
			if (featureValue != null) {
				if (featureValue instanceof List<?>) {
					printCountingMap.setFeatureValues(feature.getName(), (List<Object>) featureValue);
				} else {
					printCountingMap.setFeatureValues(feature.getName(), Collections.singletonList(featureValue));
				}
			} else {
				printCountingMap.setFeatureValues(feature.getName(), null);
			}
		}
		return printCountingMap;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource getResource() {
		return resource;
	}
	
	protected org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelReferenceResolverSwitch) new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelProblem(errorMessage, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemType.PRINT_PROBLEM, org.servicifi.gelato.language.kernel.resource.kernel.KernelEProblemSeverity.WARNING), cause);
	}
	
	protected org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformationAdapter getLayoutInformationAdapter(EObject element) {
		for (Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformationAdapter) {
				return (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformationAdapter) adapter;
			}
		}
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformationAdapter newAdapter = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation getLayoutInformation(List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement syntaxElement, Object object, EObject container) {
		for (org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				}
				// The layout information adapter must only try to resolve the object it refers
				// to, if we compare with a non-proxy object. If we're printing a resource that
				// contains proxy objects, resolving must not be triggered.
				boolean isNoProxy = true;
				if (object instanceof EObject) {
					EObject eObject = (EObject) object;
					isNoProxy = !eObject.eIsProxy();
				}
				if (isSame(object, layoutInformation.getObject(container, isNoProxy))) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	public List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> getCopyOfLayoutInformation(EObject eObject) {
		org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		List<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation> layoutInformations = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(PrintWriter writer) throws IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * <p>
	 * Prints the current tokenOutputStream to the given writer.
	 * </p>
	 * 
	 * <p>
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * </p>
	 * 
	 * <p>
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 * </p>
	 */
	public void printSmart(PrintWriter writer) throws IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		char lastCharWritten = ' ';
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				char[] charArray = currentBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextScanner scanner = new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			List<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken> tempTokens = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken>();
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				org.servicifi.gelato.language.kernel.resource.kernel.IKernelTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				char[] charArray = validBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// print separating whitespace
				// if no whitespace (or tab or linebreak) is already there
				if (lastCharWritten != ' ' && lastCharWritten != '\t' && lastCharWritten != '\n' && lastCharWritten != '\r') {
					lastCharWritten = ' ';
					writer.write(lastCharWritten);
				}
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
	private boolean isSame(Object o1, Object o2) {
		if (o1 instanceof String || o1 instanceof Integer || o1 instanceof Long || o1 instanceof Byte || o1 instanceof Short || o1 instanceof Float || o2 instanceof Double) {
			return o1.equals(o2);
		}
		return o1 == o2;
	}
	
	protected List<Class<?>> getAllowedTypes(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal terminal) {
		List<Class<?>> allowedTypes = new ArrayList<Class<?>>();
		allowedTypes.add(terminal.getFeature().getEType().getInstanceClass());
		if (terminal instanceof org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment) {
			org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment printingContainment = (org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelContainment) terminal;
			EClass[] typeRestrictions = printingContainment.getAllowedTypes();
			if (typeRestrictions != null && typeRestrictions.length > 0) {
				allowedTypes.clear();
				for (EClass eClass : typeRestrictions) {
					allowedTypes.add(eClass.getInstanceClass());
				}
			}
		}
		return allowedTypes;
	}
	
	protected PrintToken createSpaceToken(EObject container) {
		return new PrintToken(" ", null, container);
	}
	
	protected PrintToken createTabToken(EObject container) {
		return new PrintToken("\t", null, container);
	}
	
	protected PrintToken createNewLineToken(EObject container) {
		if (options != null) {
			Object lineBreaks = options.get(org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.LINE_DELIMITER_FOR_PRINTING);
			if (lineBreaks != null && lineBreaks instanceof String) {
				return new PrintToken((String) lineBreaks, null, container);
			}
		}
		return new PrintToken(NEW_LINE, null, container);
	}
	
}
