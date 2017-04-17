package org.servicifi.gelato.transformation.core.transformation;

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class QVTORegisteringUtil {

	public void registerQVTResourceFactory(ResourceSetImpl rs) {
		System.out.println("Regitering qvtotrace");
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
			    "qvtotrace", new XMIResourceFactoryImpl());
	}
	
}