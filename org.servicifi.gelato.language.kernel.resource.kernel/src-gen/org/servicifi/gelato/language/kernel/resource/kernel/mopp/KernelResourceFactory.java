/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class KernelResourceFactory implements Resource.Factory {
	
	public KernelResourceFactory() {
		super();
	}
	
	public Resource createResource(URI uri) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource(uri);
	}
	
}
