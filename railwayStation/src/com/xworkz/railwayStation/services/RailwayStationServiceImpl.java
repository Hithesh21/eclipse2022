package com.xworkz.railwayStation.services;

import com.xworkz.railwayStation.dto.RailwayStationDTO;
import com.xworkz.railwayStation.repository.RailwayStationRepository;
import com.xworkz.railwayStation.*;

public class RailwayStationServiceImpl implements RailwayStationService {
	
	
	private RailwayStationRepository repo;
	
	public RailwayStationServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public RailwayStationServiceImpl(RailwayStationRepository repo) {
		this. repo=repo;
		// TODO Auto-generated constructor stub
	}
	public boolean saveAndCheck(RailwayStationDTO dto) {
		System.out.println("running save and check in service impl");
		
		String  name=dto.getName();
		int      area=dto.getArea();
		int  platform=dto.getNoOfPlatforms();
		int price=dto.getPlatformTicketprice();
		boolean names=true;
		boolean areas=true;
		boolean plat=true;
		boolean prices=true;
		
		if(name!=null && name.length()>=3 && name.length()<=20) {
			System.out.println("name is valid");
			return names;
		}
		else {
			System.out.println("name is not valid");
		}
		
		if(area!=0 && area>=100000 && area<=200000) {
			System.out.println("area is valid");
			return areas;
		}
		else {
			System.out.println("area is not valid");
		}
		

		if(platform!=0 && platform>=2 && platform<=10) {
			System.out.println("platform is valid");
			return plat;
		}
		else {
			System.out.println("platform is not valid");
		}
		

		if(price!=0 && price>=10 && price<=20) {
			System.out.println("price is valid");
			return prices;
		}
		else {
			System.out.println("price is not valid");
		}
		
		if(names && areas && plat  &&prices)
		{
			System.out.println("railway dto is valid");
			boolean saved=repo.Store(dto);
			System.out.println("saved railway dto : " +saved );
			return saved;
		}
			else {
				System.err.println("not saved in repo");
			}
		

		
		
		
		return true;
	}

}
