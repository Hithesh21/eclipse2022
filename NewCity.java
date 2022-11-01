package com.xworkz.association.things;

public class NewCity {
	public String name;
	public NewState state;
	public String region;
	public int pincode;
	
	
	public NewCity() {
		super();
	}
	public void setNewCity(String name,  String region, int pincode) {
		//super();
		this.name = name;
		//this.state = state;
		this.region = region;
		this.pincode = pincode;
	}
    public void	show() {
		
		System.out.println(this.name);
		if(state!=null) {
		System.out.println(this.state);
		state.show();
		}
		else {
			System.out.println("state is null");
		}
		System.out.println(this.region);
		System.out.println(this.pincode);
	}
	
	
}
