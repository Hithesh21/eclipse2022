package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.Type;

public class HelmetDTO extends AbstractAuditDto{
	
	private String brand;
	private Type type  ;
	private Color color;
	private Double price;
	
	public HelmetDTO() {
		// TODO Auto-generated constructor stub
	}

	public HelmetDTO(String brand, Type type, Color color, Double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", color=" + color + ", price=" + price
				+ ", toString()=" + super.toString() + ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()="
				+ getCreatedDate() + ", getUpdatedBy()=" + getUpdatedBy() + ", getUpdatedDate()=" + getUpdatedDate()
				+ "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
