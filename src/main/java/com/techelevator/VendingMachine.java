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