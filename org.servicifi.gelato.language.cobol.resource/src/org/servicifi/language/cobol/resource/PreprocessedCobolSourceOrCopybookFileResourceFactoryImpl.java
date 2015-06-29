package org.servicifi.language.cobol.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl implements Resource.Factory {

	public Resource createResource(URI uri){
		return new PreprocessedCobolSourceOrCopybookFileResource(uri);
	}
}