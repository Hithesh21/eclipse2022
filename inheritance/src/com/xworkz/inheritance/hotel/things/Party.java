package com.xworkz.inheritance.hotel.things;

import com.xworkz.inheritance.hotel.BachelorParty;

public class Party extends BachelorParty {
	
	
	public int member;
	public String host;
	public String time;
	
	
	public Party(String venue, String djName, String loc,int member,String host) {
		super(venue, djName, loc);
		this.host=host;
		this.member=member;
	}
	
	
}
