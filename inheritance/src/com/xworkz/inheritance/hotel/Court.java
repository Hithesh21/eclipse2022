package com.xworkz.inheritance.hotel;

public class Court {
	public String adress;
	public int pinCode;
	
	public Court() {
		System.out.println("default const of court");
	}
	public void show() {
		System.out.println(adress);
		System.out.println(pinCode );
	}

}
