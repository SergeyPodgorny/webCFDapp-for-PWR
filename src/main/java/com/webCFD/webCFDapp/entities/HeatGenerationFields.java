package com.webCFD.webCFDapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "Existing heat generation fields", schema = "public")
public class HeatGenerationFields {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fieldId;
	
	
	

}