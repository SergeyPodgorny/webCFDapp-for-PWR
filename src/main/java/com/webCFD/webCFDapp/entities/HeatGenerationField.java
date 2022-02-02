package com.webCFD.webCFDapp.entities;





public class HeatGenerationField {
	
	
	private double kQ;

	private double [][] returnableArray = new double [PWRConstants.SIZE][PWRConstants.SIZE];
	
	
	public HeatGenerationField(double kQ) {
		this.kQ = kQ;
	}
	
	private void buildHeatGenerationField() {
		
		for(int i = 0; i < PWRConstants.SIZE; i++) {
			for (int j = 0; j < PWRConstants.SIZE; j++) {
				
				
				
			}
		}
	}
	

}
