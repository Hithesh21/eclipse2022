package com.xworkz.inheritance.hotel.things;

public class HighCourt extends SupremeCourt{
	public String state;
	public String chiefJudge;
public HighCourt() {
	System.out.println("default const of highCourt");
}
public void show() {
	//System.out.println(judjeName);
	//System.out.println(noOfStaff);
	System.out.println(state);
	System.out.println(chiefJudge);
}
}
