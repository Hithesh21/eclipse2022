package com.xworkz.association.things;

public class NewState {

	public String name;
	public NewCountry country;
	public String region;
	public int code;
	
	public NewState(String name, String region, int code) {
		super();
		this.name = name;
		this.region = region;
		this.code = code;
		//this.country=country;
	}
	
	
	public NewState() {
		super();
	}

	public void setNewState(String name, String region, int code) {
		
		this.name = name;
		this.region = region;
		this.code = code;
	
	}
	
	public void	show() {
		
		System.out.println(this.name);
		if(country!=null) {
		System.out.println(this.country);
		country.show();
		}
		else {
			System.out.println("country is null");
		}
		System.out.println(this.region);
		System.out.println(this.code);
	}
}
