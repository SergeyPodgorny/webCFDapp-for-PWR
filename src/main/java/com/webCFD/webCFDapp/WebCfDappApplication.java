package com.webCFD.webCFDapp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.webCFD.webCFDapp.components.heatGenerationField.HeatGenerationField;





@SpringBootApplication
public class WebCfDappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(WebCfDappApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
//		HeatGenerationField field = new HeatGenerationField();
//		System.out.println(field.getElement(1, 1, 1.00));
//		System.out.println(Arrays.deepToString(field.getField(1.00)).replace("], ", "]\n"));
	}

	

}
