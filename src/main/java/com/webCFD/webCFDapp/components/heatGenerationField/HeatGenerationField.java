package com.webCFD.webCFDapp.components.heatGenerationField;


import static com.webCFD.webCFDapp.model.constants.PWR.SIZE;
import static com.webCFD.webCFDapp.model.constants.PWR.THERMAL_POWER;


import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.webCFD.webCFDapp.components.SteadyStateTemperatureField.Field;

/**
 * <h3> HeatGenerationField Class</h3>
 * <p>  This class represents a field of heat sources, which is imitating a volume heat generation in a model of an active core.<br>
 * Low resolution of a model (only 15*15 cells) causing side effects on mass-average and maximum temperature values.<br>
 * Those side effects are eliminated by adding boundary conditions.<br>
 * Adding boundary conditions requires adding sparse elements on perimeter of a model, so that is the reason why we need to set up a sparse matrix first with extra size, and only then we fill it with values
 *  
 * 
 * @author Sergey Podgorny
 *
 */
@SuppressWarnings("unused")
@Component
public class HeatGenerationField implements Field{
	
	public double[][] getField(Double kQ) {
		
		buildHeatGenerationField(kQ);
		
		return sparseField;
	}
	
	
	

	@Override
	public double getElement(int i, int j) {
		return sparseField[i][j];
	}




	@Override
	public double getElement(int i, int j, Double kQ, Double kG, Double kT) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

