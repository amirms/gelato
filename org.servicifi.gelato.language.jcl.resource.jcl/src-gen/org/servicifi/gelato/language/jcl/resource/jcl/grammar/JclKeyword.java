/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;


/**
 * A class to represent a keyword in the grammar.
 */
public class JclKeyword extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement {
	
	private final String value;
	
	public JclKeyword(String value, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
