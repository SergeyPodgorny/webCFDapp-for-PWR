package com.webCFD.webCFDapp.components.heatGenerationField;


import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;


import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.webCFD.webCFDapp.components.SteadyStateTemperatureField.Field;

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
@SuppressWarnings("unused")
@Component
public class HeatGenerationField implements Field{
	
	
	/**
	 * 
	 */
	
	
	
	public double[][] getHeatGenerationField(Double kQ) {
		
		buildField(kQ);
		
		return sparseField;
	}
	
	@Override
	public void buildField(Double kQ) {
		
		
		for (int i = 0; i < SIZE-1; i++) {
			for (int j = 0; j < SIZE-1; j++) {
				
				if ((i>0)&(j>0)&(i<SIZE)&(j<SIZE)) {
					sparseField[i][j] = kQ*THERMAL_POWER*Math.cos(0.20279*i-1.6223)*Math.cos(0.17346*j-1.3877);
				} else {
					sparseField[i][j] = 0;
				}
				
				
				
			}
		}
		
// 	printMatrix(sparseField);
		
		
	}
	
//	private void printMatrix(double [][] printingArray) {
//		
//		System.out.println(Arrays.deepToString(printingArray).replace("], ", "]\n"));
//			}
//	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

