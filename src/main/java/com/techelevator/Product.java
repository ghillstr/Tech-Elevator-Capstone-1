package com.techelevator;

public class Product {

	private String location;
	private String name;
	private Double price;
	private String type;

//	public Product (String location, String name, Double price, String type) {
//		this.location = location;
//		this.name = name;
//		this.price = price;
//		this.type = type;
//	}

	public Product (String line) {
		if (line != "" || line != null) {
			String[] sections = line.split("\\|");
			
			this.location = sections[0];
			this.name = sections[1];
			this.price = Double.parseDouble(sections[2]);
			this.type = sections[3];
		}
	}
	
	public void message (String type) {
		if (type == "Chip") {
			System.out.println("Crunch Crunch, Yum!");
		} else if (type == "Candy") {
			System.out.println("Munch Munch, Yum!");
		} else if (type == "Drink") {
			System.out.println("Glug Glub, Yum!");
		} else {
			System.out.println("Chew Chew, Yum!");
		}
	}
	
	public String getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public Double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

}
