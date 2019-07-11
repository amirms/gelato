/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import org.eclipse.emf.common.util.URI;

/**
 * <p>
 * A basic implementation of the
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelURIMapping
 * interface that can map identifiers to URIs.
 * </p>
 * 
 * @param <ReferenceType> unused type parameter which is needed to implement
 * org.servicifi.gelato.language.kernel.resource.kernel.IKernelURIMapping.
 */
public class KernelURIMapping<ReferenceType> implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelURIMapping<ReferenceType> {
	
	private URI uri;
	private String identifier;
	private String warning;
	
	public KernelURIMapping(String identifier, URI newIdentifier, String warning) {
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
