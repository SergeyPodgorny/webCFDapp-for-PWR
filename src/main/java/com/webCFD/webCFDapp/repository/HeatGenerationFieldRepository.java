package com.webCFD.webCFDapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webCFD.webCFDapp.entities.PWRStateParametersEntity;

public interface HeatGenerationFieldRepository extends JpaRepository<PWRStateParametersEntity, Long> {

	PWRStateParametersEntity findHeatGenerationFieldEntityIdBykQ(Double kQ);
	
	
}
