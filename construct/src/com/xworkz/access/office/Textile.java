package com.xworkz.access.office;

public class Textile {
public TextileShop textileShop;
public void use(TextileShop textileShop) {
	
	System.out.println(textileShop.ownerName);
	System.out.println(textileShop.ownerWifeName);
	System.out.println(textileShop.ownerDaughterName);
	System.out.println(textileShop.shopNo);
	System.out.println(textileShop.mobileNo);
	
	textileShop.getShopName();
	System.out.println(textileShop.getShopName());
	textileShop.setShopName("abc tex");
	System.out.println("after changing  ..." +textileShop.getShopName());
}}
