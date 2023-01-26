package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Capacity {
	
	//@Autowired
	private int charge;
	
	public Capacity() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of capacity.........");

	}

	public int getCharge() {
		return charge;
	}

	public void setCharge(int charge) {
		this.charge = charge;
	}

}
