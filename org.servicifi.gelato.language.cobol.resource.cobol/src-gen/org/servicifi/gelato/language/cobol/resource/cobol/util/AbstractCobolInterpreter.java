/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpression;
import org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression;
import org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild;
import org.servicifi.gelato.language.cobol.commons.Commentable;
import org.servicifi.gelato.language.cobol.commons.LabellableElement;
import org.servicifi.gelato.language.cobol.commons.NamedElement;
import org.servicifi.gelato.language.cobol.commons.URIableElement;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression;
import org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ClassCondition;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression;
import org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.ExpressionList;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild;
import org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression;
import org.servicifi.gelato.language.cobol.conditions.NestedCondition;
import org.servicifi.gelato.language.cobol.conditions.RelationalExpression;
import org.servicifi.gelato.language.cobol.conditions.SignCondition;
import org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild;
import org.servicifi.gelato.language.cobol.containers.CobolRoot;
import org.servicifi.gelato.language.cobol.containers.CompilationGroup;
import org.servicifi.gelato.language.cobol.containers.CompilationUnit;
import org.servicifi.gelato.language.cobol.containers.EmptyModel;
import org.servicifi.gelato.language.cobol.dataitems.DataItem;
import org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute;
import org.servicifi.gelato.language.cobol.dataitems.DataName;
import org.servicifi.gelato.language.cobol.dataitems.External;
import org.servicifi.gelato.language.cobol.dataitems.Global;
import org.servicifi.gelato.language.cobol.dataitems.GroupUsage;
import org.servicifi.gelato.language.cobol.dataitems.PictureString;
import org.servicifi.gelato.language.cobol.dataitems.RecordName;
import org.servicifi.gelato.language.cobol.dataitems.Redefines;
import org.servicifi.gelato.language.cobol.dataitems.RenamingDataName;
import org.servicifi.gelato.language.cobol.dataitems.Usage;
import org.servicifi.gelato.language.cobol.dataitems.Value;
import org.servicifi.gelato.language.cobol.declaratives.Declaratives;
import org.servicifi.gelato.language.cobol.divisions.DataDivision;
import org.servicifi.gelato.language.cobol.divisions.Division;
import org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision;
import org.servicifi.gelato.language.cobol.divisions.IdentificationDivision;
import org.servicifi.gelato.language.cobol.divisions.ProcedureDivision;
import org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting;
import org.servicifi.gelato.language.cobol.environments.Channel;
import org.servicifi.gelato.language.cobol.environments.Console;
import org.servicifi.gelato.language.cobol.environments.Environment;
import org.servicifi.gelato.language.cobol.environments.Pocket;
import org.servicifi.gelato.language.cobol.environments.SuppressSpacing;
import org.servicifi.gelato.language.cobol.environments.SystemDevice;
import org.servicifi.gelato.language.cobol.environments.SystemLogicalInput;
import org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput;
import org.servicifi.gelato.language.cobol.environments.SystemPunchDevice;
import org.servicifi.gelato.language.cobol.environments.UPSI;
import org.servicifi.gelato.language.cobol.files.FileName;
import org.servicifi.gelato.language.cobol.files.FileStatus;
import org.servicifi.gelato.language.cobol.files.SelectStatement;
import org.servicifi.gelato.language.cobol.functions.Argument;
import org.servicifi.gelato.language.cobol.functions.Argumentable;
import org.servicifi.gelato.language.cobol.functions.ByContentArgument;
import org.servicifi.gelato.language.cobol.functions.ByReferenceArgument;
import org.servicifi.gelato.language.cobol.functions.ByValueArgument;
import org.servicifi.gelato.language.cobol.functions.FunctionCall;
import org.servicifi.gelato.language.cobol.functions.OmittedArgument;
import org.servicifi.gelato.language.cobol.handlers.AtEnd;
import org.servicifi.gelato.language.cobol.handlers.AtEndOfPage;
import org.servicifi.gelato.language.cobol.handlers.Handler;
import org.servicifi.gelato.language.cobol.handlers.InvalidKey;
import org.servicifi.gelato.language.cobol.handlers.NotAtEnd;
import org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage;
import org.servicifi.gelato.language.cobol.handlers.NotErrorHandler;
import org.servicifi.gelato.language.cobol.handlers.NotInvalidKey;
import org.servicifi.gelato.language.cobol.handlers.NotOnException;
import org.servicifi.gelato.language.cobol.handlers.NotOnOverflow;
import org.servicifi.gelato.language.cobol.handlers.NotOnSizeError;
import org.servicifi.gelato.language.cobol.handlers.OnException;
import org.servicifi.gelato.language.cobol.handlers.OnOverflow;
import org.servicifi.gelato.language.cobol.handlers.OnSizeError;
import org.servicifi.gelato.language.cobol.identifiers.All;
import org.servicifi.gelato.language.cobol.identifiers.DirectSubscript;
import org.servicifi.gelato.language.cobol.identifiers.Identifier;
import org.servicifi.gelato.language.cobol.identifiers.IdentifierReference;
import org.servicifi.gelato.language.cobol.identifiers.LinageCounter;
import org.servicifi.gelato.language.cobol.identifiers.Qualifier;
import org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier;
import org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript;
import org.servicifi.gelato.language.cobol.identifiers.Subscript;
import org.servicifi.gelato.language.cobol.ios.FileDirective;
import org.servicifi.gelato.language.cobol.ios.IODirectives;
import org.servicifi.gelato.language.cobol.ios.InputDirective;
import org.servicifi.gelato.language.cobol.ios.InputFile;
import org.servicifi.gelato.language.cobol.ios.InputProcedure;
import org.servicifi.gelato.language.cobol.ios.OutputDirective;
import org.servicifi.gelato.language.cobol.ios.OutputFile;
import org.servicifi.gelato.language.cobol.ios.OutputProcedure;
import org.servicifi.gelato.language.cobol.ios.ProcedureDirective;
import org.servicifi.gelato.language.cobol.labels.Label;
import org.servicifi.gelato.language.cobol.labels.Procedure;
import org.servicifi.gelato.language.cobol.labels.ProcedureLabel;
import org.servicifi.gelato.language.cobol.labels.ProcedureRange;
import org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild;
import org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel;
import org.servicifi.gelato.language.cobol.labels.Run;
import org.servicifi.gelato.language.cobol.labels.StopLabel;
import org.servicifi.gelato.language.cobol.literals.AllLiteral;
import org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral;
import org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral;
import org.servicifi.gelato.language.cobol.literals.Any;
import org.servicifi.gelato.language.cobol.literals.BooleanLiteral;
import org.servicifi.gelato.language.cobol.literals.Characters;
import org.servicifi.gelato.language.cobol.literals.ConstantLiteral;
import org.servicifi.gelato.language.cobol.literals.DBCSLiteral;
import org.servicifi.gelato.language.cobol.literals.DecimalLiteral;
import org.servicifi.gelato.language.cobol.literals.FigurativeConstantLiteral;
import org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral;
import org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral;
import org.servicifi.gelato.language.cobol.literals.HighValue;
import org.servicifi.gelato.language.cobol.literals.IntegerLiteral;
import org.servicifi.gelato.language.cobol.literals.Literal;
import org.servicifi.gelato.language.cobol.literals.LowValue;
import org.servicifi.gelato.language.cobol.literals.NationalHexLiteral;
import org.servicifi.gelato.language.cobol.literals.NationalLiteral;
import org.servicifi.gelato.language.cobol.literals.Null;
import org.servicifi.gelato.language.cobol.literals.NumericLiteral;
import org.servicifi.gelato.language.cobol.literals.PseudoLiteral;
import org.servicifi.gelato.language.cobol.literals.Quote;
import org.servicifi.gelato.language.cobol.literals.Space;
import org.servicifi.gelato.language.cobol.literals.Zero;
import org.servicifi.gelato.language.cobol.operands.ArithmeticOperand;
import org.servicifi.gelato.language.cobol.operands.Encoding;
import org.servicifi.gelato.language.cobol.operands.Operand;
import org.servicifi.gelato.language.cobol.operands.PrimaryOperand;
import org.servicifi.gelato.language.cobol.operands.ReplacementOperand;
import org.servicifi.gelato.language.cobol.operands.RoundedIdentifier;
import org.servicifi.gelato.language.cobol.operators.Addition;
import org.servicifi.gelato.language.cobol.operators.AdditiveOperator;
import org.servicifi.gelato.language.cobol.operators.Alphabetic;
import org.servicifi.gelato.language.cobol.operators.AlphabeticLower;
import org.servicifi.gelato.language.cobol.operators.AlphabeticUpper;
import org.servicifi.gelato.language.cobol.operators.ClassName;
import org.servicifi.gelato.language.cobol.operators.ClassOperator;
import org.servicifi.gelato.language.cobol.operators.ConditionAnd;
import org.servicifi.gelato.language.cobol.operators.ConditionOr;
import org.servicifi.gelato.language.cobol.operators.DBCS;
import org.servicifi.gelato.language.cobol.operators.Equal;
import org.servicifi.gelato.language.cobol.operators.EqualPhrase;
import org.servicifi.gelato.language.cobol.operators.EqualSign;
import org.servicifi.gelato.language.cobol.operators.GTEQPhrase;
import org.servicifi.gelato.language.cobol.operators.GTEQSign;
import org.servicifi.gelato.language.cobol.operators.GTPhrase;
import org.servicifi.gelato.language.cobol.operators.GTSign;
import org.servicifi.gelato.language.cobol.operators.GreaterThan;
import org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual;
import org.servicifi.gelato.language.cobol.operators.Kanji;
import org.servicifi.gelato.language.cobol.operators.LTEQPhrase;
import org.servicifi.gelato.language.cobol.operators.LTEQSign;
import org.servicifi.gelato.language.cobol.operators.LTPhrase;
import org.servicifi.gelato.language.cobol.operators.LTSign;
import org.servicifi.gelato.language.cobol.operators.LessThan;
import org.servicifi.gelato.language.cobol.operators.LessThanOrEqual;
import org.servicifi.gelato.language.cobol.operators.LogicalOperator;
import org.servicifi.gelato.language.cobol.operators.Multiplication;
import org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator;
import org.servicifi.gelato.language.cobol.operators.Negate;
import org.servicifi.gelato.language.cobol.operators.Negative;
import org.servicifi.gelato.language.cobol.operators.Numeric;
import org.servicifi.gelato.language.cobol.operators.Operator;
import org.servicifi.gelato.language.cobol.operators.Positive;
import org.servicifi.gelato.language.cobol.operators.Power;
import org.servicifi.gelato.language.cobol.operators.RelationalOperator;
import org.servicifi.gelato.language.cobol.operators.SignOperator;
import org.servicifi.gelato.language.cobol.operators.Subtraction;
import org.servicifi.gelato.language.cobol.operators.Through;
import org.servicifi.gelato.language.cobol.operators.UnaryOperator;
import org.servicifi.gelato.language.cobol.paragraphs.ConfigurationSectionParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode;
import org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.IOSectionParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.Paragraph;
import org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph;
import org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph;
import org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter;
import org.servicifi.gelato.language.cobol.parameters.ByValueParameter;
import org.servicifi.gelato.language.cobol.parameters.Parameter;
import org.servicifi.gelato.language.cobol.parameters.Parametrizable;
import org.servicifi.gelato.language.cobol.references.AlphabetNameReference;
import org.servicifi.gelato.language.cobol.references.ConditionName;
import org.servicifi.gelato.language.cobol.references.ConditionNameReference;
import org.servicifi.gelato.language.cobol.references.DataNameReference;
import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.FileNameReference;
import org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier;
import org.servicifi.gelato.language.cobol.references.IndexNameReference;
import org.servicifi.gelato.language.cobol.references.MnemonicNameReference;
import org.servicifi.gelato.language.cobol.references.Qualifiable;
import org.servicifi.gelato.language.cobol.references.Reference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference;
import org.servicifi.gelato.language.cobol.registers.AddressOf;
import org.servicifi.gelato.language.cobol.registers.LengthOf;
import org.servicifi.gelato.language.cobol.registers.Register;
import org.servicifi.gelato.language.cobol.registers.ReturnCode;
import org.servicifi.gelato.language.cobol.registers.ShiftIn;
import org.servicifi.gelato.language.cobol.registers.ShiftOut;
import org.servicifi.gelato.language.cobol.registers.WhenCompiled;
import org.servicifi.gelato.language.cobol.sections.ConfigurationSection;
import org.servicifi.gelato.language.cobol.sections.DataDivisionSection;
import org.servicifi.gelato.language.cobol.sections.DeclarativeSection;
import org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection;
import org.servicifi.gelato.language.cobol.sections.FileSection;
import org.servicifi.gelato.language.cobol.sections.IOSection;
import org.servicifi.gelato.language.cobol.sections.LinkageStorageSection;
import org.servicifi.gelato.language.cobol.sections.LocalStorageSection;
import org.servicifi.gelato.language.cobol.sections.Section;
import org.servicifi.gelato.language.cobol.sections.WorkingStorageSection;
import org.servicifi.gelato.language.cobol.sentences.AlteredGoTo;
import org.servicifi.gelato.language.cobol.sentences.EmptySentence;
import org.servicifi.gelato.language.cobol.sentences.EntrySentence;
import org.servicifi.gelato.language.cobol.sentences.ExecuteSentence;
import org.servicifi.gelato.language.cobol.sentences.ExitProcedure;
import org.servicifi.gelato.language.cobol.sentences.Sentence;
import org.servicifi.gelato.language.cobol.sentences.StatementContainer;
import org.servicifi.gelato.language.cobol.sentences.UseSentence;
import org.servicifi.gelato.language.cobol.specialnames.AlphabetName;
import org.servicifi.gelato.language.cobol.specialnames.AlphabetType;
import org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType;
import org.servicifi.gelato.language.cobol.specialnames.CurrencySign;
import org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType;
import org.servicifi.gelato.language.cobol.specialnames.MnemonicName;
import org.servicifi.gelato.language.cobol.specialnames.OffStatus;
import org.servicifi.gelato.language.cobol.specialnames.OnStatus;
import org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType;
import org.servicifi.gelato.language.cobol.specialnames.SpecialName;
import org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement;
import org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter;
import org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement;
import org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs;
import org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs;
import org.servicifi.gelato.language.cobol.statements.Accept;
import org.servicifi.gelato.language.cobol.statements.Add;
import org.servicifi.gelato.language.cobol.statements.AfterUntilCondition;
import org.servicifi.gelato.language.cobol.statements.ArithmeticStatement;
import org.servicifi.gelato.language.cobol.statements.BinarySearch;
import org.servicifi.gelato.language.cobol.statements.Call;
import org.servicifi.gelato.language.cobol.statements.Cancel;
import org.servicifi.gelato.language.cobol.statements.Close;
import org.servicifi.gelato.language.cobol.statements.Compute;
import org.servicifi.gelato.language.cobol.statements.Condition;
import org.servicifi.gelato.language.cobol.statements.Conditional;
import org.servicifi.gelato.language.cobol.statements.Continue;
import org.servicifi.gelato.language.cobol.statements.Delete;
import org.servicifi.gelato.language.cobol.statements.Display;
import org.servicifi.gelato.language.cobol.statements.Divide;
import org.servicifi.gelato.language.cobol.statements.Entry;
import org.servicifi.gelato.language.cobol.statements.ErrorHandled;
import org.servicifi.gelato.language.cobol.statements.Evaluate;
import org.servicifi.gelato.language.cobol.statements.EvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Execute;
import org.servicifi.gelato.language.cobol.statements.Exit;
import org.servicifi.gelato.language.cobol.statements.FileIOStatement;
import org.servicifi.gelato.language.cobol.statements.GoBack;
import org.servicifi.gelato.language.cobol.statements.GoTo;
import org.servicifi.gelato.language.cobol.statements.IOFile;
import org.servicifi.gelato.language.cobol.statements.IOFileDescriptor;
import org.servicifi.gelato.language.cobol.statements.IOStatement;
import org.servicifi.gelato.language.cobol.statements.Initialize;
import org.servicifi.gelato.language.cobol.statements.Inspect;
import org.servicifi.gelato.language.cobol.statements.Jump;
import org.servicifi.gelato.language.cobol.statements.KeyDescriptor;
import org.servicifi.gelato.language.cobol.statements.Merge;
import org.servicifi.gelato.language.cobol.statements.Move;
import org.servicifi.gelato.language.cobol.statements.Multiply;
import org.servicifi.gelato.language.cobol.statements.NestedStatement;
import org.servicifi.gelato.language.cobol.statements.NextSentence;
import org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Open;
import org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase;
import org.servicifi.gelato.language.cobol.statements.Perform;
import org.servicifi.gelato.language.cobol.statements.PerformFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatement;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition;
import org.servicifi.gelato.language.cobol.statements.PerformProcedure;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes;
import org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition;
import org.servicifi.gelato.language.cobol.statements.PerformUntilCondition;
import org.servicifi.gelato.language.cobol.statements.Read;
import org.servicifi.gelato.language.cobol.statements.Release;
import org.servicifi.gelato.language.cobol.statements.Replace;
import org.servicifi.gelato.language.cobol.statements.Return;
import org.servicifi.gelato.language.cobol.statements.Rewrite;
import org.servicifi.gelato.language.cobol.statements.SearchStatement;
import org.servicifi.gelato.language.cobol.statements.SerialSearch;
import org.servicifi.gelato.language.cobol.statements.Set;
import org.servicifi.gelato.language.cobol.statements.SetIndexName;
import org.servicifi.gelato.language.cobol.statements.SetStatement;
import org.servicifi.gelato.language.cobol.statements.SetSwitches;
import org.servicifi.gelato.language.cobol.statements.Sort;
import org.servicifi.gelato.language.cobol.statements.Start;
import org.servicifi.gelato.language.cobol.statements.Statement;
import org.servicifi.gelato.language.cobol.statements.Stop;
import org.servicifi.gelato.language.cobol.statements.Subtract;
import org.servicifi.gelato.language.cobol.statements.SwitchStatus;
import org.servicifi.gelato.language.cobol.statements.TallyingIn;
import org.servicifi.gelato.language.cobol.statements.Unstring;
import org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition;
import org.servicifi.gelato.language.cobol.statements.Write;
import org.servicifi.gelato.language.cobol.strings.AnyCharacter;
import org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings;
import org.servicifi.gelato.language.cobol.strings.Location;
import org.servicifi.gelato.language.cobol.strings.ManipulatedStrings;
import org.servicifi.gelato.language.cobol.strings.Occurrence;
import org.servicifi.gelato.language.cobol.strings.Replacement;
import org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence;
import org.servicifi.gelato.language.cobol.strings.SpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter;
import org.servicifi.gelato.language.cobol.strings.SplittedString;
import org.servicifi.gelato.language.cobol.strings.StringManipulation;
import org.servicifi.gelato.language.cobol.strings.Tallying;
import org.servicifi.gelato.language.cobol.strings.TallyingOccurrence;
import org.servicifi.gelato.language.cobol.tables.AdditionalIndexName;
import org.servicifi.gelato.language.cobol.tables.IndexName;
import org.servicifi.gelato.language.cobol.tables.KeyName;
import org.servicifi.gelato.language.cobol.tables.Table;
import org.servicifi.gelato.language.cobol.tables.TableDimension;
import org.servicifi.gelato.language.cobol.verbs.Is;
import org.servicifi.gelato.language.cobol.verbs.Verb;
import org.servicifi.gelato.language.cobol.water.AcceptStatementToken;
import org.servicifi.gelato.language.cobol.water.AcceptStatementWater;
import org.servicifi.gelato.language.cobol.water.CICSStatementToken;
import org.servicifi.gelato.language.cobol.water.CICSStatementWater;
import org.servicifi.gelato.language.cobol.water.CloseStatementToken;
import org.servicifi.gelato.language.cobol.water.CloseStatementWater;
import org.servicifi.gelato.language.cobol.water.DataDescription;
import org.servicifi.gelato.language.cobol.water.DataDescriptorWater;
import org.servicifi.gelato.language.cobol.water.Dot;
import org.servicifi.gelato.language.cobol.water.FileDescription;
import org.servicifi.gelato.language.cobol.water.FileDescriptorWater;
import org.servicifi.gelato.language.cobol.water.IOControlDescription;
import org.servicifi.gelato.language.cobol.water.IOControlParagraphWater;
import org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater;
import org.servicifi.gelato.language.cobol.water.IncompleteElement;
import org.servicifi.gelato.language.cobol.water.InvokeStatementToken;
import org.servicifi.gelato.language.cobol.water.InvokeStatementWater;
import org.servicifi.gelato.language.cobol.water.ObjectComputerDescription;
import org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater;
import org.servicifi.gelato.language.cobol.water.OpenStatementToken;
import org.servicifi.gelato.language.cobol.water.OpenStatementWater;
import org.servicifi.gelato.language.cobol.water.PriorityNumber;
import org.servicifi.gelato.language.cobol.water.ProgramDescription;
import org.servicifi.gelato.language.cobol.water.RepositoryDescription;
import org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater;
import org.servicifi.gelato.language.cobol.water.SQLStatementToken;
import org.servicifi.gelato.language.cobol.water.SQLStatementWater;
import org.servicifi.gelato.language.cobol.water.SelectStatementClause;
import org.servicifi.gelato.language.cobol.water.SelectStatementWater;
import org.servicifi.gelato.language.cobol.water.SortPhraseToken;
import org.servicifi.gelato.language.cobol.water.SortPhraseWater;
import org.servicifi.gelato.language.cobol.water.SpecialNamesClause;
import org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater;
import org.servicifi.gelato.language.cobol.water.UseStatementToken;
import org.servicifi.gelato.language.cobol.water.UseStatementWater;
import org.servicifi.gelato.language.cobol.water.Water;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractCobolInterpreter<ResultType, ContextType> {
	
	private Stack<EObject> interpretationStack = new Stack<EObject>();
	private List<org.servicifi.gelato.language.cobol.resource.cobol.ICobolInterpreterListener> listeners = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ICobolInterpreterListener>();
	private EObject nextObjectToInterprete;
	private ContextType currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.servicifi.gelato.language.cobol.verbs.Is) {
			result = interprete_org_servicifi_gelato_language_cobol_verbs_Is((org.servicifi.gelato.language.cobol.verbs.Is) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.verbs.Verb) {
			result = interprete_org_servicifi_gelato_language_cobol_verbs_Verb((org.servicifi.gelato.language.cobol.verbs.Verb) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.ProcedureRange) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_ProcedureRange((org.servicifi.gelato.language.cobol.labels.ProcedureRange) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.ProcedureLabel) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_ProcedureLabel((org.servicifi.gelato.language.cobol.labels.ProcedureLabel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_ProcedureRangeChild((org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_ProcedureRangeLabel((org.servicifi.gelato.language.cobol.labels.ProcedureRangeLabel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.Procedure) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_Procedure((org.servicifi.gelato.language.cobol.labels.Procedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.Run) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_Run((org.servicifi.gelato.language.cobol.labels.Run) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.StopLabel) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_StopLabel((org.servicifi.gelato.language.cobol.labels.StopLabel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.labels.Label) {
			result = interprete_org_servicifi_gelato_language_cobol_labels_Label((org.servicifi.gelato.language.cobol.labels.Label) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.commons.NamedElement) {
			result = interprete_org_servicifi_gelato_language_cobol_commons_NamedElement((org.servicifi.gelato.language.cobol.commons.NamedElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.commons.LabellableElement) {
			result = interprete_org_servicifi_gelato_language_cobol_commons_LabellableElement((org.servicifi.gelato.language.cobol.commons.LabellableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.commons.URIableElement) {
			result = interprete_org_servicifi_gelato_language_cobol_commons_URIableElement((org.servicifi.gelato.language.cobol.commons.URIableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.containers.CompilationGroup) {
			result = interprete_org_servicifi_gelato_language_cobol_containers_CompilationGroup((org.servicifi.gelato.language.cobol.containers.CompilationGroup) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.containers.CompilationUnit) {
			result = interprete_org_servicifi_gelato_language_cobol_containers_CompilationUnit((org.servicifi.gelato.language.cobol.containers.CompilationUnit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.divisions.ProcedureDivision) {
			result = interprete_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision((org.servicifi.gelato.language.cobol.divisions.ProcedureDivision) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.commons.Commentable) {
			result = interprete_org_servicifi_gelato_language_cobol_commons_Commentable((org.servicifi.gelato.language.cobol.commons.Commentable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.containers.EmptyModel) {
			result = interprete_org_servicifi_gelato_language_cobol_containers_EmptyModel((org.servicifi.gelato.language.cobol.containers.EmptyModel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.containers.CobolRoot) {
			result = interprete_org_servicifi_gelato_language_cobol_containers_CobolRoot((org.servicifi.gelato.language.cobol.containers.CobolRoot) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Add) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Add((org.servicifi.gelato.language.cobol.statements.Add) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Subtract) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Subtract((org.servicifi.gelato.language.cobol.statements.Subtract) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Multiply) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Multiply((org.servicifi.gelato.language.cobol.statements.Multiply) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Divide) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Divide((org.servicifi.gelato.language.cobol.statements.Divide) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.ArithmeticStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_ArithmeticStatement((org.servicifi.gelato.language.cobol.statements.ArithmeticStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformNestedStatement((org.servicifi.gelato.language.cobol.statements.PerformNestedStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedure) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformProcedure((org.servicifi.gelato.language.cobol.statements.PerformProcedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Perform) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Perform((org.servicifi.gelato.language.cobol.statements.Perform) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.NextSentence) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_NextSentence((org.servicifi.gelato.language.cobol.statements.NextSentence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.GoTo) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_GoTo((org.servicifi.gelato.language.cobol.statements.GoTo) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.GoBack) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_GoBack((org.servicifi.gelato.language.cobol.statements.GoBack) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Jump) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Jump((org.servicifi.gelato.language.cobol.statements.Jump) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.NestedStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_NestedStatement((org.servicifi.gelato.language.cobol.statements.NestedStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Move) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Move((org.servicifi.gelato.language.cobol.statements.Move) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Exit) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Exit((org.servicifi.gelato.language.cobol.statements.Exit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Condition) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Condition((org.servicifi.gelato.language.cobol.statements.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Conditional) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Conditional((org.servicifi.gelato.language.cobol.statements.Conditional) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Stop) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Stop((org.servicifi.gelato.language.cobol.statements.Stop) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Display) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Display((org.servicifi.gelato.language.cobol.statements.Display) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Compute) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Compute((org.servicifi.gelato.language.cobol.statements.Compute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Accept) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Accept((org.servicifi.gelato.language.cobol.statements.Accept) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Execute) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Execute((org.servicifi.gelato.language.cobol.statements.Execute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Return) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Return((org.servicifi.gelato.language.cobol.statements.Return) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.ErrorHandled) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_ErrorHandled((org.servicifi.gelato.language.cobol.statements.ErrorHandled) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.SetSwitches) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_SetSwitches((org.servicifi.gelato.language.cobol.statements.SetSwitches) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.SetIndexName) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_SetIndexName((org.servicifi.gelato.language.cobol.statements.SetIndexName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.SetStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_SetStatement((org.servicifi.gelato.language.cobol.statements.SetStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.String) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_String((org.servicifi.gelato.language.cobol.statements.String) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Close) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Close((org.servicifi.gelato.language.cobol.statements.Close) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Cancel) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Cancel((org.servicifi.gelato.language.cobol.statements.Cancel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Call) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Call((org.servicifi.gelato.language.cobol.statements.Call) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Initialize) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Initialize((org.servicifi.gelato.language.cobol.statements.Initialize) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Open) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Open((org.servicifi.gelato.language.cobol.statements.Open) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.SerialSearch) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_SerialSearch((org.servicifi.gelato.language.cobol.statements.SerialSearch) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.BinarySearch) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_BinarySearch((org.servicifi.gelato.language.cobol.statements.BinarySearch) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.SearchStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_SearchStatement((org.servicifi.gelato.language.cobol.statements.SearchStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Unstring) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Unstring((org.servicifi.gelato.language.cobol.statements.Unstring) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Evaluate) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Evaluate((org.servicifi.gelato.language.cobol.statements.Evaluate) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase((org.servicifi.gelato.language.cobol.statements.NormalEvaluateCase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_OtherEvaluateCase((org.servicifi.gelato.language.cobol.statements.OtherEvaluateCase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.EvaluateCase) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_EvaluateCase((org.servicifi.gelato.language.cobol.statements.EvaluateCase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Replace) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Replace((org.servicifi.gelato.language.cobol.statements.Replace) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Entry) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Entry((org.servicifi.gelato.language.cobol.statements.Entry) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Inspect) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Inspect((org.servicifi.gelato.language.cobol.statements.Inspect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Set) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Set((org.servicifi.gelato.language.cobol.statements.Set) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Read) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Read((org.servicifi.gelato.language.cobol.statements.Read) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Rewrite) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Rewrite((org.servicifi.gelato.language.cobol.statements.Rewrite) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Write) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Write((org.servicifi.gelato.language.cobol.statements.Write) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.SwitchStatus) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_SwitchStatus((org.servicifi.gelato.language.cobol.statements.SwitchStatus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformProcedureFixedTimes((org.servicifi.gelato.language.cobol.statements.PerformProcedureFixedTimes) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition((org.servicifi.gelato.language.cobol.statements.PerformProcedureUntilCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition((org.servicifi.gelato.language.cobol.statements.PerformNestedStatementUntilCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformUntilCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformUntilCondition((org.servicifi.gelato.language.cobol.statements.PerformUntilCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes((org.servicifi.gelato.language.cobol.statements.PerformNestedStatementFixedTimes) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.PerformFixedTimes) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_PerformFixedTimes((org.servicifi.gelato.language.cobol.statements.PerformFixedTimes) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Continue) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Continue((org.servicifi.gelato.language.cobol.statements.Continue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Sort) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Sort((org.servicifi.gelato.language.cobol.statements.Sort) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Merge) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Merge((org.servicifi.gelato.language.cobol.statements.Merge) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.FileIOStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_FileIOStatement((org.servicifi.gelato.language.cobol.statements.FileIOStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Release) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Release((org.servicifi.gelato.language.cobol.statements.Release) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.KeyDescriptor) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_KeyDescriptor((org.servicifi.gelato.language.cobol.statements.KeyDescriptor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.IOStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_IOStatement((org.servicifi.gelato.language.cobol.statements.IOStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Statement) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Statement((org.servicifi.gelato.language.cobol.statements.Statement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.IOFileDescriptor) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor((org.servicifi.gelato.language.cobol.statements.IOFileDescriptor) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.IOFile) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_IOFile((org.servicifi.gelato.language.cobol.statements.IOFile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.TallyingIn) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_TallyingIn((org.servicifi.gelato.language.cobol.statements.TallyingIn) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.AfterUntilCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_AfterUntilCondition((org.servicifi.gelato.language.cobol.statements.AfterUntilCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_VaryingUntilCondition((org.servicifi.gelato.language.cobol.statements.VaryingUntilCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Start) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Start((org.servicifi.gelato.language.cobol.statements.Start) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.statements.Delete) {
			result = interprete_org_servicifi_gelato_language_cobol_statements_Delete((org.servicifi.gelato.language.cobol.statements.Delete) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.EmptySentence) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_EmptySentence((org.servicifi.gelato.language.cobol.sentences.EmptySentence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.UseSentence) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_UseSentence((org.servicifi.gelato.language.cobol.sentences.UseSentence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.AlteredGoTo) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_AlteredGoTo((org.servicifi.gelato.language.cobol.sentences.AlteredGoTo) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.ExitProcedure) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_ExitProcedure((org.servicifi.gelato.language.cobol.sentences.ExitProcedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.EntrySentence) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_EntrySentence((org.servicifi.gelato.language.cobol.sentences.EntrySentence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.ExecuteSentence) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_ExecuteSentence((org.servicifi.gelato.language.cobol.sentences.ExecuteSentence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.Sentence) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_Sentence((org.servicifi.gelato.language.cobol.sentences.Sentence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sentences.StatementContainer) {
			result = interprete_org_servicifi_gelato_language_cobol_sentences_StatementContainer((org.servicifi.gelato.language.cobol.sentences.StatementContainer) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.divisions.DataDivision) {
			result = interprete_org_servicifi_gelato_language_cobol_divisions_DataDivision((org.servicifi.gelato.language.cobol.divisions.DataDivision) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision) {
			result = interprete_org_servicifi_gelato_language_cobol_divisions_EnvironmentDivision((org.servicifi.gelato.language.cobol.divisions.EnvironmentDivision) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.divisions.IdentificationDivision) {
			result = interprete_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision((org.servicifi.gelato.language.cobol.divisions.IdentificationDivision) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.divisions.Division) {
			result = interprete_org_servicifi_gelato_language_cobol_divisions_Division((org.servicifi.gelato.language.cobol.divisions.Division) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.WorkingStorageSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection((org.servicifi.gelato.language.cobol.sections.WorkingStorageSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.LocalStorageSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_LocalStorageSection((org.servicifi.gelato.language.cobol.sections.LocalStorageSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.LinkageStorageSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection((org.servicifi.gelato.language.cobol.sections.LinkageStorageSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.IOSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_IOSection((org.servicifi.gelato.language.cobol.sections.IOSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.ConfigurationSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_ConfigurationSection((org.servicifi.gelato.language.cobol.sections.ConfigurationSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_EnvironmentDivisionSection((org.servicifi.gelato.language.cobol.sections.EnvironmentDivisionSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.FileSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_FileSection((org.servicifi.gelato.language.cobol.sections.FileSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.DataDivisionSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_DataDivisionSection((org.servicifi.gelato.language.cobol.sections.DataDivisionSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.DeclarativeSection) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_DeclarativeSection((org.servicifi.gelato.language.cobol.sections.DeclarativeSection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.sections.Section) {
			result = interprete_org_servicifi_gelato_language_cobol_sections_Section((org.servicifi.gelato.language.cobol.sections.Section) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph((org.servicifi.gelato.language.cobol.paragraphs.SourceComputerParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph((org.servicifi.gelato.language.cobol.paragraphs.ObjectComputerParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_FileControlParagraph((org.servicifi.gelato.language.cobol.paragraphs.FileControlParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_IOControlParagraph((org.servicifi.gelato.language.cobol.paragraphs.IOControlParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.ConfigurationSectionParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_ConfigurationSectionParagraph((org.servicifi.gelato.language.cobol.paragraphs.ConfigurationSectionParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.IOSectionParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_IOSectionParagraph((org.servicifi.gelato.language.cobol.paragraphs.IOSectionParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph((org.servicifi.gelato.language.cobol.paragraphs.SpecialNamesParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_RepositoryParagraph((org.servicifi.gelato.language.cobol.paragraphs.RepositoryParagraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.Paragraph) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_Paragraph((org.servicifi.gelato.language.cobol.paragraphs.Paragraph) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode) {
			result = interprete_org_servicifi_gelato_language_cobol_paragraphs_DebuggingMode((org.servicifi.gelato.language.cobol.paragraphs.DebuggingMode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference((org.servicifi.gelato.language.cobol.references.SpecialNamesConditionNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.Reference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_Reference((org.servicifi.gelato.language.cobol.references.Reference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.ReferenceableElement) {
			result = interprete_org_servicifi_gelato_language_cobol_references_ReferenceableElement((org.servicifi.gelato.language.cobol.references.ReferenceableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.FileNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_FileNameReference((org.servicifi.gelato.language.cobol.references.FileNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.IndexNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_IndexNameReference((org.servicifi.gelato.language.cobol.references.IndexNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.MnemonicNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_MnemonicNameReference((org.servicifi.gelato.language.cobol.references.MnemonicNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.AlphabetNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_AlphabetNameReference((org.servicifi.gelato.language.cobol.references.AlphabetNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.ConditionNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_ConditionNameReference((org.servicifi.gelato.language.cobol.references.ConditionNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.ConditionName) {
			result = interprete_org_servicifi_gelato_language_cobol_references_ConditionName((org.servicifi.gelato.language.cobol.references.ConditionName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.DataNameReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_DataNameReference((org.servicifi.gelato.language.cobol.references.DataNameReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier) {
			result = interprete_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier((org.servicifi.gelato.language.cobol.references.IdentifierReferenceQualifier) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.ElementReference) {
			result = interprete_org_servicifi_gelato_language_cobol_references_ElementReference((org.servicifi.gelato.language.cobol.references.ElementReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.references.Qualifiable) {
			result = interprete_org_servicifi_gelato_language_cobol_references_Qualifiable((org.servicifi.gelato.language.cobol.references.Qualifiable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_AlphanumericLiteral((org.servicifi.gelato.language.cobol.literals.AlphanumericLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.IntegerLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_IntegerLiteral((org.servicifi.gelato.language.cobol.literals.IntegerLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_FloatingDecimalLiteral((org.servicifi.gelato.language.cobol.literals.FloatingDecimalLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.DecimalLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_DecimalLiteral((org.servicifi.gelato.language.cobol.literals.DecimalLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.FigurativeConstantLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_FigurativeConstantLiteral((org.servicifi.gelato.language.cobol.literals.FigurativeConstantLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.BooleanLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_BooleanLiteral((org.servicifi.gelato.language.cobol.literals.BooleanLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.AllLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_AllLiteral((org.servicifi.gelato.language.cobol.literals.AllLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.NumericLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_NumericLiteral((org.servicifi.gelato.language.cobol.literals.NumericLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.ConstantLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_ConstantLiteral((org.servicifi.gelato.language.cobol.literals.ConstantLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.PseudoLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_PseudoLiteral((org.servicifi.gelato.language.cobol.literals.PseudoLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.NationalLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_NationalLiteral((org.servicifi.gelato.language.cobol.literals.NationalLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.NationalHexLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_NationalHexLiteral((org.servicifi.gelato.language.cobol.literals.NationalHexLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.DBCSLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_DBCSLiteral((org.servicifi.gelato.language.cobol.literals.DBCSLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_FixedDecimalLiteral((org.servicifi.gelato.language.cobol.literals.FixedDecimalLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Null) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Null((org.servicifi.gelato.language.cobol.literals.Null) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Zero) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Zero((org.servicifi.gelato.language.cobol.literals.Zero) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Quote) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Quote((org.servicifi.gelato.language.cobol.literals.Quote) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.LowValue) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_LowValue((org.servicifi.gelato.language.cobol.literals.LowValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.HighValue) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_HighValue((org.servicifi.gelato.language.cobol.literals.HighValue) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Space) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Space((org.servicifi.gelato.language.cobol.literals.Space) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Any) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Any((org.servicifi.gelato.language.cobol.literals.Any) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Characters) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Characters((org.servicifi.gelato.language.cobol.literals.Characters) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_AlphanumericHexaDecimalLiteral((org.servicifi.gelato.language.cobol.literals.AlphanumericHexaDecimalLiteral) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.literals.Literal) {
			result = interprete_org_servicifi_gelato_language_cobol_literals_Literal((org.servicifi.gelato.language.cobol.literals.Literal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.InputProcedure) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_InputProcedure((org.servicifi.gelato.language.cobol.ios.InputProcedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.InputFile) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_InputFile((org.servicifi.gelato.language.cobol.ios.InputFile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.InputDirective) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_InputDirective((org.servicifi.gelato.language.cobol.ios.InputDirective) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.OutputProcedure) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_OutputProcedure((org.servicifi.gelato.language.cobol.ios.OutputProcedure) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.OutputFile) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_OutputFile((org.servicifi.gelato.language.cobol.ios.OutputFile) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.OutputDirective) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_OutputDirective((org.servicifi.gelato.language.cobol.ios.OutputDirective) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.FileDirective) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_FileDirective((org.servicifi.gelato.language.cobol.ios.FileDirective) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.ProcedureDirective) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_ProcedureDirective((org.servicifi.gelato.language.cobol.ios.ProcedureDirective) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.ios.IODirectives) {
			result = interprete_org_servicifi_gelato_language_cobol_ios_IODirectives((org.servicifi.gelato.language.cobol.ios.IODirectives) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_PrimaryExpression((org.servicifi.gelato.language.cobol.arithmetics.PrimaryExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpressionChild((org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.UnaryArithmeticExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpressionChild((org.servicifi.gelato.language.cobol.arithmetics.PowerArithmeticExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpressionChild((org.servicifi.gelato.language.cobol.arithmetics.MultiplicativeArithmeticExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpressionChild((org.servicifi.gelato.language.cobol.arithmetics.AdditiveArithmeticExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression((org.servicifi.gelato.language.cobol.arithmetics.AssignmentExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.RangeExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_RangeExpression((org.servicifi.gelato.language.cobol.arithmetics.RangeExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_NestedArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.NestedArithmeticExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_RangeExpressionChild((org.servicifi.gelato.language.cobol.arithmetics.RangeExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_arithmetics_ArithmeticExpression((org.servicifi.gelato.language.cobol.arithmetics.ArithmeticExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpression((org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_SimpleConditionChild((org.servicifi.gelato.language.cobol.conditions.SimpleConditionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.RelationalExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_RelationalExpression((org.servicifi.gelato.language.cobol.conditions.RelationalExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.SignCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_SignCondition((org.servicifi.gelato.language.cobol.conditions.SignCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.ClassCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_ClassCondition((org.servicifi.gelato.language.cobol.conditions.ClassCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpressionChild((org.servicifi.gelato.language.cobol.conditions.NegatedConditionalExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpressionChild((org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpression((org.servicifi.gelato.language.cobol.conditions.ConditionalAndExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression((org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_NestedAbbreviatedConditionalExpression((org.servicifi.gelato.language.cobol.conditions.NestedAbbreviatedConditionalExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpressionChild((org.servicifi.gelato.language.cobol.conditions.AbbreviatedRelationalExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpressionChild((org.servicifi.gelato.language.cobol.conditions.NegatedAbbreviatedConditionalExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpressionChild((org.servicifi.gelato.language.cobol.conditions.AbbreviatedConditionalExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpressionChild((org.servicifi.gelato.language.cobol.conditions.ConditionalOrExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.Condition) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_Condition((org.servicifi.gelato.language.cobol.conditions.Condition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.ExpressionList) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_ExpressionList((org.servicifi.gelato.language.cobol.conditions.ExpressionList) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.conditions.NestedCondition) {
			result = interprete_org_servicifi_gelato_language_cobol_conditions_NestedCondition((org.servicifi.gelato.language.cobol.conditions.NestedCondition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.AdditiveOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_AdditiveOperator((org.servicifi.gelato.language.cobol.operators.AdditiveOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_MultiplicativeOperator((org.servicifi.gelato.language.cobol.operators.MultiplicativeOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.UnaryOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_UnaryOperator((org.servicifi.gelato.language.cobol.operators.UnaryOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.ConditionAnd) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_ConditionAnd((org.servicifi.gelato.language.cobol.operators.ConditionAnd) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LogicalOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LogicalOperator((org.servicifi.gelato.language.cobol.operators.LogicalOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.RelationalOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_RelationalOperator((org.servicifi.gelato.language.cobol.operators.RelationalOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.ConditionOr) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_ConditionOr((org.servicifi.gelato.language.cobol.operators.ConditionOr) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Multiplication) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Multiplication((org.servicifi.gelato.language.cobol.operators.Multiplication) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Positive) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Positive((org.servicifi.gelato.language.cobol.operators.Positive) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Negative) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Negative((org.servicifi.gelato.language.cobol.operators.Negative) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.SignOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_SignOperator((org.servicifi.gelato.language.cobol.operators.SignOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Division) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Division((org.servicifi.gelato.language.cobol.operators.Division) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Addition) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Addition((org.servicifi.gelato.language.cobol.operators.Addition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Subtraction) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Subtraction((org.servicifi.gelato.language.cobol.operators.Subtraction) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_GreaterThanOrEqual((org.servicifi.gelato.language.cobol.operators.GreaterThanOrEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.GreaterThan) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_GreaterThan((org.servicifi.gelato.language.cobol.operators.GreaterThan) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LessThan) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LessThan((org.servicifi.gelato.language.cobol.operators.LessThan) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LessThanOrEqual) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LessThanOrEqual((org.servicifi.gelato.language.cobol.operators.LessThanOrEqual) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Equal) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Equal((org.servicifi.gelato.language.cobol.operators.Equal) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Power) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Power((org.servicifi.gelato.language.cobol.operators.Power) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Negate) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Negate((org.servicifi.gelato.language.cobol.operators.Negate) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Through) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Through((org.servicifi.gelato.language.cobol.operators.Through) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.ClassOperator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_ClassOperator((org.servicifi.gelato.language.cobol.operators.ClassOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Zero) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Zero((org.servicifi.gelato.language.cobol.operators.Zero) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.ClassName) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_ClassName((org.servicifi.gelato.language.cobol.operators.ClassName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Alphabetic) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Alphabetic((org.servicifi.gelato.language.cobol.operators.Alphabetic) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.DBCS) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_DBCS((org.servicifi.gelato.language.cobol.operators.DBCS) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Numeric) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Numeric((org.servicifi.gelato.language.cobol.operators.Numeric) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.AlphabeticUpper) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_AlphabeticUpper((org.servicifi.gelato.language.cobol.operators.AlphabeticUpper) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.AlphabeticLower) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_AlphabeticLower((org.servicifi.gelato.language.cobol.operators.AlphabeticLower) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Kanji) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Kanji((org.servicifi.gelato.language.cobol.operators.Kanji) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.EqualPhrase) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_EqualPhrase((org.servicifi.gelato.language.cobol.operators.EqualPhrase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.EqualSign) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_EqualSign((org.servicifi.gelato.language.cobol.operators.EqualSign) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LTPhrase) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LTPhrase((org.servicifi.gelato.language.cobol.operators.LTPhrase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LTSign) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LTSign((org.servicifi.gelato.language.cobol.operators.LTSign) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LTEQPhrase) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LTEQPhrase((org.servicifi.gelato.language.cobol.operators.LTEQPhrase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.LTEQSign) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_LTEQSign((org.servicifi.gelato.language.cobol.operators.LTEQSign) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.GTPhrase) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_GTPhrase((org.servicifi.gelato.language.cobol.operators.GTPhrase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.GTSign) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_GTSign((org.servicifi.gelato.language.cobol.operators.GTSign) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.GTEQPhrase) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_GTEQPhrase((org.servicifi.gelato.language.cobol.operators.GTEQPhrase) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.GTEQSign) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_GTEQSign((org.servicifi.gelato.language.cobol.operators.GTEQSign) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operators.Operator) {
			result = interprete_org_servicifi_gelato_language_cobol_operators_Operator((org.servicifi.gelato.language.cobol.operators.Operator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operands.PrimaryOperand) {
			result = interprete_org_servicifi_gelato_language_cobol_operands_PrimaryOperand((org.servicifi.gelato.language.cobol.operands.PrimaryOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operands.RoundedIdentifier) {
			result = interprete_org_servicifi_gelato_language_cobol_operands_RoundedIdentifier((org.servicifi.gelato.language.cobol.operands.RoundedIdentifier) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operands.Encoding) {
			result = interprete_org_servicifi_gelato_language_cobol_operands_Encoding((org.servicifi.gelato.language.cobol.operands.Encoding) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.IdentifierReference) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference((org.servicifi.gelato.language.cobol.identifiers.IdentifierReference) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.Identifier) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_Identifier((org.servicifi.gelato.language.cobol.identifiers.Identifier) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operands.ReplacementOperand) {
			result = interprete_org_servicifi_gelato_language_cobol_operands_ReplacementOperand((org.servicifi.gelato.language.cobol.operands.ReplacementOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operands.ArithmeticOperand) {
			result = interprete_org_servicifi_gelato_language_cobol_operands_ArithmeticOperand((org.servicifi.gelato.language.cobol.operands.ArithmeticOperand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.operands.Operand) {
			result = interprete_org_servicifi_gelato_language_cobol_operands_Operand((org.servicifi.gelato.language.cobol.operands.Operand) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.All) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_All((org.servicifi.gelato.language.cobol.identifiers.All) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.Subscript) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_Subscript((org.servicifi.gelato.language.cobol.identifiers.Subscript) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_ReferenceModifier((org.servicifi.gelato.language.cobol.identifiers.ReferenceModifier) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.LinageCounter) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_LinageCounter((org.servicifi.gelato.language.cobol.identifiers.LinageCounter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.Qualifier) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_Qualifier((org.servicifi.gelato.language.cobol.identifiers.Qualifier) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_RelativeSubscript((org.servicifi.gelato.language.cobol.identifiers.RelativeSubscript) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.identifiers.DirectSubscript) {
			result = interprete_org_servicifi_gelato_language_cobol_identifiers_DirectSubscript((org.servicifi.gelato.language.cobol.identifiers.DirectSubscript) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.IncompleteElement) {
			result = interprete_org_servicifi_gelato_language_cobol_water_IncompleteElement((org.servicifi.gelato.language.cobol.water.IncompleteElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.ProgramDescription) {
			result = interprete_org_servicifi_gelato_language_cobol_water_ProgramDescription((org.servicifi.gelato.language.cobol.water.ProgramDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.Dot) {
			result = interprete_org_servicifi_gelato_language_cobol_water_Dot((org.servicifi.gelato.language.cobol.water.Dot) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_IdentificationDivisionWater((org.servicifi.gelato.language.cobol.water.IdentificationDivisionWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.ObjectComputerDescription) {
			result = interprete_org_servicifi_gelato_language_cobol_water_ObjectComputerDescription((org.servicifi.gelato.language.cobol.water.ObjectComputerDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.PriorityNumber) {
			result = interprete_org_servicifi_gelato_language_cobol_water_PriorityNumber((org.servicifi.gelato.language.cobol.water.PriorityNumber) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_ObjectComputerParagraphWater((org.servicifi.gelato.language.cobol.water.ObjectComputerParagraphWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SelectStatementClause) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SelectStatementClause((org.servicifi.gelato.language.cobol.water.SelectStatementClause) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SelectStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SelectStatementWater((org.servicifi.gelato.language.cobol.water.SelectStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SpecialNamesClause) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SpecialNamesClause((org.servicifi.gelato.language.cobol.water.SpecialNamesClause) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SpecialNamesParagraphWater((org.servicifi.gelato.language.cobol.water.SpecialNamesParagraphWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.FileDescription) {
			result = interprete_org_servicifi_gelato_language_cobol_water_FileDescription((org.servicifi.gelato.language.cobol.water.FileDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.FileDescriptorWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_FileDescriptorWater((org.servicifi.gelato.language.cobol.water.FileDescriptorWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.DataDescription) {
			result = interprete_org_servicifi_gelato_language_cobol_water_DataDescription((org.servicifi.gelato.language.cobol.water.DataDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.DataDescriptorWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_DataDescriptorWater((org.servicifi.gelato.language.cobol.water.DataDescriptorWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.IOControlDescription) {
			result = interprete_org_servicifi_gelato_language_cobol_water_IOControlDescription((org.servicifi.gelato.language.cobol.water.IOControlDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.IOControlParagraphWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_IOControlParagraphWater((org.servicifi.gelato.language.cobol.water.IOControlParagraphWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.RepositoryDescription) {
			result = interprete_org_servicifi_gelato_language_cobol_water_RepositoryDescription((org.servicifi.gelato.language.cobol.water.RepositoryDescription) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_RepositoryParagraphWater((org.servicifi.gelato.language.cobol.water.RepositoryParagraphWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SQLStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SQLStatementWater((org.servicifi.gelato.language.cobol.water.SQLStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.CICSStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_CICSStatementWater((org.servicifi.gelato.language.cobol.water.CICSStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SQLStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SQLStatementToken((org.servicifi.gelato.language.cobol.water.SQLStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.CICSStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_CICSStatementToken((org.servicifi.gelato.language.cobol.water.CICSStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.AcceptStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_AcceptStatementToken((org.servicifi.gelato.language.cobol.water.AcceptStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.AcceptStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_AcceptStatementWater((org.servicifi.gelato.language.cobol.water.AcceptStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.UseStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_UseStatementToken((org.servicifi.gelato.language.cobol.water.UseStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.UseStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_UseStatementWater((org.servicifi.gelato.language.cobol.water.UseStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.CloseStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_CloseStatementToken((org.servicifi.gelato.language.cobol.water.CloseStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.CloseStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_CloseStatementWater((org.servicifi.gelato.language.cobol.water.CloseStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.InvokeStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_InvokeStatementToken((org.servicifi.gelato.language.cobol.water.InvokeStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.InvokeStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_InvokeStatementWater((org.servicifi.gelato.language.cobol.water.InvokeStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.OpenStatementToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_OpenStatementToken((org.servicifi.gelato.language.cobol.water.OpenStatementToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.OpenStatementWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_OpenStatementWater((org.servicifi.gelato.language.cobol.water.OpenStatementWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SortPhraseToken) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SortPhraseToken((org.servicifi.gelato.language.cobol.water.SortPhraseToken) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.SortPhraseWater) {
			result = interprete_org_servicifi_gelato_language_cobol_water_SortPhraseWater((org.servicifi.gelato.language.cobol.water.SortPhraseWater) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.water.Water) {
			result = interprete_org_servicifi_gelato_language_cobol_water_Water((org.servicifi.gelato.language.cobol.water.Water) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.ShiftIn) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_ShiftIn((org.servicifi.gelato.language.cobol.registers.ShiftIn) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.ShiftOut) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_ShiftOut((org.servicifi.gelato.language.cobol.registers.ShiftOut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.AddressOf) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_AddressOf((org.servicifi.gelato.language.cobol.registers.AddressOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.LengthOf) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_LengthOf((org.servicifi.gelato.language.cobol.registers.LengthOf) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.ReturnCode) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_ReturnCode((org.servicifi.gelato.language.cobol.registers.ReturnCode) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.WhenCompiled) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_WhenCompiled((org.servicifi.gelato.language.cobol.registers.WhenCompiled) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.registers.Register) {
			result = interprete_org_servicifi_gelato_language_cobol_registers_Register((org.servicifi.gelato.language.cobol.registers.Register) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.SystemLogicalInput) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_SystemLogicalInput((org.servicifi.gelato.language.cobol.environments.SystemLogicalInput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_SystemLogicalOutput((org.servicifi.gelato.language.cobol.environments.SystemLogicalOutput) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.Console) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_Console((org.servicifi.gelato.language.cobol.environments.Console) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_AdvancedFunctionPrinting((org.servicifi.gelato.language.cobol.environments.AdvancedFunctionPrinting) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.Pocket) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_Pocket((org.servicifi.gelato.language.cobol.environments.Pocket) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.SystemDevice) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_SystemDevice((org.servicifi.gelato.language.cobol.environments.SystemDevice) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.UPSI) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_UPSI((org.servicifi.gelato.language.cobol.environments.UPSI) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.SystemPunchDevice) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_SystemPunchDevice((org.servicifi.gelato.language.cobol.environments.SystemPunchDevice) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.Channel) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_Channel((org.servicifi.gelato.language.cobol.environments.Channel) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.SuppressSpacing) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_SuppressSpacing((org.servicifi.gelato.language.cobol.environments.SuppressSpacing) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.environments.Environment) {
			result = interprete_org_servicifi_gelato_language_cobol_environments_Environment((org.servicifi.gelato.language.cobol.environments.Environment) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.PictureString) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_PictureString((org.servicifi.gelato.language.cobol.dataitems.PictureString) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.RenamingDataName) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_RenamingDataName((org.servicifi.gelato.language.cobol.dataitems.RenamingDataName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.ConditionName) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_ConditionName((org.servicifi.gelato.language.cobol.dataitems.ConditionName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.Global) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_Global((org.servicifi.gelato.language.cobol.dataitems.Global) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.External) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_External((org.servicifi.gelato.language.cobol.dataitems.External) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.Value) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_Value((org.servicifi.gelato.language.cobol.dataitems.Value) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.Usage) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_Usage((org.servicifi.gelato.language.cobol.dataitems.Usage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.GroupUsage) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_GroupUsage((org.servicifi.gelato.language.cobol.dataitems.GroupUsage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_DataItemAttribute((org.servicifi.gelato.language.cobol.dataitems.DataItemAttribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.RecordName) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_RecordName((org.servicifi.gelato.language.cobol.dataitems.RecordName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.DataName) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_DataName((org.servicifi.gelato.language.cobol.dataitems.DataName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.DataItem) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_DataItem((org.servicifi.gelato.language.cobol.dataitems.DataItem) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.dataitems.Redefines) {
			result = interprete_org_servicifi_gelato_language_cobol_dataitems_Redefines((org.servicifi.gelato.language.cobol.dataitems.Redefines) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.OnStatus) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_OnStatus((org.servicifi.gelato.language.cobol.specialnames.OnStatus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.OffStatus) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_OffStatus((org.servicifi.gelato.language.cobol.specialnames.OffStatus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.ConditionName) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_ConditionName((org.servicifi.gelato.language.cobol.specialnames.ConditionName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.AlphabetName) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_AlphabetName((org.servicifi.gelato.language.cobol.specialnames.AlphabetName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs((org.servicifi.gelato.language.cobol.specialnames.UPSISwitchIs) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.CurrencySign) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_CurrencySign((org.servicifi.gelato.language.cobol.specialnames.CurrencySign) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_SystemDeviceIs((org.servicifi.gelato.language.cobol.specialnames.SystemDeviceIs) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.MnemonicName) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_MnemonicName((org.servicifi.gelato.language.cobol.specialnames.MnemonicName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.SpecialName) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_SpecialName((org.servicifi.gelato.language.cobol.specialnames.SpecialName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_PredefinedAlphabetType((org.servicifi.gelato.language.cobol.specialnames.PredefinedAlphabetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_ExplicitAlphabetType((org.servicifi.gelato.language.cobol.specialnames.ExplicitAlphabetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_CodeNameAlphabetType((org.servicifi.gelato.language.cobol.specialnames.CodeNameAlphabetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.AlphabetType) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_AlphabetType((org.servicifi.gelato.language.cobol.specialnames.AlphabetType) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.ClassName) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_ClassName((org.servicifi.gelato.language.cobol.specialnames.ClassName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter((org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement((org.servicifi.gelato.language.cobol.specialnames.SymbolicCharacterStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_specialnames_SpecialNameStatement((org.servicifi.gelato.language.cobol.specialnames.SpecialNameStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.tables.Table) {
			result = interprete_org_servicifi_gelato_language_cobol_tables_Table((org.servicifi.gelato.language.cobol.tables.Table) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.tables.KeyName) {
			result = interprete_org_servicifi_gelato_language_cobol_tables_KeyName((org.servicifi.gelato.language.cobol.tables.KeyName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.tables.IndexName) {
			result = interprete_org_servicifi_gelato_language_cobol_tables_IndexName((org.servicifi.gelato.language.cobol.tables.IndexName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.tables.TableDimension) {
			result = interprete_org_servicifi_gelato_language_cobol_tables_TableDimension((org.servicifi.gelato.language.cobol.tables.TableDimension) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.tables.AdditionalIndexName) {
			result = interprete_org_servicifi_gelato_language_cobol_tables_AdditionalIndexName((org.servicifi.gelato.language.cobol.tables.AdditionalIndexName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.files.FileName) {
			result = interprete_org_servicifi_gelato_language_cobol_files_FileName((org.servicifi.gelato.language.cobol.files.FileName) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.files.SelectStatement) {
			result = interprete_org_servicifi_gelato_language_cobol_files_SelectStatement((org.servicifi.gelato.language.cobol.files.SelectStatement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.files.FileStatus) {
			result = interprete_org_servicifi_gelato_language_cobol_files_FileStatus((org.servicifi.gelato.language.cobol.files.FileStatus) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.parameters.Parametrizable) {
			result = interprete_org_servicifi_gelato_language_cobol_parameters_Parametrizable((org.servicifi.gelato.language.cobol.parameters.Parametrizable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter) {
			result = interprete_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter((org.servicifi.gelato.language.cobol.parameters.ByReferenceParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.parameters.ByValueParameter) {
			result = interprete_org_servicifi_gelato_language_cobol_parameters_ByValueParameter((org.servicifi.gelato.language.cobol.parameters.ByValueParameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.parameters.Parameter) {
			result = interprete_org_servicifi_gelato_language_cobol_parameters_Parameter((org.servicifi.gelato.language.cobol.parameters.Parameter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.declaratives.Declaratives) {
			result = interprete_org_servicifi_gelato_language_cobol_declaratives_Declaratives((org.servicifi.gelato.language.cobol.declaratives.Declaratives) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.FunctionCall) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_FunctionCall((org.servicifi.gelato.language.cobol.functions.FunctionCall) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.ByReferenceArgument) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument((org.servicifi.gelato.language.cobol.functions.ByReferenceArgument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.ByValueArgument) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_ByValueArgument((org.servicifi.gelato.language.cobol.functions.ByValueArgument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.ByContentArgument) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_ByContentArgument((org.servicifi.gelato.language.cobol.functions.ByContentArgument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.OmittedArgument) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_OmittedArgument((org.servicifi.gelato.language.cobol.functions.OmittedArgument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.Argument) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_Argument((org.servicifi.gelato.language.cobol.functions.Argument) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.functions.Argumentable) {
			result = interprete_org_servicifi_gelato_language_cobol_functions_Argumentable((org.servicifi.gelato.language.cobol.functions.Argumentable) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.OnSizeError) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_OnSizeError((org.servicifi.gelato.language.cobol.handlers.OnSizeError) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotOnSizeError) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotOnSizeError((org.servicifi.gelato.language.cobol.handlers.NotOnSizeError) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.OnOverflow) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_OnOverflow((org.servicifi.gelato.language.cobol.handlers.OnOverflow) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.OnException) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_OnException((org.servicifi.gelato.language.cobol.handlers.OnException) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotOnException) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotOnException((org.servicifi.gelato.language.cobol.handlers.NotOnException) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotOnOverflow) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotOnOverflow((org.servicifi.gelato.language.cobol.handlers.NotOnOverflow) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotAtEnd) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotAtEnd((org.servicifi.gelato.language.cobol.handlers.NotAtEnd) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotErrorHandler) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotErrorHandler((org.servicifi.gelato.language.cobol.handlers.NotErrorHandler) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.AtEnd) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_AtEnd((org.servicifi.gelato.language.cobol.handlers.AtEnd) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.AtEndOfPage) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_AtEndOfPage((org.servicifi.gelato.language.cobol.handlers.AtEndOfPage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.InvalidKey) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_InvalidKey((org.servicifi.gelato.language.cobol.handlers.InvalidKey) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotAtEndOfPage((org.servicifi.gelato.language.cobol.handlers.NotAtEndOfPage) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.NotInvalidKey) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_NotInvalidKey((org.servicifi.gelato.language.cobol.handlers.NotInvalidKey) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.handlers.Handler) {
			result = interprete_org_servicifi_gelato_language_cobol_handlers_Handler((org.servicifi.gelato.language.cobol.handlers.Handler) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.Tallying) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_Tallying((org.servicifi.gelato.language.cobol.strings.Tallying) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.StringManipulation) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_StringManipulation((org.servicifi.gelato.language.cobol.strings.StringManipulation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings((org.servicifi.gelato.language.cobol.strings.ConcatenatingStrings) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.SplittedString) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_SplittedString((org.servicifi.gelato.language.cobol.strings.SplittedString) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.ManipulatedStrings) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_ManipulatedStrings((org.servicifi.gelato.language.cobol.strings.ManipulatedStrings) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_AnyCharacterBySpecificCharacter((org.servicifi.gelato.language.cobol.strings.AnyCharacterBySpecificCharacter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter((org.servicifi.gelato.language.cobol.strings.SpecificCharacterBySpecificCharacter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.Replacement) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_Replacement((org.servicifi.gelato.language.cobol.strings.Replacement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.String) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_String((org.servicifi.gelato.language.cobol.strings.String) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.Location) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_Location((org.servicifi.gelato.language.cobol.strings.Location) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.TallyingOccurrence) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence((org.servicifi.gelato.language.cobol.strings.TallyingOccurrence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence((org.servicifi.gelato.language.cobol.strings.ReplacementOccurrence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.Occurrence) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_Occurrence((org.servicifi.gelato.language.cobol.strings.Occurrence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.AnyCharacter) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_AnyCharacter((org.servicifi.gelato.language.cobol.strings.AnyCharacter) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.servicifi.gelato.language.cobol.strings.SpecificCharacter) {
			result = interprete_org_servicifi_gelato_language_cobol_strings_SpecificCharacter((org.servicifi.gelato.language.cobol.strings.SpecificCharacter) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_verbs_Is(Is is, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_verbs_Verb(Verb verb, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_ProcedureRange(ProcedureRange procedureRange, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_ProcedureRangeLabel(ProcedureRangeLabel procedureRangeLabel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_ProcedureRangeChild(ProcedureRangeChild procedureRangeChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_ProcedureLabel(ProcedureLabel procedureLabel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_Procedure(Procedure procedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_Label(Label label, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_StopLabel(StopLabel stopLabel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_labels_Run(Run run, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_commons_NamedElement(NamedElement namedElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_commons_Commentable(Commentable commentable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_commons_LabellableElement(LabellableElement labellableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_commons_URIableElement(URIableElement uRIableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_containers_CompilationGroup(CompilationGroup compilationGroup, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_containers_CompilationUnit(CompilationUnit compilationUnit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_containers_CobolRoot(CobolRoot cobolRoot, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_containers_EmptyModel(EmptyModel emptyModel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Statement(Statement statement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_ArithmeticStatement(ArithmeticStatement arithmeticStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Add(Add add, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Subtract(Subtract subtract, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Multiply(Multiply multiply, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Divide(Divide divide, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Perform(Perform perform, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformNestedStatement(PerformNestedStatement performNestedStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformProcedure(PerformProcedure performProcedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Jump(Jump jump, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_NextSentence(NextSentence nextSentence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_GoTo(GoTo goTo, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_GoBack(GoBack goBack, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_NestedStatement(NestedStatement nestedStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Move(Move move, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Exit(Exit exit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Condition(Condition condition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Conditional(Conditional conditional, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Stop(Stop stop, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Display(Display display, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Compute(Compute compute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Accept(Accept accept, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Execute(Execute execute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_ErrorHandled(ErrorHandled errorHandled, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Return(Return _return, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_SetStatement(SetStatement setStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_SetSwitches(SetSwitches setSwitches, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_SetIndexName(SetIndexName setIndexName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_String(org.servicifi.gelato.language.cobol.statements.String string, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Close(Close close, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Cancel(Cancel cancel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Call(Call call, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Initialize(Initialize initialize, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Open(Open open, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_SearchStatement(SearchStatement searchStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_SerialSearch(SerialSearch serialSearch, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_BinarySearch(BinarySearch binarySearch, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Unstring(Unstring unstring, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Evaluate(Evaluate evaluate, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_NormalEvaluateCase(NormalEvaluateCase normalEvaluateCase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_OtherEvaluateCase(OtherEvaluateCase otherEvaluateCase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_EvaluateCase(EvaluateCase evaluateCase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Replace(Replace replace, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Entry(Entry entry, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Inspect(Inspect inspect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Set(Set set, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Read(Read read, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Write(Write write, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Rewrite(Rewrite rewrite, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_SwitchStatus(SwitchStatus switchStatus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformProcedureFixedTimes(PerformProcedureFixedTimes performProcedureFixedTimes, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformUntilCondition(PerformUntilCondition performUntilCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformFixedTimes(PerformFixedTimes performFixedTimes, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformProcedureUntilCondition(PerformProcedureUntilCondition performProcedureUntilCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementFixedTimes(PerformNestedStatementFixedTimes performNestedStatementFixedTimes, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_PerformNestedStatementUntilCondition(PerformNestedStatementUntilCondition performNestedStatementUntilCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Continue(Continue _continue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_FileIOStatement(FileIOStatement fileIOStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Sort(Sort sort, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Merge(Merge merge, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Release(Release release, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_KeyDescriptor(KeyDescriptor keyDescriptor, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_IOStatement(IOStatement iOStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_IOFileDescriptor(IOFileDescriptor iOFileDescriptor, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_IOFile(IOFile iOFile, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_TallyingIn(TallyingIn tallyingIn, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_VaryingUntilCondition(VaryingUntilCondition varyingUntilCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_AfterUntilCondition(AfterUntilCondition afterUntilCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Start(Start start, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_statements_Delete(Delete delete, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_StatementContainer(StatementContainer statementContainer, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_EmptySentence(EmptySentence emptySentence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_UseSentence(UseSentence useSentence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_AlteredGoTo(AlteredGoTo alteredGoTo, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_ExitProcedure(ExitProcedure exitProcedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_EntrySentence(EntrySentence entrySentence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_ExecuteSentence(ExecuteSentence executeSentence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sentences_Sentence(Sentence sentence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_divisions_Division(Division division, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_divisions_DataDivision(DataDivision dataDivision, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_divisions_EnvironmentDivision(EnvironmentDivision environmentDivision, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_divisions_IdentificationDivision(IdentificationDivision identificationDivision, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_divisions_ProcedureDivision(ProcedureDivision procedureDivision, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_Section(Section section, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_WorkingStorageSection(WorkingStorageSection workingStorageSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_LocalStorageSection(LocalStorageSection localStorageSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_LinkageStorageSection(LinkageStorageSection linkageStorageSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_IOSection(IOSection iOSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_ConfigurationSection(ConfigurationSection configurationSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_EnvironmentDivisionSection(EnvironmentDivisionSection environmentDivisionSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_DataDivisionSection(DataDivisionSection dataDivisionSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_FileSection(FileSection fileSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_sections_DeclarativeSection(DeclarativeSection declarativeSection, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_Paragraph(Paragraph paragraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_SourceComputerParagraph(SourceComputerParagraph sourceComputerParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_ObjectComputerParagraph(ObjectComputerParagraph objectComputerParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_FileControlParagraph(FileControlParagraph fileControlParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_IOControlParagraph(IOControlParagraph iOControlParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_ConfigurationSectionParagraph(ConfigurationSectionParagraph configurationSectionParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_IOSectionParagraph(IOSectionParagraph iOSectionParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_SpecialNamesParagraph(SpecialNamesParagraph specialNamesParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_RepositoryParagraph(RepositoryParagraph repositoryParagraph, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_paragraphs_DebuggingMode(DebuggingMode debuggingMode, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_Reference(Reference reference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_ReferenceableElement(ReferenceableElement referenceableElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_ElementReference(ElementReference elementReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_SpecialNamesConditionNameReference(SpecialNamesConditionNameReference specialNamesConditionNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_FileNameReference(FileNameReference fileNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_IndexNameReference(IndexNameReference indexNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_MnemonicNameReference(MnemonicNameReference mnemonicNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_AlphabetNameReference(AlphabetNameReference alphabetNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_ConditionName(ConditionName conditionName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_Qualifiable(Qualifiable qualifiable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_ConditionNameReference(ConditionNameReference conditionNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_DataNameReference(DataNameReference dataNameReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_references_IdentifierReferenceQualifier(IdentifierReferenceQualifier identifierReferenceQualifier, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Literal(Literal literal, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_AlphanumericLiteral(AlphanumericLiteral alphanumericLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_IntegerLiteral(IntegerLiteral integerLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_DecimalLiteral(DecimalLiteral decimalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_FigurativeConstantLiteral(FigurativeConstantLiteral figurativeConstantLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_BooleanLiteral(BooleanLiteral booleanLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_FloatingDecimalLiteral(FloatingDecimalLiteral floatingDecimalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_AllLiteral(AllLiteral allLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_NumericLiteral(NumericLiteral numericLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_ConstantLiteral(ConstantLiteral constantLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_PseudoLiteral(PseudoLiteral pseudoLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_DBCSLiteral(DBCSLiteral dBCSLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_NationalLiteral(NationalLiteral nationalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_FixedDecimalLiteral(FixedDecimalLiteral fixedDecimalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_NationalHexLiteral(NationalHexLiteral nationalHexLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Null(Null _null, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Zero(Zero zero, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Quote(Quote quote, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_LowValue(LowValue lowValue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_HighValue(HighValue highValue, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Space(Space space, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Any(Any any, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_Characters(Characters characters, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_literals_AlphanumericHexaDecimalLiteral(AlphanumericHexaDecimalLiteral alphanumericHexaDecimalLiteral, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_InputProcedure(InputProcedure inputProcedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_InputDirective(InputDirective inputDirective, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_InputFile(InputFile inputFile, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_OutputDirective(OutputDirective outputDirective, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_OutputProcedure(OutputProcedure outputProcedure, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_OutputFile(OutputFile outputFile, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_IODirectives(IODirectives iODirectives, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_FileDirective(FileDirective fileDirective, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_ios_ProcedureDirective(ProcedureDirective procedureDirective, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpression(AdditiveArithmeticExpression additiveArithmeticExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_AdditiveArithmeticExpressionChild(AdditiveArithmeticExpressionChild additiveArithmeticExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpression(MultiplicativeArithmeticExpression multiplicativeArithmeticExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_MultiplicativeArithmeticExpressionChild(MultiplicativeArithmeticExpressionChild multiplicativeArithmeticExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpression(PowerArithmeticExpression powerArithmeticExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_PowerArithmeticExpressionChild(PowerArithmeticExpressionChild powerArithmeticExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpressionChild(UnaryArithmeticExpressionChild unaryArithmeticExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_UnaryArithmeticExpression(UnaryArithmeticExpression unaryArithmeticExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_PrimaryExpression(PrimaryExpression primaryExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_AssignmentExpression(AssignmentExpression assignmentExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_RangeExpression(RangeExpression rangeExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_RangeExpressionChild(RangeExpressionChild rangeExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_NestedArithmeticExpression(NestedArithmeticExpression nestedArithmeticExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_arithmetics_ArithmeticExpression(ArithmeticExpression arithmeticExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_Condition(org.servicifi.gelato.language.cobol.conditions.Condition condition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpression(ConditionalOrExpression conditionalOrExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalOrExpressionChild(ConditionalOrExpressionChild conditionalOrExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpression(NegatedConditionalExpression negatedConditionalExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_NegatedConditionalExpressionChild(NegatedConditionalExpressionChild negatedConditionalExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_SimpleConditionChild(SimpleConditionChild simpleConditionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_RelationalExpression(RelationalExpression relationalExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_ExpressionList(ExpressionList expressionList, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpressionChild(ConditionalAndExpressionChild conditionalAndExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_ConditionalAndExpression(ConditionalAndExpression conditionalAndExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpression(AbbreviatedConditionalExpression abbreviatedConditionalExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedConditionalExpressionChild(AbbreviatedConditionalExpressionChild abbreviatedConditionalExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpression(NegatedAbbreviatedConditionalExpression negatedAbbreviatedConditionalExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_NegatedAbbreviatedConditionalExpressionChild(NegatedAbbreviatedConditionalExpressionChild negatedAbbreviatedConditionalExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpression(AbbreviatedRelationalExpression abbreviatedRelationalExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_NestedAbbreviatedConditionalExpression(NestedAbbreviatedConditionalExpression nestedAbbreviatedConditionalExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_SignCondition(SignCondition signCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_ClassCondition(ClassCondition classCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_AbbreviatedRelationalExpressionChild(AbbreviatedRelationalExpressionChild abbreviatedRelationalExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_conditions_NestedCondition(NestedCondition nestedCondition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Operator(Operator operator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_AdditiveOperator(AdditiveOperator additiveOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_MultiplicativeOperator(MultiplicativeOperator multiplicativeOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_UnaryOperator(UnaryOperator unaryOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LogicalOperator(LogicalOperator logicalOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_RelationalOperator(RelationalOperator relationalOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_ConditionOr(ConditionOr conditionOr, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_ConditionAnd(ConditionAnd conditionAnd, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Multiplication(Multiplication multiplication, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_SignOperator(SignOperator signOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Positive(Positive positive, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Negative(Negative negative, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Division(org.servicifi.gelato.language.cobol.operators.Division division, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Addition(Addition addition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Subtraction(Subtraction subtraction, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_GreaterThanOrEqual(GreaterThanOrEqual greaterThanOrEqual, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_GreaterThan(GreaterThan greaterThan, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LessThan(LessThan lessThan, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LessThanOrEqual(LessThanOrEqual lessThanOrEqual, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Equal(Equal equal, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Power(Power power, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Negate(Negate negate, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Through(Through through, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_ClassOperator(ClassOperator classOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Zero(org.servicifi.gelato.language.cobol.operators.Zero zero, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_ClassName(ClassName className, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Alphabetic(Alphabetic alphabetic, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_DBCS(DBCS dBCS, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Numeric(Numeric numeric, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_AlphabeticUpper(AlphabeticUpper alphabeticUpper, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_AlphabeticLower(AlphabeticLower alphabeticLower, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_Kanji(Kanji kanji, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_EqualPhrase(EqualPhrase equalPhrase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_EqualSign(EqualSign equalSign, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LTPhrase(LTPhrase lTPhrase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LTSign(LTSign lTSign, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LTEQPhrase(LTEQPhrase lTEQPhrase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_LTEQSign(LTEQSign lTEQSign, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_GTPhrase(GTPhrase gTPhrase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_GTSign(GTSign gTSign, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_GTEQPhrase(GTEQPhrase gTEQPhrase, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operators_GTEQSign(GTEQSign gTEQSign, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operands_PrimaryOperand(PrimaryOperand primaryOperand, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operands_RoundedIdentifier(RoundedIdentifier roundedIdentifier, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operands_ReplacementOperand(ReplacementOperand replacementOperand, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operands_Encoding(Encoding encoding, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operands_Operand(Operand operand, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_operands_ArithmeticOperand(ArithmeticOperand arithmeticOperand, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_Subscript(Subscript subscript, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_Identifier(Identifier identifier, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_IdentifierReference(IdentifierReference identifierReference, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_All(All all, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_ReferenceModifier(ReferenceModifier referenceModifier, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_LinageCounter(LinageCounter linageCounter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_Qualifier(Qualifier qualifier, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_RelativeSubscript(RelativeSubscript relativeSubscript, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_identifiers_DirectSubscript(DirectSubscript directSubscript, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_IncompleteElement(IncompleteElement incompleteElement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_IdentificationDivisionWater(IdentificationDivisionWater identificationDivisionWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_Water(Water water, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_ProgramDescription(ProgramDescription programDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_Dot(Dot dot, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_ObjectComputerParagraphWater(ObjectComputerParagraphWater objectComputerParagraphWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_ObjectComputerDescription(ObjectComputerDescription objectComputerDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_PriorityNumber(PriorityNumber priorityNumber, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SelectStatementWater(SelectStatementWater selectStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SelectStatementClause(SelectStatementClause selectStatementClause, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SpecialNamesParagraphWater(SpecialNamesParagraphWater specialNamesParagraphWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SpecialNamesClause(SpecialNamesClause specialNamesClause, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_FileDescriptorWater(FileDescriptorWater fileDescriptorWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_FileDescription(FileDescription fileDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_DataDescriptorWater(DataDescriptorWater dataDescriptorWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_DataDescription(DataDescription dataDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_IOControlParagraphWater(IOControlParagraphWater iOControlParagraphWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_IOControlDescription(IOControlDescription iOControlDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_RepositoryParagraphWater(RepositoryParagraphWater repositoryParagraphWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_RepositoryDescription(RepositoryDescription repositoryDescription, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SQLStatementWater(SQLStatementWater sQLStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_CICSStatementWater(CICSStatementWater cICSStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SQLStatementToken(SQLStatementToken sQLStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_CICSStatementToken(CICSStatementToken cICSStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_AcceptStatementWater(AcceptStatementWater acceptStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_AcceptStatementToken(AcceptStatementToken acceptStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_UseStatementWater(UseStatementWater useStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_UseStatementToken(UseStatementToken useStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_CloseStatementWater(CloseStatementWater closeStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_CloseStatementToken(CloseStatementToken closeStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_InvokeStatementWater(InvokeStatementWater invokeStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_InvokeStatementToken(InvokeStatementToken invokeStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_OpenStatementWater(OpenStatementWater openStatementWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_OpenStatementToken(OpenStatementToken openStatementToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SortPhraseToken(SortPhraseToken sortPhraseToken, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_water_SortPhraseWater(SortPhraseWater sortPhraseWater, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_Register(Register register, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_ShiftIn(ShiftIn shiftIn, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_ShiftOut(ShiftOut shiftOut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_AddressOf(AddressOf addressOf, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_LengthOf(LengthOf lengthOf, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_ReturnCode(ReturnCode returnCode, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_registers_WhenCompiled(WhenCompiled whenCompiled, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_SystemDevice(SystemDevice systemDevice, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_SystemLogicalInput(SystemLogicalInput systemLogicalInput, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_UPSI(UPSI uPSI, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_SystemLogicalOutput(SystemLogicalOutput systemLogicalOutput, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_SystemPunchDevice(SystemPunchDevice systemPunchDevice, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_Console(Console console, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_Channel(Channel channel, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_AdvancedFunctionPrinting(AdvancedFunctionPrinting advancedFunctionPrinting, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_SuppressSpacing(SuppressSpacing suppressSpacing, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_Pocket(Pocket pocket, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_environments_Environment(Environment environment, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_PictureString(PictureString pictureString, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_RenamingDataName(RenamingDataName renamingDataName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_ConditionName(org.servicifi.gelato.language.cobol.dataitems.ConditionName conditionName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_Global(Global global, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_External(External external, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_Value(Value value, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_DataItemAttribute(DataItemAttribute dataItemAttribute, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_Usage(Usage usage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_GroupUsage(GroupUsage groupUsage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_DataItem(DataItem dataItem, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_RecordName(RecordName recordName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_DataName(DataName dataName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_dataitems_Redefines(Redefines redefines, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_SpecialName(SpecialName specialName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_ConditionName(org.servicifi.gelato.language.cobol.specialnames.ConditionName conditionName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_OnStatus(OnStatus onStatus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_OffStatus(OffStatus offStatus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_AlphabetName(AlphabetName alphabetName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_UPSISwitchIs(UPSISwitchIs uPSISwitchIs, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_AlphabetType(AlphabetType alphabetType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_PredefinedAlphabetType(PredefinedAlphabetType predefinedAlphabetType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_ExplicitAlphabetType(ExplicitAlphabetType explicitAlphabetType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_CodeNameAlphabetType(CodeNameAlphabetType codeNameAlphabetType, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_CurrencySign(CurrencySign currencySign, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_ClassName(org.servicifi.gelato.language.cobol.specialnames.ClassName className, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_MnemonicName(MnemonicName mnemonicName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_SystemDeviceIs(SystemDeviceIs systemDeviceIs, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacter(SymbolicCharacter symbolicCharacter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_SymbolicCharacterStatement(SymbolicCharacterStatement symbolicCharacterStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_specialnames_SpecialNameStatement(SpecialNameStatement specialNameStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_tables_Table(Table table, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_tables_KeyName(KeyName keyName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_tables_IndexName(IndexName indexName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_tables_TableDimension(TableDimension tableDimension, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_tables_AdditionalIndexName(AdditionalIndexName additionalIndexName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_files_FileName(FileName fileName, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_files_SelectStatement(SelectStatement selectStatement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_files_FileStatus(FileStatus fileStatus, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_parameters_Parametrizable(Parametrizable parametrizable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_parameters_Parameter(Parameter parameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_parameters_ByReferenceParameter(ByReferenceParameter byReferenceParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_parameters_ByValueParameter(ByValueParameter byValueParameter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_declaratives_Declaratives(Declaratives declaratives, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_FunctionCall(FunctionCall functionCall, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_Argument(Argument argument, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_ByReferenceArgument(ByReferenceArgument byReferenceArgument, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_ByValueArgument(ByValueArgument byValueArgument, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_ByContentArgument(ByContentArgument byContentArgument, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_OmittedArgument(OmittedArgument omittedArgument, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_functions_Argumentable(Argumentable argumentable, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_OnSizeError(OnSizeError onSizeError, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_Handler(Handler handler, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotOnSizeError(NotOnSizeError notOnSizeError, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_OnOverflow(OnOverflow onOverflow, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_OnException(OnException onException, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotOnException(NotOnException notOnException, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotErrorHandler(NotErrorHandler notErrorHandler, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotOnOverflow(NotOnOverflow notOnOverflow, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotAtEnd(NotAtEnd notAtEnd, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_AtEnd(AtEnd atEnd, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_AtEndOfPage(AtEndOfPage atEndOfPage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_InvalidKey(InvalidKey invalidKey, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotAtEndOfPage(NotAtEndOfPage notAtEndOfPage, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_handlers_NotInvalidKey(NotInvalidKey notInvalidKey, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_Tallying(Tallying tallying, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_StringManipulation(StringManipulation stringManipulation, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_ManipulatedStrings(ManipulatedStrings manipulatedStrings, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_String(org.servicifi.gelato.language.cobol.strings.String string, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_ConcatenatingStrings(ConcatenatingStrings concatenatingStrings, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_SplittedString(SplittedString splittedString, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_Location(Location location, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_Replacement(Replacement replacement, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_Occurrence(Occurrence occurrence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_TallyingOccurrence(TallyingOccurrence tallyingOccurrence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_ReplacementOccurrence(ReplacementOccurrence replacementOccurrence, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_AnyCharacter(AnyCharacter anyCharacter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_SpecificCharacter(SpecificCharacter specificCharacter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_AnyCharacterBySpecificCharacter(AnyCharacterBySpecificCharacter anyCharacterBySpecificCharacter, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_servicifi_gelato_language_cobol_strings_SpecificCharacterBySpecificCharacter(SpecificCharacterBySpecificCharacter specificCharacterBySpecificCharacter, ContextType context) {
		return null;
	}
	
	private void notifyListeners(EObject element) {
		for (org.servicifi.gelato.language.cobol.resource.cobol.ICobolInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(Collection<? extends EObject> objects) {
		for (EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(Collection<? extends EObject> objects) {
		List<EObject> reverse = new ArrayList<EObject>(objects.size());
		reverse.addAll(objects);
		Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(EObject root) {
		List<EObject> objects = new ArrayList<EObject>();
		objects.add(root);
		Iterator<EObject> it = root.eAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.servicifi.gelato.language.cobol.resource.cobol.ICobolInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.servicifi.gelato.language.cobol.resource.cobol.ICobolInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public Stack<EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public ContextType getCurrentContext() {
		return currentContext;
	}
	
}
