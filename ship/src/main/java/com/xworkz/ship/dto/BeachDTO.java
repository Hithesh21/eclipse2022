package com.xworkz.ship.dto;

import lombok.Data;

@Data
public class BeachDTO {

	private String name;
	private String location;
	private boolean clean;
	private String games;



	
	public BeachDTO() {
		// TODO Auto-generated constructor stub
		System.out.println("created : " + getClass().getSimpleName());

	}
}
