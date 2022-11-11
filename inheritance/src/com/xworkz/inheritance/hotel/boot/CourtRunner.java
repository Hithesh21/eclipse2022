package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.Court;
import com.xworkz.inheritance.hotel.things.*;

public class CourtRunner {

	public static void main(String[] args) {
		Court court=new Court();
		SupremeCourt  supremeCourt=new SupremeCourt();
		HighCourt highCourt=new HighCourt();
		DistrictCourt districtCourt=new DistrictCourt();
		
		Court cort=(Court)supremeCourt;
		Court cort1=(Court)highCourt;
		Court cort2=(Court)districtCourt;
		
		court.show();
		System.out.println("court====================");
		supremeCourt.show();
		System.out.println("supremecourt====================");
		highCourt.show();
		System.out.println("highcourt====================");
		districtCourt.show();
		System.out.println("districtcourt====================");
		
		System.out.println("after casting====================");
		cort.show();
		cort1.show();
		cort2.show();
	}

}
