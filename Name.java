package com.xworkz.association.things;

public class Name {
	public String name;
	public String oldName;
	public String futureName;
	 
	
	public Name(String name, String oldName, String futureName) {
		super();
		this.name = name;
		this.oldName = oldName;
		this.futureName = futureName;
	}
	 
	public void display() {
		
		System.out.println("name :"+name);
		System.out.println("oldname :"+oldName);
		System.out.println("futurename :"+futureName);
	}
	
}
