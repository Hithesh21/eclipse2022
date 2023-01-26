package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Area {
	
	//@Autowired
	private String name;
	
	public Area() {
		System.out.println("created no-args const of area.........");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
