package com.webCFD.webCFDapp.service;





import java.time.Duration;
import java.time.Instant;

import org.springframework.stereotype.Service;

import com.webCFD.webCFDapp.entities.HeatGenerationField;


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
	
	public String createHeatGenerationField() {
		
		Instant startTime = Instant.now();
		
		HeatGenerationField heatGenerationField = new HeatGenerationField(1.00);
		
		heatGenerationField.buildField();
		
		Instant endTime = Instant.now();
		
		long duration = Duration.between(startTime, endTime).toMillis();
		
		StringBuilder outputMessage = new StringBuilder("done, execution time: ");
		
		outputMessage.append(duration).append(" milliseconds");
		
		return outputMessage.toString();
		
	}
	
	

}
