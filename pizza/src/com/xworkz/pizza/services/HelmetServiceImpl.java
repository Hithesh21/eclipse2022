package com.xworkz.pizza.services;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.Type;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;

public class HelmetServiceImpl implements HelmetService {
	
	private HelmetRepository helmetRepository;

	
	
	public HelmetServiceImpl(HelmetRepository helmetRepository) {
		super();
		this.helmetRepository = helmetRepository;
	}



	@Override
	public boolean checkAndSave(HelmetDTO dto) {
		System.out.println("running check and save in HelmetServiceImpl");
		String brand=dto.getBrand();
		Type type=dto.getType();
		Color color=dto.getColor();
		Double price=dto.getPrice();
		boolean brandValid=false;
		boolean typeValid=false;
		boolean colorValid=false;
		boolean priceValid=false;
		
		if(brand!=null && brand.length()>=4 && brand.length()<=10) {
			System.out.println("brand is valid");
			brandValid=true;
		}
		else {
			System.out.println("brand is invalid");
		}
		

		if(type!=null ) {
			System.out.println("type is valid");
			typeValid=true;
		}
		else {
			System.out.println("type is invalid");
		}
		
		if(color!=null ) {
			System.out.println("color is valid");
			colorValid=true;
		}
		else {
			System.out.println("color is invalid");
		}
		
		if(price!=null && price > 200 && price < 10000 ) {
			System.out.println("price is valid");
			priceValid=true;
		}
		else {
			System.out.println("price is invalid");
		}
		
		if(brandValid  &&  typeValid &&  colorValid && priceValid) {
			
			System.out.println("helmet dto is valid can save in repo");
			boolean saved=this.helmetRepository.save(dto);
			System.out.println("Helmet DTO saved " +saved);
			return saved;
		}else
		{
			System.err.println("helmet dto is invalid cannot save in repo"); 
		}
			
		
		
		
		return false;
	}

}
