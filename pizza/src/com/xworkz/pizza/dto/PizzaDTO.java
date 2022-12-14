package com.xworkz.pizza.dto;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDto {
	
	private String name;
	private String company  ;
	private String flavour;
	private double price;
	private boolean cheese;
	private String type;
	private PizzaSize size  ;
	
	public PizzaDTO() {
		
	}

	public PizzaDTO(String name, String company, String flavour, double price, boolean cheese, String type,
			PizzaSize size)//,String createdBy, LocalDateTime createdDate, String updatedBy, LocalDateTime updatedDate) 
	{
		//super(createdBy,createdDate,updatedBy,updatedDate);
		this.name = name;
		this.company = company;
		this.flavour = flavour;
		this.price = price;
		this.cheese = cheese;
		this.type = type;
		this.size = size;
	}

	@Override
	public String toString() {
		return "PizzaDTO [name=" + name + ", company=" + company + ", flavour=" + flavour + ", price=" + price
				+ ", cheese=" + cheese + ", type=" + type + ", size=" + size + ", toString()=" + super.toString()
				+ ", getCreatedBy()=" + getCreatedBy() + ", getCreatedDate()=" + getCreatedDate() + ", getUpdatedBy()="
				+ getUpdatedBy() + ", getUpdatedDate()=" + getUpdatedDate() +  "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}
	
	
	
	
	
	
}
