package com.xworkz.soldier.repo;

import org.springframework.stereotype.Component;

import com.xworkz.soldier.dto.MountainDTO;
@Component
public class MountainRepoImpl implements MountainRepo {

	@Override
	public boolean save(MountainDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("start of save in repo impl");
		System.out.println("dto :"+dto);
		return true;
	}

}
