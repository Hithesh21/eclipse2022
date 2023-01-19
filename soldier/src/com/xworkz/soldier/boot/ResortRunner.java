package com.xworkz.soldier.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.soldier.configuration.ConfigurationSpring;
import com.xworkz.soldier.dto.Missile;
import com.xworkz.soldier.dto.MountainDTO;
import com.xworkz.soldier.dto.ResortDTO;
import com.xworkz.soldier.repo.ResortRepo;
import com.xworkz.soldier.repo.ResortRepoImpl;
import com.xworkz.soldier.services.MissileService;
import com.xworkz.soldier.services.MountainService;
import com.xworkz.soldier.services.ResortService;
import com.xworkz.soldier.services.ResortServiceImpl;

public class ResortRunner {

	public static void main(String[] args) {
    ApplicationContext con=new AnnotationConfigApplicationContext(ConfigurationSpring.class);
    
   
    ResortService service=con.getBean(ResortService.class);
    boolean saved =service.validateAndSave(new ResortDTO());
    System.out.println(saved);
   
    System.out.println(System.lineSeparator());
    System.out.println("=============missile=================");
    MissileService ser=con.getBean(MissileService.class);
    boolean save=ser.validateAndSave(new Missile());
    System.out.println(save);
    
    System.out.println(System.lineSeparator());
    System.out.println("=============mountain=================");
    MountainService ser1=con.getBean(MountainService.class);
    boolean save1=ser1.validAndSave(new MountainDTO());
    System.out.println(save1);
	}

}
