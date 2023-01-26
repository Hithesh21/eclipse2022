package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {
	@Autowired
	private Location location;
	
	public Company() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of company.........");

	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setLocation(Class<Location> class1) {
		// TODO Auto-generated method stub
		
	}

}
