package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.HumanResource;
import com.xworkz.inheritance.hotel.things.Akshara;

public class HumanResourceRunner {

	public static void main(String[] args) {
		HumanResource resource=new HumanResource();
		resource.hire();
		resource.onBoard();
		Akshara akshara=new Akshara();
		akshara.hire();

	}

}
