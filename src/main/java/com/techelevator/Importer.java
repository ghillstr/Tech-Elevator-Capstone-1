package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Importer {

	public String[] inputFileToParse() {
	
		File inputFile = new File("vendingmachine.csv");
		
		StringBuilder line = new StringBuilder();
		try (Scanner fileScanner = new Scanner(inputFile)) {
			while (fileScanner.hasNextLine()) {
				line.append(fileScanner.nextLine()).append("\n");
			}
		} catch (IOException e) {
			// add exception message
		}
		return line.toString().split("[\n]");

	}
	
    private void stocker (List<Product> productList, String slot, Product product) {
        for (int i = 0; i < 5; i++) {
            productList.add(product);
            
            productsInTheMachine.put(slot, productList);
        }
    }
	
    private void createInventoryMap (String[] parsedFile) {
        for (String line : parsedFile) {

            String[] inputFileSections = line.split("[|]");
            
            List<Product> products = new ArrayList<Product>();
            
            String slot = inputFileSections[0];
            String name = inputFileSections[1];
            BigDecimal price = new BigDecimal(inputFileSections[2]);
            
            if (slot.startsWith("A")) {
                Product product = new Chips(name, price);
                stocker (productList, slot, product);
                
            } else if (slot.startsWith("B")) {
                Product product = new Candy(name, price);
                stocker (productList, slot, product);
                
            } else if (slot.startsWith("C")) {
                Product product = new Drink(name, price);
                stocker (productList, slot, product);
                
            } else if (slot.startsWith("D")) {
                Product product = new Gum(name, price);
                stocker (productList, slot, item);
            }

        }
    }

}
