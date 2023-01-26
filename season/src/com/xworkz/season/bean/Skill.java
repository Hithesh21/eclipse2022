package com.xworkz.season.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Skill {
	
	//@Autowired
	private String music;
	
	public Skill() {
		// TODO Auto-generated constructor stub
		System.out.println("created no-args const of skill.........");

	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

}
