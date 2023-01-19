package com.xworkz.soldier.repo;

import com.xworkz.soldier.dto.SoldierDTO;

public class SoldierRepoImpl implements SoldierRepo {

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running save");
		return true;
	}
	
	

	

}
