/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.ui;

import org.eclipse.emf.ecore.EObject;

public class JclHoverTextProvider implements org.servicifi.gelato.language.jcl.resource.jcl.IJclHoverTextProvider {
	
	private org.servicifi.gelato.language.jcl.resource.jcl.ui.JclDefaultHoverTextProvider defaultProvider = new org.servicifi.gelato.language.jcl.resource.jcl.ui.JclDefaultHoverTextProvider();
	
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
