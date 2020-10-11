package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Log {

	public void addToLog (String actionPerformed, BigDecimal fedAmount, BigDecimal balance) {

		// Delete this comment
		LocalDate day = LocalDate.now();
		LocalTime time = LocalTime.now();
		try (PrintWriter logger = new PrintWriter(new FileOutputStream(new File("./log.txt"), true))) {

			String printDay = day.toString();
			String printTime = time.toString().substring(0, time.toString().length() - 4);
			String printActionPerformed = actionPerformed.toString();
			String printAmount = fedAmount.toString();
			String printBalance = balance.toString();

			logger.println(printDay + " " + printTime + " " + String.format("%-25s", printActionPerformed)
					+ String.format("%-10s", "$" + printAmount) + String.format("%-10s", "$" + printBalance));

		} catch (FileNotFoundException e) {
			e.getMessage();
		}
	}
}
