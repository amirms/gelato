package org.servicifi.gelato.language.cobol.comment.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class CobolSourceOrCopybookFileCommentsResourceFactoryImpl implements Resource.Factory {

	public Resource createResource(URI uri){
		return new CobolSourceOrCopybookFileCommentsResource(uri);
	}


}
