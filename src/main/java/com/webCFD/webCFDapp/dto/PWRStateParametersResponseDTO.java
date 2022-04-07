package com.webCFD.webCFDapp.dto;

import com.webCFD.webCFDapp.entities.PWRStateParameters;

public class PWRStateParametersResponseDTO {

	private Double kQ;
	
	private Double kT;
	
	private Double kG;
	
	private String description;

	public PWRStateParametersResponseDTO(Double kQ, Double kT, Double kG, String description) {
		this.kQ = kQ;
		this.kT = kT;
		this.kG = kG;
		this.description = description;
	}

	public PWRStateParametersResponseDTO(PWRStateParameters pwrStateParameters) {
		kQ = pwrStateParameters.getkQ();
		kT = pwrStateParameters.getkT();
		kG = pwrStateParameters.getkG();
		description = pwrStateParameters.getDescription();
		
	}

	public Double getkQ() {
		return kQ;
	}

	public void setkQ(Double kQ) {
		this.kQ = kQ;
	}

	public Double getkT() {
		return kT;
	}

	public void setkT(Double kT) {
		this.kT = kT;
	}

	public Double getkG() {
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
