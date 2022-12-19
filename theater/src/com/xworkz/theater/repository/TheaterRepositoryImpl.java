package com.xworkz.theater.repository;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.exception.StorageFullException;

public class TheaterRepositoryImpl implements TheaterRepository  {
   private TheaterDTO[] dtos=new TheaterDTO[5];
   private int counter=0;


@Override
public boolean Store(TheaterDTO dto) throws StorageFullException {

    System.out.println("running store in TheaterRepositoryImpl");
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