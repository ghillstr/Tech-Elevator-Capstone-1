package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.techelevator.VendingMachine;
import com.techelevator.Payment;

public class Menu {
	
	public static void main (String[] args) {
	
	//var
		private String input2;
		private VendingMachine myVendingMachine = new VendingMachine();
		boolean inMainMenu = false;
		boolean inSubMenu = false;
//		boolean customerExit = false;
	
		try (Scanner keyboard = new Scanner(System.in)) {
			myVendingMachine.setInventory();
//			while (!customerExit) {
			System.out.println("***********************************************************");
			System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
			System.out.println("***********************************************************");
			System.out.println();	

			while (!inMainMenu) {
				System.out.println("Please select an option from the list below");
				System.out.println("\n(1) Display Vending Machine Items");
				System.out.println("(2) Purchase");
				System.out.println("(3) Exit");
				System.out.print("\nEnter selection here >>> ");
				String input1 = keyboard.nextLine();	
			
				if (input1.equals("1")) {
					System.out.println(myVendingMachine.displayProduct());
				} else if (input1.equals("2")) {
					inSubMenu = true;;
				} else if (input1.equals("3")) {
					System.out.println("Thank you for the using the Vendo-matic 800!");
					System.exit(1);
				} else {
					System.out.println("Please enter a valid option number (1, 2, or 3) >>> ");
				}
		
			while (!inSubMenu) {
				System.out.println("Please select an option from the list below");
				System.out.println("\n(1) Feed money");
				System.out.println("(2) Select product");
				System.out.println("(3) Finish transaction");
				System.out.print("\nEnter selection here >>> ");
				input2 = keyboard.nextLine();
		
				if (input2.equals("1")) {
					System.out.print("Please insert money >>> :");
					input2 = keyboard.nextLine();
					int money = Integer.parseInt();
			
					if (money > 0) {
						myVendingMachine.addToCustomerMoney();
			}
			
		} else if (input2.equals("2")) {
			System.out.println(myVendingMachine.displayProduct());
			System.out.print("\nEnter selection here >>> ");
			input2 = keyboard.nextLine();
			String product = keyboard.nextLine().toUpperCase();
			
			if (myVendingMachine.getInventoryMap().containsKey(product)) {
				System.out.println(myVendingMachine.selectProduct(product));
			} else {
				System.out.println("Try again");
			}
			
		} else if (input2.equals("3")) {
			String change = changeBackToCustomer.changeInCoins(myVendingMachine.getDeposit());
			System.out.println(change);
			System.out.println(myVendingMachine.getInventoryMap().get(product).getMyProduct().typeMessage());

		} else {
			System.out.println("Please enter a valid option number (1, 2, or 3) >>> ");
		}
	}
	}
	}
	
	
	
	
	
	
	}
}
	