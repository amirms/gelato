package org.servicifi.gelato.language.cobol.preprocess.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public class CobolSourceFileResourceFactoryImpl  implements Resource.Factory {

	public Resource createResource(URI uri){
		return new CobolSourceFileResource(uri);
	}
}
