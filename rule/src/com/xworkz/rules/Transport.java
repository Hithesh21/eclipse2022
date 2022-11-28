package com.xworkz.rules;

public interface Transport {
	boolean permit();
	int loadCapacity();
	int book();
	int price();
	String source();
	String destination();

}
