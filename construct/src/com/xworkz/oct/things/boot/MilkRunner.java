package com.xworkz.oct.things.boot;

import com.xworkz.oct.things.Milk;

public class MilkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Milk.brand="nandini";
		Milk milk=new Milk(42);
		milk.setLocation("bangalore");
		String ref=milk.getLocation();
		System.out.println("location :"+ref);
		milk.show();
	}

}
