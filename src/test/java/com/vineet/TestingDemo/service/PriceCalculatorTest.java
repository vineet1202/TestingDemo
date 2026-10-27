package com.vineet.TestingDemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {
	
	private PriceCalculator priceCalculator = new PriceCalculator();
	
	@BeforeEach
	void setup() {
		
	}
	
	@Test
	void isDiscountApplied() {
		// arrange --> initial input
		double price = 1000;
		double discount = 20;
		
		//act --> action performed
		double actualPrice = priceCalculator.calculatePrice(price, discount);
		
		//assertion --> Expected output
		assertEquals(800, actualPrice);
	}
	
	@Test
	void discountMustBeBelow100() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, 
				() -> priceCalculator.calculatePrice(1000, 120));
		
		assertEquals("Discount should be within 0 to 100", exception.getMessage());
	}

}
