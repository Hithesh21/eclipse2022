package com.xworkz.association.things;

public class President {
	public String name;
	public Gender gender=Gender.MALE;
	   
	
	public President(String name) {
		super();
		this.name = name;
	}
	 
    public void disply() {
    	System.out.println("name :"+name);
    	System.out.println("gender :"+gender);
    	
    }
	
}
