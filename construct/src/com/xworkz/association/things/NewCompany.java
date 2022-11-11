package com.xworkz.association.things;

public class NewCompany {
	public String name;
	public String ownerName;
	public NewLocation location;
	
	
	public NewCompany() {
		super();
	}
	public NewCompany(String name, String ownerName) {
		
		this.name = name;
		this.ownerName = ownerName;
	}
	public void setLocation(NewLocation location) {
		this.location=location;
	}
public void	show() {
		
		System.out.println(this.name);
		System.out.println(this.ownerName);
		if(location!=null) {
		location.show();
		}else {
			System.out.println("location is null");
		}
	}
    
	
}
