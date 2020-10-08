package com.techelevator;

public class Payment {
	
	private int paymentAmount;
	private int change;

	
	
	//constructor , payment amount in $1,2,5,10
	public Payment(int paymentAmount) {
		this.paymentAmount = paymentAmount * 100;
		change = 0;
	}

	
	//getter
	public int getPaymentAmount() {
		return paymentAmount;
	}

	
	//checking the amount
	public boolean isItValid() {
		if(paymentAmount != 0) {
			return true;
		}
		return false;
	}
	
	//calculate remaining money
	public int remainingBalance(int amountToWithdraw) {
		change = paymentAmount-amountToWithdraw;
		return change;
	}
	
	
	//calculate change in coins and print it out to customer
	public void changeInCoins(int change) {
	int quarters = 0;
	int dimes = 0;
	int nickels = 0;
	
	while (change >= 25) {
		quarters++;
		change-=25;
	}
	while (change >= 10) {
		dimes++;
		change-=10;
	}
	while (change >= 5) {
		nickels++;
		change-=5;
	}
	
	System.out.println("Your chnage is "+quarters+" quarters, "+ dimes+" dimes, "+nickels+ " nickels.");

	}
	
	
	
	
	

}
