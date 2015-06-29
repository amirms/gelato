/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.ArrayList;
import java.util.List;

public class JclSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private JclSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private List<Integer> indicesToPrint = new ArrayList<Integer>();
	
	public JclSyntaxElementDecorator(org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement decoratedElement, JclSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public JclSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
