package com.xworkz.equality;

public class WaterBottle {
	private String brand;
	private String size;
	private String type;
	private String mfrLoc;
	private String ambassador;
	private String color;
	private int price;
	private double qty;
	private boolean mineral;
	private boolean taste;
	
	
public WaterBottle() {
	System.out.println("default of Waterbottle");
	
}
public WaterBottle(String brand, String size, String type, String mfrLoc, String ambassador, String color, int price,
		double qty, boolean mineral, boolean taste) {
	super();
	this.brand = brand;
	this.size = size;
	this.type = type;
	this.mfrLoc = mfrLoc;
	this.ambassador = ambassador;
	this.color = color;
	this.price = price;
	this.qty = qty;
	this.mineral = mineral;
	this.taste = taste;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
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
public double getQty() {
	return qty;
}
public void setQty(double qty) {
	this.qty = qty;
}
public boolean isMineral() {
	return mineral;
}
public void setMineral(boolean mineral) {
	this.mineral = mineral;
}
public boolean isTaste() {
	return taste;
}
public void setTaste(boolean taste) {
	this.taste = taste;
}
@Override
public String toString() {
	return "WaterBottle [brand=" + brand + ", size=" + size + ", type=" + type + ", mfrLoc=" + mfrLoc + ", ambassador="
			+ ambassador + ", color=" + color + ", price=" + price + ", qty=" + qty + ", mineral=" + mineral
			+ ", taste=" + taste + "]";
}
public boolean equals(Object other) {
	System.out.println("entered equal method");
	if(other instanceof WaterBottle) {
		System.out.println("other is same of waterbottle");
		WaterBottle casted=(WaterBottle)other;
		if(this.brand.equals(casted.brand) && this.size.equals(casted.size) && this.type.equals(casted.type)) {
			System.out.println("brand,size,type are same");
		}
		else {
			System.err.println("other is not same ,cannot check properties");
		}
	}
	
	
	
	
	return false;
}
}
