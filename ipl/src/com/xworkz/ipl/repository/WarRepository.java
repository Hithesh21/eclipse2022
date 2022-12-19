package com.xworkz.ipl.repository;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.WarDTO;

public interface WarRepository {
	
	boolean create(WarDTO dto);
	//boolean create(WarDTO[] dtos);
	
	int total();
	
	WarDTO findStartedBy(String startedBy);
	
	WarDTO findStartedByAndStartedWith(String startedBy, String startedWith);

	WarDTO findStartDateGreaterThanOrEqualTO(LocalDateTime date);
}
