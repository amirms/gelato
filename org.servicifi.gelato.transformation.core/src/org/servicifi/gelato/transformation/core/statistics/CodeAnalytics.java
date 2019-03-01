package org.servicifi.gelato.transformation.core.statistics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.containers.CompilationUnit;
import org.servicifi.gelato.language.kernel.containers.KernelRoot;
import org.servicifi.gelato.analysis.framework.graphs.Flow;
import org.servicifi.gelato.analysis.framework.graphs.Node;
import org.servicifi.gelato.language.kernel.members.Member;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.resource.kernel.mopp.KernelResource;
import org.servicifi.gelato.language.kernel.statements.Block;
import org.servicifi.gelato.language.kernel.statements.Condition;
import org.servicifi.gelato.language.kernel.statements.ExceptionHandlerStatement;
import org.servicifi.gelato.language.kernel.statements.ExpressionStatement;
import org.servicifi.gelato.language.kernel.statements.ParallelBlock;
import org.servicifi.gelato.language.kernel.statements.Return;
import org.servicifi.gelato.language.kernel.statements.StatementWithException;
import org.servicifi.gelato.language.kernel.statements.WhileLoop;
import org.servicifi.gelato.transformation.core.resource.KernelSourceFileLoader;
import org.servicifi.gelato.transformation.core.util.TransitiveClosure;

public class CodeAnalytics {

	Set<Node> lelems = new HashSet<Node>();
	
	String filename;
	
