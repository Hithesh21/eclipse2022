package com.xworkz.association.things;

public class Job {
	public int salary;
	public String role;
	public boolean bond;
	public NewCompany company;
	
	public Job() {
		super();
	}
	public  Job(int salary, String role, boolean bond) {
		
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		
	}
	public void show() {
		System.out.println(this.salary);
		System.out.println(this.role);
		System.out.println(this.bond);
		if(company!=null) {
			company.show();
		}else {
			System.out.println("company is null");
		}
	}
	
}
