package com.webCFD.webCFDapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.webCFD.webCFDapp.service.HeatGenerationFieldService;

@RestController
public class HeatGenerationFieldController {

	@Autowired	
	private final HeatGenerationFieldService heatgenerationFieldService;
	
	
	public HeatGenerationFieldController(HeatGenerationFieldService heatgenerationFieldService) {
		this.heatgenerationFieldService = heatgenerationFieldService;
	}
	
	
	@GetMapping("/index")
	public String heatGenerationFieldController() {
		return heatgenerationFieldService.createHeatGenerationField();
	}
	
	
	
}
