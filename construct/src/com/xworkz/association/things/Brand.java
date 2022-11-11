package com.xworkz.association.things;

public class Brand {
	public String name;
	public String gstNo;
	public String rating;
	public Location location=new Location("rt nagar","magadi",560002, "karnataka", "india" );
	
	public Brand(String name, String gstNo, String rating) {
		super();
		this.name = name;
		this.gstNo = gstNo;
		this.rating = rating;
	}
	
	public void show() {
	System.out.println("running show of brand");
	System.out.println("name :"+name);
	System.out.println("gst no :"+gstNo);
	System.out.println("rating :"+rating);
	location.show();
}
}