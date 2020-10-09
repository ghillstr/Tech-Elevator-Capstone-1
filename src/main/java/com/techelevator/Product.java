package com.techelevator;

import java.math.BigDecimal;

public abstract class Product {

	
	private String name;
	private BigDecimal price;
	
	public Product(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}
	
	public abstract String getMessage();
	


	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}
}
	
	
	  	
	  	





