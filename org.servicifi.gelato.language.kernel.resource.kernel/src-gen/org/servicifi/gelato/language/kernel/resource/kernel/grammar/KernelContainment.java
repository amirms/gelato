/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

public class KernelContainment extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public KernelContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.explode(allowedTypes, ", ", new org.servicifi.gelato.language.kernel.resource.kernel.IKernelFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
