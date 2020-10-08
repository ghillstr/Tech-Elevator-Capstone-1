package com.techelevator;

public class Slot extends Product {
	
	private int inventory;
	
	public Slot(String location) {
		super (location);
		this.inventory = 5;
	}
	
	public int getInventoryNumber (String location) {
		 if(item chosen) {
			 inventory -= 1;
		 }
		 return inventory;
	}
	
	public void SoldOut(int inventory) {
		if (inventory <= 0) {
			System.out.println("Sold out");
		}
	}

	public int getInventory() {
		return inventory;
	}
}
