package com.webCFD.webCFDapp.components.CoolantTemperatureField;

import com.webCFD.webCFDapp.components.SteadyStateTemperatureField.Field;

public class CoolantTemperatureField implements Field{

	
	
	
	
	public double[][] getField(Double kQ, Double kG, Double kT) {
		
		buildField(kQ, kG, kT);
				
		return sparseField;
	}

	
	private void buildField(Double kQ, Double kG, Double kT) {
		
		
	}
	
	
	
	
	
	
	

	
	
	
	
	
}
