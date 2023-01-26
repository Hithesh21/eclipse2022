package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Battery {
	@Autowired
	private Capacity capacity;
	
	public Battery() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of capacity.........");

	}

	public Capacity getCapacity() {
		return capacity;
	}

	public void setCapacity(Capacity capacity) {
		this.capacity = capacity;
	}

	public void setCapacity(Class<Capacity> class1) {
		// TODO Auto-generated method stub
		
	}

}
