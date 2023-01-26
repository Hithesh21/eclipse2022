package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	@Autowired
	private Assistant assist;
	
	public Producer() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of producer.........");

	}

	public Assistant getAssist() {
		return assist;
	}

	public void setAssist(Assistant assist) {
		this.assist = assist;
	}

	public void setAssist(Class<Assistant> class1) {
		// TODO Auto-generated method stub
		
	}

}
