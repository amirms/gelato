package org.servicifi.gelato.transformation.core.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.servicifi.gelato.language.kernel.KernelPackage;
import org.servicifi.gelato.language.kernel.impl.KernelFactoryImpl;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResourceFactory;

public class KernelUtil {

	public static void initialize() {
		EPackage.Registry.INSTANCE.put(KernelPackage.eNS_URI, KernelPackage.eINSTANCE);
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionToFactoryMap.put("kernel", new KernelResourceFactory()); 
	}
}