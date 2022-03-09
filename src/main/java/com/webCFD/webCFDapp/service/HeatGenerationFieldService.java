package com.webCFD.webCFDapp.service;





import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webCFD.webCFDapp.components.HeatGenerationField;
import com.webCFD.webCFDapp.exceptions.HeatGenerationFieldFoundException;
import com.webCFD.webCFDapp.exceptions.HeatGenerationFieldNotFoundException;


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
	
		
	public String writeNewHeatGenerationField(Double kQ) throws IOException, HeatGenerationFieldFoundException{
		
		Instant startTime = Instant.now();
		
		StringBuilder writePath = new StringBuilder("serializedObjects/HeatGenerationFields/" + kQ.toString() + ".txt");
		
		StringBuilder outputMessage = new StringBuilder();
		
		File checkExistance = new File(writePath.toString());
		
			if (checkExistance.exists() == false) {
				
				FileOutputStream file = new FileOutputStream(writePath.toString());
				
				ObjectOutputStream fileWriter = new ObjectOutputStream(file);
				
				fileWriter.writeObject(heatGenerationField.getField(kQ));
				
				fileWriter.close();
				
				Instant endTime = Instant.now();
				
				long buildingTime = Duration.between(startTime, endTime).toMillis();
				
				outputMessage.append("Heat generation field with kQ = ").append(kQ.toString()).append(" created, execution time: \"").append(buildingTime).append(" milliseconds");
				
				return outputMessage.toString();
				
			} throw new HeatGenerationFieldFoundException("Error, heat generation field already exists.");
			
					
		
	}
	
	public String deleteHeatgenerationField(Double kQ) throws HeatGenerationFieldNotFoundException {
		
		Instant startTime = Instant.now();
		
		StringBuilder outputMessage = new StringBuilder();
		
		StringBuilder deletePath = new StringBuilder("serializedObjects/HeatGenerationFields/" + kQ.toString() + ".txt");
		
		File file = new File(deletePath.toString());
		
			if (file.exists() == true) {
			
				file.delete();
			
				Instant endTime = Instant.now();
			
				return outputMessage.append("Requesting heat generation filed with " + kQ.toString() + " deleted, execution time:" + Duration.between(endTime, startTime).toMillis()).toString();
		
			} throw new HeatGenerationFieldNotFoundException("Can't delete the file, it does not exist");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
