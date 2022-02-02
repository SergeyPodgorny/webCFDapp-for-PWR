package com.webCFD.webCFDapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureFieldController {

	@GetMapping("/index")
	public String heatGenerationFieldController() {
		return "done";
	}
	
	
	
}
