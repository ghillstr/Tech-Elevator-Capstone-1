package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.NumberFormatException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.math.BigDecimal;

public class VendingMachine {

	private Map<String, Inventory> inventoryMap = new HashMap<>();
	private BigDecimal deposit = new BigDecimal(0);
	Log myLog = new Log();
	BigDecimal startingDepositForLog = new BigDecimal(0);
	BigDecimal finalDepositForLog = new BigDecimal(0);
	
	
	
	
	public void setInventory() throws NumberFormatException, FileNotFoundException {	
		File inputFile = new File("vendingmachine.csv");
		
		if(inputFile.exists() == false) { 
			System.out.println("vendingmachine.csv"+" does not exist");
			System.exit(1); 
		} else if(inputFile.isFile() == false) {
			System.out.println("vendingmachine.csv"+" is not a file");
			System.exit(1); 
		}else {try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if (!line.isEmpty()) {
					String[] a = line.split("\\|");

					Inventory myInventory = new Inventory(a[0], a[1], new BigDecimal(a[2]), a[3]);
					inventoryMap.put(a[0], myInventory);

				}
			}
		}}
	}

	public String displayProduct() {
		String result = "";
		for (String key : getInventoryMap().keySet()) {
			Inventory myInventory = getInventoryMap().get(key);
			result += myInventory.getLocation() + " " + myInventory.getMyProduct().getName() + " "
					+ myInventory.getMyProduct().getPrice() + " " + myInventory.getQuantity() + " in stock\n";
		}
		return result;
	}

	public void resetDepositAfterChange() {
		BigDecimal zero = BigDecimal.ZERO;
		if (deposit.compareTo(zero) > 0)
			deposit = zero;
	}

	public String addToCustomerMoney(int moneyInput) {
		String actionPerformed = "FEED MONEY:";
		
		try {
		if(moneyInput != 1 && moneyInput != 2 && moneyInput != 5 && moneyInput != 10) {
			System.out.println("Please insert bills in denominations of $1, $2, $5, or $10.");
		} else if (moneyInput == 1) {
			deposit = deposit.add(new BigDecimal(1.00));
			myLog.addToLog(actionPerformed, new BigDecimal(1.00), deposit.setScale(2));
		} else if (moneyInput == 2) {
			deposit = deposit.add(new BigDecimal(2.00));
			myLog.addToLog(actionPerformed, new BigDecimal(2.00), deposit.setScale(2));
		} else if (moneyInput == 5) {
			deposit = deposit.add(new BigDecimal(5.00));
			myLog.addToLog(actionPerformed, new BigDecimal(5.00), deposit.setScale(2));
		} else if (moneyInput == 10) {
			deposit = deposit.add(new BigDecimal(10.00));
			myLog.addToLog(actionPerformed, new BigDecimal(10.00), deposit.setScale(2));
		} else {
			System.out.println("Please insert bills in denominations of $1, $2, $5, or $10.");
		}      
		} catch (NumberFormatException e) {
	        e.getMessage(); 
	      }
		
		System.out.println("Your balance is $" + deposit.setScale(2) + ".");
		startingDepositForLog =deposit.setScale(2);
		return startingDepositForLog.toString();
	}

	public String selectProduct(String selectedProduct) {
		String result = "";
		String selectedProductQuantity = getInventoryMap().get(selectedProduct).getQuantity();
		BigDecimal selectedProductPrice = getInventoryMap().get(selectedProduct).getMyProduct().getPrice();
		String actionPerformedName = getInventoryMap().get(selectedProduct).getMyProduct().getName();
		String actionPerformedLocation = getInventoryMap().get(selectedProduct).getLocation();
		String actionPerformed = actionPerformedName + actionPerformedLocation;
		
		if (!selectedProductQuantity.equals("Sold out!") && getDeposit().compareTo(selectedProductPrice) >= 0) {

			getInventoryMap().get(selectedProduct).decreaseInventory();

			deposit = deposit.subtract(selectedProductPrice);

			result = "You have purchased one " + getInventoryMap().get(selectedProduct).getMyProduct().getName()
					+ " at a cost of $" + selectedProductPrice + ". Your remaining balance is $" + getDeposit() + ".";

			myLog.addToLog(actionPerformed, startingDepositForLog, deposit);
			finalDepositForLog = deposit;
			
		} else if (getInventoryMap().containsKey(selectedProduct.toUpperCase())
				&& selectedProductQuantity.equals("Sold out!")) {
			result = "Sorry, this item is sold out. Please select another item.";
		} else if (getDeposit().compareTo(selectedProductPrice) < 0) {
			result = "Sorry, you do not have enough money to purchase this product. Please enter another selection or feed more money.";
		}
		return result;
	}

	public void giveChangeForLog () {
		myLog.addToLog("GIVE CHANGE:", finalDepositForLog, new BigDecimal(0));
	}
	
	public Map<String, Inventory> getInventoryMap() {
		return inventoryMap;
	}

	public void setInventoryMap(Map<String, Inventory> inventoryMap) {
		this.inventoryMap = inventoryMap;
	}

	public BigDecimal getDeposit() {
		return deposit;
	}

	public BigDecimal getFinalDepositForLog() {
		return finalDepositForLog;
	}
	
}
