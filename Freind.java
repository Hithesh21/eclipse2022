package com.xworkz.access.office;

public class Freind {
	private String city = "bangalore";
	String clg;
	String friend;
	String gf;
	int height;
	int birthYear;
	int weight;
	boolean drink;
	boolean smoke;
	boolean goodBoy;
	int shirtSize;
	
	public Freind(String clg, String friend, String gf, int height, int birthYear, int weight, boolean drink,
			boolean smoke, boolean goodBoy, int shirtSize) {
		super();
		this.clg = clg;
		this.friend = friend;
		this.gf = gf;
		this.height = height;
		this.birthYear = birthYear;
		this.weight = weight;
		this.drink = drink;
		this.smoke = smoke;
		this.goodBoy = goodBoy;
		this.shirtSize = shirtSize;
	}
	 public String getTown() 
	 {
		return this.city=city;
	 }
	 void setTown(String city) 
	 {
		this.city=city; 
	 }
	 
}
