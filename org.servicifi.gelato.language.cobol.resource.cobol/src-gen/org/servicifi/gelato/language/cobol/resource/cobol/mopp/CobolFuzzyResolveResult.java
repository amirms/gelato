/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import java.util.Collection;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * <p>
 * A FuzzyResolveResult is an implementation of the ICobolReferenceResolveResult
 * interface that delegates all method calls to a given
 * ICobolReferenceResolveResult with ReferenceType EObject. It is used by
 * reference resolver switches to collect results from different reference
 * resolvers in a type safe manner.
 * </p>
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class CobolFuzzyResolveResult<ReferenceType extends EObject> implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<ReferenceType> {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<EObject> delegate;
	
	public CobolFuzzyResolveResult(org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceResolveResult<EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (EObject) target);
	}
	
	public void addMapping(String identifier, URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (EObject) target, warning);
	}
	
	public void addMapping(String identifier, URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public Collection<org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(org.servicifi.gelato.language.cobol.resource.cobol.ICobolQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
