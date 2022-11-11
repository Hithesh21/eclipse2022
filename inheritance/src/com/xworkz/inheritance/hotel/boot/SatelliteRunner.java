package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.things.Moon;

public class SatelliteRunner {

	public static void main(String[] args) {
		Moon moon=new Moon("isro",true,true);
		moon.show();
		
		Satellite satellite=new Moon("nasa", false, true);
		satellite.show();
		
		
	}

}
