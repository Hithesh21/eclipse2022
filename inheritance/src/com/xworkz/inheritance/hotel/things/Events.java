package com.xworkz.inheritance.hotel.things;

public class Events extends Marriage {
	public String type;
	public String djName;
	public String noOfPeople;
	
	 public Events() {
		 System.out.println("default const of events");
	}
	 

	public Events( String djName, String noOfPeople) {
		super();
		//this.type = type;
		this.djName = djName;
		this.noOfPeople = noOfPeople;
	}


	public Events(String brideName, String groomName, String location) {
		super(brideName," om", location);
		
	}

}
