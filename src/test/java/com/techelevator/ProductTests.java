package com.techelevator;

import com.techelevator.Product;
import com.techelevator.VendingMachine;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ProductTests {

	@Test
	public void chip_returns_crunchcrunchyum () {
		Product myProduct = new Product("Stackers", new BigDecimal(3.05), "Chip");
		String expectedTypeMessage = "Crunch Crunch, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void gum_returns_chewchewyum () {
		Product myProduct = new Product("Triplemint", new BigDecimal(0.75), "Gum");
		String expectedTypeMessage = "Chew Chew, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}	
	
	@Test
	public void drink_returns_glugglugyum () {
		Product myProduct = new Product("Dr. Salt", new BigDecimal(1.50), "Drink");
		String expectedTypeMessage = "Glug Glug, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void candy_returns_munchmunchyum () {
		Product myProduct = new Product("Wonka Bar", new BigDecimal(1.50), "Candy");
		String expectedTypeMessage = "Munch Munch, Yum!";
		String outputTypeMessage = myProduct.typeMessage();
		
		assertEquals(expectedTypeMessage, outputTypeMessage);
		
	}
	
	@Test
	public void getname_returns_name () {
		Product myProduct = new Product("Wonka Bar", new BigDecimal(1.50), "Candy");
		assertTrue(myProduct.getName() == "Wonka Bar");
	}
	
	@Test
	public void getprice_returns_price () {
		Product myProduct = new Product("Cloud Popcorn", new BigDecimal(3.65), "Chip");
		assertEquals("3.65", myProduct.getPrice().toString());
	}
	
	@Test
	public void gettype_returns_type () {
		Product myProduct = new Product("Moonpie", new BigDecimal(1.80), "Candy");
		assertTrue(myProduct.getType() == "Candy");
	}
	
	@Test
	public void displayed_wonkabar_matches_selected_wonkabar () {
		Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
		String expectedProductDisplay = "B3 Wonka Bar 1.50 5 in stock";
		String outputProductDisplay = myInventory.getLocation() + " " + myInventory.getMyProduct().getName() + " "
				+ myInventory.getMyProduct().getPrice() + " " + myInventory.getQuantity() + " in stock";
		
		assertEquals(expectedProductDisplay, outputProductDisplay);
	}
	
	@Test
	public void displayed_cola_matches_selected_cola () {
		Inventory myInventory = new Inventory("C1", "Cola", new BigDecimal(1.25), "Candy");
		String expectedDisplay = "C1 Cola 1.25 5 in stock";
		String outputDisplay = myInventory.getLocation() + " " + myInventory.getMyProduct().getName() + " "
				+ myInventory.getMyProduct().getPrice() + " " + myInventory.getQuantity() + " in stock";
		
		assertEquals(expectedDisplay, outputDisplay);
	}
	
	@Test
	public void purchased_wonkabar_matches_selected_wonakabar () {
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
	public void soldout_wonkabar_returns_soldout_message () {
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
	public void insufficient_balance_prevents_purchase () {
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