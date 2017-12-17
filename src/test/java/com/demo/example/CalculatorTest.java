package com.demo.example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator cObj;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		cObj=new Calculator();
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int result=cObj.add(10,12);
		assertEquals(22,result);
		
		 
	}
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int result=cObj.subtract(10,12);
		assertEquals(-2,result);
		
		 
	}

}
