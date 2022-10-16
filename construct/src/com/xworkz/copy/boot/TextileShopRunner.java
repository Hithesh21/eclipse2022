package com.xworkz.copy.boot;

import com.xworkz.copy.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
		new TextileShop();
		System.out.println("1===================");	
		TextileShop textileShop=null;
		System.out.println(textileShop);
		
		System.out.println("2===================");	
		TextileShop textileShop1=new TextileShop("abc");
		System.out.println(textileShop1.ownerName);
		System.out.println(textileShop1.ownerWifeName);
		System.out.println(textileShop1.shopNo);
		System.out.println(textileShop1.ownerDaughterName);
		System.out.println(textileShop1.mobileNo);
		System.out.println(textileShop1.shopName);
		
		System.out.println("3===================");	
		TextileShop textileShop2=new TextileShop("abc","abcwife");
		System.out.println(textileShop2.ownerName);
		System.out.println(textileShop2.ownerWifeName);
		System.out.println(textileShop2.shopNo);
		System.out.println(textileShop2.ownerDaughterName);
		System.out.println(textileShop2.mobileNo);
		System.out.println(textileShop2.shopName);
		
		
		System.out.println("4===================");	
		TextileShop textileShop3=new TextileShop("abc","abcwife","rasmika");
		System.out.println(textileShop3.ownerName);
		System.out.println(textileShop3.ownerWifeName);
		System.out.println(textileShop3.shopNo);
		System.out.println(textileShop3.ownerDaughterName);
		System.out.println(textileShop3.mobileNo);
		System.out.println(textileShop3.shopName);
		
		
		System.out.println("5===================");	
		TextileShop textileShop4=new TextileShop("abc","abcwife","rashmika","rrr tex");
		System.out.println(textileShop4.ownerName);
		System.out.println(textileShop4.ownerWifeName);
		System.out.println(textileShop4.shopNo);
		System.out.println(textileShop4.ownerDaughterName);
		System.out.println(textileShop4.mobileNo);
		System.out.println(textileShop4.shopName);
		

		System.out.println("6===================");	
		TextileShop textileShop5=new TextileShop("abc","abcwife","rashmika","rrr tex",12345678);
		System.out.println(textileShop5.ownerName);
		System.out.println(textileShop5.ownerWifeName);
		System.out.println(textileShop5.shopNo);
		System.out.println(textileShop5.ownerDaughterName);
		System.out.println(textileShop5.mobileNo);
		System.out.println(textileShop5.shopName);
		

		System.out.println("7===================");	
		TextileShop textileShop6=new TextileShop("abc","abcwife","rashmika","rrr tex",21223445,201);
		System.out.println(textileShop6.ownerName);
		System.out.println(textileShop6.ownerWifeName);
		System.out.println(textileShop6.shopNo);
		System.out.println(textileShop6.ownerDaughterName);
		System.out.println(textileShop6.mobileNo);
		System.out.println(textileShop6.shopName);
		
		

		System.out.println("8===================");	
		TextileShop textileShop8=new TextileShop(12345123,201,"rrr tex");
		System.out.println(textileShop8.ownerName);
		System.out.println(textileShop8.ownerWifeName);
		System.out.println(textileShop8.shopNo);
		System.out.println(textileShop8.ownerDaughterName);
		System.out.println(textileShop8.mobileNo);
		System.out.println(textileShop8.shopName);
		
		

		System.out.println("9===================");	
		TextileShop textileShop9=new TextileShop("newowner","newwife","sonakshi","india tex");
		System.out.println(textileShop9.ownerName);
		System.out.println(textileShop9.ownerWifeName);
		System.out.println(textileShop9.shopNo);
		System.out.println(textileShop9.ownerDaughterName);
		System.out.println(textileShop9.mobileNo);
		System.out.println(textileShop9.shopName);
	}

}
