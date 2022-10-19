package com.xworkz.copy.things;

public class IceCream {
	public String brand;
	public String owner;
	public long contactNo;
	public int   weight;
	public boolean taste;
	public String[] color;
	public String[] qty;
	public String[] flavors;
	public String[] types;
	public int[] price;
	
	public IceCream(String brand, String owner, long contactNo, int weight, boolean taste, String[] color, String[] qty,
			String[] flavors, String[] types, int[] price) {
		this.brand = brand;
		this.owner = owner;
		this.contactNo = contactNo;
		this.weight = weight;
		this.taste = taste;
		this.color = color;
		this.qty = qty;
		this.flavors = flavors;
		this.types = types;
		this.price = price;
	}
	
	public void show() {
		System.out.println(this.brand);
		System.out.println(this.owner);
		System.out.println(this.contactNo);
		System.out.println(this.weight);
		System.out.println(this.taste);
		
		System.out.println(this.color);
		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println(string);
		}
		System.out.println(this.qty);
		for (int i = 0; i < qty.length; i++) {
			System.out.println(this.qty[i]);
		}
		System.out.println(this.flavors);
		for (int i = 0; i < flavors.length; i++) {
			System.out.println(this.flavors[i]);
		}
		System.out.println(this.types);
		for (int i = 0; i < types.length; i++) {
			System.out.println(this.types[i]);
		}
		System.out.println(this.price);
		for (int i = 0; i < price.length; i++) {
			System.out.println(this.price[i]);
		}
	}

}
