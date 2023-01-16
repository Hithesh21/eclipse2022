package com.xworkz.net.bean;

import org.springframework.stereotype.Component;

@Component
public class Airtel implements Provider {
	
	public Airtel() {
		System.out.println("no-args in airtel");


	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("running connect in airtel");

	}

	

}
