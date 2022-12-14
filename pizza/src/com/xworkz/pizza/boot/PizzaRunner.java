package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.PizzaSize;
import com.xworkz.pizza.dto.PizzaDTO;
import com.xworkz.pizza.services.PizzaDTOValid;
import com.xworkz.pizza.services.PizzaDTOValidImpl;

public class PizzaRunner {
   
	public static void main(String[] args) {
		
		PizzaDTOValid valid=new PizzaDTOValidImpl();
		PizzaDTO dto=new PizzaDTO("cheespizza","dominos","chilly", 200, true, "veg",PizzaSize.SMALL);
	    dto.setCreatedBy("system");
	    dto.setCreatedDate(LocalDateTime.now());
	    System.out.println(dto);
	    valid.checkValid(dto);
	    System.out.println("==========================================================");
		PizzaDTO dto1=new PizzaDTO("piz","nos","lly", 20, true, "veg",PizzaSize.SMALL);
		valid.checkValid(dto1);
		System.out.println(dto.getCreatedBy());
		System.out.println(dto.getCreatedDate());
}
}
