package com.xworkz.association.things;

public class Pillar {
public int id;
public String place;
public Shape shape=Shape.ROUND;
public  Company company=new Company("abc","private");

public Pillar(int id, String place) {
	this.id = id; 
	this.place = place;
}

public void show() {
	System.out.println("running show of pillar");
	System.out.println("id :"+id);
	System.out.println("place :"+place);
	System.out.println("shape :"+shape);
	

	company.show();
}

}
