package com.xworkz.association.things;

public class Company {
	public String name;
	public String type;
	
	public Company(String name, String type) {
		this.name = name;
		this.type = type;
	}
public void show() {
	System.out.println("running show of company");
	System.out.println("name :"+name);
	System.out.println("type :"+type);
}
}
