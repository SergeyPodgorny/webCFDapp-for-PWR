package com.webCFD.webCFDapp.service;





import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webCFD.webCFDapp.components.HeatGenerationField;


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
	
	
	@Autowired
	public HeatGenerationFieldService(HeatGenerationField heatGenerationField) {
		this.heatGenerationField = heatGenerationField;
	}
	
		
	public String createHeatGenerationField(double kQ) {
		
		Instant startTime = Instant.now();
		
		heatGenerationField.buildHeatGenerationField(kQ);
		
		Instant endTime = Instant.now();
		
		long buildingTime = Duration.between(startTime, endTime).toMillis();
		
		StringBuilder outputMessage = new StringBuilder("done, execution time: ");
		
		outputMessage.append(buildingTime).append(" milliseconds");
		
		return outputMessage.toString();
		
	}
	
	

}
