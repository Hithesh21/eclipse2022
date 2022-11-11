package com.xworkz.inheritance.hotel.things;

public class Marriage {
	
	public String brideName;
	public String groomName;
	public String location;
	
	public Marriage() {
		System.out.println("default const of marriage");
	}

	public Marriage(String brideName, String groomName, String location) {
		super();
		this.brideName = brideName;
		this.groomName = groomName;
		this.location = location;
	}
	
}
