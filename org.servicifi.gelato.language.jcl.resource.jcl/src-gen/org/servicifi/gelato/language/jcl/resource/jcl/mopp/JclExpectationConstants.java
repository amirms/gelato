/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.servicifi.gelato.language.jcl.resource.jcl.mopp;


/**
 * This class contains some constants that are used during code completion.
 */
public class JclExpectationConstants {
	
	public final static int EXPECTATIONS[][] = new int[4][];
	
	public static void initialize0() {
		EXPECTATIONS[0] = new int[3];
		EXPECTATIONS[0][0] = 0;
		EXPECTATIONS[0][1] = 0;
		EXPECTATIONS[0][2] = 0;
		EXPECTATIONS[1] = new int[3];
		EXPECTATIONS[1][0] = 0;
		EXPECTATIONS[1][1] = 1;
		EXPECTATIONS[1][2] = 1;
		EXPECTATIONS[2] = new int[2];
		EXPECTATIONS[2][0] = 1;
		EXPECTATIONS[2][1] = 2;
		EXPECTATIONS[3] = new int[3];
		EXPECTATIONS[3][0] = 0;
		EXPECTATIONS[3][1] = 3;
		EXPECTATIONS[3][2] = 2;
	}
	
	public static void initialize() {
		initialize0();
	}
	
	static {
		initialize();
	}
	
}
