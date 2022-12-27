package com.xworkz.cllection.dto;

public class SanitizerDTO {
	
	private String brand;
	private String color;
	private int id;
	private int price;
	
	 public SanitizerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SanitizerDTO(String brand, String color, int id, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.id = id;
		this.price = price;
	}

	@Override
	public String toString() {
		return "SanitizerDTO [brand=" + brand + ", color=" + color + ", id=" + id + ", price=" + price + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
 
	 
}
