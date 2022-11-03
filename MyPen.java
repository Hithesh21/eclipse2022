package com.xworkz.access.office;

public class MyPen {
public Pen pen;

public void use(Pen pen) {
	
	System.out.println(pen.color);
	System.out.println(pen.type);
	System.out.println(pen.size);
	System.out.println(pen.price);
	System.out.println(pen.weight);
	System.out.println(pen.length);
	System.out.println(pen.withBox);
	System.out.println(pen.withCap);
	System.out.println(pen.isWriting);
	System.out.println(pen.pocketHold );
	
	pen.getBrand();
	System.out.println(pen .getBrand());
	pen .setBrand("reynolds");
	System.out.println("after changing  :  " +pen .getBrand());

}
}

