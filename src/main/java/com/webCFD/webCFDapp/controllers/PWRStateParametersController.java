package com.webCFD.webCFDapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.dto.PWRStateParametersDTO;

import com.webCFD.webCFDapp.repository.HeatGenerationFieldRepository;
import com.webCFD.webCFDapp.service.HeatGenerationFieldService;

@RestController
public class PWRStateParametersController {

		
	private final HeatGenerationFieldService heatgenerationFieldService;
	private final HeatGenerationFieldRepository heatGenerationFieldRepository;
	
	
	
	@Autowired
	public PWRStateParametersController(HeatGenerationFieldService heatgenerationFieldService,HeatGenerationFieldRepository heatGenerationFieldRepository) {
		this.heatgenerationFieldService = heatgenerationFieldService;
		this.heatGenerationFieldRepository = heatGenerationFieldRepository;
	}
	
	
	@PostMapping("heatGenerationField/service/addParameters")
	public void writeHeatGenerationField(@RequestBody PWRStateParametersDTO stateParameters) {
		
	}
	
	
	@DeleteMapping("heatGenerationField/service/deleteParameters")
	public void deleteHeatGenerationField(@RequestBody PWRStateParametersDTO stateParameters) {
		
	}
	
	
	
	
	
	
	
//	@GetMapping("/index/{kQ}")
//	public String heatGenerationFieldController(@PathVariable double kQ) {
//		return heatgenerationFieldService.createHeatGenerationField(kQ);
//	}
	
	
	
}
