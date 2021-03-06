package com.webCFD.webCFDapp.components.heatGenerationField;

import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;

public interface HeatGenerationFieldInterface {
	
	double [][] sparseField = new double [SIZE][SIZE];
	
	double getElement(int i, int j, Double kQ);
	
	default void buildHeatGenerationField(Double kQ) {
		
		
		for (int i = 0; i < SIZE-1; i++) {
			for (int j = 0; j < SIZE-1; j++) {
				
				if ((i>0)&(j>0)&(i<SIZE)&(j<SIZE)) {
					sparseField[i][j] = kQ*THERMAL_POWER*Math.cos(0.20279*i-1.6223)*Math.cos(0.17346*j-1.3877); 
				} else {
					sparseField[i][j] = 0;
				}
				
				
				
			}
		}
		
	}
	
	
	

}
