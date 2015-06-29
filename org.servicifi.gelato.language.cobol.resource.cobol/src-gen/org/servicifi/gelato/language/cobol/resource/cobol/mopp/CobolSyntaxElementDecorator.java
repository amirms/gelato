/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.ArrayList;
import java.util.List;

public class CobolSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private CobolSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private List<Integer> indicesToPrint = new ArrayList<Integer>();
	
	public CobolSyntaxElementDecorator(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement decoratedElement, CobolSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public CobolSyntaxElementDecorator[] getChildDecorators() {
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
