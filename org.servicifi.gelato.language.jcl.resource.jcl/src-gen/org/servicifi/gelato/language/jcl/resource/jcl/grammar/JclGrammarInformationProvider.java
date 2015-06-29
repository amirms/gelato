/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;

import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class JclGrammarInformationProvider {
	
	public final static EStructuralFeature ANONYMOUS_FEATURE = EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static JclGrammarInformationProvider INSTANCE = new JclGrammarInformationProvider();
	
	private Set<String> keywords;
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainment JCL_0_0_0_0 = INSTANCE.getJCL_0_0_0_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainment getJCL_0_0_0_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclContainment(org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit().getEStructuralFeature(org.servicifi.gelato.language.jcl.containers.ContainersPackage.JOB_UNIT__STATEMENTS), org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.PLUS, new EClass[] {org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSequence JCL_0_0_0 = INSTANCE.getJCL_0_0_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSequence getJCL_0_0_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSequence(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE, JCL_0_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice JCL_0_0 = INSTANCE.getJCL_0_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice getJCL_0_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE, JCL_0_0_0);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule JCL_0 = INSTANCE.getJCL_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule getJCL_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule(org.servicifi.gelato.language.jcl.containers.ContainersPackage.eINSTANCE.getJobUnit(), JCL_0_0, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclPlaceholder JCL_1_0_0_0 = INSTANCE.getJCL_1_0_0_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclPlaceholder getJCL_1_0_0_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclPlaceholder(org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute().getEStructuralFeature(org.servicifi.gelato.language.jcl.statements.StatementsPackage.EXECUTE__NAME), "JCL_WORD", org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE, 0);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword JCL_1_0_0_1 = INSTANCE.getJCL_1_0_0_1();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword getJCL_1_0_0_1() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword("EXEC", org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSequence JCL_1_0_0 = INSTANCE.getJCL_1_0_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSequence getJCL_1_0_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSequence(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE, JCL_1_0_0_0, JCL_1_0_0_1);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice JCL_1_0 = INSTANCE.getJCL_1_0();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice getJCL_1_0() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE, JCL_1_0_0);
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule JCL_1 = INSTANCE.getJCL_1();
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule getJCL_1() {
		return new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule(org.servicifi.gelato.language.jcl.statements.StatementsPackage.eINSTANCE.getExecute(), JCL_1_0, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality.ONE);
	}
	
	
	public static String getSyntaxElementID(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (Field field : org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement) org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule[] RULES = new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule[] {
		JCL_0,
		JCL_1,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new LinkedHashSet<String>();
			for (org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement element, Set<String> keywords) {
		if (element instanceof org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword) {
			keywords.add(((org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclKeyword) element).getValue());
		} else if (element instanceof org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclBooleanTerminal) {
			keywords.add(((org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclEnumerationTerminal) {
			org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclEnumerationTerminal terminal = (org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
