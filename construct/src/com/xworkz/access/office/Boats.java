package com.xworkz.access.office;

public class Boats {
public Boat boat;
public void use(Boat boat) {
	
	System.out.println(boat.color);
	System.out.println(boat.type);
	System.out.println(boat.CompanyOwner);
	System.out.println(boat.ownerWife);
	System.out.println(boat.isSail);
	
	boat.getName();
	System.out.println(boat.getName());
	boat.setName("star");
	System.out.println("after changing.. "  +boat.getName());
}}