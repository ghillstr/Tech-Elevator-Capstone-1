package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class VendingMachine {

	public static void main (String[] args) throws FileNotFoundException {
		
		System.out.println("***********************************************************");
		System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
		System.out.println("***********************************************************");
		System.out.println();
		System.out.println("\n(1) Display Vending Machine Items");
		System.out.println("\n(2) Purchase");
		System.out.println("\n(3) Exit");
		System.out.println();
		System.out.print("\nPlease select an option from the list above: ");
		
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		Integer mainMenuChoice = Integer.parseInt(userInput);
		
	
		File inputFile = new File("vendingmachine.csv");
		String[] sections;
		
		try(Scanner fileScanner = new Scanner(inputFile)) {
			while(fileScanner.hasNextLine()) {
				
				String line = fileScanner.nextLine();
				sections = line.split("\\|");
				if (mainMenuChoice == 1) {
					System.out.println(sections[0] + " " + sections[1] + " " + "getInventory()" + " in stock");
				}
//				System.out.println(sections[0] + " " + sections[1]);
			}
		}	
		System.out.println(sections[0]);
		// Read input file and compose list of products

//		System.out.println(products);
	keyboard.close();	
//		public void productFileToProductList 
	}
	
}


//product	dispense item
//slot		display message
//money		select product
//computer	