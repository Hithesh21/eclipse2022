package com.xworkz.theater.repository;

import com.xworkz.theater.dto.TheaterDTO;
import com.xworkz.theater.exception.StorageFullException;

public interface TheaterRepository {
	
	boolean Store(TheaterDTO dto) throws StorageFullException ;

}
