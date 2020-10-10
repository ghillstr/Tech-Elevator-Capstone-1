package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {

	
		
		
	
		
		Slot mySlot = new Slot(null);
		Menu mainMenu = new Menu ("main");
		
		mainMenu.addChoices("\n(1) Display Vending Machine Items");
		mainMenu.addChoices("(2) Purchase");
		mainMenu.addChoices("(3) Exit");
		
		
		// Welcome message
		System.out.println("***********************************************************");
		System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
		System.out.println("***********************************************************");
		System.out.println();		
		System.out.print("Please select an option from the list below:");
		System.out.println(mainMenu);
		//System.out.println("\n(1) Display Vending Machine Items");
		//System.out.println("(2) Purchase");
		//System.out.println("(3) Exit");
		System.out.println();
		System.out.print("Enter selection here >>> ");
		
		// Ask user for option from main menu
		
		Scanner keyboard = new Scanner(System.in);
		
		try { 
			
			String userInputMainMenu = keyboard.nextLine();
			Integer mainMenuChoice = Integer.parseInt(userInputMainMenu);
			
			mainMenu.userChoise(mainMenuChoice);
			
			
			if (mainMenuChoice == 1) {
				for (Product product : products) {
					System.out.println(product + "      " + mySlot.getInventory() + " in stock");
					// How do we print out the current inventory next to each product?
				}
			} else if (mainMenuChoice == 2) {
					
			} else if (mainMenuChoice == 3) {
				System.out.println("Thank you for using the Vendo-matic 800!");
				System.exit(1);}}}
				
		/*	} else {
				System.out.print("Please enter a valid option number (1, 2, or 3) >>> ");
				String userInputValidOption = keyboard.nextLine();
				mainMenuChoice = Integer.parseInt(userInputValidOption);
			}
			while(mainMenuChoice != 1 || mainMenuChoice != 2 || mainMenuChoice != 3) {
				System.out.println("\n(1) Display Vending Machine Items");
				System.out.println("(2) Purchase");
				System.out.println("(3) Exit");
				System.out.println();
				System.out.print("Enter selection here >>> ");
				String userInputMainMenuTwo = keyboard.nextLine();
				mainMenuChoice = Integer.parseInt(userInputMainMenuTwo);
			}

			
			} catch (NumberFormatException e) {
			System.out.print("Please enter a valid option number (1, 2, or 3) >>> ");
			String userInputValidOption = keyboard.nextLine();
			mainMenuChoice = Integer.parseInt(userInputValidOption);
			}
		}
		}
	

	
	


	
//	// How do we allow the user to make another choice?	Do we need a loop?	
//	System.out.println("***************************");
//	System.out.println();
//	System.out.print("To continue, please select an option from the list below:");
//	System.out.println();
//	System.out.println("\n(1) Display Vending Machine Items");
//	System.out.println("(2) Purchase");
//	System.out.println("(3) Exit");
//	System.out.println();
//	System.out.println("Enter selection here >>> ");