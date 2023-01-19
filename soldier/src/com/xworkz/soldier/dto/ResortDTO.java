package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ResortDTO extends AbstractAuditDTO {
	/*
	@NotNull
	@Size(min=3,max=20,message="name should be within the range")
	private String name;
	@NotNull
	@Size(min=3,max=20,message="owner should be within the range")
	private String owner;
	@NotNull
	@Size(min=3,max=20,message="location should be within the range")
	private String location;
	@Max(value=200,message="price should be above 200")
	@Min(value=11000,message="price should be within 11000")
	private int price;
*/
	

}
