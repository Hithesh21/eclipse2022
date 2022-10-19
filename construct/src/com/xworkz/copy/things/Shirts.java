package com.xworkz.copy.things;

public class Shirts {
	public String brand;
	public Size size=Size.LARGE;
	public long contactNo;
	public int   weight;
	public boolean fitting;
	public String[] color;
	public String[] types;
	public int[] price;
	public Shirts(String brand, Size size, long contactNo, int weight, boolean fitting, String[] color, String[] types,
			int[] price) {
		this.brand = brand;
		this.size = size;
		this.contactNo = contactNo;
		this.weight = weight;
		this.fitting = fitting;
		this.color = color;
		this.types = types;
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.brand);
		System.out.println(this.size);
		System.out.println(this.contactNo);
		System.out.println(this.weight);
		System.out.println(this.fitting);
		
		System.out.println(this.color);
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
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
