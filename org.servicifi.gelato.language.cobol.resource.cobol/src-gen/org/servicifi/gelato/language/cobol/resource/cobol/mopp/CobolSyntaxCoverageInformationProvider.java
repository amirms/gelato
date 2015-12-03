/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import org.eclipse.emf.ecore.EClass;

public class CobolSyntaxCoverageInformationProvider {
	
	public EClass[] getClassesWithSyntax() {
		return new EClass[] {
			org.servicifi.gelato.language.cobol.containers.ContainersPackage.eINSTANCE.getCompilationGroup(),
			org.servicifi.gelato.language.cobol.containers.ContainersPackage.eINSTANCE.getCompilationUnit(),
			org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.eINSTANCE.getIdentificationDivision(),
			org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.eINSTANCE.getEnvironmentDivision(),
			org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.eINSTANCE.getDataDivision(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getConfigurationSection(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getIOSection(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getFileSection(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getWorkingStorageSection(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getLocalStorageSection(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getLinkageStorageSection(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getSourceComputerParagraph(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getDebuggingMode(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getObjectComputerParagraph(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getSpecialNamesParagraph(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getRepositoryParagraph(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getFileControlParagraph(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getIOControlParagraph(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getSystemDeviceIs(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getUPSISwitchIs(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getOnStatus(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getOffStatus(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getCurrencySign(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getClassName(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getSymbolicCharacterStatement(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getSymbolicCharacter(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getAlphabetName(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getPredefinedAlphabetType(),
			org.servicifi.gelato.language.cobol.specialnames.SpecialnamesPackage.eINSTANCE.getCodeNameAlphabetType(),
			org.servicifi.gelato.language.cobol.files.FilesPackage.eINSTANCE.getFileName(),
			org.servicifi.gelato.language.cobol.files.FilesPackage.eINSTANCE.getSelectStatement(),
			org.servicifi.gelato.language.cobol.files.FilesPackage.eINSTANCE.getFileStatus(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getDataItem(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getRenamingDataName(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getRedefines(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getPictureString(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getValue(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getExternal(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getGlobal(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getGroupUsage(),
			org.servicifi.gelato.language.cobol.dataitems.DataitemsPackage.eINSTANCE.getUsage(),
			org.servicifi.gelato.language.cobol.tables.TablesPackage.eINSTANCE.getTable(),
			org.servicifi.gelato.language.cobol.tables.TablesPackage.eINSTANCE.getKeyName(),
			org.servicifi.gelato.language.cobol.tables.TablesPackage.eINSTANCE.getIndexName(),
			org.servicifi.gelato.language.cobol.tables.TablesPackage.eINSTANCE.getAdditionalIndexName(),
			org.servicifi.gelato.language.cobol.tables.TablesPackage.eINSTANCE.getTableDimension(),
			org.servicifi.gelato.language.cobol.divisions.DivisionsPackage.eINSTANCE.getProcedureDivision(),
			org.servicifi.gelato.language.cobol.declaratives.DeclarativesPackage.eINSTANCE.getDeclaratives(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getDeclarativeSection(),
			org.servicifi.gelato.language.cobol.sections.SectionsPackage.eINSTANCE.getSection(),
			org.servicifi.gelato.language.cobol.paragraphs.ParagraphsPackage.eINSTANCE.getParagraph(),
			org.servicifi.gelato.language.cobol.sentences.SentencesPackage.eINSTANCE.getExecuteSentence(),
			org.servicifi.gelato.language.cobol.sentences.SentencesPackage.eINSTANCE.getUseSentence(),
			org.servicifi.gelato.language.cobol.sentences.SentencesPackage.eINSTANCE.getSentence(),
			org.servicifi.gelato.language.cobol.sentences.SentencesPackage.eINSTANCE.getAlteredGoTo(),
			org.servicifi.gelato.language.cobol.sentences.SentencesPackage.eINSTANCE.getExitProcedure(),
			org.servicifi.gelato.language.cobol.sentences.SentencesPackage.eINSTANCE.getEmptySentence(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getStart(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getDelete(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getAccept(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getKeyDescriptor(),
			org.servicifi.gelato.language.cobol.ios.IosPackage.eINSTANCE.getInputFile(),
			org.servicifi.gelato.language.cobol.ios.IosPackage.eINSTANCE.getInputProcedure(),
			org.servicifi.gelato.language.cobol.ios.IosPackage.eINSTANCE.getOutputProcedure(),
			org.servicifi.gelato.language.cobol.ios.IosPackage.eINSTANCE.getOutputFile(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getContinue(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getUnstring(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getInspect(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getTallyingIn(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getSet(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getSetSwitches(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getSwitchStatus(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getSetIndexName(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getReturn(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getExecute(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getAdd(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getMultiply(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getSubtract(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getDivide(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getCompute(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getDisplay(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getMove(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getPerformNestedStatement(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getPerformProcedure(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getPerformNestedStatementFixedTimes(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getPerformProcedureFixedTimes(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getPerformNestedStatementUntilCondition(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getPerformProcedureUntilCondition(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getAfterUntilCondition(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getRead(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getWrite(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getRewrite(),
			org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getRun(),
			org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureRange(),
			org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureLabel(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getString(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getCondition(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getNextSentence(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getStop(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getGoBack(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getGoTo(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getExit(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getCancel(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getCall(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getInitialize(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getOpen(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getClose(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getIOFileDescriptor(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getIOFile(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getSerialSearch(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getBinarySearch(),
			org.servicifi.gelato.language.cobol.functions.FunctionsPackage.eINSTANCE.getByReferenceArgument(),
			org.servicifi.gelato.language.cobol.functions.FunctionsPackage.eINSTANCE.getByContentArgument(),
			org.servicifi.gelato.language.cobol.functions.FunctionsPackage.eINSTANCE.getOmittedArgument(),
			org.servicifi.gelato.language.cobol.functions.FunctionsPackage.eINSTANCE.getByValueArgument(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getEvaluate(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getNormalEvaluateCase(),
			org.servicifi.gelato.language.cobol.statements.StatementsPackage.eINSTANCE.getOtherEvaluateCase(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getInvalidKey(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getNotInvalidKey(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getAtEndOfPage(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getNotAtEndOfPage(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getOnSizeError(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getOnOverflow(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getOnException(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getAtEnd(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getNotOnSizeError(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getNotOnOverflow(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getNotOnException(),
			org.servicifi.gelato.language.cobol.handlers.HandlersPackage.eINSTANCE.getNotAtEnd(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getExpressionList(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getConditionalOrExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getConditionalAndExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getNegatedConditionalExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getNestedCondition(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getRelationalExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getSignCondition(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getClassCondition(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getAbbreviatedConditionalExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getNegatedAbbreviatedConditionalExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getAbbreviatedRelationalExpression(),
			org.servicifi.gelato.language.cobol.conditions.ConditionsPackage.eINSTANCE.getNestedAbbreviatedConditionalExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getRangeExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getAssignmentExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getAdditiveArithmeticExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getMultiplicativeArithmeticExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getPowerArithmeticExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getUnaryArithmeticExpression(),
			org.servicifi.gelato.language.cobol.arithmetics.ArithmeticsPackage.eINSTANCE.getNestedArithmeticExpression(),
			org.servicifi.gelato.language.cobol.functions.FunctionsPackage.eINSTANCE.getFunctionCall(),
			org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.eINSTANCE.getIdentifierReference(),
			org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getIdentifierReferenceQualifier(),
			org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.eINSTANCE.getLinageCounter(),
			org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.eINSTANCE.getRelativeSubscript(),
			org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.eINSTANCE.getDirectSubscript(),
			org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.eINSTANCE.getAll(),
			org.servicifi.gelato.language.cobol.identifiers.IdentifiersPackage.eINSTANCE.getReferenceModifier(),
			org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getAlphabetNameReference(),
			org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getIndexNameReference(),
			org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getSpecialNamesConditionNameReference(),
			org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getMnemonicNameReference(),
			org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getFileNameReference(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getReplacementOccurrence(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getSpecificCharacterBySpecificCharacter(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getAnyCharacterBySpecificCharacter(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getLocation(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getConcatenatingStrings(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getSplittedString(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getAnyCharacter(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getTallyingOccurrence(),
			org.servicifi.gelato.language.cobol.strings.StringsPackage.eINSTANCE.getSpecificCharacter(),
			org.servicifi.gelato.language.cobol.parameters.ParametersPackage.eINSTANCE.getByReferenceParameter(),
			org.servicifi.gelato.language.cobol.parameters.ParametersPackage.eINSTANCE.getByValueParameter(),
			org.servicifi.gelato.language.cobol.operands.OperandsPackage.eINSTANCE.getRoundedIdentifier(),
			org.servicifi.gelato.language.cobol.operands.OperandsPackage.eINSTANCE.getEncoding(),
			org.servicifi.gelato.language.cobol.verbs.VerbsPackage.eINSTANCE.getIs(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getAddition(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getSubtraction(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getMultiplication(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getDivision(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getNegate(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getEqualSign(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getEqualPhrase(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getLTSign(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getLTPhrase(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getGTSign(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getGTPhrase(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getLTEQSign(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getLTEQPhrase(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getGTEQSign(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getGTEQPhrase(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getPositive(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getNegative(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getZero(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getNumeric(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getAlphabetic(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getAlphabeticLower(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getAlphabeticUpper(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getDBCS(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getKanji(),
			org.servicifi.gelato.language.cobol.operators.OperatorsPackage.eINSTANCE.getThrough(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getIntegerLiteral(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getFixedDecimalLiteral(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getFloatingDecimalLiteral(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getAlphanumericLiteral(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getAlphanumericHexaDecimalLiteral(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getBooleanLiteral(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getNull(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getZero(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getQuote(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getLowValue(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getHighValue(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getSpace(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getAny(),
			org.servicifi.gelato.language.cobol.literals.LiteralsPackage.eINSTANCE.getCharacters(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getSystemLogicalInput(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getSystemLogicalOutput(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getSystemPunchDevice(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getConsole(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getChannel(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getSuppressSpacing(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getPocket(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getAdvancedFunctionPrinting(),
			org.servicifi.gelato.language.cobol.environments.EnvironmentsPackage.eINSTANCE.getUPSI(),
			org.servicifi.gelato.language.cobol.registers.RegistersPackage.eINSTANCE.getShiftIn(),
			org.servicifi.gelato.language.cobol.registers.RegistersPackage.eINSTANCE.getShiftOut(),
			org.servicifi.gelato.language.cobol.registers.RegistersPackage.eINSTANCE.getAddressOf(),
			org.servicifi.gelato.language.cobol.registers.RegistersPackage.eINSTANCE.getLengthOf(),
			org.servicifi.gelato.language.cobol.registers.RegistersPackage.eINSTANCE.getReturnCode(),
			org.servicifi.gelato.language.cobol.registers.RegistersPackage.eINSTANCE.getWhenCompiled(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getSortPhraseToken(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getDot(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getProgramDescription(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getObjectComputerDescription(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getSpecialNamesClause(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getSelectStatementClause(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getFileDescription(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getDataDescription(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getIOControlDescription(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getRepositoryDescription(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getAcceptStatementToken(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getUseStatementToken(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getCloseStatementToken(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getOpenStatementToken(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getInvokeStatementToken(),
			org.servicifi.gelato.language.cobol.water.WaterPackage.eINSTANCE.getPriorityNumber(),
		};
	}
	
	public EClass[] getStartSymbols() {
		return new EClass[] {
			org.servicifi.gelato.language.cobol.containers.ContainersPackage.eINSTANCE.getCompilationGroup(),
		};
	}
	
}
