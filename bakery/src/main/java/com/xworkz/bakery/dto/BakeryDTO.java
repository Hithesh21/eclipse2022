package com.xworkz.bakery.dto;

import lombok.Data;

@Data
public class BakeryDTO {
	
	private String name;
	private String owner;
	private boolean married;
	private String wife;
	private String daughter;
	private String famous;
	private String since;
	
	
	public BakeryDTO() {
    System.out.println("created : " + getClass().getSimpleName());
	}

}
