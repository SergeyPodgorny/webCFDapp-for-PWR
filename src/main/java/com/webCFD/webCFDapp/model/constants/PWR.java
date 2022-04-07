package com.webCFD.webCFDapp.model.constants;


/**
 * <h3> PWR class </h3> 
 * <p> This class represents main constants of a PWR model. Such as thermal power, inlet temperature of a coolant and its mass flow. <br><br>
 * 
 * The "PWR" is not a proper name for a class, but it is short, which helps to reduce the code. <br><br>
 *  
 * The purpose of a private constructor of this class is to prevent creation of an instance of this class. In addition, all fields were made static, so there is no need to create an instance.<br><br>
 * 
 *
 * 
 * @see <a href  = "https://en.wikipedia.org/wiki/Pressurized_water_reactor" > Learn more about PWR. </a><br>
 *		<a href = ""> Learn more about the PWR model, which represents in this programm. </a><br>	
 * 
 * 
 * 
 * @author Sergey Podgorny
 *
 */


public class PWR {
	
	
	
	private PWR() {
		
	}
	
	public static final double THERMAL_POWER = 236380000;
	
	public static final double INLET_TEMP = 291.9;
	
	public static final int SIZE = 17; // TODO set this value to default 17 later
	
	public static final double MASS_FLOW = 0.342;
	
	
	
	

}
