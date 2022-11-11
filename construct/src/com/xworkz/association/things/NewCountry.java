package com.xworkz.association.things;

public class NewCountry {
	public String name;
	public String continent;
	public String region;
	public int code;
	 
	public NewCountry(String name, String continent, String region, int code) {
		super();
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.code = code;
	}
	
	public NewCountry() {
		super();
	}

	public void setNewCountry(String name, String continent, String region, int code) {
		
		this.name = name;
		this.continent = continent;
		this.region = region;
		this.code = code; 
	}
public void	show() {
	
	System.out.println(this.name);
	System.out.println(this.continent);
	System.out.println(this.region);
	System.out.println(this.code);
}
}
