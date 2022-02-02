package com.webCFD.webCFDapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureFieldController {
	
	@GetMapping("/hello1")
	public String helloController() {
		return "hello from spring and linux";
		
	}
	
	@GetMapping("/hello2")
	public String helloAgain() {
		return "hello again";
	}

}
