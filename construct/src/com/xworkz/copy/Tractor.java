package com.xworkz.copy;

public class Tractor {
	public String ownerName;
	public String brand;
	public int price;
	public String color;
    public double hp;
	public String model;
	
	public Tractor() {
		System.out.println("default contr ");
		
	}
	public Tractor(String ownerName) {
		this();
		System.out.println(" contr with one string args");
        this.ownerName=ownerName;
		
	}
	public Tractor(String ownerName,String brand) {
		this(ownerName);
		System.out.println(" contr with 2 string args");
		this.brand=brand;
	}
	public Tractor(String ownerName,String brand,int price) {
		this(ownerName,brand);
		System.out.println(" contr with 2 string and one int args");
		this.price=price;
	}
	public Tractor(String ownerName,String brand,double hp) {
		this(ownerName,brand);
		System.out.println(" contr with 2 string and 1 double args");
		this.hp=hp;
	}
	public Tractor(String ownerName,String brand,String color) {
		this(ownerName);
		System.out.println(" contr with 3 string args");
		this.brand=brand;
		this.color=color;
	}
	public Tractor(String ownerName,String brand,String color,int price) {
		this(ownerName,brand,color);
		System.out.println(" contr with 4 args");
		this.price=price;
	}
	public Tractor(String ownerName,String brand,String color,int price,double hp) {
		this(ownerName,brand,color,price);
		System.out.println(" contr with 5 args");
		this.hp=hp;
		
	}
}

