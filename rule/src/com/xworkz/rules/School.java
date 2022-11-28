package com.xworkz.rules;

public interface School {
	
	boolean getAdmission();
	static int fees(int amount) {
		return amount;
		}
	default boolean play() {
		return true;
	}
	abstract boolean  recognition();
	double salary();

}

