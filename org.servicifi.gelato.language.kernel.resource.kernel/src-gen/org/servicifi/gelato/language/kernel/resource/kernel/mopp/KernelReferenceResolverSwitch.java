/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class KernelReferenceResolverSwitch implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private Map<Object, Object> options;
	
	protected org.servicifi.gelato.language.kernel.resource.kernel.analysis.JumpTargetReferenceResolver jumpTargetReferenceResolver = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.JumpTargetReferenceResolver();
	protected org.servicifi.gelato.language.kernel.resource.kernel.analysis.ElementReferenceTargetReferenceResolver elementReferenceTargetReferenceResolver = new org.servicifi.gelato.language.kernel.resource.kernel.analysis.ElementReferenceTargetReferenceResolver();
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<org.servicifi.gelato.language.kernel.statements.Jump, org.servicifi.gelato.analysis.framework.commons.LabellableElement> getJumpTargetReferenceResolver() {
		return getResolverChain(org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getJump_Target(), jumpTargetReferenceResolver);
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<org.servicifi.gelato.language.kernel.references.ElementReference, org.servicifi.gelato.language.kernel.references.ReferenceableElement> getElementReferenceTargetReferenceResolver() {
		return getResolverChain(org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getElementReference_Target(), elementReferenceTargetReferenceResolver);
	}
	
	public void setOptions(Map<?, ?> options) {
		if (options != null) {
			this.options = new LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		jumpTargetReferenceResolver.setOptions(options);
		elementReferenceTargetReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, EObject container, EReference reference, int position, org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResult<EObject> result) {
		if (container == null) {
			return;
		}
		if (org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getJump().isInstance(container)) {
			KernelFuzzyResolveResult<org.servicifi.gelato.analysis.framework.commons.LabellableElement> frr = new KernelFuzzyResolveResult<org.servicifi.gelato.analysis.framework.commons.LabellableElement>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("target")) {
				jumpTargetReferenceResolver.resolve(identifier, (org.servicifi.gelato.language.kernel.statements.Jump) container, (EReference) feature, position, true, frr);
			}
		}
		if (org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getElementReference().isInstance(container)) {
			KernelFuzzyResolveResult<org.servicifi.gelato.language.kernel.references.ReferenceableElement> frr = new KernelFuzzyResolveResult<org.servicifi.gelato.language.kernel.references.ReferenceableElement>(result);
			String referenceName = reference.getName();
			EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof EReference && referenceName != null && referenceName.equals("target")) {
				elementReferenceTargetReferenceResolver.resolve(identifier, (org.servicifi.gelato.language.kernel.references.ElementReference) container, (EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<? extends EObject, ? extends EObject> getResolver(EStructuralFeature reference) {
		if (reference == org.servicifi.gelato.language.kernel.statements.StatementsPackage.eINSTANCE.getJump_Target()) {
			return getResolverChain(reference, jumpTargetReferenceResolver);
		}
		if (reference == org.servicifi.gelato.language.kernel.references.ReferencesPackage.eINSTANCE.getElementReference_Target()) {
			return getResolverChain(reference, elementReferenceTargetReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})
	public <ContainerType extends EObject, ReferenceType extends EObject> org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> getResolverChain(EStructuralFeature reference, org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof Map)) {
			// send this to the error log
			new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelRuntimeUtil().logWarning("Found value with invalid type for option " + org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		Map<?,?> resolverMap = (Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver) {
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver replacingResolver = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.servicifi.gelato.language.kernel.resource.kernel.IKernelDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof Collection) {
			Collection replacingResolvers = (Collection) resolverValue;
			org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceCache) {
					org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver nextResolver = (org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolver) next;
					if (nextResolver instanceof org.servicifi.gelato.language.kernel.resource.kernel.IKernelDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.servicifi.gelato.language.kernel.resource.kernel.IKernelDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.servicifi.gelato.language.kernel.resource.kernel.IKernelDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.servicifi.gelato.language.kernel.resource.kernel.util.KernelRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.servicifi.gelato.language.kernel.resource.kernel.IKernelOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.servicifi.gelato.language.kernel.resource.kernel.IKernelDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
