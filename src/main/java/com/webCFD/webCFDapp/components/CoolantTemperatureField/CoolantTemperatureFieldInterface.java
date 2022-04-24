package com.webCFD.webCFDapp.components.CoolantTemperatureField;

import static com.webCFD.webCFDapp.model.constants.PWR.INLET_TEMP;
import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;



public interface CoolantTemperatureFieldInterface {
	
	
	
	
	double [][] sparseField = new double [SIZE][SIZE];
	
	double getElement(int i, int j, Double kQ);
	
	default void buildCoolantTemperatureField(Double kQ, Double kG, Double kT, double[] coolantDistribution) {
		
		for (int i = 0; i < SIZE-1; i++) {
			for (int j = 0; j < SIZE-1; j++) {
				
				if ((i>0)&(j>0)&(i<SIZE)&(j<SIZE)) {
					sparseField[i][j] = INLET_TEMP + coolantDistribution[i]/2 * (1+1.0012*Math.sin(0.20279*i-1.8251));
				} else {
					sparseField[i][j] = 0;
				}
				
			}
		}
				
	}
	
	
	
	
	

}
