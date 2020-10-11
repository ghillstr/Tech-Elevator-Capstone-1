package com.techelevator.view;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.Log;

public class LogTest {

	private Log log;

	@Before
	public void Log() {
		log = new Log();

	}

	@Test
	public void feed_money() {
		Log();
		String output = log.addToLog("FEED MONEY", new BigDecimal(5.00), new BigDecimal(10.00));
		LocalTime time = LocalTime.now();
		String printTime = time.toString().substring(0, time.toString().length() - 4);
		Assert.assertEquals(LocalDate.now() + " " + printTime + " " + String.format("FEED MONEY")
				+ String.format("%-10s", "$" + "5.00") + String.format("%-10s", "$" + "10.00"), output);
	}

	@Test
	public void give_change() {
		Log();
		String output = log.addToLog("GIVE CHANGE", new BigDecimal(2.00), new BigDecimal(0.00));
		LocalTime time = LocalTime.now();
		String printTime = time.toString().substring(0, time.toString().length() - 4);
		Assert.assertEquals(LocalDate.now() + " " + printTime + " " + String.format("GIVE CHANGE")
				+ String.format("%-10s", "$" + "2.00") + String.format("%-10s", "$" + "0.00"), output);
	}

	@Test
	public void purchase() {
		Log();
		String output = log.addToLog("Wonka BarB3", new BigDecimal(10.00), new BigDecimal(8.50));
		LocalTime time = LocalTime.now();
		String printTime = time.toString().substring(0, time.toString().length() - 4);
		Assert.assertEquals(LocalDate.now() + " " + printTime + " " + String.format("Wonka BarB3")
				+ String.format("%-10s", "$" + "10.00") + String.format("%-10s", "$" + "8.50"), output);
	}
}
