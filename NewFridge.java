package com.xworkz.access.office;

public class NewFridge {
	public  Fridge fridge  ;

	public void use(Fridge  fridge ) 
	{
		System.out.println(fridge .brand);
		System.out.println(fridge .color);
		System.out.println(fridge .good);
		System.out.println(fridge .height);
		
		System.out.println(fridge .price);
		System.out.println(fridge .serviceOfCompany);
		System.out.println(fridge .SizeInLiter);
		System.out.println(fridge .use);
		System.out.println(fridge .weight);

		
		
		fridge .getOwner();
		System.out.println(fridge .getOwner());
		fridge .setOwner("xyz");
		System.out.println("after changing  :  " +fridge .getOwner());

}
	
}
