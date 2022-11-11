package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.PoliticalParty;

public class Bjp extends PoliticalParty {
	
	public int noOfMps;

	public Bjp(String name, boolean national,int noOfMps) {
		super(name,national);
		this.noOfMps=noOfMps;
	}
	public void show() {
		super.show();
		System.out.println(this.noOfMps);
	}
}
	


