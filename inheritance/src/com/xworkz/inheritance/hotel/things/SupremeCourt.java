package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.Court;

public class SupremeCourt extends Court {
	public String judjeName="abc";
	public int noOfStaff=20;
	
	public SupremeCourt() {
		System.out.println("default const of SupremeCourt");
		
	}
	public void show() {
		System.out.println(judjeName);
		System.out.println(noOfStaff);
	}
}
