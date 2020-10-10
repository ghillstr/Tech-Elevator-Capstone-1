package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.NumberFormatException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.math.BigDecimal;

public class VendingMachine {
	
	private List<Product> cart = new ArrayList<Product>();
	private Map<String, Inventory> inventoryMap = new HashMap<>();
	private BigDecimal customerBalance = new BigDecimal(0);
	private BigDecimal cartBalance = new BigDecimal(0);
	private List<Product> soldProducts = new ArrayList<Product> ();
	
	
	public VendingMachine (Map<String, Inventory> inventoryMap) {
		this.inventoryMap = inventoryMap;
	}
	
	public void setInventory() throws NumberFormatException, FileNotFoundException {

		// Check to make sure input file exists
		File inputFile = new File("vendingmachine.csv");
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine();
				if (!line.isEmpty()) {
					String[] a = line.split("\\|");

					Inventory myInventory = new Inventory(a[0], a[1], new BigDecimal(a[2]), a[3]);
					inventoryMap.put(a[0], myInventory);

				}
			}
		}
	}
	


	public void showInventoryToCustomerAndKeepTrackForSalesReport() {
		Inventory inStock;
		int sold;
		
		for(String key : inventoryMap.keySet()) {
			inStock = inventoryMap.get(key);
			if(inStock.getQuantity().equals("Sold out!")) {
				sold = 5;
				System.out.println("Sold out!");
			}else {
				sold = 5 - Integer.valueOf(inStock.getQuantity());
				System.out.println(inStock.getQuantity());
			}
		}
	}
	
	public void displayProduct () {
		for (String key : getInventoryMap().keySet()) {
			Inventory myInventory = getInventoryMap().get(key);
			System.out.println(myInventory.getLocation() + " " + myInventory.getMyProduct().getName() + " " + myInventory.getMyProduct().getPrice() + " " + myInventory.getQuantity() + " in stock");
		}
	}
	
	// How do we connect this to Payment class?
	// How and where do we handle change?
	// How and where do we display the product type message
	public void addMoney(int paymentAmount) {
		setCustomerBalance((getCustomerBalance().add(new BigDecimal(cashFed))));
		System.out.println("Your balance is: $" + getCustomerBalance().toString());
		// add cashFed to log
	}
	
	public String selectProduct (String selectedProduct) {
		
		String selectedProductQuantity = getInventoryMap().get(selectedProduct).getQuantity();
		BigDecimal selectedProductPrice = getInventoryMap().get(selectedProduct).getMyProduct().getPrice();
		
		if (!selectedProductQuantity.equals("Sold out!") && getCustomerBalance().compareTo(selectedProductPrice) >= 0) {
			
			cart.add(getInventoryMap().get(selectedProduct).getMyProduct());
			
			getInventoryMap().get(selectedProduct).decreaseInventory();
			
			setCustomerBalance(getCustomerBalance().subtract(selectedProductPrice));
			
			cartBalance = cartBalance.add(selectedProductPrice);
			
			// connect to logger here
			
			return "You have purchased one " + getInventoryMap().get(selectedProduct).getMyProduct().getName() + ". Your remaining balance is $" + getCustomerBalance();
			
		} else if (getInventoryMap().containsKey(selectedProduct.toUpperCase()) && selectedProductQuantity.equals("Sold out!")) {
			return "Sorry, this item is sold out. Please select another item.";
		} else if (getCustomerBalance().compareTo(selectedProductPrice) < 0) {
			return "Sorry, you do not have enough money to purchase this product. Please enter another selection or feed more money.";
		} else {
			return "Sorry, that is not a valid selection. Please make another selection.";	
		}
	}

	public void finishTransactionAndKeepTrackForSalesReport () {
		for (Product each : cart) {
			soldProducts.add(each);
		} while (cart.size() > 0) {
			cart.remove(0);
		}
	}
	
	public Map<String, Inventory> getInventoryMap() {
		return inventoryMap;
	}
	
	public void setInventoryMap(Map<String, Inventory> inventoryMap) {
		this.inventoryMap = inventoryMap;
	}
	
	public BigDecimal getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(BigDecimal customerBalance) {
		this.customerBalance = customerBalance;
	}

	public BigDecimal getCartBalance() {
		return cartBalance;
	}

	public void setCartBalance(BigDecimal cartBalance) {
		this.cartBalance = cartBalance;
	}
	
	public List<Product> getSoldProducts() {
		return soldProducts;
	}

	public void setSoldProducts(List<Product> soldProducts) {
		this.soldProducts = soldProducts;
	}
	
