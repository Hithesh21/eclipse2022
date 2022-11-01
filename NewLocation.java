package com.xworkz.association.things;

public class NewLocation {
	public String street;
	public int no;
	public NewCity city;
    public NewState state;
    public NewCountry country;
	 
    public NewLocation() {
		super();
	}
	public void setNewLocation(String street, int no ) {
		
		this.street = street;
		this.no = no;
		//this.city = city;
		//this.state = state;
		//this.country = country;
	}
public void	show() {
		
		System.out.println(this.street);
		System.out.println(this.no);
		city.show();
		state.show();
		country.show();
		
	}
    
}
