package com.webCFD.webCFDapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "Existing heat generation fields", schema = "public")
public class HeatGenerationFieldEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
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
