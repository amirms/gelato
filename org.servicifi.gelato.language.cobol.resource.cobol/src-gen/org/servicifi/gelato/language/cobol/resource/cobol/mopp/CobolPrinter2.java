/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

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

public class CobolPrinter2 implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextPrinter {
	
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
		
		public int getCountLeft(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal terminal) {
			EStructuralFeature feature = terminal.getFeature();
			String featureName = feature.getName();
			List<Object> totalValuesToPrint = featureToValuesMap.get(featureName);
			Set<Integer> printedIndices = featureToPrintedIndicesMap.get(featureName);
			if (totalValuesToPrint == null) {
				return 0;
			}
			return totalValuesToPrint.size() - printedIndices.size();
		}
		
		public int getNextIndexToPrint(String featureName) {
			int printedValues = featureToPrintedIndicesMap.get(featureName).size();
			return printedValues;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEClassUtil eClassUtil = new org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEClassUtil();
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource;
	
	private Map<?, ?> options;
	private OutputStream outputStream;
	private String encoding = System.getProperty("file.encoding");
	protected List<PrintToken> tokenOutputStream;
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenResolverFactory();
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
	
	public CobolPrinter2(OutputStream outputStream, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource) {
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
		List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement>  formattingElements = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(element, formattingElements, layoutInformations, eofLayoutInformation);
		PrintWriter writer = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(EObject element, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.servicifi.gelato.language.cobol.containers.CompilationGroup) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.containers.CompilationUnit) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_1, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.IdentificationDivision) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.DataDivision) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.ConfigurationSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_5, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.IOSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_6, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.FileSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_7, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.WorkingStorageSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_8, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.LocalStorageSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_9, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.LinkageStorageSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_10, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_11, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_12, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_13, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_14, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_15, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_16, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_17, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_18, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_19, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.OnStatus) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_20, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.OffStatus) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_21, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.CurrencySign) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_22, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.ClassName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_23, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_24, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_25, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.AlphabetName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_26, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_27, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_28, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.files.FileName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_29, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.files.SelectStatement) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_30, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.files.FileStatus) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_31, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.RenamingDataName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_33, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Redefines) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_34, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.PictureString) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_35, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Value) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_36, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.External) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_37, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Global) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_38, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.GroupUsage) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_39, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Usage) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_40, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.Table) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_41, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.KeyName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_42, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.IndexName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_43, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.AdditionalIndexName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_44, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.TableDimension) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_45, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.ProcedureDivision) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_46, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.declaratives.Declaratives) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_47, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.DeclarativeSection) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_48, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.Section) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_49, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.Paragraph) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_50, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.ExecuteSentence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_51, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.UseSentence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_52, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.AlteredGoTo) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_54, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.ExitProcedure) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_55, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.EmptySentence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_56, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Accept) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_57, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Release) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_58, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Merge) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_59, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Sort) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_60, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.KeyDescriptor) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_61, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.InputFile) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_62, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.InputProcedure) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_63, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.OutputProcedure) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_64, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.OutputFile) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_65, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Continue) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_66, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Unstring) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_67, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Inspect) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_68, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.TallyingIn) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_69, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Set) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_70, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SetSwitches) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_71, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SwitchStatus) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_72, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SetIndexName) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_73, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Return) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_74, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Execute) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_75, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Add) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_76, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Multiply) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_77, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Subtract) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_78, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Divide) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_79, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Compute) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_80, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Display) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_81, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Move) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_82, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_85, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_86, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_87, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_88, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.AfterUntilCondition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_89, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Read) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_90, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Rewrite) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_92, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.labels.Run) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_93, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.labels.ProcedureRange) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_94, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.labels.ProcedureLabel) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_95, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.String) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_96, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Condition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_97, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.NextSentence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_98, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Stop) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_99, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.GoBack) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_100, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.GoTo) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_101, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Exit) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_102, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Cancel) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_103, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Call) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_104, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Initialize) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_105, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Open) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_106, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Close) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_107, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.IOFileDescriptor) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_108, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.IOFile) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_109, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SerialSearch) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_110, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.BinarySearch) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_111, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.ByReferenceArgument) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_112, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.ByContentArgument) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_113, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.OmittedArgument) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_114, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.ByValueArgument) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_115, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Evaluate) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_116, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_117, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_118, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.InvalidKey) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_119, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotInvalidKey) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_120, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.AtEndOfPage) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_121, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_122, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.OnSizeError) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_123, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.OnOverflow) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_124, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.OnException) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_125, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.AtEnd) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_126, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotOnSizeError) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_127, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotOnOverflow) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_128, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotOnException) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_129, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotAtEnd) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_130, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ExpressionList) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_131, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_132, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_133, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_134, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NestedCondition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_135, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.RelationalExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_136, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.SignCondition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_137, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ClassCondition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_138, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_139, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_140, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_141, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_142, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.RangeExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_143, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_144, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_145, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_146, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_147, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_148, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_149, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.FunctionCall) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_150, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.LinageCounter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_153, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_154, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.All) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_156, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_157, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.AlphabetNameReference) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_158, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.IndexNameReference) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_159, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_160, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.MnemonicNameReference) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_161, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.FileNameReference) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_162, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_163, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_164, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_165, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.Location) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_166, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_167, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.SplittedString) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_168, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.AnyCharacter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_169, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.TallyingOccurrence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_170, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.SpecificCharacter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_171, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_172, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.parameters.ByValueParameter) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_173, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operands.RoundedIdentifier) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_174, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operands.Encoding) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_175, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.verbs.Is) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_176, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Addition) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_177, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Subtraction) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_178, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Multiplication) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_179, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Division) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_180, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Negate) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_181, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.EqualSign) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_182, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.EqualPhrase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_183, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTSign) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_184, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTPhrase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_185, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTSign) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_186, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTPhrase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_187, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTEQSign) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_188, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTEQPhrase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_189, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTEQSign) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_190, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTEQPhrase) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_191, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Positive) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_192, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Negative) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_193, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Zero) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_194, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Numeric) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_195, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Alphabetic) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_196, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.AlphabeticLower) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_197, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.AlphabeticUpper) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_198, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.DBCS) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_199, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Kanji) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_200, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Through) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_201, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.IntegerLiteral) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_202, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_203, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_204, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_206, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.BooleanLiteral) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_207, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Null) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_208, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Zero) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_209, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Quote) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_210, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.LowValue) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_211, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.HighValue) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_212, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Space) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_213, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Any) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_214, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Characters) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_215, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SystemLogicalInput) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_216, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_217, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SystemPunchDevice) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_218, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.Console) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_219, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.Channel) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_220, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SuppressSpacing) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_221, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.Pocket) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_222, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_223, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.UPSI) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_224, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.ShiftIn) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_225, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.ShiftOut) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_226, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.AddressOf) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_227, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.LengthOf) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_228, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.ReturnCode) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_229, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.WhenCompiled) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_230, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.SortPhraseToken) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_231, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.Dot) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_232, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.ProgramDescription) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_233, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.ObjectComputerDescription) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_234, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.SpecialNamesClause) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_235, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.SelectStatementClause) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_236, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.FileDescription) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_237, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.DataDescription) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_238, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.IOControlDescription) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_239, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.RepositoryDescription) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_240, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.AcceptStatementToken) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_241, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.UseStatementToken) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_242, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.CloseStatementToken) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_243, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.OpenStatementToken) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_244, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.InvokeStatementToken) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_245, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.PriorityNumber) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_246, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.DataItem) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_32, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.Sentence) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_53, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatement) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_83, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedure) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_84, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Write) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_91, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.IdentifierReference) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_151, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_152, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.DirectSubscript) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_155, foundFormattingElements);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral) {
			printInternal(element, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.COBOL_205, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(EObject eObject, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement ruleElement, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements) {
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator getDecoratorTree(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement syntaxElement) {
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator[] childDecorators = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator decorator = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator decorator, EObject eObject) {
		PrintCountingMap printCountingMap = initializePrintCountingMap(eObject);
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator> keywordsToPrint = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference held by
	 * the given EObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator decorator, EObject eObject, PrintCountingMap printCountingMap, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement syntaxElement = decorator.getDecoratedElement();
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator> subKeywordsToPrint = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal) {
				org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal terminal = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal) syntaxElement;
				EStructuralFeature feature = terminal.getFeature();
				if (feature == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				String featureName = feature.getName();
				int countLeft = printCountingMap.getCountLeft(terminal);
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					// normally we print the element at the next index
					int indexToPrint = printCountingMap.getNextIndexToPrint(featureName);
					// But, if there are type restrictions for containments, we must choose an index
					// of an element that fits (i.e., which has the correct type)
					if (terminal instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment) {
						org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment containment = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment) terminal;
						indexToPrint = findElementWithCorrectType(eObject, feature, printCountingMap.getIndicesToPrint(featureName), containment);
					}
					if (indexToPrint >= 0) {
						decorator.addIndexToPrint(indexToPrint);
						printCountingMap.addIndexToPrint(featureName, indexToPrint);
						keepDecorating = true;
					}
				}
			}
			if (syntaxElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolChoice) {
				// for choices we do print only the choice which does print at least one feature
				org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator childToPrint = null;
				for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
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
				for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.STAR || cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.ONE || cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	private int findElementWithCorrectType(EObject eObject, EStructuralFeature feature, Set<Integer> indicesToPrint, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment containment) {
		// Since the 'ignoreTypeRestrictionsForPrinting' option is set to true, the type
		// restrictions are not considered when printing models.
		boolean ignoreTypeRestrictions = true;
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
	public boolean doesPrintFeature(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator decorator, EObject eObject, PrintCountingMap printCountingMap) {
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal) {
			org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal terminal = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal) syntaxElement;
			EStructuralFeature feature = terminal.getFeature();
			if (feature == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.getCountLeft(terminal);
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator decorator, EObject eObject, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement printElement = decorator.getDecoratedElement();
		org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality = printElement.getCardinality();
		List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> cloned = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolKeyword) {
					printKeyword(eObject, (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder) {
					org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder placeholder = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment) {
					org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment containment = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolBooleanTerminal) {
					org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolBooleanTerminal booleanTerminal = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolEnumerationTerminal) {
					org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolEnumerationTerminal enumTerminal = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolWhiteSpace) {
				foundFormattingElements.add((org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolWhiteSpace) printElement);
			}
			if (printElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolLineBreak) {
				foundFormattingElements.add((org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolLineBreak) printElement);
			}
			for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolChoice) {
					break;
				}
			}
			if (cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.ONE || cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.STAR || cardinality == org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(EObject eObject, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolKeyword keyword, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation keywordLayout = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, keywordLayout);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + org.servicifi.gelato.language.cobol.resource.cobol.util.CobolStringUtil.escapeToANTLRKeyword(value) + "'", eObject));
	}
	
	public void printFeature(EObject eObject, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder placeholder, int count, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof EAttribute) {
			printAttribute(eObject, (EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(EObject eObject, EAttribute attribute, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder placeholder, int index, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		String result = null;
		Object attributeValue = org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
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
	
	
	public void printBooleanTerminal(EObject eObject, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolBooleanTerminal booleanTerminal, int index, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		EAttribute attribute = booleanTerminal.getAttribute();
		String result = null;
		Object attributeValue = org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
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
			tokenOutputStream.add(new PrintToken(result, "'" + org.servicifi.gelato.language.cobol.resource.cobol.util.CobolStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printEnumerationTerminal(EObject eObject, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolEnumerationTerminal enumTerminal, int index, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		EAttribute attribute = enumTerminal.getAttribute();
		String result = null;
		Object attributeValue = org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
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
			tokenOutputStream.add(new PrintToken(result, "'" + org.servicifi.gelato.language.cobol.resource.cobol.util.CobolStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printContainedObject(EObject eObject, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment containment, int index, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		EStructuralFeature reference = containment.getFeature();
		Object o = org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.getFeatureValue(eObject, reference, index);
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
	
	public void printFormattingElements(EObject eObject, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations, org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation layoutInformation) {
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
			for (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolWhiteSpace) {
					int amount = ((org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(createSpaceToken(eObject));
					}
				}
				if (foundFormattingElement instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolLineBreak) {
					currentTabs = ((org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolLineBreak) foundFormattingElement).getTabs();
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
	public void printReference(EObject eObject, EReference reference, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder placeholder, int index, List<org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolFormattingElement> foundFormattingElements, List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = org.servicifi.gelato.language.cobol.resource.cobol.util.CobolEObjectUtil.getFeatureValue(eObject, reference, index, false);
		// first add layout before the reference
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation referenceLayout = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, referenceLayout);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof EObject) {
			EObject eObjectToDeResolve = (EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				// If the proxy was created by EMFText, we can try to recover the identifier from
				// the proxy URI
				if (deresolvedReference != null && deresolvedReference.startsWith(org.servicifi.gelato.language.cobol.resource.cobol.ICobolContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(org.servicifi.gelato.language.cobol.resource.cobol.ICobolContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((EObject) referencedObject, eObject, reference);
		}
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
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
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource getResource() {
		return resource;
	}
	
	protected org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolReferenceResolverSwitch) new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, EObject cause) {
		org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolProblem(errorMessage, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemType.PRINT_PROBLEM, org.servicifi.gelato.language.cobol.resource.cobol.CobolEProblemSeverity.WARNING), cause);
	}
	
	protected org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter getLayoutInformationAdapter(EObject element) {
		for (Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter) {
				return (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter) adapter;
			}
		}
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter newAdapter = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation getLayoutInformation(List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement syntaxElement, Object object, EObject container) {
		for (org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation layoutInformation : layoutInformations) {
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
	
	public List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> getCopyOfLayoutInformation(EObject eObject) {
		org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		List<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation> layoutInformations = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolLayoutInformation layoutInformation) {
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
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextScanner scanner = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			List<org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextToken> tempTokens = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextToken>();
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextToken tempToken = tempTokens.get(t);
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
	
	protected List<Class<?>> getAllowedTypes(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal terminal) {
		List<Class<?>> allowedTypes = new ArrayList<Class<?>>();
		allowedTypes.add(terminal.getFeature().getEType().getInstanceClass());
		if (terminal instanceof org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment) {
			org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment printingContainment = (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolContainment) terminal;
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
			Object lineBreaks = options.get(org.servicifi.gelato.language.cobol.resource.cobol.ICobolOptions.LINE_DELIMITER_FOR_PRINTING);
			if (lineBreaks != null && lineBreaks instanceof String) {
				return new PrintToken((String) lineBreaks, null, container);
			}
		}
		return new PrintToken(NEW_LINE, null, container);
	}
	
}
