package com.xworkz.access.office;

public class Boxes {
	public Box box;
	public void use(Box box) {
		System.out.println(box.weight);
		System.out.println(box.name);
		System.out.println(box.shapes);
		System.out.println(box.size);
		System.out.println(box.materials);
		System.out.println(box.price);
		System.out.println(box.types);
		System.out.println(box.quality);
		
		box.getColor();
		System.out.println(box .getColor());
		box .setColor("cream");
		System.out.println("after changing  :  " +box .getColor());

	}	
}
