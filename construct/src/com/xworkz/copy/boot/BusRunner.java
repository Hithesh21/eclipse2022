package com.xworkz.copy.boot;

import com.xworkz.copy.*;

public class BusRunner {
	public static void main(String[] args) {
		System.out.println("runner started");
		Bus route=new Bus();
		System.out.println(route.number);
		System.out.println(route.source);
		System.out.println(route.destination);
		route.number=111;
		System.out.println(route.number);
		route.source="blr";
		route.destination="hubli";
		System.out.println(route.source);
		System.out.println(route.destination);
		Bus route1=new Bus();
		// TODO Auto-generated method stub
		System.out.println(route1.number);
		System.out.println(route1.destination);
		System.out.println(route1.source);
	}

}
