package com.xworkz.place;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.repository.PlaceRepository;
import com.xworkz.place.repository.PlaceRepositoryImpl;
import com.xworkz.place.services.PlaceService;
import com.xworkz.place.services.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		
		
		PlaceDTO dto=new PlaceDTO("tumkur", "karnataka", "india", "south", 560001);
		
		PlaceRepository repo=new PlaceRepositoryImpl();
		
		PlaceService ser=new PlaceServiceImpl(repo);
		System.out.println(dto);
		
		boolean sucess=ser.checkAndSave(dto);
		System.out.println(sucess);

	}

}