//	Menu main = new Menu("main");
//	// should contain a list of options
//	main.addChoices("(1) Option 1");
//	
	
//variables
//constructor
	
	
	
	//public VendingMachine (String[] names, double[] prices, inventory) {
		//this.product = product;
		
	}
	


//
//
//	private List<Product> myProduct = new ArrayList<>() {
//		
//	}
//	
//		try { 
//			Scanner keyboard = new Scanner(System.in);
//			String userInputMainMenu = keyboard.nextLine();
//			Integer mainMenuChoice = Integer.parseInt(userInputMainMenu);
//			
//			mainMenu.userChoice(mainMenuChoice);
//			
//			
//			if (mainMenuChoice == 1) {
//				for (Product product : products) {
//					System.out.println(product + "      " + mySlot.getInventory() + " in stock");
//				}
//			} else if (mainMenuChoice == 2) {
//				System.out.println("To make a purchase, please insert money.");
//				System.out.println("This machine can accept whole dollar amounts only.");
//				System.out.print("Please enter amount >>> $");
//				String userMoneyInserted = keyboard.nextLine();
//				BigDecimal money = new BigDecimal(userMoneyInserted);
//				
//				if 
//				
//				System.out.print("You have inserted $" + money);
//				
//				// Handle response to question about inserting money
//				
//				// Validate proper format of money inserted (whole dollar amount)
//				
//				System.out.println("---------------------------------------------");					
//				System.out.println("Please select a product from the list below.");
//				for (Product product : products) {
//					System.out.println(product + "      " + mySlot.getInventory() + " in stock");
//				}
//				System.out.println();
//				System.out.print("Enter the code of your selection. For example, you would enter \"B1\" for Moonpie. >>> ");
//				// How to allow them to enter either uppercase letter or lowercase letter?
//				String userProductSelected = keyboard.nextLine();
//				Product myProduct = new Product(userProductSelected);
//				
//				if (myProduct.getLocation().equals(userProductSelected)) {
//					System.out.print("Invalid product code. Please enter a valid code >>> ");
//					// How to read their new selection?
//				} else if (mySlot.getInventory() == 0) {
//					System.out.println("Product is sold out. Please select another product >>> ");
//					// How to use sold out message from Slot class?
//					// How to select another product?
//				} else if (money.compareTo(myProduct.getPrice()) < 0) {
//					System.out.println("Insufficient funds for selected product. Please select another product >>> ");
//					// Should we give option for them to add more money?
//				} else {
//
//				}
//				
////			if product exists, inventory is sufficient, and money is sufficient	
////				dispense product
////				display message correlating to type of product
////				display remaining money
////				prompt to continue or finish shopping
////				adjust inventory
//				
//				
//				
//				
//			} else if (mainMenuChoice == 3) {
//				System.out.println("Thank you for using the Vendo-matic 800!");
//				System.exit(1);}}}
//				
//		/*	} else {
//				System.out.print("Please enter a valid option number (1, 2, or 3) >>> ");
//				String userInputValidOption = keyboard.nextLine();
//				mainMenuChoice = Integer.parseInt(userInputValidOption);
//			}
//			while(mainMenuChoice != 1 || mainMenuChoice != 2 || mainMenuChoice != 3) {
//				System.out.println("\n(1) Display Vending Machine Items");
//				System.out.println("(2) Purchase");
//				System.out.println("(3) Exit");
//				System.out.println();
//				System.out.print("Enter selection here >>> ");
//				String userInputMainMenuTwo = keyboard.nextLine();
//				mainMenuChoice = Integer.parseInt(userInputMainMenuTwo);
//			}
//
//			
//			} catch (NumberFormatException e) {
//			System.out.print("Please enter a valid option number (1, 2, or 3) >>> ");
//			String userInputValidOption = keyboard.nextLine();
//			mainMenuChoice = Integer.parseInt(userInputValidOption);
//			}
//		}
//		}
//	
//
//	
//	
//
//
//	
////	// How do we allow the user to make another choice?	Do we need a loop?	
////	System.out.println("***************************");
////	System.out.println();
////	System.out.print("To continue, please select an option from the list below:");
////	System.out.println();
////	System.out.println("\n(1) Display Vending Machine Items");
////	System.out.println("(2) Purchase");
////	System.out.println("(3) Exit");
////	System.out.println();
////	System.out.println("Enter selection here >>> ");