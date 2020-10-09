package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	public static void main (String[] args) throws FileNotFoundException {
		
		// Import data file
		File inputFile = new File("vendingmachine.csv");

		// Create new ArrayList to store information from data file
		List<Product> products = new ArrayList<Product>();
		
		try(Scanner fileScanner = new Scanner(inputFile)) {
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				products.add(new Product(line));
			}
		}	
		
		// Welcome message
		System.out.println("***********************************************************");
		System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
		System.out.println("***********************************************************");
		System.out.println();		
		System.out.print("Please select an option from the list below:");
		System.out.println();
		System.out.println("\n(1) Display Vending Machine Items");
		System.out.println("(2) Purchase");
		System.out.println("(3) Exit");
		System.out.println();
		System.out.println("Enter selection here >>> ");
		
		// Ask user for option from main menu
		try(Scanner keyboard = new Scanner(System.in)) {
			String userInputMainMenu = keyboard.nextLine();
			Integer mainMenuChoice = Integer.parseInt(userInputMainMenu);
		
			// How do we handle entries that are not an integer?
			if (mainMenuChoice == 3) {
				System.out.println("Thank you for using the Vendo-matic 800!");
				System.exit(1);
			} else {
				if (mainMenuChoice == 1) {
					for (Product product : products) {
						System.out.println(product + " " + " in stock");
						// How do we print out the current inventory nex to each product?
					}
				} else if (mainMenuChoice == 2) {

				} else {
					System.out.println("Please enter a valid option number (1, 2, or 3) >>> ");
					String userInputValidOption = keyboard.nextLine();
					mainMenuChoice = Integer.parseInt(userInputValidOption);
					//How do we return to main menu with this new value?
				}	
			}
//			// How do we allow the user to make another choice?	Do we need a loop?	
//			System.out.println("***************************");
//			System.out.println();
//			System.out.print("To continue, please select an option from the list below:");
//			System.out.println();
//			System.out.println("\n(1) Display Vending Machine Items");
//			System.out.println("(2) Purchase");
//			System.out.println("(3) Exit");
//			System.out.println();
//			System.out.println("Enter selection here >>> ");

		}
	}
}