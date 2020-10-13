package com.techelevator;

import java.math.BigDecimal;

public class Inventory {



	private Item myProduct;
	private int quantity = 5;
	private String location;
	
	public Inventory (String location, String name, BigDecimal price, String type) {
		this.location = location;
		myProduct = new Item (name, price, type);
	}
	@Override
    public String toString() { 
        return this.location + " " + myProduct; 
    }
	
	public void decreaseInventory () {
		quantity -= 1;
	}

	public Item getMyProduct() {
		return myProduct;
	}

	public String getQuantity() {
		if (quantity < 1) {
			return "Sold out!";
		} else {
			return String.valueOf(quantity);
		}
	}

	public String getLocation() {
		return location;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


}