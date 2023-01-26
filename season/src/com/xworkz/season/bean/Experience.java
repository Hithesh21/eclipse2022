package com.xworkz.season.bean;

import org.springframework.stereotype.Component;

@Component
public class Experience {
	
	private Skill skill;
	
	public Experience() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of Experience.........");

	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public void setSkill(Class<Skill> class1) {
		// TODO Auto-generated method stub
		
	}

}
