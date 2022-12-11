package com.xworkz.repo;

import com.xworkz.exception.SizeExceedPanCard;

public class PanCardRepoImpi implements PanCardRepo{
	
	private String[] pan=new String[10];
     private int index=0;
	@Override
	public boolean create(String pan) {
		System.out.println("running create of pancard repo");
		if(this.index>this.pan.length) {
			throw new SizeExceedPanCard();
		}
		this.pan[index]=pan;
		this.index++;
		return false;
	}
	
	public int totalPanCard() {
		return PanCardRepo.super.totalPanCard();
		
	}
}
