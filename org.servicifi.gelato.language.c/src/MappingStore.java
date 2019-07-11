import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.procedures.ProceduresFactory;
import org.servicifi.gelato.language.kernel.references.ReferenceableElement;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;

public class MappingStore {
	private static final String GLOBAL_CONTEXT = "__GLOBAL__";

	private Map<String, Set<LabellableElement>> labeledStatement2labeledElement = new HashMap<>();

	private Map<ParserRuleContext, Double> ruleContext2label = new HashMap<>();
	private long label = 1;

	// Context -> Identifier -> Index
	private Map<String, Map<String, String>> identifier2Index = new HashMap<>();
	private long freshIndex = 0;

	private Map<String, Procedure> identifier2procedure = new HashMap<>();

	private Set<ExpressionStatement> returnExpressionStatements = new HashSet<>();

	private Stack<String> context = new Stack<>();

	public Double getLabel(ParserRuleContext ctx) {
		if (ruleContext2label.containsKey(ctx)) {
			return ruleContext2label.get(ctx);
		}

		double newLabel = label++;

		ruleContext2label.put(ctx, newLabel);

		return newLabel;
	}

	public Map<String, String> getContextIdentifiers(String context) {
		return identifier2Index.get(context);
	}

	public String getName(String context, TerminalNode identifier) {
		return getName(context, identifier.toString());
	}

	public String createName(String context, TerminalNode identifier) {
		return createName(context, identifier.toString());
	}

	public String createName(String context, String identifierName) {
		Map<String, String> identifierMappings;

		if (identifier2Index.containsKey(context)) {
			identifierMappings = identifier2Index.get(context);
		} else {
			identifierMappings = new HashMap<>();
			identifier2Index.put(context, identifierMappings);
		}

		if (identifierMappings.containsKey(identifierName)) {
			throw new Error("An identifier with the name '" + identifierName + ": " + context + "' already exists.");
		}

		long newIndex = freshIndex++;
		String name = "var" + newIndex;

		identifierMappings.put(identifierName, name);

		// TEST
		assert identifier2Index.get(context).containsKey(identifierName);

		return name;
	}

	public String getName(String context, String identifierName) {
		Map<String, String> identifierMappings;

		// XXX Ideally this should look for mappings, one context at a time until GLOBAL
		if (identifier2Index.containsKey(context) && identifier2Index.get(context).containsKey(identifierName)) {
			identifierMappings = identifier2Index.get(context);
		} else {
			identifierMappings = identifier2Index.get(GLOBAL_CONTEXT);
		}

		if (identifierMappings != null && identifierMappings.containsKey(identifierName)) {
			return identifierMappings.get(identifierName);
		}

		return createName(GLOBAL_CONTEXT, identifierName);
	}

	public boolean hasProcedure(String identifierName) {
		return identifier2procedure.containsKey(normalizeIdentifierName(identifierName));
	}

	public Procedure createProcedure(String identifierName) {
		Procedure procedure = ProceduresFactory.eINSTANCE.createProcedure();

		identifierName = normalizeIdentifierName(identifierName);

		procedure.setName(identifierName);

		identifier2procedure.put(identifierName, procedure);

		return procedure;
	}

	private String normalizeIdentifierName(String identifierName) {
		if (isKernelReservedWord(identifierName)) {
			int index = 0;

			String normalizedIdentifierName = identifierName + index;

			while (identifier2procedure.containsKey(normalizedIdentifierName)) {
				index++;

				normalizedIdentifierName = identifierName + index;
			}

			return normalizedIdentifierName;
		}

		return identifierName;
	}

	private static final String[] KERNEL_RESERVED_WORDS = { "main" };

	private boolean isKernelReservedWord(String name) {
		for (String word : KERNEL_RESERVED_WORDS) {
			if (word.equals(name)) {
				return true;
			}
		}

		return false;
	}

	private static final String[] C_RESERVED_WORDS = { "NULL" };

	public boolean isCReservedWord(TerminalNode identifier) {
		String name = identifier.getText();

		for (String word : C_RESERVED_WORDS) {
			if (word.equals(name)) {
				return true;
			}
		}

		return false;
	}

	public Procedure getProcedure(String identifierName) {
		return identifier2procedure.get(normalizeIdentifierName(identifierName));
	}

	public void registerLabeledStatement(String labelName, LabellableElement element) {
		if (labeledStatement2labeledElement.containsKey(labelName)) {
			labeledStatement2labeledElement.get(labelName).add(element);
		} else {
			Set<LabellableElement> labels = new HashSet<>();
			labels.add(element);
			labeledStatement2labeledElement.put(labelName, labels);
		}
	}

	public void clearLabels() {
		labeledStatement2labeledElement.clear();
	}

	public void clearReturnExpressionStatements() {
		returnExpressionStatements.clear();
	}

	public void registerReturnExpressionStatement(ExpressionStatement exprStatement) {
		returnExpressionStatements.add(exprStatement);
	}

	public Set<ExpressionStatement> getReturnExpressionStatements() {
		return returnExpressionStatements;
	}

	public boolean hasRuleContext(Double lbl) {
		return ruleContext2label.entrySet().stream().anyMatch(entry -> entry.getValue().intValue() == lbl.intValue());
	}

	public Collection<Double> getAllRuleContextLabels() {
		return ruleContext2label.values();
	}

	public ParserRuleContext getRuleContext(Double lbl) {
		return ruleContext2label.entrySet().stream().filter(entry -> entry.getValue().intValue() == lbl.intValue())
				.map(Map.Entry::getKey).findFirst().get();
	}

	public Set<LabellableElement> getJumpLabel(String identifier) {
		if (labeledStatement2labeledElement.containsKey(identifier)) {

			return labeledStatement2labeledElement.get(identifier);
		}

		// TODO may be create a proxy and return
		return new HashSet<>();
	}

	public String getContext() {
		return context.peek();
	}

	public void pushContext(String ctx) {
		context.push(ctx);
	}

	public String popContext() {
		return context.pop();
	}
}
