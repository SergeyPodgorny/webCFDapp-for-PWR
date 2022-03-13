package com.webCFD.webCFDapp.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "Existing heat generation fields", schema = "public")
public class HeatGenerationFieldEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fieldId;
	
	
	private Double kQ; 
	
	
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
		this.fieldId = fieldId;
	}
	
	public Long getFieldId() {
		return fieldId;
	}


	



}
