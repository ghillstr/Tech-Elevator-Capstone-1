package com.techelevator;

import java.util.Scanner;

public class Vendomatic800 {

	public static void main (String[] args) {

		System.out.println("***********************************************************");
		System.out.println("Welcome to the Vendo-matic 800, an Umbrella Corp. product.");
		System.out.println("***********************************************************");
		System.out.println();	

		Menu mainMenu = new Menu ("main");
		
		mainMenu.addChoices("\n(1) Display Vending Machine Items");
		mainMenu.addChoices("(2) Purchase");
		mainMenu.addChoices("(3) Exit");
		System.out.print("Please select an option from the list above:");
		System.out.print("Enter selection here >>> ");
	
		Scanner keyboard = new Scanner(System.in);
		
	}
}
