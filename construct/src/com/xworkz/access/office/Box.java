package com.xworkz.access.office;

public class Box {
	public String name;
	private String color="brown";
	public String size;
	public int weight;
	public int price;
	public String shapes;
	public String types;
	public String materials;
	public boolean quality;
	
	public Box(String name,  String size, int weight, int price, String shapes, String types,
			String materials, boolean quality) {
		super();
		this.name = name;
		//this.color = color;
		this.size = size;
		this.weight = weight;
		this.price = price;
		this.shapes = shapes;
		this.types = types;
		this.materials = materials;
		this.quality = quality;
	}
	void setColor(String color) {
		this.color =color;
	}
	public String getColor() {
		return color;
	}
}
