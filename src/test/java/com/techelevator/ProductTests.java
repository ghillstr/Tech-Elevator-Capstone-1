package com.techelevator;

import com.techelevator.Product;
import com.techelevator.Inventory;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class ProductTests {

	@Test
	public void chipReturnsCrunchCrunchYum () {
		Product myProduct = new Product("Stackers", new BigDecimal(3.05), "Chip");
		String expectedTypeMessage = "Crunch Crunch, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void gumReturnsChewChewYum () {
		Product myProduct = new Product("Triplemint", new BigDecimal(0.75), "Gum");
		String expectedTypeMessage = "Chew Chew, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}	
	
	@Test
	public void drinkReturnsGlugGlugYum () {
		Product myProduct = new Product("Dr. Salt", new BigDecimal(1.50), "Drink");
		String expectedTypeMessage = "Glug Glug, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void candyReturnsMunchMunchYum () {
		Product myProduct = new Product("Wonka Bar", new BigDecimal(1.50), "Candy");
		String expectedTypeMessage = "Munch Munch, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
}