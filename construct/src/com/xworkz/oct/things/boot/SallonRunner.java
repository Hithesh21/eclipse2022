package com.xworkz.oct.things.boot;

import com.xworkz.oct.things.Saloon;

public class SallonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saloon.name="best style";
		Saloon saloon=new Saloon(120);
		saloon.setLocation("bangalore");
		String ref=saloon.getLocation();
		System.out.println("location :"+ref);
		saloon.show();
	}

}
