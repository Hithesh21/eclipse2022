package com.xworkz.association.things;

public class Mountain {
	public String name;
	public double height;
	public Location location=new Location("high","magadi",560002, "karnataka", "india" );
	public Temple temple=new Temple("sharada temple",280,"bhat");
	public Mountain(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	
	 
		public void show() {
			System.out.println("entered show of mountain");
			System.out.println("name :"+name);
			System.out.println("height :"+height);
	         location.show();
             temple.show();
		}
}
