package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

	@Autowired
	private Calculator calculator;
	
	@Test
	public void testCalculatorSum() {
		assertEquals(3, calculator.sum(1, 2));
	}
	
	@Test
	public void testCalculatorSumNegativeNumber() {
		assertEquals(0, calculator.sum(1, -1));
	}
	
	@Test
	public void testCalculatorSum0Number() {
		assertEquals(1, calculator.sum(1, 0));
	}
	
}
