package com.webCFD.webCFDapp.components.heatGenerationField;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;

import org.junit.jupiter.api.Test;

public class HeatGenerationFieldTest {

	HeatGenerationField field = new HeatGenerationField();
	
	/**
	 * Checking if field building is correct in center
	 */
	
	
	@Test
	void elementShouldEqualsOneInCenter() {
		
		
		assertEquals(THERMAL_POWER, field.getElement(8, 8, 1.00));
	}
	
	@Test
	void elementShouldEqualsInCenter() {
		
		double testCoeff = 1.5;
		assertEquals(testCoeff*THERMAL_POWER, field.getElement(8, 8, testCoeff));
	}
	
	
	/**
	 * Checking if boundaries are zero's
	 */
	
	@Test
	void checkBoundariesForZeros() {
		
		
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, field.getElement(i, 0, 1.00));
		}
		
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, field.getElement(0, i, 1.00));
		}
		
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, field.getElement(i, SIZE-1, 1.00));
		}
		
		for (int i = 0; i < SIZE; i++) {
			assertEquals(0, field.getElement(SIZE-1, i, 1.00));
		}
		
		
	}
	
	
	
	
}
