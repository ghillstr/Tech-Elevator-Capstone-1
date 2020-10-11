package com.techelevator;

import java.math.BigDecimal;

public class Inventory {

	private Product myProduct;
	private int quantity = 5;
	private String location;
	
	public Inventory (String location, String name, BigDecimal price, String type) {
		this.location = location;
		myProduct = new Product (name, price, type);
	}
	
	public void decreaseInventory () {
		quantity -= 1;
	}

	public Product getMyProduct() {
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

}