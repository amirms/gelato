package org.servicifi.gelato.transformation.core.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.servicifi.gelato.language.kernel.flows.Flow;
import org.servicifi.gelato.language.kernel.commons.LabellableElement;


public class TransitiveClosure {

	private int V;    
    private boolean[][] tc;
    private List<Flow> flows;
	
	public TransitiveClosure(List<Flow> flows){
		this.flows = flows;
	}
	
	
	private Map<LabellableElement, Integer> label2node = new HashMap<LabellableElement, Integer>();

	
	public void init(){
		
		Set<LabellableElement> labels = new HashSet<LabellableElement>();
		
		for (Flow flow : flows)
		{
			labels.add(flow.getFrom());
			labels.add(flow.getTo());
		}
		
		this.V = labels.size();
		tc = new boolean[V][V];
		
		int index = 0;
		
		for (LabellableElement le : labels) {
			label2node.put(le, index);
			index++;
			
		}
		
		
		for(Flow flow : flows) {
			
			tc[label2node.get(flow.getFrom())][label2node.get(flow.getTo())] = true;
			
		}
		
		
		
		
	}
	
	public void getTC()
    {
		
		
        for (int i = 0; i < V; i++) 
        {
            for (int j = 0; j < V; j++) 
            {
                if (tc[j][i]) 
                    for (int k = 0; k < V; k++) 
                        if (tc[j][i] && tc[i][k]) 
                            tc[j][k] = true;             
            }
        }
    }
	
	
	public List<LabellableElement> getReachableCode(LabellableElement start){
		
		List<LabellableElement> result = new ArrayList<LabellableElement>();
		
		int startIndex = label2node.get(start);
			
		
//		 indexIterator = indices.iterator();
		
		Iterator<LabellableElement> labelsIterator = label2node.keySet().iterator();
		
		
		while(labelsIterator.hasNext()){
			LabellableElement curElement = labelsIterator.next();
			int curNode = label2node.get(curElement);
			
			if (tc[startIndex][curNode])
				result.add(curElement);
			
			
		}
			
		return result;
	
	}
	
}
