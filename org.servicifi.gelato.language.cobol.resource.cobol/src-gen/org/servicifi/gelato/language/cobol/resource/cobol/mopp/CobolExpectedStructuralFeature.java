/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.Collections;
import java.util.Set;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class CobolExpectedStructuralFeature extends org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolAbstractExpectedElement {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder placeholder;
	
	public CobolExpectedStructuralFeature(org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolSyntaxElement getSyntaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public Set<String> getTokenNames() {
		return Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof CobolExpectedStructuralFeature) {
			return getFeature().equals(((CobolExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
