package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.Catering;

public class Server extends Catering {
	public String shift;
	public int noOfServers;
	
	public Server(String name, int items, int price,String shift,int noOfServers) {
		super(name, items, price);
		this.shift=shift;
		this.noOfServers=noOfServers;
	}
	
	

}
