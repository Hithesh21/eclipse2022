package com.xworkz.cllection.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable {
	
	
	private String name;
	private String state;
	private int pinCode;
	
	public PlaceDTO() {
		// TODO Auto-generated constructor stub
	}

	public PlaceDTO(String name, String state, int pinCode) {
		super();
		this.name = name;
		this.state = state;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", state=" + state + ", pinCode=" + pinCode + "]";
	}
	@Override
	public boolean equals(Object ref) {
		System.out.println("running equals in dto");
		if(ref!=null) {
			if(ref instanceof PlaceDTO) {
				PlaceDTO dto=(PlaceDTO)ref;
				if(dto.name.equals(this.name)) {
					System.out.println(" name is matching : "+dto.name);
					return true;
				}
			}
		}
		
		
		return false;
	}
	
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
