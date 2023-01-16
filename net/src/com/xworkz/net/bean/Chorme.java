package com.xworkz.net.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Chorme implements Browser {
	@Autowired
	@Qualifier("jio")
	private Provider provider;
	
	public Chorme() {
		System.out.println("no-args of chrome");

	}

	@Override
	public void browse() {
		System.out.println("running browse in chorme");
		provider.connect();
	}

	
}
