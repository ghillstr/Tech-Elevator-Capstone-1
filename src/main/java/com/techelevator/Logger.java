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

public class Logger {
	
	private final File output = new File("Log.txt");
	
	public void logPurchase(String location, Product product, BigDecimal startingBalance, BigDecimal finalBalance) {
		String event = Product.getName() + " " + location;
		String entry = BuildLogEntryString(event, startingBalance, finalBalance);
		
		printToFile(entry);
 		}
	
	public void logFeed( BigDecimal amountFed, BigDecimal finalBalance) {
		String event = "FEED MONEY";
		String entry = BuildLogEntryString(event, amountFed, finalBalance);
		
		printToFile(entry);
	}

	public void logChange( BigDecimal changeGiven, BigDecimal finalBalance) {
		String event = "GIVE CHANGE";
		String entry =  BuildLogEntryString(event, changeGiven, finalBalance);
		
		printToFile(entry);

		}
	
	private String BuildLogEntryString(String event, BigDecimal startingBalance, BigDecimal finalBalance) {
			String date = (new SimpleDateFormat("MM/dd/YYYY hh:mm:ss a").format(new Date()));
			NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
			String startingBalanceString = (numberFormat.format(startingBalance.doubleValue()));
			String finalBalanceString = (numberFormat.format(finalBalance.doubleValue()));
			
			return String.format("%-25s%-25s%-10s%-10s", date, event, startingBalanceString, finalBalanceString);
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