package com.techelevator;

import java.math.BigDecimal;

public class ChangeBackToCustomer {
	
	
	
	
	//calculate change in coins and print it out to customer
	public void changeInCoins(BigDecimal change) {
	int quarters = 0;
	int dimes = 0;
	int nickels = 0;
	double customerChange = change.doubleValue() *100;
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
	
	System.out.println("Your chnage is "+quarters+" quarters, "+ dimes+" dimes, "+nickels+ " nickels.");

	}
}