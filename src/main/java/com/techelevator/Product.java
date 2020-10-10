package com.techelevator;

import java.math.BigDecimal;

public class Product {


	//var
	private String name;
	private BigDecimal price;
	private int quantity;

	
	
	//constructor
	public Product (String name, BigDecimal price) {	
		this.name = name;
		this.price = price;
		this.quantity = 5;
	
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
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
