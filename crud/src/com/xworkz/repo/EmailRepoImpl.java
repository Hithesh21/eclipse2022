package com.xworkz.repo;

import com.xworkz.exception.EmailSizeExceedsException;

public class EmailRepoImpl implements EmailRepo {

	private String[] email=new String[10];
	private int index=0;
	@Override
	public boolean create(String email) {
		System.out.println("running create email repo");
		if(this.index>this.email.length) {
			throw new EmailSizeExceedsException();
		}
		this.email[index]=email;
		this.index++;
		


		return false;
	}
	
	
	@Override
	public int totalEmails() {
		return EmailRepo.super.totalEmails();
		
	}
	
	

}
