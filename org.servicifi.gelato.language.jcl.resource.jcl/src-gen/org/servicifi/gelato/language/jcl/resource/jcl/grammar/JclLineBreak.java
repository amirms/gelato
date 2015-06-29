/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;


public class JclLineBreak extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclFormattingElement {
	
	private final int tabs;
	
	public JclLineBreak(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
