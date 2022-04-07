package com.webCFD.webCFDapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;


@Entity
@Table(name = "pwr_state_parameters")
public class PWRStateParameters {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@NotEmpty
	@Column(name = "kq")
	private Double kQ; 
	
	@NotEmpty
	@Column(name = "kt")
	private Double kT;
	
	@NotEmpty
	@Column(name = "kg")
	private Double kG;
	
	@NotBlank
	private String description;
	
	public PWRStateParameters() {
		
	}

	public PWRStateParameters(Double kQ, Double kT, Double kG, String description) {
		this.kQ = kQ;
		this.kT = kT;
		this.kG = kG;
		this.description = description;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
