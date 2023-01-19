package com.xworkz.soldier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MountainDTO;
import com.xworkz.soldier.repo.MountainRepo;
@Component
public class MountainServiceImpl implements  MountainService {

	
	@Autowired
	private MountainRepo repo;
	@Autowired
	private Validator validator;
	
	public MountainServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validAndSave(MountainDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("started valid and save in service impl");
		System.out.println("dto : "+dto);
		
		Set<ConstraintViolation<MountainDTO>> violations=validator.validate(dto);
		if(!violations.isEmpty()) {
			System.out.println("error is there");
			return false;
		}
		else {
			System.out.println("dto is valid");
			boolean saved=repo.save(dto);
			System.out.println("dto saved : "+dto);
			return saved;
		}
		
		
		
	}

}
