package com.xworkz.copy.boot;

import com.xworkz.copy.Box;

public class BoxRunner {

	public static void main(String[] args) {
		 int[] weight= {5,10,15};
		 int[] price= {200,380,480};
		 String[] shapes= {"square","rectangle"};
		 String[] types= {"packing","storing"};
	    String[] material= {"plastic","cardboad"};
		Box box=new Box("packit","brown","small",weight,price,shapes, types,material);
		box.display();

	}

}
