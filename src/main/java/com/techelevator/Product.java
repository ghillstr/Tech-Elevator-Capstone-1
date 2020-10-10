package com.techelevator;

import java.math.BigDecimal;

public class Product {

	//var
	private String name;
	private BigDecimal price;
	private String type;
	
	//constructor
	public Product (String name, BigDecimal price, String type) {	
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String typeMessage () {
		if (type.equals("Chip")) {
			return "Crunch Crunch, Yum!";
		} else if (type.equals("Gum")) {
			return "Chew Chew, Yum!";
		} else if (type.equals("Drink")) {
			return "Glug Glug, Yum!";
		} else if (type.equals("Candy")) {
			return "Munch Munch, Yum!";
		} else {
			return "";
		}
	}
	
	// Override the toString method so we can print array elements in main method
	@Override
    public String toString() { 
        return this.name + " $" + this.price; 
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
