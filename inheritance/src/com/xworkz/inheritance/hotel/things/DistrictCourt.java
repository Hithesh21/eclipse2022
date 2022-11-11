package com.xworkz.inheritance.hotel.things;

public class DistrictCourt extends HighCourt {
	public String districtName;
	public int noOfCases;
	public DistrictCourt() {
		System.out.println("default const of districtCourt");
	}
	public void show() {
		//System.out.println(judjeName);
		//System.out.println(noOfStaff);
		//System.out.println(state);
		//System.out.println(chiefJudge);
		System.out.println(districtName);
		System.out.println(noOfCases);
	}
}
