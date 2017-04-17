package org.servicifi.gelato.transformation.core.transformation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class UnmodifiableXMIResourceFactoryImpl extends XMIResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new UnmodifiableXMIResource(uri);
	}
}
