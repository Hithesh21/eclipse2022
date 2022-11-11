package com.xworkz.association.things;

public class NewLocation {
	public String street;
	public int no;
	public NewCity city;
    public NewState state;
    public NewCountry country;
	 
    public NewLocation(String street, int no ) {
    	this.street = street;
		this.no = no;
		
	}
	public void setNewLocation(NewCity city,NewState state,NewCountry country ) {
		
		
		this.city = city;
		this.state = state;
		this.country = country;
	}
public void	show() {
		
		System.out.println(this.street);
		System.out.println(this.no);
		city.show();
		state.show();
		country.show();
		
	}
    
}
