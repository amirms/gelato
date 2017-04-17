package org.servicifi.gelato.transformation.core.statistics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class StatisticsCollector extends AbstractStatisticsCollector {
	
	private Map<String, Integer> operationCalls = new LinkedHashMap<String, Integer>();	
	private Map<EObject,List<EObject>> callMappings = new HashMap<EObject,List<EObject>>();

	
	@Override
	public void writeStatistic() {
		for (String operation : operationCalls.keySet()) {
			System.out.println("Statistics: Operation '" + operation + "' was called/matched(?) " + operationCalls.get(operation) + " times.");
		}
	}

	@Override
	public void init() {
		// not used
	}

	@Override
	public void registerOperationCall(String operationName) {
		if (!operationCalls.containsKey(operationName)) {
			operationCalls.put(operationName, 0);
		}
		int calls = operationCalls.get(operationName);
		operationCalls.put(operationName, calls + 1);
	}
	
	@Override
	public void registerCobolCall(EObject cobolCall, List<EObject> kernelStatements){
		callMappings.put(cobolCall, kernelStatements);
	}
	
	public List<EObject> getKernelStatements4CobolCall(EObject cobolCall){
		return callMappings.get(cobolCall);
	}
	
	public Map<EObject, List<EObject>> getAllKernelStatements4CobolCall(){
		return callMappings;
	}
	
	public Map<String, Integer> getOperationCalls() {
		return operationCalls;
	}
}