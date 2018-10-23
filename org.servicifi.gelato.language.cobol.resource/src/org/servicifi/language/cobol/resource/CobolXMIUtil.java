package org.servicifi.language.cobol.resource;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class CobolXMIUtil {

	public static void initialize() {

		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionToFactoryMap.put("cobxmi", new XMIResourceFactoryImpl());
	}
}
