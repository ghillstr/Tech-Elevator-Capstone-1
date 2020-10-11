package com.techelevator;

import java.math.BigDecimal;

public class ChangeBackToCustomer {
	
	static int quarters;
	static int dimes;
	static int nickels;
	static double customerChange;
	
	//calculate change in coins and print it out to customer
	public static String changeInCoins(BigDecimal change) {
		String result = "";
		customerChange = change.doubleValue() *100;
	while (customerChange >= 25) {
		quarters++;
		customerChange-=25;
	}
	while (customerChange >= 10) {
		dimes++;
		customerChange-=10;
	}
	while (customerChange >= 5) {
		nickels++;
		customerChange-=5;
	}

	//return Double.toString(customerChange);
	result = "Your change is "+quarters+" quarters, "+ dimes+" dimes, "+nickels+ " nickels.";
	return result;
	}
}