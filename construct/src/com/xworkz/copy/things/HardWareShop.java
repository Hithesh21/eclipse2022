package com.xworkz.copy.things;

public class HardWareShop {
	public String name;
	public String owner;
	public String location;
	public int   pin;
	public int noOfStaff ;
	public String[] color;
	public String[] products;
	public String[] staffNames;
	public String[] types;
	public int[] price;
	public HardWareShop(String name, String owner, String location, int pin, int noOfStaff, String[] color,
			String[] products, String[] staffNames, String[] types, int[] price) {
		this.name = name;
		this.owner = owner;
		this.location = location;
		this.pin = pin;
		this.noOfStaff = noOfStaff;
		this.color = color;
		this.products = products;
		this.staffNames = staffNames;
		this.types = types;
		this.price = price;
	}

	public void show() {
		System.out.println(this.name);
		System.out.println(this.owner);
		System.out.println(this.location);
		System.out.println(this.pin);
		System.out.println(this.noOfStaff);
		
		System.out.println(this.color);
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		System.out.println(this.products);
		for (int i = 0; i < products.length; i++) {
			System.out.println(this.products[i]);
		}
		System.out.println(this.staffNames);
		for (int i = 0; i < staffNames.length; i++) {
			System.out.println(this.staffNames[i]);
		}
		System.out.println(this.types);
		for (int i = 0; i < types.length; i++) {
			System.out.println(this.types[i]);
		}
		System.out.println(this.price);
		for (int i = 0; i < price.length; i++) {
			System.out.println(this.price[i]);
		}
	}
}
