package com.xworkz.oct.things.boot;

import com.xworkz.oct.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {
	 
		
		Flower.name="mari gold";
		Flower flower=new Flower("yellow");
		flower.setPrice(200);
		int ref1=flower.getPrice();
		System.out.println("Price :"+ref1);
		flower.show();
				

	}

}
