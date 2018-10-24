/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

/**
 * A basic implementation of the
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResu
 * lt interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class KernelReferenceResolveResult<ReferenceType> implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> quickFixes;
	
	public KernelReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
