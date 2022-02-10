package com.webCFD.webCFDapp.entities;

import java.util.Arrays;


/**
 * <h3> HeatGenerationField Class</h3>
 * <p>  This class represents a field of heat sources, which is imitating a volume heat generation in a model of an active core.<br>
 * Low resolution of a model (only 15*15 cells) causing side effects on mass-average and maximum temperatures.<br>
 * Those side effects are eliminated by adding boundary conditions.<br>
 * Adding boundary conditions requires adding sparse elements on perimeter of a model, so that is the reason why we need to set up a sparse matrix with extra size.
 *  
 * 
 * @author Sergey Podgorny
 *
 */

public class HeatGenerationField extends SparseMatrix{
	
	
	
	
	private double kQ;
	
	
	
	public HeatGenerationField(double kQ) {
		super();
		this.kQ = kQ;
	}


	public void buildField() {
		
		buildSparseMatrix();
		
		
		for (int i = 1; i < PWR.SIZE-1; i++) {
			for (int j = 1; j < PWR.SIZE-1; j++) {
				sparseMatrix[i][j] = kQ*PWR.THERMAL_POWER*Math.cos(0.20279*i-1.6223)*Math.cos(0.17346*j-1.3877);
			}
		}
		
		printMatrix(sparseMatrix);
	}
	
	private void printMatrix(double [][] printingArray) {
		
		System.out.println(Arrays.deepToString(printingArray).replace("], ", "]\n"));
			}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

