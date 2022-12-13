package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;
import com.xworkz.ipl.repository.WarRepository;
import com.xworkz.ipl.repository.WarRepositoryImpl;

public class WarRunner {

	public static void main(String[] args) {

		WarRepository repo=new WarRepositoryImpl();
		WarDTO war=new WarDTO("RussianWar","december21","oct22", "Russia", "ukraine", "russia");
		war.setCreatedBy("system");
		war.setCreatedDate(LocalDateTime.now());
	    repo.create(war);
	    System.out.println( repo.total());
	    repo.findStartedBy("ussia");
	    repo.findStartedByAndStartedWith("russia","ukraine");
	  //  repo.findStartedByAndStartedWith("ussia","ukraine");

	   
	}

}
