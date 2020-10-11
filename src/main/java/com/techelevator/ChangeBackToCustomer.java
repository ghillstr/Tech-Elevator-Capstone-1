package com.techelevator;

import java.math.BigDecimal;

public class ChangeBackToCustomer {

	private int quarters;
	private int dimes;
	private int nickels;
	private double customerChange;

	public String changeInCoins(BigDecimal change) {
		String result = "";
		if (!change.equals(new BigDecimal("0"))) {
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
		} else { 
			result = "Your change is 0 quarters, 0 dimes, 0 nickels.";
			return result;
		}
	}
}