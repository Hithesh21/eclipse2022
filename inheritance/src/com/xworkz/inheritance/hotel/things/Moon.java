package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.boot.Satellite;

public class Moon extends Satellite {
	
	public boolean water ;

	public Moon(String name, boolean launch,boolean water) {
		super(name,launch);
		this.water=water;
	}
	
	public void show() {
		super.show();
		System.out.println(this.water);
	}
}
