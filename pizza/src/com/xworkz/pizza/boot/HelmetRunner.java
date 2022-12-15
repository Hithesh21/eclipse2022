package com.xworkz.pizza.boot;

import com.xworkz.pizza.constant.Color;
import com.xworkz.pizza.constant.Type;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImpl;
import com.xworkz.pizza.services.HelmetService;
import com.xworkz.pizza.services.HelmetServiceImpl;

public class HelmetRunner {

	public static void main(String[] args) {


		HelmetDTO dto=new HelmetDTO("styles", Type.FULL, Color.MULTI, 900D);
		
		HelmetRepository repository=new HelmetRepositoryImpl();
		
		HelmetService service=new HelmetServiceImpl(repository);
		boolean success=service.checkAndSave(dto);
		System.out.println("success :" +success);
		
	}

}