	public CodeAnalytics(String filename){
		this.filename = filename;
	}
	
	
	public void getDeadCode1(){
		try{
			
			KernelSourceFileLoader loader = 
					new KernelSourceFileLoader(filename);

			KernelResource kernelRes = loader.getResource();
			 KernelRoot root = (KernelRoot) kernelRes.getContents().get(0);
			 
			 
			 EList<Procedure> memberProcedures = new BasicEList<Procedure>();
			 
			 
			 long totalReachable=0;
			    
			   if (root instanceof CompilationUnit) {
			    	CompilationUnit program = (CompilationUnit) root;
			    	
//			    	for(Member memb : program.getDeclarations())
//			    		if (memb instanceof Procedure)
//			    			memberProcedures.add((Procedure) memb);
			    	

			    	EList<Flow> cfg = program.internalFlow();
			    	
			    	TreeIterator<EObject> progIterator = program.eAllContents();
			    	
			    	while(progIterator.hasNext()){
			    		
			    		EObject progElement = progIterator.next();
			    		
			    		if (progElement instanceof LabellableElement){

			    			LabellableElement lElement = (LabellableElement) progElement;
			    			
//							System.out.println(lElement.getLabel());
			    			if ((lElement instanceof ExpressionStatement) || (lElement instanceof StatementWithException)
			    					|| (lElement instanceof Block) || (lElement instanceof Condition)
			    					|| (lElement instanceof Procedure) || (lElement instanceof ExceptionHandlerStatement)
			    					|| (lElement instanceof ParallelBlock) || (lElement instanceof WhileLoop)
			    					|| (lElement instanceof MainProcedure)
			    					|| ((lElement.eContainer() instanceof Return)))
			    				continue;
			    		
			    		    lelems.add(lElement);			    		    
			    			
			    		}

			    	}

			    	
			    	System.out.println("Number of Labellable Elements");
			    	System.out.println(lelems.size());
			    	
			    	totalReachable = lelems.size();
//			    	
//			    	Iterator<Flow> flowIterator = cfg.iterator();
			    	
			    	//debug code
//			    	Procedure secondProcedure = (Procedure)memberProcedures.get(1);
//			    	
//			    	while(flowIterator.hasNext()) {
//			    		Flow flow = flowIterator.next();
//			    		
//			    		lelems.remove(flow.getFrom());
//			    		lelems.remove(flow.getTo());
//			    		
//			    		if (flow.getTo().equals(secondProcedure.first()))
//			    		{
//			    			System.out.println("SOMETHING WRONG");
//			    			System.out.println(flow.getFrom());
//			    			System.out.println(flow.getTo());
//			    			
//			    			return;
//			    		}
//			    		
////			    		
//			    	}
//			    	System.out.println("No of elements without a flow");
//			    	System.out.println(lelems.size());
			    	
			    	
			    	TransitiveClosure cfgtc = new TransitiveClosure(cfg);
			    	//FIXME move this code TransitiveClosure class
			    	cfgtc.init();
			    	cfgtc.getTC();
			    	List<Node> reached = cfgtc.getReachableCode(program.getStart());
			    	
			    	System.out.println("All flows");
			    	System.out.println(cfg.size());
			    	
			    	System.out.println("Reached Nodes");
			    	System.out.println(reached.size());
			    	
			    	Iterator<Node> reachedIterator = reached.iterator();
			    	while(reachedIterator.hasNext()){
//			    		
			    		lelems.remove(reachedIterator.next());
			    	}
			    	
//			    	System.out.println("Unused code");
//			    	Iterator<LabellableElement> lelemsIterator = lelems.iterator();
//			    	while(lelemsIterator.hasNext()){
////			    		
//			    		System.out.println(lelemsIterator.next());
//			    	}
			    	
			    	System.out.println("Total nodes: " + totalReachable);
			    	System.out.println("Unused nodes: " + lelems.size());
			    	
			    	
			    }

			}catch(IOException e){
			    	e.printStackTrace();
			    	
			}
		
		
		
	}
	
	
	public void getDeadCode(){
		try{
			
			KernelSourceFileLoader loader = 
					new KernelSourceFileLoader(filename);

			KernelResource kernelRes = loader.getResource();
			KernelRoot root = (KernelRoot) kernelRes.getContents().get(0);
			 
			 
			long totalReachable=0;
			long totalStatements = 0;
			    
			if (root instanceof CompilationUnit) {
				CompilationUnit program = (CompilationUnit) root;
				
				
				TreeIterator<EObject> progIterator = program.eAllContents();
		    	
		    	while(progIterator.hasNext()){
		    		
		    		EObject progElement = progIterator.next();
		    		
		    		if (progElement instanceof LabellableElement){

		    			LabellableElement lElement = (LabellableElement) progElement;
		    			
//						System.out.println(lElement.getLabel());
		    			if ((lElement instanceof ExpressionStatement) || (lElement instanceof StatementWithException)
		    					|| (lElement instanceof Block) || (lElement instanceof Condition)
		    					|| (lElement instanceof Procedure) || (lElement instanceof ExceptionHandlerStatement)
		    					|| (lElement instanceof ParallelBlock) || (lElement instanceof WhileLoop)
		    					|| (lElement instanceof MainProcedure)
		    					|| ((lElement.eContainer() instanceof Return)))
		    				continue;
		    		
		    		    lelems.add(lElement);			    		    
		    			
		    		}

		    	}

		    	
		    	System.out.println("Number of Labellable Elements");
		    	System.out.println(lelems.size());
		    	
		    	totalStatements = lelems.size();
			    	
			   	for(Member memb : program.getDeclarations())
			   		if (memb instanceof Procedure){
			    			
			    		Procedure proc = (Procedure) memb;

				    	EList<Flow> cfg = proc.internalFlow();
				    	
				    	TransitiveClosure cfgtc = new TransitiveClosure(cfg);
				    	//FIXME move this code TransitiveClosure class
				    	cfgtc.init();
				    	cfgtc.getTC();
				    	List<Node> reached = cfgtc.getReachableCode(proc.getStart());
				    	
				    	System.out.println("All flows in procedure: " + proc.getName());
				    	System.out.println(cfg.size());
				    	
				    	System.out.println("Reached nodes in procedure: " + proc.getName());
				    	System.out.println(reached.size());
				    	
				    	Iterator<Node> reachedIterator = reached.iterator();
				    	while(reachedIterator.hasNext()){
	//			    		
				    		lelems.remove(reachedIterator.next());
				    	}
			
			    	}
			    	
			    	
			    }
			
			System.out.println("Total Statements: " + totalStatements);
			System.out.println("Unreachable Statements: " + lelems.size());
			

			}catch(IOException e){
			    	e.printStackTrace();
			    	
			}
		
		
		
	}

	
}
