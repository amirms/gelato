package org.servicifi.gelato.transformation.core;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;
import java.util.stream.Collectors;

import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.SDG;
import org.servicifi.gelato.analysis.framework.sdg.slicer.SDGSlicer;
import org.servicifi.gelato.analysis.framework.sdg.util.GraphExporter;
import org.servicifi.gelato.transformation.core.resource.KernelSourceFileLoader;

public class Slicer {
	public static void main(final String[] args) throws Exception {
		File currentDirFile = new File("input\\new_file3.kernel");
		String filename = currentDirFile.getAbsolutePath();
		
		KernelSourceFileLoader loader = new KernelSourceFileLoader(filename);

		try {
			SDG sdg = loader.parse();
			
			final Node v = sdg.vertexSet().stream().filter(u -> u.toDefUse().contains("var6"))
			        .findFirst().get();

			    System.out.println(v);

			    final Set<Node> S =
			        sdg.outgoingEdgesOf(v).stream().map(e -> e.getTarget()).collect(Collectors.toSet());
			    S.add(v);	
			    
			    S.forEach(vertex -> System.out.println("slicing criterion vertex: "+ vertex));

			    final Set<Node> slice = SDGSlicer.backward(sdg, S);
			    for (final Node w : slice) {
			      w.setFillColor("yellow");
			    }
			    GraphExporter.exportAsDot(sdg, "/Users/asa/Desktop", "graph");
			    System.out.println(slice);
		}catch(Exception e) {
			e.printStackTrace();
		}


	  }
}
