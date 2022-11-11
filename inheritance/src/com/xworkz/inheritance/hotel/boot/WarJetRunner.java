package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.WarJet;
import com.xworkz.inheritance.hotel.things.Rafell;

public class WarJetRunner {

	public static void main(String[] args) {
		WarJet jet=new WarJet();
		jet.fillPetrol();
		System.out.println("=====================");
		Rafell ref=new Rafell();
		ref.fillPetrol();
	}

}
