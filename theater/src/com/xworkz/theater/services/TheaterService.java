package com.xworkz.theater.services;

import com.sun.media.sound.InvalidDataException;
import com.xworkz.theater.dto.TheaterDTO;

public interface TheaterService {

	boolean checkAndValidate(TheaterDTO dto) throws InvalidDataException;
}
