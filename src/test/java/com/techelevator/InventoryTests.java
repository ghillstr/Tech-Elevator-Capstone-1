package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;

import org.junit.Test;

public class InventoryTests {

	@Test
	public void quantityIsZero_returnSoldOut() {

		Inventory myInventory = new Inventory("A4", "Potato Crisps", new BigDecimal("3.05"), "Chip");
		myInventory.setQuantity(0);
		String myQuantity = myInventory.getQuantity();

		Assert.assertEquals("Sold out!", myQuantity);
	}

	@Test
	public void quantityIsOne_returnOne() {

		Inventory myInventory = new Inventory("A4", "Potato Crisps", new BigDecimal("3.05"), "Chip");
		myInventory.setQuantity(1);
		String myQuantity = myInventory.getQuantity();

		Assert.assertEquals("1", myQuantity);
	}

	@Test
	public void getLocation_ifItExist() {

		Inventory myInventory = new Inventory("A4", "Potato Crisps", new BigDecimal("3.05"), "Chip");
		String myLocation = myInventory.getLocation();

		Assert.assertEquals("A4", myLocation);
	}

	@Test
	public void getProduct_fromTheParametersPassed() {

		Inventory myInventory = new Inventory("B4", "Potato Crisps", new BigDecimal("3.05"), "Chip");
		Product myProduct = myInventory.getMyProduct();

		Assert.assertEquals(("Potato Crisps $3.05 Chip"), (myProduct.toString()));
	}

}