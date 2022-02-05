package com.webCFD.webCFDapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.entities.HeatGenerationField;

@RestController
public class HeatGenerationFieldController {

	@Autowired	
	private final HeatGenerationField heatgenerationField;
	
	
	public HeatGenerationFieldController(HeatGenerationField heatgenerationField) {
		this.heatgenerationField = heatgenerationField;
	}
	
	
	@GetMapping("/index")
	public String heatGenerationFieldController() {
		
		
		
		
		
		return "done";
	}
	
	
	
}
