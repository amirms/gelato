package org.servicifi.gelato.analysis.framework.analyses.impl;

import org.servicifi.gelato.language.kernel.procedures.Procedure;

public class Jump<TContext, TEnvironment> {

	private void Jump(TContext toContext, TEnvironment environment) {
		// TODO Auto-generated method stub
		this.toContext = toContext;
		this.environment = environment;
	}

	private Procedure to;
	public TContext toContext;
	public TEnvironment environment;
	
	public TContext originalContext;

	public Procedure getTo() {
		// TODO Auto-generated method stub
		return to;
	}
}
