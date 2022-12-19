package com.xworkz.place.services;

import com.xworkz.place.dto.PlaceDTO;
import com.xworkz.place.exception.InvalidDataTypeException;

public interface PlaceService {
	
	boolean checkAndSave(PlaceDTO dto) throws InvalidDataTypeException;

}
