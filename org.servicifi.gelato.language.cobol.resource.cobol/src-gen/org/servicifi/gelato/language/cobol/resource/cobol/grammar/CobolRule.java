/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class CobolRule extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement {
	
	private final EClass metaclass;
	
	public CobolRule(EClass metaclass, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolChoice choice, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolChoice getDefinition() {
		return (org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolChoice) getChildren()[0];
	}
	
}

