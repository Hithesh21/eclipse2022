package com.xworkz.place.repository;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.exception.InvalidDataTypeException;
//import com.xworkz.place.exception.InvalidDataTypeException;
import com.xworkz.place.exception.StorageFullException;

public interface PlaceRepository {
	
	boolean store(PlaceDTO dto) throws  InvalidDataTypeException;

}
