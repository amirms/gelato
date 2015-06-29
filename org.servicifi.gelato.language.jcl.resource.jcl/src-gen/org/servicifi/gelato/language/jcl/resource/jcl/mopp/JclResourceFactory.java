/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class JclResourceFactory implements Resource.Factory {
	
	public JclResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource(uri);
	}
	
}
