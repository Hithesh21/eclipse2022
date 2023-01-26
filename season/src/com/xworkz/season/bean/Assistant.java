package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Assistant {
	
	@Autowired
	private Company company;
	
	public Assistant() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of company.........");

	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public void setCompany(Class<Company> class1) {
		// TODO Auto-generated method stub
		
	}

}
