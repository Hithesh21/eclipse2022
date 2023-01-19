package com.xworkz.soldier.boot;

import com.xworkz.soldier.dto.SoldierDTO;
import com.xworkz.soldier.repo.SoldierRepo;
import com.xworkz.soldier.repo.SoldierRepoImpl;
import com.xworkz.soldier.services.SoldierService;
import com.xworkz.soldier.services.SoldierServiceImpl;

public class runner {

	public static void main(String[] args) {
		
		
       SoldierDTO dto=new SoldierDTO(1,"Rajesh","HIGHER","zeebra","india");
       SoldierServiceImpl service=new SoldierServiceImpl();
       SoldierRepoImpl repo=new SoldierRepoImpl();
       
       service.setSoldierRepo(repo);
       service.checkAndValidate(dto);
       repo.save(dto);
       System.out.println(dto);

	}

}
