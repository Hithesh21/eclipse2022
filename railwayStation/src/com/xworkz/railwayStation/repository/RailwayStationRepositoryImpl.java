package com.xworkz.railwayStation.repository;

import com.xworkz.railwayStation.dto.RailwayStationDTO;

public class RailwayStationRepositoryImpl implements RailwayStationRepository{
	
	private  RailwayStationDTO[] dtos
			=new RailwayStationDTO[5];
	private int count=0;
	

	@Override
	public boolean Store(RailwayStationDTO dto) {
		
		System.out.println("running store in repo impl");
		
		if(this.count>=this.dtos.length) {
			System.out.println("storage is full");
			return false;
			
		}
		
		this.dtos[count]=dto;
		System.out.println("saved dto : " +dto + "at index ;" +count);
		count++;
		
		return true;
		
	}

}
