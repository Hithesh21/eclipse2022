package com.xworkz.soldier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.ResortRepo;
@Component
public class ResortServiceImpl implements ResortService {
	@Autowired
	private ResortRepo repo;
	private Validator validator;
	
	
	
    @Autowired
	public ResortServiceImpl(Validator validator) {
		super();
		this.validator = validator;
	}



	@Override
	public boolean validateAndSave(ResortDTO dto) {
		System.out.println("started validandsave in impl");
		System.out.println("DTO : "+dto);
		
		Set<ConstraintViolation<ResortDTO>> violations = validator.validate(dto);

		
		if(!violations.isEmpty()) {
			System.out.println("there is error in dto");
			return false;
			}
		else {
			System.out.println("dto is valid");
			boolean saved=repo.save(dto);
			System.out.println("saved dto  : "+dto);
			return saved;
		}
		
		}

	
}
