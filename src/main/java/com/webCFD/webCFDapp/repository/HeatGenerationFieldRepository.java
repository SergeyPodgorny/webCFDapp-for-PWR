package com.webCFD.webCFDapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webCFD.webCFDapp.entities.HeatGenerationFieldEntity;

public interface HeatGenerationFieldRepository extends JpaRepository<HeatGenerationFieldEntity, Double> {

}
