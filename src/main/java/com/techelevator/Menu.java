package com.techelevator;

import java.util.Scanner;
import com.techelevator.VendingMachine;
import com.techelevator.ChangeBackToCustomer;
import java.io.FileNotFoundException;

public class Menu {

	public static void main(String[] args) throws FileNotFoundException {

		// var
		String input2;
		VendingMachine myVendingMachine = new VendingMachine();
		boolean isMainMenuComplete = false;
		boolean isSubMenuComplete = false;
		boolean customerExit = false;
		String product = "";
		ChangeBackToCustomer myChange = new ChangeBackToCustomer();

		try (Scanner keyboard = new Scanner(System.in)) {
			myVendingMachine.setInventory();
//			while (!customerExit) {
			System.out.println("***********************************************************");
			System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
			System.out.println("***********************************************************");
			System.out.println();

			while (!isMainMenuComplete) {
				System.out.println("Please select an option from the list below");
				System.out.println("\n(1) Display Vending Machine Items");
				System.out.println("(2) Purchase");
				System.out.println("(3) Exit");
				System.out.print("\nEnter selection here >>> ");
				String input1 = keyboard.nextLine();

				if (input1.equals("1")) {
					System.out.println(myVendingMachine.displayProduct());
				} else if (input1.equals("2")) {
					isMainMenuComplete = true;
					isSubMenuComplete = false;
					;
				} else if (input1.equals("3")) {
					System.out.println("Thank you for the using the Vendo-matic 800!");
					System.exit(1);
				} else {
					System.out.println("Please enter a valid option number (1, 2, or 3) >>> ");
				}

				while (!isSubMenuComplete) {
					System.out.println("Please select an option from the list below");
					System.out.println("\n(1) Feed money");
					System.out.println("(2) Select product");
					System.out.println("(3) Finish transaction");
					System.out.print("\nEnter selection here >>> ");
					input2 = keyboard.nextLine();

					if (input2.equals("1")) {
						System.out.print("Please insert money >>> : $");
						input2 = keyboard.nextLine();
						int money = Integer.parseInt(input2);

						if (money > 0) {
							myVendingMachine.addToCustomerMoney(money);
						}
						isSubMenuComplete = false;
//					} else if (input2.equals("2") && myVendingMachine.getDeposit().equals("0")) {
//						System.out.println("Insufficient funds. Please insert money before selecting a product.");
//						isSubMenuComplete = true;
					} else if (input2.equals("2") && !myVendingMachine.getDeposit().equals("0")) {
						System.out.println(myVendingMachine.displayProduct());
						System.out.print("\nEnter selection here >>> ");
						product = keyboard.nextLine().toUpperCase();
						
						if (myVendingMachine.getInventoryMap().containsKey(product)) {
							System.out.println(myVendingMachine.selectProduct(product));
							
						} else {
							System.out.println("Try again");
						}

					} else if (input2.equals("3")) {
//			ChangeBackToCustomer myChange = new ChangeBackToCustomer();
						String change = myChange.changeInCoins(myVendingMachine.getDeposit());
						System.out.println(change);
						System.out.println(
								myVendingMachine.getInventoryMap().get(product).getMyProduct().typeMessage());
						isSubMenuComplete = true;
						isMainMenuComplete = false;
					} else {
						System.out.println("Please enter a valid option number (1, 2, or 3) >>> ");
					}
				}
			}
		}

	}
}
