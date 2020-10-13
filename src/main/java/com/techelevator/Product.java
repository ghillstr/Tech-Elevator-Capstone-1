package com.techelevator;

import java.math.BigDecimal;

public abstract class Product extends VendingMachine {

	//var
	private String name;
	private BigDecimal price;
	protected String type;
	
	// Delete this comment
	
	//constructor
	public Product (String name, BigDecimal price) {	
		this.name = name;
		this.price = price;
		
	}

	public abstract String typeMessage(); 
	
		
//		String result;
//		if (type.equals("Chip")) {
//			result = "Crunch Crunch, Yum!";
//		} else if (type.equals("Gum")) {
//			result = "Chew Chew, Yum!";
//		} else if (type.equals("Drink")) {
//			result = "Glug Glug, Yum!";
//		} else if (type.equals("Candy")) {
//			result = "Munch Munch, Yum!";
//		} else {
//			result = "";
//		}
//		return result;
//	}
	
	// Override the toString method so we can print array elements in main method
	@Override
    public String toString() { 
        return this.name + " $" + this.price + " " + this.type; 
    }
	
	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}
//
//	public String getType() {
//		return type;

//	}
}
