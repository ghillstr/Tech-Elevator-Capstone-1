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
		String result;
		if (type.equals("Chip")) {
			result = "Crunch Crunch, Yum!";
		} else if (type.equals("Gum")) {
			result = "Chew Chew, Yum!";
		} else if (type.equals("Drink")) {
			result = "Glug Glug, Yum!";
		} else if (type.equals("Candy")) {
			result = "Munch Munch, Yum!";
		} else {
			result = "";
		}
		return result;
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
