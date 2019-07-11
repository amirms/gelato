/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.ArrayList;
import java.util.List;

public class KernelSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private KernelSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private List<Integer> indicesToPrint = new ArrayList<Integer>();
	
	public KernelSyntaxElementDecorator(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement decoratedElement, KernelSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public KernelSyntaxElementDecorator[] getChildDecorators() {
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
