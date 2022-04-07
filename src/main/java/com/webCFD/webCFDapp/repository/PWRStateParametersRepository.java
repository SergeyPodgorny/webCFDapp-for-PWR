package com.webCFD.webCFDapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webCFD.webCFDapp.entities.PWRStateParameters;


@Repository
public interface PWRStateParametersRepository extends JpaRepository<PWRStateParameters, Long> {

	
	
	
}
