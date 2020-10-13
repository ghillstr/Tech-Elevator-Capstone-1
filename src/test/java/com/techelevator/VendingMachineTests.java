package com.techelevator;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTests {
	@Test
	public void passing2Dollars_return2DollarsBalance() {

		VendingMachine myMachine = new VendingMachine();
		String balance = myMachine.addToCustomerMoney(2);
		Assert.assertEquals("2.00", balance);
	}

	@Test
	public void passing0Dollars_returnZeroDollarsBalance() {

		VendingMachine myMachine = new VendingMachine();
		String balance = myMachine.addToCustomerMoney(0);
		Assert.assertEquals("0.00", balance);
	}

	@Test
	public void passing3Dollars_returnThreeDollarsBalance() {

		VendingMachine myMachine = new VendingMachine();
		String balance = myMachine.addToCustomerMoney(3);
		Assert.assertEquals("0.00", balance);
	}

	@Test
	public void displayed_wonkabar_matches_selected_wonkabar() {
		Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
		String expectedProductDisplay = "B3 Wonka Bar 1.50 5 in stock";
		String outputProductDisplay = myInventory.getLocation() + " " + myInventory.getMyProduct().getName() + " "
				+ myInventory.getMyProduct().getPrice() + " " + myInventory.getQuantity() + " in stock";

		assertEquals(expectedProductDisplay, outputProductDisplay);
	}

	@Test
	public void displayed_cola_matches_selected_cola() {
		Inventory myInventory = new Inventory("C1", "Cola", new BigDecimal(1.25), "Candy");
		String expectedDisplay = "C1 Cola 1.25 5 in stock";
		String outputDisplay = myInventory.getLocation() + " " + myInventory.getMyProduct().getName() + " "
				+ myInventory.getMyProduct().getPrice() + " " + myInventory.getQuantity() + " in stock";

		assertEquals(expectedDisplay, outputDisplay);
	}

	@Test
	public void purchased_wonkabar_matches_selected_wonakabar() {
		Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
		VendingMachine myVendingMachine = new VendingMachine();
		Map<String, Inventory> myInventoryMap = new HashMap<>();
		myInventoryMap.put("B3", myInventory);
		myVendingMachine.setInventoryMap(myInventoryMap);
		myVendingMachine.addToCustomerMoney(10);
		String a = myVendingMachine.selectProduct("B3");

		String expectedDisplay = "You have purchased one Wonka Bar at a cost of $1.50. Your remaining balance is $8.50.";
		String outputDisplay = a;

		assertEquals(expectedDisplay, outputDisplay);
	}

	@Test
	public void soldout_wonkabar_returns_soldout_message() {
		Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
		VendingMachine myVendingMachine = new VendingMachine();
		Map<String, Inventory> myInventoryMap = new HashMap<>();
		myInventoryMap.put("B3", myInventory);
		myVendingMachine.setInventoryMap(myInventoryMap);
		myVendingMachine.addToCustomerMoney(10);
		myInventory.setQuantity(0);
		String a = myVendingMachine.selectProduct("B3");

		String expectedDisplay = "Sorry, this item is sold out. Please select another item.";
		String outputDisplay = a;

		assertEquals(expectedDisplay, outputDisplay);
	}

	@Test
	public void insufficient_balance_prevents_purchase() {
		Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
		VendingMachine myVendingMachine = new VendingMachine();
		Map<String, Inventory> myInventoryMap = new HashMap<>();
		myInventoryMap.put("B3", myInventory);
		myVendingMachine.setInventoryMap(myInventoryMap);
		myVendingMachine.addToCustomerMoney(0);
		String a = myVendingMachine.selectProduct("B3");

		String expectedDisplay = "Sorry, you do not have enough money to purchase this product. Please enter another selection or feed more money.";
		String outputDisplay = a;

		assertEquals(expectedDisplay, outputDisplay);
	}

}
