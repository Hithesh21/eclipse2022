package com.xworkz.season.bean;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
	
	private Camera camera;
	
	public CameraMan() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of camera man.........");

	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	public void setCamera(Class<Camera> class1) {
		// TODO Auto-generated method stub
		
	}

}
