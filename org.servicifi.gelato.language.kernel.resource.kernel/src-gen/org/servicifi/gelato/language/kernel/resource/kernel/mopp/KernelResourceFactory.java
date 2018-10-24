/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;

public class KernelResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public KernelResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource(uri);
	}
	
}
