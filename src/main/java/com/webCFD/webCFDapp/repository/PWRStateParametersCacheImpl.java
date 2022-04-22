package com.webCFD.webCFDapp.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.webCFD.webCFDapp.entities.PWRStateParameters;



public class PWRStateParametersCacheImpl implements PWRStateParametersCache {

	@Autowired
	private final PWRStateParametersRepository pWRStateParametersRepository;
	
		
	public PWRStateParametersCacheImpl(PWRStateParametersRepository pWRStateParametersRepository) {
		this.pWRStateParametersRepository = pWRStateParametersRepository;
	}


	private static final Map<Long, PWRStateParameters> pWRStateParametersCache = new HashMap<>(); 
	
	
	public void initializeCahce() {
		
	}
	
}
