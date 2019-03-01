package org.servicifi.gelato.analysis.framework.sdg;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.servicifi.gelato.analysis.framework.commons.LabellableElement;
import org.servicifi.gelato.language.kernel.procedures.Procedure;
import org.servicifi.gelato.language.kernel.procedures.MainProcedure;


public class Node implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1065685720063933008L;

	private String label;
	private NodeType type;
	private final transient Set<Node> in;
	private transient Set<Node> out;

	private boolean visited;
	private String fillColor;

	private LabellableElement le;

	private String def;

	private Set<String> usages;

	public Node(final String label, final NodeType type) {
		this.label = label;
		this.type = type;
		in = new HashSet<>();
		out = new HashSet<>();

		clearDefUses();
	}

	public Node(final String label, final NodeType nodeType, LabellableElement le) {
		this(label, nodeType);

		this.le = le;
	}
	
	public LabellableElement getLabellableElement() {
		return this.le;
	}

	public void setType(final NodeType type) {
		this.type = type;
	}

	public NodeType getType() {
		return type;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(final String label) {
		this.label = label;
	}
	
	public LabellableElement getContainer() {
		if (le == null) {
			return null;
		}
		
		EObject container = le.eContainer();
		while (container != null && (container instanceof Procedure &&  container instanceof MainProcedure)) {
			container = container.eContainer();
		}
		
		return (LabellableElement) container;
	}
	
	private String getContainerName() {
		LabellableElement container = getContainer();
		if (container instanceof MainProcedure) {
			return "main";
		} else if (container instanceof Procedure) {
			return ((Procedure) container).getName();
		}
		
		return "";
	}

	@Override
	public String toString() {
		String defuse = "";
		if (getDef() != null) {
			defuse = getDef() + ":";
		}
		
		if (!getUsages().isEmpty()) {
			for(String usage: getUsages())
			defuse +=  ";" + usage;
		}
		
		String result = label + "-" + type + "-" + getContainerName() + "-" +defuse;
		return result;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(final String fillColor) {
		this.fillColor = fillColor;
	}

	public String getDef() {
		return def;
	}

	public void setDef(final String assignedVariable) {
		def = assignedVariable;
	}

	public Set<String> getUsages() {
		return usages;
	}

	public void addUsage(final String usedVariable) {
		usages.add(usedVariable);
	}

	public void clearDefUses() {
		def = null;
		usages = new HashSet<>();
	}
}
