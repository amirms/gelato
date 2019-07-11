/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.resource.cobol.ui;

import org.eclipse.jface.text.source.IAnnotationModel;

/**
 * A provider for annotation models.
 */
public interface ICobolAnnotationModelProvider {
	
	/**
	 * Returns the annotation model.
	 */
	public IAnnotationModel getAnnotationModel();
	
}
