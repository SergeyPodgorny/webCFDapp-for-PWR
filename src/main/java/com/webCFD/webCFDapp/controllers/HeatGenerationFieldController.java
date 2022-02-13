package com.webCFD.webCFDapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.service.HeatGenerationFieldService;

@RestController
public class HeatGenerationFieldController {

		
	private final HeatGenerationFieldService heatgenerationFieldService;
	
	@Autowired
	public HeatGenerationFieldController(HeatGenerationFieldService heatgenerationFieldService) {
		this.heatgenerationFieldService = heatgenerationFieldService;
	}
	
	@GetMapping("/index/{kQ}")
	public String heatGenerationFieldController(@PathVariable double kQ) {
		return heatgenerationFieldService.createHeatGenerationField(kQ);
	}
	
	
	
}
