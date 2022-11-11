package com.xworkz.inheritance.hotel;

public class Catering  {
public String name;
public int items;
public int price;
public Catering() {
	System.out.println("default const of caters");
	
}
public Catering(String name, int items, int price) {
	super();
	this.name = name;
	this.items = items;
	this.price = price;
}


}
