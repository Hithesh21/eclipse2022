package com.xworkz.access.office;

public class Pen {
	private String brand="cello";
	public String color;
	public String type ;
	public char  size;
	public int weight;
	public int price;
	public int length;
	public boolean isWriting;
	public boolean pocketHold;
	public boolean withCap;
	public boolean withBox ;
	
	public Pen(String color, String type, char size, int weight, int price, int length, boolean isWriting,
			boolean pocketHold, boolean withCap, boolean withBox) {
		super();
		this.color = color;
		this.type = type;
		this.size = size;
		this.weight = weight;
		this.price = price;
		this.length = length;
		this.isWriting = isWriting;
		this.pocketHold = pocketHold;
		this.withCap = withCap;
		this.withBox = withBox;
	}
	void setBrand(String brand) {
		this.brand=brand;
	}
	
	public String getBrand() {
		  return brand;
		  
	  }
	
}
