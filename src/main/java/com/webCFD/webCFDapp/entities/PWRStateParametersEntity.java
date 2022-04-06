package com.webCFD.webCFDapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pwr_state_parameters")
public class PWRStateParametersEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "kq")
	private Double kQ; 
	
	
	@Column(name = "kt")
	private Double kT;

	@Column(name = "kg")
	private Double kG;
	
	private String description;
	
	public PWRStateParametersEntity() {
		
	}

	public PWRStateParametersEntity(Long id, Double kQ, Double kT, Double kG, String description) {
		this.id = id;
		this.kQ = kQ;
		this.kT = kT;
		this.kG = kG;
		this.description = description;
	}
	
	public PWRStateParametersEntity(Long id, Double kQ, String description) {
		this.id = id;
		this.kQ = kQ;
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
