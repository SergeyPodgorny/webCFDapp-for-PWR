package com.webCFD.webCFDapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.dto.FieldCoefficientsDTO;
import com.webCFD.webCFDapp.service.HeatGenerationFieldService;

@RestController
public class HeatGenerationFieldController {

		
	private final HeatGenerationFieldService heatgenerationFieldService;
	
	@Autowired
	public HeatGenerationFieldController(HeatGenerationFieldService heatgenerationFieldService) {
		this.heatgenerationFieldService = heatgenerationFieldService;
	}
	
	@PostMapping("heatGenerationField/create")
	public String createHeatGenerationField(@RequestBody FieldCoefficientsDTO fieldCoefficientsDTO) {
		return heatgenerationFieldService.createHeatGenerationField(fieldCoefficientsDTO.getkQ());
	}
	
	
	
	
	
	
//	@GetMapping("/index/{kQ}")
//	public String heatGenerationFieldController(@PathVariable double kQ) {
//		return heatgenerationFieldService.createHeatGenerationField(kQ);
//	}
	
	
	
}
