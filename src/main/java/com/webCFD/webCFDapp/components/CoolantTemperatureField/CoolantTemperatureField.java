package com.webCFD.webCFDapp.components.CoolantTemperatureField;

import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;
import static com.webCFD.webCFDapp.model.constants.PWR.MASS_FLOW;
import static com.webCFD.webCFDapp.model.constants.PWR.INLET_TEMP;

import com.webCFD.webCFDapp.components.SteadyStateTemperatureField.Field;

public class CoolantTemperatureField implements Field{

	
	
	public double[][] getField(Double kQ, Double kG, Double kT) {
		
		buildCoolantTemperatureField(kQ, kG, kT);
				
		return sparseField;
	}

	
	
	
	
	private void buildCoolantFlowDistributionVector (Double kQ, Double kG, Double kT) {
		
		
		
		
	}

@Override
	public double getElement(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
