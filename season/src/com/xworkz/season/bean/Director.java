package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Director {
	@Autowired
	@Qualifier("expeience")
	private Experience experience;
	@Autowired
	@Qualifier("cameraMan")

	private CameraMan cameraMan;
	
	public Director() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of Director.........");

	}

	public Experience getExperience() {
		return experience;
	}

	public CameraMan getCameraMan() {
		return cameraMan;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public void setCameraMan(CameraMan cameraMan) {
		this.cameraMan = cameraMan;
	}

	public void setExperience(Class<Experience> class1) {
		// TODO Auto-generated method stub
		
	}

	public void setCameraMan(Class<CameraMan> class1) {
		// TODO Auto-generated method stub
		
	}
	

}
