package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.ShoppingMall;
import com.xworkz.inheritance.hotel.things.OrionMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {
		OrionMall orion=new OrionMall("orion","rjn",20000 );
		orion.show();

		ShoppingMall shop=new OrionMall();
		OrionMall shop1=(OrionMall)shop;
		//shop.show();
		shop1.show();
	}

}
