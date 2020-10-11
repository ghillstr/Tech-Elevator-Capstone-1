package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import com.techelevator.Product;
import com.techelevator.VendingMachine;
import com.techelevator.Inventory;
import com.techelevator.ChangeBackToCustomer;

public class Logger {
	
	private final File output = new File("Log.txt");
	
	
	// starting balance = before purchase final balance = after purchase
	public void logPurchase(Inventory location, Product product, VendingMachine startingBalance, BigDecimal finalBalance) {
		String event = product.getName() + " " + location.getLocation();
		String entry = BuildLogEntryString(event, startingBalance.getDeposit(), finalBalance);
		
		printToFile(entry);
 		}
	
	// staring balance = before deposit  final balance after deposit
	public void logFeed( VendingMachine deposit, BigDecimal finalBalance) {
		String event = "FEED MONEY";
		String entry = BuildLogEntryString(event, deposit.getDeposit(), finalBalance);
		
		printToFile(entry);
	}
	// final balance = 0
	public void logChange( BigDecimal changeGiven, BigDecimal finalBalance) {
		finalBalance.equals("0.00");
		String event = "GIVE CHANGE";
		String entry =  BuildLogEntryString(event, changeGiven, finalBalance);
		
		printToFile(entry);

		}
	
	private String BuildLogEntryString(String event, BigDecimal startingBalance, BigDecimal finalBalance) {
			String date = (new SimpleDateFormat("MM/dd/YYYY hh:mm:ss a").format(new Date()));
			NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
			String startingBalanceString = (numberFormat.format(startingBalance.doubleValue()));
			String finalBalanceString = (numberFormat.format(finalBalance.doubleValue()));
			
			return String.format( date, event, startingBalanceString, finalBalanceString);
	}
	
	private void printToFile(String entry) {
		try(FileOutputStream f = new FileOutputStream(output, true);
				PrintWriter pw = new PrintWriter(f)){
			
					pw.println(entry);
					pw.flush();
		}catch (IOException e) {
			System.out.println(e.toString());
			System.out.println("File Not Found");
			
		}
				
	}
			
}