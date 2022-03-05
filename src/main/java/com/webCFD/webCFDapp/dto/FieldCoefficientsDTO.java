package com.webCFD.webCFDapp.dto;




public class FieldCoefficientsDTO {
	
	private double kQ;
	
	private double kT;
	
	private double kG;
	
	
	public FieldCoefficientsDTO() {
		
	}


	public double getkQ() {
		return kQ;
	}


	public void setkQ(double kQ) {
		this.kQ = kQ;
	}


	public double getkT() {
		return kT;
	}


	public void setkT(double kT) {
		this.kT = kT;
	}


	public double getkG() {
		return kG;
	}


	public void setkG(double kG) {
		this.kG = kG;
	}
	
	
	
}
