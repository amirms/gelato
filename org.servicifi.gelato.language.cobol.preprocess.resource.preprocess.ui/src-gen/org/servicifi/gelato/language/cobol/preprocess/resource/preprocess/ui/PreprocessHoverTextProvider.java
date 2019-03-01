/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

public class PreprocessHoverTextProvider implements org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.IPreprocessHoverTextProvider {
	
	private org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessDefaultHoverTextProvider defaultProvider = new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessDefaultHoverTextProvider();
	
	public String getHoverText(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject referencedObject) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(referencedObject);
	}
	
	public String getHoverText(org.eclipse.emf.ecore.EObject object) {
		// Set option overrideHoverTextProvider to false and customize this method to
		// obtain custom hover texts.
		return defaultProvider.getHoverText(object);
	}
	
}
