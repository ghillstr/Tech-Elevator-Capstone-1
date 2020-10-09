package com.techelevator;



public abstract class Product {

	
	private String name;
	private double price;
	private String type;
	private int quantity;

	
	

	public Product (String name, double price, String type) {
		
		this.name = name;
		this.price = price;
		this.type = type;
		this.quantity = 5;
		}
	

	// Override the toString method so we can print array elements in main method
	@Override
    public String toString() { 
        return this.name + " $" + this.price; 
    }
	
	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
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
}
	
	
	  	
	  	






	public int getQuantity() {
		
		return quantity;
	}


	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
