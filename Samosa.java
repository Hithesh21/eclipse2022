package com.xworkz.access.office;

public class Samosa {
	private String name;
	public String color;
	public char shape;
	public int weight;
	public String size;
	public String ingredient;
	public boolean fried;
	public boolean taste;
	public String location;
	public boolean baked;
	public int price;
	public Samosa(String name, String color, char shape, int weight, String size, String ingredient, boolean fried,
			boolean taste, String location, boolean baked, int price) {
		super();
		this.name = name;
		this.color = color;
		this.shape = shape;
		this.weight = weight;
		this.size = size;
		this.ingredient = ingredient;
		this.fried = fried;
		this.taste = taste;
		this.location = location;
		this.baked = baked;
		this.price = price;
	}
	void setName(String name) {
		  this.name=name;
	  }
	  public String getName() {
		  return name;
		  
	  }
}
