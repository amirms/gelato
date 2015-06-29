/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class CobolResourceFactory implements Resource.Factory {
	
	public CobolResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new org.servicifi.gelato.language.cobol.resource.cobol.mopp.CobolResource(uri);
	}
	
}
