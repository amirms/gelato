/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.servicifi.gelato.language.cobol.resource.cobol.ICobolURIMapping interface
 * that can map identifiers to URIs.
 * </p>
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.servicifi.gelato.language.cobol.resource.cobol.ICobolURIMapping.
 */
public class CobolURIMapping<ReferenceType> implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolURIMapping<ReferenceType> {
	
	private URI uri;
	private String identifier;
	private String warning;
	
	public CobolURIMapping(String identifier, URI newIdentifier, String warning) {
		super();
		this.uri = newIdentifier;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public URI getTargetIdentifier() {
		return uri;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
