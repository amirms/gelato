package org.servicifi.gelato.analysis.framework.analyses.impl;

public class TransferResult<TContext, TEnvironment> {
	TEnvironment env;
	Jump<TContext, TEnvironment>[] jumps;
}