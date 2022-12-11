package com.xworkz.repo;

import com.xworkz.exception.SweetSizeExceedsException;

public class SweetRepoImpl implements SweetRepo{
	
	private String[] sweet=new String[10];
	private int index=0;

	@Override
	public boolean create(String sweet) {
		
		System.out.println("running create of sweet repo impl");
		if(this.index>this.sweet.length) {
			throw new SweetSizeExceedsException();
		}
		this.sweet[index]=sweet;
		this.index++;
		
				return false;
	}
	
	public int totalSweet() {
		return SweetRepo.super.totalSweet();
	}

}
