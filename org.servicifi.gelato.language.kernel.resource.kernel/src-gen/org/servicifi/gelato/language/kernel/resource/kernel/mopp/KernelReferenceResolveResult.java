/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResu
 * lt interface that collects mappings in a list.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class KernelReferenceResolveResult<ReferenceType> implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceResolveResult<ReferenceType> {
	
	private Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private Set<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> quickFixes;
	
	public KernelReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix>();
		}
		return Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.servicifi.gelato.language.kernel.resource.kernel.IKernelQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public Collection<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<org.servicifi.gelato.language.kernel.resource.kernel.IKernelReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
