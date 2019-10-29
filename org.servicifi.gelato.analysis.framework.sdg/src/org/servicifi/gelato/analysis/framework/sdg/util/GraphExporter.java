/**
 * inspired by https://github.com/victorjmarin/sourcedg
 */

package org.servicifi.gelato.analysis.framework.sdg.util;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.io.Attribute;
import org.jgrapht.io.AttributeType;
import org.jgrapht.io.ComponentAttributeProvider;
import org.jgrapht.io.ComponentNameProvider;
import org.jgrapht.io.DOTExporter;
import org.jgrapht.io.DefaultAttribute;
import org.jgrapht.io.ExportException;
import org.jgrapht.io.IntegerComponentNameProvider;

import org.servicifi.gelato.analysis.framework.sdg.Edge;
import org.servicifi.gelato.analysis.framework.sdg.Node;
import org.servicifi.gelato.analysis.framework.sdg.NodeType;
import org.servicifi.gelato.analysis.framework.sdg.SDG;

public class GraphExporter {

	private static final ComponentNameProvider<Node> NodeLabelProvider = new ComponentNameProvider<Node>() {
		@Override
		public String getName(final Node component) {
			String result = component.toString() + "\n";
//			final Set<String> subtypes = component.getSubtypes();
//			// if (!subtypes.isEmpty())
//			// result += subtypes + "\n";
//			result += component.getLabel().replaceAll("\"", "'");
			return result;
		}
	};

	private static final ComponentNameProvider<Edge> edgeLabelProvider = new ComponentNameProvider<Edge>() {
		@Override
		public String getName(final Edge component) {
			return component.toString().replaceAll("\"", "'").toLowerCase();
		}
	};

	private static final ComponentAttributeProvider<Node> NodeAttrProvider = new ComponentAttributeProvider<Node>() {

		@Override
		public Map<String, Attribute> getComponentAttributes(final Node component) {
			final Map<String, Attribute> result = new HashMap<>();

			final String fillColor = component.getFillColor();
			if (fillColor != null) {
				final Attribute fillColorAttr = DefaultAttribute.createAttribute(fillColor);
				result.put("style", DefaultAttribute.createAttribute("filled"));
				result.put("fillcolor", fillColorAttr);
			}
			result.put("fontname", DefaultAttribute.createAttribute("helvetica"));
			result.put("fontsize", DefaultAttribute.createAttribute(20));

			result.put("shape", DefaultAttribute.createAttribute("oval"));
			
			result.put("label", new DefaultAttribute(component.toString(), AttributeType.HTML));
			
			if (component.getType() != null) {
				switch (component.getType()) {
				case ACTUAL_IN: 
				case FORMAL_IN:
				result.put("style", DefaultAttribute.createAttribute("dashed"));
					break;
				case ACTUAL_OUT:
				case FORMAL_OUT:
				result.put("style", DefaultAttribute.createAttribute("dotted"));
					break;
				case ENTRY:
					result.put("style", DefaultAttribute.createAttribute("bold"));
					break;
				}
			}
			return result;
		}
	};

	private static final ComponentAttributeProvider<Edge> edgeAttrProvider = new ComponentAttributeProvider<Edge>() {

		@Override
		public Map<String, Attribute> getComponentAttributes(final Edge component) {
			final Map<String, Attribute> result = new HashMap<>();
						
			if (component.getType() != null) {
				switch (component.getType()) {
				case CTRL_TRUE:
					result.put("splines", DefaultAttribute.createAttribute(true));
					break;
				case DATA:
					result.put("style", DefaultAttribute.createAttribute("dashed"));
					break;
				case CALL:
				case PARAM_IN:
				case PARAM_OUT:
					result.put("style", DefaultAttribute.createAttribute("dotted"));
					result.put("constraint", DefaultAttribute.createAttribute(false));
					break;
				default:
					break;
				}
			}
			return result;
		}
	};

	private static final DOTExporter<Node, Edge> exporter = new DOTExporter<>(new IntegerComponentNameProvider<>(),
			null, null, NodeAttrProvider, edgeAttrProvider);

	public static void exportAsDot(final Graph<Node, Edge> graph, final String path, final String fileName) {
		try {
			final String filePath = path + "/" + fileName + ".dot";
			final File dotFile = new File(filePath);

			System.out.println("outfile for dot " + dotFile);

//		    graph [pad="0.5", nodesep="1", ranksep="2"];

			exporter.putGraphAttribute("nodesep", "0.1");
			exporter.putGraphAttribute("ranksep", "2");
			exporter.putGraphAttribute("pad", "0.25");
			exporter.putGraphAttribute("overlap", "false");
			
			exporter.exportGraph(graph, dotFile);

			final Graphviz gv = new Graphviz();
			gv.readSource(filePath);

			final String type = "png";
			final String repesentationType = "dot";
			final File out = new File(path + "/" + fileName + "." + type);

			System.out.println("outfile for png " + out);
			gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type, repesentationType), out);

//			dotFile.delete();
		} catch (final ExportException e) {
			e.printStackTrace();
		}
	}

	public static void exportDefaultAsDot(final Graph<Node, DefaultEdge> graph, final String path,
			final String fileName) {
		try {
			final DOTExporter<Node, DefaultEdge> exporter = new DOTExporter<>(new IntegerComponentNameProvider<>(),
					null, null, NodeAttrProvider, null);
			final String filePath = path + "/" + fileName + ".dot";
			final File dotFile = new File(filePath);
			exporter.exportGraph(graph, dotFile);

			final Graphviz gv = new Graphviz();
			gv.readSource(filePath);

			final String type = "png";
			final String repesentationType = "dot";
			final File out = new File(path + "/" + fileName + "." + type);
			gv.writeGraphToFile(gv.getGraph(gv.getDotSource(), type, repesentationType), out);

			// dotFile.delete();
		} catch (final ExportException e) {
			e.printStackTrace();
		}
	}

}