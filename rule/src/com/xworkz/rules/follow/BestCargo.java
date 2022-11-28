package com.xworkz.rules.follow;

import com.xworkz.rules.Transport;

public class BestCargo implements Transport{

	@Override
	public boolean permit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int loadCapacity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int book() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int price() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String source() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String destination() {
		// TODO Auto-generated method stub
		return null;
	}

}
