package com.techelevator;

import com.techelevator.Product;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import org.junit.Test;

public class ProductTests {

	@Test
	public void chip_returns_crunchcrunchyum () {
		Product myProduct = new Product("Stackers", new BigDecimal(3.05), "Chip");
		String expectedTypeMessage = "Crunch Crunch, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void gum_returns_chewchewyum () {
		Product myProduct = new Product("Triplemint", new BigDecimal(0.75), "Gum");
		String expectedTypeMessage = "Chew Chew, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}	
	
	@Test
	public void drink_returns_glugglugyum () {
		Product myProduct = new Product("Dr. Salt", new BigDecimal(1.50), "Drink");
		String expectedTypeMessage = "Glug Glug, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void candy_returns_munchmunchyum () {
		Product myProduct = new Product("Wonka Bar", new BigDecimal(1.50), "Candy");
		String expectedTypeMessage = "Munch Munch, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void getname_returns_name () {
		Product myProduct = new Product("Wonka Bar", new BigDecimal(1.50), "Candy");
		assertTrue(myProduct.getName() == "Wonka Bar");
	}
	
	@Test
	public void getprice_returns_price () {
		Product myProduct = new Product("Cloud Popcorn", new BigDecimal(3.65), "Chip");
		assertEquals("3.65", myProduct.getPrice().toString());
	}
	
	@Test
	public void gettype_returns_type () {
		Product myProduct = new Product("Moonpie", new BigDecimal(1.80), "Candy");
		assertTrue(myProduct.getType() == "Candy");
	}

}