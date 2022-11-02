package com.xworkz.access.boot;

import com.xworkz.access.office.Fridge;
import com.xworkz.access.office.NewFridge;

public class FridgeRunner {

	public static void main(String[] args) {

		Fridge  fridge  = new Fridge ("lg","gray","forcooling",2,25,2,500,20000, false, false) ;
		
		fridge .getOwner();
		
		 NewFridge   fridge1 = new   NewFridge();
		 
		 fridge1.use(fridge);

	}

}
