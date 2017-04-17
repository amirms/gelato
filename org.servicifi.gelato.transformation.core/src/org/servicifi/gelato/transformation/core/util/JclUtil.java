package org.servicifi.gelato.transformation.core.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.servicifi.gelato.language.jcl.resource.jcl.mopp.JclResourceFactory;
import org.servicifi.gelato.language.jcl.JclPackage;

public class JclUtil {

	public static void initialize() {
		EPackage.Registry.INSTANCE.put(JclPackage.eNS_URI, JclPackage.eINSTANCE);
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionToFactoryMap.put("jcl", new JclResourceFactory()); 
	}
	
}
