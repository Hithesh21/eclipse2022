package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDTO;
import com.xworkz.bakery.repository.BakeryRepo;

@Service
public class BakeryServiceImpl implements BakeryService {
	@Autowired
	private BakeryRepo repo;

	@Override
	public boolean validAndSave(BakeryDTO dto) {
		
		System.out.println("running validAndSave in service ");
		boolean save=repo.save(dto);
		System.out.println("saved : "+save);
		return true;
	}

}
