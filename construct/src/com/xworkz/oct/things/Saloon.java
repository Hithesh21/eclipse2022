package com.xworkz.oct.things;

import com.xworkz.copy.things.Size;

public class Saloon {

	public static String name;
	public Size size=Size.SMALL;
	public final long contactNo=9595123456l;
	public int price;
	public String location;
	
	public Saloon(int price) {
		this.price = price;
	}
	
	public void setLocation(String value) {
		location=value;
	}
	public String getLocation() {
		return location;
	}
	public void show() {
		
		
		System.out.println(Saloon.name);
		System.out.println(this.size);
		System.out.println(this.contactNo);
	    System.out.println(this.price);
		System.out.println(this.location);
	}


}
