package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.IceCream;

public class IceCreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clr= {"blue","orange"};
		 String[] fla= {"strawberry","choco","butterscotch"};
	     String[] type= {"cone","tub"};
	     String[] quant= {"50ml","75ml","100ml"};
	     int[] pri= {20,40,80};
	     IceCream iceCream=new IceCream("nandini", "kmf", 123456789, 1, true, clr, quant, fla, type, pri);
	     iceCream.show();
	}

}
