package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.Catering;
import com.xworkz.inheritance.hotel.things.Server;

public class CateringRunner {

	public static void main(String[] args) {
		Catering cater=new Catering();
		Server server=new Server("abc",20,300,"night",15);
		System.out.println(server.name);
		System.out.println(server.items);
		System.out.println( server.price      );
		System.out.println(server.shift );
		System.out.println(server.noOfServers);
	}

}
