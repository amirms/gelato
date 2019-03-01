package org.servicifi.gelato.analysis.framework.sdg;

import java.io.Serializable;

public class Edge implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 478647389184916300L;
	private Node source;
	private Node target;
	private EdgeType type;

	public Edge(final Node source, final Node target) {
		this.source = source;
		this.target = target;
	}

	public Edge(final Node source, final Node target, final EdgeType type) {
		this.source = source;
		this.target = target;
		this.type = type;
	}

	public Node getSource() {
		return source;
	}

	public Node getTarget() {
		return target;
	}

	public EdgeType getType() {
		return type;
	}

	public boolean isControl() {
		return type.isControl();
	}

	@Override
	public String toString() {
		final String result = type != null ? type.toString() : "";
		return result;
	}
}
