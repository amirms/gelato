/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;


public class JclCompound extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement {
	
	public JclCompound(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclChoice choice, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality) {
		super(cardinality, new org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
