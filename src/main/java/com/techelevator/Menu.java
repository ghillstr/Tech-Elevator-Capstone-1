package com.techelevator;


import java.util.HashMap;
import java.util.Map;

public class Menu {
	//var
	private String title;
	private Map<Integer, String> choices;
	
	//constructor
	public Menu(String title) {
	this.title = title;
	choices = new HashMap<Integer, String>();
	}
	
	//getters
	public String getTitle() {
		return title;
	}

	public Map<Integer, String> getChoices() {
		return choices;
	}

	//method to add to array menu
	public void addChoices(Integer intAddition, String stringAddition) {
		choices.put(intAddition, stringAddition);
	}
	
	public void userChoice(int choiceInt) {
		if(choiceInt <= 0 || choiceInt>choices.size()) {
			System.out.println("Incorrect input.");
			return;
		}
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
	
	
	
	
	


