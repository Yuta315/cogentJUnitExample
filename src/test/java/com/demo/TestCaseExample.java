package com.demo;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCaseExample {
	UnitTesting1 ut=new UnitTesting1();
	
	@Test
	public void testCase1() {
		assertEquals(ut.calculate(100),10);
	}
	
	@Test
	public void testCase2() {
		assertEquals(ut.calculate(10),20);
	}

}
