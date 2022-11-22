package com.xworkz.equality;

public class Vehicle {
	
	private String brand;
	private String model;
	private String type;
	private String mfrLoc;
	private String ambassador;
	private String color;
	private int price;
	private double bhp;
	private boolean withgear;
	private boolean comfort;
	
public Vehicle() {
	System.out.println("default of vehicle");
	
}

public Vehicle(String brand, String model, String type, String mfrLoc, String ambassador, String color, int price,
		double bhp, boolean withgear, boolean comfort) {
	super();
	this.brand = brand;
	this.model = model;
	this.type = type;
	this.mfrLoc = mfrLoc;
	this.ambassador = ambassador;
	this.color = color;
	this.price = price;
	this.bhp = bhp;
	this.withgear = withgear;
	this.comfort = comfort;
}

@Override
public String toString() {
	return "Vehicle [brand=" + brand + ", model=" + model + ", type=" + type + ", mfrLoc=" + mfrLoc + ", ambassador="
			+ ambassador + ", color=" + color + ", price=" + price + ", bhp=" + bhp + ", withgear=" + withgear
			+ ", comfort=" + comfort + "]";
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public String getMfrLoc() {
	return mfrLoc;
}

public void setMfrLoc(String mfrLoc) {
	this.mfrLoc = mfrLoc;
}

public String getAmbassador() {
	return ambassador;
}

public void setAmbassador(String ambassador) {
	this.ambassador = ambassador;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public double getBhp() {
	return bhp;
}

public void setBhp(double bhp) {
	this.bhp = bhp;
}

public boolean isWithgear() {
	return withgear;
}

public void setWithgear(boolean withgear) {
	this.withgear = withgear;
}

public boolean isComfort() {
	return comfort;
}

public void setComfort(boolean comfort) {
	this.comfort = comfort;
}

public boolean equals(Object other) {
	System.out.println("entered equals method");
	if(other instanceof Vehicle) {
		System.out.println("other is type of Vehicle");
		Vehicle casted=(Vehicle)other;
		if(this.brand.equals(casted.brand) && this.model.equals(casted.model)) {
			System.out.println("brand is same");
			return true;
		}
		else {
			System.err.println("other is not vehicle,cannot check properties");
		}
	}
	
	return false;
}
}
