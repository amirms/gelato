package org.servicifi.gelato.transformation.core.transformation;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class UnmodifiableXMIResource extends XMIResourceImpl {

	public UnmodifiableXMIResource(URI uri) {
		super(uri);
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		// do nothing
	}
}