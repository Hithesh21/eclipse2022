package com.xworkz.association.things;

public class ChiefMinister {
	public String name;
	public Gender gender=Gender.MALE;
	   
	
	public ChiefMinister(String name) {
		super();
		this.name = name;
	}
	 
    public void disply() {
    	System.out.println("name :"+name);
    	System.out.println("gender :"+gender);
    	
    }
	

}
