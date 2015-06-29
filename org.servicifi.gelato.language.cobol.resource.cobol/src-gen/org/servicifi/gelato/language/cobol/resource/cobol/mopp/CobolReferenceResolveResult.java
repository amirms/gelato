/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult
 * interface that collects mappings in a list.
 * </p>
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class CobolReferenceResolveResult<ReferenceType> implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<ReferenceType> {
	
	private Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private Set<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> quickFixes;
	
	public CobolReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix>();
		}
		return Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new LinkedHashSet<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		if (mappings == null) {
			mappings = new ArrayList<org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
