package com.techelevator.view;

import java.math.BigDecimal;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.Inventory;
import com.techelevator.Product;
import com.techelevator.VendingMachine;

public class VendingMachineTests1 {
	
	private VendingMachine vendo;
	
	
	@Before
	public void Vendo() {
		vendo = new VendingMachine();
	}
		
		@Test
	     public void inventory_map() {
			vendo = new VendingMachine();
			Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
			Map<String, Inventory> output = vendo.getInventoryMap("B3", myInventory);
			Assert.assertEquals(("B3", "B3", "Wonka Bar", new BigDecimal(1.50), "Candy"), output);
			}
	    	 
	     @Test
	     public void deposit() {
	    	 vendo = new VendingMachine();
	    	 BigDecimal input = new BigDecimal(10.00);
	    	 BigDecimal output = vendo.getDeposit(input);
	    	 Assert.assertEquals(10.00, output);
	     }
	
	

}
