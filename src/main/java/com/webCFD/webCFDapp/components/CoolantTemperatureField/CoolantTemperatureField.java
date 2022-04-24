package com.webCFD.webCFDapp.components.CoolantTemperatureField;

import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;
import static com.webCFD.webCFDapp.model.constants.PWR.MASS_FLOW;
import static com.webCFD.webCFDapp.model.constants.PWR.INLET_TEMP;

import com.webCFD.webCFDapp.components.SteadyStateTemperatureField.TemperatureField;

public class CoolantTemperatureField implements CoolantTemperatureFieldInterface{

	
	
	public double[][] getField(Double kQ, Double kG, Double kT, double [] coolantDistribution) {
		
		buildCoolantTemperatureField(kQ, kG, kT, coolantDistribution);
				
		return sparseField;
	}

	
	
	
	
	private double[] buildCoolantFlowDistributionVector (Double kQ, Double kG, Double kT) {
		
		return null;
		
		
	}

	@Override
	public double getElement(int i, int j, Double kQ) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
