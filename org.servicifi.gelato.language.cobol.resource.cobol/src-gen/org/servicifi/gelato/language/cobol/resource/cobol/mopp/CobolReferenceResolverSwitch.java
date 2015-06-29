/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class CobolReferenceResolverSwitch implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected org.servicifi.gelato.language.cobol.resource.cobol.analysis.ProcedureRangeChildTargetReferenceResolver procedureRangeChildTargetReferenceResolver = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.ProcedureRangeChildTargetReferenceResolver();
	protected org.servicifi.gelato.language.cobol.resource.cobol.analysis.ProcedureLabelSectionReferenceResolver procedureLabelSectionReferenceResolver = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.ProcedureLabelSectionReferenceResolver();
	protected org.servicifi.gelato.language.cobol.resource.cobol.analysis.ElementReferenceTargetReferenceResolver elementReferenceTargetReferenceResolver = new org.servicifi.gelato.language.cobol.resource.cobol.analysis.ElementReferenceTargetReferenceResolver();
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild, org.servicifi.gelato.language.cobol.labels.Procedure> getProcedureRangeChildTargetReferenceResolver() {
		return getResolverChain(org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureRangeChild_Target(), procedureRangeChildTargetReferenceResolver);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<org.servicifi.gelato.language.cobol.labels.ProcedureLabel, org.servicifi.gelato.language.cobol.sections.Section> getProcedureLabelSectionReferenceResolver() {
		return getResolverChain(org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureLabel_Section(), procedureLabelSectionReferenceResolver);
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<org.servicifi.gelato.language.cobol.references.ElementReference, org.servicifi.gelato.language.cobol.references.ReferenceableElement> getElementReferenceTargetReferenceResolver() {
		return getResolverChain(org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getElementReference_Target(), elementReferenceTargetReferenceResolver);
	}
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		procedureRangeChildTargetReferenceResolver.setOptions(options);
		procedureLabelSectionReferenceResolver.setOptions(options);
		elementReferenceTargetReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureRangeChild().isInstance(container)) {
			CobolFuzzyResolveResult<org.servicifi.gelato.language.cobol.labels.Procedure> frr = new CobolFuzzyResolveResult<org.servicifi.gelato.language.cobol.labels.Procedure>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("target")) {
				procedureRangeChildTargetReferenceResolver.resolve(identifier, (org.servicifi.gelato.language.cobol.labels.ProcedureRangeChild) container, (EReference) feature, position, true, frr);
			}
		}
		if (org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureLabel().isInstance(container)) {
			CobolFuzzyResolveResult<org.servicifi.gelato.language.cobol.sections.Section> frr = new CobolFuzzyResolveResult<org.servicifi.gelato.language.cobol.sections.Section>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("section")) {
				procedureLabelSectionReferenceResolver.resolve(identifier, (org.servicifi.gelato.language.cobol.labels.ProcedureLabel) container, (EReference) feature, position, true, frr);
			}
		}
		if (org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getElementReference().isInstance(container)) {
			CobolFuzzyResolveResult<org.servicifi.gelato.language.cobol.references.ReferenceableElement> frr = new CobolFuzzyResolveResult<org.servicifi.gelato.language.cobol.references.ReferenceableElement>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("target")) {
				elementReferenceTargetReferenceResolver.resolve(identifier, (org.servicifi.gelato.language.cobol.references.ElementReference) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureRangeChild_Target()) {
			return getResolverChain(reference, procedureRangeChildTargetReferenceResolver);
		}
		if (reference == org.servicifi.gelato.language.cobol.labels.LabelsPackage.eINSTANCE.getProcedureLabel_Section()) {
			return getResolverChain(reference, procedureLabelSectionReferenceResolver);
		}
		if (reference == org.servicifi.gelato.language.cobol.references.ReferencesPackage.eINSTANCE.getElementReference_Target()) {
			return getResolverChain(reference, elementReferenceTargetReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.servicifi.gelato.language.cobol.resource.cobol.ICobolOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new org.servicifi.gelato.language.cobol.resource.cobol.util.CobolRuntimeUtil().logWarning("Found value with invalid type for option " + org.servicifi.gelato.language.cobol.resource.cobol.ICobolOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver) {
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver replacingResolver = (org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.servicifi.gelato.language.cobol.resource.cobol.ICobolDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.servicifi.gelato.language.cobol.resource.cobol.ICobolDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceCache) {
					org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver nextResolver = (org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolver) next;
					if (nextResolver instanceof org.servicifi.gelato.language.cobol.resource.cobol.ICobolDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.servicifi.gelato.language.cobol.resource.cobol.ICobolDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.servicifi.gelato.language.cobol.resource.cobol.util.CobolRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.servicifi.gelato.language.cobol.resource.cobol.ICobolOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.servicifi.gelato.language.cobol.resource.cobol.ICobolDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.servicifi.gelato.language.cobol.resource.cobol.util.CobolRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.servicifi.gelato.language.cobol.resource.cobol.ICobolOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.servicifi.gelato.language.cobol.resource.cobol.ICobolDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
