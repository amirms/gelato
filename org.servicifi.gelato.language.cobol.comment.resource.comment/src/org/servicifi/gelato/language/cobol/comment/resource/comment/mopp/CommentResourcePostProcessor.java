/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.comment.resource.comment.mopp;

public class CommentResourcePostProcessor implements org.servicifi.gelato.language.cobol.comment.resource.comment.ICommentResourcePostProcessor {
	
	public void process(org.servicifi.gelato.language.cobol.comment.resource.comment.mopp.CommentResource resource) {
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
