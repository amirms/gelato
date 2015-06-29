/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.mopp;


public class KernelResourcePostProcessor implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelResourcePostProcessor {
	
	public void process(org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
