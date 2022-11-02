package com.xworkz.access.office;

public class EatSamosa {
public Samosa samosa;

public void use(Samosa samosa) {
	System.out.println(samosa.weight);
	System.out.println(samosa.baked);
	System.out.println(samosa.fried);
	System.out.println(samosa.taste);
	System.out.println(samosa.color);
	System.out.println(samosa.location);
	System.out.println(samosa.price);
	System.out.println(samosa.shape);
	System.out.println(samosa.size);
	System.out.println(samosa.ingredient );
	
	samosa.getName();
	System.out.println(samosa .getName());
	samosa .setName("haldirams");
	System.out.println("after changing  :  " +samosa .getName());

}
}

