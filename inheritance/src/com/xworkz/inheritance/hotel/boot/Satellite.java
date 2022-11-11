package com.xworkz.inheritance.hotel.boot;

public class Satellite {
	public String name;
	public boolean launch ;
	
	public Satellite(String name, boolean launch) {
		super();
		this.name = name;
		this.launch = launch;
	}

	public void show() {
		System.out.println(this.name);
		System.out.println(this.launch);
	}
}
