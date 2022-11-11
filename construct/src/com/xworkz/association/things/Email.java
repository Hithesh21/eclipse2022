package com.xworkz.association.things;

public class Email {
	public long mobileNo ;
	public String id;
	public String password;
	public NewCompany company;
	public Email(long mobileNo, String id, String password) {
		super();
		this.mobileNo = mobileNo;
		this.id = id;
		this.password = password;
		
	}
	
	public void show() {
		System.out.println(this.mobileNo );
		System.out.println(this.id);
		System.out.println(this.password );
		if(company!=null) {
			company.show();
		}else {
			System.out.println("company is null");
		}
}
}