package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.PetrolBunk;
import com.xworkz.inheritance.hotel.things.Venkateshwara;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		
		PetrolBunk bunk=new PetrolBunk();
		bunk.fillPetrol();
		bunk.fillDiesel();
		System.out.println("=====================");
        Venkateshwara venkateshwara=new Venkateshwara();
        venkateshwara.fillPetrol();
	}

}
