package com.xworkz.access.office;

public class EatBread {
public Bread bread;
public void use(Bread bread) {
	System.out.println(bread.weight);
	System.out.println(bread.baked);
	
	System.out.println(bread.taste);
	System.out.println(bread.color);
	System.out.println(bread.location);
	System.out.println(bread.price);
	System.out.println(bread.shape);
	System.out.println(bread.type);
	System.out.println(bread.quantity );
	
	bread.getCompanyName();
	System.out.println(bread .getCompanyName());
	bread .setCompanyName("haldirams");
	System.out.println("after changing  :  " +bread .getCompanyName());

}
}
