/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;


public class JclChoice extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement {
	
	public JclChoice(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.servicifi.gelato.language.jcl.resource.jcl.util.JclStringUtil.explode(getChildren(), "|");
	}
	
}
