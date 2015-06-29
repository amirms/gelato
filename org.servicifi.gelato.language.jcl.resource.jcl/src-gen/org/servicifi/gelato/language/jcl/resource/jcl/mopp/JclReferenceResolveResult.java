/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolveResult
 * interface that collects mappings in a list.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class JclReferenceResolveResult<ReferenceType> implements org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceResolveResult<ReferenceType> {
	
	private Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private Set<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> quickFixes;
	
	public JclReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix>();
		}
		return Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.servicifi.gelato.language.jcl.resource.jcl.IJclQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public Collection<org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<org.servicifi.gelato.language.jcl.resource.jcl.IJclReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
