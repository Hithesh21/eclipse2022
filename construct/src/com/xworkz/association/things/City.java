package com.xworkz.association.things;

public class City {
      public Name name;
      public double area;
	  
      
      public City(Name name) {
		super();
		this.name = name;
	}
      public void setArea(double area) {
    	  this.area=area;
      }
      public void display() {
    	 // System.out.println(this.name);
    	  System.out.println(this.area);
    	  this.name.display();
      }
}
