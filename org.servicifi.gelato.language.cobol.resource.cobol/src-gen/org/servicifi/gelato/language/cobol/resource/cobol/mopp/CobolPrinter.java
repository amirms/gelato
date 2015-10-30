/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class CobolPrinter implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextPrinter {
	
	protected org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolverFactory tokenResolverFactory = new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolTokenResolverFactory();
	
	protected OutputStream outputStream;
	
	/**
	 * Holds the resource that is associated with this printer. This may be null if
	 * the printer is used stand alone.
	 */
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource;
	
	private Map<?, ?> options;
	private String encoding = System.getProperty("file.encoding");
	
	public CobolPrinter(OutputStream outputStream, org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected int matchCount(Map<String, Integer> featureCounter, Collection<String> needed) {
		int pos = 0;
		int neg = 0;
		
		for (String featureName : featureCounter.keySet()) {
			if (needed.contains(featureName)) {
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(EObject element, PrintWriter out, String globaltab) {
		if (element == null) {
			throw new IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.servicifi.gelato.language.cobol.containers.CompilationGroup) {
			print_org_servicifi_gelato_language_cobol_containers_CompilationGroup((org.servicifi.gelato.language.cobol.containers.CompilationGroup) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.containers.CompilationUnit) {
			print_org_servicifi_gelato_language_cobol_containers_CompilationUnit((org.servicifi.gelato.language.cobol.containers.CompilationUnit) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.IdentificationDivision) {
			print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision((org.servicifi.gelato.language.cobol.divisions.IdentificationDivision) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision) {
			print_org_servicifi_gelato_language_cobol_divisions_EnvironmentDivision((org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.DataDivision) {
			print_org_servicifi_gelato_language_cobol_divisions_DataDivision((org.servicifi.gelato.language.cobol.divisions.DataDivision) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.ConfigurationSection) {
			print_org_servicifi_gelato_language_cobol_sections_ConfigurationSection((org.servicifi.gelato.language.cobol.sections.ConfigurationSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.IOSection) {
			print_org_servicifi_gelato_language_cobol_sections_IOSection((org.servicifi.gelato.language.cobol.sections.IOSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.FileSection) {
			print_org_servicifi_gelato_language_cobol_sections_FileSection((org.servicifi.gelato.language.cobol.sections.FileSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.WorkingStorageSection) {
			print_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection((org.servicifi.gelato.language.cobol.sections.WorkingStorageSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.LocalStorageSection) {
			print_org_servicifi_gelato_language_cobol_sections_LocalStorageSection((org.servicifi.gelato.language.cobol.sections.LocalStorageSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.LinkageStorageSection) {
			print_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection((org.servicifi.gelato.language.cobol.sections.LinkageStorageSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph((org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode) {
			print_org_servicifi_gelato_language_cobol_paragraphs_DebuggingMode((org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph((org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph((org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_RepositoryParagraph((org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_FileControlParagraph((org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_IOControlParagraph((org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs) {
			print_org_servicifi_gelato_language_cobol_specialnames_SystemDeviceIs((org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs) {
			print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs((org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.OnStatus) {
			print_org_servicifi_gelato_language_cobol_specialnames_OnStatus((org.servicifi.gelato.language.cobol.specialnames.OnStatus) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.OffStatus) {
			print_org_servicifi_gelato_language_cobol_specialnames_OffStatus((org.servicifi.gelato.language.cobol.specialnames.OffStatus) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.CurrencySign) {
			print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign((org.servicifi.gelato.language.cobol.specialnames.CurrencySign) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.ClassName) {
			print_org_servicifi_gelato_language_cobol_specialnames_ClassName((org.servicifi.gelato.language.cobol.specialnames.ClassName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement) {
			print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement((org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter) {
			print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter((org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.AlphabetName) {
			print_org_servicifi_gelato_language_cobol_specialnames_AlphabetName((org.servicifi.gelato.language.cobol.specialnames.AlphabetName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType) {
			print_org_servicifi_gelato_language_cobol_specialnames_PredefinedAlphabetType((org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType) {
			print_org_servicifi_gelato_language_cobol_specialnames_CodeNameAlphabetType((org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.files.FileName) {
			print_org_servicifi_gelato_language_cobol_files_FileName((org.servicifi.gelato.language.cobol.files.FileName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.files.SelectStatement) {
			print_org_servicifi_gelato_language_cobol_files_SelectStatement((org.servicifi.gelato.language.cobol.files.SelectStatement) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.files.FileStatus) {
			print_org_servicifi_gelato_language_cobol_files_FileStatus((org.servicifi.gelato.language.cobol.files.FileStatus) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.RenamingDataName) {
			print_org_servicifi_gelato_language_cobol_dataitems_RenamingDataName((org.servicifi.gelato.language.cobol.dataitems.RenamingDataName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Redefines) {
			print_org_servicifi_gelato_language_cobol_dataitems_Redefines((org.servicifi.gelato.language.cobol.dataitems.Redefines) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.PictureString) {
			print_org_servicifi_gelato_language_cobol_dataitems_PictureString((org.servicifi.gelato.language.cobol.dataitems.PictureString) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Value) {
			print_org_servicifi_gelato_language_cobol_dataitems_Value((org.servicifi.gelato.language.cobol.dataitems.Value) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.External) {
			print_org_servicifi_gelato_language_cobol_dataitems_External((org.servicifi.gelato.language.cobol.dataitems.External) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Global) {
			print_org_servicifi_gelato_language_cobol_dataitems_Global((org.servicifi.gelato.language.cobol.dataitems.Global) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.GroupUsage) {
			print_org_servicifi_gelato_language_cobol_dataitems_GroupUsage((org.servicifi.gelato.language.cobol.dataitems.GroupUsage) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.Usage) {
			print_org_servicifi_gelato_language_cobol_dataitems_Usage((org.servicifi.gelato.language.cobol.dataitems.Usage) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.Table) {
			print_org_servicifi_gelato_language_cobol_tables_Table((org.servicifi.gelato.language.cobol.tables.Table) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.KeyName) {
			print_org_servicifi_gelato_language_cobol_tables_KeyName((org.servicifi.gelato.language.cobol.tables.KeyName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.IndexName) {
			print_org_servicifi_gelato_language_cobol_tables_IndexName((org.servicifi.gelato.language.cobol.tables.IndexName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.AdditionalIndexName) {
			print_org_servicifi_gelato_language_cobol_tables_AdditionalIndexName((org.servicifi.gelato.language.cobol.tables.AdditionalIndexName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.tables.TableDimension) {
			print_org_servicifi_gelato_language_cobol_tables_TableDimension((org.servicifi.gelato.language.cobol.tables.TableDimension) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.divisions.ProcedureDivision) {
			print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision((org.servicifi.gelato.language.cobol.divisions.ProcedureDivision) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.declaratives.Declaratives) {
			print_org_servicifi_gelato_language_cobol_declaratives_Declaratives((org.servicifi.gelato.language.cobol.declaratives.Declaratives) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.DeclarativeSection) {
			print_org_servicifi_gelato_language_cobol_sections_DeclarativeSection((org.servicifi.gelato.language.cobol.sections.DeclarativeSection) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sections.Section) {
			print_org_servicifi_gelato_language_cobol_sections_Section((org.servicifi.gelato.language.cobol.sections.Section) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.paragraphs.Paragraph) {
			print_org_servicifi_gelato_language_cobol_paragraphs_Paragraph((org.servicifi.gelato.language.cobol.paragraphs.Paragraph) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.ExecuteSentence) {
			print_org_servicifi_gelato_language_cobol_sentences_ExecuteSentence((org.servicifi.gelato.language.cobol.sentences.ExecuteSentence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.UseSentence) {
			print_org_servicifi_gelato_language_cobol_sentences_UseSentence((org.servicifi.gelato.language.cobol.sentences.UseSentence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.AlteredGoTo) {
			print_org_servicifi_gelato_language_cobol_sentences_AlteredGoTo((org.servicifi.gelato.language.cobol.sentences.AlteredGoTo) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.ExitProcedure) {
			print_org_servicifi_gelato_language_cobol_sentences_ExitProcedure((org.servicifi.gelato.language.cobol.sentences.ExitProcedure) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.EmptySentence) {
			print_org_servicifi_gelato_language_cobol_sentences_EmptySentence((org.servicifi.gelato.language.cobol.sentences.EmptySentence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Accept) {
			print_org_servicifi_gelato_language_cobol_statements_Accept((org.servicifi.gelato.language.cobol.statements.Accept) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Release) {
			print_org_servicifi_gelato_language_cobol_statements_Release((org.servicifi.gelato.language.cobol.statements.Release) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Merge) {
			print_org_servicifi_gelato_language_cobol_statements_Merge((org.servicifi.gelato.language.cobol.statements.Merge) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Sort) {
			print_org_servicifi_gelato_language_cobol_statements_Sort((org.servicifi.gelato.language.cobol.statements.Sort) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.KeyDescriptor) {
			print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor((org.servicifi.gelato.language.cobol.statements.KeyDescriptor) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.InputFile) {
			print_org_servicifi_gelato_language_cobol_ios_InputFile((org.servicifi.gelato.language.cobol.ios.InputFile) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.InputProcedure) {
			print_org_servicifi_gelato_language_cobol_ios_InputProcedure((org.servicifi.gelato.language.cobol.ios.InputProcedure) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.OutputProcedure) {
			print_org_servicifi_gelato_language_cobol_ios_OutputProcedure((org.servicifi.gelato.language.cobol.ios.OutputProcedure) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.ios.OutputFile) {
			print_org_servicifi_gelato_language_cobol_ios_OutputFile((org.servicifi.gelato.language.cobol.ios.OutputFile) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Continue) {
			print_org_servicifi_gelato_language_cobol_statements_Continue((org.servicifi.gelato.language.cobol.statements.Continue) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Unstring) {
			print_org_servicifi_gelato_language_cobol_statements_Unstring((org.servicifi.gelato.language.cobol.statements.Unstring) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Inspect) {
			print_org_servicifi_gelato_language_cobol_statements_Inspect((org.servicifi.gelato.language.cobol.statements.Inspect) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.TallyingIn) {
			print_org_servicifi_gelato_language_cobol_statements_TallyingIn((org.servicifi.gelato.language.cobol.statements.TallyingIn) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Set) {
			print_org_servicifi_gelato_language_cobol_statements_Set((org.servicifi.gelato.language.cobol.statements.Set) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SetSwitches) {
			print_org_servicifi_gelato_language_cobol_statements_SetSwitches((org.servicifi.gelato.language.cobol.statements.SetSwitches) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SwitchStatus) {
			print_org_servicifi_gelato_language_cobol_statements_SwitchStatus((org.servicifi.gelato.language.cobol.statements.SwitchStatus) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SetIndexName) {
			print_org_servicifi_gelato_language_cobol_statements_SetIndexName((org.servicifi.gelato.language.cobol.statements.SetIndexName) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Return) {
			print_org_servicifi_gelato_language_cobol_statements_Return((org.servicifi.gelato.language.cobol.statements.Return) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Execute) {
			print_org_servicifi_gelato_language_cobol_statements_Execute((org.servicifi.gelato.language.cobol.statements.Execute) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Add) {
			print_org_servicifi_gelato_language_cobol_statements_Add((org.servicifi.gelato.language.cobol.statements.Add) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Multiply) {
			print_org_servicifi_gelato_language_cobol_statements_Multiply((org.servicifi.gelato.language.cobol.statements.Multiply) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Subtract) {
			print_org_servicifi_gelato_language_cobol_statements_Subtract((org.servicifi.gelato.language.cobol.statements.Subtract) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Divide) {
			print_org_servicifi_gelato_language_cobol_statements_Divide((org.servicifi.gelato.language.cobol.statements.Divide) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Compute) {
			print_org_servicifi_gelato_language_cobol_statements_Compute((org.servicifi.gelato.language.cobol.statements.Compute) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Display) {
			print_org_servicifi_gelato_language_cobol_statements_Display((org.servicifi.gelato.language.cobol.statements.Display) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Move) {
			print_org_servicifi_gelato_language_cobol_statements_Move((org.servicifi.gelato.language.cobol.statements.Move) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes) {
			print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes((org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes) {
			print_org_servicifi_gelato_language_cobol_statements_PerformProcedureFixedTimes((org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition) {
			print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition((org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition) {
			print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition((org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.AfterUntilCondition) {
			print_org_servicifi_gelato_language_cobol_statements_AfterUntilCondition((org.servicifi.gelato.language.cobol.statements.AfterUntilCondition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Read) {
			print_org_servicifi_gelato_language_cobol_statements_Read((org.servicifi.gelato.language.cobol.statements.Read) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Rewrite) {
			print_org_servicifi_gelato_language_cobol_statements_Rewrite((org.servicifi.gelato.language.cobol.statements.Rewrite) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.labels.Run) {
			print_org_servicifi_gelato_language_cobol_labels_Run((org.servicifi.gelato.language.cobol.labels.Run) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.labels.ProcedureRange) {
			print_org_servicifi_gelato_language_cobol_labels_ProcedureRange((org.servicifi.gelato.language.cobol.labels.ProcedureRange) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.labels.ProcedureLabel) {
			print_org_servicifi_gelato_language_cobol_labels_ProcedureLabel((org.servicifi.gelato.language.cobol.labels.ProcedureLabel) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.String) {
			print_org_servicifi_gelato_language_cobol_statements_String((org.servicifi.gelato.language.cobol.statements.String) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Condition) {
			print_org_servicifi_gelato_language_cobol_statements_Condition((org.servicifi.gelato.language.cobol.statements.Condition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.NextSentence) {
			print_org_servicifi_gelato_language_cobol_statements_NextSentence((org.servicifi.gelato.language.cobol.statements.NextSentence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Stop) {
			print_org_servicifi_gelato_language_cobol_statements_Stop((org.servicifi.gelato.language.cobol.statements.Stop) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.GoBack) {
			print_org_servicifi_gelato_language_cobol_statements_GoBack((org.servicifi.gelato.language.cobol.statements.GoBack) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.GoTo) {
			print_org_servicifi_gelato_language_cobol_statements_GoTo((org.servicifi.gelato.language.cobol.statements.GoTo) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Exit) {
			print_org_servicifi_gelato_language_cobol_statements_Exit((org.servicifi.gelato.language.cobol.statements.Exit) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Cancel) {
			print_org_servicifi_gelato_language_cobol_statements_Cancel((org.servicifi.gelato.language.cobol.statements.Cancel) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Call) {
			print_org_servicifi_gelato_language_cobol_statements_Call((org.servicifi.gelato.language.cobol.statements.Call) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Initialize) {
			print_org_servicifi_gelato_language_cobol_statements_Initialize((org.servicifi.gelato.language.cobol.statements.Initialize) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Open) {
			print_org_servicifi_gelato_language_cobol_statements_Open((org.servicifi.gelato.language.cobol.statements.Open) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Close) {
			print_org_servicifi_gelato_language_cobol_statements_Close((org.servicifi.gelato.language.cobol.statements.Close) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.IOFileDescriptor) {
			print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor((org.servicifi.gelato.language.cobol.statements.IOFileDescriptor) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.IOFile) {
			print_org_servicifi_gelato_language_cobol_statements_IOFile((org.servicifi.gelato.language.cobol.statements.IOFile) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.SerialSearch) {
			print_org_servicifi_gelato_language_cobol_statements_SerialSearch((org.servicifi.gelato.language.cobol.statements.SerialSearch) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.BinarySearch) {
			print_org_servicifi_gelato_language_cobol_statements_BinarySearch((org.servicifi.gelato.language.cobol.statements.BinarySearch) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.ByReferenceArgument) {
			print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument((org.servicifi.gelato.language.cobol.functions.ByReferenceArgument) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.ByContentArgument) {
			print_org_servicifi_gelato_language_cobol_functions_ByContentArgument((org.servicifi.gelato.language.cobol.functions.ByContentArgument) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.OmittedArgument) {
			print_org_servicifi_gelato_language_cobol_functions_OmittedArgument((org.servicifi.gelato.language.cobol.functions.OmittedArgument) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.ByValueArgument) {
			print_org_servicifi_gelato_language_cobol_functions_ByValueArgument((org.servicifi.gelato.language.cobol.functions.ByValueArgument) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Evaluate) {
			print_org_servicifi_gelato_language_cobol_statements_Evaluate((org.servicifi.gelato.language.cobol.statements.Evaluate) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase) {
			print_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase((org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase) {
			print_org_servicifi_gelato_language_cobol_statements_OtherEvaluateCase((org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.InvalidKey) {
			print_org_servicifi_gelato_language_cobol_handlers_InvalidKey((org.servicifi.gelato.language.cobol.handlers.InvalidKey) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotInvalidKey) {
			print_org_servicifi_gelato_language_cobol_handlers_NotInvalidKey((org.servicifi.gelato.language.cobol.handlers.NotInvalidKey) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.AtEndOfPage) {
			print_org_servicifi_gelato_language_cobol_handlers_AtEndOfPage((org.servicifi.gelato.language.cobol.handlers.AtEndOfPage) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage) {
			print_org_servicifi_gelato_language_cobol_handlers_NotAtEndOfPage((org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.OnSizeError) {
			print_org_servicifi_gelato_language_cobol_handlers_OnSizeError((org.servicifi.gelato.language.cobol.handlers.OnSizeError) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.OnOverflow) {
			print_org_servicifi_gelato_language_cobol_handlers_OnOverflow((org.servicifi.gelato.language.cobol.handlers.OnOverflow) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.OnException) {
			print_org_servicifi_gelato_language_cobol_handlers_OnException((org.servicifi.gelato.language.cobol.handlers.OnException) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.AtEnd) {
			print_org_servicifi_gelato_language_cobol_handlers_AtEnd((org.servicifi.gelato.language.cobol.handlers.AtEnd) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotOnSizeError) {
			print_org_servicifi_gelato_language_cobol_handlers_NotOnSizeError((org.servicifi.gelato.language.cobol.handlers.NotOnSizeError) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotOnOverflow) {
			print_org_servicifi_gelato_language_cobol_handlers_NotOnOverflow((org.servicifi.gelato.language.cobol.handlers.NotOnOverflow) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotOnException) {
			print_org_servicifi_gelato_language_cobol_handlers_NotOnException((org.servicifi.gelato.language.cobol.handlers.NotOnException) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.handlers.NotAtEnd) {
			print_org_servicifi_gelato_language_cobol_handlers_NotAtEnd((org.servicifi.gelato.language.cobol.handlers.NotAtEnd) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ExpressionList) {
			print_org_servicifi_gelato_language_cobol_conditions_ExpressionList((org.servicifi.gelato.language.cobol.conditions.ExpressionList) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpression((org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpression((org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NestedCondition) {
			print_org_servicifi_gelato_language_cobol_conditions_NestedCondition((org.servicifi.gelato.language.cobol.conditions.NestedCondition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.RelationalExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression((org.servicifi.gelato.language.cobol.conditions.RelationalExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.SignCondition) {
			print_org_servicifi_gelato_language_cobol_conditions_SignCondition((org.servicifi.gelato.language.cobol.conditions.SignCondition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.ClassCondition) {
			print_org_servicifi_gelato_language_cobol_conditions_ClassCondition((org.servicifi.gelato.language.cobol.conditions.ClassCondition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression((org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression) {
			print_org_servicifi_gelato_language_cobol_conditions_NestedAbbreviatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.RangeExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_RangeExpression((org.servicifi.gelato.language.cobol.arithmetics.RangeExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression((org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression) {
			print_org_servicifi_gelato_language_cobol_arithmetics_NestedArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.functions.FunctionCall) {
			print_org_servicifi_gelato_language_cobol_functions_FunctionCall((org.servicifi.gelato.language.cobol.functions.FunctionCall) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.LinageCounter) {
			print_org_servicifi_gelato_language_cobol_identifiers_LinageCounter((org.servicifi.gelato.language.cobol.identifiers.LinageCounter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript) {
			print_org_servicifi_gelato_language_cobol_identifiers_RelativeSubscript((org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.All) {
			print_org_servicifi_gelato_language_cobol_identifiers_All((org.servicifi.gelato.language.cobol.identifiers.All) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier) {
			print_org_servicifi_gelato_language_cobol_identifiers_ReferenceModifier((org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.AlphabetNameReference) {
			print_org_servicifi_gelato_language_cobol_references_AlphabetNameReference((org.servicifi.gelato.language.cobol.references.AlphabetNameReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.IndexNameReference) {
			print_org_servicifi_gelato_language_cobol_references_IndexNameReference((org.servicifi.gelato.language.cobol.references.IndexNameReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference) {
			print_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference((org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.MnemonicNameReference) {
			print_org_servicifi_gelato_language_cobol_references_MnemonicNameReference((org.servicifi.gelato.language.cobol.references.MnemonicNameReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.FileNameReference) {
			print_org_servicifi_gelato_language_cobol_references_FileNameReference((org.servicifi.gelato.language.cobol.references.FileNameReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence) {
			print_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence((org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter) {
			print_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter((org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter) {
			print_org_servicifi_gelato_language_cobol_strings_AnyCharacterBySpecificCharacter((org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.Location) {
			print_org_servicifi_gelato_language_cobol_strings_Location((org.servicifi.gelato.language.cobol.strings.Location) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings) {
			print_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings((org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.SplittedString) {
			print_org_servicifi_gelato_language_cobol_strings_SplittedString((org.servicifi.gelato.language.cobol.strings.SplittedString) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.AnyCharacter) {
			print_org_servicifi_gelato_language_cobol_strings_AnyCharacter((org.servicifi.gelato.language.cobol.strings.AnyCharacter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.TallyingOccurrence) {
			print_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence((org.servicifi.gelato.language.cobol.strings.TallyingOccurrence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.strings.SpecificCharacter) {
			print_org_servicifi_gelato_language_cobol_strings_SpecificCharacter((org.servicifi.gelato.language.cobol.strings.SpecificCharacter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter) {
			print_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter((org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.parameters.ByValueParameter) {
			print_org_servicifi_gelato_language_cobol_parameters_ByValueParameter((org.servicifi.gelato.language.cobol.parameters.ByValueParameter) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operands.RoundedIdentifier) {
			print_org_servicifi_gelato_language_cobol_operands_RoundedIdentifier((org.servicifi.gelato.language.cobol.operands.RoundedIdentifier) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operands.Encoding) {
			print_org_servicifi_gelato_language_cobol_operands_Encoding((org.servicifi.gelato.language.cobol.operands.Encoding) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.verbs.Is) {
			print_org_servicifi_gelato_language_cobol_verbs_Is((org.servicifi.gelato.language.cobol.verbs.Is) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Addition) {
			print_org_servicifi_gelato_language_cobol_operators_Addition((org.servicifi.gelato.language.cobol.operators.Addition) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Subtraction) {
			print_org_servicifi_gelato_language_cobol_operators_Subtraction((org.servicifi.gelato.language.cobol.operators.Subtraction) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Multiplication) {
			print_org_servicifi_gelato_language_cobol_operators_Multiplication((org.servicifi.gelato.language.cobol.operators.Multiplication) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Division) {
			print_org_servicifi_gelato_language_cobol_operators_Division((org.servicifi.gelato.language.cobol.operators.Division) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Negate) {
			print_org_servicifi_gelato_language_cobol_operators_Negate((org.servicifi.gelato.language.cobol.operators.Negate) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.EqualSign) {
			print_org_servicifi_gelato_language_cobol_operators_EqualSign((org.servicifi.gelato.language.cobol.operators.EqualSign) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.EqualPhrase) {
			print_org_servicifi_gelato_language_cobol_operators_EqualPhrase((org.servicifi.gelato.language.cobol.operators.EqualPhrase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTSign) {
			print_org_servicifi_gelato_language_cobol_operators_LTSign((org.servicifi.gelato.language.cobol.operators.LTSign) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTPhrase) {
			print_org_servicifi_gelato_language_cobol_operators_LTPhrase((org.servicifi.gelato.language.cobol.operators.LTPhrase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTSign) {
			print_org_servicifi_gelato_language_cobol_operators_GTSign((org.servicifi.gelato.language.cobol.operators.GTSign) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTPhrase) {
			print_org_servicifi_gelato_language_cobol_operators_GTPhrase((org.servicifi.gelato.language.cobol.operators.GTPhrase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTEQSign) {
			print_org_servicifi_gelato_language_cobol_operators_LTEQSign((org.servicifi.gelato.language.cobol.operators.LTEQSign) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.LTEQPhrase) {
			print_org_servicifi_gelato_language_cobol_operators_LTEQPhrase((org.servicifi.gelato.language.cobol.operators.LTEQPhrase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTEQSign) {
			print_org_servicifi_gelato_language_cobol_operators_GTEQSign((org.servicifi.gelato.language.cobol.operators.GTEQSign) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.GTEQPhrase) {
			print_org_servicifi_gelato_language_cobol_operators_GTEQPhrase((org.servicifi.gelato.language.cobol.operators.GTEQPhrase) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Positive) {
			print_org_servicifi_gelato_language_cobol_operators_Positive((org.servicifi.gelato.language.cobol.operators.Positive) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Negative) {
			print_org_servicifi_gelato_language_cobol_operators_Negative((org.servicifi.gelato.language.cobol.operators.Negative) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Zero) {
			print_org_servicifi_gelato_language_cobol_operators_Zero((org.servicifi.gelato.language.cobol.operators.Zero) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Numeric) {
			print_org_servicifi_gelato_language_cobol_operators_Numeric((org.servicifi.gelato.language.cobol.operators.Numeric) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Alphabetic) {
			print_org_servicifi_gelato_language_cobol_operators_Alphabetic((org.servicifi.gelato.language.cobol.operators.Alphabetic) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.AlphabeticLower) {
			print_org_servicifi_gelato_language_cobol_operators_AlphabeticLower((org.servicifi.gelato.language.cobol.operators.AlphabeticLower) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.AlphabeticUpper) {
			print_org_servicifi_gelato_language_cobol_operators_AlphabeticUpper((org.servicifi.gelato.language.cobol.operators.AlphabeticUpper) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.DBCS) {
			print_org_servicifi_gelato_language_cobol_operators_DBCS((org.servicifi.gelato.language.cobol.operators.DBCS) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Kanji) {
			print_org_servicifi_gelato_language_cobol_operators_Kanji((org.servicifi.gelato.language.cobol.operators.Kanji) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.operators.Through) {
			print_org_servicifi_gelato_language_cobol_operators_Through((org.servicifi.gelato.language.cobol.operators.Through) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.IntegerLiteral) {
			print_org_servicifi_gelato_language_cobol_literals_IntegerLiteral((org.servicifi.gelato.language.cobol.literals.IntegerLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral) {
			print_org_servicifi_gelato_language_cobol_literals_FixedDecimalLiteral((org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral) {
			print_org_servicifi_gelato_language_cobol_literals_FloatingDecimalLiteral((org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral) {
			print_org_servicifi_gelato_language_cobol_literals_AlphanumericHexaDecimalLiteral((org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.BooleanLiteral) {
			print_org_servicifi_gelato_language_cobol_literals_BooleanLiteral((org.servicifi.gelato.language.cobol.literals.BooleanLiteral) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Null) {
			print_org_servicifi_gelato_language_cobol_literals_Null((org.servicifi.gelato.language.cobol.literals.Null) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Zero) {
			print_org_servicifi_gelato_language_cobol_literals_Zero((org.servicifi.gelato.language.cobol.literals.Zero) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Quote) {
			print_org_servicifi_gelato_language_cobol_literals_Quote((org.servicifi.gelato.language.cobol.literals.Quote) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.LowValue) {
			print_org_servicifi_gelato_language_cobol_literals_LowValue((org.servicifi.gelato.language.cobol.literals.LowValue) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.HighValue) {
			print_org_servicifi_gelato_language_cobol_literals_HighValue((org.servicifi.gelato.language.cobol.literals.HighValue) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Space) {
			print_org_servicifi_gelato_language_cobol_literals_Space((org.servicifi.gelato.language.cobol.literals.Space) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Any) {
			print_org_servicifi_gelato_language_cobol_literals_Any((org.servicifi.gelato.language.cobol.literals.Any) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.Characters) {
			print_org_servicifi_gelato_language_cobol_literals_Characters((org.servicifi.gelato.language.cobol.literals.Characters) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SystemLogicalInput) {
			print_org_servicifi_gelato_language_cobol_environments_SystemLogicalInput((org.servicifi.gelato.language.cobol.environments.SystemLogicalInput) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput) {
			print_org_servicifi_gelato_language_cobol_environments_SystemLogicalOutput((org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SystemPunchDevice) {
			print_org_servicifi_gelato_language_cobol_environments_SystemPunchDevice((org.servicifi.gelato.language.cobol.environments.SystemPunchDevice) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.Console) {
			print_org_servicifi_gelato_language_cobol_environments_Console((org.servicifi.gelato.language.cobol.environments.Console) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.Channel) {
			print_org_servicifi_gelato_language_cobol_environments_Channel((org.servicifi.gelato.language.cobol.environments.Channel) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.SuppressSpacing) {
			print_org_servicifi_gelato_language_cobol_environments_SuppressSpacing((org.servicifi.gelato.language.cobol.environments.SuppressSpacing) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.Pocket) {
			print_org_servicifi_gelato_language_cobol_environments_Pocket((org.servicifi.gelato.language.cobol.environments.Pocket) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting) {
			print_org_servicifi_gelato_language_cobol_environments_AdvancedFunctionPrinting((org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.environments.UPSI) {
			print_org_servicifi_gelato_language_cobol_environments_UPSI((org.servicifi.gelato.language.cobol.environments.UPSI) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.ShiftIn) {
			print_org_servicifi_gelato_language_cobol_registers_ShiftIn((org.servicifi.gelato.language.cobol.registers.ShiftIn) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.ShiftOut) {
			print_org_servicifi_gelato_language_cobol_registers_ShiftOut((org.servicifi.gelato.language.cobol.registers.ShiftOut) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.AddressOf) {
			print_org_servicifi_gelato_language_cobol_registers_AddressOf((org.servicifi.gelato.language.cobol.registers.AddressOf) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.LengthOf) {
			print_org_servicifi_gelato_language_cobol_registers_LengthOf((org.servicifi.gelato.language.cobol.registers.LengthOf) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.ReturnCode) {
			print_org_servicifi_gelato_language_cobol_registers_ReturnCode((org.servicifi.gelato.language.cobol.registers.ReturnCode) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.registers.WhenCompiled) {
			print_org_servicifi_gelato_language_cobol_registers_WhenCompiled((org.servicifi.gelato.language.cobol.registers.WhenCompiled) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.SortPhraseToken) {
			print_org_servicifi_gelato_language_cobol_water_SortPhraseToken((org.servicifi.gelato.language.cobol.water.SortPhraseToken) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.Dot) {
			print_org_servicifi_gelato_language_cobol_water_Dot((org.servicifi.gelato.language.cobol.water.Dot) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.ProgramDescription) {
			print_org_servicifi_gelato_language_cobol_water_ProgramDescription((org.servicifi.gelato.language.cobol.water.ProgramDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.ObjectComputerDescription) {
			print_org_servicifi_gelato_language_cobol_water_ObjectComputerDescription((org.servicifi.gelato.language.cobol.water.ObjectComputerDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.SpecialNamesClause) {
			print_org_servicifi_gelato_language_cobol_water_SpecialNamesClause((org.servicifi.gelato.language.cobol.water.SpecialNamesClause) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.SelectStatementClause) {
			print_org_servicifi_gelato_language_cobol_water_SelectStatementClause((org.servicifi.gelato.language.cobol.water.SelectStatementClause) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.FileDescription) {
			print_org_servicifi_gelato_language_cobol_water_FileDescription((org.servicifi.gelato.language.cobol.water.FileDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.DataDescription) {
			print_org_servicifi_gelato_language_cobol_water_DataDescription((org.servicifi.gelato.language.cobol.water.DataDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.IOControlDescription) {
			print_org_servicifi_gelato_language_cobol_water_IOControlDescription((org.servicifi.gelato.language.cobol.water.IOControlDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.RepositoryDescription) {
			print_org_servicifi_gelato_language_cobol_water_RepositoryDescription((org.servicifi.gelato.language.cobol.water.RepositoryDescription) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.AcceptStatementToken) {
			print_org_servicifi_gelato_language_cobol_water_AcceptStatementToken((org.servicifi.gelato.language.cobol.water.AcceptStatementToken) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.UseStatementToken) {
			print_org_servicifi_gelato_language_cobol_water_UseStatementToken((org.servicifi.gelato.language.cobol.water.UseStatementToken) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.CloseStatementToken) {
			print_org_servicifi_gelato_language_cobol_water_CloseStatementToken((org.servicifi.gelato.language.cobol.water.CloseStatementToken) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.OpenStatementToken) {
			print_org_servicifi_gelato_language_cobol_water_OpenStatementToken((org.servicifi.gelato.language.cobol.water.OpenStatementToken) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.InvokeStatementToken) {
			print_org_servicifi_gelato_language_cobol_water_InvokeStatementToken((org.servicifi.gelato.language.cobol.water.InvokeStatementToken) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.water.PriorityNumber) {
			print_org_servicifi_gelato_language_cobol_water_PriorityNumber((org.servicifi.gelato.language.cobol.water.PriorityNumber) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.dataitems.DataItem) {
			print_org_servicifi_gelato_language_cobol_dataitems_DataItem((org.servicifi.gelato.language.cobol.dataitems.DataItem) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.sentences.Sentence) {
			print_org_servicifi_gelato_language_cobol_sentences_Sentence((org.servicifi.gelato.language.cobol.sentences.Sentence) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatement) {
			print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatement((org.servicifi.gelato.language.cobol.statements.PerformNestedStatement) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedure) {
			print_org_servicifi_gelato_language_cobol_statements_PerformProcedure((org.servicifi.gelato.language.cobol.statements.PerformProcedure) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.statements.Write) {
			print_org_servicifi_gelato_language_cobol_statements_Write((org.servicifi.gelato.language.cobol.statements.Write) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.IdentifierReference) {
			print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference((org.servicifi.gelato.language.cobol.identifiers.IdentifierReference) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier) {
			print_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier((org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.identifiers.DirectSubscript) {
			print_org_servicifi_gelato_language_cobol_identifiers_DirectSubscript((org.servicifi.gelato.language.cobol.identifiers.DirectSubscript) element, globaltab, out);
			return;
		}
		if (element instanceof org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral) {
			print_org_servicifi_gelato_language_cobol_literals_AlphanumericLiteral((org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
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
	
	public void setOptions(Map<?,?> options) {
		this.options = options;
	}
	
	public Map<?,?> getOptions() {
		return options;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(EObject element) throws java.io.IOException {
		PrintWriter out = new PrintWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), encoding));
		doPrint(element, out, "");
		out.flush();
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationGroup(org.servicifi.gelato.language.cobol.containers.CompilationGroup element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_GROUP__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_GROUP__COMPILATION_UNITS));
		printCountingMap.put("compilationUnits", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_containers_CompilationGroup_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationGroup_0(org.servicifi.gelato.language.cobol.containers.CompilationGroup element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("compilationUnits");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_GROUP__COMPILATION_UNITS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("compilationUnits", count - 1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION));
		printCountingMap.put("identificationDivision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION));
		printCountingMap.put("environmentDivision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__DATA_DIVISION));
		printCountingMap.put("dataDivision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION));
		printCountingMap.put("procedureDivision", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS));
		printCountingMap.put("nestedCompilationUnits", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_0(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("identificationDivision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__IDENTIFICATION_DIVISION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("identificationDivision", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_1(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("environmentDivision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__ENVIRONMENT_DIVISION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("environmentDivision", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_2(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataDivision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__DATA_DIVISION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("dataDivision", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_3(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("procedureDivision");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__PROCEDURE_DIVISION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("procedureDivision", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_4(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_4_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("END");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("PROGRAM");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_4_0(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nestedCompilationUnits");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.containers.ContainersPackage.COMPILATION_UNIT__NESTED_COMPILATION_UNITS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("nestedCompilationUnits", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_containers_CompilationUnit_5(org.servicifi.gelato.language.cobol.containers.CompilationUnit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("\u001a");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__SECTIONS));
		printCountingMap.put("sections", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__PROPERTIES));
		printCountingMap.put("properties", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("DIVISION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("PROGRAM-ID");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_4(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_0(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("IDENTIFICATION");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("ID");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_1(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_2(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_2_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("properties");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__PROPERTIES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
			}
			printCountingMap.put("properties", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_2_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_2_0(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_2_1(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("PROGRAM");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_3(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision_4(org.servicifi.gelato.language.cobol.divisions.IdentificationDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.IDENTIFICATION_DIVISION__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_divisions_EnvironmentDivision(org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.ENVIRONMENT_DIVISION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.ENVIRONMENT_DIVISION__SECTIONS));
		printCountingMap.put("sections", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.ENVIRONMENT_DIVISION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.ENVIRONMENT_DIVISION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ENVIRONMENT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("DIVISION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_EnvironmentDivision_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_EnvironmentDivision_0(org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sections");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.ENVIRONMENT_DIVISION__SECTIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sections", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_divisions_DataDivision(org.servicifi.gelato.language.cobol.divisions.DataDivision element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.DATA_DIVISION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.DATA_DIVISION__SECTIONS));
		printCountingMap.put("sections", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.DATA_DIVISION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.DATA_DIVISION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DATA");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("DIVISION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_DataDivision_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_DataDivision_0(org.servicifi.gelato.language.cobol.divisions.DataDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sections");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.DATA_DIVISION__SECTIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sections", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_ConfigurationSection(org.servicifi.gelato.language.cobol.sections.ConfigurationSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.CONFIGURATION_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.CONFIGURATION_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.CONFIGURATION_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.CONFIGURATION_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONFIGURATION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_ConfigurationSection_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_ConfigurationSection_0(org.servicifi.gelato.language.cobol.sections.ConfigurationSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paragraphs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.CONFIGURATION_SECTION__PARAGRAPHS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("paragraphs", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_IOSection(org.servicifi.gelato.language.cobol.sections.IOSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.IO_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.IO_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.IO_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.IO_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("INPUT-OUTPUT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_sections_IOSection_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_sections_IOSection_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_IOSection_0(org.servicifi.gelato.language.cobol.sections.IOSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paragraphs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.IO_SECTION__PARAGRAPHS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("paragraphs", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_IOSection_1(org.servicifi.gelato.language.cobol.sections.IOSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paragraphs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.IO_SECTION__PARAGRAPHS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("paragraphs", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_FileSection(org.servicifi.gelato.language.cobol.sections.FileSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__RECORDS));
		printCountingMap.put("records", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS));
		printCountingMap.put("fileDescriptors", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("FILE");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_FileSection_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_FileSection_0(org.servicifi.gelato.language.cobol.sections.FileSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileDescriptors");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.FILE_SECTION__FILE_DESCRIPTORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileDescriptors", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection(org.servicifi.gelato.language.cobol.sections.WorkingStorageSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__RECORDS));
		printCountingMap.put("records", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("WORKING-STORAGE");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection_0(org.servicifi.gelato.language.cobol.sections.WorkingStorageSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"records"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"sentences"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"statements"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("sentences");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__SENTENCES));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("sentences", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection_0_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("records");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__RECORDS));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("records", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection_0_0(org.servicifi.gelato.language.cobol.sections.WorkingStorageSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.WORKING_STORAGE_SECTION__STATEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_LocalStorageSection(org.servicifi.gelato.language.cobol.sections.LocalStorageSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__RECORDS));
		printCountingMap.put("records", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("LOCAL-STORAGE");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_LocalStorageSection_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_LocalStorageSection_0(org.servicifi.gelato.language.cobol.sections.LocalStorageSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"records"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"sentences"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("sentences");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__SENTENCES));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("sentences", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("records");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LOCAL_STORAGE_SECTION__RECORDS));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("records", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection(org.servicifi.gelato.language.cobol.sections.LinkageStorageSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__RECORDS));
		printCountingMap.put("records", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection_0(org.servicifi.gelato.language.cobol.sections.LinkageStorageSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("LINKAGE");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("LINKAGE-STORAGE");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection_1(org.servicifi.gelato.language.cobol.sections.LinkageStorageSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"records"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"sentences"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("sentences");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__SENTENCES));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("sentences", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("records");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.LINKAGE_STORAGE_SECTION__RECORDS));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("records", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph(org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE));
		printCountingMap.put("withDebuggingMode", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SOURCE-COMPUTER");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph_0(org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph_0_0(org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("withDebuggingMode");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SOURCE_COMPUTER_PARAGRAPH__WITH_DEBUGGING_MODE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("withDebuggingMode", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_DebuggingMode(org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(0);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_paragraphs_DebuggingMode_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("DEBUGGING");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("MODE");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_DebuggingMode_0(org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph(org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OBJECT-COMPUTER");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph_0(org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph_0_0(org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.OBJECT_COMPUTER_PARAGRAPH__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph(org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS));
		printCountingMap.put("specialNameStatements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SPECIAL-NAMES");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph_0(org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"specialNameStatements"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"water"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("water");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__WATER));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("water", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("specialNameStatements");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.SPECIAL_NAMES_PARAGRAPH__SPECIAL_NAME_STATEMENTS));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("specialNameStatements", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph_1(org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_RepositoryParagraph(org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.REPOSITORY_PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.REPOSITORY_PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.REPOSITORY_PARAGRAPH__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("REPOSITORY");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_paragraphs_RepositoryParagraph_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_RepositoryParagraph_0(org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.REPOSITORY_PARAGRAPH__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_FileControlParagraph(org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.FILE_CONTROL_PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS));
		printCountingMap.put("selectStatements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("FILE-CONTROL");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_paragraphs_FileControlParagraph_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_FileControlParagraph_0(org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("selectStatements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.FILE_CONTROL_PARAGRAPH__SELECT_STATEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("selectStatements", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_IOControlParagraph(org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.IO_CONTROL_PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.IO_CONTROL_PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.IO_CONTROL_PARAGRAPH__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("I-O-CONTROL");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_paragraphs_IOControlParagraph_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_IOControlParagraph_0(org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.IO_CONTROL_PARAGRAPH__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SystemDeviceIs(org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__ENVIRONMENT));
		printCountingMap.put("environment", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("environment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__ENVIRONMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("environment", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_SystemDeviceIs_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYSTEM_DEVICE_IS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SystemDeviceIs_0(org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs(org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__ENVIRONMENT));
		printCountingMap.put("environment", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES));
		printCountingMap.put("conditionNames", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("environment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__ENVIRONMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("environment", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs_0(org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs_0_0(org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs_1(org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("conditionNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.UPSI_SWITCH_IS__CONDITION_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("conditionNames", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_OnStatus(org.servicifi.gelato.language.cobol.specialnames.OnStatus element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ON_STATUS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ON_STATUS__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ON_STATUS__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_OnStatus_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_OnStatus_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ON_STATUS__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ON_STATUS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_OnStatus_0(org.servicifi.gelato.language.cobol.specialnames.OnStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("Status");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_OnStatus_1(org.servicifi.gelato.language.cobol.specialnames.OnStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_OffStatus(org.servicifi.gelato.language.cobol.specialnames.OffStatus element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.OFF_STATUS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.OFF_STATUS__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.OFF_STATUS__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OFF");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_OffStatus_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_OffStatus_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.OFF_STATUS__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.OFF_STATUS__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_OffStatus_0(org.servicifi.gelato.language.cobol.specialnames.OffStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("Status");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_OffStatus_1(org.servicifi.gelato.language.cobol.specialnames.OffStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign(org.servicifi.gelato.language.cobol.specialnames.CurrencySign element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL));
		printCountingMap.put("pictureSymbol", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__CURRENCY));
		printCountingMap.put("currency", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CURRENCY");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SIGN");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("currency");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__CURRENCY));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("currency", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign_1(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign_0(org.servicifi.gelato.language.cobol.specialnames.CurrencySign element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign_1(org.servicifi.gelato.language.cobol.specialnames.CurrencySign element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("PICTURE");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SYMBOL");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("pictureSymbol");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CURRENCY_SIGN__PICTURE_SYMBOL), element));
				out.print(" ");
			}
			printCountingMap.put("pictureSymbol", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_CurrencySign_1_0(org.servicifi.gelato.language.cobol.specialnames.CurrencySign element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_ClassName(org.servicifi.gelato.language.cobol.specialnames.ClassName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__RANGE));
		printCountingMap.put("range", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CLASS");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_ClassName_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_specialnames_ClassName_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_specialnames_ClassName_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_ClassName_0(org.servicifi.gelato.language.cobol.specialnames.ClassName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_ClassName_1(org.servicifi.gelato.language.cobol.specialnames.ClassName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("range");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CLASS_NAME__RANGE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("range", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement(org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS));
		printCountingMap.put("symbolicCharacters", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE));
		printCountingMap.put("alphabetNameReference", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SYMBOLIC");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("symbolicCharacters");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__SYMBOLIC_CHARACTERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("symbolicCharacters", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement_0(org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("CHARACTERS");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("CHARACTER");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement_1(org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("IN");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("alphabetNameReference");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER_STATEMENT__ALPHABET_NAME_REFERENCE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("alphabetNameReference", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter(org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS));
		printCountingMap.put("integers", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter_0(org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("ARE");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IS");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter_1(org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("integers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.SYMBOLIC_CHARACTER__INTEGERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("integers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_AlphabetName(org.servicifi.gelato.language.cobol.specialnames.AlphabetName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ALPHABET");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_specialnames_AlphabetName_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.ALPHABET_NAME__TYPE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_AlphabetName_0(org.servicifi.gelato.language.cobol.specialnames.AlphabetName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_PredefinedAlphabetType(org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.PREDEFINED_ALPHABET_TYPE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.PREDEFINED_ALPHABET_TYPE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_specialnames_CodeNameAlphabetType(org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CODE_NAME_ALPHABET_TYPE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CODE_NAME_ALPHABET_TYPE__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.CODE_NAME_ALPHABET_TYPE__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_files_FileName(org.servicifi.gelato.language.cobol.files.FileName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__FILE_DESCRIPTOR));
		printCountingMap.put("fileDescriptor", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__RECORDS));
		printCountingMap.put("records", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("fileDescriptor");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__FILE_DESCRIPTOR));
			if (o != null) {
			}
			printCountingMap.put("fileDescriptor", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_files_FileName_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_files_FileName_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_FileName_0(org.servicifi.gelato.language.cobol.files.FileName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"attributes"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"water"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("water");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__WATER));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("water", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("attributes");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__ATTRIBUTES));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("attributes", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_FileName_1(org.servicifi.gelato.language.cobol.files.FileName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"records"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"sentences"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("sentences");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__SENTENCES));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("sentences", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("records");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_NAME__RECORDS));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("records", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_files_SelectStatement(org.servicifi.gelato.language.cobol.files.SelectStatement element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__FILE_STATUS));
		printCountingMap.put("fileStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__IS_OPTIONAL));
		printCountingMap.put("isOptional", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES));
		printCountingMap.put("externalFileNames", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE));
		printCountingMap.put("fileNameReference", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SELECT");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isOptional");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__IS_OPTIONAL));
			if (o != null) {
			}
			printCountingMap.put("isOptional", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileNameReference");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__FILE_NAME_REFERENCE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileNameReference", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("ASSIGN");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_files_SelectStatement_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_files_SelectStatement_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_files_SelectStatement_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_files_SelectStatement_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_SelectStatement_0(org.servicifi.gelato.language.cobol.files.SelectStatement element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_SelectStatement_1(org.servicifi.gelato.language.cobol.files.SelectStatement element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("externalFileNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__EXTERNAL_FILE_NAMES), element));
				out.print(" ");
			}
			printCountingMap.put("externalFileNames", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_SelectStatement_2(org.servicifi.gelato.language.cobol.files.SelectStatement element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"fileStatus"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"water"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("water");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__WATER));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("water", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("fileStatus");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.SELECT_STATEMENT__FILE_STATUS));
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("fileStatus", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_files_FileStatus(org.servicifi.gelato.language.cobol.files.FileStatus element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_STATUS__FILE_STATUS));
		printCountingMap.put("fileStatus", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_STATUS__VSAM_FILE_STATUS));
		printCountingMap.put("vsamFileStatus", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_files_FileStatus_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("STATUS");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_files_FileStatus_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_STATUS__FILE_STATUS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileStatus", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_files_FileStatus_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_FileStatus_0(org.servicifi.gelato.language.cobol.files.FileStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("FILE");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_FileStatus_1(org.servicifi.gelato.language.cobol.files.FileStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_files_FileStatus_2(org.servicifi.gelato.language.cobol.files.FileStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("vsamFileStatus");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.files.FilesPackage.FILE_STATUS__VSAM_FILE_STATUS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("vsamFileStatus", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_DataItem(org.servicifi.gelato.language.cobol.dataitems.DataItem element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__LEVEL_NUMBER));
		printCountingMap.put("levelNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__SUBENTRIES));
		printCountingMap.put("subentries", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__SUPERENTRY));
		printCountingMap.put("superentry", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("levelNumber");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__LEVEL_NUMBER));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__LEVEL_NUMBER), element));
				out.print(" ");
			}
			printCountingMap.put("levelNumber", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_DataItem_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_dataitems_DataItem_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_DataItem_0(org.servicifi.gelato.language.cobol.dataitems.DataItem element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("FILLER");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__NAME));
				if (o != null) {
					org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_DataItem_1(org.servicifi.gelato.language.cobol.dataitems.DataItem element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"attributes"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"water"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("water");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__WATER));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("water", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("attributes");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.DATA_ITEM__ATTRIBUTES));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("attributes", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_RenamingDataName(org.servicifi.gelato.language.cobol.dataitems.RenamingDataName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__LEVEL_NUMBER));
		printCountingMap.put("levelNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__SUBENTRIES));
		printCountingMap.put("subentries", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__SUPERENTRY));
		printCountingMap.put("superentry", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE));
		printCountingMap.put("nameRange", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("levelNumber");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__LEVEL_NUMBER));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__LEVEL_NUMBER), element));
				out.print(" ");
			}
			printCountingMap.put("levelNumber", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("RENAMES");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("nameRange");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.RENAMING_DATA_NAME__NAME_RANGE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("nameRange", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Redefines(org.servicifi.gelato.language.cobol.dataitems.Redefines element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.REDEFINES__DATA_NAME));
		printCountingMap.put("dataName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("REDEFINES");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dataName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.REDEFINES__DATA_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("dataName", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_PictureString(org.servicifi.gelato.language.cobol.dataitems.PictureString element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE));
		printCountingMap.put("picture", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_dataitems_PictureString_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_PictureString_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_dataitems_PictureString_2(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_PictureString_0(org.servicifi.gelato.language.cobol.dataitems.PictureString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("PICTURE");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("PIC");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_PictureString_1(org.servicifi.gelato.language.cobol.dataitems.PictureString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_PictureString_2(org.servicifi.gelato.language.cobol.dataitems.PictureString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"picture"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"picture"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"picture"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
				count = printCountingMap.get("picture");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE));
					if (o != null) {
						org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE), element));
						out.print(" ");
					}
					printCountingMap.put("picture", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
				count = printCountingMap.get("picture");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE));
					if (o != null) {
						org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_FIXED_LITERAL");
						resolver.setOptions(getOptions());
						out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE), element));
						out.print(" ");
					}
					printCountingMap.put("picture", count - 1);
				}
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
			count = printCountingMap.get("picture");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE));
				if (o != null) {
					org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.PICTURE_STRING__PICTURE), element));
					out.print(" ");
				}
				printCountingMap.put("picture", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Value(org.servicifi.gelato.language.cobol.dataitems.Value element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.VALUE__VALUES));
		printCountingMap.put("values", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_dataitems_Value_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_Value_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_dataitems_Value_2(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_dataitems_Value_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Value_0(org.servicifi.gelato.language.cobol.dataitems.Value element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("VALUES");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("VALUE");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Value_1(org.servicifi.gelato.language.cobol.dataitems.Value element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("ARE");
				// DEFINITION PART BEGINS (WhiteSpaces)
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (WhiteSpaces)
			out.print(" ");
			// DEFINITION PART BEGINS (CsString)
			out.print("IS");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Value_2(org.servicifi.gelato.language.cobol.dataitems.Value element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("values");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.VALUE__VALUES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("values", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_External(org.servicifi.gelato.language.cobol.dataitems.External element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(0);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_External_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("EXTERNAL");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_External_0(org.servicifi.gelato.language.cobol.dataitems.External element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Global(org.servicifi.gelato.language.cobol.dataitems.Global element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(0);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_Global_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("GLOBAL");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Global_0(org.servicifi.gelato.language.cobol.dataitems.Global element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_GroupUsage(org.servicifi.gelato.language.cobol.dataitems.GroupUsage element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(0);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GROUP-USAGE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_GroupUsage_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("NATIONAL");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_GroupUsage_0(org.servicifi.gelato.language.cobol.dataitems.GroupUsage element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Usage(org.servicifi.gelato.language.cobol.dataitems.Usage element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.USAGE__USAGE));
		printCountingMap.put("usage", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.USAGE__IS_NATIVE));
		printCountingMap.put("isNative", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_Usage_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("usage");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.USAGE__USAGE));
			if (o != null) {
			}
			printCountingMap.put("usage", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("isNative");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.USAGE__IS_NATIVE));
			if (o != null) {
			}
			printCountingMap.put("isNative", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Usage_0(org.servicifi.gelato.language.cobol.dataitems.Usage element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("USAGE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_dataitems_Usage_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_dataitems_Usage_0_0(org.servicifi.gelato.language.cobol.dataitems.Usage element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(13);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__LEVEL_NUMBER));
		printCountingMap.put("levelNumber", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__SUBENTRIES));
		printCountingMap.put("subentries", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__SUPERENTRY));
		printCountingMap.put("superentry", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__TABLE_DIMENSION));
		printCountingMap.put("tableDimension", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__INDEXED_BY));
		printCountingMap.put("indexedBy", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__KEYS_ARE));
		printCountingMap.put("keysAre", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__MAX_TABLE_DIMENSION));
		printCountingMap.put("maxTableDimension", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__DEPENDS_ON));
		printCountingMap.put("dependsOn", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("levelNumber");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__LEVEL_NUMBER));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__LEVEL_NUMBER), element));
				out.print(" ");
			}
			printCountingMap.put("levelNumber", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_Table_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_tables_Table_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_0(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"name"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("FILLER");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
			count = printCountingMap.get("name");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__NAME));
				if (o != null) {
					org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
					resolver.setOptions(getOptions());
					out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__NAME), element));
					out.print(" ");
				}
				printCountingMap.put("name", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"attributes"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"water"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"tableDimension"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("water");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__WATER));
					List<?> list = (List<?>) o;
					int index = list.size() - count;
					if (index >= 0) {
						o = list.get(index);
					} else {
						o = null;
					}
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("water", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_org_servicifi_gelato_language_cobol_tables_Table_1_0(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("attributes");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__ATTRIBUTES));
				List<?> list = (List<?>) o;
				int index = list.size() - count;
				if (index >= 0) {
					o = list.get(index);
				} else {
					o = null;
				}
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("attributes", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OCCURS");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tableDimension");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__TABLE_DIMENSION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("tableDimension", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_Table_1_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_Table_1_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_Table_1_0_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_tables_Table_1_0_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_Table_1_0_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0_0(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("maxTableDimension");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__MAX_TABLE_DIMENSION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("maxTableDimension", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0_1(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("TIMES");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0_2(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DEPENDING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_Table_1_0_2_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dependsOn");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__DEPENDS_ON));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("dependsOn", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0_2_0(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0_3(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keysAre");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__KEYS_ARE));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("keysAre", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_Table_1_0_4(org.servicifi.gelato.language.cobol.tables.Table element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("indexedBy");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE__INDEXED_BY));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("indexedBy", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_tables_KeyName(org.servicifi.gelato.language.cobol.tables.KeyName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.KEY_NAME__KEYS));
		printCountingMap.put("keys", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.KEY_NAME__KEY_ORDER));
		printCountingMap.put("keyOrder", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("keyOrder");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.KEY_NAME__KEY_ORDER));
			if (o != null) {
			}
			printCountingMap.put("keyOrder", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_KeyName_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_KeyName_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_tables_KeyName_2(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_tables_KeyName_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_KeyName_0(org.servicifi.gelato.language.cobol.tables.KeyName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("KEY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_KeyName_1(org.servicifi.gelato.language.cobol.tables.KeyName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_KeyName_2(org.servicifi.gelato.language.cobol.tables.KeyName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keys");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.KEY_NAME__KEYS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("keys", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_tables_IndexName(org.servicifi.gelato.language.cobol.tables.IndexName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES));
		printCountingMap.put("additionalIndexNames", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("INDEXED");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_tables_IndexName_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_tables_IndexName_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_IndexName_0(org.servicifi.gelato.language.cobol.tables.IndexName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_tables_IndexName_1(org.servicifi.gelato.language.cobol.tables.IndexName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("additionalIndexNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.INDEX_NAME__ADDITIONAL_INDEX_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("additionalIndexNames", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_tables_AdditionalIndexName(org.servicifi.gelato.language.cobol.tables.AdditionalIndexName element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.ADDITIONAL_INDEX_NAME__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.ADDITIONAL_INDEX_NAME__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.ADDITIONAL_INDEX_NAME__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.ADDITIONAL_INDEX_NAME__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.ADDITIONAL_INDEX_NAME__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_tables_TableDimension(org.servicifi.gelato.language.cobol.tables.TableDimension element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE_DIMENSION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE_DIMENSION__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.tables.TablesPackage.TABLE_DIMENSION__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__SECTIONS));
		printCountingMap.put("sections", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__RETURNING));
		printCountingMap.put("returning", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES));
		printCountingMap.put("declaratives", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("PROCEDURE");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("DIVISION");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_4(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_5(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_0(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("USING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_0_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_0_0(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__PARAMETERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_1(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("RETURNING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returning");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__RETURNING));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("returning", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_2(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("declaratives");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__DECLARATIVES));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("declaratives", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_3(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sentences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__SENTENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sentences", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_4(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paragraphs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__PARAGRAPHS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("paragraphs", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision_5(org.servicifi.gelato.language.cobol.divisions.ProcedureDivision element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sections");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.PROCEDURE_DIVISION__SECTIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sections", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_declaratives_Declaratives(org.servicifi.gelato.language.cobol.declaratives.Declaratives element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS));
		printCountingMap.put("declarativeSections", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DECLARATIVES");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_declaratives_Declaratives_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_declaratives_Declaratives_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("END");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("DECLARATIVES");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_declaratives_Declaratives_0(org.servicifi.gelato.language.cobol.declaratives.Declaratives element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("declarativeSections");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage.DECLARATIVES__DECLARATIVE_SECTIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("declarativeSections", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_DeclarativeSection(org.servicifi.gelato.language.cobol.sections.DeclarativeSection element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sentences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__SENTENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sentences", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_DeclarativeSection_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_DeclarativeSection_0(org.servicifi.gelato.language.cobol.sections.DeclarativeSection element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paragraphs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.DECLARATIVE_SECTION__PARAGRAPHS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("paragraphs", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sections_Section(org.servicifi.gelato.language.cobol.sections.Section element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__PARAGRAPHS));
		printCountingMap.put("paragraphs", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__SEGMENT_NUMBER));
		printCountingMap.put("segmentNumber", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("SECTION");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_sections_Section_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_Section_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sections_Section_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_Section_0(org.servicifi.gelato.language.cobol.sections.Section element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("segmentNumber");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__SEGMENT_NUMBER));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__SEGMENT_NUMBER), element));
				out.print(" ");
			}
			printCountingMap.put("segmentNumber", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_Section_1(org.servicifi.gelato.language.cobol.sections.Section element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sentences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__SENTENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sentences", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_sections_Section_2(org.servicifi.gelato.language.cobol.sections.Section element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("paragraphs");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sections.SectionsPackage.SECTION__PARAGRAPHS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("paragraphs", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_Paragraph(org.servicifi.gelato.language.cobol.paragraphs.Paragraph element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.PARAGRAPH__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.PARAGRAPH__SENTENCES));
		printCountingMap.put("sentences", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.PARAGRAPH__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.PARAGRAPH__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_paragraphs_Paragraph_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_paragraphs_Paragraph_0(org.servicifi.gelato.language.cobol.paragraphs.Paragraph element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sentences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.PARAGRAPH__SENTENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sentences", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sentences_ExecuteSentence(org.servicifi.gelato.language.cobol.sentences.ExecuteSentence element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.EXECUTE_SENTENCE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_sentences_ExecuteSentence_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_sentences_ExecuteSentence_0(org.servicifi.gelato.language.cobol.sentences.ExecuteSentence element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.EXECUTE_SENTENCE__STATEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sentences_UseSentence(org.servicifi.gelato.language.cobol.sentences.UseSentence element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.USE_SENTENCE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.USE_SENTENCE__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("USE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_sentences_UseSentence_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_sentences_UseSentence_0(org.servicifi.gelato.language.cobol.sentences.UseSentence element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.USE_SENTENCE__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sentences_Sentence(org.servicifi.gelato.language.cobol.sentences.Sentence element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.SENTENCE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.SENTENCE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.SENTENCE__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sentences_AlteredGoTo(org.servicifi.gelato.language.cobol.sentences.AlteredGoTo element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.ALTERED_GO_TO__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.ALTERED_GO_TO__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GO");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_sentences_AlteredGoTo_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_sentences_AlteredGoTo_0(org.servicifi.gelato.language.cobol.sentences.AlteredGoTo element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sentences_ExitProcedure(org.servicifi.gelato.language.cobol.sentences.ExitProcedure element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.EXIT_PROCEDURE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.EXIT_PROCEDURE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("EXIT");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_sentences_EmptySentence(org.servicifi.gelato.language.cobol.sentences.EmptySentence element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.EMPTY_SENTENCE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.sentences.SentencesPackage.EMPTY_SENTENCE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Accept(org.servicifi.gelato.language.cobol.statements.Accept element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ACCEPT__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ACCEPT__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ACCEPT__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ACCEPT__RECEIVER));
		printCountingMap.put("receiver", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ACCEPT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receiver");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ACCEPT__RECEIVER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receiver", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Accept_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Accept_0(org.servicifi.gelato.language.cobol.statements.Accept element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ACCEPT__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Release(org.servicifi.gelato.language.cobol.statements.Release element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RELEASE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RELEASE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RELEASE__RECORD_NAME));
		printCountingMap.put("recordName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RELEASE__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("RELEASE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("recordName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RELEASE__RECORD_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("recordName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Release_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Release_0(org.servicifi.gelato.language.cobol.statements.Release element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RELEASE__SENDER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Merge(org.servicifi.gelato.language.cobol.statements.Merge element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__INPUT));
		printCountingMap.put("input", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__KEY_DESCRIPTORS));
		printCountingMap.put("keyDescriptors", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("MERGE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__FILE_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Merge_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Merge_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Merge_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Merge_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Merge_3(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Merge_0(org.servicifi.gelato.language.cobol.statements.Merge element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyDescriptors");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__KEY_DESCRIPTORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("keyDescriptors", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Merge_1(org.servicifi.gelato.language.cobol.statements.Merge element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Merge_2(org.servicifi.gelato.language.cobol.statements.Merge element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__INPUT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("input", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Merge_3(org.servicifi.gelato.language.cobol.statements.Merge element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MERGE__OUTPUT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Sort(org.servicifi.gelato.language.cobol.statements.Sort element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__INPUT));
		printCountingMap.put("input", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__KEY_DESCRIPTORS));
		printCountingMap.put("keyDescriptors", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SORT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__FILE_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Sort_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Sort_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Sort_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Sort_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Sort_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Sort_0(org.servicifi.gelato.language.cobol.statements.Sort element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyDescriptors");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__KEY_DESCRIPTORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("keyDescriptors", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Sort_1(org.servicifi.gelato.language.cobol.statements.Sort element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Sort_2(org.servicifi.gelato.language.cobol.statements.Sort element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("input");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__INPUT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("input", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Sort_3(org.servicifi.gelato.language.cobol.statements.Sort element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SORT__OUTPUT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor(org.servicifi.gelato.language.cobol.statements.KeyDescriptor element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.KEY_DESCRIPTOR__ORDER));
		printCountingMap.put("order", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.KEY_DESCRIPTOR__KEY_NAMES));
		printCountingMap.put("keyNames", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("order");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.KEY_DESCRIPTOR__ORDER));
			if (o != null) {
			}
			printCountingMap.put("order", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_3(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_3(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_0(org.servicifi.gelato.language.cobol.statements.KeyDescriptor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_1(org.servicifi.gelato.language.cobol.statements.KeyDescriptor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("KEY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_2(org.servicifi.gelato.language.cobol.statements.KeyDescriptor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_KeyDescriptor_3(org.servicifi.gelato.language.cobol.statements.KeyDescriptor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.KEY_DESCRIPTOR__KEY_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("keyNames", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_ios_InputFile(org.servicifi.gelato.language.cobol.ios.InputFile element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.INPUT_FILE__FILE_NAMES));
		printCountingMap.put("fileNames", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("USING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_ios_InputFile_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_ios_InputFile_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_ios_InputFile_0(org.servicifi.gelato.language.cobol.ios.InputFile element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.INPUT_FILE__FILE_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileNames", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_ios_InputProcedure(org.servicifi.gelato.language.cobol.ios.InputProcedure element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.INPUT_PROCEDURE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("INPUT");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("PROCEDURE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_ios_InputProcedure_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.INPUT_PROCEDURE__LABEL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_ios_InputProcedure_0(org.servicifi.gelato.language.cobol.ios.InputProcedure element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_ios_OutputProcedure(org.servicifi.gelato.language.cobol.ios.OutputProcedure element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.OUTPUT_PROCEDURE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OUTPUT");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("PROCEDURE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_ios_OutputProcedure_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.OUTPUT_PROCEDURE__LABEL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_ios_OutputProcedure_0(org.servicifi.gelato.language.cobol.ios.OutputProcedure element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_ios_OutputFile(org.servicifi.gelato.language.cobol.ios.OutputFile element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.OUTPUT_FILE__FILE_NAMES));
		printCountingMap.put("fileNames", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GIVING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_ios_OutputFile_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_ios_OutputFile_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_ios_OutputFile_0(org.servicifi.gelato.language.cobol.ios.OutputFile element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.ios.IosPackage.OUTPUT_FILE__FILE_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileNames", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Continue(org.servicifi.gelato.language.cobol.statements.Continue element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONTINUE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONTINUE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONTINUE__LABELS));
		printCountingMap.put("labels", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("CONTINUE");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__POINTER));
		printCountingMap.put("pointer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__TALLY));
		printCountingMap.put("tally", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__RECEIVERS));
		printCountingMap.put("receivers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__DELIMITER));
		printCountingMap.put("delimiter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__COUNTER));
		printCountingMap.put("counter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("UNSTRING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__SENDER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("INTO");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Unstring_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Unstring_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_0(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DELIMITED");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("delimiter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__DELIMITER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("delimiter", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_0_0(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_1(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receivers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__RECEIVERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receivers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_2(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_2_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("POINTER");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("pointer");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__POINTER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("pointer", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_2_0(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_3(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("TALLYING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Unstring_3_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("counter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__COUNTER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("counter", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_3_0(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IN");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_4(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Unstring_5(org.servicifi.gelato.language.cobol.statements.Unstring element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.UNSTRING__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__TALLYING_INS));
		printCountingMap.put("tallyingIns", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__REPLACEMENTS));
		printCountingMap.put("replacements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__CONVERSIONS));
		printCountingMap.put("conversions", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__STRING));
		printCountingMap.put("string", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("INSPECT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("string");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__STRING));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("string", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Inspect_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Inspect_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Inspect_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect_0(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("TALLYING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Inspect_0_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Inspect_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect_0_0(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tallyingIns");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__TALLYING_INS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("tallyingIns", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect_1(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("REPLACING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Inspect_1_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Inspect_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect_1_0(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("replacements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__REPLACEMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("replacements", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect_2(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CONVERTING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Inspect_2_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Inspect_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Inspect_2_0(org.servicifi.gelato.language.cobol.statements.Inspect element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("conversions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INSPECT__CONVERSIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("conversions", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_TallyingIn(org.servicifi.gelato.language.cobol.statements.TallyingIn element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.TALLYING_IN__OCCURRENCES));
		printCountingMap.put("occurrences", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.TALLYING_IN__COUNTER));
		printCountingMap.put("counter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("counter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.TALLYING_IN__COUNTER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("counter", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("FOR");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_TallyingIn_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_TallyingIn_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_TallyingIn_0(org.servicifi.gelato.language.cobol.statements.TallyingIn element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("occurrences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.TALLYING_IN__OCCURRENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("occurrences", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Set(org.servicifi.gelato.language.cobol.statements.Set element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET__RECEIVERS));
		printCountingMap.put("receivers", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SET");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Set_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Set_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET__SENDER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Set_0(org.servicifi.gelato.language.cobol.statements.Set element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receivers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET__RECEIVERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receivers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_SetSwitches(org.servicifi.gelato.language.cobol.statements.SetSwitches element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_SWITCHES__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_SWITCHES__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_SWITCHES__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_SWITCHES__SWITCHES));
		printCountingMap.put("switches", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("SET");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("switches");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_SWITCHES__SWITCHES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("switches", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_SwitchStatus(org.servicifi.gelato.language.cobol.statements.SwitchStatus element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SWITCH_STATUS__STATUS));
		printCountingMap.put("status", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SWITCH_STATUS__MNEMONIC_NAMES));
		printCountingMap.put("mnemonicNames", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_SwitchStatus_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_SwitchStatus_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("status");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SWITCH_STATUS__STATUS));
			if (o != null) {
			}
			printCountingMap.put("status", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_SwitchStatus_0(org.servicifi.gelato.language.cobol.statements.SwitchStatus element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("mnemonicNames");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SWITCH_STATUS__MNEMONIC_NAMES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("mnemonicNames", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_SetIndexName(org.servicifi.gelato.language.cobol.statements.SetIndexName element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__ADJUST));
		printCountingMap.put("adjust", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__RECEIVERS));
		printCountingMap.put("receivers", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SET");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_SetIndexName_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_SetIndexName_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("adjust");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__ADJUST));
			if (o != null) {
			}
			printCountingMap.put("adjust", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__SENDER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_SetIndexName_0(org.servicifi.gelato.language.cobol.statements.SetIndexName element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receivers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SET_INDEX_NAME__RECEIVERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receivers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Return(org.servicifi.gelato.language.cobol.statements.Return element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("RETURN");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__FILE_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Return_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Return_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Return_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Return_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Return_0(org.servicifi.gelato.language.cobol.statements.Return element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("RECORD");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Return_1(org.servicifi.gelato.language.cobol.statements.Return element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("INTO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__OUTPUT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Return_2(org.servicifi.gelato.language.cobol.statements.Return element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Return_3(org.servicifi.gelato.language.cobol.statements.Return element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.RETURN__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Execute(org.servicifi.gelato.language.cobol.statements.Execute element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXECUTE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXECUTE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXECUTE__WATER));
		printCountingMap.put("water", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderInQuotes)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXECUTE__WATER));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("QUOTED_69886967_6978684569886967");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXECUTE__WATER), element));
				out.print(" ");
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__CORRESPONDING));
		printCountingMap.put("corresponding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__GIVINGS));
		printCountingMap.put("givings", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__TOS));
		printCountingMap.put("tos", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ADD");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Add_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Add_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Add_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Add_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Add_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Add_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Add_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_0(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("corresponding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__CORRESPONDING));
			if (o != null) {
			}
			printCountingMap.put("corresponding", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_1(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__OPERANDS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_2(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Add_2_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Add_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_2_0(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tos");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__TOS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("tos", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_3(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GIVING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Add_3_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Add_3_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_3_0(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("givings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__GIVINGS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("givings", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_4(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Add_5(org.servicifi.gelato.language.cobol.statements.Add element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.ADD__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__CORRESPONDING));
		printCountingMap.put("corresponding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__GIVINGS));
		printCountingMap.put("givings", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__BYS));
		printCountingMap.put("bys", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("MULTIPLY");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Multiply_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Multiply_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Multiply_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Multiply_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Multiply_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Multiply_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_0(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__OPERANDS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_1(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Multiply_1_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Multiply_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_1_0(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("bys");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__BYS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("bys", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_2(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GIVING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Multiply_2_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Multiply_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_2_0(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("givings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__GIVINGS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("givings", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_3(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Multiply_4(org.servicifi.gelato.language.cobol.statements.Multiply element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MULTIPLY__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(7);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__CORRESPONDING));
		printCountingMap.put("corresponding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__GIVINGS));
		printCountingMap.put("givings", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__FROMS));
		printCountingMap.put("froms", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SUBTRACT");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Subtract_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__OPERANDS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Subtract_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Subtract_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Subtract_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Subtract_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract_0(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("corresponding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__CORRESPONDING));
			if (o != null) {
			}
			printCountingMap.put("corresponding", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract_1(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("froms");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__FROMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("froms", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract_2(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GIVING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Subtract_2_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Subtract_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract_2_0(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("givings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__GIVINGS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("givings", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract_3(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Subtract_4(org.servicifi.gelato.language.cobol.statements.Subtract element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SUBTRACT__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__CORRESPONDING));
		printCountingMap.put("corresponding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__GIVINGS));
		printCountingMap.put("givings", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__INTOS));
		printCountingMap.put("intos", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__REMAINDERS));
		printCountingMap.put("remainders", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DIVIDE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__OPERANDS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Divide_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Divide_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Divide_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Divide_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Divide_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_0(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Divide_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Divide_0_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Divide_0_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_0_0(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("INTO");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("BY");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_0_1(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("intos");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__INTOS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("intos", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_1(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GIVING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Divide_1_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Divide_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_1_0(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("givings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__GIVINGS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("givings", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_2(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("REMAINDER");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Divide_2_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Divide_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_2_0(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("remainders");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__REMAINDERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("remainders", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_3(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Divide_4(org.servicifi.gelato.language.cobol.statements.Divide element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DIVIDE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Compute(org.servicifi.gelato.language.cobol.statements.Compute element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("COMPUTE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__EXPRESSION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expression", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Compute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Compute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Compute_0(org.servicifi.gelato.language.cobol.statements.Compute element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Compute_1(org.servicifi.gelato.language.cobol.statements.Compute element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.COMPUTE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Display(org.servicifi.gelato.language.cobol.statements.Display element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DISPLAY__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DISPLAY__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DISPLAY__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DISPLAY__OUTPUT));
		printCountingMap.put("output", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DISPLAY");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Display_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Display_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Display_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Display_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Display_0(org.servicifi.gelato.language.cobol.statements.Display element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DISPLAY__OPERANDS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Display_1(org.servicifi.gelato.language.cobol.statements.Display element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("UPON");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("output");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.DISPLAY__OUTPUT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("output", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Display_2(org.servicifi.gelato.language.cobol.statements.Display element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Display_2_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("NO");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("ADVANCING");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Display_2_0(org.servicifi.gelato.language.cobol.statements.Display element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Move(org.servicifi.gelato.language.cobol.statements.Move element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__RECEIVERS));
		printCountingMap.put("receivers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__CORRESPONDING));
		printCountingMap.put("corresponding", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("MOVE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Move_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__SENDER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receivers");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__RECEIVERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receivers", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Move_0(org.servicifi.gelato.language.cobol.statements.Move element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("corresponding");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.MOVE__CORRESPONDING));
			if (o != null) {
			}
			printCountingMap.put("corresponding", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatement(org.servicifi.gelato.language.cobol.statements.PerformNestedStatement element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("PERFORM");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatement_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("END-PERFORM");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatement_0(org.servicifi.gelato.language.cobol.statements.PerformNestedStatement element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedure(org.servicifi.gelato.language.cobol.statements.PerformProcedure element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("PERFORM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE__LABEL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES__ITERATIONS));
		printCountingMap.put("iterations", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("PERFORM");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes_1(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("END-PERFORM");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes_0(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES__ITERATIONS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("iterations", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TIMES");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes_1(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_FIXED_TIMES__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureFixedTimes(org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS));
		printCountingMap.put("iterations", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("PERFORM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__LABEL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_PerformProcedureFixedTimes_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureFixedTimes_0(org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("iterations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_FIXED_TIMES__ITERATIONS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("iterations", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TIMES");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(9);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__INIT));
		printCountingMap.put("init", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__INCREMENT));
		printCountingMap.put("increment", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__POSITION));
		printCountingMap.put("position", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__CONDITIONS));
		printCountingMap.put("conditions", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("PERFORM");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("UNTIL");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__CONDITION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_2(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CsString)
		out.print("END-PERFORM");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_0(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TEST");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("position");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__POSITION));
			if (o != null) {
			}
			printCountingMap.put("position", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_0_0(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_1(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("VARYING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__VARIABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("init");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__INIT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("init", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("increment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__INCREMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("increment", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition_2(org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_NESTED_STATEMENT_UNTIL_CONDITION__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition(org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(10);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__INIT));
		printCountingMap.put("init", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__INCREMENT));
		printCountingMap.put("increment", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__POSITION));
		printCountingMap.put("position", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__CONDITIONS));
		printCountingMap.put("conditions", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS));
		printCountingMap.put("afters", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("PERFORM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__LABEL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("UNTIL");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__CONDITION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_0(org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("TEST");
		out.print(" ");
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("position");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__POSITION));
			if (o != null) {
			}
			printCountingMap.put("position", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_0_0(org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_1(org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("VARYING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__VARIABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("init");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__INIT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("init", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("increment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__INCREMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("increment", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition_2(org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("afters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.PERFORM_PROCEDURE_UNTIL_CONDITION__AFTERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("afters", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_AfterUntilCondition(org.servicifi.gelato.language.cobol.statements.AfterUntilCondition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__INIT));
		printCountingMap.put("init", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__INCREMENT));
		printCountingMap.put("increment", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("AFTER");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__VARIABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("init");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__INIT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("init", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("increment");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__INCREMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("increment", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("UNTIL");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.AFTER_UNTIL_CONDITION__CONDITION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__RECEIVER));
		printCountingMap.put("receiver", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__KEY_NAME));
		printCountingMap.put("keyName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("READ");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__FILE_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_6(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_7(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_0(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("NEXT");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_1(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("RECORD");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_2(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("INTO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receiver");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__RECEIVER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receiver", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_3(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("KEY");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Read_3_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("keyName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__KEY_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("keyName", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_3_0(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_4(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_5(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_6(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Read_7(org.servicifi.gelato.language.cobol.statements.Read element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.READ__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__RECORD_NAME));
		printCountingMap.put("recordName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__NUM_LINES));
		printCountingMap.put("numLines", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__INTEGER));
		printCountingMap.put("integer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__MNEMONIC_NAME));
		printCountingMap.put("mnemonicName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("WRITE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("recordName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__RECORD_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("recordName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_4(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_5(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_0(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__SENDER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Write_1_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_1_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Write_1_2(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1_0(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("BEFORE");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("AFTER");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1_1(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ADVANCING");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1_2(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"numLines"		,
		"integer"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"mnemonicName"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("mnemonicName");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__MNEMONIC_NAME));
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("mnemonicName", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("PAGE");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_org_servicifi_gelato_language_cobol_statements_Write_1_2_0(element, localtab, out, printCountingMap);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1_2_0(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Write_1_2_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Write_1_2_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1_2_0_0(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"numLines"		));
		int tempMatchCount;
		tempMatchCount = 		matchCount(printCountingMap, Arrays.asList(		"integer"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (Containment)
				count = printCountingMap.get("integer");
				if (count > 0) {
					Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__INTEGER));
					if (o != null) {
						doPrint((EObject) o, out, localtab);
					}
					printCountingMap.put("integer", count - 1);
				}
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("ZERO");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("numLines");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__NUM_LINES));
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("numLines", count - 1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_1_2_0_1(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("LINES");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("LINE");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_2(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_3(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_4(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Write_5(org.servicifi.gelato.language.cobol.statements.Write element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.WRITE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Rewrite(org.servicifi.gelato.language.cobol.statements.Rewrite element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(8);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__RECORD_NAME));
		printCountingMap.put("recordName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__NUM_LINES));
		printCountingMap.put("numLines", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__INTEGER));
		printCountingMap.put("integer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__MNEMONIC_NAME));
		printCountingMap.put("mnemonicName", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__SENDER));
		printCountingMap.put("sender", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("REWRITE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("recordName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__RECORD_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("recordName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Rewrite_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Rewrite_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Rewrite_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Rewrite_0(org.servicifi.gelato.language.cobol.statements.Rewrite element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("FROM");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sender");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__SENDER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("sender", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Rewrite_1(org.servicifi.gelato.language.cobol.statements.Rewrite element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Rewrite_2(org.servicifi.gelato.language.cobol.statements.Rewrite element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.REWRITE__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_labels_Run(org.servicifi.gelato.language.cobol.labels.Run element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("RUN");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_labels_ProcedureRange(org.servicifi.gelato.language.cobol.labels.ProcedureRange element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_RANGE__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR));
		printCountingMap.put("throughOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_RANGE__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_labels_ProcedureRange_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_labels_ProcedureRange_0(org.servicifi.gelato.language.cobol.labels.ProcedureRange element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("throughOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_RANGE__THROUGH_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("throughOperator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_RANGE__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_labels_ProcedureLabel(org.servicifi.gelato.language.cobol.labels.ProcedureLabel element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__SECTION));
		printCountingMap.put("section", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProcedureRangeChildTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.labels.Procedure) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_labels_ProcedureLabel_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_labels_ProcedureLabel_0(org.servicifi.gelato.language.cobol.labels.ProcedureLabel element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_labels_ProcedureLabel_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("section");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__SECTION));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getProcedureLabelSectionReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.sections.Section) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__SECTION)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.labels.LabelsPackage.PROCEDURE_LABEL__SECTION), element));
				out.print(" ");
			}
			printCountingMap.put("section", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_labels_ProcedureLabel_0_0(org.servicifi.gelato.language.cobol.labels.ProcedureLabel element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("OF");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IN");
			out.print(" ");
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_String(org.servicifi.gelato.language.cobol.statements.String element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__POINTER));
		printCountingMap.put("pointer", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__RECEIVER));
		printCountingMap.put("receiver", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__SENDERS));
		printCountingMap.put("senders", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("STRING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_String_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_String_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("INTO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("receiver");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__RECEIVER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("receiver", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_String_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_String_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_String_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_String_0(org.servicifi.gelato.language.cobol.statements.String element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("senders");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__SENDERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("senders", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_String_1(org.servicifi.gelato.language.cobol.statements.String element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_String_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("POINTER");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("pointer");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__POINTER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("pointer", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_String_1_0(org.servicifi.gelato.language.cobol.statements.String element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("WITH");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_String_2(org.servicifi.gelato.language.cobol.statements.String element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_String_3(org.servicifi.gelato.language.cobol.statements.String element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STRING__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Condition(org.servicifi.gelato.language.cobol.statements.Condition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__ELSE_STATEMENTS));
		printCountingMap.put("elseStatements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("IF");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__CONDITION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Condition_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Condition_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Condition_0(org.servicifi.gelato.language.cobol.statements.Condition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("THEN");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Condition_1(org.servicifi.gelato.language.cobol.statements.Condition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (CsString)
		out.print("ELSE");
		out.print(" ");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elseStatements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CONDITION__ELSE_STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("elseStatements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_NextSentence(org.servicifi.gelato.language.cobol.statements.NextSentence element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NEXT_SENTENCE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NEXT_SENTENCE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NEXT_SENTENCE__LABELS));
		printCountingMap.put("labels", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("NEXT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("SENTENCE");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Stop(org.servicifi.gelato.language.cobol.statements.Stop element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STOP__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STOP__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STOP__LABEL));
		printCountingMap.put("label", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("STOP");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("label");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.STOP__LABEL));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("label", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_GoBack(org.servicifi.gelato.language.cobol.statements.GoBack element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_BACK__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_BACK__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_BACK__LABELS));
		printCountingMap.put("labels", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("GOBACK");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_GoTo(org.servicifi.gelato.language.cobol.statements.GoTo element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_TO__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_TO__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_TO__LABELS));
		printCountingMap.put("labels", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_TO__DEPENDS_ON));
		printCountingMap.put("dependsOn", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("GO");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_GoTo_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_GoTo_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_GoTo_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_GoTo_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_GoTo_0(org.servicifi.gelato.language.cobol.statements.GoTo element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("TO");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_GoTo_1(org.servicifi.gelato.language.cobol.statements.GoTo element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("labels");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_TO__LABELS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("labels", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_GoTo_2(org.servicifi.gelato.language.cobol.statements.GoTo element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DEPENDING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_GoTo_2_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("dependsOn");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.GO_TO__DEPENDS_ON));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("dependsOn", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_GoTo_2_0(org.servicifi.gelato.language.cobol.statements.GoTo element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Exit(org.servicifi.gelato.language.cobol.statements.Exit element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXIT__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXIT__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXIT__EXIT_LABEL));
		printCountingMap.put("exitLabel", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("EXIT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Exit_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Exit_0(org.servicifi.gelato.language.cobol.statements.Exit element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("exitLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EXIT__EXIT_LABEL));
			if (o != null) {
			}
			printCountingMap.put("exitLabel", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Cancel(org.servicifi.gelato.language.cobol.statements.Cancel element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CANCEL__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CANCEL__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CANCEL__SUBPROGRAMS));
		printCountingMap.put("subprograms", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("CANCEL");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subprograms");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CANCEL__SUBPROGRAMS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subprograms", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Call(org.servicifi.gelato.language.cobol.statements.Call element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__RETURNING));
		printCountingMap.put("returning", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__SUBPROGRAM));
		printCountingMap.put("subprogram", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CALL");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subprogram");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__SUBPROGRAM));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subprogram", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Call_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Call_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Call_2(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Call_0(org.servicifi.gelato.language.cobol.statements.Call element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("USING");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Call_0_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Call_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Call_0_0(org.servicifi.gelato.language.cobol.statements.Call element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__ARGUMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Call_1(org.servicifi.gelato.language.cobol.statements.Call element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("RETURNING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returning");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__RETURNING));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("returning", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Call_2(org.servicifi.gelato.language.cobol.statements.Call element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CALL__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Initialize(org.servicifi.gelato.language.cobol.statements.Initialize element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INITIALIZE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INITIALIZE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INITIALIZE__SUBPROGRAMS));
		printCountingMap.put("subprograms", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INITIALIZE__REPLACEMENTS));
		printCountingMap.put("replacements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("INITIALIZE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Initialize_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Initialize_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_Initialize_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Initialize_0(org.servicifi.gelato.language.cobol.statements.Initialize element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subprograms");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INITIALIZE__SUBPROGRAMS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subprograms", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Initialize_1(org.servicifi.gelato.language.cobol.statements.Initialize element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("REPLACING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("replacements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.INITIALIZE__REPLACEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("replacements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Open(org.servicifi.gelato.language.cobol.statements.Open element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OPEN__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OPEN__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OPEN__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OPEN__IO_FILE_DESCRIPTORS));
		printCountingMap.put("ioFileDescriptors", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("OPEN");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Open_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Open_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Open_0(org.servicifi.gelato.language.cobol.statements.Open element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ioFileDescriptors");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OPEN__IO_FILE_DESCRIPTORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("ioFileDescriptors", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Close(org.servicifi.gelato.language.cobol.statements.Close element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CLOSE__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CLOSE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CLOSE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CLOSE__IO_FILE_DESCRIPTORS));
		printCountingMap.put("ioFileDescriptors", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CLOSE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Close_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Close_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Close_0(org.servicifi.gelato.language.cobol.statements.Close element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ioFileDescriptors");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.CLOSE__IO_FILE_DESCRIPTORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("ioFileDescriptors", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor(org.servicifi.gelato.language.cobol.statements.IOFileDescriptor element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES));
		printCountingMap.put("ioFiles", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE_DESCRIPTOR__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor_0(org.servicifi.gelato.language.cobol.statements.IOFileDescriptor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE_DESCRIPTOR__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor_1(org.servicifi.gelato.language.cobol.statements.IOFileDescriptor element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("ioFiles");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE_DESCRIPTOR__IO_FILES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("ioFiles", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_IOFile(org.servicifi.gelato.language.cobol.statements.IOFile element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE__WATER));
		printCountingMap.put("water", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE__FILE_NAME));
		printCountingMap.put("fileName", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("fileName");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE__FILE_NAME));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("fileName", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_IOFile_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_IOFile_0(org.servicifi.gelato.language.cobol.statements.IOFile element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("water");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.IO_FILE__WATER));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("water", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_SerialSearch(org.servicifi.gelato.language.cobol.statements.SerialSearch element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__CASES));
		printCountingMap.put("cases", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__TABLE));
		printCountingMap.put("table", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__VARIABLE));
		printCountingMap.put("variable", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SEARCH");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("table");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__TABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("table", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_SerialSearch_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_SerialSearch_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cases");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__CASES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("cases", 0);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_SerialSearch_0(org.servicifi.gelato.language.cobol.statements.SerialSearch element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("VARYING");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("variable");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__VARIABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("variable", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_SerialSearch_1(org.servicifi.gelato.language.cobol.statements.SerialSearch element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.SERIAL_SEARCH__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_BinarySearch(org.servicifi.gelato.language.cobol.statements.BinarySearch element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__HANDLERS));
		printCountingMap.put("handlers", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__CASES));
		printCountingMap.put("cases", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__TABLE));
		printCountingMap.put("table", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("SEARCH");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("ALL");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("table");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__TABLE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("table", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_statements_BinarySearch_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cases");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__CASES));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("cases", 0);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_BinarySearch_0(org.servicifi.gelato.language.cobol.statements.BinarySearch element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlers");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.BINARY_SEARCH__HANDLERS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlers", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument(org.servicifi.gelato.language.cobol.functions.ByReferenceArgument element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.BY_REFERENCE_ARGUMENT__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_0(org.servicifi.gelato.language.cobol.functions.ByReferenceArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("REFERENCE");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_0_0(org.servicifi.gelato.language.cobol.functions.ByReferenceArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument_1(org.servicifi.gelato.language.cobol.functions.ByReferenceArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.BY_REFERENCE_ARGUMENT__OPERANDS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByContentArgument(org.servicifi.gelato.language.cobol.functions.ByContentArgument element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.BY_CONTENT_ARGUMENT__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_functions_ByContentArgument_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("CONTENT");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_functions_ByContentArgument_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_functions_ByContentArgument_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByContentArgument_0(org.servicifi.gelato.language.cobol.functions.ByContentArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByContentArgument_1(org.servicifi.gelato.language.cobol.functions.ByContentArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.BY_CONTENT_ARGUMENT__OPERANDS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_functions_OmittedArgument(org.servicifi.gelato.language.cobol.functions.OmittedArgument element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.OMITTED_ARGUMENT__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("OMITTED");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByValueArgument(org.servicifi.gelato.language.cobol.functions.ByValueArgument element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.BY_VALUE_ARGUMENT__OPERANDS));
		printCountingMap.put("operands", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_functions_ByValueArgument_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("VALUE");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_functions_ByValueArgument_1(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_functions_ByValueArgument_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByValueArgument_0(org.servicifi.gelato.language.cobol.functions.ByValueArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_ByValueArgument_1(org.servicifi.gelato.language.cobol.functions.ByValueArgument element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operands");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.BY_VALUE_ARGUMENT__OPERANDS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operands", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_Evaluate(org.servicifi.gelato.language.cobol.statements.Evaluate element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__NEXT));
		printCountingMap.put("next", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__END_VERB));
		printCountingMap.put("endVerb", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__CASES));
		printCountingMap.put("cases", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__SUBJECT));
		printCountingMap.put("subject", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("EVALUATE");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subject");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__SUBJECT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subject", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_Evaluate_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_Evaluate_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("endVerb");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__END_VERB));
			if (o != null) {
			}
			printCountingMap.put("endVerb", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_Evaluate_0(org.servicifi.gelato.language.cobol.statements.Evaluate element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("cases");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.EVALUATE__CASES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("cases", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase(org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NORMAL_EVALUATE_CASE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NORMAL_EVALUATE_CASE__OBJECTS));
		printCountingMap.put("objects", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NORMAL_EVALUATE_CASE__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase_0(org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("WHEN");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("objects");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.NORMAL_EVALUATE_CASE__OBJECTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("objects", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_statements_OtherEvaluateCase(org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OTHER_EVALUATE_CASE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OTHER_EVALUATE_CASE__OBJECTS));
		printCountingMap.put("objects", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("WHEN");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("OTHER");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.statements.StatementsPackage.OTHER_EVALUATE_CASE__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_InvalidKey(org.servicifi.gelato.language.cobol.handlers.InvalidKey element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.INVALID_KEY__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("INVALID");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_handlers_InvalidKey_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.INVALID_KEY__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_handlers_InvalidKey_0(org.servicifi.gelato.language.cobol.handlers.InvalidKey element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("KEY");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_NotInvalidKey(org.servicifi.gelato.language.cobol.handlers.NotInvalidKey element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_INVALID_KEY__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_INVALID_KEY__HANDLER_STATEMENT));
		printCountingMap.put("handlerStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlerStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_INVALID_KEY__HANDLER_STATEMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlerStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_AtEndOfPage(org.servicifi.gelato.language.cobol.handlers.AtEndOfPage element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.AT_END_OF_PAGE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.AT_END_OF_PAGE__EOP));
		printCountingMap.put("eop", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_handlers_AtEndOfPage_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("eop");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.AT_END_OF_PAGE__EOP));
			if (o != null) {
			}
			printCountingMap.put("eop", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.AT_END_OF_PAGE__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_handlers_AtEndOfPage_0(org.servicifi.gelato.language.cobol.handlers.AtEndOfPage element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("AT");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_NotAtEndOfPage(org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_AT_END_OF_PAGE__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_AT_END_OF_PAGE__HANDLER_STATEMENT));
		printCountingMap.put("handlerStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlerStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_AT_END_OF_PAGE__HANDLER_STATEMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlerStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_OnSizeError(org.servicifi.gelato.language.cobol.handlers.OnSizeError element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.ON_SIZE_ERROR__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_handlers_OnSizeError_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("SIZE");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("ERROR");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.ON_SIZE_ERROR__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_handlers_OnSizeError_0(org.servicifi.gelato.language.cobol.handlers.OnSizeError element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_OnOverflow(org.servicifi.gelato.language.cobol.handlers.OnOverflow element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.ON_OVERFLOW__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_handlers_OnOverflow_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("OVERFLOW");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.ON_OVERFLOW__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_handlers_OnOverflow_0(org.servicifi.gelato.language.cobol.handlers.OnOverflow element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_OnException(org.servicifi.gelato.language.cobol.handlers.OnException element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.ON_EXCEPTION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_handlers_OnException_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("EXCEPTION");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.ON_EXCEPTION__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_handlers_OnException_0(org.servicifi.gelato.language.cobol.handlers.OnException element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ON");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_AtEnd(org.servicifi.gelato.language.cobol.handlers.AtEnd element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.AT_END__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_handlers_AtEnd_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("END");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("statements");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.AT_END__STATEMENTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("statements", 0);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_handlers_AtEnd_0(org.servicifi.gelato.language.cobol.handlers.AtEnd element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("AT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_NotOnSizeError(org.servicifi.gelato.language.cobol.handlers.NotOnSizeError element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_SIZE_ERROR__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_SIZE_ERROR__HANDLER_STATEMENT));
		printCountingMap.put("handlerStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlerStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_SIZE_ERROR__HANDLER_STATEMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlerStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_NotOnOverflow(org.servicifi.gelato.language.cobol.handlers.NotOnOverflow element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_OVERFLOW__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_OVERFLOW__HANDLER_STATEMENT));
		printCountingMap.put("handlerStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlerStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_OVERFLOW__HANDLER_STATEMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlerStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_NotOnException(org.servicifi.gelato.language.cobol.handlers.NotOnException element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_EXCEPTION__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_EXCEPTION__HANDLER_STATEMENT));
		printCountingMap.put("handlerStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlerStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_ON_EXCEPTION__HANDLER_STATEMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlerStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_handlers_NotAtEnd(org.servicifi.gelato.language.cobol.handlers.NotAtEnd element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_AT_END__STATEMENTS));
		printCountingMap.put("statements", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_AT_END__HANDLER_STATEMENT));
		printCountingMap.put("handlerStatement", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("handlerStatement");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.handlers.HandlersPackage.NOT_AT_END__HANDLER_STATEMENT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("handlerStatement", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ExpressionList(org.servicifi.gelato.language.cobol.conditions.ExpressionList element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.EXPRESSION_LIST__EXPRESSIONS));
		printCountingMap.put("expressions", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.EXPRESSION_LIST__EXPRESSIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expressions", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_conditions_ExpressionList_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ExpressionList_0(org.servicifi.gelato.language.cobol.conditions.ExpressionList element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("ALSO");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expressions");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.EXPRESSION_LIST__EXPRESSIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expressions", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpression(org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_OR_EXPRESSION__LOGICAL_OPERATORS));
		printCountingMap.put("logicalOperators", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpression_0(org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("OR");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpression(org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpression_0(org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("AND");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpression(org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR));
		printCountingMap.put("negateOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpression_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__CHILD));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpression_0(org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("negateOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("negateOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_NestedCondition(org.servicifi.gelato.language.cobol.conditions.NestedCondition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NESTED_CONDITION__CONDITION));
		printCountingMap.put("condition", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("condition");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NESTED_CONDITION__CONDITION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("condition", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression(org.servicifi.gelato.language.cobol.conditions.RelationalExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR));
		printCountingMap.put("relationalOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR));
		printCountingMap.put("negateOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__IS));
		printCountingMap.put("is", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression_0(org.servicifi.gelato.language.cobol.conditions.RelationalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relationalOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("relationalOperator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression_0_0(org.servicifi.gelato.language.cobol.conditions.RelationalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("is");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__IS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("is", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_RelationalExpression_0_1(org.servicifi.gelato.language.cobol.conditions.RelationalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("negateOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.RELATIONAL_EXPRESSION__NEGATE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("negateOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_SignCondition(org.servicifi.gelato.language.cobol.conditions.SignCondition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR));
		printCountingMap.put("signOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR));
		printCountingMap.put("negateOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__IS));
		printCountingMap.put("is", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__CHILD));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_conditions_SignCondition_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_SignCondition_0(org.servicifi.gelato.language.cobol.conditions.SignCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_SignCondition_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_SignCondition_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("signOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__SIGN_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("signOperator", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_SignCondition_0_0(org.servicifi.gelato.language.cobol.conditions.SignCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("is");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__IS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("is", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_SignCondition_0_1(org.servicifi.gelato.language.cobol.conditions.SignCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("negateOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.SIGN_CONDITION__NEGATE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("negateOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ClassCondition(org.servicifi.gelato.language.cobol.conditions.ClassCondition element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR));
		printCountingMap.put("classOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR));
		printCountingMap.put("negateOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__IS));
		printCountingMap.put("is", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__CHILD));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_conditions_ClassCondition_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ClassCondition_0(org.servicifi.gelato.language.cobol.conditions.ClassCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_ClassCondition_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_ClassCondition_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("classOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__CLASS_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("classOperator", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ClassCondition_0_0(org.servicifi.gelato.language.cobol.conditions.ClassCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("is");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__IS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("is", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_ClassCondition_0_1(org.servicifi.gelato.language.cobol.conditions.ClassCondition element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("negateOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.CLASS_CONDITION__NEGATE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("negateOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression(org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_CONDITIONAL_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression_0(org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_CONDITIONAL_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpression(org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR));
		printCountingMap.put("negateOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpression_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__CHILD));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpression_0(org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("negateOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NEGATED_ABBREVIATED_CONDITIONAL_EXPRESSION__NEGATE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("negateOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression(org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR));
		printCountingMap.put("relationalOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__NEGATE_OPERATOR));
		printCountingMap.put("negateOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__IS));
		printCountingMap.put("is", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__CHILD));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression_0(org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression_0_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("relationalOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__RELATIONAL_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("relationalOperator", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression_0_0(org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("is");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__IS));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("is", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression_0_1(org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("negateOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.ABBREVIATED_RELATIONAL_EXPRESSION__NEGATE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("negateOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_conditions_NestedAbbreviatedConditionalExpression(org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST));
		printCountingMap.put("rest", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__EXPRESSION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expression", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("rest");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.NESTED_ABBREVIATED_CONDITIONAL_EXPRESSION__REST));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("rest", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_RangeExpression(org.servicifi.gelato.language.cobol.arithmetics.RangeExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR));
		printCountingMap.put("throughOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_arithmetics_RangeExpression_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_RangeExpression_0(org.servicifi.gelato.language.cobol.arithmetics.RangeExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("throughOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.RANGE_EXPRESSION__THROUGH_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("throughOperator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.RANGE_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression(org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR));
		printCountingMap.put("assignmentOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_1(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_0(org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ASSIGNMENT_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_0_0(org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("ROUNDED");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression_1(org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("assignmentOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("assignmentOperator", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ASSIGNMENT_EXPRESSION__VALUE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpression(org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION__ADDITIVE_OPERATORS));
		printCountingMap.put("additiveOperators", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpression_0(org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("additiveOperators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION__ADDITIVE_OPERATORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("additiveOperators", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.ADDITIVE_ARITHMETIC_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpression(org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS));
		printCountingMap.put("multiplicativeOperators", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpression_0(org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("multiplicativeOperators");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__MULTIPLICATIVE_OPERATORS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("multiplicativeOperators", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.MULTIPLICATIVE_ARITHMETIC_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpression(org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN));
		printCountingMap.put("children", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpression_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpression_0(org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("**");
		// DEFINITION PART BEGINS (WhiteSpaces)
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("children");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.POWER_ARITHMETIC_EXPRESSION__CHILDREN));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("children", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpression(org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD));
		printCountingMap.put("child", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR));
		printCountingMap.put("unaryOperator", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpression_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("child");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__CHILD));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("child", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpression_0(org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("unaryOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.UNARY_ARITHMETIC_EXPRESSION__UNARY_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("unaryOperator", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_arithmetics_NestedArithmeticExpression(org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.NESTED_ARITHMETIC_EXPRESSION__EXPRESSION));
		printCountingMap.put("expression", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("expression");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.NESTED_ARITHMETIC_EXPRESSION__EXPRESSION));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("expression", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_functions_FunctionCall(org.servicifi.gelato.language.cobol.functions.FunctionCall element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__RETURNING));
		printCountingMap.put("returning", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__MODIFIER));
		printCountingMap.put("modifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("FUNCTION");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_functions_FunctionCall_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_functions_FunctionCall_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_FunctionCall_0(org.servicifi.gelato.language.cobol.functions.FunctionCall element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_functions_FunctionCall_0_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_functions_FunctionCall_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_FunctionCall_0_0(org.servicifi.gelato.language.cobol.functions.FunctionCall element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__ARGUMENTS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_functions_FunctionCall_1(org.servicifi.gelato.language.cobol.functions.FunctionCall element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("modifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.functions.FunctionsPackage.FUNCTION_CALL__MODIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("modifier", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference(org.servicifi.gelato.language.cobol.identifiers.IdentifierReference element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__MODIFIER));
		printCountingMap.put("modifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS));
		printCountingMap.put("subscripts", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIERS));
		printCountingMap.put("qualifiers", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_0(org.servicifi.gelato.language.cobol.identifiers.IdentifierReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__QUALIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_0_0(org.servicifi.gelato.language.cobol.identifiers.IdentifierReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("OF");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IN");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_1(org.servicifi.gelato.language.cobol.identifiers.IdentifierReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subscripts");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__SUBSCRIPTS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subscripts", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference_2(org.servicifi.gelato.language.cobol.identifiers.IdentifierReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("modifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.IDENTIFIER_REFERENCE__MODIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("modifier", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier(org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier_0(org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.IDENTIFIER_REFERENCE_QUALIFIER__QUALIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier_0_0(org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("OF");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IN");
			out.print(" ");
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_LinageCounter(org.servicifi.gelato.language.cobol.identifiers.LinageCounter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.LINAGE_COUNTER__MODIFIER));
		printCountingMap.put("modifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.LINAGE_COUNTER__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("LINAGE-COUNTER");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_identifiers_LinageCounter_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_LinageCounter_0(org.servicifi.gelato.language.cobol.identifiers.LinageCounter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_identifiers_LinageCounter_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.LINAGE_COUNTER__QUALIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_LinageCounter_0_0(org.servicifi.gelato.language.cobol.identifiers.LinageCounter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("OF");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IN");
			out.print(" ");
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_RelativeSubscript(org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.RELATIVE_SUBSCRIPT__SUBSCRIPT));
		printCountingMap.put("subscript", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR));
		printCountingMap.put("additiveOperator", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER));
		printCountingMap.put("integer", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subscript");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.RELATIVE_SUBSCRIPT__SUBSCRIPT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subscript", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("additiveOperator");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.RELATIVE_SUBSCRIPT__ADDITIVE_OPERATOR));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("additiveOperator", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("integer");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.RELATIVE_SUBSCRIPT__INTEGER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("integer", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_DirectSubscript(org.servicifi.gelato.language.cobol.identifiers.DirectSubscript element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.DIRECT_SUBSCRIPT__SUBSCRIPT));
		printCountingMap.put("subscript", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("subscript");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.DIRECT_SUBSCRIPT__SUBSCRIPT));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("subscript", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_All(org.servicifi.gelato.language.cobol.identifiers.All element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.ALL__SUBSCRIPT));
		printCountingMap.put("subscript", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ALL");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_ReferenceModifier(org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.REFERENCE_MODIFIER__START));
		printCountingMap.put("start", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.REFERENCE_MODIFIER__LENGTH));
		printCountingMap.put("length", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("start");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.REFERENCE_MODIFIER__START));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("start", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(":");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_identifiers_ReferenceModifier_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_identifiers_ReferenceModifier_0(org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("length");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.REFERENCE_MODIFIER__LENGTH));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("length", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_references_AlphabetNameReference(org.servicifi.gelato.language.cobol.references.AlphabetNameReference element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.ALPHABET_NAME_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.ALPHABET_NAME_REFERENCE__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.ALPHABET_NAME_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.ALPHABET_NAME_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_references_IndexNameReference(org.servicifi.gelato.language.cobol.references.IndexNameReference element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__MODIFIER));
		printCountingMap.put("modifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__SUBSCRIPTS));
		printCountingMap.put("subscripts", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__QUALIFIERS));
		printCountingMap.put("qualifiers", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.INDEX_NAME_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference(org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference_0(org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.SPECIAL_NAMES_CONDITION_NAME_REFERENCE__QUALIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference_0_0(org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("OF");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IN");
			out.print(" ");
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_references_MnemonicNameReference(org.servicifi.gelato.language.cobol.references.MnemonicNameReference element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.MNEMONIC_NAME_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.MNEMONIC_NAME_REFERENCE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.MNEMONIC_NAME_REFERENCE__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.MNEMONIC_NAME_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.MNEMONIC_NAME_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_references_MnemonicNameReference_0(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_references_MnemonicNameReference_0(org.servicifi.gelato.language.cobol.references.MnemonicNameReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_references_MnemonicNameReference_0_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("qualifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.MNEMONIC_NAME_REFERENCE__QUALIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("qualifier", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_references_MnemonicNameReference_0_0(org.servicifi.gelato.language.cobol.references.MnemonicNameReference element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("OF");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("IN");
			out.print(" ");
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_references_FileNameReference(org.servicifi.gelato.language.cobol.references.FileNameReference element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.FILE_NAME_REFERENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.FILE_NAME_REFERENCE__QUALIFIER));
		printCountingMap.put("qualifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.FILE_NAME_REFERENCE__TARGET));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve(getReferenceResolverSwitch() == null ? null : getReferenceResolverSwitch().getElementReferenceTargetReferenceResolver().deResolve((org.servicifi.gelato.language.cobol.references.ReferenceableElement) o, element, (EReference) element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.FILE_NAME_REFERENCE__TARGET)), element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.references.ReferencesPackage.FILE_NAME_REFERENCE__TARGET), element));
				out.print(" ");
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence(org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.REPLACEMENT_OCCURRENCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.REPLACEMENT_OCCURRENCE__LOCATIONS));
		printCountingMap.put("locations", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.REPLACEMENT_OCCURRENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES));
		printCountingMap.put("occurrences", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.REPLACEMENT_OCCURRENCE__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence_0(org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("occurrences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.REPLACEMENT_OCCURRENCE__OCCURRENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("occurrences", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter(org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__LOCATIONS));
		printCountingMap.put("locations", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__SOURCE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter_0(element, localtab, out, printCountingMap);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__TARGET));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter_1(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter_0(org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		int alt = -1;
		alt = 0;
		int matches = 		0;
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("TO");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (CsString)
			out.print("BY");
			out.print(" ");
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter_1(org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("locations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER_BY_SPECIFIC_CHARACTER__LOCATIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("locations", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_AnyCharacterBySpecificCharacter(org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.ANY_CHARACTER_BY_SPECIFIC_CHARACTER__LOCATIONS));
		printCountingMap.put("locations", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.ANY_CHARACTER_BY_SPECIFIC_CHARACTER__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CHARACTERS");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.ANY_CHARACTER_BY_SPECIFIC_CHARACTER__TARGET));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_strings_AnyCharacterBySpecificCharacter_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_AnyCharacterBySpecificCharacter_0(org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("locations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.ANY_CHARACTER_BY_SPECIFIC_CHARACTER__LOCATIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("locations", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_Location(org.servicifi.gelato.language.cobol.strings.Location element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.LOCATION__POSITION));
		printCountingMap.put("position", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.LOCATION__INITIAL));
		printCountingMap.put("initial", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.LOCATION__BASE));
		printCountingMap.put("base", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("position");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.LOCATION__POSITION));
			if (o != null) {
			}
			printCountingMap.put("position", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("initial");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.LOCATION__INITIAL));
			if (o != null) {
			}
			printCountingMap.put("initial", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("base");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.LOCATION__BASE));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("base", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings(org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.CONCATENATING_STRINGS__STRINGS));
		printCountingMap.put("strings", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.CONCATENATING_STRINGS__DELIMITER));
		printCountingMap.put("delimiter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("strings");
		if (count > 0) {
			List<?> list = (List<?>)element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.CONCATENATING_STRINGS__STRINGS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("strings", 0);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("DELIMITED");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings_1(element, localtab, out, printCountingMap);
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings_0(org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings_1(org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		int alt = -1;
		alt = 0;
		int matches = 		matchCount(printCountingMap, Arrays.asList(		"delimiter"		));
		int tempMatchCount;
		tempMatchCount = 		0;
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CsString)
				out.print("SIZE");
				out.print(" ");
			}
			break;
			default:			// DEFINITION PART BEGINS (Containment)
			count = printCountingMap.get("delimiter");
			if (count > 0) {
				Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.CONCATENATING_STRINGS__DELIMITER));
				if (o != null) {
					doPrint((EObject) o, out, localtab);
				}
				printCountingMap.put("delimiter", count - 1);
			}
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_SplittedString(org.servicifi.gelato.language.cobol.strings.SplittedString element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPLITTED_STRING__STRINGS));
		printCountingMap.put("strings", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPLITTED_STRING__DELIMITER));
		printCountingMap.put("delimiter", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPLITTED_STRING__COUNTER));
		printCountingMap.put("counter", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("strings");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPLITTED_STRING__STRINGS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("strings", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_strings_SplittedString_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_strings_SplittedString_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SplittedString_0(org.servicifi.gelato.language.cobol.strings.SplittedString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("DELIMITER");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_strings_SplittedString_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("delimiter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPLITTED_STRING__DELIMITER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("delimiter", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SplittedString_0_0(org.servicifi.gelato.language.cobol.strings.SplittedString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IN");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SplittedString_1(org.servicifi.gelato.language.cobol.strings.SplittedString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("COUNT");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_strings_SplittedString_1_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("counter");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPLITTED_STRING__COUNTER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("counter", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SplittedString_1_0(org.servicifi.gelato.language.cobol.strings.SplittedString element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("IN");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_AnyCharacter(org.servicifi.gelato.language.cobol.strings.AnyCharacter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.ANY_CHARACTER__LOCATIONS));
		printCountingMap.put("locations", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("CHARACTERS");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_strings_AnyCharacter_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_AnyCharacter_0(org.servicifi.gelato.language.cobol.strings.AnyCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("locations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.ANY_CHARACTER__LOCATIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("locations", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence(org.servicifi.gelato.language.cobol.strings.TallyingOccurrence element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.TALLYING_OCCURRENCE__LOCATIONS));
		printCountingMap.put("locations", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.TALLYING_OCCURRENCE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES));
		printCountingMap.put("occurrences", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.TALLYING_OCCURRENCE__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		print_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence_0(element, localtab, out, printCountingMap);
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence_0(org.servicifi.gelato.language.cobol.strings.TallyingOccurrence element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("occurrences");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.TALLYING_OCCURRENCE__OCCURRENCES));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("occurrences", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_strings_SpecificCharacter(org.servicifi.gelato.language.cobol.strings.SpecificCharacter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER__LOCATIONS));
		printCountingMap.put("locations", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER__TALLYING));
		printCountingMap.put("tallying", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("tallying");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER__TALLYING));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("tallying", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new StringWriter();
			out1 = new PrintWriter(sWriter);
			printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
			print_org_servicifi_gelato_language_cobol_strings_SpecificCharacter_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_strings_SpecificCharacter_0(org.servicifi.gelato.language.cobol.strings.SpecificCharacter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("locations");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.strings.StringsPackage.SPECIFIC_CHARACTER__LOCATIONS));
			List<?> list = (List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("locations", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter(org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_REFERENCE_PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_REFERENCE_PARAMETER__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_REFERENCE_PARAMETER__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_REFERENCE_PARAMETER__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_REFERENCE_PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter_0(org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		String localtab = outertab;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter_0_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("REFERENCE");
		out.print(" ");
	}
	
	public void print_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter_0_0(org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_parameters_ByValueParameter(org.servicifi.gelato.language.cobol.parameters.ByValueParameter element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_VALUE_PARAMETER__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_VALUE_PARAMETER__ALIASES_TO));
		printCountingMap.put("aliasesTo", temp == null ? 0 : ((Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_VALUE_PARAMETER__ALIASES_FROM));
		printCountingMap.put("aliasesFrom", temp == null ? 0 : ((Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_parameters_ByValueParameter_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("VALUE");
		out.print(" ");
		// DEFINITION PART BEGINS (PlaceholderUsingDefaultToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_VALUE_PARAMETER__NAME));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("COBOL_WORD");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.parameters.ParametersPackage.BY_VALUE_PARAMETER__NAME), element));
				out.print(" ");
			}
			printCountingMap.put("name", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_parameters_ByValueParameter_0(org.servicifi.gelato.language.cobol.parameters.ByValueParameter element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("BY");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operands_RoundedIdentifier(org.servicifi.gelato.language.cobol.operands.RoundedIdentifier element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operands.OperandsPackage.ROUNDED_IDENTIFIER__IDENTIFIER));
		printCountingMap.put("identifier", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("identifier");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operands.OperandsPackage.ROUNDED_IDENTIFIER__IDENTIFIER));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("identifier", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("ROUNDED");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operands_Encoding(org.servicifi.gelato.language.cobol.operands.Encoding element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operands.OperandsPackage.ENCODING__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operands.OperandsPackage.ENCODING__TYPE));
			if (o != null) {
			}
			printCountingMap.put("type", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_operands_Encoding_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_operands_Encoding_0(org.servicifi.gelato.language.cobol.operands.Encoding element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("DATA");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_verbs_Is(org.servicifi.gelato.language.cobol.verbs.Is element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("IS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Addition(org.servicifi.gelato.language.cobol.operators.Addition element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("+");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Subtraction(org.servicifi.gelato.language.cobol.operators.Subtraction element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Multiplication(org.servicifi.gelato.language.cobol.operators.Multiplication element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("*");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Division(org.servicifi.gelato.language.cobol.operators.Division element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("/");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Negate(org.servicifi.gelato.language.cobol.operators.Negate element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("NOT");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_EqualSign(org.servicifi.gelato.language.cobol.operators.EqualSign element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.EQUAL_SIGN__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_EqualPhrase(org.servicifi.gelato.language.cobol.operators.EqualPhrase element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.EQUAL_PHRASE__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("EQUAL");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("to");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.EQUAL_PHRASE__TO));
			if (o != null) {
			}
			printCountingMap.put("to", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_LTSign(org.servicifi.gelato.language.cobol.operators.LTSign element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LT_SIGN__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_LTPhrase(org.servicifi.gelato.language.cobol.operators.LTPhrase element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LT_PHRASE__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("LESS");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("than");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LT_PHRASE__THAN));
			if (o != null) {
			}
			printCountingMap.put("than", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_GTSign(org.servicifi.gelato.language.cobol.operators.GTSign element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GT_SIGN__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_GTPhrase(org.servicifi.gelato.language.cobol.operators.GTPhrase element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GT_PHRASE__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("GREATER");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("than");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GT_PHRASE__THAN));
			if (o != null) {
			}
			printCountingMap.put("than", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_LTEQSign(org.servicifi.gelato.language.cobol.operators.LTEQSign element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LTEQ_SIGN__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LTEQ_SIGN__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("<");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_LTEQPhrase(org.servicifi.gelato.language.cobol.operators.LTEQPhrase element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LTEQ_PHRASE__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LTEQ_PHRASE__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("LESS");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("than");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LTEQ_PHRASE__THAN));
			if (o != null) {
			}
			printCountingMap.put("than", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("OR");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("EQUAL");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("to");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.LTEQ_PHRASE__TO));
			if (o != null) {
			}
			printCountingMap.put("to", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_GTEQSign(org.servicifi.gelato.language.cobol.operators.GTEQSign element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GTEQ_SIGN__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GTEQ_SIGN__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(">");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("=");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_GTEQPhrase(org.servicifi.gelato.language.cobol.operators.GTEQPhrase element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GTEQ_PHRASE__THAN));
		printCountingMap.put("than", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GTEQ_PHRASE__TO));
		printCountingMap.put("to", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("GREATER");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("than");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GTEQ_PHRASE__THAN));
			if (o != null) {
			}
			printCountingMap.put("than", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("OR");
		out.print(" ");
		// DEFINITION PART BEGINS (CsString)
		out.print("EQUAL");
		out.print(" ");
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("to");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.GTEQ_PHRASE__TO));
			if (o != null) {
			}
			printCountingMap.put("to", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Positive(org.servicifi.gelato.language.cobol.operators.Positive element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("POSITIVE");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Negative(org.servicifi.gelato.language.cobol.operators.Negative element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("NEGATIVE");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Zero(org.servicifi.gelato.language.cobol.operators.Zero element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ZERO");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Numeric(org.servicifi.gelato.language.cobol.operators.Numeric element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("NUMERIC");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Alphabetic(org.servicifi.gelato.language.cobol.operators.Alphabetic element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ALPHABETIC");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_AlphabeticLower(org.servicifi.gelato.language.cobol.operators.AlphabeticLower element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ALPHABETIC-LOWER");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_AlphabeticUpper(org.servicifi.gelato.language.cobol.operators.AlphabeticUpper element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ALPHABETIC-UPPER");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_DBCS(org.servicifi.gelato.language.cobol.operators.DBCS element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("DBCS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Kanji(org.servicifi.gelato.language.cobol.operators.Kanji element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("KANJI");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_operators_Through(org.servicifi.gelato.language.cobol.operators.Through element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.THROUGH__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.operators.OperatorsPackage.THROUGH__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_IntegerLiteral(org.servicifi.gelato.language.cobol.literals.IntegerLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.INTEGER_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.INTEGER_LITERAL__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.INTEGER_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_FixedDecimalLiteral(org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.FIXED_DECIMAL_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.FIXED_DECIMAL_LITERAL__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_FIXED_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.FIXED_DECIMAL_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_FloatingDecimalLiteral(org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.FLOATING_DECIMAL_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.FLOATING_DECIMAL_LITERAL__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_FLOAT_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.FLOATING_DECIMAL_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_AlphanumericLiteral(org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ALPHANUMERIC_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ALPHANUMERIC_LITERAL__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("ALPHANUMERIC_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ALPHANUMERIC_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_AlphanumericHexaDecimalLiteral(org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ALPHANUMERIC_HEXA_DECIMAL_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ALPHANUMERIC_HEXA_DECIMAL_LITERAL__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("ALPHANUMERIC_HEX_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ALPHANUMERIC_HEXA_DECIMAL_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_BooleanLiteral(org.servicifi.gelato.language.cobol.literals.BooleanLiteral element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.BOOLEAN_LITERAL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.BOOLEAN_LITERAL__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("BOOLEAN_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.BOOLEAN_LITERAL__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_Null(org.servicifi.gelato.language.cobol.literals.Null element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.NULL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.NULL__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_Zero(org.servicifi.gelato.language.cobol.literals.Zero element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ZERO__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.ZERO__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_Quote(org.servicifi.gelato.language.cobol.literals.Quote element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.QUOTE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.QUOTE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_LowValue(org.servicifi.gelato.language.cobol.literals.LowValue element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.LOW_VALUE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.LOW_VALUE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_HighValue(org.servicifi.gelato.language.cobol.literals.HighValue element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.HIGH_VALUE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.HIGH_VALUE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_Space(org.servicifi.gelato.language.cobol.literals.Space element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.SPACE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.literals.LiteralsPackage.SPACE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_Any(org.servicifi.gelato.language.cobol.literals.Any element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("ANY");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_literals_Characters(org.servicifi.gelato.language.cobol.literals.Characters element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("CHARACTERS");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_SystemLogicalInput(org.servicifi.gelato.language.cobol.environments.SystemLogicalInput element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.SYSTEM_LOGICAL_INPUT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.SYSTEM_LOGICAL_INPUT__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_SystemLogicalOutput(org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.SYSTEM_LOGICAL_OUTPUT__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.SYSTEM_LOGICAL_OUTPUT__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_SystemPunchDevice(org.servicifi.gelato.language.cobol.environments.SystemPunchDevice element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.SYSTEM_PUNCH_DEVICE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.SYSTEM_PUNCH_DEVICE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_Console(org.servicifi.gelato.language.cobol.environments.Console element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("CONSOLE");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_Channel(org.servicifi.gelato.language.cobol.environments.Channel element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.CHANNEL__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.CHANNEL__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_SuppressSpacing(org.servicifi.gelato.language.cobol.environments.SuppressSpacing element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("CSP");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_Pocket(org.servicifi.gelato.language.cobol.environments.Pocket element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.POCKET__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.POCKET__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_AdvancedFunctionPrinting(org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("AFP-5A");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_environments_UPSI(org.servicifi.gelato.language.cobol.environments.UPSI element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.UPSI__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.UPSI__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_registers_ShiftIn(org.servicifi.gelato.language.cobol.registers.ShiftIn element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.SHIFT_IN__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("SHIFT-IN");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_registers_ShiftOut(org.servicifi.gelato.language.cobol.registers.ShiftOut element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.SHIFT_OUT__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("SHIFT-OUT");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_registers_AddressOf(org.servicifi.gelato.language.cobol.registers.AddressOf element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.ADDRESS_OF__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("ADDRESS");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_registers_AddressOf_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.ADDRESS_OF__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_registers_AddressOf_0(org.servicifi.gelato.language.cobol.registers.AddressOf element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("OF");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_registers_LengthOf(org.servicifi.gelato.language.cobol.registers.LengthOf element, String outertab, PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.LENGTH_OF__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		PrintWriter out1 = null;
		Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("LENGTH");
		out.print(" ");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new StringWriter();
		out1 = new PrintWriter(sWriter);
		printCountingMap1 = new LinkedHashMap<String, Integer>(printCountingMap);
		print_org_servicifi_gelato_language_cobol_registers_LengthOf_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("operand");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.LENGTH_OF__OPERAND));
			if (o != null) {
				doPrint((EObject) o, out, localtab);
			}
			printCountingMap.put("operand", count - 1);
		}
	}
	
	public void print_org_servicifi_gelato_language_cobol_registers_LengthOf_0(org.servicifi.gelato.language.cobol.registers.LengthOf element, String outertab, PrintWriter out, Map<String, Integer> printCountingMap) {
		// DEFINITION PART BEGINS (CsString)
		out.print("OF");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_registers_ReturnCode(org.servicifi.gelato.language.cobol.registers.ReturnCode element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.RETURN_CODE__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("RETURN-CODE");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_registers_WhenCompiled(org.servicifi.gelato.language.cobol.registers.WhenCompiled element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.registers.RegistersPackage.WHEN_COMPILED__OPERAND));
		printCountingMap.put("operand", temp == null ? 0 : 1);
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print("WHEN-COMPILED");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_SortPhraseToken(org.servicifi.gelato.language.cobol.water.SortPhraseToken element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.SORT_PHRASE_TOKEN__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.SORT_PHRASE_TOKEN__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_Dot(org.servicifi.gelato.language.cobol.water.Dot element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		// print collected hidden tokens
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		out.print(" ");
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_ProgramDescription(org.servicifi.gelato.language.cobol.water.ProgramDescription element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.PROGRAM_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.PROGRAM_DESCRIPTION__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_ObjectComputerDescription(org.servicifi.gelato.language.cobol.water.ObjectComputerDescription element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.OBJECT_COMPUTER_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.OBJECT_COMPUTER_DESCRIPTION__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_SpecialNamesClause(org.servicifi.gelato.language.cobol.water.SpecialNamesClause element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.SPECIAL_NAMES_CLAUSE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.SPECIAL_NAMES_CLAUSE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_SelectStatementClause(org.servicifi.gelato.language.cobol.water.SelectStatementClause element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.SELECT_STATEMENT_CLAUSE__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.SELECT_STATEMENT_CLAUSE__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_FileDescription(org.servicifi.gelato.language.cobol.water.FileDescription element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.FILE_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.FILE_DESCRIPTION__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_DataDescription(org.servicifi.gelato.language.cobol.water.DataDescription element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.DATA_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.DATA_DESCRIPTION__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_IOControlDescription(org.servicifi.gelato.language.cobol.water.IOControlDescription element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.IO_CONTROL_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.IO_CONTROL_DESCRIPTION__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_RepositoryDescription(org.servicifi.gelato.language.cobol.water.RepositoryDescription element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.REPOSITORY_DESCRIPTION__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.REPOSITORY_DESCRIPTION__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_AcceptStatementToken(org.servicifi.gelato.language.cobol.water.AcceptStatementToken element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.ACCEPT_STATEMENT_TOKEN__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.ACCEPT_STATEMENT_TOKEN__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_UseStatementToken(org.servicifi.gelato.language.cobol.water.UseStatementToken element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.USE_STATEMENT_TOKEN__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.USE_STATEMENT_TOKEN__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_CloseStatementToken(org.servicifi.gelato.language.cobol.water.CloseStatementToken element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.CLOSE_STATEMENT_TOKEN__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.CLOSE_STATEMENT_TOKEN__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_OpenStatementToken(org.servicifi.gelato.language.cobol.water.OpenStatementToken element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.OPEN_STATEMENT_TOKEN__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.OPEN_STATEMENT_TOKEN__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_InvokeStatementToken(org.servicifi.gelato.language.cobol.water.InvokeStatementToken element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.INVOKE_STATEMENT_TOKEN__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (EnumTerminal)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.INVOKE_STATEMENT_TOKEN__VALUE));
			if (o != null) {
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
	public void print_org_servicifi_gelato_language_cobol_water_PriorityNumber(org.servicifi.gelato.language.cobol.water.PriorityNumber element, String outertab, PrintWriter out) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		Map<String, Integer> printCountingMap = new LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.PRIORITY_NUMBER__VALUE));
		printCountingMap.put("value", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("value");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.PRIORITY_NUMBER__VALUE));
			if (o != null) {
				org.servicifi.gelato.language.cobol.resource.cobol.ICobolTokenResolver resolver = tokenResolverFactory.createTokenResolver("DECIMAL_INTEGER_LITERAL");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(org.servicifi.gelato.language.cobol.water.WaterPackage.PRIORITY_NUMBER__VALUE), element));
				out.print(" ");
			}
			printCountingMap.put("value", count - 1);
		}
	}
	
	
}
