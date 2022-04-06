package com.webCFD.webCFDapp.dto;




public class PWRStateParametersDTO {
	
	private Double kQ;
	
	private Double kT;
	
	private Double kG;
	
	private String description;
	
	
	public PWRStateParametersDTO() {
		
	}


	public double getkQ() {
		return kQ;
	}


	public void setkQ(Double kQ) {
		this.kQ = kQ;
	}


	public double getkT() {
		return kT;
	}


	public void setkT(Double kT) {
		this.kT = kT;
	}


	public double getkG() {
		return kG;
	}


	public void setkG(Double kG) {
		this.kG = kG;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
