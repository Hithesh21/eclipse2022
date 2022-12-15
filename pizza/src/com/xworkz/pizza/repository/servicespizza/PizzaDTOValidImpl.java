package com.xworkz.pizza.services;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;

public class PizzaDTOValidImpl implements PizzaDTOValid {

	@Override
	public boolean checkValid(PizzaDTO pizza) {

       System.out.println("running PizzaDTOValidImpl ");
       
       String name = pizza.getName();
		String company = pizza.getCompany();
		PizzaSize size = pizza.getSize();
		double price = pizza.getPrice();
		String type = pizza.getType();
		boolean names = false;
		boolean companys = false;
		boolean sizeis=false;
		boolean priceis=false;
		boolean typeis=false;
		
		if(name!=null && name.length() >=4 && name.length()<=20) {
			System.out.println(" the name is valid " +name);
			names=true;
		}
		else {
			System.err.println("the name is not valid");
		}
		

		if(company!=null && company.length() >=4 && company.length()<=20) {
			System.out.println(" the company is valid " +name);
			companys=true;
		}
		else {
			System.err.println("the company is not valid");
		}
		

		if( price >=50 && price <=2000) {
			System.out.println(" the price is valid " +price);
			priceis=true;
		}
		else {
			System.err.println("the price is not valid ");
		}
		
		if(size != null) {
			System.out.println("the size is valid " +size);
			sizeis=true;
		}
		else {
			System.err.println("the size is not valid ");
		}
       
		if(type!=null && type=="veg" || type=="n-veg") {
			System.out.println(" the type is valid " +type);
			typeis=true;
		}
		else {
			System.err.println("the type is not valid");
		}
		
		if(names && companys && sizeis && priceis && typeis) {
			System.out.println("DTO valid");
			return true;
		}
		else {

		System.out.println("DTO Invalid");
		}
		
		return false;
	}

}
