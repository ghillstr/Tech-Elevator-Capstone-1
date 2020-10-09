package com.techelevator;



public class Product {

	
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
	//public String getLocation() {
	//	return location;
	//}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}


	public int getQuantity() {
		
		return quantity;
	}


	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
