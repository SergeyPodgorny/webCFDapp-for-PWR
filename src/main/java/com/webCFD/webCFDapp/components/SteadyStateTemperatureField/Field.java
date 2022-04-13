package com.webCFD.webCFDapp.components.SteadyStateTemperatureField;
import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;


public interface Field {
	
	
	double [][] sparseField = new double [SIZE][SIZE];
	
	default double getFieldElement(int i, int j) {
		return sparseField[i][j];
	}
	
	

}
