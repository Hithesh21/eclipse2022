package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.PaintShop;

public class PaintShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] clr= {"blue","orange"};
		 String[] products= {"scrub","brush","wiper"};
	     String[] type= {"interior","exterior"};
	     String[] staff= {"sachin","santu","rashmika"};
	     int[] price= {200,400,800};
	     
	    PaintShop paintShop=new PaintShop("om paints","swaroop", 123456789, 200, 10, clr, products, staff, type, price);
	    paintShop.show();
	    
	     
	}

}
