package com.techelevator;

import java.math.BigDecimal;

public class ChangeBackToCustomer {

	// Delete this comment
	static int quarters;
	static int dimes;
	static int nickels;
	static double customerChange;
	VendingMachine myVendingMachine = new VendingMachine();


	public String changeInCoins(BigDecimal change) {
		String result = "";
		
		customerChange = change.doubleValue() * 100;
		while (customerChange >= 25) {
			quarters++;
			customerChange -= 25;
		}
		while (customerChange >= 10) {
			dimes++;
			customerChange -= 10;
		}
		while (customerChange >= 5) {
			nickels++;
			customerChange -= 5;
		}

		result = "Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels.";
		return result;
	}
}