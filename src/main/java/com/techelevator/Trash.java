package com.techelevator;

public class Trash {


//	public void setDeposit(BigDecimal customerBalance) {
//		this.deposit = deposit;
//	}


//public void showInventoryToCustomerAndKeepTrackForSalesReport() {
//	Inventory inStock;
//	int sold;
//	
//	for(String key : inventoryMap.keySet()) {
//		inStock = inventoryMap.get(key);
//		if(inStock.getQuantity().equals("Sold out!")) {
//			sold = 5;
//			System.out.println("Sold out!");
//		}else {
//			sold = 5 - Integer.valueOf(inStock.getQuantity());
//			System.out.println(inStock.getQuantity());
//		}
//	}
//}

//	public Map<String, Product> inventoryMap = new HashMap<>();

//	public void getQuantity(String slot) {
//		Product value = inventoryMap.get(slot);
//		int invNum = value.getQuantity();
//		System.out.println("inv for product selected " + invNum);
//	}
	

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

//public void finishTransactionAndKeepTrackForSalesReport () {
//	for (Product each : cart) {
//		soldProducts.add(each);
//	} while (cart.size() > 0) {
//		cart.remove(0);
//	}
//}
// How do we connect this to Payment class?
// How and where do we handle change?
// How and where do we display the product type message
//SAME AS CUSTOMERMONEY METHOD IN PAYMENT CLASS
/*public void addMoney(int paymentAmount) {
	setCustomerBalance((().add(new BigDecimal(cashFed))));
	System.out.println("Your balance is: $" + getCustomerBalance().toString());
	// add cashFed to log
	 * 
	 * 
	 * 
	 * public void addMoney(int input) throws IOException {
	setDeposit((getDeposit().add(new BigDecimal(input))));
	System.out.println("Transaction Balance is now : $" + getTransactionBalance().toString());
	logger.addToLog("FEED MONEY:", new BigDecimal(input), getTransactionBalance());
}
}*/

//	private String BuildLogEntryString(String event, BigDecimal startingBalance, BigDecimal finalBalance) {
//	String date = (new SimpleDateFormat("MM/dd/YYYY hh:mm:ss a").format(new Date()));
//	NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
//	String startingBalanceString = (numberFormat.format(startingBalance.doubleValue()));
//	String finalBalanceString = (numberFormat.format(finalBalance.doubleValue()));
//	
//	return String.format( date, event, startingBalanceString, finalBalanceString);
//}
//
//// starting balance = before purchase         final balance = after purchase
//public void logPurchase(Inventory location, Product product, VendingMachine startingBalance, BigDecimal finalBalance) {
//	String event = product.getName() + " " + location.getLocation();
//	String entry = BuildLogEntryString(event, startingBalance.getDeposit(), finalBalance);
//	
//	printToFile(entry);
//		}
//
//// staring balance = before deposit       final balance after deposit
//public void logFeed(VendingMachine deposit, BigDecimal finalBalance) {
//	String event = "FEED MONEY";
//	String entry = BuildLogEntryString(event, deposit.getDeposit(), finalBalance);
//	
//	printToFile(entry);
//}
//// final balance = 0
//public void logChange( BigDecimal changeGiven, BigDecimal finalBalance) {
//	finalBalance.equals("0.00");
//	String event = "GIVE CHANGE";
//	String entry =  BuildLogEntryString(event, changeGiven, finalBalance);
//	
//	printToFile(entry);
//
//	}
//
//
//
//private void printToFile(String entry) {
//	try(FileOutputStream f = new FileOutputStream(output, true);
//			PrintWriter pw = new PrintWriter(f)){
//		
//				pw.println(entry);
//				pw.flush();
//	}catch (IOException e) {
//		System.out.println(e.toString());
//		System.out.println("File Not Found");
//		
//	}
//			
//}
//		
//}
	
}