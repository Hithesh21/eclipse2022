package com.xworkz.access.office;

public class Fridge {
	String brand;
	String color;
	String use;
	private String ownerName = "abc";
	int height ;
	int weight;
	int width;
	int SizeInLiter;
	double price;
	boolean good;
	boolean serviceOfCompany;
	
	public Fridge (String brand, String color, String use, int height, int weight, int width, int sizeInLiter,
			double price, boolean good, boolean serviceOfCompany) {
		super();
		this.brand = brand;
		this.color = color;
		this.use = use;
		this.height = height;
		this.weight = weight;
		this.width = width;
		SizeInLiter = sizeInLiter;
		this.price = price;
		this.good = good;
		this.serviceOfCompany = serviceOfCompany;
	} public String getOwner() 
	 {
		return this.ownerName=ownerName;
	 }
	 void setOwner(String ownerName) 
	 {
		this.ownerName=ownerName; 
	 }
	 

}


