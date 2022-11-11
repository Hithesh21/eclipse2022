package com.xworkz.association.things;

public class Person {
public String name;
public Job job;
public Email[] email;
 
public Person(String name) {
	super();
	this.name = name;
}
public void setJob(Job job) {
	this.job=job;
}
public void setEmail(Email[] email) {
	this.email=email;
}
public void show() {
	System.out.println(this.name );
	
	if(job!=null) {
		job.show();
	}else {
		System.out.println("job is null");
	}
	if(email!=null) {
		for (int i = 0; i < email.length; i++) {
			Email email2 = email[i];
			email2.show();
		}
	}
		
	else {
		System.out.println("email is null");
	}
}}
