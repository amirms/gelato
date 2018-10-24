/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class KernelExpectedBooleanTerminal extends org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelAbstractExpectedElement {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal booleanTerminal;
	
	public KernelExpectedBooleanTerminal(org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	/**
	 * Returns the expected boolean terminal.
	 */
	public org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelSyntaxElement getSymtaxElement() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof KernelExpectedBooleanTerminal) {
			return getFeature().equals(((KernelExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
