package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class ChangeBackToCostomerTests {
	
	@Test
	public void paasingADollar_return4Quarters() {

		// Arrange
		ChangeBackToCustomer myChangeBackToCustomer = new ChangeBackToCustomer();
		
		// Act
		String myChange = myChangeBackToCustomer.changeInCoins(new BigDecimal ("1"));

		// Assert
		Assert.assertEquals("Your change is 4 quarters, 0 dimes, 0 nickels.", myChange.toString());
	}
	@Test
	public void paasingZero_returnMessageThatChangeBackIsZero() {

		// Arrange
		ChangeBackToCustomer myChangeBackToCustomer = new ChangeBackToCustomer();
		
		// Act
		String myChange = myChangeBackToCustomer.changeInCoins(new BigDecimal ("0"));

		// Assert
		Assert.assertEquals("Your change is 0 quarters, 0 dimes, 0 nickels.", myChange.toString());
	}
	@Test
	public void paasingZero_returnMessageThatChangeBackIsZeo() {

		// Arrange
		ChangeBackToCustomer myChangeBackToCustomer = new ChangeBackToCustomer();
		
		// Act
		String myChange = myChangeBackToCustomer.changeInCoins(new BigDecimal ("1.66"));

		// Assert
		Assert.assertEquals("Your change is 6 quarters, 1 dimes, 1 nickels.", myChange.toString());
	}

}
