package com.xworkz.net.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class InternetExplorer implements Browser {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;

	
	public InternetExplorer() {
		// TODO Auto-generated constructor stub
		System.out.println("no-args of internet explorer");

	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("running browse of internet explorer");
		provider.connect();

		
	}

	

}
