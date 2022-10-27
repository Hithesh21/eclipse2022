package com.xworkz.association.things;

public class Weapon {
public String name;
public double weight;
public String use;
public Weapon(String name, double weight, String use) {
	super();
	this.name = name;
	this.weight = weight;
	this.use = use;
}

public void show() {
	System.out.println("entered show of weapon");
	System.out.println("name :"+name);
	System.out.println("weight :"+weight);
	System.out.println("use :"+use);
}

}
