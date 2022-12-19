package com.xworkz.theater.dto;

public class TheaterDTO extends AbstractDTO {
	
	private String name;
	private String type;
	private int noOfSeats;
	private int id;
	
	public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}

	public TheaterDTO(String name, String type, int noOfSeats, int id) {
		super();
		this.name = name;
		this.type = type;
		this.noOfSeats = noOfSeats;
		this.id = id;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", type=" + type + ", noOfSeats=" + noOfSeats + ", id=" + id
				+ ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	




}
