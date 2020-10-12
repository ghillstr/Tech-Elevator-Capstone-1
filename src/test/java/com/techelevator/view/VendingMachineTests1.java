package com.techelevator.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.techelevator.Inventory;
import com.techelevator.Product;
import com.techelevator.VendingMachine;

public class VendingMachineTests1 {
	
	private VendingMachine vendo;
	
	
	
		
		@Test
	     public void inventory_map() {
			vendo = new VendingMachine();
			Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
			Map<String, Inventory> myInventoryMap = new HashMap<>();
			myInventoryMap.put("B3", myInventory);
			vendo.setInventoryMap(myInventoryMap);
			Map<String, Inventory> output = vendo.getInventoryMap();
			Assert.assertEquals(("B3 Wonka Bar $1.50 Candy"), output);
			}
	    	 
//		Inventory myInventory = new Inventory("B3", "Wonka Bar", new BigDecimal(1.50), "Candy");
//		VendingMachine myVendingMachine = new VendingMachine();
//		Map<String, Inventory> myInventoryMap = new HashMap<>();
//		myInventoryMap.put("B3", myInventory);
	     @Test
	     public void deposit() {
	    	 vendo = new VendingMachine();
	    	 BigDecimal output = vendo.getDeposit(10);
	    	 Assert.assertEquals(BigDecimal.valueOf(10.00), output);
	     }
	     
	     @Test 
	     public void final_deposit() {
	    	 vendo = new VendingMAchine();
	     }
	
	

}
