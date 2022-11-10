package com.xworkz.oct.things;

import com.xworkz.copy.things.Size;

public class Flower {
	
	public static String name;
	public Size size=Size.MEDIUM;
	public final long contactNo=9595123456l;
	public int price;
	public String color;
	
	public Flower(String color) {
		this.color = color;
	}
	public void setPrice(int value) {
		price=value;
	}
	public int getPrice() {
		return price;
	}
	public void show() {
		
		
		System.out.println(Flower.name);
		System.out.println(this.size);
		System.out.println(this.contactNo);
	    System.out.println(this.price);
		System.out.println(this.color);
	}

	
	

}
