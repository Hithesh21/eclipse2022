package com.xworkz.railwayStation.boot;

import com.xworkz.railwayStation.dto.RailwayStationDTO;
import com.xworkz.railwayStation.repository.RailwayStationRepository;
import com.xworkz.railwayStation.repository.RailwayStationRepositoryImpl;
import com.xworkz.railwayStation.services.RailwayStationService;
import com.xworkz.railwayStation.services.RailwayStationServiceImpl;

public class RailwayStnRunner {

	public static void main(String[] args) {

		
		RailwayStationDTO dto=new RailwayStationDTO("tumkur",120000, 9, 10);
		
		RailwayStationRepository repo=new RailwayStationRepositoryImpl();
		
		RailwayStationService ser=new RailwayStationServiceImpl(repo);
		boolean sucess=repo.Store(dto);
		System.out.println(sucess);
	}

}
