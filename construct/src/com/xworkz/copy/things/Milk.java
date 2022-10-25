package com.xworkz.oct.things;

import com.xworkz.copy.things.Size;

public class Milk {
	
	public static String brand;
	public Size size=Size.SMALL;
	public final long contactNo=9595123456l;
	public int price;
	public String location;
	
	public Milk(int price) {
		this.price = price;
	}
	
	public void setLocation(String value) {
		location=value;
	}
	public String getLocation() {
		return location;
	}
	public void show() {
		
		
		System.out.println(Milk.brand);
		System.out.println(this.size);
		System.out.println(this.contactNo);
	    System.out.println(this.price);
		System.out.println(this.location);
	}


}
