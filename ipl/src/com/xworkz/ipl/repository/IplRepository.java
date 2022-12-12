package com.xworkz.ipl.repository;

import com.xworkz.ipl.dto.IplDTO;

public interface IplRepository {
	
	
	default int total() {
		return 0;
	}
	boolean create(IplDTO dto);

}
