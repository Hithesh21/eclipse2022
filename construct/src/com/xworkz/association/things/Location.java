package com.xworkz.association.things;

public class Location {
	public String street;
	public String city;
	public int pincode;
	public String state;
	public String country;
	
	public Location(String street, String city, int pincode, String state, String country) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}
	
	public void show() {
		System.out.println("entered show of location");
		System.out.println("street :"+street);
		System.out.println("city :"+city);
		System.out.println("pincode :"+pincode);
		System.out.println("state :"+state);
		System.out.println("country :"+country);
	}
	
}
