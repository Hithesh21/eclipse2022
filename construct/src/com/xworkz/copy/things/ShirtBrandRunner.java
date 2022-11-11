package com.xworkz.oct.things.boot;

import com.xworkz.oct.things.ShirtBrand;

public class ShirtBrandRunner {

	public static void main(String[] args) {
		ShirtBrand shirtBrand=new ShirtBrand(true);
		shirtBrand.setColor("blue");
		String ref1=shirtBrand.getColor();
		System.out.println("color :"+ref1);
		ShirtBrand.brand="raymonds";
		shirtBrand.show();
		
	}

}
