package com.webCFD.webCFDapp.components.heatGenerationField;
import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;



public abstract class Field {
	
	
	protected double [][] sparseField = new double [SIZE][SIZE];
	
	protected abstract void buildField(Double kQ);

	

}
