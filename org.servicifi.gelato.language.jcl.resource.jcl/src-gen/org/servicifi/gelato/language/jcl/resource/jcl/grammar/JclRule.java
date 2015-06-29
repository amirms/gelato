/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;

import org.eclipse.emf.ecore.EClass;

/**
 * A class to represent a rules in the grammar.
 */
public class JclRule extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement {
	
	private final EClass metaclass;
	
	public JclRule(EClass metaclass, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice choice, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public EClass getMetaclass() {
		return metaclass;
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice getDefinition() {
		return (org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice) getChildren()[0];
	}
	
}

