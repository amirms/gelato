package org.servicifi.gelato.language.cobol.preprocess.resource;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.servicifi.gelato.language.cobol.preprocess.PreprocessPackage;

public class PreprocessUtil {

	public static void initialize() {
		EPackage.Registry.INSTANCE.put(PreprocessPackage.eNS_URI, PreprocessPackage.eINSTANCE);
		Map<String, Object> extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
		extensionToFactoryMap.put("cob", new CobolSourceFileResourceFactoryImpl());
		extensionToFactoryMap.put("cobol", new CobolSourceFileResourceFactoryImpl());
		extensionToFactoryMap.put("cpy", new CobolSourceFileResourceFactoryImpl()); 
	}
}
