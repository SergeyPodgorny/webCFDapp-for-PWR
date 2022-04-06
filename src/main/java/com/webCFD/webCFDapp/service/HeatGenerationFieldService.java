package com.webCFD.webCFDapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webCFD.webCFDapp.components.HeatGenerationField;
import com.webCFD.webCFDapp.repository.HeatGenerationFieldRepository;


/**
 *	<h3>HeatGenerationFieldService Class</h3>
 * 
 * <p>This is a service class for manipulations with the heat generation field. <br><br>
 * 
 *	This class provides calculations of a heat generation field with parameter kQ, which represents how much a field we want create differs from the field which represents the normal operation of a reactor. <br><br>
 *
 *	The kQ parameter is a value which comes with HTTP request.
 * 
 * @author Sergey Podgorny
 *
 */





@Service
public class HeatGenerationFieldService {
	
	
	private final HeatGenerationField heatGenerationField;
	
	private final HeatGenerationFieldRepository heatGenerationFieldRepository;
	
	
	
	@Autowired
	public HeatGenerationFieldService(HeatGenerationField heatGenerationField, HeatGenerationFieldRepository heatGenerationFieldRepository) {
		this.heatGenerationField = heatGenerationField;
		this.heatGenerationFieldRepository = heatGenerationFieldRepository;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
