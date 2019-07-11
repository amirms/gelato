/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.grammar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class KernelContainment extends org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelTerminal {
	
	private final EClass[] allowedTypes;
	
	public KernelContainment(EStructuralFeature feature, org.servicifi.gelato.language.kernel.resource.kernel.grammar.KernelCardinality cardinality, EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	@Override
	public boolean hasContainment(EClass metaclass) {
		for (EClass allowedType : allowedTypes) {
			if (allowedType == metaclass) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.servicifi.gelato.language.kernel.resource.kernel.util.KernelStringUtil.explode(allowedTypes, ", ", new org.servicifi.gelato.language.kernel.resource.kernel.IKernelFunction1<String, EClass>() {
				public String execute(EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
