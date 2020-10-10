package com.techelevator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Inventory {

	private Product myProduct;
	private int quantity = 5;
	private String location;
	
//	public Map<String, Product> inventoryMap = new HashMap<>();

//	public void getQuantity(String slot) {
//		Product value = inventoryMap.get(slot);
//		int invNum = value.getQuantity();
//		System.out.println("inv for product selected " + invNum);
//	}

	public Inventory (String location, String name, BigDecimal price, String type) {
		this.location = location;
		myProduct = new Product (name, price, type);
	}
	
//	public Product getProduct() {
//		return product;
//	}


	
	public void decreaseInventory () {
		quantity -= 1;
	}
		
//		public String getProductName(String slotLocationNumber) {
//			return inventoryMap.get(slotLocationNumber).getName();
//		}
//		public BigDecimal getProductPrice(String slotLocationNumber) {
//			return inventoryMap.get(slotLocationNumber).getPrice();
//		}
//		public String getProductQuantity(String slotLocationNumber) {
//			return inventoryMap.get(slotLocationNumber).getQuantity();
//		}
//		public Product getProduct(String slotLocationNumber) {
//			return inventoryMap.get(slotLocationNumber);
//	}

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

//	public Map<String, Product> getInventoryMap() {
//		return inventoryMap;
//	}
}