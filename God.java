package com.xworkz.association.things;

public class God {
	public String name;
	public String gender;
	public String mainPower;
    public Weapon weapon=new Weapon("chakra",1.5 ,"destroy");
	public God(String name, String gender, String mainPower) {
		super();
		this.name = name;
		this.gender = gender;
		this.mainPower = mainPower;
	}
    
	public void show() {
		System.out.println("entered show of god");
		System.out.println("name :"+name);
		System.out.println("gender :"+gender);
		System.out.println("power :"+mainPower);
		weapon.show();
	}


}
