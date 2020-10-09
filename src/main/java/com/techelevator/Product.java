package com.techelevator;

import java.math.BigDecimal;

public class Product {

	private String location;
	private String name;
	// Use BigDecimal to keep both values after the decimal point
	// i.e. $1.50 instead of $1.5
	private BigDecimal price;
	private String type;

	// Split each line of input file into sections and identify them
	public Product (String line) {
		String[] sections = line.split("\\|");
		
		this.location = sections[0];
		this.name = sections[1];
		this.price = new BigDecimal(sections[2]);
		this.type = sections[3];
	}

	// Override the toString method so we can print array elements in main method
	@Override
    public String toString() { 
        return this.location + " " + this.name + " $" + this.price; 
    }
	
	// State which message should be displayed when purchasing each type in main method
	public void message (String type) {
		if (type == "Chip") {
			System.out.println("Crunch Crunch, Yum!");
		} else if (type == "Candy") {
			System.out.println("Munch Munch, Yum!");
		} else if (type == "Drink") {
			System.out.println("Glug Glug, Yum!");
		} else {
			System.out.println("Chew Chew, Yum!");
		}
	}
	
	// Getters
	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

}
