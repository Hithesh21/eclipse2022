package com.xworkz.terrorist.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.terrorist.dto.TerroristDTO;

public class TerroristServiceImpl implements TerroristService {

	@Override
	public boolean checkAndSave(TerroristDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("exe check and save start...");
		System.out.println("dto passing : "+dto);
		
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<TerroristDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) //i have errors
		{
			System.out.println("error is there");
			violations.forEach(c-> System.out.println(c.getMessage()));
			return false;
			
		}
		return true;
		
	}
	
	

}
