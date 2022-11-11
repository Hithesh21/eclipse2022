package com.xworkz.inheritance.hotel;

public class PoliticalParty {
	public String name;
	public boolean national ;
	
	public PoliticalParty(String name, boolean national) {
		super();
		this.name = name;
		this.national = national;
	}
	
	public void show() {
		System.out.println(this.name);
		System.out.println(this.national);
	}
}
