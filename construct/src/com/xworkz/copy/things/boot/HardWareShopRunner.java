package com.xworkz.copy.things.boot;

import com.xworkz.copy.things.HardWareShop;

public class HardWareShopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] clr= {"blue","orange"};
		 String[] products= {"paint","brush","wiper"};
	     String[] type= {"interior","exterior"};
	     String[] staff= {"sachin","santu","preethi"};
	     int[] price= {200,400,800};
	     
	     HardWareShop hardWareShop=new HardWareShop("best hard ware", "nitesh", "rajajinagar", 560001, 20, clr, products, staff, type, price);
	     hardWareShop.show();
	     
	}

}
