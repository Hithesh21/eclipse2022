package com.xworkz.repo;

public interface PanCardRepo {
	
	boolean create(String pan);
	
	default int totalPanCard() {
		return 10;
	}

}
