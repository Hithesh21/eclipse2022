package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.PetrolBunk;

public class Venkateshwara extends PetrolBunk{
	
	public void fillPetrol() {
		System.out.println("filling petrol at venkateshwara");
		super.fillPetrol();
		super.fillDiesel();
	}

}
