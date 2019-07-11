package org.servicifi.gelato.analysis.framework.sdg;

public enum NodeType {
	ENTRY, FORMAL_IN, FORMAL_OUT, ACTUAL_IN, ACTUAL_OUT, NORMAL, CTRL, CALL, RETURN;

	@Override
	public String toString() {
		String result = super.toString().toLowerCase();
		result = result.substring(0, 1).toUpperCase() + result.substring(1);
		result = result.replace("_", "-");
		return result;
	}
}
