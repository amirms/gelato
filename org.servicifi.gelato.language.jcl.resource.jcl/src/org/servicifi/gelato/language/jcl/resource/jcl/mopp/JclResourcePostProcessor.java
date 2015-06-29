/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;


public class JclResourcePostProcessor implements org.servicifi.gelato.language.jcl.resource.jcl.IJclResourcePostProcessor {
	
	public void process(org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResource resource) {
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
