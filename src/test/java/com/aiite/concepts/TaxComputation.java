package com.aiite.concepts;

import org.junit.Assert;
import org.junit.Test;

public class TaxComputation {
	
	public static double taxCalculation(double income, double investment) {
		double totalEarning = income-investment;
		double taxAmount=0;
		if(totalEarning>50.0) {
			taxAmount = totalEarning*0.20;
		}
		
		return taxAmount;		
	}
	
	@Test			//TC
	public void Test_TaxCalculation() { 	//unit test method
		double expectedAmount =20.0;
		double actualAmount = taxCalculation(150, 50);
		System.out.println(8/0);
		Assert.assertTrue(expectedAmount==actualAmount);
	}
	
	@Test
	public void Test_TaxCalculation_noTax() {	//unit test method
		double expectedAmount =20.0;
		double actualAmount = taxCalculation(90, 50);
		System.out.println(actualAmount);
		Assert.assertFalse(expectedAmount==actualAmount);
	}

}
