package org.servicifi.gelato.transformation.core.statistics;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractStatisticsCollector {
	
	//loading : 0, transformation : 1, analysis : 2
	private long[] startTime = new long[3];
	private long[] endTime = new long[3];
	
	private long[] startMemory = new long[3];
	private long[] endMemory = new long[3];

	String[] types = new String[] {
			"loading", "transformation", "analysis"
		};
	
	Runtime runtime = Runtime.getRuntime();
	
	
	private Map<String,List<String>> ruleNames = new HashMap<String,List<String>>();

	
	public AbstractStatisticsCollector() {
		init();
	}

	public void setStartTime(long time, int type) {
		startTime[type] = time;
	}
	
	public void setEndTime(long time, int type) {
		endTime[type] = time;
//		long seconds = (endTime - startTime) / 1000;
//		System.out.println("Total transformation time: " + seconds + " second(s).");
	}
	
	
	public void printTime()
	{

		
		for (int i = 0; i < 3; i++){
			
			long seconds = (endTime[i] - startTime[i]) / 1000;
			System.out.println("Total " + types[i] + " time: " + seconds + " second(s).");
		}
//		
		
	}
	
	
	public void setStartMemory(long mem, int type) {
		startMemory[type] = mem;
	}
	
	public void setEndMemory(long mem, int type) {
		endMemory[type] = mem;
//		long seconds = (endTime - startTime) / 1000;
//		System.out.println("Total transformation time: " + seconds + " second(s).");
	}
	
	
	public void printMemory()
	{

		
		for (int i = 0; i < 3; i++){
			
			long mem = (endMemory[i] - startMemory[i]) / 1024;
			long start = startMemory[i] / 1024;
			long end = endMemory[i] / 1024;
			System.out.println("Allocated memory on heap at the beginning: " + start + " and at the end: " + end + " with total for " + types[i] + ": " + mem + " KByte(s).");
		}

	}
	
	
	public Map<String, List<String>> getRuleNames() {
		return ruleNames;
	}

	public abstract void writeStatistic();
	
	public abstract void init();

	public abstract void registerOperationCall(String operatioName);


	public abstract void registerCobolCall(EObject cobolCall, List<EObject> kernelStatements);
}
