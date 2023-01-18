package com.xworkz.terrorist.boot;

import com.xworkz.terrorist.dto.TerroristDTO;
import com.xworkz.terrorist.services.TerroristService;
import com.xworkz.terrorist.services.TerroristServiceImpl;

public class Runner {

	public static void main(String[] args) {

		
		TerroristDTO dto=new TerroristDTO();
		System.out.println(dto);
		dto.setName("obel");
		dto.setAge(30);
		dto.setCountry("Pakistan");
		
		TerroristDTO dto1=new TerroristDTO();
		System.out.println(dto);
		dto.setName("ob");
		dto.setAge(-1);
		dto.setCountry("Pakistan");
		
		
		TerroristService service=new TerroristServiceImpl();
		 service.checkAndSave(dto);
	}

}
