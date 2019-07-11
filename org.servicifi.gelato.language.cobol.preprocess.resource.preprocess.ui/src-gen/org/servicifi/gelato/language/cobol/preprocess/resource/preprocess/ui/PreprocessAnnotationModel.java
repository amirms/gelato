/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel;

public class PreprocessAnnotationModel extends ResourceMarkerAnnotationModel {
	
	public PreprocessAnnotationModel(IResource resource) {
		super(resource);
	}
	
	protected MarkerAnnotation createMarkerAnnotation(IMarker marker) {
		return new org.servicifi.gelato.language.cobol.preprocess.resource.preprocess.ui.PreprocessMarkerAnnotation(marker);
	}
	
}
