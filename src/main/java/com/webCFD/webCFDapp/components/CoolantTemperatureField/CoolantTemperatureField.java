package com.webCFD.webCFDapp.components.CoolantTemperatureField;

import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;
import static com.webCFD.webCFDapp.model.constants.PWR.MASS_FLOW;
import static com.webCFD.webCFDapp.model.constants.PWR.INLET_TEMP;

import com.webCFD.webCFDapp.components.SteadyStateTemperatureField.Field;

public class CoolantTemperatureField implements Field{

	
	private double [][] sparseField = new double [SIZE][SIZE];
	
	
	public double[][] getField(Double kQ, Double kG, Double kT) {
		
		buildCoolantTemperatureField(kQ, kG, kT);
				
		return sparseField;
	}

	
	private void buildCoolantTemperatureField(Double kQ, Double kG, Double kT) {
		
		
		for (int i = 0; i < SIZE-1; i++) {
			for (int j = 0; j < SIZE-1; j++) {
				
				if ((i>0)&(j>0)&(i<SIZE)&(j<SIZE)) {
					sparseField[i][j] = INLET_TEMP+ 1/2 + Math.cos(0.20279*i-1.6223);
				} else {
					sparseField[i][j] = 0;
				}
				
				
				
			}
		}
				
	}
	
	
	
	
	
}
