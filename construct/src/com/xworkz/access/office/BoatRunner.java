package com.xworkz.access.office;

public class BoatRunner {

	public static void main(String[] args) {
		 Boat boat=new Boat("ivory", "chaddha", 'b', "wife", true);
		 String ref=boat.getName();
		 System.out.println(ref);
Boats boats=new Boats();
boats.use(boat);
	}

}
