package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

	private Product product;
	public Map<String, Product> inventoryMap = new HashMap<>();

//	public void getQuantity(String slot) {
//		Product value = inventoryMap.get(slot);
//		int invNum = value.getQuantity();
//		System.out.println("inv for product selected " + invNum);
//	}

	public Product getProduct() {
		return product;
	}

	public void setInventory() throws NumberFormatException, FileNotFoundException {

		File inputFile = new File("vendingmachine.csv");
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if (!line.isEmpty()) {
					String[] a = line.split("\\|");

					product = new Product(a[1], new BigDecimal(a[2]));
					inventoryMap.put(a[0], product);

				}
			}
		}}
		
		public String getProductName(String slotLocationNumber) {
			return inventoryMap.get(slotLocationNumber).getName();
		}
		public BigDecimal getProductPrice(String slotLocationNumber) {
			return inventoryMap.get(slotLocationNumber).getPrice();
		}
		public String getProductQuantity(String slotLocationNumber) {
			return inventoryMap.get(slotLocationNumber).getQuantity();
		}
		public Product getProduct(String slotLocationNumber) {
			return inventoryMap.get(slotLocationNumber);
	}


