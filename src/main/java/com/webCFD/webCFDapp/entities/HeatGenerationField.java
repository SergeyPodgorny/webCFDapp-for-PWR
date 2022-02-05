package com.webCFD.webCFDapp.entities;





public class HeatGenerationField {
	
	
	
	@SuppressWarnings("unused")
	private double kQ;
	
	public double [][] returnableArray = new double [PWR.SIZE][PWR.SIZE];

	
	public HeatGenerationField(double kQ) {
		super();
		this.kQ = kQ;
	}


	public void buildField() {
		
		for (int i = 0; i < PWR.SIZE; i++) {
			for (int j = 0; j < PWR.SIZE; j++) {
				returnableArray[i][j] = 1;
			}
		}
		
//		printMatrix(returnableArray);
	}
	
//	private void printMatrix(double [][] printingArray) {
//		for (int i = 0; i < PWR.SIZE; i++) {
//			for (int j = 0; j < PWR.SIZE; j++) {
//				System.out.println(printingArray[i][j]);
//			}
//		}
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
