package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.HumanResource;

public class Akshara extends HumanResource {
	
	public void hire() {
		System.out.println("starting hire of akshara");
		super.hire();
		
		super.onBoard();
		System.out.println("running hire of akshara");
	}
	

}
