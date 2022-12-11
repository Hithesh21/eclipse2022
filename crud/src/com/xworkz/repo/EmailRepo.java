package com.xworkz.repo;

public interface EmailRepo {
	boolean create(String email);
	
	default int totalEmails() {
		return 10;
	}

}
