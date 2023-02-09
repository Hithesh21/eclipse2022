package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;
@Repository
public class BakeryRepoImpl implements BakeryRepo {
	
	

	public boolean save(BakeryDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("running save in repo");
		return true;
	}

}
