package com.techelevator;



import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTests {
	@Test
	public void passing2Dollars_return2DollarsBalance() {

		// Arrange
		VendingMachine myMachine = new VendingMachine();
		
		// Act
		String balance = myMachine.addToCustomerMoney(2);

		// Assert
		Assert.assertEquals("2.00", balance);
	}
	@Test
	public void passing0Dollars_returnZeroDollarsBalance() {

		// Arrange
		VendingMachine myMachine = new VendingMachine();
		
		// Act
		String balance = myMachine.addToCustomerMoney(0);

		// Assert
		Assert.assertEquals("0.00", balance);
	}
	@Test
	public void passing3Dollars_returnThreeDollarsBalance() {

		// Arrange
		VendingMachine myMachine = new VendingMachine();
		
		// Act
		String balance = myMachine.addToCustomerMoney(3);

		// Assert
		Assert.assertEquals("0.00", balance);
	}
	
	

}
