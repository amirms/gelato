/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import org.eclipse.emf.ecore.EObject;

public class CobolHoverTextProvider implements org.servicifi.gelato.language.cobol.resource.cobol.ICobolHoverTextProvider {
	
	private org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolDefaultHoverTextProvider defaultProvider = new org.servicifi.gelato.language.cobol.resource.cobol.ui.CobolDefaultHoverTextProvider();
	
	public String getHoverText(EObject container, EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
