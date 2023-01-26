package com.xworkz.net.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("diesel")
	private Fuel fuel;
	
	public Shell() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		fuel.consume();
	}

	

}
