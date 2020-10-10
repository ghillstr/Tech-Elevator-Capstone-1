package com.techelevator;

import java.math.BigDecimal;

public class Payment {
	
	private int paymentAmount;
	private int change;
	private BigDecimal deposit = new BigDecimal(0.00).setScale(2);
	
	
//	//constructor , payment amount in $1,2,5,10
//	public Payment(int paymentAmount) {
//		this.paymentAmount = paymentAmount * 100;
//		change = 0;
//	}

	
	//getter
	public int getPaymentAmount() {
		return paymentAmount;
	}
	public BigDecimal getDeposit() {
		return deposit;
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

	public void customerMoney(int money) {
	if(money==1) {
		deposit=deposit.add(new BigDecimal(1.00));
		
	}else if(money==2) {
		deposit=deposit.add(new BigDecimal(2.00));}
	else if(money==5) {
		deposit=deposit.add(new BigDecimal(5.00));}
	else if(money==10) {
		deposit=deposit.add(new BigDecimal(10.00));}
	System.out.println("Your balance is "+ deposit+", whatwould you like to purchase?");


	
	
	
	
	
	

}
