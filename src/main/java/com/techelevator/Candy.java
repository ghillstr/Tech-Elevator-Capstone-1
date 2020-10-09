package com.techelevator;

import java.math.BigDecimal;

public class Candy extends Product{
	
	public Candy(String name, BigDecimal price) {
		super(name, price);
	}
		public String getMessage() {
			return "Munch Munch, Yum!";
		
	}
	

}
