package com.xworkz.place.dto;

public class PlaceDTO extends AbstractAuditDTO{
	
	private String name;
	private String state;
	private String country;
	private String region;
	private int pinCode;
	
	public PlaceDTO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", state=" + state + ", country=" + country + ", region=" + region
				+ ", pinCode=" + pinCode + "]";
	}

	public PlaceDTO(String name, String state, String country, String region, int pinCode) {
		super();
		this.name = name;
		this.state = state;
		this.country = country;
		this.region = region;
		this.pinCode = pinCode;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	
}
