package com.techelevator;

public class Slot extends Product {
	
	private int inventory = 5;
	
	
	public Slot(String location, int inventory) {
	super (location);
	this.inventory =inventory;
	}
	
	public int dispense() {
		 if(item choosen);
		 inventory = inventory - 1;
		 return getInventory();
	}
	public String SoldOut() {
		if (inventory < 0) {
			return "Sold Out";
		}
		return Integer.toString(getInventory());
	}
	

	public int getInventory() {
		return inventory;
	}

	public void setInventory(int inventory) {
		this.inventory = inventory;
	}

	
		

}
