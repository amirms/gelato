/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.grammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class to represent boolean terminals in a grammar.
 */
public class CobolBooleanTerminal extends org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolTerminal {
	
	private String trueLiteral;
	private String falseLiteral;
	
	public CobolBooleanTerminal(EStructuralFeature attribute, String trueLiteral, String falseLiteral, org.servicifi.gelato.language.cobol.resource.cobol.grammar.CobolCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof EAttribute;
		this.trueLiteral = trueLiteral;
		this.falseLiteral = falseLiteral;
	}
	
	public String getTrueLiteral() {
		return trueLiteral;
	}
	
	public String getFalseLiteral() {
		return falseLiteral;
	}
	
	public EAttribute getAttribute() {
		return (EAttribute) getFeature();
	}
	
}
