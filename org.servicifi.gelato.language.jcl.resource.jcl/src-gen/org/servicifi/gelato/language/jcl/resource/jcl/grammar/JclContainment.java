/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.grammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class JclContainment extends org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclTerminal {
	
	private final EClass[] allowedTypes;
	
	public JclContainment(EStructuralFeature feature, org.servicifi.gelato.language.jcl.resource.jcl.grammar.JclCardinality cardinality, EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.servicifi.gelato.language.jcl.resource.jcl.util.JclStringUtil.explode(allowedTypes, ", ", new org.servicifi.gelato.language.jcl.resource.jcl.IJclFunction1<String, EClass>() {
				public String execute(EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
