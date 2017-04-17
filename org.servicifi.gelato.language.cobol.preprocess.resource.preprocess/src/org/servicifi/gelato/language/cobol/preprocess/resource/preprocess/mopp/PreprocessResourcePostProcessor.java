/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp;

public class PreprocessResourcePostProcessor implements org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessResourcePostProcessor {
	
	public void process(org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.mopp.PreprocessResource resource) {
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
