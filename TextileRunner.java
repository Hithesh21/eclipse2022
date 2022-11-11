package com.xworkz.access.boot;

import com.xworkz.access.office.Textile;
import com.xworkz.access.office.TextileShop;

public class TextileRunner {

	public static void main(String[] args) {
		TextileShop textileShop=new TextileShop("sachin","priya", "rashmika", 21, 98458989);
String ref=textileShop.getShopName();
System.out.println(ref);
Textile textile=new Textile();
textile.use(textileShop);
	}

}
