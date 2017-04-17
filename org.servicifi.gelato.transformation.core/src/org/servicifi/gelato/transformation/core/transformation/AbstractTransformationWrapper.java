package org.servicifi.gelato.transformation.core.transformation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResourceFactory;
import org.servicifi.gelato.transformation.core.statistics.AbstractStatisticsCollector;
import org.servicifi.gelato.transformation.core.util.MetamodelUtil;
import org.servicifi.language.cobol.resource.PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl;

public abstract class AbstractTransformationWrapper {
	private static Class<?> statisticUtilClass;
	private AbstractStatisticsCollector statisticUtil;
	
	private EPackage.Registry registry;
	private ResourceSetImpl resourceSet;
	private Collection<EPackage> metaPackages;
	
	private boolean handledInterestingRules = false;
	
	public AbstractTransformationWrapper(AbstractStatisticsCollector statisticUtil) {
		this.statisticUtil = statisticUtil;
	}
	
	public void init() {
		// initialize resource set of models
		registerResourceFactories();
		
		// add meta models to registry
		registry = EPackage.Registry.INSTANCE;
		
		metaPackages = new ArrayList<EPackage>();
		
		System.out.println(MetamodelUtil.collectMetaModels().size());
		
		for (EPackage ePackage : MetamodelUtil.collectMetaModels()) {
			registry.put(ePackage.getNsURI(), ePackage);
			
			System.out.println(ePackage.getNsURI());
			
			metaPackages.add(ePackage);
		}
	}

	protected void registerResourceFactories() {
		Map<String, Object> extensionToFactoryMap = getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap();
		
		extensionToFactoryMap.put("cob", 
				new PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl());
		
		extensionToFactoryMap.put("cobol", 
				new PreprocessedCobolSourceOrCopybookFileResourceFactoryImpl());
		
		extensionToFactoryMap.put("kernel", 
				new KernelResourceFactory());
		
//		extensionToFactoryMap.put("cpy", 
//				new CobolSourceOrCopybookFileCommentsResourceFactoryImpl()); 
		
		extensionToFactoryMap.put(
				"xmi", new UnmodifiableXMIResourceFactoryImpl());
		
		extensionToFactoryMap.put(
				"qvto", new UnmodifiableXMIResourceFactoryImpl());
	}
	
//	public void callMethod(List<String> methodNames, int value) {
//		
//		Method method = null;
//		
//		for (String methodName : methodNames) {
//			try {
//				method = statisticUtilClass.getMethod(methodName, int.class);
//				method.invoke(statisticUtil,value);
//			} catch (Exception e) {}
//		}
//	}
	
	public abstract void launch(File file) throws Exception;
	
	public abstract void launch(List<File> inputFiles) throws Exception;
	
	public abstract void addStatistics(Object object);
	
	public void run(List<File> files) throws Exception {
		for (File file : files) {
			launch(file);
		}
	}
	
	public boolean isHandledInterestingRules() {
		return handledInterestingRules;
	}

	public void setHandledInterestingRules(boolean handledInterestingRules) {
		this.handledInterestingRules = handledInterestingRules;
	}

	public AbstractStatisticsCollector getStatisticsCollector() {
		return statisticUtil;
	}

	public ResourceSetImpl getResourceSet() {
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
		}
		return resourceSet;
	}
	
	public EPackage.Registry getRegistry() {
		return registry;
	}

	public Collection<EPackage> getMetaPackages() {
		return metaPackages;
	}


}
