package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {
	
	private HelmetDTO[] dtos=new HelmetDTO[5];
	int counter=0;

	@Override
	public boolean save(HelmetDTO dto) {
		
		System.out.println("running save in HelmetRepositoryImpl");
		
		if(this.counter>=this.dtos.length) {
			System.err.println("storage is full");
			return false;
		}
		this.dtos[counter]=dto;
		System.out.println("saved " +dto + "at index " +this.counter);
		counter++;
		return true;
	}

}
