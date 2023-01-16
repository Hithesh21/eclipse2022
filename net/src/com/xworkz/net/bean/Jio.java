package com.xworkz.net.bean;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Provider {
	
	public Jio() {
	 System.out.println("no-args of jio");
	}

	@Override
	public void connect() {
		System.out.println("running connect in jio");
		
	}

}
