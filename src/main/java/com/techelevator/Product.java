package com.techelevator;

import java.math.BigDecimal;
import java.math.MathContext;

public class Product {

	private String name;
	private BigDecimal price;
	private String type;
	
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

	@Override
    public String toString() { 
        return this.name + " $" + this.price + " " + this.type; 
    }
	
	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		MathContext m = new MathContext(3);
		return price.round(m).setScale(2);
	}

	public String getType() {
		return type;

	}
}
