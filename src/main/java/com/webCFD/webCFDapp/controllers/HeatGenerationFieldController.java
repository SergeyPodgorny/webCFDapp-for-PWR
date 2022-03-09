package com.webCFD.webCFDapp.controllers;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.dto.FieldCoefficientsDTO;
import com.webCFD.webCFDapp.exceptions.HeatGenerationFieldFoundException;
import com.webCFD.webCFDapp.exceptions.HeatGenerationFieldNotFoundException;
import com.webCFD.webCFDapp.service.HeatGenerationFieldService;

@RestController
public class HeatGenerationFieldController {

		
	private final HeatGenerationFieldService heatgenerationFieldService;
	
	@Autowired
	public HeatGenerationFieldController(HeatGenerationFieldService heatgenerationFieldService) {
		this.heatgenerationFieldService = heatgenerationFieldService;
	}
	
	
	@PostMapping("heatGenerationField/create")
	public String writeHeatGenerationField(@RequestBody FieldCoefficientsDTO fieldCoefficientsDTO) throws IOException, HeatGenerationFieldFoundException {
		try {
			return heatgenerationFieldService.writeNewHeatGenerationField(fieldCoefficientsDTO.getkQ());
		} catch (HeatGenerationFieldFoundException e) {
			return e.getMessage();
		}
	}
	
	
	@DeleteMapping("heatGenerationField/delete")
	public String deleteHeatGenerationField(@RequestBody FieldCoefficientsDTO fieldCoefficientsDTO) throws HeatGenerationFieldNotFoundException {
		try {
			return heatgenerationFieldService.deleteExistHeatGenerationField(fieldCoefficientsDTO.getkQ());
		} catch (HeatGenerationFieldNotFoundException e) {
			return e.getMessage();
		}
	}
	
	
	
//	@GetMapping("/index/{kQ}")
//	public String heatGenerationFieldController(@PathVariable double kQ) {
//		return heatgenerationFieldService.createHeatGenerationField(kQ);
//	}
	
	
	
}
