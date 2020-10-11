package com.techelevator;

import java.math.BigDecimal;

import org.junit.Assert;

import org.junit.Test;

public class InventoryTests {

	@Test
	public void quantityIsZero_returnSoldOut() {

		// Arrange
		Inventory myInventory = new Inventory("A4", "Potato Crisps", new BigDecimal ("3.05"), "Chip");
		myInventory.setQuantity(0);
		// Act
		String myQuantity = myInventory.getQuantity();

		// Assert
		Assert.assertEquals("Sold out!", myQuantity);
	}
	@Test
	public void quantityIsOne_returnOne() {

		// Arrange
		Inventory myInventory = new Inventory("A4", "Potato Crisps", new BigDecimal ("3.05"), "Chip");
		myInventory.setQuantity(1);
		// Act
		String myQuantity = myInventory.getQuantity();

		// Assert
		Assert.assertEquals("1", myQuantity);
	}

	@Test
	public void getLocation_ifItExist() {

		// Arrange
		Inventory myInventory = new Inventory("A4", "Potato Crisps", new BigDecimal ("3.05"), "Chip");
		
		// Act
		String myLocation = myInventory.getLocation();

		// Assert
		Assert.assertEquals("A4", myLocation);
	}
	@Test
	public void getProduct_fromTheParametersPassed() {

		// Arrange
		Inventory myInventory = new Inventory("B4", "Potato Crisps", new BigDecimal ("3.05"), "Chip");
		
		// Act
		Product myProduct = myInventory.getMyProduct();

		// Assert
		Assert.assertEquals(("Potato Crisps $3.05 Chip"),(myProduct.toString()));
	}

	}