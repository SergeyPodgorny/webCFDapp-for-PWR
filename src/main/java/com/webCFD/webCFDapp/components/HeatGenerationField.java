package com.webCFD.webCFDapp.components;

import java.io.Serializable;
import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.webCFD.webCFDapp.templates.SparseMatrix;

import static com.webCFD.webCFDapp.constants.PWR.THERMAL_POWER;
import static com.webCFD.webCFDapp.constants.PWR.SIZE;


/**
 * <h3> HeatGenerationField Class</h3>
 * <p>  This class represents a field of heat sources, which is imitating a volume heat generation in a model of an active core.<br>
 * Low resolution of a model (only 15*15 cells) causing side effects on mass-average and maximum temperature values.<br>
 * Those side effects are eliminated by adding boundary conditions.<br>
 * Adding boundary conditions requires adding sparse elements on perimeter of a model, so that is the reason why we need to set up a sparse matrix first with extra size, and only then we fill it with values
 *  
 * 
 * @author Sergey Podgorny
 *
 */
@Component
public class HeatGenerationField extends SparseMatrix{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void buildHeatGenerationField(Double kQ) {
		
		buildSparseMatrix();
		
		
		for (int i = 1; i < SIZE-1; i++) {
			for (int j = 1; j < SIZE-1; j++) {
				sparseMatrix[i][j] = kQ*THERMAL_POWER*Math.cos(0.20279*i-1.6223)*Math.cos(0.17346*j-1.3877);
			}
		}
		
		printMatrix(sparseMatrix);
		
		
	}
	
	private void printMatrix(double [][] printingArray) {
		
		System.out.println(Arrays.deepToString(printingArray).replace("], ", "]\n"));
			}
	
	public double[][] getField(){
		return sparseMatrix;
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

