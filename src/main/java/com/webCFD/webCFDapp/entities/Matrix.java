package com.webCFD.webCFDapp.entities;



/**<h3>Abstract Matrix Class</h3>
 * 
 * <p> This abstract class is a template for such classes as HeatGenerationField, CoolantTemperatureField etc.<b>
 *   
 * 
 * 
 * @author Sergey Podgorny
 *
 */



public abstract class Matrix extends Thread{
	
	protected double [][] sparseMatrix = new double [PWR.SIZE][PWR.SIZE];
	
	
	protected void buildSparseMatrix() {
		
		for (int i = 0; i < PWR.SIZE; i++) {
			for (int j = 0; j < PWR.SIZE; j++) {
				sparseMatrix[i][j] = 0;
			}
		}
		
		
	}
	

}
