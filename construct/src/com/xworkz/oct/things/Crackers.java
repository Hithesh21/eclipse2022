package com.xworkz.oct.things;

import com.xworkz.copy.things.Size;

public class Crackers {
	
	public static String brand;
	public Size size=Size.SMALL;
	public final long contactNo=9595123456l;
	public int price;
	public String[] color;
	
	public Crackers(int price) {
		this.price = price;
	}
	
	public void setColor(String[] value) {
		color=value;
	}
	public String[] getColor() {
		return color;
	}
	public void show() {
		
		
		System.out.println(Crackers.brand);
		System.out.println(this.size);
		System.out.println(this.contactNo);
	    System.out.println(this.price);
		System.out.println(this.color);
	}

}
