package com.xworkz.boot;

import com.xworkz.repo.EmailRepo;
import com.xworkz.repo.EmailRepoImpl;

public class EmailRunner {
	
	public static void main(String[] args) {
		
		
		EmailRepo email=new EmailRepoImpl();
		email.create("hithesh@gmail.com");
		email.create("hithesh1@gmail.com");
		email.create("hithesh2@gmail.com");
		email.create("hithesh3@gmail.com");
		email.create("hithesh4@gmail.com");
		email.create("hithesh5@gmail.com");
		email.create("hithesh6@gmail.com");
		email.create("hithesh7@gmail.com");
		email.create("hithesh8@gmail.com");
		email.create("hithesh9@gmail.com");
		//email.create("hithesh10@gmail.com");
		System.out.println(email.totalEmails());
		
	}

}
