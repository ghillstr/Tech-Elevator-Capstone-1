package com.techelevator;

import java.util.Map;
import java.util.Scanner;

public class Vendomatic800 {

	public static void main (String[] args) {

		VendingMachine vendomatic800 = new VendingMachine();	
		
		System.out.println("***********************************************************");
		System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
		System.out.println("***********************************************************");
		System.out.println();	
		System.out.print("Please select an option from the list below");
		
//		Menu mainMenu = new Menu ("main", choices);
//		
//		mainMenu.addChoices(1, " Display Vending Machine Items");
//		mainMenu.addChoices(2, " Purchase");
//		mainMenu.addChoices(3, " Exit");
//		
//		for (Map.Entry<Integer, String> entry : .entrySet()) {
//		    System.out.println(entry.getKey() + ") " + entry.getValue().toString());
//		}
//		
//		System.out.println(mainMenu);
		
		System.out.println("\n(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		System.out.print("\nEnter selection here >>> ");
	
		Scanner keyboard = new Scanner(System.in);
		String mainMenuChoice = keyboard.nextLine();
		
		
		
		if (mainMenuChoice.equals("1")) {
			// not actually printing the products
			System.out.println(vendomatic800.displayProduct());
		} else if (mainMenuChoice.equals("2")) {
			
			
			
			
		} else if (mainMenuChoice.equals("3")) {
			System.out.println("Thank you for the using the Vendo-matic 800!");
			System.exit(1);
		} else {
			System.out.println("Please enter a valid option number (1, 2, or 3) >>> ");
		}

//		while(mainMenuChoice != 1 || mainMenuChoice != 2 || mainMenuChoice != 3) {
//			System.out.println("\n(1) Display Vending Machine Items");
//			System.out.println("(2) Purchase");
//			System.out.println("(3) Exit");
//			System.out.println();
//			System.out.print("Enter selection here >>> ");
//			String userInputMainMenuTwo = keyboard.nextLine();
//			mainMenuChoice = Integer.parseInt(userInputMainMenuTwo);
//		}
//
//		
//	}
	}
}
