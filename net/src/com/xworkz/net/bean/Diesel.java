package com.xworkz.net.bean;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.println("==========diesl");
	}

	

}
