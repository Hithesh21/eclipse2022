package com.xworkz.inheritance.hotel.boot;

import com.xworkz.inheritance.hotel.PoliticalParty;
import com.xworkz.inheritance.hotel.things.Bjp;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		PoliticalParty party=new Bjp("bharatiya janata party", true,320);
		PoliticalParty party1=(PoliticalParty)party;
        party.show();
	}

}
