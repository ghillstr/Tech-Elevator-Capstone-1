package com.techelevator;



public class Product {

	
	private String name;
	private double price;
	
	private int quantity;

	
	

	public Product (String name, double price) {
		
		this.name = name;
		this.price = price;
		this.quantity = 5;
		}
	

	// Override the toString method so we can print array elements in main method
	@Override
    public String toString() { 
        return this.name + " $" + this.price; 
    }
	
	
	
	// Getters
	//public String getLocation() {
	//	return location;
	//}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	
	
	  	
	  	






	public int getQuantity() {
		
		return quantity;
	}


	
	

}
