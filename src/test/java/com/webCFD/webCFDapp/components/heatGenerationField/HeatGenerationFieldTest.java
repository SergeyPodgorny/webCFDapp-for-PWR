package com.webCFD.webCFDapp.components.heatGenerationField;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HeatGenerationFieldTest {

	HeatGenerationField field = new HeatGenerationField();
	
	/**
	 * Checking if field building is correct in center
	 */
	
	
	@Test
	void elementEqualsOneInCenter() {
		
		field.getField(1.00);
		assertEquals(1*THERMAL_POWER, field.getElement(8, 8));
	}
	
	/**
	 * Checking if boundaries are zero's
	 */
	
//	@Test
//	void checkBoundariesForZeros() {
//		field.getField(1.00);
//		assertEquals(1*THERMAL_POWER, field.getElement(8, 8));
//	}
	
	
	
	
}
