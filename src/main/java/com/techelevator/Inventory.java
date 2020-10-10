package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
	
	private Product product;
	
	public Map <String, Product> inventoryMap = new HashMap <>();
	//Product = name, price,
	
	public Inventory (int invnum) {
		
	}
	
	public void getQuantity(String slot ) {
		Product value = inventoryMap.get(slot);
		int invNum = value.getQuantity();
		System.out.println("inv for product selected "+ invNum);
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setInventory() throws NumberFormatException, FileNotFoundException {
			
		File inputFile = new File("vendingmachine.csv");
		try(Scanner fileScanner = new Scanner(inputFile)) {
			while(fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				
				String[] a = line.split("\\|");
				product = new Product (a[1], Double.parseDouble(a[2]), a[3]);
				inventoryMap.put(a[0], product);
				//slotNumber.add(a[0]);
			}
		}	
	}
	
	
	
	
	
	
	
	
	

}
