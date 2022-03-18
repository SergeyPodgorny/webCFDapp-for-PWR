package com.webCFD.webCFDapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "HeatGenerationFields")
public class HeatGenerationFieldEntity {
	
	@Column(name = "ID")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "kQCoeffs")
	private Double kQ; 
	
	public HeatGenerationFieldEntity() {
		
	}
	
	
	public HeatGenerationFieldEntity(Double kQ) {
		this.kQ = kQ;
	}
	
	
	public void setKq(Double kQ) {
		this.kQ = kQ;
	}
	
	public Double getKq() {
		return kQ;
	}
	
	
	public void setFieldId(Long fieldId) {
		this.id = fieldId;
	}
	
	public Long getFieldId() {
		return id;
	}


	



}
