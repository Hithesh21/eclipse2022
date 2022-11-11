package com.xworkz.access.office;

public class Freinds {
	public Freind freind;

	public void use(Freind freind) 
	{
		System.out.println(freind.birthYear);
		System.out.println(freind.clg);
		System.out.println(freind.drink);
		System.out.println(freind.friend);
		System.out.println(freind.gf);
		System.out.println(freind.goodBoy);
		System.out.println(freind.height);
		System.out.println(freind.weight);
		System.out.println(freind.shirtSize);
		System.out.println(freind.smoke);
		freind.getTown();
		System.out.println(freind.getTown());
		freind.setTown("mudhol");
		System.out.println("after changing  :  " +freind.getTown());
	}

	}

