package com.webCFD.webCFDapp.components.CoolantTemperatureField;


/** <h3> CoolantTemperatureField Class</h3>
 *  <p>  This class represents a field of coolant temperatures (water), which is a part of imitation of a volume heat sink in a model of an active core.<br>
 * Due to the active core of PWR consist of uncased fuel assemblies, we need to determine coolant mass flow distribution before we can build a filed. <br>
 * Such algorithm was invented and published. But it does not protected by patent, so in this implementation I will use precalculated vectors.  
 * 
 */




public class CoolantTemperatureField implements CoolantTemperatureFieldInterface{

	
	
	public double[][] getField(Double kQ, Double kG, Double kT, double [] coolantDistribution) {
		
		buildCoolantTemperatureField(kQ, kG, kT, coolantDistribution);
				
		return sparseField;
	}

	
		

	@Override
	public double getElement(int i, int j, Double kQ) {
		return sparseField[i][j];
	}
	
	
}
