/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;


public class JclSequence extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement {
	
	public JclSequence(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.servicifi.gelato.language.jcl.resource.jcl.util.JclStringUtil.explode(getChildren(), " ");
	}
	
}
