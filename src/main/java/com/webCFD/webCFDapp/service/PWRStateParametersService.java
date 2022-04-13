package com.webCFD.webCFDapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webCFD.webCFDapp.components.heatGenerationField.HeatGenerationField;
import com.webCFD.webCFDapp.entities.PWRStateParameters;
import com.webCFD.webCFDapp.repository.PWRStateParametersRepository;


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
public class PWRStateParametersService {
	
	
	private final HeatGenerationField heatGenerationField;
	
	private final PWRStateParametersRepository pwrStateParametersRepository;
	
	
	
	@Autowired
	public PWRStateParametersService(HeatGenerationField heatGenerationField, PWRStateParametersRepository pwrStateParametersRepository) {
		this.heatGenerationField = heatGenerationField;
		this.pwrStateParametersRepository = pwrStateParametersRepository;
		
	}
	
	
	public void insertParametersIntoBase(Double kQ, Double kT, Double kG, String description) {
		
		pwrStateParametersRepository.save(new PWRStateParameters(kQ, kT,kG, description));
		
	}
	
	
	public List<PWRStateParameters> getAll(){
		return pwrStateParametersRepository.findAll();
		
	}
	
	
	
	
	
	

}
