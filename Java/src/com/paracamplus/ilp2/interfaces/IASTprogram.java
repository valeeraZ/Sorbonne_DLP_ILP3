/* *****************************************************************
 * ILP9 - Implantation d'un langage de programmation.
 * by Christian.Queinnec@paracamplus.com
 * See http://mooc.paracamplus.com/ilp9
 * GPL version 3
 ***************************************************************** */
package com.paracamplus.ilp2.interfaces;

public interface IASTprogram extends com.paracamplus.ilp1.interfaces.IASTprogram {
	IASTfunctionDefinition[] getFunctionDefinitions();
}
