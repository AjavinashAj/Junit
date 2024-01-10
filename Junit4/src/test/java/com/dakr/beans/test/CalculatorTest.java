package com.dakr.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dakr.beans.Calculator;

public class CalculatorTest {
	
	private static Calculator calculator = null;
	
	@BeforeClass// this annotation is used for one time initialization of object and use it for multiple times
	public static void init() {
		calculator=new Calculator();
	}
	
	
	@AfterClass //this annotation used for initialization of object to null ,means destroy  object 
	public static void destroy() {
		calculator=null;
	}
	@Test //@test annotation create method for testing particular method
	public void testAdd() {

		
		Integer actualResult = calculator.add(10, 20);
		Integer expectedResult = 30;

		// used to validate the result
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMultiplication() {
		
		Integer actualResult = calculator.multiplication(2, 3);
		Integer expectedResult = 6;
		assertEquals(expectedResult, actualResult);  
	}
	
	@Test
	public void testSubtraction() {
		
		
		Integer actualResult =calculator.subtraction(4, 2);
		Integer expectedResult=2;
		assertEquals(expectedResult ,actualResult);
	}
	
		
		
	

}
