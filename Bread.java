package com.xworkz.access.office;

public class Bread {
	public char	type;
	public String	shape;
	public int price;
	public int	quantity;
	private		  String	companyName="modern";
	public boolean baked;
	public boolean taste;
	public String color;
	public int weight;
	public String location;
	
	public Bread(char type, String shape, int price, int quantity, String companyName, boolean baked, boolean taste,
			String color, int weight, String location) {
		super();
		this.type = type;
		this.shape = shape;
		this.price = price;
		this.quantity = quantity;
		this.companyName = companyName;
		this.baked = baked;
		this.taste = taste;
		this.color = color;
		this.weight = weight;
		this.location = location;
	}
	void setCompanyName(String	companyName) {
		this.companyName=companyName;
	}
	public String	getCompanyName() {
		return companyName;
	}
	
}
