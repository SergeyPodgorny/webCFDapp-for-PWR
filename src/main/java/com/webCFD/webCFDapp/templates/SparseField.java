package com.webCFD.webCFDapp.templates;

import java.io.Serializable;

import com.webCFD.webCFDapp.constants.PWR;

/**<h3>Abstract Matrix Class</h3>
 * 
 * <p> This abstract class is a template for such classes as HeatGenerationField, CoolantTemperatureField etc.<b>
 *   
 * 
 * 
 * @author Sergey Podgorny
 *
 */



public abstract class SparseField extends Thread implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double [][] sparseField = new double [PWR.SIZE][PWR.SIZE];
	
	
	protected void buildSparseMatrix() {
		
		for (int i = 0; i < PWR.SIZE; i++) {
			for (int j = 0; j < PWR.SIZE; j++) {
				sparseField[i][j] = 0;
			}
		}
		
		
	}
	

}
