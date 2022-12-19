package com.xworkz.place.repository;

import com.xworkz.place.dto.PlaceDTO;
//import com.xworkz.place.exception.InvalidTypeDataException;
//import com.xworkz.place.exception.InvalidDataTypeException;
import com.xworkz.place.exception.StorageFullException;

public class PlaceRepositoryImpl implements PlaceRepository {
	private PlaceDTO[] dtos=new PlaceDTO[5];
	private int count=0;

	@Override
	public boolean store(PlaceDTO dto) throws StorageFullException {
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
