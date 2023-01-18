package com.xworkz.soldier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;

public class SoldierServiceImpl implements SoldierService {

	private SoldierRepo soldierRepo;

	public SoldierServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public void setSoldierRepo(SoldierRepo soldierRepo) {
		this.soldierRepo = soldierRepo;
	}

	@Override
	public boolean checkAndValidate(SoldierDTO dto) {
		System.out.println("starting checkAndValidate........ ");
		System.out.println("dto : " + dto);

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<SoldierDTO>> violations = validator.validate(dto);
		if (!violations.isEmpty()) // i have errors
		{
			System.out.println("error is there");
			violations.forEach(c -> System.out.println(c.getMessage()));
			return false;
		} else {
			System.out.println("dto is valid");
			boolean saved = this.soldierRepo.save(dto);
			System.out.println("saved dto : " + saved);
			return true;
			//return this.soldierRepoImpl.save(dto);
		}

	}

}
