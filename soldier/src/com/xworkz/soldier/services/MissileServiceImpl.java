package com.xworkz.soldier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.Missile;
import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repo.MissileRepo;
@Component
public class MissileServiceImpl implements MissileService {
	
	private MissileRepo repo;
	private Validator validator;
	
	
    @Autowired
	public MissileServiceImpl(MissileRepo repo, Validator validator) {
		super();
		this.repo = repo;
		this.validator = validator;
	}



	@Override
	public boolean validateAndSave(Missile dto) {
		System.out.println("running validateAndSave in service impl");
		System.out.println("dto : "+dto);
		
		Set<ConstraintViolation<Missile>> violations = validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("error is there");
			return false;
		}
		else {
			System.out.println("dto is valid");
			boolean saved=repo.save(dto);
			System.out.println("saved dto : "+dto);
			return saved;
		}

		
		
		
	}

}
