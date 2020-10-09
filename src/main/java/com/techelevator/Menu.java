package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	
	private String title;
	private List<String>choices;

	
	public Menu(String title) {
	this.title = title;
	choices = new ArrayList<>();
	}
	
	public void addChoices(String addition) {
		choices.add(addition);
	}
	
	public void userChoise(int choiceInt) {
		if(choiceInt <= 0 || choiceInt>choices.size()) {
			System.out.println("Incorrect input.");
			return;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//	File inputFile = new File("vendingmachine.csv");
//	String[] sections;
//	
//	try(Scanner fileScanner = new Scanner(inputFile)) {
//		while(fileScanner.hasNextLine()) {
//			
//			String line = fileScanner.nextLine();
//			sections = line.split("\\|");
//			if (mainMenuChoice == 1) {
//				System.out.println(sections[0] + " " + sections[1] + " " + "getInventory()" + " in stock");
//			}
////			System.out.println(sections[0] + " " + sections[1]);
		
	
	//System.out.println(sections[0]);
	
	
	
	
	

}
