/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.mopp;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.servicifi.gelato.language.cobol.references.ElementReference;
import org.servicifi.gelato.language.cobol.references.ReferenceableElement;
import org.servicifi.gelato.language.cobol.util.CobolModelCompletion;
import org.servicifi.gelato.language.cobol.util.CobolModelRepairer;
import org.servicifi.gelato.language.cobol.resource.cobol.ICobolResourcePostProcessor;

public class CobolResourcePostProcessor implements ICobolResourcePostProcessor {
	
	public void process(CobolResource resource) {
		repairAndComplete(resource);
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
	protected void repairAndComplete(CobolResource resource) {
		CobolModelRepairer.repair(resource);

		CobolModelCompletion.complete(resource);
	}
	
}
