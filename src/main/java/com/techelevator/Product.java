package com.techelevator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {

	private String location;
	private String name;
	private Integer price;
	private String type;

//	public Product (String location, String name, Double price, String type) {
//		this.location = location;
//		this.name = name;
//		this.price = price;
//		this.type = type;
//	}
	
	File inputFile = new File("vendingmachine.csv");
	
//	List<Product> products = new ArrayList<Product>();
	
	try(Scanner fileScanner = new Scanner(inputFile)) {
		while(fileScanner.hasNextLine()) {
			
			String line = fileScanner.nextLine();
			
//			if (line != "" || line != null) {
			String[] sections = line.split("\\|");
			System.out.println(sections[0] + sections[1]);
		}	
		
		}
	}
	
	public Product (String line) {

			
			this.location = sections[0];
			this.name = sections[1];
			this.price = Integer.parseInt(sections[2]);
			this.type = sections[3];
		}
	}
	
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
	
	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

}
