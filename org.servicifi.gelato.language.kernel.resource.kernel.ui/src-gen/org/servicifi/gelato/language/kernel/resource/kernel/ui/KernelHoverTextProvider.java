/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.kernel.resource.kernel.ui;

import org.eclipse.emf.ecore.EObject;

public class KernelHoverTextProvider implements org.servicifi.gelato.language.kernel.resource.kernel.IKernelHoverTextProvider {
	
	private org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelDefaultHoverTextProvider defaultProvider = new org.servicifi.gelato.language.kernel.resource.kernel.ui.KernelDefaultHoverTextProvider();
	
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
