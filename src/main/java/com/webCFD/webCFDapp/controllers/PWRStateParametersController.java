package com.webCFD.webCFDapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webCFD.webCFDapp.dto.PWRStateParametersDTO;
import com.webCFD.webCFDapp.entities.PWRStateParameters;
import com.webCFD.webCFDapp.repository.PWRStateParametersRepository;
import com.webCFD.webCFDapp.service.PWRStateParametersService;

@RestController
public class PWRStateParametersController {

		
	private final PWRStateParametersService stateParametersService;
	private final PWRStateParametersRepository stateParametersRepository;
	
	
	
	@Autowired
	public PWRStateParametersController(PWRStateParametersService stateParametersService,PWRStateParametersRepository stateParametersRepository) {
		this.stateParametersService = stateParametersService;
		this.stateParametersRepository = stateParametersRepository;
	}
	
	
	@PostMapping("service/addParameters")
	public void writeHeatGenerationField(@RequestBody PWRStateParametersDTO stateParameters) {
		stateParametersService.insertParametersIntoBase(stateParameters.getkQ(), stateParameters.getkT(), stateParameters.getkG(), stateParameters.getDescription());
	}
	
	
	@DeleteMapping("service/deleteParameters")
	public void deleteHeatGenerationField(@RequestBody PWRStateParametersDTO stateParameters) {
		
	}
	
	@GetMapping("showAll")
	public List<PWRStateParameters> showAll(){
		return stateParametersService.findAll();
	}
	
	
	
	
	
//	@GetMapping("/index/{kQ}")
//	public String heatGenerationFieldController(@PathVariable double kQ) {
//		return heatgenerationFieldService.createHeatGenerationField(kQ);
//	}
	
	
	
}
