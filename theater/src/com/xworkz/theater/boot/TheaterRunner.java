package com.xworkz.theater.boot;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.repository.TheaterRepository;
import com.xworkz.theater.repository.TheaterRepositoryImpl;
import com.xworkz.theater.services.TheaterService;
import com.xworkz.theater.services.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) {

     
		TheaterDTO dto=new TheaterDTO("in", "multiplex", 210, 80);
		
		TheaterRepository repository=new TheaterRepositoryImpl();
		
		TheaterService service=new TheaterServiceImpl(repository);
		
		System.out.println(dto);
		//boolean sucess = false;
		try {
			boolean sucess = service.checkAndValidate(dto);
			System.out.println("sucess : "+sucess);
			
		} catch (InvalidDataException e) {
			e.getMessage();
			e.printStackTrace();
		}
		//System.out.println("sucess : "+sucess);
		
		
	}

}
