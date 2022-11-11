package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.things.Party;

public class BachelorPartyRunner {

	public static void main(String[] args) {
		
		
		Party party=new Party("rjn pub", "best", "rjn", 20,"om" );
		System.out.println(party.venue);
		System.out.println(party.djName);
		System.out.println(party.loc);
		System.out.println(party.member);
		System.out.println(party.host);
	}

}
