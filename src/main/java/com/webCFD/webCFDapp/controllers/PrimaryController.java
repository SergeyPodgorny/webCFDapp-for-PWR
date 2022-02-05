package com.webCFD.webCFDapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.entities.HeatGenerationField;

@RestController
public class PrimaryController {

		
	@GetMapping("/index/{kQ}")
	public String heatGenerationFieldController() {
		
		
		
		
		
		return "done";
	}
	
	
	
}
