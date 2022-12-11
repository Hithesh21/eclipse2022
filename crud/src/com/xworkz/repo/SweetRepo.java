package com.xworkz.repo;

public interface SweetRepo {
	
	boolean  create(String sweet);
	
	default int totalSweet() {
		return 10;
	}

}
