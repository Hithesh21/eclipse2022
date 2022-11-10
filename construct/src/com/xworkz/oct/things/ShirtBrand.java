package com.xworkz.oct.things;

import com.xworkz.copy.things.Size;

public class ShirtBrand {
	public static String brand;
	public Size size=Size.LARGE;
	public final long contactNo=9595123456l;
	public boolean fitting;
	public String color;
	
	public ShirtBrand(boolean fitting) {
		this.fitting = fitting;
	}
	public void show() {
		System.out.println(ShirtBrand.brand);
		System.out.println(this.size);
		System.out.println(this.contactNo);
	    System.out.println(this.fitting);
		System.out.println(this.color);
	}
      public void setColor(String value) {
    	  color=value;
      }
      
      public String getColor() {
    	  return color;
      }
      
      
      
      
      
      
      
      
      
      
      
      
}
