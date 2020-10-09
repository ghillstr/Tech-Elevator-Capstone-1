package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {

	//private String location;
	private String name;
	private Integer price;
	private String type;

//	public Product (String location, String name, Double price, String type) {
//		this.location = location;
//		this.name = name;
//		this.price = price;
//		this.type = type;
//	}
	
	
		
	
	
	public Product (String name, String price, String type) throws FileNotFoundException {
		
		File inputFile = new File("vendingmachine.csv");
		

		
		try(Scanner fileScanner = new Scanner(inputFile)) {
			while(fileScanner.hasNextLine()) {
				
				String line = fileScanner.nextLine();
				

				String[] sections = line.split("\\|");
				System.out.println(sections[0] + sections[1]);
				
				
				
			this.name = sections[1];
			//this.name = sections[1];
			this.price = Integer.parseInt(sections[2]);
			this.type = sections[3];
			
			System.out.println(name);
		}
	}}
	
	public void message (String type) {
		if (type == "Chip") {
			System.out.println("Crunch Crunch, Yum!");
		} else if (type == "Candy") {
			System.out.println("Munch Munch, Yum!");
		} else if (type == "Drink") {
			System.out.println("Glug Glub, Yum!");
		} else {
			System.out.println("Chew Chew, Yum!");
		}
	}
	
//	public String getLocation() {
//		return location;
//	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

}
