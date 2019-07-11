/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import org.eclipse.emf.ecore.EObject;

public class PreprocessHoverTextProvider implements org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessHoverTextProvider {
	
	private org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessDefaultHoverTextProvider defaultProvider = new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessDefaultHoverTextProvider();
	
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
