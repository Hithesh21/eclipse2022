package com.xworkz.place.services;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.exception.InvalidDataTypeException;
import com.xworkz.place.exception.StorageFullException;
import com.xworkz.place.repository.PlaceRepository;
import com.xworkz.place.repository.PlaceRepositoryImpl;

public class PlaceServiceImpl implements PlaceRepository {
	
	private PlaceRepository repo;
	
	public PlaceServiceImpl(PlaceRepository repo) {
		this.repo=repo;
	}

	@Override
	public boolean store(PlaceDTO dto) throws InvalidDataTypeException {
		
System.out.println("running save and check in service impl");
		
		String  name=dto.getName();
		String      state=dto.getState();
		String  country=dto.getCountry();
		int pin=dto.getPinCode();
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
		
		if(state!=null && state.length()>=4 && state.length()<=20) {
			System.out.println("state is valid");
			return areas;
		}
		else {
			System.out.println("state is not valid");
		}
		

		if(country!=null && country.length()>=3 && country.length()<=10) {
			System.out.println("country is valid");
			return plat;
		}
		else {
			System.out.println("country is not valid");
		}
		

		if(pin!=0 && pin>=6 && pin<=10) {
			System.out.println("pin is valid");
			return prices;
		}
		else {
			System.out.println("pin is not valid");
		}
		
		if(names && areas && plat  &&prices)
		{
			System.out.println("railway dto is valid");
			boolean saved=repo.store(dto);
			System.out.println("saved railway dto : " +saved );
			return saved;
		}
			else {
				System.err.println("not saved in repo");
			}
		

		
		return true;
	}

}
