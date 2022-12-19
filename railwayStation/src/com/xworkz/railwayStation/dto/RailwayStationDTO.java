package com.xworkz.railwayStation.dto;

public class RailwayStationDTO extends AbstractAuditDTO {
	
	private String name;
	private int area;   ;
	private int noOfPlatforms;
	private int PlatformTicketprice;
	
	
	public RailwayStationDTO() {
		// TODO Auto-generated constructor stub
	}


	public RailwayStationDTO(String name, int area, int noOfPlatforms, int platformTicketprice) {
		super();
		this.name = name;
		this.area = area;
		this.noOfPlatforms = noOfPlatforms;
		PlatformTicketprice = platformTicketprice;
	}
	
	


	@Override
	public String toString() {
		return "RailwayStationDTO [name=" + name + ", area=" + area + ", noOfPlatforms=" + noOfPlatforms
				+ ", PlatformTicketprice=" + PlatformTicketprice + ", toString()=" + super.toString()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}


	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}


	public int getPlatformTicketprice() {
		return PlatformTicketprice;
	}


	public void setPlatformTicketprice(int platformTicketprice) {
		PlatformTicketprice = platformTicketprice;
	}
	
	
}
