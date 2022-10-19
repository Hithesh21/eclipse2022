package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.Shirts;
import com.xworkz.copy.things.Size;

public class ShirtsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] color= {"blue","orange"};
		 String[] type= {"slimfit","regular","smartfit"};
	     int[] price= {500,1000};
	     
	     Shirts shirts=new Shirts("raymonds",Size.MEDIUM, 123456789, 1, true, color, type, price);
	     shirts.show();
	}

}
