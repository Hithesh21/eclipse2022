package com.xworkz.inheritance.hotel;

public class ShoppingMall {
public String name;
public String loc;

public ShoppingMall() {
	// TODO Auto-generated constructor stub
}
 
public ShoppingMall(String name, String loc) {
	
	this.name = name;
	this.loc = loc;
}
public void show() {
	System.out.println(this.name);
	System.out.println(this.loc);
}

}
