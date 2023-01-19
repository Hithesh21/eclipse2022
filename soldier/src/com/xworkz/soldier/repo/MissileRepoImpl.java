package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.Missile;
@Component
public class MissileRepoImpl implements MissileRepo {
	
	public boolean save(Missile dto) {
		System.out.println("running save in repoimpl");
		
		
		
		
		return true;
		
	}

}
