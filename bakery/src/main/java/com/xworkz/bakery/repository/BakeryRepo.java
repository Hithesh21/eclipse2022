package com.xworkz.bakery.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDTO;

public interface BakeryRepo {
	
	boolean save(BakeryDTO dto);

}
