package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
	
	//private int myInventory;
	private Product product;
	//private List <String> slotNumber = new ArrayList <>();
	
	public Map <String, Product> inventoryMap = new HashMap <>();
	//Product = name, price
	
	
	
	
//	public Inventory(int myInventory) {
//		this.myInventory = myInventory;
//	}
	
	
	
//	
//	public int getMyInventory() {
//		return myInventory;
//	}
//	
//	
	
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
				product = new Product (a[1], Double.parseDouble(a[2]));
				inventoryMap.put(a[0], product);
		
			}
		}	
	}
	
	
	
	
	
	
	
	
	

}
