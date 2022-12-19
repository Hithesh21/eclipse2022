package com.xworkz.theater.services;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {
    private TheaterRepository theater;
    
    
    
	public TheaterServiceImpl(TheaterRepository theater) {
		super();
		this.theater = theater;
	}



	@Override
	public boolean checkAndValidate(TheaterDTO dto) throws InvalidDataException {
     System.out.println(" runnig checkAndValidate in TheaterServiceImpl");
      String name= dto.getName();
      String type=dto.getType();
      int seats=dto.getNoOfSeats();
      int id=dto.getId();
      boolean nameValid=false;
		boolean typeValid=false;
		boolean seatsValid=false;
		boolean idValid=false;
     
		if(name!=null && name.length()>=4 && name.length()<=20)
		{
			System.out.println("names is valid");
			nameValid=true;
		}
		else {
			System.err.println("name is not valid");
		}

		if(type!=null && name.length()>=4 && name.length()<=20)
		{
			System.out.println("type is valid");
			typeValid=true;
		}
		else {
			System.err.println("type is not valid");
		}

         if(seats!=0 && seats >120 && seats <2000)
     		{
     			System.out.println("seats is valid");
     			seatsValid=true;
     		}
     		else {
     			System.err.println("seats is not valid");
     		}
         
       if(id!=0 && id >10 && id <200)
  		{
  			System.out.println("id is valid");
  			idValid=true;
  		}
  		else {
  			System.err.println("id is not valid");
  		}
 
        	if(nameValid && typeValid && seatsValid && idValid) {
        		System.out.println("theater dto can store repo");
        		boolean saved=this.theater.Store(dto);
        		System.out.println("saved  :"+saved);
        		return saved;
        		
        	}
        		else
        		{
        			System.out.println("theater dto cannot store in repo");
        		}
        		
        	
        	 
		return false;
	}

}
