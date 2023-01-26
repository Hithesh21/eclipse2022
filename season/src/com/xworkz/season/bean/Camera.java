package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	//@Autowired
	private Battery battery;
	
public Camera() {
	// TODO Auto-generated constructor stub
	System.out.println("created no-args const of camera.........");

}

public Battery getBattery() {
	return battery;
}

public void setBattery(Battery battery) {
	this.battery = battery;
}

public void setBattery(Class<Battery> class1) {
	// TODO Auto-generated method stub
	
}	

}
